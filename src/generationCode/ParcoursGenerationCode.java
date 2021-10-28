package generationCode;

import TDS.TDS;
import TDS.Element;

import bloodReset.bloodResetLexer;
import org.antlr.runtime.tree.Tree;
import semantique.SemanticAnalyser;

import java.io.FileWriter;
import java.io.IOException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class ParcoursGenerationCode {



    private static int countIf=0;
    private static int countWhile=0;

    public ParcoursGenerationCode(){
    }


    public static void parcoursTree(Tree tree, TDS tds, FileWriter f, int nbChild) throws IOException {

        if (tree == null) {
            System.out.println("L'arbre est vide");
            return;
        }
        switch (tree.getType()) {
            case bloodResetLexer.BLOCPRINCIPAL:
                f.write("main_\n");
                CodeAssembleur.preparationEnvironnement("main", tds.retrouveMaTDS("main", "MAIN"), f);

                for (int i = 0; i < nbChild; i++) {
                    parcoursTree(tree.getChild(i), tds.retrouveMaTDS("main", "MAIN"), f, tree.getChild(i).getChildCount());
                }

                CodeAssembleur.sortieEnvironnement("main", f);

                break;

            //-------------------------------------------- GESTION DE CLASSE --------------------------------//
            case bloodResetLexer.CLASSDEF: {
                //On récupère la TDS de classe
                TDS tdsClasse = tds.retrouveMaTDS(tree.getChild(0).getText(), "CLASSE");

                CodeAssembleur.creationDescClasse(tdsClasse, f);


                for (int i = 0; i < nbChild; i++) {
                    parcoursTree(tree.getChild(i), tdsClasse, f, tree.getChild(i).getChildCount());
                }

                f.write("\n");
                break;
            }

            //-------------------------------------------- GESTION DES CONS ET METH --------------------------------//


            case bloodResetLexer.CONSDEF:
                String nomCons = "CONS_" + tree.getChild(0);
                f.write(nomCons + "_\n");

                CodeAssembleur.preparationEnvironnement(tds.getName(), tds, f);

                // ---------------- SUITE DU PARCOURS ---------------- //
                TDS tdsCons = tds.retrouveMaTDS(tree.getChild(0).getText(), "CONSTRUCTEUR");

                if (tree.getChild(2).getText().equals("EXTENDS")) {   //--> EXTENDS
                    for (int i=0; i < tree.getChild(3).getChildCount(); i++) {
                        parcoursTree(tree.getChild(3).getChild(i), tdsCons, f, tree.getChild(3).getChild(i).getChildCount());   // --> on parcours les enfants
                    }
                } else {
                    for (int i=0; i < tree.getChild(2).getChildCount(); i++) {
                        parcoursTree(tree.getChild(2).getChild(i), tdsCons, f, tree.getChild(2).getChild(i).getChildCount());   // --> on parcours les enfants
                    }
                }

                CodeAssembleur.sortieEnvironnement(tds.getName(), f);
                break;

            case bloodResetLexer.METHODEDEF:
                String nomMeth = "METH_" + tree.getChild(0);
                f.write(nomMeth + "_\n");



                // ---------------- SUITE DU PARCOURS ---------------- //
                int decalage = 0;
                switch (tree.getChild(1).getText()) {
                    case "static":
                        decalage++;
                        if(tree.getChild(2).getText().equals("override")) {
                            decalage++;
                        }
                        break;

                    case "override":
                        decalage++;
                        break;

                    default:
                        decalage = 0;
                }

                TDS tdsMeth = tds.retrouveMaTDS(tree.getChild(decalage).getText(), "METHODE");
                CodeAssembleur.preparationEnvironnement(tdsMeth.getName(), tdsMeth, f);

                if(tree.getChild(decalage+2).getText().equals("TYPERETOUR")) {
                    for (int i=0; i < tree.getChild(decalage+3).getChildCount(); i++) {
                        parcoursTree(tree.getChild(decalage+3).getChild(i), tdsMeth, f, tree.getChild(decalage+3).getChild(i).getChildCount());   // --> on parcours les enfants
                    }
                } else {
                    for (int i=0; i < tree.getChild(decalage+2).getChildCount(); i++) {
                        parcoursTree(tree.getChild(decalage+2).getChild(i), tdsMeth, f, tree.getChild(decalage+2).getChild(i).getChildCount());   // --> on parcours les enfants
                    }
                }


                for (int i=0; i < tree.getChild(decalage+2).getChildCount(); i++) {
                    parcoursTree(tree.getChild(decalage+2).getChild(i), tdsMeth, f, tree.getChild(decalage+2).getChild(i).getChildCount());   // --> on parcours les enfants
                }

                /* Gestion du result : si on recontre un result, on stocke sa valeur dans le registre R0 */
                for(String key : tdsMeth.getMapElement().keySet()){
                    if(key.equals("result")){
                        int deplacement = tdsMeth.getMapElement().get("result").getDeplacement();
                        f.write("\t\tLDW R0,(BP)" + -deplacement + "\t\t//stockage de la valeur du result dans un registre\n"); //on soustrait le déplacement au pointeur mais il est déjà négatif pour result
                    }
                }

                CodeAssembleur.sortieEnvironnement(tds.getName(), f);

                break;


            //----------------------------------- OPÉRATIONS ARITHMÉTHIQUES -----------------------------------//
            //utile pour tester
            case bloodResetLexer.T__41:  // C'est pour les operandes
            case bloodResetLexer.T__44:
            case bloodResetLexer.T__45:
            case bloodResetLexer.T__47:
            case bloodResetLexer.T__49:
                if(tree.getChildCount()!=0) {
                    CodeAssembleur.operationRecursiveAssembleur(tree, tds, f, 0, tree.getText(), "", true);
                }
                else { // cas où on aurait un nombre négatif en direct
                    //On récupère le numéro de fils du -
                    int nbChildNeg = 0;
                    for(int i = 0; i< tree.getParent().getChildCount(); i++){
                        if (tree.getParent().getChild(i).equals(tree)){
                            nbChildNeg = i;
                            i = tree.getParent().getChildCount()+1;
                        }
                    }
                    // on enregistre la valeur integer qui suit le moins
                    String valANeg = tree.getParent().getChild(nbChildNeg+1).getText();
                    f.write("\t\tLDQ -"+valANeg+", r0\n");
                }
                break;



            //----------------------------------- PARAMÈTRES ------------------------------------//
            //sert à rien dans le parcours
            case bloodResetLexer.LISTOPERATEURS:
                for (int i=0; i<tree.getChildCount();i++){
                    if(tree.getChild(i).getText().equals("STR")) {
                        CodeAssembleur.getParametreAssembleur(tree.getChild(i).getChild(0),tds,f,8);
                    } else {
                        CodeAssembleur.getParametreAssembleur(tree.getChild(i),tds,f,8);
                    }
                }

                break;

            //----------------------------------- BOUCLES CONDITIONELLES ------------------------------------//
            case bloodResetLexer.WHILE:
                int nbWhile = countWhile;
                countWhile++;

                //instruction boucle "while nbWhile"
                f.write("While"+nbWhile);


                /*traitement de la condition
                 *   besoin de récupérer les inverses de conditions car :
                 * on ne saute à la fin d'une boucle que si la condition assembleur est respectée*/
                CodeAssembleur.preparationComparaison(tree.getChild(0), tds, f); //nbReg non-géré
                CodeAssembleur.gestionComparateur(tree, f);
                f.write(" fWhile"+nbWhile+"-$-2\n"); //branchement à la fin du while

                //ouverture environnement
                f.write("\t\tldw r0, BP\n");

                //traitement des instructions*
                TDS tdsDo =tds.retrouveMaTDS("while"+nbWhile, "WHILE");
                CodeAssembleur.preparationEnvironnement("while"+nbWhile,tdsDo,f);
                parcoursTree(tree.getChild(1), tdsDo, f, tree.getChild(1).getChildCount());

                //fermeture
                CodeAssembleur.sortieEnvironnement("while",f);
                CodeAssembleur.nettoyageEnvironnementAppelant(f, 0);

                //saut non conditionnel de relancement de boucle --> while nbWhile
                f.write("\t\tBMP\tWhile"+nbWhile+"-$-2\n");

                //instruction fin de boucle "fwhile nbWhile"
                f.write("fWhile"+nbWhile+"\t\t NOP\n");

                break;




            case bloodResetLexer.IF:
                int nbIf = countIf;
                countIf++;

                //description if
                f.write("If"+nbIf);

                /*traitement de la condition et premier saut*/
                if (!tree.getChild(0).getText().equals("true")) {
                    CodeAssembleur.preparationComparaison(tree.getChild(0), tds, f); //nbReg non-géré
                    CodeAssembleur.gestionComparateur(tree, f);
                    f.write(" Else" + nbIf + "-$-2\n");
                }

                //traitement du then en premier (car saut SI condition assembleur (inv de condition code) respectée)

                //Ouverture du Then :
                f.write("\t\tldw r0, BP\n");
                TDS tdsThen = tds.retrouveMaTDS("then"+nbIf, "THEN");
                CodeAssembleur.preparationEnvironnement("then"+nbIf, tdsThen, f);
                parcoursTree(tree.getChild(1), tdsThen, f, tree.getChild(1).getChildCount());

                //fermeture Then
                CodeAssembleur.sortieEnvironnement("then", f);
                CodeAssembleur.nettoyageEnvironnementAppelant(f, 0);

                //Saut à une instruction "fif nbIf"
                f.write("\t\tBMP\tfIf"+nbIf+"-$-2\n");

                //Instruction "else nbIf"
                f.write("Else"+nbIf+"\t\t NOP\n");

                //traitement du else en deuxième (saut a été effectué)
                f.write("\t\tldw r0, BP\n");
                TDS tdsElse = tds.retrouveMaTDS("else"+nbIf, "ELSE");
                CodeAssembleur.preparationEnvironnement("else"+nbIf, tdsElse, f);
                parcoursTree(tree.getChild(2), tds.retrouveMaTDS("else"+nbIf, "ELSE"), f, tree.getChild(1).getChildCount());

                //fermeture Else
                CodeAssembleur.sortieEnvironnement("else", f);
                CodeAssembleur.nettoyageEnvironnementAppelant(f, 0);

                //instruction "fif nbIf"
                f.write("fIf"+nbIf+"\t\t NOP\n");

                break;



            // -------------------------------------- GESTION DE L'INSTANCIATION -------------------------------------- //
            //cas spé de l'instanciation : on enregistre son adresse (celle du heap en soit) dans la variable concernée
            case bloodResetLexer.INST: {
                String type = tree.getChild(0).getText();

                //On enregistre l'adresse actuelle du tas dans la variable
                //f.write("instanc_"+tree.getChild(0)+"\tLDW r1, HP\n");

                //on range le descripteur de classe

                TDS tdsClasse = tds.retrouveMaTDSDeClasse(type);
                int offsetClasse = tdsClasse.getOffsetClasse();
                f.write("\t\tLDW r2, #DESC_ADRS\n");
                f.write("\t\tADQ "+offsetClasse+", R2\n");
                f.write("\t\tSTW r2, (HP)\n");

                //on déplace le pointeur de tas de manière adaptée
                int taille = tdsClasse.getTailleObjet();
                f.write("\t\tADQ "+taille+", HP\n");

                CodeAssembleur.ouvertureEnvironnementAppelant(tree, f, tds, false);
                int nbParam = tree.getChild(1).getChildCount(); //on passe par le tree parce que c'est plus simple
                CodeAssembleur.nettoyageEnvironnementAppelant(f, nbParam*2);
                break;
            }

            //-------------------------------------------- AFFECTATION --------------------------------------------//
            //Cas où il y a une affectation
            case bloodResetLexer.T__51: {
                //On cherche la valeur de l'adresse de la partie de droite de l'affectation

                switch (tree.getChild(1).getType()){

                    //Cas de message ou select
                    case bloodResetLexer.MESSOUSELECT:

                            //On fait l'envoie de message
                            parcoursTree(tree.getChild(1), tds, f, tree.getChild(1).getChildCount());

                            //Ici on suppose que le résultat de MESSAGE se trouve dans le registre r0

                            if(tree.getChild(0).getText().equals("DECLVARIABLE")) {
                                CodeAssembleur.rechercheAdresseVariableAssembleur(tree.getChild(0).getChild(0).getText(), tds, f, "r12");


                            }else {
                                CodeAssembleur.rechercheAdresseVariableAssembleur(tree.getChild(0).getText(), tds, f, "r12");
                            }

                            f.write("\t\tSTW R0, (R12)\n\n");

                        break;

                    //Cas ou l'on retourne un calcul (exemple --> e*d ;)
                    case bloodResetLexer.T__41:  // C'est pour les operandes
                    case bloodResetLexer.T__44:
                    case bloodResetLexer.T__45:
                    case bloodResetLexer.T__47:
                    case bloodResetLexer.T__49:
                        parcoursTree(tree.getChild(1),tds,f,tree.getChild(1).getChildCount());

                        if(tree.getChild(0).getText().equals("DECLVARIABLE")) {
                            CodeAssembleur.rechercheAdresseVariableAssembleur(tree.getChild(0).getChild(0).getText(), tds, f, "R12");


                        }else {
                            CodeAssembleur.rechercheAdresseVariableAssembleur(tree.getChild(0).getText(), tds, f, "R12");
                        }



                        f.write("\t\tSTW R0, (R12)\n\n");

                        break;

                    case bloodResetLexer.INST: //fait par mac (Niels je t'ai enlevé un cas)
                        //On enregistre l'adresse actuelle du tas dans la variable

                        if(tree.getChild(0).getText().equals("DECLVARIABLE")) {
                            CodeAssembleur.rechercheAdresseVariableAssembleur(tree.getChild(0).getChild(0).getText(), tds, f, "R12");


                        }else {
                            CodeAssembleur.rechercheAdresseVariableAssembleur(tree.getChild(0).getText(), tds, f, "R12");
                        }

                        f.write("\t\tLDW r1, HP //une instanciation\n");
                        f.write("\t\tSTW r1, (r12)\n\n"); //on range l'adresse du heap dans la variable

                        //On remplit la nouvelle instanciation
                        parcoursTree(tree.getChild(1), tds, f, tree.getChild(1).getChildCount());
                        break;


                        //On affecte soit une variable ou soit un nombre
                    default:
                        try {
                                //Cas des nombres négatifs
                                if (tree.getChild(1).getText().equals("-")){

                                    int value = Integer.parseInt(tree.getChild(2).getText());

                                    if(tree.getChild(0).getText().equals("DECLVARIABLE")) {
                                        CodeAssembleur.rechercheAdresseVariableAssembleur(tree.getChild(0).getChild(0).getText(), tds, f, "R12");


                                    }else {
                                        CodeAssembleur.rechercheAdresseVariableAssembleur(tree.getChild(0).getText(), tds, f, "R12");
                                    }


                                    //On affecte l'entier à la variable
                                    f.write("\t\tLDW R0, #-" + tree.getChild(2).getText() + "\n");
                                    f.write("\t\tSTW R0, (R12)\n\n");


                                }else {
                                    //Si on a un Integer, on met affecte directement le Integer dans la variable
                                    int value = Integer.parseInt(tree.getChild(1).getText());

                                    if(tree.getChild(0).getText().equals("DECLVARIABLE")) {
                                        CodeAssembleur.rechercheAdresseVariableAssembleur(tree.getChild(0).getChild(0).getText(), tds, f, "R12");


                                    }else {
                                        CodeAssembleur.rechercheAdresseVariableAssembleur(tree.getChild(0).getText(), tds, f, "R12");
                                    }


                                    //On affecte l'entier à la variable
                                    f.write("\t\tLDW R0, #" + tree.getChild(1).getText() + "\n");
                                    f.write("\t\tSTW R0, (R12)\n\n");
                                }

                        }catch (Exception e) {
                            //Sinon, on regarde si la valeur est un string directement du type : "valeur"
                            if (tree.getChild(1).getText().equals("STR")) {
                                CodeAssembleur.allocationStringTas(tree.getChild(1).getChild(0).getText(),f,0,true,true,"",false);
                                if(tree.getChild(0).getText().equals("DECLVARIABLE")) {
                                    CodeAssembleur.rechercheAdresseVariableAssembleur(tree.getChild(0).getChild(0).getText(), tds, f, "R12");


                                }else {
                                    CodeAssembleur.rechercheAdresseVariableAssembleur(tree.getChild(0).getText(), tds, f, "R12");
                                }



                                f.write("\t\tSTW R0, (R12)\n\n");

                            } else {
                                //Sinon, on fait la recherche de l'adresse de la variable de la partie de gauche de la l'affectation
                                //On met dans R8, la variable à gauche de l'affectation
                                CodeAssembleur.rechercheValeurVariableAssembleur(tree.getChild(1).getText(), tds, f, "R0");

                                if(tree.getChild(0).getText().equals("DECLVARIABLE")) {
                                    CodeAssembleur.rechercheAdresseVariableAssembleur(tree.getChild(0).getChild(0).getText(), tds, f, "R12");


                                }else {
                                    CodeAssembleur.rechercheAdresseVariableAssembleur(tree.getChild(0).getText(), tds, f, "R12");
                                }

                                f.write("\t\tSTW R0, (R12)\n\n");
                            }
                        }break;

                }

                //TODO : attention il faudra prendre en compte le cas des messOUSELECT
                //CodeAssembleur.setValeurVariableAssembleur(tree.getChild(0).getText(), tds, f, "r9", "r8");

                break;
            }

            case bloodResetLexer.MESSOUSELECT:
                switch (tree.getChild(1).getText()) {
                    case "MESSAGE":
                        if (tree.getChild(1).getChild(0).getText().equals("print")) {
                            if (Character.isLowerCase(tree.getChild(0).getText().charAt(0))) {
                                CodeAssembleur.rechercheValeurVariableAssembleur(tree.getChild(0).getText(), tds, f, "R0");
                            } else {
                                CodeAssembleur.allocationStringTas(tree.getChild(0).getChild(0).getText(), f, 0, true, true, "", false);
                            }
                            f.write("\t\tJSR @print_\n");

                        } else if (tree.getChild(1).getChild(0).getText().equals("println")) {
                            if (Character.isLowerCase(tree.getChild(0).getText().charAt(0))) {
                                CodeAssembleur.rechercheValeurVariableAssembleur(tree.getChild(0).getText(), tds, f, "R0");
                            } else {
                                CodeAssembleur.allocationStringTas(tree.getChild(0).getChild(0).getText(), f, 0, true, true, "", false);
                            }
                            f.write("\t\tJSR @println_\n");

                        } else if (tree.getChild(1).getChild(0).getText().equals("toString")) {
                            if (!Character.isLowerCase(tree.getChild(0).getText().charAt(0))) {
                                CodeAssembleur.intToStringAssembleur(f, tds, tree.getChild(0).getText());
                            }
                        } else {
                            CodeAssembleur.ouvertureEnvironnementAppelant(tree, f, tds, true);
                            CodeAssembleur.nettoyageEnvironnementAppelant(f, tds.getDeplacementMin()+2);
                        }
                        break;
                    case "SELECT":
                        //Trouver la TDS de la classe
                        String nameClasse = SemanticAnalyser.getTypeExpression(tree.getChild(0), tds, f);
                        TDS tdsClasse=tds.retrouveMaTDSDeClasse(nameClasse);
                        //Trouver le déplacement de l'attribut de la sélection
                        String nameAttribut = tree.getChild(1).getChild(0).getText();
                        int deplacementAttr = tdsClasse.getMapElement().get(nameAttribut).getDeplacement();

                        //ajouter le déplacement de l'attribut à l'adresse de la variable
                        CodeAssembleur.rechercheValeurVariableAssembleur(tree.getChild(0).getText(), tds, f, "R2"); //remplacer par le premier registre dispo (voir avec Mac)
                        f.write("\t\tADQ "+ deplacementAttr + ", R2\n");
                        break;
                    default :
                        break;
                }

                break;

            default:
                for (int i = 0; i < nbChild; i++) {
                    parcoursTree(tree.getChild(i), tds, f, tree.getChild(i).getChildCount());
                }

        }
    }

}

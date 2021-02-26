import TDS.TDS;
import org.antlr.runtime.tree.Tree;

import java.io.FileWriter;
import java.io.IOException;

public class Parcours {

    public static void parcoursTree(Tree tree, TDS tds, FileWriter f, int nbChild) throws IOException {

        if (tree == null) {
            System.out.println("L'arbre est vide");
            return;
        }
        switch (tree.getType()) {
            case bloodResetLexer.BLOCPRINCIPAL :
                TDS tdsFils = new TDS(tds, "MAIN", "main");
                tds.addChild(tdsFils);
                tds.addElement(true, "MAIN", "", tdsFils.getNumRegion());
                tdsFils.addElement(tds);                    //on rajoute la ligne correspondant à la tds père
                SemanticAnalyser.analyseBloc(tree, tdsFils, f);
                for (int i = 0; i < nbChild; i++) {
                    parcoursTree(tree.getChild(i), tdsFils, f, tree.getChild(i).getChildCount());
                }
                break;

            case bloodResetLexer.BLOC :
                TDS tdsBloc = new TDS(tds,"BLOC", "");
                tds.addChild(tdsBloc);
                tdsBloc.addElement(tds);
                for (int i = 0; i < nbChild; i++) {
                    parcoursTree(tree.getChild(i), tdsBloc, f, tree.getChild(i).getChildCount());
                }
                SemanticAnalyser.analyseBloc(tree, tds, f);
                break;

            // --> analyse sémantique pas encore effectuée
            case bloodResetLexer.CLASSDEF:

                TDS tdsClasse = new TDS(tds, "CLASSE", tree.getChild(0).getText());                                     //--> création de la TDS de la classe
                tds.addChild(tdsClasse);                                          //--> rajout de la TDSFils à la liste des fils de la TDS
                tdsClasse.addElement(tds);                                        //on rajoute la ligne correspondant à la tds père dans la tds fils

                if (tree.getChild(2).getText().equals("EXTENDS")) {                         // --> on ajoute la classe à la tds
                    SemanticAnalyser.analyseClasse(tree, tds, f, true);
                    tds.addElement(true, tree.getChild(0).getText(), tree.getChild(2).getChild(0).getText(), tdsClasse.getNumRegion());
                } else {
                    SemanticAnalyser.analyseClasse(tree, tds, f, false);
                    tds.addElement(true, tree.getChild(0).getText(), "", tdsClasse.getNumRegion());
                }

                for (int i=0; i < nbChild; i++) {
                    parcoursTree(tree.getChild(i), tdsClasse, f, tree.getChild(i).getChildCount());   // --> on parcours les enfants
                }

                //SemanticAnalyser.analyseClasse(tree, tds, f, hasExtend);

                break;


            case bloodResetLexer.CONSDEF:
                TDS tdsCons = new TDS(tds, "CONSTRUCTEUR", tree.getChild(0).getText());
                tds.addChild(tdsCons);
                tdsCons.addElement(tds);

                SemanticAnalyser.analyseConstructeur(tree, tds, f);      //analyse sémantique

                for (int i=0; i < tree.getChild(1).getChildCount(); i++) {              //--> lecture des paramètres
                    parcoursTree(tree.getChild(1).getChild(i), tdsCons, f, tree.getChild(1).getChild(i).getChildCount());
                }

                if (tree.getChild(2).getText().equals("EXTENDS")) {   //--> EXTENDS
                    tds.addElement(false, tree.getChild(0).getText(), tree.getChild(2).getChild(0).getText(), tdsCons.getNumRegion());
                    SemanticAnalyser.analyseBloc(tree.getChild(3), tdsCons, f); // analyse sémantique sur le bloc du constructeur avec la TDS du constructeur

                    for (int i=0; i < tree.getChild(3).getChildCount(); i++) {
                        parcoursTree(tree.getChild(3).getChild(i), tdsCons, f, tree.getChild(3).getChild(i).getChildCount());   // --> on parcours les enfants
                    }
                } else {
                    tds.addElement(false, tree.getChild(0).getText(), "", tdsCons.getNumRegion());
                    SemanticAnalyser.analyseBloc(tree.getChild(2), tdsCons, f); // analyse sémantique sur le bloc du constructeur avec la TDS du constructeur

                    for (int i=0; i < tree.getChild(2).getChildCount(); i++) {
                        parcoursTree(tree.getChild(2).getChild(i), tdsCons, f, tree.getChild(2).getChild(i).getChildCount());   // --> on parcours les enfants
                    }
                }

                break;


            case bloodResetLexer.METHODEDEF:
                boolean isStatic = false;
                boolean isOverride = false;
                int decalage = 0;

                TDS tdsMeth = new TDS(tds, "METHODE", tree.getChild(0).getText());
                tds.addChild(tdsMeth);
                tdsMeth.addElement(tds);

                for (int i=0; i < tree.getChild(1).getChildCount(); i++) {              //--> lecture des paramètres
                    parcoursTree(tree.getChild(1).getChild(i), tdsMeth, f, tree.getChild(1).getChild(i).getChildCount());
                }

                switch (tree.getChild(1).getText()) {
                    case "static":
                        isStatic = true;
                        decalage++;
                        if(tree.getChild(2).getText().equals("override")) {
                            isOverride = true;
                            decalage++;
                        }
                        break;

                    case "override":
                        isOverride = true;
                        decalage++;
                        break;

                    default:
                        decalage = 0;
                }

                SemanticAnalyser.analyseMethode(tree, tds, f, tree.getChildCount(), decalage);

                if (tree.getChild(decalage+2).getText().equals("TYPERETOUR")) {
                    tds.addElement(isStatic, isOverride, tree.getChild(2+decalage).getChild(0).getText(), tree.getChild(0).getText(), tdsMeth.getNumRegion());
                    tdsMeth.addElement(false, tree.getChild(decalage+2).getChild(0).getText(),     //--> rajout automatique du result dans la tds de la meth avec TYPERETOUR
                            (tree.getChild(decalage+1).getText().equals("String") || tree.getChild(decalage+1).getText().equals("Integer")),
                            "result",
                            0);

                    if (tree.getChild(decalage+3).getText().equals("BLOC")) { //Analyse sémantique à faire sur le bloc, uniquement si il s'agit d'un bloc
                        // et non pas d'un renvoi direct de valeur
                        SemanticAnalyser.analyseBloc(tree.getChild(decalage + 3), tdsMeth, f);
                    }

                    for (int i=0; i < tree.getChild(3).getChildCount(); i++) {
                        parcoursTree(tree.getChild(3).getChild(i), tdsMeth, f, tree.getChild(3).getChild(i).getChildCount());   // --> on parcours les enfants
                    }

                } else {

                    tds.addElement(isStatic, isOverride, "null", tree.getChild(0).getText(), tdsMeth.getNumRegion());
                    SemanticAnalyser.analyseBloc(tree.getChild(decalage+2), tdsMeth, f); // analyse sémantique sur le noeud de bloc avec la tds de la méthode (utile pour le result)

                    for (int i=0; i < tree.getChild(decalage+2).getChildCount(); i++) {
                        parcoursTree(tree.getChild(decalage+2).getChild(i), tdsMeth, f, tree.getChild(decalage+2).getChild(i).getChildCount());   // --> on parcours les enfants
                    }
                }
                break;


            case bloodResetLexer.FORMALPARAM:   //même traitement pour param, formal param, et declvariable
                SemanticAnalyser.analyseFormalParamEtParam(tree, tds, f, nbChild);         //--> analyse sémantique sur un formalParam

                if (tree.getChild(1).getText().equals("Integer")) {
                    tds.addElement(false, tree.getChild(1).getText(),
                            true, tree.getChild(0).getText(), 2);
                } else if (tree.getChild(1).getText().equals("String")) {
                    //deplacement String = taille d'une adresse vers le tas
                    //adresse de 64bytes ?
                    tds.addElement(false, tree.getChild(1).getText(),
                            (tree.getChild(1).getText().equals("String") || tree.getChild(1).getText().equals("Integer")),
                            tree.getChild(0).getText(),
                            4);
                } else {
                    //deplacement = taille classe
                    tds.addElement(false, tree.getChild(1).getText(),
                            (tree.getChild(1).getText().equals("String") || tree.getChild(1).getText().equals("Integer")),
                            tree.getChild(0).getText(),
                            0);
                }
                break;

            case bloodResetLexer.PARAM:     //même traitement pour param, formal param, et declvariable
                SemanticAnalyser.analyseFormalParamEtParam(tree, tds, f, nbChild);         //--> analyse sémantique sur un Param, pareille que sur formalParam

                if (tree.getChild(1).getText().equals("Integer")) {
                    tds.addElement(false, tree.getChild(1).getText(),
                            (tree.getChild(1).getText().equals("String") || tree.getChild(1).getText().equals("Integer")),
                            tree.getChild(0).getText(),
                            - 2);
                } else if (tree.getChild(1).getText().equals("String")) {
                    //deplacement String = taille d'une adresse vers le tas
                    //adresse de 64bytes ?
                    tds.addElement(false, tree.getChild(1).getText(),
                            (tree.getChild(1).getText().equals("String") || tree.getChild(1).getText().equals("Integer")),
                            tree.getChild(0).getText(),
                            - 4);
                } else {
                    //deplacement = taille classe
                    tds.addElement(false, tree.getChild(1).getText(),
                            (tree.getChild(1).getText().equals("String") || tree.getChild(1).getText().equals("Integer")),
                            tree.getChild(0).getText(),
                            0);
                }
                break;


            case bloodResetLexer.DECLVARIABLE:
                if (tree.getChild(0).getText().equals("FORMALPARAM")){
                    SemanticAnalyser.analyseFormalParamEtParam(tree.getChild(0), tds, f, nbChild);  //--> analyse de formalParam ou de param

                    if (tree.getChild(0).getChild(1).getText().equals("Integer")) {
                        tds.addElement(false, tree.getChild(0).getChild(1).getText(),
                                true, tree.getChild(0).getChild(0).getText(), 2);

                    } else if (tree.getChild(1).getText().equals("String")) {
                        //deplacement String = taille d'une adresse vers le tas
                        //adresse de 64bytes ?
                        tds.addElement(false, tree.getChild(0).getChild(1).getText(),
                                true, tree.getChild(0).getChild(0).getText(),4);

                    } else {
                        //deplacement = taille classe
                        tds.addElement(false, tree.getChild(0).getChild(1).getText(),
                                false, tree.getChild(0).getChild(0).getText(),0);
                    }

                } else {
                    SemanticAnalyser.analyseDeclVar(tree, tds, f, nbChild); //--> même analyse que pour un param ou formal param

                    if (tree.getChild(1).getText().equals("Integer")) {
                        tds.addElement(false, tree.getChild(1).getText(),
                                true, tree.getChild(0).getText(), 2);

                    } else if (tree.getChild(1).getText().equals("String")) {
                        //deplacement String = taille d'une adresse vers le tas
                        //adresse de 64bytes ?
                        tds.addElement(false, tree.getChild(1).getText(),
                                true, tree.getChild(0).getText(), 4);

                    } else {
                        //deplacement = taille classe
                        tds.addElement(false, tree.getChild(1).getText(),
                                false, tree.getChild(0).getText(), 0);
                    }

                }
                break;

            case bloodResetLexer.INST:
                SemanticAnalyser.analyseInstanciation(tree, tds, f);
                break;


            //Quand le := est rencontré
            case bloodResetLexer.T__51:
                SemanticAnalyser.analyseAffectation(tree,tds,f);
                for (int i=0; i < tree.getChildCount(); i++) {
                    parcoursTree(tree.getChild(i), tds, f, tree.getChild(i).getChildCount());
                }
                break;

            case bloodResetLexer.CAST:
                SemanticAnalyser.analyseCast(tree,tds,f);
                parcoursTree(tree.getChild(1), tds, f, tree.getChild(1).getChildCount());
                break;

            case bloodResetLexer.ATTRIBDEF:
                boolean isStaticAttrib = false;

                String name=tree.getChild(0).getText();
                String classType;
                if (tree.getChild(1).getText().equals("static")) {
                    classType = tree.getChild(2).getText();
                    isStaticAttrib = true;
                } else {
                    classType = tree.getChild(1).toString();
                }

                SemanticAnalyser.analyseAttribDef(tree, tds, f, isStaticAttrib);        //decalage présent en fonction de si attrib static ou non

                if (classType.equals("Integer")) {
                    //Un entier c'est 2 octets !
                    tds.addElement(isStaticAttrib, classType, true, name,2);


                } else if (classType.equals("String")) {
                    //deplacement String = taille d'une adresse vers le tas
                    //adresse de 16bytes == 2 octets?
                    tds.addElement(isStaticAttrib, classType, true, name,4);


                } else {
                    //deplacement = taille classe
                    tds.addElement(isStaticAttrib, classType, false, name,0);

                }
                break;

            /* en fait c'est un default
            case bloodResetLexer.BLOCCLASSE :
                System.out.println("je suis un bloc de classe");
                for (int i = 0; i < nbChild; i++) {
                    parcoursTree(tree.getChild(i), tds, f, tree.getChild(i).getChildCount());
                }
                break;
                */

            case bloodResetLexer.IF:
                TDS tdsThen = new TDS(tds, "THEN", "");
                tdsThen.addElement(tds);                //on ajoute la ligne correspondant à la tds père dans la tdsThen

                TDS tdsElse = new TDS(tds, "ELSE", "");
                tdsElse.addElement(tds);                //de même que pour la tdsThen

                tds.addElement(tdsThen, tdsElse);       //on ajoute la ligne correspondant au If dans la tds père
                tds.addChild(tdsThen);                  //on associe la tds du then au if
                tds.addChild(tdsElse);                  //on associe la tds du else au if

                parcoursTree(tree.getChild(1), tdsThen, f, tree.getChild(1).getChildCount()); //parcourir le bloc Then (on commence à 1 car le premier fils est l'instruction du if)
                parcoursTree(tree.getChild(2), tdsElse, f, tree.getChild(2).getChildCount()); //parcourir le bloc Else
                break;

            /*
            * Même parcours pour les blocs else et then, on regarde l'intérieur du bloc sans passer par le token BLOC
            * */

            case bloodResetLexer.ELSE:
            case bloodResetLexer.THEN: {
                SemanticAnalyser.analyseBloc(tree.getChild(0), tds, f); // analyse sémantique sur le noeud de bloc Then/else

                /*sauter le noeud bloc et regarder directement les petits enfants*/
                for (int i = 0; i < nbChild; i++) {
                    if (tree.getChild(0).getChildCount() > 0){    //on vérifie que le bloc n'est pas vide
                        /*System.out.println("enfant de BLOC " + tree.getChild(0).getChildCount());
                        System.out.println("enfants de i :" + tree.getChild(0).getChild(i).getChildCount());*/
                        parcoursTree(tree.getChild(0).getChild(i), tds, f, tree.getChild(0).getChild(i).getChildCount());   // --> on parcours les enfants du bloc
                    }
                }
                break;
            }

            case bloodResetLexer.WHILE:
                TDS tdsWhile = new TDS(tds, "WHILE", "");
                tds.addElement(tdsWhile, null);
                tdsWhile.addElement(tds);       // on rajoute la ligne associée à la boucle While dans la tds père

                tds.addChild(tdsWhile);         //on associe la tds du do au while
                SemanticAnalyser.analyseBloc(tree.getChild(1), tdsWhile, f); // analyse sémantique sur le noeud de bloc d'instructions

                for (int i = 0; i < tree.getChild(1).getChildCount(); i++) {
                    parcoursTree(tree.getChild(1).getChild(i), tdsWhile, f, tree.getChild(1).getChild(i).getChildCount()); //on parcourt le bloc du while
                }

                break;

            /*Pb de token en cas de changement de grammaire. Ici opération*/
            case bloodResetLexer.T__41:
            case bloodResetLexer.T__44:
            case bloodResetLexer.T__45:
            case bloodResetLexer.T__47:
            case bloodResetLexer.T__49:
            case bloodResetLexer.T__53:
            case bloodResetLexer.T__54:
            case bloodResetLexer.T__55:
            case bloodResetLexer.T__56: {
                SemanticAnalyser.analyseOperations(tree, tds, f);
                break;
            }


            default:
                for (int i=0; i < nbChild; i++){
                    parcoursTree(tree.getChild(i), tds, f, tree.getChild(i).getChildCount());
                }

        }

        /*
        System.out.println(tree);
        int nb_fils = tree.getChildCount();
        if (nb_fils == 0){
            return -1;
        }
        else{
            /* case
            for (int i=0; i<nb_fils; i++){
                parcoursTree(tree.getChild(i), tds, f, nbChild);
            }
            return 0;
        }
        */
    }
}

//(ROOT (BLOCPRINCIPAL (IF true (THEN BLOC) (ELSE BLOC)) (IF (= verite true) (THEN (BLOC (MESSOUSELECT (STR "true") (MESSAGE println LISTOPERATEURS)))) (ELSE BLOC)) (WHILE (< n 2) (BLOC (M
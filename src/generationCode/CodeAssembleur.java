package generationCode;

import TDS.TDS;
import TDS.Element;
import org.antlr.runtime.tree.Tree;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

public class CodeAssembleur {

    static ArrayList<String> operation = new ArrayList<>(Arrays.asList("+", "-", "*", "<>", "<", ">", "(", ")", "=", "/", "&"));

    public static void initialisationCodeAssembleur(TDS tds, FileWriter f) throws IOException {
        f.write(
        "SP          equ r15\nBP          equ r14\nHP          equ r13\n\n"
                +"EXIT_EXC   EQU   64\n"
                +"READ_EXC   EQU   65\n"     // n° d'exception de READ  (lit 1 ligne)
                +"WRITE_EXC  EQU   66\n"    // n° d'exception de WRITE (affiche texte)

                +"\nNUL         equ  0\n"     // caractère NUL qui doit terminer une chaîne de caractères
                +"NULL        equ  0\n"     // pointeur nul
                +"NIL         equ  0\n"     // fin de liste chaînée
                +"INT_SIZE\tequ  2\n" +
                "ASCII_0     equ 30\n"

                + "\nDESC_ADRS  equ 0x0000 //adresse de base des descripteurs\n" +
                "HEAP_ADRS  equ 0x4000 //adresse de base du tas\n" +
                "STACK_ADRS  equ 0xC000 //adresse de base de pile\n" +
                "STATIC_ADRS equ 0xC000\n"
                +"LOAD_ADRS   equ 0xD000 //adresse de chargement du programme\n"

                +"\norg LOAD_ADRS\nstart load_\n\n" );

        printAssembleur(f);
        printlnAssembleur(f);
        main(f);
    }

    public static void printAssembleur(FileWriter f) throws IOException {
        f.write("print_\tTRP #WRITE_EXC\n" +
                "\t\tRTS\n\n");
    }

    public static void printlnAssembleur(FileWriter f) throws IOException {
        f.write("println_\tTRP #WRITE_EXC\n" +
                "\t\tLDW R0, #0x0A00\n" + //on effectue un saut de ligne
                "\t\tADQ 2 , HP\n" +
                "\t\tSTW R0, (HP)\n" +
                "\t\tLDW R0, HP\n" +
                "\t\tTRP #WRITE_EXC\n" +
                "\t\tRTS\n\n");
    }

    public static void intToStringAssembleur(FileWriter f, TDS tds, String value) throws IOException {
        f.write("toString_\n");
        allocationStringTas("\""+value+"\"", f, 0, true, true, "", false);
    }

    public static void main(FileWriter f) throws IOException {
        f.write("load_\tLDW SP, #STACK_ADRS\n" +
                "\t\tLDW HP, #HEAP_ADRS\n" +
                "\t\tJSR @main_\n\n");
    }



    public static void sortie(FileWriter f) throws IOException {
        f.write("finProg_\tTRP #EXIT_EXC\n\n");
    }

    // --------------------------------------------------------- OPERATIONS ARITHMÉTIQUES --------------------------------------------------------- //

    public static boolean isInt(String chaine){
        boolean valeur = true;
        char[] tab = chaine.toCharArray();

        for(char carac : tab){
            if(!Character.isDigit(carac) && valeur){ valeur = false; }
        }

        return valeur;
    }

    //fonction récursive pour faire la génération de code des operations
    //Gestion des nombres négatifs + constantes entières + concaténation de string et gestion des valeurs en direct

    //POUR LES PARAMETRES :
    // nbRegistre : numéro de registre dans lequel on enregistre l'adresse du string dans le tas ( ex : 1 )
    // operateur : c'est juste l'opérateur correspondant au noeud ou vous êtes ( ex : '+' )
    // aRajouter : METTEZ ""
    // terminal : METTEZ true
    public static void operationRecursiveAssembleur(Tree tree, TDS tds, FileWriter f, int nbRegistre, String operateur, String aRajouter, boolean terminal) throws IOException {
        // ------------------------------------- GESTION DES VALEURS IMMEDIATES ------------------------------------- //

        if (tree.getChildCount() == 0) {

            if (isInt(tree.getText())) {        //si la valeur est un entier

                f.write("\t\tldw r" + nbRegistre + " , #" + tree + "\n");
                return;
            } else if (Character.isLowerCase(tree.getText().charAt(0))) {       //Si la valeur est une variable
                String registre = "r" + nbRegistre;
                rechercheValeurVariableAssembleur(tree.getText(), tds, f, registre);
                return;
            }

        } else if (tree.getChildCount() == 1) {
            if (tree.getText().equals("STR")) {         //si la valeur est un string
                allocationStringTas(tree.getChild(0).getText(), f, nbRegistre, true, true, "", false);
                return;
            }
        }

        // ---------------------------------------- GESTION NOMBRES NÉGATIFS ---------------------------------------- //

        String aRajouterIfNegGauche = "";
        String aRajouterIfNegDroit = "";
        Tree noeudGauche = tree.getChild(0);
        Tree noeudDroit = tree.getChild(1);

        if (tree.getChildCount() == 3 && noeudDroit.getText().equals("-")) {
            noeudDroit = tree.getChild(2);
            aRajouterIfNegDroit = "-";
        } else if (tree.getChildCount() == 3 && noeudGauche.getText().equals("-")) {
            noeudGauche = noeudDroit;
            noeudDroit = tree.getChild(2);
            aRajouterIfNegGauche = "-";
        } else if (tree.getChildCount() == 4) {
            noeudGauche = noeudDroit;
            noeudDroit = tree.getChild(3);
            aRajouterIfNegGauche = aRajouterIfNegDroit = "-";
        }

        // ---------------------------------------- GESTION CHAINES DE CARACTÈRES ---------------------------------------- //

        boolean strGauche = false;
        boolean strDroit = false;

        if (noeudDroit.getText().equals("STR") && noeudGauche.getText().equals("STR")) {
            strGauche = strDroit = true;
            noeudDroit = noeudDroit.getChild(0);
            noeudGauche = noeudGauche.getChild(0);

        } else if (noeudDroit.getText().equals("STR")) {
            strDroit = true;
            noeudDroit = noeudDroit.getChild(0);
        } else if (noeudGauche.getText().equals("STR")) {
            strGauche = true;
            noeudGauche = noeudGauche.getChild(0);
        }

        // ---------------------------------------- GESTION DES VARIABLES ---------------------------------------- //

        boolean isVarGauche = false;
        boolean isIntGauche = false;
        boolean isVarDroit = false;
        boolean isIntDroit = false;

        int registreUtilGauche = nbRegistre;
        int registreUtilDroite = nbRegistre;

        if (Character.isLowerCase(noeudGauche.getText().charAt(0))) {
            isVarGauche = true;
            registreUtilGauche += 1;

            String type = "";
            for (String key : tds.getMapElement().keySet()) {
                if(key.equals(noeudGauche.getText())) {
                    type = tds.getMapElement().get(key).getType();
                }
            }

            if (type.equals("Integer")) {
                isIntGauche = true;
                if ( aRajouterIfNegGauche.equals("-")) {
                    f.write("\t\tmul #-1, r" + nbRegistre + ", r" + nbRegistre + "\n" );
                }
            }
        }

        if (Character.isLowerCase(noeudDroit.getText().charAt(0))) {
            isVarDroit = true;


            String type = "";
            for (String key : tds.getMapElement().keySet()) {
                if(key.equals(noeudDroit.getText())) {
                    type = tds.getMapElement().get(key).getType();
                }
            }

            if (isVarGauche) {
                registreUtilDroite = registreUtilGauche+1;

                if (type.equals("Integer") && aRajouterIfNegDroit.equals("-")) {
                    isIntDroit = true;

                    if ( aRajouterIfNegGauche.equals("-")) {
                        f.write("\t\tmul #-1, r" + (nbRegistre+1) + ", r" + (nbRegistre+1) + "\n" );
                    }
                }

            } else {
                registreUtilDroite+=1;

                if (type.equals("Integer") && aRajouterIfNegDroit.equals("-")) {
                    isIntDroit = true;
                    if ( aRajouterIfNegGauche.equals("-")) {
                        f.write("\t\tmul #-1, r" + nbRegistre + ", r" + nbRegistre + "\n" );
                    }
                }
            }
        }

        int nbRegistre1 = nbRegistre + 1;
        int nbRegistre2 = nbRegistre1 + 1;

        // ----------------------------------------- GENERATION DE CODE SUR LES OPERATIONS ----------------------------------------- //

        // ---------------------------------------- Quand on a un entier sur chaque feuille ---------------------------------------- //
        if (!operation.contains(noeudDroit.getText()) && !operation.contains(noeudGauche.getText())) {

            if ((!strGauche && !strDroit) && (!isVarGauche && !isVarDroit)) {
                f.write("\t\tldw r" + nbRegistre + ", #" + aRajouterIfNegGauche + noeudGauche + "\n" +                    //on enregistre la feuille gauche dans un registre
                        "\t\tldw r" + nbRegistre1 + ", #" + aRajouterIfNegDroit + noeudDroit + "\n");                       //on enregistre la feuille droite dans un autre registre
            } else if (!strDroit && !isVarDroit) {
                f.write("\t\tldw r" + nbRegistre1 + ", #" + aRajouterIfNegDroit + noeudDroit + "\n");                       //on enregistre la feuille droite dans un autre registre
            } else if (!strGauche && !isVarGauche) {
                f.write("\t\tldw r" + nbRegistre + ", #" + aRajouterIfNegGauche + noeudGauche + "\n");
            }

            switch (operateur) {
                case "+":
                    if(isVarDroit && isVarGauche) {
                        rechercheValeurVariableAssembleur(noeudGauche.getText(), tds, f, "r" + registreUtilGauche);
                        rechercheValeurVariableAssembleur(noeudDroit.getText(), tds, f, "r" + registreUtilDroite);
                        f.write("\t\tadd r" + registreUtilGauche + ", r" + registreUtilDroite + ", r" + nbRegistre + "\n");

                    } else if (isVarDroit) {
                        rechercheValeurVariableAssembleur(noeudDroit.getText(), tds, f, "r" + nbRegistre1);
                        f.write("\t\tadd r" + nbRegistre + ", r" + nbRegistre1 + ", r" + nbRegistre + "\n");

                    } else if (isVarGauche) {
                        rechercheValeurVariableAssembleur(noeudGauche.getText(), tds, f, "r" + nbRegistre);
                        f.write("\t\tadd r" + nbRegistre + ", r" + nbRegistre1 + ", r" + nbRegistre + "\n");

                    } else {
                        f.write("\t\tadd r" + nbRegistre + ", r" + nbRegistre1 + ", r" + nbRegistre + "\n");
                    }

                    break;

                case "-":
                    if(isVarDroit && isVarGauche) {
                        rechercheValeurVariableAssembleur(noeudGauche.getText(), tds, f, "r" + registreUtilGauche);
                        rechercheValeurVariableAssembleur(noeudDroit.getText(), tds, f, "r" + registreUtilDroite);
                        f.write("\t\tsub r" + registreUtilGauche + ", r" + registreUtilDroite + ", r" + nbRegistre + "\n");

                    } else if (isVarDroit) {
                        rechercheValeurVariableAssembleur(noeudDroit.getText(), tds, f, "r" + nbRegistre1);
                        f.write("\t\tsub r" + nbRegistre + ", r" + nbRegistre1 + ", r" + nbRegistre + "\n");

                    } else if (isVarGauche) {
                        rechercheValeurVariableAssembleur(noeudGauche.getText(), tds, f, "r" + nbRegistre);
                        f.write("\t\tsub r" + nbRegistre + ", r" + nbRegistre1 + ", r" + nbRegistre + "\n");

                    } else {
                        f.write("\t\tsub r" + nbRegistre + ", r" + nbRegistre1 + ", r" + nbRegistre + "\n");
                    }

                    break;

                case "*":
                    if(isVarDroit && isVarGauche) {
                        rechercheValeurVariableAssembleur(noeudGauche.getText(), tds, f, "r" + registreUtilGauche);
                        rechercheValeurVariableAssembleur(noeudDroit.getText(), tds, f, "r" + registreUtilDroite);
                        f.write("\t\tmul r" + registreUtilGauche + ", r" + registreUtilDroite + ", r" + nbRegistre + "\n");

                    } else if (isVarDroit) {
                        rechercheValeurVariableAssembleur(noeudDroit.getText(), tds, f, "r" + nbRegistre1);
                        f.write("\t\tmul r" + nbRegistre + ", r" + nbRegistre1 + ", r" + nbRegistre + "\n");

                    } else if (isVarGauche) {
                        rechercheValeurVariableAssembleur(noeudGauche.getText(), tds, f, "r" + nbRegistre);
                        f.write("\t\tmul r" + nbRegistre + ", r" + nbRegistre1 + ", r" + nbRegistre + "\n");

                    } else {
                        f.write("\t\tmul r" + nbRegistre + ", r" + nbRegistre1 + ", r" + nbRegistre + "\n");
                    }

                    break;

                //pour le case du /, on est obligé d'utiliser un troisième registre sinon ça marche pas
                case "/":
                    if(isVarDroit && isVarGauche) {
                        rechercheValeurVariableAssembleur(noeudGauche.getText(), tds, f, "r" + registreUtilGauche);
                        rechercheValeurVariableAssembleur(noeudDroit.getText(), tds, f, "r" + registreUtilDroite);
                        f.write("\t\tdiv r" + registreUtilGauche + ", r" + registreUtilDroite + ", r" + nbRegistre + "\n");

                    } else if (isVarDroit) {
                        rechercheValeurVariableAssembleur(noeudDroit.getText(), tds, f, "r" + nbRegistre1);
                        f.write("\t\tdiv r" + nbRegistre + ", r" + nbRegistre1 + ", r" + nbRegistre + "\n");

                    } else if (isVarGauche) {
                        rechercheValeurVariableAssembleur(noeudGauche.getText(), tds, f, "r" + nbRegistre);
                        f.write("\t\tdiv r" + nbRegistre + ", r" + nbRegistre1 + ", r" + nbRegistre + "\n");

                    } else {
                        f.write("\t\tldw r" + nbRegistre2 + ", #" + aRajouterIfNegGauche + noeudGauche + "\n" +
                                "\t\tdiv r" + nbRegistre2 + ", r" + nbRegistre1 + ", r" + nbRegistre + "\n");
                    }

                    break;

                case "&":
                    if(isVarDroit && isVarGauche) {
                        rechercheValeurVariableAssembleur(noeudGauche.getText(), tds, f, "r" + registreUtilGauche);
                        recopieString(registreUtilGauche, f, nbRegistre, true, false, "");
                        rechercheValeurVariableAssembleur(noeudDroit.getText(), tds, f, "r" + registreUtilDroite);
                        recopieString(registreUtilDroite, f, nbRegistre, false, terminal, "");

                    } else if (isVarDroit) {
                        allocationStringTas(noeudGauche.getText(), f, nbRegistre, true, false, "", false);
                        rechercheValeurVariableAssembleur(noeudDroit.getText(), tds, f, "r" + registreUtilDroite);
                        recopieString(registreUtilDroite, f, nbRegistre, false, terminal, "");

                    } else if (isVarGauche) {
                        rechercheValeurVariableAssembleur(noeudGauche.getText(), tds, f, "r" + registreUtilGauche);
                        recopieString(registreUtilGauche, f, nbRegistre, true, false, "");
                        allocationStringTas(noeudDroit.getText(), f, nbRegistre, false, terminal, "", true);

                    } else {
                        String aRajouterLocal = allocationStringTas(noeudGauche.getText(), f, nbRegistre, true, false, "", false);
                        allocationStringTas(noeudDroit.getText(), f, nbRegistre, false, terminal, aRajouterLocal, true);
                    }

                    break;
            }

            // ---------------------------------------- Quand on a un entier uniquement sur la feuille droite ---------------------------------------- //

        } else if (operation.contains(noeudGauche.getText()) && !operation.contains(noeudDroit.getText())) {
            operationRecursiveAssembleur(noeudGauche, tds, f, nbRegistre, noeudGauche.getText(), aRajouter, false);
            switch (operateur) {
                case "+":
                    f.write("\t\tadq " + aRajouterIfNegDroit + noeudDroit + ", r" + nbRegistre + "\n");
                    break;

                case "-":
                    f.write("\t\tldw r" + nbRegistre1 + ", #" + aRajouterIfNegDroit + noeudDroit + "\n" +
                            "\t\tsub r" + nbRegistre + ", r" + nbRegistre1 + ", r" + nbRegistre + "\n");
                    break;

                case "*":
                    f.write("\t\tldw r" + nbRegistre1 + ", #" + aRajouterIfNegDroit + noeudDroit + "\n" +
                            "\t\tmul r" + nbRegistre + ", r" + nbRegistre1 + ", r" + nbRegistre + "\n");
                    break;

                case "/":
                    f.write("\t\tldw r" + nbRegistre2 + ", r" + nbRegistre + "\n" +
                            "\t\tldw r" + nbRegistre1 + ", #" + aRajouterIfNegDroit + noeudDroit + "\n" +
                            "\t\tdiv r" + nbRegistre2 + ", r" + nbRegistre1 + ", r" + nbRegistre + "\n");
                    break;

                case "&":
                    if (isVarDroit) {
                        rechercheValeurVariableAssembleur(noeudDroit.getText(), tds, f, "r" + registreUtilDroite);
                        recopieString(registreUtilDroite, f, nbRegistre, false, terminal, "");

                    } else {
                        String aRajouterLocal = testARajouter(noeudGauche, false, "");
                        allocationStringTas(noeudDroit.getText(), f, nbRegistre, false, terminal, aRajouterLocal, true);
                    }

                    break;
            }

            // ---------------------------------------- Quand on a un entier uniquement sur la feuille gauche ---------------------------------------- //

        } else if (!operation.contains(noeudGauche.getText()) && operation.contains(noeudDroit.getText())) {

            switch (operateur) {
                case "+":
                    f.write("\t\tadq " + tree.getChild(0) + ", r" + nbRegistre + "\n");
                    break;

                case "-":
                    f.write("\t\tldw r" + nbRegistre1 + ", #" + aRajouterIfNegGauche + noeudGauche + "\n" +
                            "\t\tsub r" + nbRegistre + ", r" + nbRegistre1 + ", r" + nbRegistre + "\n");
                    break;

                case "*":
                    f.write("\t\tldw r" + nbRegistre1 + ", #" + aRajouterIfNegGauche + noeudGauche + "\n" +
                            "\t\tmul r" + nbRegistre + ", r" + nbRegistre1 + ", r" + nbRegistre + "\n");
                    break;

                case "/":
                    f.write("\t\tldw r" + nbRegistre1 + ", #" + aRajouterIfNegGauche + noeudGauche + "\n" +
                            "\t\tldw r" + nbRegistre2 + ", r" + nbRegistre + "\n" +
                            "\t\tdiv r" + nbRegistre1 + ", r" + nbRegistre2 + ", r" + nbRegistre + "\n");
                    break;

                case "&":
                    if (isVarGauche) {
                        rechercheValeurVariableAssembleur(noeudGauche.getText(), tds, f, "r" + registreUtilGauche);
                        recopieString(registreUtilGauche, f, nbRegistre, true, false, "");

                    } else {
                        allocationStringTas(noeudGauche.getChild(0).getText(), f, nbRegistre, false, false, aRajouter, false);
                    }

                    break;
            }

            String aRajouterLocal = "";
            if (operateur.equals("&")) {
                aRajouterLocal = testARajouter(noeudDroit, false, "");
            }
            operationRecursiveAssembleur(noeudDroit, tds, f, nbRegistre, noeudDroit.getText(), aRajouterLocal, true);

            // ---------------------------------------- Quand on a aucun entier sur les feuilles ---------------------------------------- //

        } else {
            operationRecursiveAssembleur(noeudGauche, tds, f, nbRegistre, noeudGauche.getText(), aRajouter, false);
            operationRecursiveAssembleur(noeudDroit, tds, f, nbRegistre1, noeudDroit.getText(), aRajouter, true);

            switch (operateur) {
                case "+":
                    f.write("\t\tadd r" + nbRegistre + ", r" + nbRegistre1 + ", r" + nbRegistre + "\n");
                    break;

                case "-":
                    f.write("\t\tsub r" + nbRegistre + ", r" + nbRegistre1 + ", r" + nbRegistre + "\n");
                    break;

                case "*":
                    f.write("\t\tmul r" + nbRegistre + ", r" + nbRegistre1 + ", r" + nbRegistre + "\n");
                    break;

                case "/":
                    f.write("\t\tdiv r" + nbRegistre + ", r" + nbRegistre1 + ", r" + nbRegistre2 + "\n" +
                            "\t\tldw r" + nbRegistre + ", r" + nbRegistre2 + "\n");
                    break;
            }
        }
    }

    // --------------------------------------------------------- ALLOCATION STRING TAS --------------------------------------------------------- //

    //POUR LES PARAMETRES :
        // valeur : la string entre guillemets ( ex : "pomme" )
        // registre : numéro de registre dans lequel on enregistre l'adresse du string dans le tas ( ex : 1 )
        // enreg : true si on veut retenir l'adresse de la string ( METTEZ TRUE )
        // endNull : true si on veut finir l'enregistrement à la fin du string donné en valeur ( METTEZ TRUE )
        // aRajouter : METTEZ ""
        // concat : METTEZ false
    public static String allocationStringTas(String valeur, FileWriter f, int registre, boolean enreg, boolean endNull, String aRajouter, boolean concat) throws IOException {

        // /!\ ATTENTION AU COMMENCEMENT POUR LA CONCAT !

    // ------------- VARIABLES LOCALES ------------- //

        int registreLibre = registre+1;
        int decalage = 0;

    // ------------- TESTS INITIAUX POUR LE BON FONCTIONNEMENT ------------- //

        if (enreg) {
            f.write("\t\tADQ 2 , HP\t\t\t\t//On augmente HP de deux pour pas erase la dernière valeur sur laquelle pointe HP\n" +
                    "\t\tLDW R" + registre + " , HP\t\t\t\t//on enregistre dans le bon registre l'adresse du String\n");
        }

        // Si on concat, cela signifie que l'on a une chaine avant
        if (concat && aRajouter.equals("") && valeur.length() > 3) {
            f.write("\t\tADQ 2, HP\t\t\t\t//on ne rajoute ce 2 que lorsque c'est nécessaire \n");
        }

    // ------------- ON REGARDE SI LA CHAINE EST VIDE ------------- //

        if (valeur.equals("\"\"")) {
            f.write("\t\tADQ -2, HP\t\t\t\t//Chaine vide\n");
            if (endNull) {
                f.write("\t\tLDW R" + registreLibre + " , #0x0000\n" +
                        "\t\tADQ 2 , HP\n" +
                        "\t\tSTW R" + registreLibre + " , (HP)\n");
            }
            return "";

    // ------------- ON REGARDE SI LA CHAINE NE POSSEDE QU'UN SEUL CARACTÈRE ------------- //

        } else if (valeur.length() == 3) {
            char first = valeur.charAt(1);
            String asciiHexafirst = Integer.toHexString(first).toUpperCase();

            if (endNull) {
                f.write("\t\tLDW R" + registreLibre + ", #0x" + asciiHexafirst + "00\n" +
                        "\t\tSTW R" + registreLibre + " , (HP)\n");
                return "";
            } else {
                f.write("\t\tADQ -2, HP\t\t\t\t//Une seule lettre\n");
                return asciiHexafirst;
            }
        }

    // ------------- ON AJOUTE LA LETTRE QUI RESTAIT PRÉCÉDEMMENT ------------- //

        if (!aRajouter.equals("")) {
            char first = valeur.charAt(1);
            String asciiHexafirst = Integer.toHexString(first).toUpperCase();

            f.write("\t\tLDW R" + registreLibre + " , #0x" + aRajouter + asciiHexafirst + "\n" +
                    "\t\tADQ 2 , HP\n" +
                    "\t\tSTW R" + registreLibre + " , (HP)\n");
            decalage++;

    // ------------- S'IL N'Y A RIEN A RAJOUTER DU TOUR PRÉCÉDENT ------------- //

        } else {
            char first = valeur.charAt(1);
            char second = valeur.charAt(2);
            String asciiHexafirst = Integer.toHexString(first).toUpperCase() + Integer.toHexString(second).toUpperCase();

            f.write("\t\tLDW R" + registreLibre + " , #0x" + asciiHexafirst + "\n" +
                    "\t\tSTW R" + registreLibre + " , (HP)\n");
        }

    // ------------- ON FAIT LES LETTRES INTERNES DES CHAINES DE CARACTÈRES ------------- //

        for (int i=3-decalage; i<valeur.length()-1; i+=2) {

            if (i < valeur.length()-2) {

                char lettre = valeur.charAt(i);
                char lettre1 = valeur.charAt(i+1);
                String asciiHexaLettre = Integer.toHexString(lettre).toUpperCase() + Integer.toHexString(lettre1).toUpperCase();

                f.write("\t\tLDW R" + registreLibre + " , #0x" + asciiHexaLettre + "\n" +
                        "\t\tADQ 2 , HP\n" +
                        "\t\tSTW R" + registreLibre + " , (HP)\n");

    // ------------- ON CONSIDERE LA DERNIERE LETTRE DE LA CHAINE DE CARACTÈRES ------------- //

            } else if (i == valeur.length()-2) {
                if(!endNull) {
                    char lettre = valeur.charAt(i);
                    String asciiHexaLettre = Integer.toHexString(lettre).toUpperCase();

                    return asciiHexaLettre;
                } else {
                    char lettre = valeur.charAt(i);
                    String asciiHexaLettre = Integer.toHexString(lettre).toUpperCase();

                    f.write("\t\tLDW R" + registreLibre + " , #0x" + asciiHexaLettre + "00\n" +
                            "\t\tADQ 2 , HP\n" +
                            "\t\tSTW R" + registreLibre + " , (HP)\n");
                }
            }
        }

    // ------------- ON FINALISE LA CHAÎNE DE CARACTÈRE AVEC LA VALEUR NULLE ------------- //

        // Le endNull signifie que c'est la fin de la concaténation, ce NULL est doublée dans le cas où la chaine est de longueur impaire
        if (endNull) {
            f.write("\t\tLDW R" + registreLibre + " , #0x0000\n" +
                    "\t\tADQ 2 , HP\n" +
                    "\t\tSTW R" + registreLibre + " , (HP)\n");
        }

        return "";
    }

    public static String testARajouter(Tree tree, boolean endNull, String aRajouter) {
        int decalage = 0;

        Tree treeTemp = tree;
        String valeur = tree.getText();

        while (valeur.equals("&")) {
            treeTemp = treeTemp.getChild(1);
            valeur = treeTemp.getText();
        }

        valeur = treeTemp.getChild(0).getText();

        // ------------- ON REGARDE SI LA CHAINE EST NON VIDE ------------- //

        if (valeur.equals("\"\"")) {
            if (endNull) {
                return "";
            }
        // ------------- ON REGARDE SI LA CHAINE NE POSSEDE QU'UN SEUL CARACTÈRE ------------- //

        } else if (valeur.length() == 3) {
            char first = valeur.charAt(1);
            String asciiHexafirst = Integer.toHexString(first).toUpperCase();

            if (endNull) {
                return "";
            } else {
                return asciiHexafirst;
            }
        }

        if (!aRajouter.equals("")) {
            decalage++;
        }

        for (int i=3-decalage; i<valeur.length()-1; i+=2) {
            if (i == valeur.length()-2) {
                if(!endNull) {
                    char lettre = valeur.charAt(i);
                    String asciiHexaLettre = Integer.toHexString(lettre).toUpperCase();

                    return asciiHexaLettre;
                }
            }
        }

        return "";
    }

    static int variableString = 0;

    public static void recopieString(int registreAdresse, FileWriter f, int registre, boolean enreg, boolean endNull, String aRajouter) throws IOException {

        variableString++;

        // ------------- VARIABLES LOCALES ------------- //

        int registreLibre = registreAdresse + 1;
        int registreLibre1 = registreLibre +1;

        // ------------- TESTS INITIAUX POUR LE BON FONCTIONNEMENT ------------- //

        if (enreg) {
            f.write("\t\tADQ 2 , HP\t\t\t\t//On augmente HP de deux pour pas erase la dernière valeur sur laquelle pointe HP\n" +
                    "\t\tLDW R" + registre + " , HP\t\t\t\t//on enregistre dans le bon registre l'adresse du String\n");
        }

        // ------------- ON ENREGISTRE LA CHAINE ------------- //

        f.write("chaine_" + variableString + "\tLDW r" + registreLibre + ", #0x0000\n" +
                "\t\tLDW r" + registreLibre1 + ", (r" + registreAdresse + ")\n" +
                "\t\tCMP r" + registreLibre + ", r" + registreLibre1 + "\n" +  //si la chaine est vide on fait rien
                "\t\tBEQ fin_chaine_" + variableString + "-$-2\n" +
                "\t\tLDW r" + registreLibre1 + ", (HP)\n" +
                "\t\tCMP r" + registreLibre + ", r" + registreLibre1 + "\n" +  //si il n'y a rien avant à concat on saute aussi
                "\t\tBEQ non_concat_" + variableString + "-$-2\n" +

                "\t\tADQ 2, HP\n" +  //si on concat
                "non_concat_" + variableString + "\tLDW r" + registreLibre1 + ", (r" + registreAdresse + ")\n" +
                "\t\tSTW r" + registreLibre1 + ", (HP)\n" + //on enregistre la chaine au bon endroit
                "\t\tADQ 2, r" + registreAdresse + "\n" +

                "\t\tBMP chaine_" + variableString + "-$-2\n" +
                "fin_chaine_" + variableString + "\tNOP\n\n");

        // ------------- ON FINALISE LA CHAÎNE DE CARACTÈRE AVEC LA VALEUR NULLE ------------- //

        // Le endNull signifie que c'est la fin de la concaténation, ce NULL est doublée dans le cas où la chaine est de longueur impaire
        if (endNull) {
            f.write("\t\tLDW r" + registreLibre1 + ", #0x0000\n" +
                    "\t\tADQ 2, HP\n" +
                    "\t\tSTW r" + registreLibre1 + ", r" + registreAdresse + "\n");
        }
    }

    // ---------------------------------------- AFFECTATION ---------------------------------------- //


    //NON TESTÉE
    public static void affectationSelect(Tree tree,TDS tds, FileWriter f,int registre) throws IOException {

        rechercheValeurVariableAssembleur(tree.getChild(1).getChild(0).getText(),tds,f,"R"+(registre+1));

        //D`es que l'on a la valeur on affecte la valeur se trouvant dans le registre R'registre' et on le met dans l'adresse de
        // l'adresse de registre en dessous (R+'registre-1')

        f.write("\t\tSTW R"+(registre+1)+", R"+registre+"\n");
    }


    public static void affectationMessage(Tree tree,TDS tds, FileWriter f,int registre) throws IOException {

        //On met l'adresse de la variable en question dans registre
        rechercheAdresseVariableAssembleur(tree.getChild(0).getText(),tds,f,"R"+registre);

        //On créé le code pour chercher le code pour appeler la méthode en question --> on passe par le tas pour aller dans le descripteur de classe
/*
        String type =null;

        String variable = tree.getChild(0).getText();

        TDS tdsRecherche = tds;
        while (tdsRecherche != null) {

            //On regarde ou est l'élément que l'on veut chercher
            for (Element name : tdsRecherche.getMapElement().values()) {
                //Si on a trouvé l'élément, alors on arrete la boucle et on prend la valeur
                if (name.getName().equals(variable)) {
                    type = name.getType();
                }
            }
            tdsRecherche = tdsRecherche.getParent();
        }

        TDS tdsSub = tds.retrouveMonRoot();
        tdsSub = tdsSub.retrouveMaTDS(type,"CLASSE");


        int deplacementMethode = tdsSub.getDescripteur().getDeplacementMethode(tree.getChild(1).getChild(0).getText());

        f.write("\t\tLDW R"+registre+",(R"+registre+")\n");
        f.write("\t\tLDW R"+registre+",(R"+registre+") //On va dans le descripteur de classe pour affectation\n");

        f.write("\t\tADQ "+deplacementMethode+",(R"+registre+")\n");


 */
        //On prend la valeur du message (il faut passer par le descripteur de classe
        //ouvertureEnvironnementAppelant(tree.getChild(1), f, tds);

    }

    // --------------------------------------------------------- Avoir les paramètres --------------------------------------------------------- //

    //Si le passage par l'analyseur est correcte, il n'est pas obligé de vérifier que la valeur existe avant d'écrire le code
    //On prend les paramètres par passage par valeur.

    public static void getParametreAssembleur(Tree variable, TDS tds, FileWriter f, int registre) throws IOException{
        //CA MARCHE QUE POUR TROUVER LES PARAMETRES D'UNE METHODE

        //TODO : faire la même pour les attributs (qui sont enregistré dans le tas dans l'instanciation)



        //Cas où il y a un String du type "coucou" en parametre
        if(variable.getText() == "STR"){
            //On met le string dans le tas
            CodeAssembleur.allocationStringTas(variable.getChild(0).getText(),f,registre,true,true,"",false);

            //on empile l'adresse pointant vers le string

        }



        //Si l'on a une variable ou un entier seul
        else if (variable.getChildCount() ==0) {


            try {
                //Si on a un Integer, on met directement la variable dans la pile
                int value = Integer.parseInt(variable.getText());

                f.write("\t\tLDW R" + registre + ", #" + value + "\n");


            } catch (Exception e) {
                //Sinon, on fait la recherche de la variable en question

                rechercheAdresseVariableAssembleur(variable.getText(), tds, f, "R"+registre);

                f.write("\t\tLDW R"+registre+", (R"+registre+")\n");

            }

            //Cas si l'on a quelque chose de plus complexe (envoie de message, calcul, ...)
        }else if (variable.getText().equals("this")){
            f.write("\t\tLDW r"+registre+", BP\t\t//cas du this en paramètre\n" +
                    "\t\tADQ -4, r"+registre+"\n" +
                    "\t\tLDW r"+registre+", (r"+registre+")\n" +
                    "\t\tSTW r"+registre+", (SP)\t\t//on empile\n\n");
        } else {
            ParcoursGenerationCode.parcoursTree(variable,tds,f,variable.getChildCount());
            f.write("\t\tADQ -2, SP\n");
            f.write("\t\tSTW R"+registre+", (SP)\t\t//on empile\n\n");
        }
    }

    public static void rechercheAdresseVariableAssembleur(String variable, TDS tds, FileWriter f, String registre) throws IOException {
        //On prend la base pour pouvoir effectuer correctement les deplacements
        f.write("\t\tLDW "+registre+", BP\n");
        boolean T=false;
        int deplacement = 0;
        Boolean isInClass;

        while (tds != null) {

            //On regarde ou est l'élément que l'on veut chercher
            for (Element name : tds.getMapElement().values()) {
                isInClass = tds.getTypeTDS().equals("CLASSE");
                //Si on a trouvé l'élément, alors on arrete la boucle et on prend la valeur
                if (name.getName().equals(variable)) {
                    deplacement = name.getDeplacement();
                    if (deplacement <= 0) {//On regarde si le deplacement est negatif
                        f.write("\t\tADQ "+(-deplacement)+","+registre+" //On effectue le déplacement\n"); //On effectue le déplacement pour arriver à la bonne adresse
                    } else if (isInClass){
                        f.write("\t\tADQ "+(deplacement)+","+registre+" //On effectue le déplacement\n");
                    }
                    else {
                            f.write("\t\tADQ -"+(deplacement)+","+registre+" //On effectue le déplacement\n"); //On effectue le déplacement pour arriver à la bonne adresse
                    }
                    return;

                }
            }


            //Si on ne trouve pas l'élément, on saute dans le chainage statique
            f.write("\t\tADQ -4, " + registre + "\n");
            f.write("\t\tLDW " + registre + ", (" + registre + ")\n");
            tds = tds.getParent();
        }
    }

    public static void rechercheValeurVariableAssembleur(String variable, TDS tds, FileWriter f, String registre) throws IOException {
        //TODO recherche valeur variable sur un static pour l'intérieur d'une méthode <3

        //On prend la base pour pouvoir effectuer correctement les deplacements
        f.write("\t\tLDW "+registre+", BP\n");

        boolean T=false;
        int deplacement = 0;
        Boolean isInClass = tds.getTypeTDS().equals("CLASSE");

        while (tds != null) {
            isInClass = tds.getTypeTDS().equals("CLASSE");
            //On regarde ou est l'élément que l'on veut chercher
            for (Element name : tds.getMapElement().values()) {
                //Si on a trouvé l'élément, alors on arrete la boucle et on prend la valeur
                if (name.getName().equals(variable)) {
                    deplacement = name.getDeplacement();
                    if (deplacement<0) {//On regarde si le deplacement est negatif
                        f.write("\t\tLDW " + registre + ", (" + registre + ")" + (-deplacement) + "\t\t\t\t//on stocke dans le registre la valeur contenu dans la case de la variable\n");
                    }else if (isInClass) {
                        f.write("\t\tLDW " + registre + ", (" + registre + ")" + (deplacement) + "\t\t\t\t//on stocke dans le registre la valeur contenu dans la case de la variable\n");
                    }
                    else {
                        f.write("\t\tLDW " + registre + ", (" + registre + ")-" + deplacement + "\t\t\t\t//on stocke dans le registre la valeur contenu dans la case de la variable\n");
                    }
                    return;
                }
            }

            //Si on ne trouve pas l'élément, on saute dans le chainage statique
            f.write("\t\tADQ -4, " + registre + "\n");
            f.write("\t\tLDW " + registre + ", (" + registre + ")\n");

            tds = tds.getParent();
        }
    }

    //value peut etre un entier, ou une adresse (l'affectation s'effectue de la même manière)
    public static void setValeurVariableAssembleur(String variable, TDS tds, FileWriter f, String registre, String registre1) throws IOException {

        //On prend la base pour pouvoir effectuer correctement les deplacements
        f.write("\t\tLDW "+registre+", BP\t\t//debut setValeurVariable\n");

        boolean T=false;
        int deplacement = 0;

        while (tds != null) {
            //On regarde ou est l'élément que l'on veut chercher
            for (Element name : tds.getMapElement().values()) {
                //Si on a trouvé l'élément, alors on arrete la boucle et on prend la valeur
                if (name.getName().equals(variable)) {
                    deplacement = name.getDeplacement();
                    if (deplacement<0) {//On regarde si le deplacement est negatif
                        f.write("\t\tSTW " + registre1 + ", ("+registre+")" + (-deplacement) + "\t\t\t\t//on stocke dans la variable la valeur contenu dans le bon registre\n");
                    }else{
                        f.write("\t\tSTW " + registre1 + ", ("+registre+")-" + deplacement + "\t\t\t\t//on stocke dans la variable la valeur contenu dans le bon registre\n");
                    }
                    return;
                }
            }

            //Si on ne trouve pas l'élément, on saute dans le chainage statique
            f.write("\t\tADQ -4, " + registre + "\n");
            f.write("\t\tLDW " + registre + ", (" + registre + ")\n");
            tds = tds.getParent();
        }
    }

    public static void recupStatic(TDS tds, String variable, String registre, FileWriter f) throws IOException{
        TDS tdsStatic = tds.retrouveMesStatics();
        Element elem = tdsStatic.getMapElement().get(variable);
        int deplacement = elem.getDeplacement();

        f.write("\t\tLDW "+registre+", STATIC_ADRS\n");
        f.write("\t\tADQ "+deplacement+", "+registre+"\n");
        f.write("\t\tLDW "+registre+"("+registre+")\n");
    }

    // -------------------------------------- Gestion des conditions de structures conditionnelles -------------------------------------- //

    public static void preparationComparaison(Tree tree, TDS tds, FileWriter f) throws IOException{
        Boolean negGauche = false;
        Boolean negDroit = false;
        Tree noeudGauche = tree.getChild(0);
        Tree noeudDroit = tree.getChild(1);

        if (tree.getChildCount() == 3 && noeudDroit.getText().equals("-")) {
            noeudDroit = tree.getChild(2);
            negDroit = true;
        } else if (tree.getChildCount() == 3 && noeudGauche.getText().equals("-")) {
            noeudGauche = tree.getChild(1);
            noeudDroit = tree.getChild(2);
            negGauche = true;
        } else if (tree.getChildCount() == 4){
            noeudGauche = tree.getChild(1);
            noeudDroit = tree.getChild(3);
            negDroit = true;
            negGauche = true;
        }

        //Traitement du fils gauche et mise dans r0
        CodeAssembleur.operationRecursiveAssembleur(noeudGauche, tds, f, 0, tree.getChild(0).getText(), "", true);

        if (negGauche){
            f.write("\t\tNEG r0, r0\n");
        }

        //Traitement du fils droit et mise dans r1
        CodeAssembleur.operationRecursiveAssembleur(noeudDroit, tds, f, 1, tree.getChild(1).getText(), "", true);

        if (negDroit){
            f.write("\t\tNEG r1, r1\n");
        }
        //Compare
        f.write("\t\tCMP r0, r1 \n");//comparaison de D1-D2 à 0
    }

    public static void gestionComparateur(Tree tree, FileWriter f) throws IOException{
        /* /!\ dû fonctionnement du while, on traite la condition INVERSE*/
        switch (tree.getChild(0).getText()){
            case "<": //devient geq
                f.write("\t\tBGE");
                break;

            case "<>": //devient eq
                f.write("\t\tBEQ");
                break;

            case "=": //devient un neq
                f.write("\t\tBNE");
                break;

            case ">": //devient un leq
                f.write("\t\tBLE");
                break;
        }
    }

    //cas ou c'est une variable
    //CEST POUR LES METHODES PAS POUR LES IF ET WHILE
    public static void ouvertureEnvironnementAppelant(Tree tree, FileWriter f, TDS tds, boolean isMeth) throws IOException {
        f.write("\t\tNOP\t //on ouvre l'environnement du message depuis l'appelant\n");
        //empilement des paramètres
        Tree listParam;
        if(isMeth) {
           listParam = tree.getChild(1).getChild(1);
        }

        else{
            listParam = tree.getChild(1);
        }
        if (!(listParam.getChildCount() == 0)) {
            f.write("\t\tNOP\t//on empile les paramètres\n");
            int p=0;
            for (int i=listParam.getChildCount()-1; i>=0; i--) {
                if (i>0&& listParam.getChild(i-1).getText().equals("-")){
                    p = 1;

                }
                getParametreAssembleur(listParam.getChild(i), tds, f, 0);   //on cherche la valeur du paramètre

                if (p==1){
                    f.write("\t\tNEG R0, R0\n");
                    i--;
                    p=0;
                }
                f.write("\t\tSTW R0, -(SP)\n"); //on empile le paramètre
            }
        }
        f.write("\t\tNOP \t// On va chercher le chainage statique, ie l'objet\n");
        if(isMeth) {
            rechercheValeurVariableAssembleur(tree.getChild(0).getText(), tds, f, "R0"); //on enregistre le chainage statique dans R0
            f.write("\t\tJSR @METH_" + tree.getChild(1).getChild(0) + "_\n"); //on applique la bonne methode dessus
        }
        else{
            String newInst;
            if (tree.getParent().getChild(0).getText().equals("DECLVARIABLE")){
                newInst = tree.getParent().getChild(0).getChild(0).getText();
            } else {
                newInst = tree.getParent().getChild(0).getText();
            }
            rechercheValeurVariableAssembleur(newInst, tds, f, "r0");
            f.write("\t\tJSR @CONS_" + tree.getChild(0) + "_\n");

        }
    }

    public static void nettoyageEnvironnementAppelant(FileWriter f, int tailleTotParam) throws IOException {
        f.write("\t\tADQ " + tailleTotParam + ", SP\t//on vide la pile des paramètres\n\n");
    }

    //nomEnvironnement correspond à l'étiquette vers le code de l'environnement ( /!\ à la syntaxe des étiquettes des environnements)
    //on enlève 4 au déplacement max pour obtenir le déplacement des variables seules
    public static void preparationEnvironnement(String nomEnvironnement, TDS tds, FileWriter f) throws IOException{
        int deplacementMax = tds.getDeplacementMax() - 4;

        f.write("\t\tLDQ "+ deplacementMax + ", R1\t\t//debut preparationEnvironnement depuis l'appelée\n"); //on est pas obligé d'utiliser un registre, on pourrait soustraire directement deplMax
        if (nomEnvironnement.equals("main")) {
            f.write("\t\tLDW BP, #NULL\t//on récupère le CD du main\n");
        }
        f.write("\t\tSTW BP, -(SP) \t//on enregistre le CD en pile\n" // sauvegarde le contenu du registre BP sur la pile
        + "\t\tLDW BP, SP \t\t//on commence le changement de base\n" + // charge contenu SP ds BP qui pointe sur sa sauvegarde
        "\t\tADQ 2, BP \t\t//on descend la base à l'adresse de retour, le changement de base est fini\n"); //pour que BP pointe sur @retour

        if (nomEnvironnement.equals("main")) {
            f.write("\t\tLDW R0, #STATIC_ADRS \t//on récupère le chainage statique du main, ie la zone des variables statiques\n"); //On stocke la valeur qu'on mettra dans le chainage statique (adresse de la zone des variables statiques)
        }

        f.write("\t\tSTW R0 , -(SP) \t// on empile le chaînage statique\n" //on empile le chainage statique (l'adresse de l'instanciation)
        + "\t\tSUB SP, R1, SP \t//on réserve l'espace des variables\n\n"); //on réserve R1 octets sur la pile pour les variables locales
    }

    public static void sortieEnvironnement(String nomEnvironnement, FileWriter f) throws IOException {
        f.write("\n\t\tNOP\t\t//début sortie environnement depuis l'appelé\n" +
                "\t\tLDW SP, BP\t\t//on dépile les variables locales, le CS et le CD\n" +
                "\t\tLDW R1, BP\n" +
                "\t\tLDW BP, -(R1)\t\t//on abaisse le pointeur de base\n");
        if (nomEnvironnement.equals("main")) {
            f.write("\t\tTRP #EXIT_EXC\n" +
                    "\t\tJEA @main_\n");
        } else if (nomEnvironnement.equals("while")||nomEnvironnement.equals("then")||nomEnvironnement.equals("else")){}
        else {
            f.write("\t\tRTS\n\n ");
        }
    }

    // --------------------------------------------------------- Création de classe --------------------------------------------------------- //

    public static void creationDescClasse(TDS tdsClasse, FileWriter f) throws IOException {
        int tailleObj = tdsClasse.getTailleObjet();
        int nbMeth = tdsClasse.getNbMethInClass();

        //On adpate les éléments de la tds de classe
        tdsClasse.setOffsetClasse(TDS.getOffsetTotalDesc());
        TDS.addToOffsetTotalDesc(2+2+nbMeth*2); //2 pour la taille, 2 pour le nombre de méthode, puis l'espace de leurs adresses

        /*On stocke tailleObj et nbMeth*/
        //tailleObj
        f.write("CLASSE_" + tdsClasse.getName()+"_\n\t\tLDW r0, #DESC_ADRS\n");
        f.write("\t\tADQ "+tdsClasse.getOffsetClasse()+", r0\n"); //On a récupéré l'@ adaptée
        f.write("\t\tLDW r1, #"+tailleObj+"\n");
        f.write("\t\tSTW r1, (r0)\n");

        //nbMeth
        f.write("\t\tADQ 2, r0\n"); //On a récupéré l'@ adaptée
        f.write("\t\tLDW r1, #"+nbMeth+"\n");
        f.write("\t\tSTW r1, (r0)\n\n");
    }
}


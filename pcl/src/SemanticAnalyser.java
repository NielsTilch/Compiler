import TDS.TDS;
import TDS.Element;
import org.antlr.runtime.tree.Tree;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/* récupérer l'arbre
--> depuis parcours on analyse
*/

public class SemanticAnalyser {

    static ArrayList<String> motsInterdits = new ArrayList<>(Arrays.asList("def", "static", "is", "override", "new", "if", "while", "then", "else", "var", "extends", "return", "result", "this", "super", "as", "class", "Integer", "String"));
    static ArrayList<String> operation = new ArrayList<>(Arrays.asList("+", "-", "*", "<>", "<", ">", "(", ")", "="));



// --------------------------------------------------------------- CLASSE --------------------------------------------------------------- //
    //TOUTES LES ERREURS SEMANTIQUES SUR LES CLASSES ONT ETE TESTEES ET VERIFIEES



    public static void analyseClasse(Tree tree, TDS tds, FileWriter f, Boolean hasExtend) throws IOException {
        //--> Integer et String ne peuvent pas être donnés en nom de classe grâce à la grammaire
        //--> Integer et String ne peuvent pas être extends grâce à la grammaire
        int nbApparition = 0;
        boolean extendClasseExists = false;

        ArrayList<String> listNomParam = new ArrayList<>();
        //--> on vérifie que plusieurs paramètres n'ont pas le même nom
        for (int i = 0; i < tree.getChild(1).getChildCount(); i++) {
            if (!listNomParam.contains(tree.getChild(1).getChild(i).getChild(0).getText())) {
                listNomParam.add(tree.getChild(1).getChild(i).getChild(0).getText());
            } else {
                f.write("-------------- Erreur Nom Paramètres Classe ---------------\nLa classe : " + tree.getChild(0) +
                        "\nLe nom de paramètre : " + tree.getChild(1).getChild(i).getChild(0) + " est utilisé plusieurs fois\n\n");
            }
        }

        //--> on vérifie qu'une classe n'est pas définie deux fois
        for (String nom : tds.getMapElement().keySet()) {
            if (tds.getMapElement().get(nom).getNature().equals("classe")) {         //--> on vérifie que l'élémennt nom est bien une classe
                if (tree.getChild(0).getText().equals(tds.getMapElement().get(nom).getName())) {
                    f.write("-------------- Erreur Classe déjà existante ---------------\nLa classe " + tree.getChild(0).getText() + " est définie deux fois\n\n");
                }

                if (tree.getChild(2).getChild(0).getText().equals(nom) && hasExtend) {

                    if (tds.getMapElement().get(nom).getExtend().equals(tree.getChild(0).getText())) {
                        f.write("-------------- Erreur Bouclage des héritages ---------------\nLa classe " + tree.getChild(0).getText() + " hérite de " + nom + "\n" +
                                "Et " + nom + " hérite aussi de " + tree.getChild(0).getText() + "\n\n");
                    }

                    extendClasseExists = true;
                }
            }
        }

        //--> On vérifie que la superclasse existe
        if(!extendClasseExists && hasExtend) {
            f.write("-------------- Erreur SuperClasse non définie ---------------\nClasse : " + tree.getChild(0) + "\nLa SuperClasse " + tree.getChild(2).getChild(0).getText() + " n'est pas définie\n\n");
        }
    }



// ========================================================================================================================================= //
// LES CLASSES CI DESSOUS N'ONT PAS ETE TESTEES




    public static void analyseFormalParamEtParam(Tree tree, TDS tds, FileWriter f, int nbChild) throws IOException {
        //les types des paramètres existent bien

        while (tds != null) {
            for (String nom : tds.getMapElement().keySet()) {
                if (tds.getMapElement().get(nom).getNature().equals("classe")) {            //--> on vérifie que l'élément nom est bien une classe
                    if (tree.getChild(1).getText().equals(nom) || tree.getChild(1).getText().equals("String") || tree.getChild(1).getText().equals("Integer")) {
                        return;
                    }
                }
            }
            tds = tds.getParent();
        }

        f.write("-------------- Erreur FormalParam ou Param ---------------\nType " + tree.getChild(1).getText() + " inexistant \n\n");
    }

    public static void analyseDeclVar(Tree tree, TDS tds, FileWriter f, int nbChild) throws IOException {
        //même test que pour formalParam et param
        boolean exists = false;
        TDS autreTDS = tds;
        while (autreTDS != null) {
            for (String nom : autreTDS.getMapElement().keySet()) {
                if (autreTDS.getMapElement().get(nom).getNature().equals("classe")) {            //--> on recherche si la classe de cet élément existe
                    if (tree.getChild(1).getText().equals(nom) || tree.getChild(1).getText().equals("String") || tree.getChild(1).getText().equals("Integer")) {
                        //La classe existe, le test est passé
                        exists = true;
                    }
                }
            }

            //On regarde si la classe est chez son parent
            autreTDS = autreTDS.getParent();

        }

        if (!exists) {
            f.write("------------- Erreur Déclaration de Variable -------------\nType " + tree.getChild(1).getText() + " de variable : " + tree.getChild(0).getText() + " inexistant \n\n");
        }

        //On test si la variable n'est pas doublement déclarée dans la meme tds
        String variable = tree.getChild(0).getText();
        if (tds != null) {
            for (String autreVariable : tds.getMapElement().keySet()) {
                if (tds.getMapElement().get(autreVariable).getName().equals(variable)) {
                    f.write("---- Erreur Double déclaration ----\nLa variable " + variable + " est déjà déclarée dans le bloc ! \n\n");
                }
            }
        }
    }


    public static String getTypeEnvoieMessage(Tree tree, TDS tds) throws IOException {
        String type = "";
        boolean gotIt = false;
        String variable = tree.getChild(tree.getChildCount()).getChild(1).getText();
        while (tds != null || gotIt) {
            for (String truc : tds.getMapElement().keySet()) {
                if (tds.getMapElement().get(truc).getNature().equals("nom")) {
                    type = tds.getMapElement().get(truc).getType();

                }
            }
            tds = tds.getParent();
        }
        return type;
    }

    public static String getTypeExpression(Tree tree, TDS tds, FileWriter f) throws IOException {

        String type = "NULL";
        List<String> listOperateurs = Arrays.asList("+", "*", "/","-");
        TDS autreTDS = tds;

        if (tree.getText().equals("this")) {
            int numReg = tds.getNumRegion();
            autreTDS = autreTDS.getParent();

            while (autreTDS != null) {
                for (String nom : autreTDS.getMapElement().keySet()) {
                    if (autreTDS.getMapElement().get(nom).getNature().equals("classe")) {            //--> on recherche si la classe de cet élément existe
                        if (autreTDS.getMapElement().get(nom).getNumRegion() == numReg) {

                            //La classe existe, le test est passé et on prend le nom de la classe.
                            type = autreTDS.getMapElement().get(nom).getName();
                        }
                    }
                }
                //On regarde si la classe chez son parent
                autreTDS = autreTDS.getParent();
            }

            if (type.equals("NULL")) {
                f.write("---- Erreur emplacement this ----- \nLe 'this' n'est pas dans une classe\n\n");
            }

        }

        //Le marqueur MESSOUSELECT est rencontré
        else if (tree.getText().equals("MESSOUSELECT")) {
            //Le cas où l'on tombe sur une écriture du type 'this.variable'
            if (tree.getChild(0).getText().equals("this")) {
                //On trouve un this
                //On cherche le nom de la classe pour avoir son type

                autreTDS = autreTDS.getParent();
                boolean testThis = false;

                for (String nom : autreTDS.getMapElement().keySet()) {
                    if (autreTDS.getMapElement().get(nom).getName().equals(tree.getChild(1).getChild(0).getText())) {
                        //La classe existe, le test est passé
                        type = autreTDS.getMapElement().get(nom).getType();
                        testThis = true;
                    }
                }
                if (!testThis) {
                    f.write("---- Erreur emplacement this ---- \nPour utiliser le this, il faut que la variable soit un attribut de la classe"
                            + "\nL'utilisation du 'this.' avec " + tree.getChild(1).getChild(0).getText() + " n'est pas possible\n\n");
                }

            }
            //On retourne le type de l'envoie de message
            else if (tree.getChild(1).getText().equals("MESSAGE")) {
                return tree.getChild(0).getText();
            }
        }
        else if(tree.getText().equals("INST")){
            return tree.getChild(0).getText();
        }
        else if(tree.getText().equals("DECLVARIABLE")){
            return tree.getChild(1).getText();
        }

        //On retourne le type du cast
        else if (tree.getText().equals("CAST")) {
            type = tree.getChild(0).getText();
        }

        //Si il y a un opérateur, alors on prend le type plus loin
        else if (listOperateurs.contains(tree.getText())) {
            type = getTypeExpression(tree.getChild(0), tds, f);
        }

        //On retroune le type string
        else if (tree.getText().equals("STR")) {
            return "String";
        } else {
            //Distinction entre variable en caractère et chiffre
            try {
                Integer.parseInt(tree.getText());
                return "Integer";
            } catch (Exception e) { //Variable : on essaye de prendre son type
                while (autreTDS != null) {
                    for (String nom : autreTDS.getMapElement().keySet()) {
                        if (autreTDS.getMapElement().get(nom).getNature().equals("paramAttr")) {

                            if (autreTDS.getMapElement().get(nom).getName().equals(tree.getText())) {
                                return autreTDS.getMapElement().get(nom).getType();  // --> On retourne le type de la variable en question si on l'a trouve
                                //La classe existe, le test est passé et on prend le nom de la classe.
                            }
                        }
                    }
                    //On regarde si la classe chez son parent
                    autreTDS = autreTDS.getParent();
                }

                return type;
            }
        }

        return type;
    }


    public static Boolean subAnalyseCast(Tree tree, TDS tds, FileWriter f, String superClasseCurrent, List<String> bannedClasses) throws IOException {
        TDS autreTDS = tds;
        autreTDS = autreTDS.getParent();


        while (autreTDS != null) {
            for (String nom : autreTDS.getMapElement().keySet()) {
                if (!bannedClasses.contains(nom)) {
                    if (autreTDS.getMapElement().get(nom).getNature().equals("classe")) {            //--> on recherche si la classe de cet élément existe
                        if (!autreTDS.getMapElement().get(nom).getExtend().equals(null)) {
                            if (autreTDS.getMapElement().get(nom).getExtend().equals(tree.getChild(0).getText())) { //--> On trouve la superclasse concernée
                                return true;
                            } else {
                                bannedClasses.add(nom);
                                return subAnalyseCast(tree, tds, f, nom,bannedClasses); //--> On ne trouve pas la superclasse concerner mais on peut aller plus haut
                            }
                        }
                    }
                }
            }
            //On regarde si la classe chez son parent
            autreTDS = autreTDS.getParent();

        }
        return false;
    }


        public static void analyseCast (Tree tree, TDS tds, FileWriter f) throws IOException {

            Boolean test = true;

            TDS autreTDS =tds;
            String type = getTypeExpression(tree.getChild(1), tds, f);
            if (type != "NULL") {
                while (autreTDS != null) {
                    for (String nom : autreTDS.getMapElement().keySet()) {
                        if (autreTDS.getMapElement().get(nom).getNature().equals("classe")) {            //--> on recherche si la classe de cet élément existe
                            if (!autreTDS.getMapElement().get(nom).getExtend().equals(null)){
                                if (autreTDS.getMapElement().get(nom).getExtend().equals(tree.getChild(0).getText())){ //--> On trouve directement la superclasse
                                    return;
                                }else{
                                    List<String> bannedClasses = new ArrayList<>();
                                    bannedClasses.add(nom);
                                    test = subAnalyseCast(tree,tds,f,"NULL",bannedClasses); //--> On trouve un extends `a la classe concerner, on chercher plus haut

                                }
                            }
                        }
                    }
                    //On regarde si la classe chez son parent
                    autreTDS = autreTDS.getParent();

                }
                if (!test){
                    f.write("----- Erreur SuperClasse Non Détectée -----\n La classe "+tree.getChild(0).getText()+" n'est pas reconnu comme super-classe du type "+ type+" de l'expression\n\n");
                }else{
                }
            }
            if (type =="NULL"){
                f.write("----- Erreur Classe Non Existante ----- \n Le type de l'expression du Cast n'est pas reconnu \n\n");
            }
        }



    public static void analyseAffectation(Tree tree, TDS tds, FileWriter f) throws IOException{

        String typeDroite="";
        String typeGauche="";

        typeDroite = getTypeExpression(tree.getChild(0),tds,f);
        typeGauche = getTypeExpression(tree.getChild(1),tds,f);


        if(!typeDroite.equals(typeGauche)){
            if (tree.getChild(0).getText().equals("MESSOUSELECT") && tree.getChild(0).getChild(1).getText().equals("SELECT")) {
                f.write("---- Erreur Affectation ---- \nVariable : " + tree.getChild(0).getChild(1).getChild(0) + "\nTentative d'affectation d'un type "+typeDroite+" avec un type "+typeGauche + "\n\n");
            } else {
                f.write("---- Erreur Affectation ---- \nVariable : " + tree.getChild(0) + "\nTentative d'affectation d'un type "+typeDroite+" avec un type "+typeGauche + "\n\n");
            }
        }
    }


    public static void analyseInstanciation(Tree tree, TDS tds, FileWriter f) throws IOException{
        String type = tree.getChild(0).getText();
        String nom = tree.getParent().getChild(0).getText();

        //On regarde si la classe existe
        TDS autreTDS = tds;

        boolean test = false;
        while (autreTDS != null && !test){
            for (String classe : autreTDS.getMapElement().keySet()){
                    if (type.equals(classe)){
                        test = true;
                }
            }
            autreTDS = autreTDS.getParent();
        }
        if (!test){
            f.write("---- Erreur Classe Inexistante ----\nLa classe "+type+" en instance n'exite pas\n\n");
        }


        //On regarde si la classe de la variable est la meme que celle de l'instanciation

        //On a déclaré la variable en meme temps que l'instanciation

        if (tree.getParent().getChild(0).getText().equals("DECLVARIABLE")) {
            if (!tree.getParent().getChild(0).getChild(1).getText().equals(type)) {
                f.write("---- Erreur classe instanciation ----\nLes classes " + tree.getParent().getChild(0).getChild(1) + " et " + type + " ne sont pas les mêmes !\n\n");
            }
        }else{


            //On n'a pas de déclaration de variable, on regarde si la variable n'a pas été déclaré avant
            TDS encoreTDS = tds;
            String type2 = "NULL";
            boolean test2 = false;
            while (encoreTDS !=null && !test2){
                for (String variable : encoreTDS.getMapElement().keySet()){
                    if (encoreTDS.getMapElement().get(variable).getName().equals(nom)){
                        type2 = encoreTDS.getMapElement().get(variable).getType();
                        if (type2.equals(type)){
                            //On trouve la variable et le type est le bon
                            test2 = true;
                        }else{
                            //On trouve la variable mais le type n'est pas le bon
                            break;
                        }

                    }
                }
                encoreTDS = encoreTDS.getParent();
            }
            if(!test2 && tds !=null){
                f.write("---- Erreur classe instanciation ----\nLes classes " + type2 + " et " + type + " ne sont pas les memes !\n\n");
            }

        }


    }


    public static void analyseAttribDef(Tree tree, TDS tds, FileWriter f, Boolean isStatic) throws IOException {
        int decalage = 0;
        if (isStatic) {
            decalage = 1;
        }

        while (tds != null) {
            for (String nom : tds.getMapElement().keySet()) {
                if (tds.getMapElement().get(nom).getNature().equals("classe")) {            //--> on recherche si la classe de cet élément existe
                    if (tree.getChild(decalage + 1).getText().equals(nom) || tree.getChild(decalage + 1).getText().equals("String") || tree.getChild(decalage + 1).getText().equals("Integer")) {
                        return;
                    }
                }
            }
            tds = tds.getParent();
        }
        f.write("------------- Erreur Déclaration de Variable -------------\nType " + tree.getChild(decalage + 1).getText() + " inexistant \n\n");

    }

// --------------------------------------------------------------- Constructeur --------------------------------------------------------------- //
    //TOUTES LES ERREURS SEMANTIQUES SUR LES CONSTRUCTEURS ONT ETE TESTEES ET VERIFIEES

    public static void analyseConstructeur(Tree tree, TDS tds, FileWriter f) throws IOException {
        int numRegClass = tds.getNumRegion();
        TDS tdsWhile1 = tds;

        TDS tdsWhile2 = tds;        //réfère à la l.162
        boolean notIn = true;
        String typeVariable = "";
        int nbCons = 0;
        int nbNotIn = 0;
        int cmpt = 0;

        tds = tds.getParent();

        boolean erreurNom = true;
        int nberreur = 0;
        boolean erreurExtends = true;
        boolean erreurConsParam = false;

        ArrayList<String> listNomParam = new ArrayList<>();
        //--> on vérifie que plusieurs paramètres n'ont pas le même nom
        for (int i = 0; i < tree.getChild(1).getChildCount(); i++) {
            if (!listNomParam.contains(tree.getChild(1).getChild(i).getChild(0).getText())) {
                listNomParam.add(tree.getChild(1).getChild(i).getChild(0).getText());
            } else {
                f.write("-------------- Erreur Nom Paramètres Constructeur ---------------\nLe constructeur : " + tree.getChild(0) +
                        "\nLe nom de paramètre : " + tree.getChild(1).getChild(i).getChild(0) + " est utilisé plusieurs fois\n\n");
            }
        }

        //--> on regarde si le constructeur a le même nom que la classe
        for (String nom : tds.getMapElement().keySet()) {
            if (tds.getMapElement().get(nom).getNature().equals("classe")
                    && tree.getChild(0).getText().equals(tds.getMapElement().get(nom).getName())
                    && numRegClass == tds.getMapElement().get(nom).getNumRegion()) {
                erreurNom = false;
            }
        }
        //vérifier que le nom de la méthode n'est pas un mot interdit
        if (erreurNom) {
            f.write("---------------- Erreur Nom Constructeur -----------------\nLe constructeur " + tree.getChild(0).getText() + " ne correspond pas avec sa classe \n\n");
        }

        //--> on test si les param de Constructeur et Classe sont identiques
        if (tree.getChild(1).getChildCount() != tree.getParent().getParent().getChild(1).getChildCount()) {
            f.write("----------- Erreur Nombre paramètres de constructeur ------------\nPas le même nombre de paramètres entre la classe et le constructeur : " + tree.getChild(0));
            f.write("\nNombre de paramètres du constructeur : " + tree.getChild(1).getChildCount());
            f.write("\nNombre de paramètres de la classe : " + tree.getParent().getParent().getChild(1).getChildCount() + "\n\n");
        } else {
            for (int i = 0; i < tree.getChild(1).getChildCount(); i++) {

                if (!tree.getChild(1).getChild(i).getText().equals(tree.getParent().getParent().getChild(1).getChild(i).getText())) {
                    f.write("----------- Erreur Paramètres/Paramètres Formels de constructeur ------------\n"
                            + "Si le paramètre de classe est précédé d'un var, celui du constructeur doit aussi être précédé d'un var"
                            + "\nParamètres différents entre la classe et le constructeur : " + tree.getChild(0).getText() + "\n\n");

                }

                if (!tree.getChild(1).getChild(i).getChild(0).getText().equals(tree.getParent().getParent().getChild(1).getChild(i).getChild(0).getText())
                        || !tree.getChild(1).getChild(i).getChild(1).getText().equals(tree.getParent().getParent().getChild(1).getChild(i).getChild(1).getText())) {

                    if (nberreur == 0) {        //--> on regroupe les erreurs pour un même constructeur au même endroit
                        f.write("----------- Erreur Paramètres de constructeur ------------\n" +
                                "Paramètres différents entre la classe et le constructeur : " + tree.getChild(0).getText()
                                + "\nparamètres constructeur : " + tree.getChild(1).getChild(i).getChild(0).getText() + " : " + tree.getChild(1).getChild(i).getChild(1).getText()
                                + "\nparamètres classe : " + tree.getParent().getParent().getChild(1).getChild(i).getChild(0).getText() + " : " + tree.getParent().getParent().getChild(1).getChild(i).getChild(1).getText());
                    } else {
                        f.write("\n---------------------------------------------------" +
                                "\nParamètres différents entre la classe et le constructeur : " + tree.getChild(0).getText()
                                + "\nparamètres constructeur : " + tree.getChild(1).getChild(i).getChild(0).getText() + " : " + tree.getChild(1).getChild(i).getChild(1).getText()
                                + "\nparamètres classe : " + tree.getParent().getParent().getChild(1).getChild(i).getChild(0).getText() + " : " + tree.getParent().getParent().getChild(1).getChild(i).getChild(1).getText());

                    }
                    nberreur++;
                }
            }
            if (nberreur != 0) {
                f.write("\n\n");
            }
        }

        // --> on vérifie que les extends du constructeur sont les mêmes que ceux de la classe
        if (tree.getParent().getParent().getChild(2).getText().equals("EXTENDS")) { //--> ne pas oublier le cas ou extends dnas cons mais pas dans class
            if (!tree.getChild(2).getText().equals("EXTENDS")) {
                f.write("------------ Erreur Extends du constructeur --------------\nConstructeur " + tree.getChild(0).getText() + " doit extends une superclasse\n\n");
            } else {
                if (!tree.getChild(2).getChild(0).getText().equals(tree.getParent().getParent().getChild(2).getChild(0).getText())) {
                    f.write("------------ Erreur Extends du constructeur --------------\nLes deux EXTENDS de la classe et du constructeur doivent être identiques\nConstructeur : " + tree.getChild(0).getText() + "         extends : " + tree.getChild(2).getChild(0).getText() + "\nExtends de la Classe : " + tree.getParent().getParent().getChild(2).getChild(0).getText() + "\n\n");

                }

                //--> on vérifie que la classe que l'on cherche à extends existe et que ses paramètres sont les bons
                while (tdsWhile1 != null) {
                    for (String nom : tds.getMapElement().keySet()) {
                        if (tds.getMapElement().get(nom).getNature().equals("classe")) {            //--> on recherche si la classe de cet élément existe

                            if (tree.getChild(2).getChild(0).getText().equals(nom) || tree.getChild(1).getText().equals("String") || tree.getChild(1).getText().equals("Integer")) {

                                erreurExtends = false;      //--> la classe qui est extends existe
                                for (int i=0; i<tree.getChild(2).getChild(1).getChildCount(); i++) {            //--> on regarde les paramètres donnés au constructeur de la superclasse

                                    for (TDS fils : tds.getListFils()) {          //--> on regarde pour tous les fils lequels est la bonne classe
                                        if (fils.getNumRegion() == tds.getMapElement().get(nom).getNumRegion()) {           //grâce au numRégion

                                            for (String key : fils.getMapElement().keySet()) {      //On parcours les elmt de la bonne table
                                                if (fils.getMapElement().get(key).getNature().equals("paramAttr") && fils.getMapElement().get(key).getDeplacement() < 0) {  //--> on ne traite l'elmt que si param
                                                    //--> on vérifie qu'ils ont le même nombre de paramètres
                                                    if(tree.getChild(2).getChild(1).getChildCount() != fils.getNbParam() && cmpt == 0 ) {
                                                        f.write("--------------------------- Erreur Nombre paramètres de la superClasse ---------------------------");
                                                        f.write("\nLa superclasse appelée : " + tree.getChild(2).getChild(0).getText() + "\n" +
                                                                "Superclasse de : " + tree.getChild(0) +
                                                                "\n    ---------------------------------------------------------------------    \n" +
                                                                "Nombre de paramètres donné : " + tree.getChild(2).getChild(1).getChildCount() + "\n" +
                                                                "Nombre de paramètres attendu : " + fils.getNbParam() + "\n\n");
                                                        cmpt++;
                                                    }

                                                    //--> ATTENTION NOUVELLE REGLE ! IL FAUT VERIFIER QUE LE PARAMETRE EXISTE BIEN ET QU'IL EST BIEN DU BON TYPE.
                                                    while(tdsWhile2 != null && notIn) {
                                                        for(String name : tdsWhile2.getMapElement().keySet()) {
                                                            if(tree.getChild(2).getChild(1).getChild(i).getText().equals(name)) {
                                                                typeVariable = tdsWhile2.getMapElement().get(name).getType();
                                                                notIn = false;
                                                            }
                                                        }
                                                        tdsWhile2 = tdsWhile2.getParent();
                                                    }

                                                    if(notIn) {
                                                        if(nbNotIn == 0) {
                                                            f.write("--------------------------- Erreur Paramètres de la superClasse inexistants ---------------------------");
                                                            f.write("\nLe paramètre : " + tree.getChild(2).getChild(1).getChild(i).getText() + " n'existe pas\n" +
                                                                    "Il est appelée en paramètre du constructeur de la superclasse : " + tree.getChild(2).getChild(0).getText() + "\n" +
                                                                    "Superclasse de : " + tree.getChild(0) + "\n\n");
                                                        }
                                                        nbNotIn++;

                                                    }

                                                    //--> IL PEUT ETRE PARAMETRE DU CONSTRUCTEUR ET DONC DE LA CLASSE ET IL PEUT AUSSI ETRE ATTRIBUT DE LA CLASSE

                                                    if(tree.getChild(2).getChild(1).getChild(i).getText().equals(fils.getMapElement().get(key).getType()) && !notIn) {   //--> on les vérifie dans l'ordre
                                                        if (!erreurConsParam) {
                                                            if(nbCons == 0) {
                                                                f.write("--------------------------- Erreur Paramètres de la superClasse ---------------------------");
                                                            }
                                                            f.write("\nConstructeur : " + tree.getChild(0) + "\n");
                                                            erreurConsParam = true;
                                                            nbCons++;
                                                        }
                                                        f.write("\nParamètre : " + tree.getChild(2).getChild(1).getChild(i).getText() + "    Type donné : " + typeVariable);
                                                        f.write("\nType attendu : " + fils.getMapElement().get(key).getType() + "\n");
                                                    }
                                                }
                                            }
                                            if (erreurConsParam) {
                                                f.write("\n");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    tdsWhile1 = tdsWhile1.getParent();
                }
                if (erreurExtends) {
                    f.write("------------- Erreur Extends de Constructeur -------------\nLe constructeur " + tree.getChild(0).getText() + " extends la classe " + tree.getChild(2).getChild(0).getText() + " inexistante \n\n");
                }
            }

        } else {
            if (tree.getChild(2).getText().equals("EXTENDS")) {
                f.write("------------ Erreur Extends du constructeur --------------\nConstructeur " + tree.getChild(0).getText() + " ne doit pas extends une superclasse\n\n");
            }
        }
    }


// --------------------------------------------------------------- Methode --------------------------------------------------------------- //
    //TOUTES LES ERREURS SEMANTIQUES SUR LES METHODES ONT ETE TESTEES ET VERIFIEES


    public static void analyseMethode(Tree tree, TDS tds, FileWriter f, int nbChild, int decalage) throws IOException {
        boolean methodeOverride = true;
        boolean nomMethodeOverride = false;
        boolean nomValide = true;
        boolean typeExiste = false;
        boolean hasOverride = false;
        TDS tdsClasseExtend;
        TDS autreTDS = tds;
        TDS encoreTDS = tds;

        String classeAtrouver = "";

        ArrayList<String> listNomParam = new ArrayList<>();
        ArrayList<String> listNomAttribut = new ArrayList<>();
        //--> on vérifie que plusieurs paramètres n'ont pas le même nom
        //--> On vérifie aussi que les paramètres ne peuvent pas avoir le même nom que les attributs de la classe
        for (String keyClassParente : tds.getMapElement().keySet()) {
            //on ajoute tous attributs de la classe parente à la méthode
            if (tds.getMapElement().get(keyClassParente).getNature().equals("paramAttr")
                    && tds.getMapElement().get(keyClassParente).getDeplacement() >= 0) {
                listNomAttribut.add(keyClassParente);
            }
        }
        for (int i = 0; i < tree.getChild(decalage+1).getChildCount(); i++) {
            if (!listNomParam.contains(tree.getChild(decalage+1).getChild(i).getChild(0).getText())) {
                listNomParam.add(tree.getChild(decalage+1).getChild(i).getChild(0).getText());
            } else {
                f.write("-------------- Erreur Nom Paramètres Méthode ---------------\nLa méthode : " + tree.getChild(0) +
                        "\nLe nom de paramètre : " + tree.getChild(decalage+1).getChild(i).getChild(0) + " est utilisé plusieurs fois\n\n");
            }
            if (listNomAttribut.contains(tree.getChild(decalage+1).getChild(i).getChild(0).getText())) {
                f.write("-------------- Erreur Nom Paramètres Méthode ---------------\n"
                        + "On ne peut pas utiliser une nom en paramètres qui est utilisé en nom d'attribut, ambiguité\n ---------------------------------------------"
                        + "\nClasse : " + tree.getParent().getParent().getChild(0)
                        + "\nLa méthode : " + tree.getChild(0)
                        + "\nLe nom de paramètre : " + tree.getChild(decalage+1).getChild(i).getChild(0) + " est déjà utilisé en nom d'attribut de la classe\n\n");
            }
        }

        /* vérifier que le nom de la méthode n'est pas un mot interdit */
        // LA GRAMMAIRE A L'AIR DE REFUSER DIRECT LES MOTS INTERDITS ==> MEME CADRE QUE POUR LES CLASSES
        if (motsInterdits.contains(tree.getChild(0).getText())) {
            f.write("------------- Erreur nom methode -------------\nNom " + tree.getChild(0).getText() + " ne peut pas être utilisé comme nom de méthode \n\n");
        }

        /* Vérifier que le nom de la méthode n'est pas utilisé dans la classe */

        for (String nomMethode : tds.getMapElement().keySet()) {
            if (tree.getChild(0).getText().equals(nomMethode)
                    && tds.getMapElement().get(nomMethode).getNature().equals("methode")) {  // si le nom de la méthode est déjà utilisé pour une autre méthode
                nomValide = false; // nop
            }
        }

        if (!nomValide) {
            f.write("------------- Erreur définition de méthode -------------\nUtilisation multiple d'un nom de méthode\nLe nom de méthode : " + tree.getChild(0).getText() +
                    "\nDans la classe : " + tree.getParent().getParent().getChild(0) + "\n\n");
        }

        /*vérifier que le nom de la méthode n'existe pas déjà, sauf si il y a un override
        si override on vérifie que le nom existe déjà */


        if (tree.getChild(1).getText().equals("override") || (tree.getChild(1).getText().equals("static") && tree.getChild(2).getText().equals("override"))) { //le override peut être précédé d'un static ou pas
            hasOverride = true;
            if (tree.getParent().getParent().getChild(2).getText().equals("EXTENDS")) {
                classeAtrouver = tree.getParent().getParent().getChild(2).getChild(0).getText();
            } else {
                f.write("------------- Erreur override de méthode -------------\nClasse : " +
                        tree.getParent().getParent().getChild(0) +
                        "\nMéthode : " + tree.getChild(0) +
                        "\nUne méthode ne peut override que si sa classe extends une autre classe\n\n");
            }

            methodeOverride = false;
            autreTDS = autreTDS.getParent();
            while (autreTDS != null) { //On cherche la superclasse correspondante à l'extends de la classe dans laquelle est définie la méthode
                if (autreTDS.getTypeTDS().equals("ROOT")) {     //On vérifie qu'on est au ROOT
                    for (String nomClasse : autreTDS.getMapElement().keySet()) {
                        if (autreTDS.getMapElement().get(nomClasse).getNature().equals("classe")) {  //On cherche une classe
                            if (nomClasse.equals(classeAtrouver)) {  //On prend la classe qui possède le bon nom
                                for (int i = 0; i < autreTDS.getListFils().size(); i++) {   //On parcours les fils jusqu'à avoir la bonne TDS fils
                                    if (autreTDS.getListFils().get(i).getNumRegion() == autreTDS.getMapElement().get(nomClasse).getNumRegion()) {   //on récupère la tds adaptée
                                        tdsClasseExtend = autreTDS.getListFils().get(i);
                                        for (String keyClasse : tdsClasseExtend.getMapElement().keySet()) {     //on parcours la bonne tds
                                            if (tdsClasseExtend.getMapElement().get(keyClasse).getNature().equals("methode")) {    //on vérifie que l'element est une méthode
                                                if (keyClasse.equals(tree.getChild(0).getText())) {      //on vérifie que la méthode à le même nom que la nouvelle méthode
                                                    nomMethodeOverride = true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                autreTDS = autreTDS.getParent();
            }
        } else {
            autreTDS = autreTDS.getParent(); // il ne faut pas que la méthode soit déjà définie dans la même TDS
            while (autreTDS != null && methodeOverride) { //on s'arrête dès qu'on rencontre le nom de la méthode
                for (String nomClasse : autreTDS.getMapElement().keySet()) {
                    for (int i = 0; i < autreTDS.getListFils().size(); i++) {   //On parcours les fils jusqu'à avoir la bonne TDS fils
                        if (autreTDS.getListFils().get(i).getNumRegion() == autreTDS.getMapElement().get(nomClasse).getNumRegion()) {   //on récupère la tds adaptée
                            tdsClasseExtend = autreTDS.getListFils().get(i);
                            for (String keyClasse : tdsClasseExtend.getMapElement().keySet()) {     //on parcours la bonne tds
                                if (tdsClasseExtend.getMapElement().get(keyClasse).getNature().equals("methode")) {    //on vérifie que l'element est une méthode
                                    if (tree.getChild(0).getText().equals(keyClasse)) {
                                        methodeOverride = false; // si on rencontre le nom de la méthode sans override, il y a un problème
                                    }
                                }
                            }
                        }
                    }
                }
                autreTDS = autreTDS.getParent();
            }
        }

        if (!nomMethodeOverride && hasOverride) {
            f.write("------------- Erreur override -------------\n" +
                    "Classe : " + tree.getParent().getParent().getChild(0) +
                    "\nLe nom de la méthode " + tree.getChild(0).getText() + " n'est jamais utilisé précédemment\nEnlevez override ou rajoutez une méthode \n\n");
        }
        if (!methodeOverride && !hasOverride) {
            f.write("------------- Erreur override -------------\n" +
                    "Classe : " + tree.getParent().getParent().getChild(0) +
                    "\nLe nom de la méthode " + tree.getChild(0).getText() + " est déjà utilisé précédemment\nAjoutez un override \n\n");
        }


        /*vérifier que le type de retour existe bien */
        if (tree.getChild(decalage + 2).getText().equals("TYPERETOUR")) { //si il y a un type de retour
            while (encoreTDS != null) {
                for (String nomType : encoreTDS.getMapElement().keySet()) {
                    if (tree.getChild(decalage + 2).getChild(0).getText().equals(nomType) || tree.getChild(decalage + 2).getChild(0).getText().equals("String") || tree.getChild(decalage + 2).getChild(0).getText().equals("Integer")) {
                        typeExiste = true; // le type a bien été défini précédemment
                    }
                }
                encoreTDS = encoreTDS.getParent();
            }
            if (!typeExiste) { //si le type n'appartient pas à la hashMap ou est différent de String et Integer on note l'erreur
                f.write("------------- Erreur typeRetour methode -------------\n"
                        + "Methode : " + tree.getChild(0)
                        + "\nLe type de retour : " + tree.getChild(2).getChild(0).getText() + " est inexistant \n\n");
            }
        }
    }


// ========================================================================================================================================= //
// LES CLASSES CI DESSOUS N'ONT PAS ETE TESTEES


    public static void analyseBloc(Tree tree, TDS tds, FileWriter f) throws IOException {
        //Récupération de la présence ou non de l'élément result dans la TDS (ou ses mères) et de la tds mère principale (cas de bloc de boucles conditionnelles)
        boolean presenceResultTDS = false;
        TDS tdsMere = tds;
        while (!tdsMere.getTypeTDS().equals("METHODE") && !tdsMere.getTypeTDS().equals("CONSTRUCTEUR") && !tdsMere.getTypeTDS().equals("MAIN")){
            tdsMere = tdsMere.getParent();
        }
        if (tdsMere.getTypeTDS().equals("METHODE")){
            presenceResultTDS = tdsMere.getMapElement().containsKey("result");
        }

        // Ontention de l'emplacement de l'erreur
        String name;
        if (tree.getText().equals("BLOCPRINCIPAL")){
            name = "dans le bloc principal";
        } else if (tds.getTypeTDS().equals("METHODE") || tds.getTypeTDS().equals("CONSTRUCTEUR")){
            name = "dans le bloc de la méthode : \"" + tds.getName() + "\"" ;
        } else if (tdsMere.getTypeTDS().equals("METHODE") || tdsMere.getTypeTDS().equals("CONSTRUCTEUR")) {
            name = "dans un sous-bloc de la méthode : \"" + tdsMere.getName() + "\"";
        } else {
            name = " dans un sous-bloc du bloc principal";
        }


        //Vérification de la présence ou non d'un is ou d'un result
        int indexIS = -1;
        boolean presenceResultCode = false;
        for (int i = 0; i < tree.getChildCount(); i++) {
            if (tree.getChild(i).getText().equals("is")){
                if (indexIS==-1){indexIS = i;}
                else {
                    f.write("------------- Erreur Fonctionnement de bloc -------------\nMultiples \"is\" " +
                            name +
                            ".\n\n");
                }
            }
            if (tree.getChild(i).getText().equals("result")) {
                presenceResultCode = true;
            }
        }

        /*Gestion de la présence d'un is dans le bloc*/
        //Si is, vérification de la présence d'au moins une et uniquement de déclarations de variables
        if (indexIS==0){
            f.write("------------- Erreur Fonctionnement de bloc -------------\nAucune déclaration précédant le \"is\" " +
                    name +".\n\n");
        }

        ArrayList<String> motDecl = new ArrayList<>(Arrays.asList("DECLVARIABLE", ":="));
        for (int i = 0; i < indexIS; i++) {
            if (!motDecl.contains(tree.getChild(i).getText())){
                f.write("------------- Erreur Fonctionnement de bloc -------------\nInstruction précédant le \"is\" " +
                        name +".\n\n");
            }
            else if (tree.getChild(i).getText().equals(":=") && !tree.getChild(i).getChild(0).getText().equals("DECLVARIABLE")){
                f.write("------------- Erreur Fonctionnement de bloc -------------\nInstruction précédant le \"is\" " +
                        name +".\n\n");
            }
        }

        //Si is, vérification de la présence d'au moins une instruction et d'aucune déclaration de variable
        if (indexIS!=-1 && indexIS +1 == tree.getChildCount()){
            f.write("------------- Erreur Fonctionnement de bloc -------------\nAucune instruction suivant le \"is\" " +
                    name +".\n\n");
        }

        for (int i = indexIS + 1; i < tree.getChildCount(); i++) {
            /*Deux cas de figure : une déclaration ou un := suivis d'une déclaration*/
            if (tree.getChild(i).getText().equals("DECLVARIABLE")
                        || tree.getChild(i).getText().equals(":=") && tree.getChild(i).getChild(0).getText().equals("DECLVARIABLE") ) {
                String variableDecl;
                if (tree.getChild(i).getText().equals("DECLVARIABLE")){
                    variableDecl = tree.getChild(i).getChild(0).getText();
                } else {
                    variableDecl = tree.getChild(i).getChild(0).getChild(0).getText();
                }

                String casIs;
                if (indexIS==-1){
                    casIs = "en l'absence du mot-clef";
                } else {
                    casIs = "suivant le mot-clef";
                }
                f.write("------------- Erreur Fonctionnement de bloc -------------\nDéclaration de la variable " + variableDecl + " " + casIs +" \"is\" " +
                        name +".\n\n");
            }
        }


        /*Gestion du result*/
        //Si result apparait dans la tds, mais absence dans le code par défaut de la méthode => erreur
        if (presenceResultTDS && !presenceResultCode && tdsMere.equals(tds)){
            f.write("------------- Erreur Fonctionnement de bloc -------------\nAbsence du mot-clé \"result\" " +
                    name +
                    " avec type de retour non-vide dans le cas défaut.\n\n");
        }
        //Si result n'apparait pas dans la TDS, mais dans le code => erreur
        if (!presenceResultTDS && presenceResultCode){

            if (tdsMere.getTypeTDS().equals("MAIN")){
                f.write("------------- Erreur Fonctionnement de bloc -------------\nPrésence du mot-clé \"result\"" + name +".\n\n");
            } else {
                f.write("------------- Erreur Fonctionnement de bloc -------------\nPrésence du mot-clé \"result\" " +
                        name +
                        " sans type de retour.\n\n");
            }


        }
    }


    public static void analyseOperations(Tree tree, TDS tds, FileWriter f) throws IOException{
        RetourOperation test = operationRecursif(tree, tds, f);
        boolean erreur = test.presenceErreur;
    }

    /** Fonction récursive analyse des noeuds opération, renvoie le type final de l'opération, un booleen true si il y a une erreur et un booleen true si il y a une division**/
    public static RetourOperation operationRecursif(Tree tree, TDS tds, FileWriter f) throws IOException {
        RetourOperation filsGauche;
        RetourOperation filsDroit;
        //cas d'arret
        if (!operation.contains(tree.getText()) && !tree.getText().equals("&") && !tree.getText().equals("/")){
            if (getTypeExpression(tree, tds, f).equals("Integer")){ //si c'est un INT //TODO : changer le getType()
                RetourOperation retour = new RetourOperation("Integer", false);
                return retour;
            }
            else if(getTypeExpression(tree, tds, f).equals("String") || tree.getType() == 35){ //TODO : changer getType
                RetourOperation retour = new RetourOperation("String", false);
                return retour;
            }
            else { //il faut encore gérer les messages
                f.write("------------- Erreur rédaction des opérations -------------\nCe type ne peut pas être utilisé pour les opérations et la concaténation.\n\n");
                return new RetourOperation("erreur", false);
            }
        }
        else {
            switch (tree.getChildCount()){ //gestion des nombres négatifs dans les opéartions
                case 2: //mes 2 feuilles ne sont pas des nb negatifs
                    filsGauche = operationRecursif(tree.getChild(0), tds, f);
                    filsDroit = operationRecursif(tree.getChild(1), tds, f);
                    if (operation.contains(tree.getText())){
                        if(!filsGauche.type.equals("Integer")){
                            f.write("------------- Erreur Typage sur les opérations -------------\nLe membre gauche de l'opération " +tree.getText()+ " doit être de type Int.\n\n");
                        }
                        if(!filsDroit.type.equals("Integer")){
                            f.write("------------- Erreur Typage sur les opérations -------------\nLe membre droit de l'opération " +tree.getText()+ " doit être de type Int.\n\n");
                        }
                        return new RetourOperation("Integer", false);
                    }
                    else if (tree.getText().equals("/")){
                        if(!filsGauche.type.equals("Integer")){
                            f.write("------------- Erreur Typage sur les opérations -------------\nLe membre gauche de l'opération " +tree.getText()+ " doit être de type Int.\n\n");
                        }
                        if(!filsDroit.type.equals("Integer")){
                            f.write("------------- Erreur Typage sur les opérations -------------\nLe membre droit de l'opération " +tree.getText()+ " doit être de type Int.\n\n");
                        }
                        if(tree.getChild(1).getText().equals("0")){
                            f.write("------------- Erreur Division par 0 -------------\nIl est impossible d'effectuer une division par 0.\n\n");
                        }
                        return new RetourOperation("Integer", false);
                    }
                    else if (tree.getText().equals("&")){
                        if(!filsGauche.type.equals("String")){
                            f.write("------------- Erreur Typage sur les opérations -------------\nLe membre gauche de l'opération "+tree.getText()+ " doit être de type String.\n\n");
                        }
                        if(!filsDroit.type.equals("String")){
                            f.write("------------- Erreur Typage sur les opérations -------------\nLe membre droit de l'opération " +tree.getText() +" doit être de type String.\n\n");
                        }
                        return new RetourOperation("String", false);
                    }
                    else {
                        return new RetourOperation("", true);
                    }
                case 4: //mes 2 feuilles sont des nb négatifs
                    filsGauche = operationRecursif(tree.getChild(1), tds, f);
                    filsDroit = operationRecursif(tree.getChild(3), tds, f);
                    if (operation.contains(tree.getText())){
                        if(!filsGauche.type.equals("Integer")){
                            f.write("------------- Erreur Typage sur les opérations -------------\nLe membre gauche de l'opération " + tree.getText() +" doit être de type Int.\n\n");
                        }
                        if(!filsDroit.type.equals("Integer")){
                            f.write("------------- Erreur Typage sur les opérations -------------\nLe membre gauche de l'opération " + tree.getText() +" doit être de type Int.\n\n");
                        }
                        return new RetourOperation("Integer", false);
                    }
                    else if (tree.getText().equals("/")){
                        if(!filsGauche.type.equals("Integer")){
                            f.write("------------- Erreur Typage sur les opérations -------------\nLe membre gauche de l'opération" + tree.getText()+ " doit être de type Int.\n\n");
                        }
                        if(!filsDroit.type.equals("Integer")){
                            f.write("------------- Erreur Typage sur les opérations -------------\nLe membre droit de l'opération " + tree.getText() +" doit être de type Int.\n\n");
                        }
                        if(tree.getChild(1).getText().equals("0")){
                            f.write("------------- Erreur Division par 0 -------------\nIl est impossible d'effectuer une division par 0.\n\n");
                        }
                        return new RetourOperation("Integer", false);
                    }
                    else if (tree.getText().equals("&")){
                        if(!filsGauche.type.equals("String")){
                            f.write("------------- Erreur Typage sur les opérations -------------\nLe membre gauche de l'opération " +tree.getText() +" doit être de type String.\n\n");
                        }
                        if(!filsDroit.type.equals("String")){
                            f.write("------------- Erreur Typage sur les opérations -------------\nLe membre droit de l'opération " +tree.getText() +" doit être de type String.\n\n");
                        }
                        return new RetourOperation("String", false);
                    }
                    else {
                        return new RetourOperation("", true);
                    }
                case 3: //j'ai un nombre négatif
                    if (tree.getChild(0).getText().equals("-")){ //le nombre négatif est le premier noeud
                        filsGauche = operationRecursif(tree.getChild(1), tds, f);
                        filsDroit = operationRecursif(tree.getChild(2), tds, f);
                    } else {
                        filsGauche = operationRecursif(tree.getChild(0), tds, f);
                        filsDroit = operationRecursif(tree.getChild(2), tds, f);
                    }
                    if (operation.contains(tree.getText())){
                        if(!filsGauche.type.equals("Integer")){
                            f.write("------------- Erreur Typage sur les opérations -------------\nLe membre gauche de l'opération " +tree.getText() +" doit être de type Int.\n\n");
                        }
                        if(!filsDroit.type.equals("Integer")){
                            f.write("------------- Erreur Typage sur les opérations -------------\nLe membre droit de l'opération " +tree.getText() +" doit être de type Int.\n\n");
                        }
                        return new RetourOperation("Integer", false);
                    }
                    else if (tree.getText().equals("/")){
                        if(!filsGauche.type.equals("Integer")){
                            f.write("------------- Erreur Typage sur les opérations -------------\nLe membre gauche de l'opération " +tree.getText() +" doit être de type Int.\n\n");
                        }
                        if(!filsDroit.type.equals("Integer")){
                            f.write("------------- Erreur Typage sur les opérations -------------\nLe membre droit de l'opération " +tree.getText() +" doit être de type Int.\n\n");
                        }
                        if(tree.getChild(1).getText().equals("0")){
                            f.write("------------- Erreur Division par 0 -------------\nIl est impossible d'effectuer une division par 0.\n\n");
                        }
                        return new RetourOperation("Integer", false);
                    }
                    else if (tree.getText().equals("&")){
                        if(!filsGauche.type.equals("String")){
                            f.write("------------- Erreur Typage sur les opérations -------------\nLe membre gauche de l'opération " +tree.getText() +" doit être de type String.\n\n");
                        }
                        if(!filsDroit.type.equals("String")){
                            f.write("------------- Erreur Typage sur les opérations -------------\nLe membre droit de l'opération " +tree.getText() +" doit être de type String.\n\n");
                        }
                        return new RetourOperation("String", false);

                    }
                    else {
                        return new RetourOperation("", true);
                    }
                default:
                    f.write("------------- Erreur rédaction des opérations -------------\nLes opérations ne prennent pas plus de deux opérandes.\n\n");
                    return new RetourOperation("", true);

            }
        }
    }
}

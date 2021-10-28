
import TDS.TDS;
import bloodReset.bloodResetLexer;
import bloodReset.bloodResetParser;
import generationCode.CodeAssembleur;
import generationCode.DescripteurClasse;
import generationCode.ParcoursGenerationCode;
import org.antlr.runtime.tree.*;
import java.io.*;
import org.antlr.runtime.*;
import semantique.Parcours;


public class Main {
    public static void main(String[] args) throws Exception {


        String path ="tests/generationTests/soutenance/testFinal_tripletPythagore.b";


        File file = new File(path); // Car Intellij considère qu'on est à la racine du projet

        FileInputStream stream = new FileInputStream(file);

        ANTLRInputStream input = new ANTLRInputStream(stream);
        bloodResetLexer lexer = new bloodResetLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        bloodResetParser parser = new bloodResetParser(tokens);
        Tree tree = (Tree) parser.prog().getTree();                         //On récupère l'AST depuis antlr

        //Parcourir l'arbre --> en lui donnant une instance vide de TDS
        TDS tds = new TDS();                                                // on crée la première TDS
        tds.setName("Tds Initiale");
        //System.out.println(tree.toStringTree());

        //----------------------------------- TYPE / CLASSE -----------------------------------//

        TDS tdsString = new TDS(tds, "CLASSE", "String");
        tds.addElement(true, "String", "", tdsString.getNumRegion());
        tds.addChild(tdsString);

        TDS tdsInteger = new TDS(tds, "CLASSE", "Integer");
        tds.addElement(true, "Integer", "", tdsInteger.getNumRegion());
        tds.addChild(tdsInteger);

        TDS tdsPrintln = new TDS(tds, "METHODE", "println");
        tdsString.addChild(tdsPrintln);
        TDS tdsPrint = new TDS(tds, "METHODE", "print");
        tdsString.addChild(tdsPrint);
        TDS tdsToString = new TDS(tds, "METHODE", "toString");
        tdsInteger.addChild(tdsToString);

        tds.getListFils().get(0).addElement(false, false, "", "println", tdsPrintln.getNumRegion());
        tds.getListFils().get(0).addElement(false, false, "", "print", tdsPrint.getNumRegion());
        tds.getListFils().get(1).addElement(false, false, "", "toString", tdsToString.getNumRegion());

        TDS tdsStatic = new TDS(tds, "STATIC", "static");
        tds.addChild(tdsStatic);

        tdsString.getDescripteur().setTailleObj(2);
        tdsInteger.getDescripteur().setTailleObj(2);

        //tds.getDescripteur();     //juste pour vous montrer
        //---------------------------------------- FIN -----------------------------------------//

        FileWriter erreurSemantiques = new FileWriter("out/generated.src");         // fichier généré pour les erreurs sémantiques
        FileWriter generationCode = new FileWriter("out/generatedCode.asm");        //fichier généré pour le code
        int nbChild = tree.getChildCount();                                 // calcul du nombre d'enfant en-dessous du ROOT

        Parcours parcours = new Parcours();                                 // On crée une instance de semantique.Parcours
        parcours.parcoursTree(tree, tds, erreurSemantiques, nbChild);                       // On parcours l'arbre


        //tds.afficherToutesTDS();

        //On vérifie qu'il n'y a pas d'erreur sémantique avant de faire la génération de code
        FileInputStream fis = new FileInputStream("out/generated.src");
        int b = fis.read();
        if (b == -1) {
            ParcoursGenerationCode parcoursGenerationCode = new ParcoursGenerationCode();

            CodeAssembleur.initialisationCodeAssembleur(tds, generationCode);
            parcoursGenerationCode.parcoursTree(tree, tds, generationCode, nbChild); // il faudra mettre un autre f correspondant au nouveau FileWriter
            CodeAssembleur.sortie(generationCode);

            generationCode.close();
        } else {
            System.out.println("\n------------------ SEMANTIC(S) ERRORS(S) ------------------\nThere is some syntaxic errors, please check the \"generated.src\" file\n");
        }

        erreurSemantiques.close();

        //new semantique.Parcours().parcoursProfondeur(tree);
        /* commandes utiles : tree.getChild(numéro du fils)
        .getChildCount() -> nombre d'enfants
        * .toStringTree() -> affiche tout l'arbre suivant le noeud où on se situe
        * */
    }
}

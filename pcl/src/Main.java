
import TDS.TDS;
import org.antlr.runtime.tree.*;
import java.io.*;
import org.antlr.runtime.*;

public class Main {
    public static void main(String[] args) throws Exception{


        String path ="tests/testTdsAnalyseSemantique.b";



        File file = new File(path); // Car Intellij considère qu'on est à la racine du projet

        FileInputStream stream = new FileInputStream(file);

        ANTLRInputStream input = new ANTLRInputStream(stream);
        bloodResetLexer lexer = new bloodResetLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        bloodResetParser parser = new bloodResetParser(tokens);
        Tree tree = (Tree) parser.prog().getTree();                         //On récupère l'AST depuis antlr

        //Parcourir l'arbre --> en lui donnant une instance vide de TDS

        TDS tds = new TDS();                                                // on crée la première TDS

        //----------------------------------- TYPE / CLASSE -----------------------------------//

        TDS tdsString = new TDS(tds, "CLASSE", "String");
        tds.addElement(true, "String", "", tdsString.getNumRegion());
        tds.addChild(tdsString);

        TDS tdsInteger = new TDS(tds, "CLASSE", "Integer");
        tds.addElement(true, "Integer", "", tdsInteger.getNumRegion());
        tds.addChild(tdsInteger);

        tds.getListFils().get(0).addElement(false, false, "", "println", 3);
        tds.getListFils().get(0).addElement(false, false, "", "print", 4);
        tds.getListFils().get(1).addElement(false, false, "", "toString", 5);

        //---------------------------------------- FIN -----------------------------------------//

        FileWriter f = new FileWriter("out/generated.src");         // fichier généré
        int nbChild = tree.getChildCount();                                 // calcul du nombre d'enfant en-dessous du ROOT

        Parcours parcours = new Parcours();                                 // On crée une instance de Parcours
        parcours.parcoursTree(tree, tds, f, nbChild);                       // On parcours l'arbre


        System.out.println(tree.toStringTree());
        tds.afficherToutesTDS();

        f.close();

        //new Parcours().parcoursProfondeur(tree);
        /* commandes utiles : tree.getChild(numéro du fils)
        .getChildCount() -> nombre d'enfants
        * .toStringTree() -> affiche tout l'arbre suivant le noeud où on se situe
        * */
    }
}

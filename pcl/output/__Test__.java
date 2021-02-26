import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        bloodResetLexer lex = new bloodResetLexer(new ANTLRFileStream("/home/delaporte/Documents/Compil/pcl-2020_2021/tests/testEnvoie", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        bloodResetParser g = new bloodResetParser(tokens, 49100, null);
        try {
            g.prog();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}
package gen;


import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

/**
 * Created by pedronakibar on 12/03/15.
 */
public class MyLang {
    public static void main(String[] args) throws IOException, IOException {
        String fileName = args[0];
        ANTLRFileStream input = new ANTLRFileStream(fileName);
        MyLangLexer lexer = new MyLangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MyLangParser parser = new MyLangParser(tokens);
        MyLangParser.ExprContext ctx = parser.expr();
        //System.out.printf(">>> %s\n", ctx.result);
    }
}

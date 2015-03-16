package gen;


import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import sun.misc.OSEnvironment;

import java.io.IOException;

/**
 * Created by pedronakibar on 12/03/15.
 */
public class Grafik {
    public static void main(String[] args) throws IOException {
        if (args.length == 0){
            System.out.println(">>> Nenhum arquivo de entrada!");
            return;
        }

        String fileName = args[0];


        ANTLRFileStream input = new ANTLRFileStream(fileName);

        MyLangLexer lexer = new MyLangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MyLangParser parser = new MyLangParser(tokens);
        MyLangParser.ExprContext ctx = parser.expr();
        if (ctx.filename.contains("window")){
            System.out.println(">>> Janela gerada!");
        }
        else{
            System.out.println(">>> Arquivo gerado em: " + System.getProperty("user.dir") + "/" + ctx.filename);
        }
    }
}

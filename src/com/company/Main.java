package com.company;

import gen.grammar.myGrammarLexer;
import gen.grammar.myGrammarParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String result;
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        myGrammarLexer lexer = new myGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        myGrammarParser parser = new myGrammarParser(tokens);
        myGrammarParser.ProgContext ctx = parser.prog();
        if (ctx.exception != null) {
            System.out.println("Erro...");
        }
        else {
            System.out.println("OK!");
        }
        result = ctx.result.eval();
        System.out.printf("LINGUAGEM =>\n%s\n", result);

        File arquivo = new File("./ino/ino.ino");
        try {
            if (!arquivo.exists()) {
                arquivo.createNewFile();
            }
            else {
                arquivo.delete();
                arquivo.createNewFile();
            }
            //escreve no arquivo
            FileWriter fw = new FileWriter(arquivo, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(result);
            bw.newLine();
            bw.close();
            fw.close();
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

package com.company;

import gen.grammar.myGrammarLexer;
import gen.grammar.myGrammarParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
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
        System.out.printf("LINGUAGEM =>\n%s\n", ctx.result.eval());

    }
}

// Generated from C:/Users/joãocarlos/IdeaProjects/TrabLFA/src/grammar\myGrammar.g4 by ANTLR 4.5.1
package gen.grammar;

import com.company.data.*;

import gen.grammar.myGrammarParser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link myGrammarParser}.
 */
public interface myGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(myGrammarParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(myGrammarParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(myGrammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(myGrammarParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#logica}.
	 * @param ctx the parse tree
	 */
	void enterLogica(myGrammarParser.LogicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#logica}.
	 * @param ctx the parse tree
	 */
	void exitLogica(myGrammarParser.LogicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#condicao}.
	 * @param ctx the parse tree
	 */
	void enterCondicao(myGrammarParser.CondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#condicao}.
	 * @param ctx the parse tree
	 */
	void exitCondicao(myGrammarParser.CondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#laco}.
	 * @param ctx the parse tree
	 */
	void enterLaco(myGrammarParser.LacoContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#laco}.
	 * @param ctx the parse tree
	 */
	void exitLaco(myGrammarParser.LacoContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#verificacao}.
	 * @param ctx the parse tree
	 */
	void enterVerificacao(myGrammarParser.VerificacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#verificacao}.
	 * @param ctx the parse tree
	 */
	void exitVerificacao(myGrammarParser.VerificacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(myGrammarParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(myGrammarParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#negacao}.
	 * @param ctx the parse tree
	 */
	void enterNegacao(myGrammarParser.NegacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#negacao}.
	 * @param ctx the parse tree
	 */
	void exitNegacao(myGrammarParser.NegacaoContext ctx);
}
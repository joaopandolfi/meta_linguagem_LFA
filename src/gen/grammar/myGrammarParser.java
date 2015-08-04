// Generated from C:/Users/joãocarlos/IdeaProjects/TrabLFA/src/grammar\myGrammar.g4 by ANTLR 4.5.1
package gen.grammar;

import com.company.data.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class myGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, WS=43, NUM=44, NUMERO=45, NULL=46;
	public static final int
		RULE_init = 0, RULE_prog = 1, RULE_logica = 2, RULE_condicao = 3, RULE_laco = 4, 
		RULE_verificacao = 5, RULE_comando = 6, RULE_negacao = 7;
	public static final String[] ruleNames = {
		"init", "prog", "logica", "condicao", "laco", "verificacao", "comando", 
		"negacao"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'INICIAR'", "'FIM_DO_PROGRAMA'", "'SE_('", "')_FOR_VERDADE:'", 
		"'FIM_DO_SE'", "')_FOR_FALSO:'", "'SENAO:'", "'FIM_DO_SENAO'", "'ENQUANTO_('", 
		"'FIM_DO_ENQUANTO'", "'REPITA_('", "')_VEZES:'", "'FIM_DO_REPITA'", "'NAO_EXISTE_NADA_A_FRENTE'", 
		"'EXISTE_OBJETO_A_DIREITA'", "'EXISTE_OBJETO_A_ESQUERDA'", "'SENSOR_LINHA_DIREITA_RECONHECEU'", 
		"'SENSOR_LINHA_MEIO_RECONHECEU'", "'SENSOR_LINHA_ESQUERDA_RECONHECEU'", 
		"'AGARROU_OBJETO'", "'ESTA_PARADO'", "'ESTA_ANDANDO'", "'CHEGOU_NO_OBJETIVO'", 
		"'VERDADEIRO'", "'FALSO'", "'VIRAR_PARA_DIREITA'", "'VIRAR_PARA_ESQUERDA'", 
		"'ANDAR_PARA_FRENTE'", "'PARAR'", "'ANDAR_PARA_FRENTE_POR_('", "')_SEGUNDOS'", 
		"'ABRIR_GARRA'", "'ABRIR_GARRA_('", "')_GRAUS'", "'FECHAR_GARRA'", "'LIGAR_MOTOR_DIREITA'", 
		"'LIGAR_MOTOR_ESQUERDA'", "'DESLIGAR_MOTOR_ESQUERDA'", "'DESLIGAR_MOTOR_DIREITA'", 
		"'NAO_'", "'E_FALSO_QUE'", "'O_CONTRARIO_DE_'", null, null, null, "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "WS", "NUM", "NUMERO", "NULL"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "myGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public myGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
		public Code result;
		public ProgContext p;
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			((InitContext)_localctx).p = prog();
			((InitContext)_localctx).result =  ((InitContext)_localctx).p.result;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgContext extends ParserRuleContext {
		public Code result;
		public LogicaContext b;
		public LogicaContext logica() {
			return getRuleContext(LogicaContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(T__0);
			setState(20);
			((ProgContext)_localctx).b = logica(0);
			setState(21);
			match(T__1);
			 ((ProgContext)_localctx).result =  Body.mkBody(((ProgContext)_localctx).b.result);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicaContext extends ParserRuleContext {
		public Code result;
		public LogicaContext t1;
		public CondicaoContext cd;
		public LacoContext l;
		public ComandoContext co;
		public LogicaContext t2;
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public LacoContext laco() {
			return getRuleContext(LacoContext.class,0);
		}
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public List<LogicaContext> logica() {
			return getRuleContexts(LogicaContext.class);
		}
		public LogicaContext logica(int i) {
			return getRuleContext(LogicaContext.class,i);
		}
		public LogicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterLogica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitLogica(this);
		}
	}

	public final LogicaContext logica() throws RecognitionException {
		return logica(0);
	}

	private LogicaContext logica(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicaContext _localctx = new LogicaContext(_ctx, _parentState);
		LogicaContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_logica, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			switch (_input.LA(1)) {
			case T__2:
			case T__6:
				{
				setState(25);
				((LogicaContext)_localctx).cd = condicao();
				((LogicaContext)_localctx).result =  ((LogicaContext)_localctx).cd.result;
				}
				break;
			case T__8:
			case T__10:
				{
				setState(28);
				((LogicaContext)_localctx).l = laco();
				((LogicaContext)_localctx).result =  ((LogicaContext)_localctx).l.result;
				}
				break;
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__31:
			case T__32:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
				{
				setState(31);
				((LogicaContext)_localctx).co = comando();
				((LogicaContext)_localctx).result =  ((LogicaContext)_localctx).co.result;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(42);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicaContext(_parentctx, _parentState);
					_localctx.t1 = _prevctx;
					_localctx.t1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_logica);
					setState(36);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(37);
					((LogicaContext)_localctx).t2 = logica(2);
					((LogicaContext)_localctx).result =  Logica.concatLogica(((LogicaContext)_localctx).t1.result,((LogicaContext)_localctx).t2.result);
					}
					} 
				}
				setState(44);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CondicaoContext extends ParserRuleContext {
		public Code result;
		public VerificacaoContext v0;
		public LogicaContext l0;
		public VerificacaoContext v1;
		public LogicaContext l1;
		public LogicaContext l2;
		public VerificacaoContext verificacao() {
			return getRuleContext(VerificacaoContext.class,0);
		}
		public LogicaContext logica() {
			return getRuleContext(LogicaContext.class,0);
		}
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterCondicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitCondicao(this);
		}
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_condicao);
		try {
			setState(64);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				match(T__2);
				setState(46);
				((CondicaoContext)_localctx).v0 = verificacao();
				setState(47);
				match(T__3);
				setState(48);
				((CondicaoContext)_localctx).l0 = logica(0);
				setState(49);
				match(T__4);
				((CondicaoContext)_localctx).result =  Condicao.mkCondicao(0,((CondicaoContext)_localctx).v0.result,((CondicaoContext)_localctx).l0.result);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				match(T__2);
				setState(53);
				((CondicaoContext)_localctx).v1 = verificacao();
				setState(54);
				match(T__5);
				setState(55);
				((CondicaoContext)_localctx).l1 = logica(0);
				setState(56);
				match(T__4);
				((CondicaoContext)_localctx).result =  Condicao.mkCondicao(1,((CondicaoContext)_localctx).v1.result,((CondicaoContext)_localctx).l1.result);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				match(T__6);
				setState(60);
				((CondicaoContext)_localctx).l2 = logica(0);
				setState(61);
				match(T__7);
				((CondicaoContext)_localctx).result =  Condicao.mkCondicao(((CondicaoContext)_localctx).l2.result);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LacoContext extends ParserRuleContext {
		public Code result;
		public VerificacaoContext v;
		public LogicaContext l0;
		public Token NUMERO;
		public LogicaContext l1;
		public VerificacaoContext verificacao() {
			return getRuleContext(VerificacaoContext.class,0);
		}
		public LogicaContext logica() {
			return getRuleContext(LogicaContext.class,0);
		}
		public TerminalNode NUMERO() { return getToken(myGrammarParser.NUMERO, 0); }
		public LacoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_laco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterLaco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitLaco(this);
		}
	}

	public final LacoContext laco() throws RecognitionException {
		LacoContext _localctx = new LacoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_laco);
		try {
			setState(80);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(T__8);
				setState(67);
				((LacoContext)_localctx).v = verificacao();
				setState(68);
				match(T__3);
				setState(69);
				((LacoContext)_localctx).l0 = logica(0);
				setState(70);
				match(T__9);
				((LacoContext)_localctx).result =  Laco.mkEnquanto(((LacoContext)_localctx).v.result,((LacoContext)_localctx).l0.result);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(T__10);
				setState(74);
				((LacoContext)_localctx).NUMERO = match(NUMERO);
				setState(75);
				match(T__11);
				setState(76);
				((LacoContext)_localctx).l1 = logica(0);
				setState(77);
				match(T__12);
				((LacoContext)_localctx).result =  Laco.mkFor((((LacoContext)_localctx).NUMERO!=null?((LacoContext)_localctx).NUMERO.getText():null),((LacoContext)_localctx).l1.result);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VerificacaoContext extends ParserRuleContext {
		public Code result;
		public VerificacaoContext v;
		public NegacaoContext negacao() {
			return getRuleContext(NegacaoContext.class,0);
		}
		public VerificacaoContext verificacao() {
			return getRuleContext(VerificacaoContext.class,0);
		}
		public VerificacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verificacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterVerificacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitVerificacao(this);
		}
	}

	public final VerificacaoContext verificacao() throws RecognitionException {
		VerificacaoContext _localctx = new VerificacaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_verificacao);
		try {
			setState(110);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(T__13);
				((VerificacaoContext)_localctx).result =  Verificacao.mkVerif("NAO_EXISTE_NADA_A_FRENTE");
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(T__14);
				((VerificacaoContext)_localctx).result =  Verificacao.mkVerif("EXISTE_OBJETO_A_DIREITA");
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				match(T__15);
				((VerificacaoContext)_localctx).result =  Verificacao.mkVerif("EXISTE_OBJETO_A_ESQUERDA");
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				match(T__16);
				((VerificacaoContext)_localctx).result =  Verificacao.mkVerif("SENSOR_LINHA_DIREITA_RECONHECEU");
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 5);
				{
				setState(90);
				match(T__17);
				((VerificacaoContext)_localctx).result =  Verificacao.mkVerif("SENSOR_LINHA_MEIO_RECONHECEU");
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 6);
				{
				setState(92);
				match(T__18);
				((VerificacaoContext)_localctx).result =  Verificacao.mkVerif("SENSOR_LINHA_ESQUERDA_RECONHECEU");
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 7);
				{
				setState(94);
				match(T__19);
				((VerificacaoContext)_localctx).result =  Verificacao.mkVerif("AGARROU_OBJETO");
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 8);
				{
				setState(96);
				match(T__20);
				((VerificacaoContext)_localctx).result =  Verificacao.mkVerif("ESTA_PARADO");
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 9);
				{
				setState(98);
				match(T__21);
				((VerificacaoContext)_localctx).result =  Verificacao.mkVerif("ESTA_ANDANDO");
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 10);
				{
				setState(100);
				match(T__22);
				((VerificacaoContext)_localctx).result =  Verificacao.mkVerif("CHEGOU_NO_OBJETIVO");
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 11);
				{
				setState(102);
				match(T__23);
				((VerificacaoContext)_localctx).result =  Verificacao.mkVerif("VERDADEIRO");
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 12);
				{
				setState(104);
				match(T__24);
				((VerificacaoContext)_localctx).result =  Verificacao.mkVerif("FALSO");
				}
				break;
			case T__39:
			case T__40:
			case T__41:
				enterOuterAlt(_localctx, 13);
				{
				setState(106);
				negacao();
				setState(107);
				((VerificacaoContext)_localctx).v = verificacao();
				((VerificacaoContext)_localctx).result =  Verificacao.mkNotVerif(((VerificacaoContext)_localctx).v.result);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandoContext extends ParserRuleContext {
		public Code result;
		public Token NUMERO;
		public TerminalNode NUMERO() { return getToken(myGrammarParser.NUMERO, 0); }
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comando);
		try {
			setState(140);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(T__25);
				((ComandoContext)_localctx).result =  Comando.mkComando("VIRAR_PARA_DIREITA");
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(T__26);
				((ComandoContext)_localctx).result =  Comando.mkComando("VIRAR_PARA_ESQUERDA");
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				match(T__27);
				((ComandoContext)_localctx).result =  Comando.mkComando("ANDAR_PARA_FRENTE");
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
				match(T__28);
				((ComandoContext)_localctx).result =  Comando.mkComando("PARAR");
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 5);
				{
				setState(120);
				match(T__29);
				setState(121);
				((ComandoContext)_localctx).NUMERO = match(NUMERO);
				setState(122);
				match(T__30);
				((ComandoContext)_localctx).result =  Comando.mkComandoParam((((ComandoContext)_localctx).NUMERO!=null?((ComandoContext)_localctx).NUMERO.getText():null),0);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 6);
				{
				setState(124);
				match(T__31);
				((ComandoContext)_localctx).result =  Comando.mkComando("ABRIR_GARRA");
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 7);
				{
				setState(126);
				match(T__32);
				setState(127);
				((ComandoContext)_localctx).NUMERO = match(NUMERO);
				setState(128);
				match(T__33);
				((ComandoContext)_localctx).result =  Comando.mkComandoParam((((ComandoContext)_localctx).NUMERO!=null?((ComandoContext)_localctx).NUMERO.getText():null),1);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 8);
				{
				setState(130);
				match(T__34);
				((ComandoContext)_localctx).result =  Comando.mkComando("FECHAR_GARRA");
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 9);
				{
				setState(132);
				match(T__35);
				((ComandoContext)_localctx).result =  Comando.mkComando("LIGAR_MOTOR_DIREITA");
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 10);
				{
				setState(134);
				match(T__36);
				((ComandoContext)_localctx).result =  Comando.mkComando("LIGAR_MOTOR_ESQUERDA");
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 11);
				{
				setState(136);
				match(T__37);
				((ComandoContext)_localctx).result =  Comando.mkComando("DESLIGAR_MOTOR_ESQUERDA");
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 12);
				{
				setState(138);
				match(T__38);
				((ComandoContext)_localctx).result =  Comando.mkComando("DESLIGAR_MOTOR_DIREITA");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NegacaoContext extends ParserRuleContext {
		public NegacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterNegacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitNegacao(this);
		}
	}

	public final NegacaoContext negacao() throws RecognitionException {
		NegacaoContext _localctx = new NegacaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_negacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__40) | (1L << T__41))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return logica_sempred((LogicaContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logica_sempred(LogicaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\60\u0093\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4%\n\4\3"+
		"\4\3\4\3\4\3\4\7\4+\n\4\f\4\16\4.\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5C\n\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6S\n\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7q\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u008f\n\b\3\t\3\t\3\t\2\3\6\n\2\4\6\b\n\f\16\20\2\3\3\2*,\u00a7"+
		"\2\22\3\2\2\2\4\25\3\2\2\2\6$\3\2\2\2\bB\3\2\2\2\nR\3\2\2\2\fp\3\2\2\2"+
		"\16\u008e\3\2\2\2\20\u0090\3\2\2\2\22\23\5\4\3\2\23\24\b\2\1\2\24\3\3"+
		"\2\2\2\25\26\7\3\2\2\26\27\5\6\4\2\27\30\7\4\2\2\30\31\b\3\1\2\31\5\3"+
		"\2\2\2\32\33\b\4\1\2\33\34\5\b\5\2\34\35\b\4\1\2\35%\3\2\2\2\36\37\5\n"+
		"\6\2\37 \b\4\1\2 %\3\2\2\2!\"\5\16\b\2\"#\b\4\1\2#%\3\2\2\2$\32\3\2\2"+
		"\2$\36\3\2\2\2$!\3\2\2\2%,\3\2\2\2&\'\f\3\2\2\'(\5\6\4\4()\b\4\1\2)+\3"+
		"\2\2\2*&\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\7\3\2\2\2.,\3\2\2\2/\60"+
		"\7\5\2\2\60\61\5\f\7\2\61\62\7\6\2\2\62\63\5\6\4\2\63\64\7\7\2\2\64\65"+
		"\b\5\1\2\65C\3\2\2\2\66\67\7\5\2\2\678\5\f\7\289\7\b\2\29:\5\6\4\2:;\7"+
		"\7\2\2;<\b\5\1\2<C\3\2\2\2=>\7\t\2\2>?\5\6\4\2?@\7\n\2\2@A\b\5\1\2AC\3"+
		"\2\2\2B/\3\2\2\2B\66\3\2\2\2B=\3\2\2\2C\t\3\2\2\2DE\7\13\2\2EF\5\f\7\2"+
		"FG\7\6\2\2GH\5\6\4\2HI\7\f\2\2IJ\b\6\1\2JS\3\2\2\2KL\7\r\2\2LM\7/\2\2"+
		"MN\7\16\2\2NO\5\6\4\2OP\7\17\2\2PQ\b\6\1\2QS\3\2\2\2RD\3\2\2\2RK\3\2\2"+
		"\2S\13\3\2\2\2TU\7\20\2\2Uq\b\7\1\2VW\7\21\2\2Wq\b\7\1\2XY\7\22\2\2Yq"+
		"\b\7\1\2Z[\7\23\2\2[q\b\7\1\2\\]\7\24\2\2]q\b\7\1\2^_\7\25\2\2_q\b\7\1"+
		"\2`a\7\26\2\2aq\b\7\1\2bc\7\27\2\2cq\b\7\1\2de\7\30\2\2eq\b\7\1\2fg\7"+
		"\31\2\2gq\b\7\1\2hi\7\32\2\2iq\b\7\1\2jk\7\33\2\2kq\b\7\1\2lm\5\20\t\2"+
		"mn\5\f\7\2no\b\7\1\2oq\3\2\2\2pT\3\2\2\2pV\3\2\2\2pX\3\2\2\2pZ\3\2\2\2"+
		"p\\\3\2\2\2p^\3\2\2\2p`\3\2\2\2pb\3\2\2\2pd\3\2\2\2pf\3\2\2\2ph\3\2\2"+
		"\2pj\3\2\2\2pl\3\2\2\2q\r\3\2\2\2rs\7\34\2\2s\u008f\b\b\1\2tu\7\35\2\2"+
		"u\u008f\b\b\1\2vw\7\36\2\2w\u008f\b\b\1\2xy\7\37\2\2y\u008f\b\b\1\2z{"+
		"\7 \2\2{|\7/\2\2|}\7!\2\2}\u008f\b\b\1\2~\177\7\"\2\2\177\u008f\b\b\1"+
		"\2\u0080\u0081\7#\2\2\u0081\u0082\7/\2\2\u0082\u0083\7$\2\2\u0083\u008f"+
		"\b\b\1\2\u0084\u0085\7%\2\2\u0085\u008f\b\b\1\2\u0086\u0087\7&\2\2\u0087"+
		"\u008f\b\b\1\2\u0088\u0089\7\'\2\2\u0089\u008f\b\b\1\2\u008a\u008b\7("+
		"\2\2\u008b\u008f\b\b\1\2\u008c\u008d\7)\2\2\u008d\u008f\b\b\1\2\u008e"+
		"r\3\2\2\2\u008et\3\2\2\2\u008ev\3\2\2\2\u008ex\3\2\2\2\u008ez\3\2\2\2"+
		"\u008e~\3\2\2\2\u008e\u0080\3\2\2\2\u008e\u0084\3\2\2\2\u008e\u0086\3"+
		"\2\2\2\u008e\u0088\3\2\2\2\u008e\u008a\3\2\2\2\u008e\u008c\3\2\2\2\u008f"+
		"\17\3\2\2\2\u0090\u0091\t\2\2\2\u0091\21\3\2\2\2\b$,BRp\u008e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
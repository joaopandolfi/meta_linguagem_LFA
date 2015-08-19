// Generated from C:/Users/joãocarlos/IdeaProjects/TrabLFA/src/grammar\myGrammar.g4 by ANTLR 4.5.1
package gen.grammar;

import com.company.data.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, WS=49, NUM=50, NUMERO=51, NULL=52;
	public static final int
		RULE_init = 0, RULE_prog = 1, RULE_logica = 2, RULE_condicao = 3, RULE_laco = 4, 
		RULE_verificacao = 5, RULE_comando = 6, RULE_operadorE = 7, RULE_operadorOU = 8, 
		RULE_negacao = 9;
	public static final String[] ruleNames = {
		"init", "prog", "logica", "condicao", "laco", "verificacao", "comando", 
		"operadorE", "operadorOU", "negacao"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'INICIAR'", "'FIM_DO_PROGRAMA'", "'SE_('", "')_FOR_VERDADE:'", 
		"'FIM_DO_SE'", "')_FOR_FALSO:'", "'SENAO:'", "'FIM_DO_SENAO'", "'ENQUANTO_('", 
		"'FIM_DO_ENQUANTO'", "'REPITA_('", "')_VEZES:'", "'FIM_DO_REPITA'", "'EXISTE_OBJETO_A_FRENTE'", 
		"'EXISTE_OBJETO_A_DIREITA'", "'EXISTE_OBJETO_A_ESQUERDA'", "'SENSOR_LINHA_DIREITA_RECONHECEU'", 
		"'SENSOR_LINHA_MEIO_RECONHECEU'", "'SENSOR_LINHA_ESQUERDA_RECONHECEU'", 
		"'AGARROU_OBJETO'", "'ESTA_PARADO'", "'ESTA_ANDANDO'", "'CHEGOU_NO_OBJETIVO'", 
		"'VERDADEIRO'", "'FALSO'", "'VIRAR_PARA_DIREITA'", "'VIRAR_PARA_ESQUERDA'", 
		"'ANDAR_PARA_FRENTE'", "'ANDAR_PARA_TRAS'", "'PARAR'", "'ANDAR_PARA_FRENTE_POR_('", 
		"')_SEGUNDOS'", "'ABRIR_GARRA'", "'ABRIR_GARRA_('", "')_GRAUS'", "'FECHAR_GARRA'", 
		"'LIGAR_MOTOR_DIREITA'", "'LIGAR_MOTOR_ESQUERDA'", "'DESLIGAR_MOTOR_ESQUERDA'", 
		"'DESLIGAR_MOTOR_DIREITA'", "'_E_'", "'E'", "'_E_TAMBEM_'", "'_OU_'", 
		"'OU'", "'NAO_'", "'E_FALSO_QUE'", "'O_CONTRARIO_DE_'", null, null, null, 
		"' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "WS", "NUM", "NUMERO", "NULL"
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
			setState(20);
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
			setState(23);
			match(T__0);
			setState(24);
			((ProgContext)_localctx).b = logica(0);
			setState(25);
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
			setState(38);
			switch (_input.LA(1)) {
			case T__2:
			case T__6:
				{
				setState(29);
				((LogicaContext)_localctx).cd = condicao();
				((LogicaContext)_localctx).result =  ((LogicaContext)_localctx).cd.result;
				}
				break;
			case T__8:
			case T__10:
				{
				setState(32);
				((LogicaContext)_localctx).l = laco();
				((LogicaContext)_localctx).result =  ((LogicaContext)_localctx).l.result;
				}
				break;
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__32:
			case T__33:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
				{
				setState(35);
				((LogicaContext)_localctx).co = comando();
				((LogicaContext)_localctx).result =  ((LogicaContext)_localctx).co.result;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(46);
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
					setState(40);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(41);
					((LogicaContext)_localctx).t2 = logica(2);
					((LogicaContext)_localctx).result =  Logica.concatLogica(((LogicaContext)_localctx).t1.result,((LogicaContext)_localctx).t2.result);
					}
					} 
				}
				setState(48);
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
			setState(68);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				match(T__2);
				setState(50);
				((CondicaoContext)_localctx).v0 = verificacao(0);
				setState(51);
				match(T__3);
				setState(52);
				((CondicaoContext)_localctx).l0 = logica(0);
				setState(53);
				match(T__4);
				((CondicaoContext)_localctx).result =  Condicao.mkCondicao(0,((CondicaoContext)_localctx).v0.result,((CondicaoContext)_localctx).l0.result);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				match(T__2);
				setState(57);
				((CondicaoContext)_localctx).v1 = verificacao(0);
				setState(58);
				match(T__5);
				setState(59);
				((CondicaoContext)_localctx).l1 = logica(0);
				setState(60);
				match(T__4);
				((CondicaoContext)_localctx).result =  Condicao.mkCondicao(1,((CondicaoContext)_localctx).v1.result,((CondicaoContext)_localctx).l1.result);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				match(T__6);
				setState(64);
				((CondicaoContext)_localctx).l2 = logica(0);
				setState(65);
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
			setState(84);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				match(T__8);
				setState(71);
				((LacoContext)_localctx).v = verificacao(0);
				setState(72);
				match(T__3);
				setState(73);
				((LacoContext)_localctx).l0 = logica(0);
				setState(74);
				match(T__9);
				((LacoContext)_localctx).result =  Laco.mkEnquanto(((LacoContext)_localctx).v.result,((LacoContext)_localctx).l0.result);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(T__10);
				setState(78);
				((LacoContext)_localctx).NUMERO = match(NUMERO);
				setState(79);
				match(T__11);
				setState(80);
				((LacoContext)_localctx).l1 = logica(0);
				setState(81);
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
		public VerificacaoContext v1;
		public VerificacaoContext v;
		public VerificacaoContext v2;
		public NegacaoContext negacao() {
			return getRuleContext(NegacaoContext.class,0);
		}
		public List<VerificacaoContext> verificacao() {
			return getRuleContexts(VerificacaoContext.class);
		}
		public VerificacaoContext verificacao(int i) {
			return getRuleContext(VerificacaoContext.class,i);
		}
		public OperadorEContext operadorE() {
			return getRuleContext(OperadorEContext.class,0);
		}
		public OperadorOUContext operadorOU() {
			return getRuleContext(OperadorOUContext.class,0);
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
		return verificacao(0);
	}

	private VerificacaoContext verificacao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VerificacaoContext _localctx = new VerificacaoContext(_ctx, _parentState);
		VerificacaoContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_verificacao, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			switch (_input.LA(1)) {
			case T__45:
			case T__46:
			case T__47:
				{
				setState(87);
				negacao();
				setState(88);
				((VerificacaoContext)_localctx).v = verificacao(3);
				((VerificacaoContext)_localctx).result =  Verificacao.mkNotVerif(((VerificacaoContext)_localctx).v.result);
				}
				break;
			case T__13:
				{
				setState(91);
				match(T__13);
				((VerificacaoContext)_localctx).result =  Verificacao.mkVerif("EXISTE_OBJETO_A_FRENTE");
				}
				break;
			case T__14:
				{
				setState(93);
				match(T__14);
				((VerificacaoContext)_localctx).result =  Verificacao.mkVerif("EXISTE_OBJETO_A_DIREITA");
				}
				break;
			case T__15:
				{
				setState(95);
				match(T__15);
				((VerificacaoContext)_localctx).result =  Verificacao.mkVerif("EXISTE_OBJETO_A_ESQUERDA");
				}
				break;
			case T__16:
				{
				setState(97);
				match(T__16);
				((VerificacaoContext)_localctx).result =  Verificacao.mkVerif("SENSOR_LINHA_DIREITA_RECONHECEU");
				}
				break;
			case T__17:
				{
				setState(99);
				match(T__17);
				((VerificacaoContext)_localctx).result =  Verificacao.mkVerif("SENSOR_LINHA_MEIO_RECONHECEU");
				}
				break;
			case T__18:
				{
				setState(101);
				match(T__18);
				((VerificacaoContext)_localctx).result =  Verificacao.mkVerif("SENSOR_LINHA_ESQUERDA_RECONHECEU");
				}
				break;
			case T__19:
				{
				setState(103);
				match(T__19);
				((VerificacaoContext)_localctx).result =  Verificacao.mkVerif("AGARROU_OBJETO");
				}
				break;
			case T__20:
				{
				setState(105);
				match(T__20);
				((VerificacaoContext)_localctx).result =  Verificacao.mkVerif("ESTA_PARADO");
				}
				break;
			case T__21:
				{
				setState(107);
				match(T__21);
				((VerificacaoContext)_localctx).result =  Verificacao.mkVerif("ESTA_ANDANDO");
				}
				break;
			case T__22:
				{
				setState(109);
				match(T__22);
				((VerificacaoContext)_localctx).result =  Verificacao.mkVerif("CHEGOU_NO_OBJETIVO");
				}
				break;
			case T__23:
				{
				setState(111);
				match(T__23);
				((VerificacaoContext)_localctx).result =  Verificacao.mkVerif("VERDADEIRO");
				}
				break;
			case T__24:
				{
				setState(113);
				match(T__24);
				((VerificacaoContext)_localctx).result =  Verificacao.mkVerif("FALSO");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(127);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new VerificacaoContext(_parentctx, _parentState);
						_localctx.v1 = _prevctx;
						_localctx.v1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_verificacao);
						setState(117);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(118);
						operadorE();
						setState(119);
						((VerificacaoContext)_localctx).v2 = verificacao(3);
						((VerificacaoContext)_localctx).result =  Verificacao.mkAndVerif(((VerificacaoContext)_localctx).v1.result,((VerificacaoContext)_localctx).v2.result);
						}
						break;
					case 2:
						{
						_localctx = new VerificacaoContext(_parentctx, _parentState);
						_localctx.v1 = _prevctx;
						_localctx.v1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_verificacao);
						setState(122);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(123);
						operadorOU();
						setState(124);
						((VerificacaoContext)_localctx).v2 = verificacao(2);
						((VerificacaoContext)_localctx).result =  Verificacao.mkOrVerif(((VerificacaoContext)_localctx).v1.result,((VerificacaoContext)_localctx).v2.result);
						}
						break;
					}
					} 
				}
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
			setState(162);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(T__25);
				((ComandoContext)_localctx).result =  Comando.mkComando("VIRAR_PARA_DIREITA");
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(T__26);
				((ComandoContext)_localctx).result =  Comando.mkComando("VIRAR_PARA_ESQUERDA");
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				match(T__27);
				((ComandoContext)_localctx).result =  Comando.mkComando("ANDAR_PARA_FRENTE");
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				match(T__28);
				((ComandoContext)_localctx).result =  Comando.mkComando("ANDAR_PARA_TRAS");
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 5);
				{
				setState(140);
				match(T__29);
				((ComandoContext)_localctx).result =  Comando.mkComando("PARAR");
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 6);
				{
				setState(142);
				match(T__30);
				setState(143);
				((ComandoContext)_localctx).NUMERO = match(NUMERO);
				setState(144);
				match(T__31);
				((ComandoContext)_localctx).result =  Comando.mkComandoParam((((ComandoContext)_localctx).NUMERO!=null?((ComandoContext)_localctx).NUMERO.getText():null),0);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 7);
				{
				setState(146);
				match(T__32);
				((ComandoContext)_localctx).result =  Comando.mkComando("ABRIR_GARRA");
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 8);
				{
				setState(148);
				match(T__33);
				setState(149);
				((ComandoContext)_localctx).NUMERO = match(NUMERO);
				setState(150);
				match(T__34);
				((ComandoContext)_localctx).result =  Comando.mkComandoParam((((ComandoContext)_localctx).NUMERO!=null?((ComandoContext)_localctx).NUMERO.getText():null),1);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 9);
				{
				setState(152);
				match(T__35);
				((ComandoContext)_localctx).result =  Comando.mkComando("FECHAR_GARRA");
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 10);
				{
				setState(154);
				match(T__36);
				((ComandoContext)_localctx).result =  Comando.mkComando("LIGAR_MOTOR_DIREITA");
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 11);
				{
				setState(156);
				match(T__37);
				((ComandoContext)_localctx).result =  Comando.mkComando("LIGAR_MOTOR_ESQUERDA");
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 12);
				{
				setState(158);
				match(T__38);
				((ComandoContext)_localctx).result =  Comando.mkComando("DESLIGAR_MOTOR_ESQUERDA");
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 13);
				{
				setState(160);
				match(T__39);
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

	public static class OperadorEContext extends ParserRuleContext {
		public OperadorEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterOperadorE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitOperadorE(this);
		}
	}

	public final OperadorEContext operadorE() throws RecognitionException {
		OperadorEContext _localctx = new OperadorEContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_operadorE);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__40) | (1L << T__41) | (1L << T__42))) != 0)) ) {
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

	public static class OperadorOUContext extends ParserRuleContext {
		public OperadorOUContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorOU; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterOperadorOU(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitOperadorOU(this);
		}
	}

	public final OperadorOUContext operadorOU() throws RecognitionException {
		OperadorOUContext _localctx = new OperadorOUContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operadorOU);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_la = _input.LA(1);
			if ( !(_la==T__43 || _la==T__44) ) {
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
		enterRule(_localctx, 18, RULE_negacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__45) | (1L << T__46) | (1L << T__47))) != 0)) ) {
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
		case 5:
			return verificacao_sempred((VerificacaoContext)_localctx, predIndex);
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
	private boolean verificacao_sempred(VerificacaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\66\u00ad\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4)\n\4\3\4\3\4\3\4\3\4\7\4/\n\4\f\4\16\4\62\13\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"G\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6W\n\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7v\n\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0082\n\7\f\7\16\7\u0085\13\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a5\n\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\13\2\4\6\f\f\2\4\6\b\n\f\16\20\22\24\2\5\3\2+-\3\2./\3\2"+
		"\60\62\u00c2\2\26\3\2\2\2\4\31\3\2\2\2\6(\3\2\2\2\bF\3\2\2\2\nV\3\2\2"+
		"\2\fu\3\2\2\2\16\u00a4\3\2\2\2\20\u00a6\3\2\2\2\22\u00a8\3\2\2\2\24\u00aa"+
		"\3\2\2\2\26\27\5\4\3\2\27\30\b\2\1\2\30\3\3\2\2\2\31\32\7\3\2\2\32\33"+
		"\5\6\4\2\33\34\7\4\2\2\34\35\b\3\1\2\35\5\3\2\2\2\36\37\b\4\1\2\37 \5"+
		"\b\5\2 !\b\4\1\2!)\3\2\2\2\"#\5\n\6\2#$\b\4\1\2$)\3\2\2\2%&\5\16\b\2&"+
		"\'\b\4\1\2\')\3\2\2\2(\36\3\2\2\2(\"\3\2\2\2(%\3\2\2\2)\60\3\2\2\2*+\f"+
		"\3\2\2+,\5\6\4\4,-\b\4\1\2-/\3\2\2\2.*\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2"+
		"\60\61\3\2\2\2\61\7\3\2\2\2\62\60\3\2\2\2\63\64\7\5\2\2\64\65\5\f\7\2"+
		"\65\66\7\6\2\2\66\67\5\6\4\2\678\7\7\2\289\b\5\1\29G\3\2\2\2:;\7\5\2\2"+
		";<\5\f\7\2<=\7\b\2\2=>\5\6\4\2>?\7\7\2\2?@\b\5\1\2@G\3\2\2\2AB\7\t\2\2"+
		"BC\5\6\4\2CD\7\n\2\2DE\b\5\1\2EG\3\2\2\2F\63\3\2\2\2F:\3\2\2\2FA\3\2\2"+
		"\2G\t\3\2\2\2HI\7\13\2\2IJ\5\f\7\2JK\7\6\2\2KL\5\6\4\2LM\7\f\2\2MN\b\6"+
		"\1\2NW\3\2\2\2OP\7\r\2\2PQ\7\65\2\2QR\7\16\2\2RS\5\6\4\2ST\7\17\2\2TU"+
		"\b\6\1\2UW\3\2\2\2VH\3\2\2\2VO\3\2\2\2W\13\3\2\2\2XY\b\7\1\2YZ\5\24\13"+
		"\2Z[\5\f\7\5[\\\b\7\1\2\\v\3\2\2\2]^\7\20\2\2^v\b\7\1\2_`\7\21\2\2`v\b"+
		"\7\1\2ab\7\22\2\2bv\b\7\1\2cd\7\23\2\2dv\b\7\1\2ef\7\24\2\2fv\b\7\1\2"+
		"gh\7\25\2\2hv\b\7\1\2ij\7\26\2\2jv\b\7\1\2kl\7\27\2\2lv\b\7\1\2mn\7\30"+
		"\2\2nv\b\7\1\2op\7\31\2\2pv\b\7\1\2qr\7\32\2\2rv\b\7\1\2st\7\33\2\2tv"+
		"\b\7\1\2uX\3\2\2\2u]\3\2\2\2u_\3\2\2\2ua\3\2\2\2uc\3\2\2\2ue\3\2\2\2u"+
		"g\3\2\2\2ui\3\2\2\2uk\3\2\2\2um\3\2\2\2uo\3\2\2\2uq\3\2\2\2us\3\2\2\2"+
		"v\u0083\3\2\2\2wx\f\4\2\2xy\5\20\t\2yz\5\f\7\5z{\b\7\1\2{\u0082\3\2\2"+
		"\2|}\f\3\2\2}~\5\22\n\2~\177\5\f\7\4\177\u0080\b\7\1\2\u0080\u0082\3\2"+
		"\2\2\u0081w\3\2\2\2\u0081|\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2"+
		"\2\2\u0083\u0084\3\2\2\2\u0084\r\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087"+
		"\7\34\2\2\u0087\u00a5\b\b\1\2\u0088\u0089\7\35\2\2\u0089\u00a5\b\b\1\2"+
		"\u008a\u008b\7\36\2\2\u008b\u00a5\b\b\1\2\u008c\u008d\7\37\2\2\u008d\u00a5"+
		"\b\b\1\2\u008e\u008f\7 \2\2\u008f\u00a5\b\b\1\2\u0090\u0091\7!\2\2\u0091"+
		"\u0092\7\65\2\2\u0092\u0093\7\"\2\2\u0093\u00a5\b\b\1\2\u0094\u0095\7"+
		"#\2\2\u0095\u00a5\b\b\1\2\u0096\u0097\7$\2\2\u0097\u0098\7\65\2\2\u0098"+
		"\u0099\7%\2\2\u0099\u00a5\b\b\1\2\u009a\u009b\7&\2\2\u009b\u00a5\b\b\1"+
		"\2\u009c\u009d\7\'\2\2\u009d\u00a5\b\b\1\2\u009e\u009f\7(\2\2\u009f\u00a5"+
		"\b\b\1\2\u00a0\u00a1\7)\2\2\u00a1\u00a5\b\b\1\2\u00a2\u00a3\7*\2\2\u00a3"+
		"\u00a5\b\b\1\2\u00a4\u0086\3\2\2\2\u00a4\u0088\3\2\2\2\u00a4\u008a\3\2"+
		"\2\2\u00a4\u008c\3\2\2\2\u00a4\u008e\3\2\2\2\u00a4\u0090\3\2\2\2\u00a4"+
		"\u0094\3\2\2\2\u00a4\u0096\3\2\2\2\u00a4\u009a\3\2\2\2\u00a4\u009c\3\2"+
		"\2\2\u00a4\u009e\3\2\2\2\u00a4\u00a0\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5"+
		"\17\3\2\2\2\u00a6\u00a7\t\2\2\2\u00a7\21\3\2\2\2\u00a8\u00a9\t\3\2\2\u00a9"+
		"\23\3\2\2\2\u00aa\u00ab\t\4\2\2\u00ab\25\3\2\2\2\n(\60FVu\u0081\u0083"+
		"\u00a4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
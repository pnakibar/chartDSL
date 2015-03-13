// Generated from /home/pedronakibar/IdeaProjects/MyLang/MyLang.g4 by ANTLR 4.5
package gen;

import org.jfree.chart.ChartUtilities;
import org.jfree.chart.ChartFactory;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PIE=1, CHART=2, COMMA=3, DOTCOMMA=4, END=5, LPAR=6, RPAR=7, LBR=8, RBR=9, 
		TWP=10, NUM=11, VARNAME=12, ASSIGNMENT=13, WS=14;
	public static final int
		RULE_expr = 0, RULE_adddata = 1, RULE_piedata = 2, RULE_chartdata = 3;
	public static final String[] ruleNames = {
		"expr", "adddata", "piedata", "chartdata"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'pie'", "'chart'", "','", "';'", "'end'", "'('", "')'", "'{'", 
		"'}'", "':'", null, null, "':='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PIE", "CHART", "COMMA", "DOTCOMMA", "END", "LPAR", "RPAR", "LBR", 
		"RBR", "TWP", "NUM", "VARNAME", "ASSIGNMENT", "WS"
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
	@NotNull
	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MyLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExprContext extends ParserRuleContext {
		public Data result;
		public AdddataContext adddata;
		public AdddataContext adddata() {
			return getRuleContext(AdddataContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8); 
			((ExprContext)_localctx).adddata = adddata();
			((ExprContext)_localctx).result =  ((ExprContext)_localctx).adddata.result;
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

	public static class AdddataContext extends ParserRuleContext {
		public Data result;
		public PiedataContext piedata;
		public ChartdataContext chartdata;
		public TerminalNode PIE() { return getToken(MyLangParser.PIE, 0); }
		public PiedataContext piedata() {
			return getRuleContext(PiedataContext.class,0);
		}
		public TerminalNode CHART() { return getToken(MyLangParser.CHART, 0); }
		public ChartdataContext chartdata() {
			return getRuleContext(ChartdataContext.class,0);
		}
		public AdddataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adddata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterAdddata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitAdddata(this);
		}
	}

	public final AdddataContext adddata() throws RecognitionException {
		AdddataContext _localctx = new AdddataContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_adddata);
		try {
			setState(19);
			switch (_input.LA(1)) {
			case PIE:
				enterOuterAlt(_localctx, 1);
				{
				setState(11); 
				match(PIE);
				setState(12); 
				((AdddataContext)_localctx).piedata = piedata();
				((AdddataContext)_localctx).result =  ((AdddataContext)_localctx).piedata.result;
				}
				break;
			case CHART:
				enterOuterAlt(_localctx, 2);
				{
				setState(15); 
				match(CHART);
				setState(16); 
				((AdddataContext)_localctx).chartdata = chartdata();
				((AdddataContext)_localctx).result =  ((AdddataContext)_localctx).chartdata.result;
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

	public static class PiedataContext extends ParserRuleContext {
		public Data result;
		public Token column;
		public Token value;
		public TerminalNode LBR() { return getToken(MyLangParser.LBR, 0); }
		public List<TerminalNode> TWP() { return getTokens(MyLangParser.TWP); }
		public TerminalNode TWP(int i) {
			return getToken(MyLangParser.TWP, i);
		}
		public TerminalNode RBR() { return getToken(MyLangParser.RBR, 0); }
		public List<TerminalNode> VARNAME() { return getTokens(MyLangParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(MyLangParser.VARNAME, i);
		}
		public List<TerminalNode> NUM() { return getTokens(MyLangParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(MyLangParser.NUM, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MyLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MyLangParser.COMMA, i);
		}
		public PiedataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_piedata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterPiedata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitPiedata(this);
		}
	}

	public final PiedataContext piedata() throws RecognitionException {
		PiedataContext _localctx = new PiedataContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_piedata);

		        Data data = DataFactory.fabricate("pie");
		        
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21); 
			match(LBR);
			setState(22); 
			((PiedataContext)_localctx).column = match(VARNAME);
			setState(23); 
			match(TWP);
			setState(24); 
			((PiedataContext)_localctx).value = match(NUM);
			data.add((((PiedataContext)_localctx).column!=null?((PiedataContext)_localctx).column.getText():null), (((PiedataContext)_localctx).value!=null?((PiedataContext)_localctx).value.getText():null));
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(26); 
				match(COMMA);
				setState(27); 
				((PiedataContext)_localctx).column = match(VARNAME);
				setState(28); 
				match(TWP);
				setState(29); 
				((PiedataContext)_localctx).value = match(NUM);
				data.add((((PiedataContext)_localctx).column!=null?((PiedataContext)_localctx).column.getText():null), (((PiedataContext)_localctx).value!=null?((PiedataContext)_localctx).value.getText():null));
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36); 
			match(RBR);
			((PiedataContext)_localctx).result =  data;
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

	public static class ChartdataContext extends ParserRuleContext {
		public Data result;
		public Token column;
		public Token line;
		public Token value;
		public TerminalNode LBR() { return getToken(MyLangParser.LBR, 0); }
		public List<TerminalNode> TWP() { return getTokens(MyLangParser.TWP); }
		public TerminalNode TWP(int i) {
			return getToken(MyLangParser.TWP, i);
		}
		public TerminalNode RBR() { return getToken(MyLangParser.RBR, 0); }
		public List<TerminalNode> VARNAME() { return getTokens(MyLangParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(MyLangParser.VARNAME, i);
		}
		public List<TerminalNode> NUM() { return getTokens(MyLangParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(MyLangParser.NUM, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MyLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MyLangParser.COMMA, i);
		}
		public ChartdataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chartdata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterChartdata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitChartdata(this);
		}
	}

	public final ChartdataContext chartdata() throws RecognitionException {
		ChartdataContext _localctx = new ChartdataContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_chartdata);

		        Data data = DataFactory.fabricate("chart");
		        
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); 
			match(LBR);
			setState(40); 
			((ChartdataContext)_localctx).column = match(VARNAME);
			setState(41); 
			match(TWP);
			setState(42); 
			((ChartdataContext)_localctx).line = match(VARNAME);
			setState(43); 
			match(TWP);
			setState(44); 
			((ChartdataContext)_localctx).value = match(NUM);
			data.add((((ChartdataContext)_localctx).column!=null?((ChartdataContext)_localctx).column.getText():null), (((ChartdataContext)_localctx).line!=null?((ChartdataContext)_localctx).line.getText():null), (((ChartdataContext)_localctx).value!=null?((ChartdataContext)_localctx).value.getText():null));
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(46); 
				match(COMMA);
				setState(47); 
				((ChartdataContext)_localctx).column = match(VARNAME);
				setState(48); 
				match(TWP);
				setState(49); 
				((ChartdataContext)_localctx).line = match(VARNAME);
				setState(50); 
				match(TWP);
				setState(51); 
				((ChartdataContext)_localctx).value = match(NUM);
				data.add((((ChartdataContext)_localctx).column!=null?((ChartdataContext)_localctx).column.getText():null), (((ChartdataContext)_localctx).line!=null?((ChartdataContext)_localctx).line.getText():null), (((ChartdataContext)_localctx).value!=null?((ChartdataContext)_localctx).value.getText():null));
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58); 
			match(RBR);
			((ChartdataContext)_localctx).result =  data;
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\20@\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\26"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\"\n\4\f\4\16\4%\13\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7"+
		"\58\n\5\f\5\16\5;\13\5\3\5\3\5\3\5\3\5\2\2\6\2\4\6\b\2\2>\2\n\3\2\2\2"+
		"\4\25\3\2\2\2\6\27\3\2\2\2\b)\3\2\2\2\n\13\5\4\3\2\13\f\b\2\1\2\f\3\3"+
		"\2\2\2\r\16\7\3\2\2\16\17\5\6\4\2\17\20\b\3\1\2\20\26\3\2\2\2\21\22\7"+
		"\4\2\2\22\23\5\b\5\2\23\24\b\3\1\2\24\26\3\2\2\2\25\r\3\2\2\2\25\21\3"+
		"\2\2\2\26\5\3\2\2\2\27\30\7\n\2\2\30\31\7\16\2\2\31\32\7\f\2\2\32\33\7"+
		"\r\2\2\33#\b\4\1\2\34\35\7\5\2\2\35\36\7\16\2\2\36\37\7\f\2\2\37 \7\r"+
		"\2\2 \"\b\4\1\2!\34\3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%"+
		"#\3\2\2\2&\'\7\13\2\2\'(\b\4\1\2(\7\3\2\2\2)*\7\n\2\2*+\7\16\2\2+,\7\f"+
		"\2\2,-\7\16\2\2-.\7\f\2\2./\7\r\2\2/9\b\5\1\2\60\61\7\5\2\2\61\62\7\16"+
		"\2\2\62\63\7\f\2\2\63\64\7\16\2\2\64\65\7\f\2\2\65\66\7\r\2\2\668\b\5"+
		"\1\2\67\60\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2"+
		"<=\7\13\2\2=>\b\5\1\2>\t\3\2\2\2\5\25#9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
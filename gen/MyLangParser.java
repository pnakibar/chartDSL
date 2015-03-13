// Generated from /home/pedronakibar/IdeaProjects/MyLang/MyLang.g4 by ANTLR 4.5
package gen;

import org.jfree.chart.ChartUtilities;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;

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
		TWP=10, WINDOW=11, JPG=12, PNG=13, NUM=14, VARNAME=15, ASSIGNMENT=16, 
		WS=17;
	public static final int
		RULE_expr = 0, RULE_getname = 1, RULE_getdata = 2, RULE_piedata = 3, RULE_chartdata = 4;
	public static final String[] ruleNames = {
		"expr", "getname", "getdata", "piedata", "chartdata"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'pie'", "'chart'", "','", "';'", "'end'", "'('", "')'", "'{'", 
		"'}'", "':'", "'window'", "'jpg'", "'png'", null, null, "':='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PIE", "CHART", "COMMA", "DOTCOMMA", "END", "LPAR", "RPAR", "LBR", 
		"RBR", "TWP", "WINDOW", "JPG", "PNG", "NUM", "VARNAME", "ASSIGNMENT", 
		"WS"
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
		public JFreeChart result;
		public GetnameContext getname;
		public GetdataContext getdata;
		public GetnameContext getname() {
			return getRuleContext(GetnameContext.class,0);
		}
		public GetdataContext getdata() {
			return getRuleContext(GetdataContext.class,0);
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
			setState(10); 
			((ExprContext)_localctx).getname = getname();
			setState(11); 
			((ExprContext)_localctx).getdata = getdata();
			((ExprContext)_localctx).result =  (((ExprContext)_localctx).getdata.result).createChart(((ExprContext)_localctx).getname.name);
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

	public static class GetnameContext extends ParserRuleContext {
		public String name;
		public Token VARNAME;
		public TerminalNode VARNAME() { return getToken(MyLangParser.VARNAME, 0); }
		public TerminalNode TWP() { return getToken(MyLangParser.TWP, 0); }
		public GetnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterGetname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitGetname(this);
		}
	}

	public final GetnameContext getname() throws RecognitionException {
		GetnameContext _localctx = new GetnameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_getname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14); 
			((GetnameContext)_localctx).VARNAME = match(VARNAME);
			setState(15); 
			match(TWP);
			((GetnameContext)_localctx).name =  (((GetnameContext)_localctx).VARNAME!=null?((GetnameContext)_localctx).VARNAME.getText():null);
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

	public static class GetdataContext extends ParserRuleContext {
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
		public GetdataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getdata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterGetdata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitGetdata(this);
		}
	}

	public final GetdataContext getdata() throws RecognitionException {
		GetdataContext _localctx = new GetdataContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_getdata);
		try {
			setState(26);
			switch (_input.LA(1)) {
			case PIE:
				enterOuterAlt(_localctx, 1);
				{
				setState(18); 
				match(PIE);
				setState(19); 
				((GetdataContext)_localctx).piedata = piedata();
				((GetdataContext)_localctx).result =  ((GetdataContext)_localctx).piedata.result;
				}
				break;
			case CHART:
				enterOuterAlt(_localctx, 2);
				{
				setState(22); 
				match(CHART);
				setState(23); 
				((GetdataContext)_localctx).chartdata = chartdata();
				((GetdataContext)_localctx).result =  ((GetdataContext)_localctx).chartdata.result;
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
		enterRule(_localctx, 6, RULE_piedata);

		        Data data = DataFactory.fabricate("pie");
		        
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); 
			match(LBR);
			setState(29); 
			((PiedataContext)_localctx).column = match(VARNAME);
			setState(30); 
			match(TWP);
			setState(31); 
			((PiedataContext)_localctx).value = match(NUM);
			data.add((((PiedataContext)_localctx).column!=null?((PiedataContext)_localctx).column.getText():null), (((PiedataContext)_localctx).value!=null?((PiedataContext)_localctx).value.getText():null));
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(33); 
				match(COMMA);
				setState(34); 
				((PiedataContext)_localctx).column = match(VARNAME);
				setState(35); 
				match(TWP);
				setState(36); 
				((PiedataContext)_localctx).value = match(NUM);
				data.add((((PiedataContext)_localctx).column!=null?((PiedataContext)_localctx).column.getText():null), (((PiedataContext)_localctx).value!=null?((PiedataContext)_localctx).value.getText():null));
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43); 
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
		enterRule(_localctx, 8, RULE_chartdata);

		        Data data = DataFactory.fabricate("chart");
		        
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); 
			match(LBR);
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
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(53); 
				match(COMMA);
				setState(54); 
				((ChartdataContext)_localctx).column = match(VARNAME);
				setState(55); 
				match(TWP);
				setState(56); 
				((ChartdataContext)_localctx).line = match(VARNAME);
				setState(57); 
				match(TWP);
				setState(58); 
				((ChartdataContext)_localctx).value = match(NUM);
				data.add((((ChartdataContext)_localctx).column!=null?((ChartdataContext)_localctx).column.getText():null), (((ChartdataContext)_localctx).line!=null?((ChartdataContext)_localctx).line.getText():null), (((ChartdataContext)_localctx).value!=null?((ChartdataContext)_localctx).value.getText():null));
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65); 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\23G\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4\35\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\7\5)\n\5\f\5\16\5,\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\7\6?\n\6\f\6\16\6B\13\6\3\6\3\6\3\6\3\6\2\2\7"+
		"\2\4\6\b\n\2\2D\2\f\3\2\2\2\4\20\3\2\2\2\6\34\3\2\2\2\b\36\3\2\2\2\n\60"+
		"\3\2\2\2\f\r\5\4\3\2\r\16\5\6\4\2\16\17\b\2\1\2\17\3\3\2\2\2\20\21\7\21"+
		"\2\2\21\22\7\f\2\2\22\23\b\3\1\2\23\5\3\2\2\2\24\25\7\3\2\2\25\26\5\b"+
		"\5\2\26\27\b\4\1\2\27\35\3\2\2\2\30\31\7\4\2\2\31\32\5\n\6\2\32\33\b\4"+
		"\1\2\33\35\3\2\2\2\34\24\3\2\2\2\34\30\3\2\2\2\35\7\3\2\2\2\36\37\7\n"+
		"\2\2\37 \7\21\2\2 !\7\f\2\2!\"\7\20\2\2\"*\b\5\1\2#$\7\5\2\2$%\7\21\2"+
		"\2%&\7\f\2\2&\'\7\20\2\2\')\b\5\1\2(#\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3"+
		"\2\2\2+-\3\2\2\2,*\3\2\2\2-.\7\13\2\2./\b\5\1\2/\t\3\2\2\2\60\61\7\n\2"+
		"\2\61\62\7\21\2\2\62\63\7\f\2\2\63\64\7\21\2\2\64\65\7\f\2\2\65\66\7\20"+
		"\2\2\66@\b\6\1\2\678\7\5\2\289\7\21\2\29:\7\f\2\2:;\7\21\2\2;<\7\f\2\2"+
		"<=\7\20\2\2=?\b\6\1\2>\67\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2"+
		"\2\2B@\3\2\2\2CD\7\13\2\2DE\b\6\1\2E\13\3\2\2\2\5\34*@";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
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
		TWP=10, X=11, CRUNCH=12, DOT=13, SHOWAS=14, WINDOW=15, JPEG=16, PNG=17, 
		NUM=18, DOUBLE=19, VARNAME=20, ASSIGNMENT=21, WS=22;
	public static final int
		RULE_expr = 0, RULE_getShowAs = 1, RULE_showAsWindow = 2, RULE_showAsPNG = 3, 
		RULE_showAsJPEG = 4, RULE_getname = 5, RULE_getdata = 6, RULE_piedata = 7, 
		RULE_chartdata = 8;
	public static final String[] ruleNames = {
		"expr", "getShowAs", "showAsWindow", "showAsPNG", "showAsJPEG", "getname", 
		"getdata", "piedata", "chartdata"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'pie'", "'chart'", "','", "';'", "'end'", "'('", "')'", "'{'", 
		"'}'", "':'", "'x'", "'#'", "'.'", "'show as'", "'window'", "'jpeg'", 
		"'png'", null, null, null, "':='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PIE", "CHART", "COMMA", "DOTCOMMA", "END", "LPAR", "RPAR", "LBR", 
		"RBR", "TWP", "X", "CRUNCH", "DOT", "SHOWAS", "WINDOW", "JPEG", "PNG", 
		"NUM", "DOUBLE", "VARNAME", "ASSIGNMENT", "WS"
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
		public GetnameContext getname;
		public GetShowAsContext getShowAs;
		public GetdataContext getdata;
		public GetnameContext getname() {
			return getRuleContext(GetnameContext.class,0);
		}
		public TerminalNode SHOWAS() { return getToken(MyLangParser.SHOWAS, 0); }
		public GetShowAsContext getShowAs() {
			return getRuleContext(GetShowAsContext.class,0);
		}
		public TerminalNode TWP() { return getToken(MyLangParser.TWP, 0); }
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
			setState(18); 
			((ExprContext)_localctx).getname = getname();
			setState(19); 
			match(SHOWAS);
			setState(20); 
			((ExprContext)_localctx).getShowAs = getShowAs();
			setState(21); 
			match(TWP);
			setState(22); 
			((ExprContext)_localctx).getdata = getdata();
			((ExprContext)_localctx).getShowAs.result.save(((ExprContext)_localctx).getname.result, (((ExprContext)_localctx).getdata.result).createChart(((ExprContext)_localctx).getname.result));
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

	public static class GetShowAsContext extends ParserRuleContext {
		public Save result;
		public ShowAsPNGContext showAsPNG;
		public ShowAsJPEGContext showAsJPEG;
		public ShowAsWindowContext showAsWindow;
		public TerminalNode PNG() { return getToken(MyLangParser.PNG, 0); }
		public ShowAsPNGContext showAsPNG() {
			return getRuleContext(ShowAsPNGContext.class,0);
		}
		public TerminalNode JPEG() { return getToken(MyLangParser.JPEG, 0); }
		public ShowAsJPEGContext showAsJPEG() {
			return getRuleContext(ShowAsJPEGContext.class,0);
		}
		public TerminalNode WINDOW() { return getToken(MyLangParser.WINDOW, 0); }
		public ShowAsWindowContext showAsWindow() {
			return getRuleContext(ShowAsWindowContext.class,0);
		}
		public GetShowAsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getShowAs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterGetShowAs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitGetShowAs(this);
		}
	}

	public final GetShowAsContext getShowAs() throws RecognitionException {
		GetShowAsContext _localctx = new GetShowAsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_getShowAs);
		try {
			setState(37);
			switch (_input.LA(1)) {
			case PNG:
				enterOuterAlt(_localctx, 1);
				{
				setState(25); 
				match(PNG);
				setState(26); 
				((GetShowAsContext)_localctx).showAsPNG = showAsPNG();
				((GetShowAsContext)_localctx).result =  ((GetShowAsContext)_localctx).showAsPNG.result;
				}
				break;
			case JPEG:
				enterOuterAlt(_localctx, 2);
				{
				setState(29); 
				match(JPEG);
				setState(30); 
				((GetShowAsContext)_localctx).showAsJPEG = showAsJPEG();
				((GetShowAsContext)_localctx).result =  ((GetShowAsContext)_localctx).showAsJPEG.result;
				}
				break;
			case WINDOW:
				enterOuterAlt(_localctx, 3);
				{
				setState(33); 
				match(WINDOW);
				setState(34); 
				((GetShowAsContext)_localctx).showAsWindow = showAsWindow();
				((GetShowAsContext)_localctx).result =  ((GetShowAsContext)_localctx).showAsWindow.result;
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

	public static class ShowAsWindowContext extends ParserRuleContext {
		public Save result;
		public Token height;
		public Token width;
		public TerminalNode LPAR() { return getToken(MyLangParser.LPAR, 0); }
		public TerminalNode X() { return getToken(MyLangParser.X, 0); }
		public TerminalNode RPAR() { return getToken(MyLangParser.RPAR, 0); }
		public List<TerminalNode> NUM() { return getTokens(MyLangParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(MyLangParser.NUM, i);
		}
		public ShowAsWindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showAsWindow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterShowAsWindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitShowAsWindow(this);
		}
	}

	public final ShowAsWindowContext showAsWindow() throws RecognitionException {
		ShowAsWindowContext _localctx = new ShowAsWindowContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_showAsWindow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); 
			match(LPAR);
			setState(40); 
			((ShowAsWindowContext)_localctx).height = match(NUM);
			setState(41); 
			match(X);
			setState(42); 
			((ShowAsWindowContext)_localctx).width = match(NUM);
			setState(43); 
			match(RPAR);
			((ShowAsWindowContext)_localctx).result =  new SaveWindow((((ShowAsWindowContext)_localctx).height!=null?((ShowAsWindowContext)_localctx).height.getText():null), (((ShowAsWindowContext)_localctx).width!=null?((ShowAsWindowContext)_localctx).width.getText():null));
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

	public static class ShowAsPNGContext extends ParserRuleContext {
		public Save result;
		public Token height;
		public Token width;
		public TerminalNode LPAR() { return getToken(MyLangParser.LPAR, 0); }
		public TerminalNode X() { return getToken(MyLangParser.X, 0); }
		public TerminalNode RPAR() { return getToken(MyLangParser.RPAR, 0); }
		public List<TerminalNode> NUM() { return getTokens(MyLangParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(MyLangParser.NUM, i);
		}
		public ShowAsPNGContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showAsPNG; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterShowAsPNG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitShowAsPNG(this);
		}
	}

	public final ShowAsPNGContext showAsPNG() throws RecognitionException {
		ShowAsPNGContext _localctx = new ShowAsPNGContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_showAsPNG);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); 
			match(LPAR);
			setState(47); 
			((ShowAsPNGContext)_localctx).height = match(NUM);
			setState(48); 
			match(X);
			setState(49); 
			((ShowAsPNGContext)_localctx).width = match(NUM);
			setState(50); 
			match(RPAR);
			((ShowAsPNGContext)_localctx).result =  new SavePNG((((ShowAsPNGContext)_localctx).height!=null?((ShowAsPNGContext)_localctx).height.getText():null), (((ShowAsPNGContext)_localctx).width!=null?((ShowAsPNGContext)_localctx).width.getText():null));
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

	public static class ShowAsJPEGContext extends ParserRuleContext {
		public Save result;
		public Token height;
		public Token width;
		public TerminalNode LPAR() { return getToken(MyLangParser.LPAR, 0); }
		public TerminalNode X() { return getToken(MyLangParser.X, 0); }
		public TerminalNode RPAR() { return getToken(MyLangParser.RPAR, 0); }
		public List<TerminalNode> NUM() { return getTokens(MyLangParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(MyLangParser.NUM, i);
		}
		public ShowAsJPEGContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showAsJPEG; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterShowAsJPEG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitShowAsJPEG(this);
		}
	}

	public final ShowAsJPEGContext showAsJPEG() throws RecognitionException {
		ShowAsJPEGContext _localctx = new ShowAsJPEGContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_showAsJPEG);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); 
			match(LPAR);
			setState(54); 
			((ShowAsJPEGContext)_localctx).height = match(NUM);
			setState(55); 
			match(X);
			setState(56); 
			((ShowAsJPEGContext)_localctx).width = match(NUM);
			setState(57); 
			match(RPAR);
			((ShowAsJPEGContext)_localctx).result =  new SaveJPEG((((ShowAsJPEGContext)_localctx).height!=null?((ShowAsJPEGContext)_localctx).height.getText():null), (((ShowAsJPEGContext)_localctx).width!=null?((ShowAsJPEGContext)_localctx).width.getText():null));
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
		public String result;
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
		enterRule(_localctx, 10, RULE_getname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60); 
			((GetnameContext)_localctx).VARNAME = match(VARNAME);
			setState(61); 
			match(TWP);
			((GetnameContext)_localctx).result =  (((GetnameContext)_localctx).VARNAME!=null?((GetnameContext)_localctx).VARNAME.getText():null);
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
		enterRule(_localctx, 12, RULE_getdata);
		try {
			setState(72);
			switch (_input.LA(1)) {
			case PIE:
				enterOuterAlt(_localctx, 1);
				{
				setState(64); 
				match(PIE);
				setState(65); 
				((GetdataContext)_localctx).piedata = piedata();
				((GetdataContext)_localctx).result =  ((GetdataContext)_localctx).piedata.result;
				}
				break;
			case CHART:
				enterOuterAlt(_localctx, 2);
				{
				setState(68); 
				match(CHART);
				setState(69); 
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
		public List<TerminalNode> DOUBLE() { return getTokens(MyLangParser.DOUBLE); }
		public TerminalNode DOUBLE(int i) {
			return getToken(MyLangParser.DOUBLE, i);
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
		enterRule(_localctx, 14, RULE_piedata);

		        Data data = DataFactory.fabricate("pie");
		        
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); 
			match(LBR);
			setState(75); 
			((PiedataContext)_localctx).column = match(VARNAME);
			setState(76); 
			match(TWP);
			setState(77);
			((PiedataContext)_localctx).value = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==DOUBLE) ) {
				((PiedataContext)_localctx).value = (Token)_errHandler.recoverInline(this);
			}
			consume();
			data.add((((PiedataContext)_localctx).column!=null?((PiedataContext)_localctx).column.getText():null), (((PiedataContext)_localctx).value!=null?((PiedataContext)_localctx).value.getText():null));
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(79); 
				match(COMMA);
				setState(80); 
				((PiedataContext)_localctx).column = match(VARNAME);
				setState(81); 
				match(TWP);
				setState(82);
				((PiedataContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==DOUBLE) ) {
					((PiedataContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				consume();
				data.add((((PiedataContext)_localctx).column!=null?((PiedataContext)_localctx).column.getText():null), (((PiedataContext)_localctx).value!=null?((PiedataContext)_localctx).value.getText():null));
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89); 
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
		public Token domainLabel;
		public Token rangeLabel;
		public TerminalNode LBR() { return getToken(MyLangParser.LBR, 0); }
		public List<TerminalNode> TWP() { return getTokens(MyLangParser.TWP); }
		public TerminalNode TWP(int i) {
			return getToken(MyLangParser.TWP, i);
		}
		public List<TerminalNode> CRUNCH() { return getTokens(MyLangParser.CRUNCH); }
		public TerminalNode CRUNCH(int i) {
			return getToken(MyLangParser.CRUNCH, i);
		}
		public TerminalNode RBR() { return getToken(MyLangParser.RBR, 0); }
		public List<TerminalNode> VARNAME() { return getTokens(MyLangParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(MyLangParser.VARNAME, i);
		}
		public List<TerminalNode> DOUBLE() { return getTokens(MyLangParser.DOUBLE); }
		public TerminalNode DOUBLE(int i) {
			return getToken(MyLangParser.DOUBLE, i);
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
		enterRule(_localctx, 16, RULE_chartdata);

		        Data data = DataFactory.fabricate("chart");
		        
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); 
			match(LBR);
			setState(93); 
			((ChartdataContext)_localctx).column = match(VARNAME);
			setState(94); 
			match(TWP);
			setState(95); 
			((ChartdataContext)_localctx).line = match(VARNAME);
			setState(96); 
			match(TWP);
			setState(97);
			((ChartdataContext)_localctx).value = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==DOUBLE) ) {
				((ChartdataContext)_localctx).value = (Token)_errHandler.recoverInline(this);
			}
			consume();
			data.add((((ChartdataContext)_localctx).column!=null?((ChartdataContext)_localctx).column.getText():null), (((ChartdataContext)_localctx).line!=null?((ChartdataContext)_localctx).line.getText():null), (((ChartdataContext)_localctx).value!=null?((ChartdataContext)_localctx).value.getText():null));
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(99); 
				match(COMMA);
				setState(100); 
				((ChartdataContext)_localctx).column = match(VARNAME);
				setState(101); 
				match(TWP);
				setState(102); 
				((ChartdataContext)_localctx).line = match(VARNAME);
				setState(103); 
				match(TWP);
				setState(104);
				((ChartdataContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==DOUBLE) ) {
					((ChartdataContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				consume();
				data.add((((ChartdataContext)_localctx).column!=null?((ChartdataContext)_localctx).column.getText():null), (((ChartdataContext)_localctx).line!=null?((ChartdataContext)_localctx).line.getText():null), (((ChartdataContext)_localctx).value!=null?((ChartdataContext)_localctx).value.getText():null));
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111); 
			match(CRUNCH);
			setState(112); 
			((ChartdataContext)_localctx).domainLabel = match(VARNAME);
			data.add("domainLabel", (((ChartdataContext)_localctx).domainLabel!=null?((ChartdataContext)_localctx).domainLabel.getText():null));
			setState(114); 
			match(CRUNCH);
			setState(115); 
			((ChartdataContext)_localctx).rangeLabel = match(VARNAME);
			data.add("rangeLabel", (((ChartdataContext)_localctx).rangeLabel!=null?((ChartdataContext)_localctx).rangeLabel.getText():null));
			setState(117); 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\30{\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3("+
		"\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"K\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\tW\n\t\f\t\16\tZ\13\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7"+
		"\nm\n\n\f\n\16\np\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\2\2\13"+
		"\2\4\6\b\n\f\16\20\22\2\3\3\2\24\25v\2\24\3\2\2\2\4\'\3\2\2\2\6)\3\2\2"+
		"\2\b\60\3\2\2\2\n\67\3\2\2\2\f>\3\2\2\2\16J\3\2\2\2\20L\3\2\2\2\22^\3"+
		"\2\2\2\24\25\5\f\7\2\25\26\7\20\2\2\26\27\5\4\3\2\27\30\7\f\2\2\30\31"+
		"\5\16\b\2\31\32\b\2\1\2\32\3\3\2\2\2\33\34\7\23\2\2\34\35\5\b\5\2\35\36"+
		"\b\3\1\2\36(\3\2\2\2\37 \7\22\2\2 !\5\n\6\2!\"\b\3\1\2\"(\3\2\2\2#$\7"+
		"\21\2\2$%\5\6\4\2%&\b\3\1\2&(\3\2\2\2\'\33\3\2\2\2\'\37\3\2\2\2\'#\3\2"+
		"\2\2(\5\3\2\2\2)*\7\b\2\2*+\7\24\2\2+,\7\r\2\2,-\7\24\2\2-.\7\t\2\2./"+
		"\b\4\1\2/\7\3\2\2\2\60\61\7\b\2\2\61\62\7\24\2\2\62\63\7\r\2\2\63\64\7"+
		"\24\2\2\64\65\7\t\2\2\65\66\b\5\1\2\66\t\3\2\2\2\678\7\b\2\289\7\24\2"+
		"\29:\7\r\2\2:;\7\24\2\2;<\7\t\2\2<=\b\6\1\2=\13\3\2\2\2>?\7\26\2\2?@\7"+
		"\f\2\2@A\b\7\1\2A\r\3\2\2\2BC\7\3\2\2CD\5\20\t\2DE\b\b\1\2EK\3\2\2\2F"+
		"G\7\4\2\2GH\5\22\n\2HI\b\b\1\2IK\3\2\2\2JB\3\2\2\2JF\3\2\2\2K\17\3\2\2"+
		"\2LM\7\n\2\2MN\7\26\2\2NO\7\f\2\2OP\t\2\2\2PX\b\t\1\2QR\7\5\2\2RS\7\26"+
		"\2\2ST\7\f\2\2TU\t\2\2\2UW\b\t\1\2VQ\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2"+
		"\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\7\13\2\2\\]\b\t\1\2]\21\3\2\2\2^_\7\n\2\2"+
		"_`\7\26\2\2`a\7\f\2\2ab\7\26\2\2bc\7\f\2\2cd\t\2\2\2dn\b\n\1\2ef\7\5\2"+
		"\2fg\7\26\2\2gh\7\f\2\2hi\7\26\2\2ij\7\f\2\2jk\t\2\2\2km\b\n\1\2le\3\2"+
		"\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\7\16\2\2rs\7"+
		"\26\2\2st\b\n\1\2tu\7\16\2\2uv\7\26\2\2vw\b\n\1\2wx\7\13\2\2xy\b\n\1\2"+
		"y\23\3\2\2\2\6\'JXn";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
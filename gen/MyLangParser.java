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
		TWP=10, X=11, SHOWAS=12, WINDOW=13, JPEG=14, PNG=15, NUM=16, VARNAME=17, 
		ASSIGNMENT=18, WS=19;
	public static final int
		RULE_expr = 0, RULE_getshowas = 1, RULE_showAsPNG = 2, RULE_showAsJPEG = 3, 
		RULE_getname = 4, RULE_getdata = 5, RULE_piedata = 6, RULE_chartdata = 7;
	public static final String[] ruleNames = {
		"expr", "getshowas", "showAsPNG", "showAsJPEG", "getname", "getdata", 
		"piedata", "chartdata"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'pie'", "'chart'", "','", "';'", "'end'", "'('", "')'", "'{'", 
		"'}'", "':'", "'x'", "'show as'", "'window'", "'jpeg'", "'png'", null, 
		null, "':='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PIE", "CHART", "COMMA", "DOTCOMMA", "END", "LPAR", "RPAR", "LBR", 
		"RBR", "TWP", "X", "SHOWAS", "WINDOW", "JPEG", "PNG", "NUM", "VARNAME", 
		"ASSIGNMENT", "WS"
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
		public TerminalNode SHOWAS() { return getToken(MyLangParser.SHOWAS, 0); }
		public GetshowasContext getshowas() {
			return getRuleContext(GetshowasContext.class,0);
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
			setState(16); 
			((ExprContext)_localctx).getname = getname();
			setState(17); 
			match(SHOWAS);
			setState(18); 
			getshowas();
			setState(19); 
			match(TWP);
			setState(20); 
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

	public static class GetshowasContext extends ParserRuleContext {
		public Save result;
		public ShowAsPNGContext showAsPNG;
		public ShowAsJPEGContext showAsJPEG;
		public TerminalNode PNG() { return getToken(MyLangParser.PNG, 0); }
		public ShowAsPNGContext showAsPNG() {
			return getRuleContext(ShowAsPNGContext.class,0);
		}
		public TerminalNode JPEG() { return getToken(MyLangParser.JPEG, 0); }
		public ShowAsJPEGContext showAsJPEG() {
			return getRuleContext(ShowAsJPEGContext.class,0);
		}
		public GetshowasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getshowas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterGetshowas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitGetshowas(this);
		}
	}

	public final GetshowasContext getshowas() throws RecognitionException {
		GetshowasContext _localctx = new GetshowasContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_getshowas);
		try {
			setState(31);
			switch (_input.LA(1)) {
			case PNG:
				enterOuterAlt(_localctx, 1);
				{
				setState(23); 
				match(PNG);
				setState(24); 
				((GetshowasContext)_localctx).showAsPNG = showAsPNG();
				((GetshowasContext)_localctx).result =  ((GetshowasContext)_localctx).showAsPNG.result;
				}
				break;
			case JPEG:
				enterOuterAlt(_localctx, 2);
				{
				setState(27); 
				match(JPEG);
				setState(28); 
				((GetshowasContext)_localctx).showAsJPEG = showAsJPEG();
				((GetshowasContext)_localctx).result =  ((GetshowasContext)_localctx).showAsJPEG.result;
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
		enterRule(_localctx, 4, RULE_showAsPNG);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); 
			match(LPAR);
			setState(34); 
			((ShowAsPNGContext)_localctx).height = match(NUM);
			setState(35); 
			match(X);
			setState(36); 
			((ShowAsPNGContext)_localctx).width = match(NUM);
			setState(37); 
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
		enterRule(_localctx, 6, RULE_showAsJPEG);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40); 
			match(LPAR);
			setState(41); 
			((ShowAsJPEGContext)_localctx).height = match(NUM);
			setState(42); 
			match(X);
			setState(43); 
			((ShowAsJPEGContext)_localctx).width = match(NUM);
			setState(44); 
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
		enterRule(_localctx, 8, RULE_getname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); 
			((GetnameContext)_localctx).VARNAME = match(VARNAME);
			setState(48); 
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
		enterRule(_localctx, 10, RULE_getdata);
		try {
			setState(59);
			switch (_input.LA(1)) {
			case PIE:
				enterOuterAlt(_localctx, 1);
				{
				setState(51); 
				match(PIE);
				setState(52); 
				((GetdataContext)_localctx).piedata = piedata();
				((GetdataContext)_localctx).result =  ((GetdataContext)_localctx).piedata.result;
				}
				break;
			case CHART:
				enterOuterAlt(_localctx, 2);
				{
				setState(55); 
				match(CHART);
				setState(56); 
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
		enterRule(_localctx, 12, RULE_piedata);

		        Data data = DataFactory.fabricate("pie");
		        
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); 
			match(LBR);
			setState(62); 
			((PiedataContext)_localctx).column = match(VARNAME);
			setState(63); 
			match(TWP);
			setState(64); 
			((PiedataContext)_localctx).value = match(NUM);
			data.add((((PiedataContext)_localctx).column!=null?((PiedataContext)_localctx).column.getText():null), (((PiedataContext)_localctx).value!=null?((PiedataContext)_localctx).value.getText():null));
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(66); 
				match(COMMA);
				setState(67); 
				((PiedataContext)_localctx).column = match(VARNAME);
				setState(68); 
				match(TWP);
				setState(69); 
				((PiedataContext)_localctx).value = match(NUM);
				data.add((((PiedataContext)_localctx).column!=null?((PiedataContext)_localctx).column.getText():null), (((PiedataContext)_localctx).value!=null?((PiedataContext)_localctx).value.getText():null));
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76); 
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
		enterRule(_localctx, 14, RULE_chartdata);

		        Data data = DataFactory.fabricate("chart");
		        
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); 
			match(LBR);
			setState(80); 
			((ChartdataContext)_localctx).column = match(VARNAME);
			setState(81); 
			match(TWP);
			setState(82); 
			((ChartdataContext)_localctx).line = match(VARNAME);
			setState(83); 
			match(TWP);
			setState(84); 
			((ChartdataContext)_localctx).value = match(NUM);
			data.add((((ChartdataContext)_localctx).column!=null?((ChartdataContext)_localctx).column.getText():null), (((ChartdataContext)_localctx).line!=null?((ChartdataContext)_localctx).line.getText():null), (((ChartdataContext)_localctx).value!=null?((ChartdataContext)_localctx).value.getText():null));
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(86); 
				match(COMMA);
				setState(87); 
				((ChartdataContext)_localctx).column = match(VARNAME);
				setState(88); 
				match(TWP);
				setState(89); 
				((ChartdataContext)_localctx).line = match(VARNAME);
				setState(90); 
				match(TWP);
				setState(91); 
				((ChartdataContext)_localctx).value = match(NUM);
				data.add((((ChartdataContext)_localctx).column!=null?((ChartdataContext)_localctx).column.getText():null), (((ChartdataContext)_localctx).line!=null?((ChartdataContext)_localctx).line.getText():null), (((ChartdataContext)_localctx).value!=null?((ChartdataContext)_localctx).value.getText():null));
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98); 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25h\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\"\n\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7>\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bJ\n"+
		"\b\f\b\16\bM\13\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\7\t`\n\t\f\t\16\tc\13\t\3\t\3\t\3\t\3\t\2\2\n\2\4\6\b"+
		"\n\f\16\20\2\2c\2\22\3\2\2\2\4!\3\2\2\2\6#\3\2\2\2\b*\3\2\2\2\n\61\3\2"+
		"\2\2\f=\3\2\2\2\16?\3\2\2\2\20Q\3\2\2\2\22\23\5\n\6\2\23\24\7\16\2\2\24"+
		"\25\5\4\3\2\25\26\7\f\2\2\26\27\5\f\7\2\27\30\b\2\1\2\30\3\3\2\2\2\31"+
		"\32\7\21\2\2\32\33\5\6\4\2\33\34\b\3\1\2\34\"\3\2\2\2\35\36\7\20\2\2\36"+
		"\37\5\b\5\2\37 \b\3\1\2 \"\3\2\2\2!\31\3\2\2\2!\35\3\2\2\2\"\5\3\2\2\2"+
		"#$\7\b\2\2$%\7\22\2\2%&\7\r\2\2&\'\7\22\2\2\'(\7\t\2\2()\b\4\1\2)\7\3"+
		"\2\2\2*+\7\b\2\2+,\7\22\2\2,-\7\r\2\2-.\7\22\2\2./\7\t\2\2/\60\b\5\1\2"+
		"\60\t\3\2\2\2\61\62\7\23\2\2\62\63\7\f\2\2\63\64\b\6\1\2\64\13\3\2\2\2"+
		"\65\66\7\3\2\2\66\67\5\16\b\2\678\b\7\1\28>\3\2\2\29:\7\4\2\2:;\5\20\t"+
		"\2;<\b\7\1\2<>\3\2\2\2=\65\3\2\2\2=9\3\2\2\2>\r\3\2\2\2?@\7\n\2\2@A\7"+
		"\23\2\2AB\7\f\2\2BC\7\22\2\2CK\b\b\1\2DE\7\5\2\2EF\7\23\2\2FG\7\f\2\2"+
		"GH\7\22\2\2HJ\b\b\1\2ID\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2"+
		"\2MK\3\2\2\2NO\7\13\2\2OP\b\b\1\2P\17\3\2\2\2QR\7\n\2\2RS\7\23\2\2ST\7"+
		"\f\2\2TU\7\23\2\2UV\7\f\2\2VW\7\22\2\2Wa\b\t\1\2XY\7\5\2\2YZ\7\23\2\2"+
		"Z[\7\f\2\2[\\\7\23\2\2\\]\7\f\2\2]^\7\22\2\2^`\b\t\1\2_X\3\2\2\2`c\3\2"+
		"\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\7\13\2\2ef\b\t\1\2f\21"+
		"\3\2\2\2\6!=Ka";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
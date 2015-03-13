// Generated from /home/pedronakibar/IdeaProjects/MyLang/MyLang.g4 by ANTLR 4.5
package gen;

import org.jfree.chart.ChartUtilities;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PIE=1, CHART=2, COMMA=3, DOTCOMMA=4, END=5, LPAR=6, RPAR=7, LBR=8, RBR=9, 
		TWP=10, X=11, SHOWAS=12, WINDOW=13, JPEG=14, PNG=15, NUM=16, VARNAME=17, 
		ASSIGNMENT=18, WS=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PIE", "CHART", "COMMA", "DOTCOMMA", "END", "LPAR", "RPAR", "LBR", "RBR", 
		"TWP", "X", "SHOWAS", "WINDOW", "JPEG", "PNG", "DIGIT", "ALPHA", "NUM", 
		"VARNAME", "ASSIGNMENT", "WS"
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


	public MyLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25{\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\6\23i\n\23\r\23\16\23j\3\24\6\24n\n\24\r\24\16\24"+
		"o\3\25\3\25\3\25\3\26\6\26v\n\26\r\26\16\26w\3\26\3\26\2\2\27\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\2"+
		"#\2%\22\'\23)\24+\25\3\2\5\3\2\62;\5\2C\\aac|\4\2\f\f\"\"{\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\3-\3\2\2\2\5\61\3\2\2\2\7\67\3\2\2\2\t9\3\2\2\2\13;\3"+
		"\2\2\2\r?\3\2\2\2\17A\3\2\2\2\21C\3\2\2\2\23E\3\2\2\2\25G\3\2\2\2\27I"+
		"\3\2\2\2\31K\3\2\2\2\33S\3\2\2\2\35Z\3\2\2\2\37_\3\2\2\2!c\3\2\2\2#e\3"+
		"\2\2\2%h\3\2\2\2\'m\3\2\2\2)q\3\2\2\2+u\3\2\2\2-.\7r\2\2./\7k\2\2/\60"+
		"\7g\2\2\60\4\3\2\2\2\61\62\7e\2\2\62\63\7j\2\2\63\64\7c\2\2\64\65\7t\2"+
		"\2\65\66\7v\2\2\66\6\3\2\2\2\678\7.\2\28\b\3\2\2\29:\7=\2\2:\n\3\2\2\2"+
		";<\7g\2\2<=\7p\2\2=>\7f\2\2>\f\3\2\2\2?@\7*\2\2@\16\3\2\2\2AB\7+\2\2B"+
		"\20\3\2\2\2CD\7}\2\2D\22\3\2\2\2EF\7\177\2\2F\24\3\2\2\2GH\7<\2\2H\26"+
		"\3\2\2\2IJ\7z\2\2J\30\3\2\2\2KL\7u\2\2LM\7j\2\2MN\7q\2\2NO\7y\2\2OP\7"+
		"\"\2\2PQ\7c\2\2QR\7u\2\2R\32\3\2\2\2ST\7y\2\2TU\7k\2\2UV\7p\2\2VW\7f\2"+
		"\2WX\7q\2\2XY\7y\2\2Y\34\3\2\2\2Z[\7l\2\2[\\\7r\2\2\\]\7g\2\2]^\7i\2\2"+
		"^\36\3\2\2\2_`\7r\2\2`a\7p\2\2ab\7i\2\2b \3\2\2\2cd\t\2\2\2d\"\3\2\2\2"+
		"ef\t\3\2\2f$\3\2\2\2gi\5!\21\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2"+
		"k&\3\2\2\2ln\5#\22\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2p(\3\2\2\2"+
		"qr\7<\2\2rs\7?\2\2s*\3\2\2\2tv\t\4\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2w"+
		"x\3\2\2\2xy\3\2\2\2yz\b\26\2\2z,\3\2\2\2\6\2jow\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
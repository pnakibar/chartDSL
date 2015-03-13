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
		TWP=10, WINDOW=11, JPG=12, PNG=13, NUM=14, VARNAME=15, ASSIGNMENT=16, 
		WS=17;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PIE", "CHART", "COMMA", "DOTCOMMA", "END", "LPAR", "RPAR", "LBR", "RBR", 
		"TWP", "WINDOW", "JPG", "PNG", "DIGIT", "ALPHA", "NUM", "VARNAME", "ASSIGNMENT", 
		"WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\23l\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\21\6\21Z\n\21\r\21\16\21[\3\22\6\22_\n\22\r\22\16\22`\3\23"+
		"\3\23\3\23\3\24\6\24g\n\24\r\24\16\24h\3\24\3\24\2\2\25\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\2\37\2!\20#\21%\22"+
		"\'\23\3\2\5\3\2\62;\5\2C\\aac|\4\2\f\f\"\"l\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5-\3\2\2\2\7"+
		"\63\3\2\2\2\t\65\3\2\2\2\13\67\3\2\2\2\r;\3\2\2\2\17=\3\2\2\2\21?\3\2"+
		"\2\2\23A\3\2\2\2\25C\3\2\2\2\27E\3\2\2\2\31L\3\2\2\2\33P\3\2\2\2\35T\3"+
		"\2\2\2\37V\3\2\2\2!Y\3\2\2\2#^\3\2\2\2%b\3\2\2\2\'f\3\2\2\2)*\7r\2\2*"+
		"+\7k\2\2+,\7g\2\2,\4\3\2\2\2-.\7e\2\2./\7j\2\2/\60\7c\2\2\60\61\7t\2\2"+
		"\61\62\7v\2\2\62\6\3\2\2\2\63\64\7.\2\2\64\b\3\2\2\2\65\66\7=\2\2\66\n"+
		"\3\2\2\2\678\7g\2\289\7p\2\29:\7f\2\2:\f\3\2\2\2;<\7*\2\2<\16\3\2\2\2"+
		"=>\7+\2\2>\20\3\2\2\2?@\7}\2\2@\22\3\2\2\2AB\7\177\2\2B\24\3\2\2\2CD\7"+
		"<\2\2D\26\3\2\2\2EF\7y\2\2FG\7k\2\2GH\7p\2\2HI\7f\2\2IJ\7q\2\2JK\7y\2"+
		"\2K\30\3\2\2\2LM\7l\2\2MN\7r\2\2NO\7i\2\2O\32\3\2\2\2PQ\7r\2\2QR\7p\2"+
		"\2RS\7i\2\2S\34\3\2\2\2TU\t\2\2\2U\36\3\2\2\2VW\t\3\2\2W \3\2\2\2XZ\5"+
		"\35\17\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\"\3\2\2\2]_\5\37\20"+
		"\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2a$\3\2\2\2bc\7<\2\2cd\7?\2\2"+
		"d&\3\2\2\2eg\t\4\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2ij\3\2\2\2"+
		"jk\b\24\2\2k(\3\2\2\2\6\2[`h\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
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
		TWP=10, X=11, CRUNCH=12, DOT=13, SHOWAS=14, WINDOW=15, JPEG=16, PNG=17, 
		NUM=18, DOUBLE=19, VARNAME=20, ASSIGNMENT=21, WS=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PIE", "CHART", "COMMA", "DOTCOMMA", "END", "LPAR", "RPAR", "LBR", "RBR", 
		"TWP", "X", "CRUNCH", "DOT", "SHOWAS", "WINDOW", "JPEG", "PNG", "DIGIT", 
		"ALPHA", "NUM", "DOUBLE", "VARNAME", "ASSIGNMENT", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30\u0089\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\6\25s\n\25\r\25\16\25t\3\26\3\26\3\26\3\26\3\27\6\27|\n\27"+
		"\r\27\16\27}\3\30\3\30\3\30\3\31\6\31\u0084\n\31\r\31\16\31\u0085\3\31"+
		"\3\31\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\2\'\2)\24+\25-\26/\27\61\30\3\2\5\3\2\62;"+
		"\5\2C\\aac|\4\2\f\f\"\"\u0089\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/"+
		"\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5\67\3\2\2\2\7=\3\2\2\2\t?\3\2\2\2"+
		"\13A\3\2\2\2\rE\3\2\2\2\17G\3\2\2\2\21I\3\2\2\2\23K\3\2\2\2\25M\3\2\2"+
		"\2\27O\3\2\2\2\31Q\3\2\2\2\33S\3\2\2\2\35U\3\2\2\2\37]\3\2\2\2!d\3\2\2"+
		"\2#i\3\2\2\2%m\3\2\2\2\'o\3\2\2\2)r\3\2\2\2+v\3\2\2\2-{\3\2\2\2/\177\3"+
		"\2\2\2\61\u0083\3\2\2\2\63\64\7r\2\2\64\65\7k\2\2\65\66\7g\2\2\66\4\3"+
		"\2\2\2\678\7e\2\289\7j\2\29:\7c\2\2:;\7t\2\2;<\7v\2\2<\6\3\2\2\2=>\7."+
		"\2\2>\b\3\2\2\2?@\7=\2\2@\n\3\2\2\2AB\7g\2\2BC\7p\2\2CD\7f\2\2D\f\3\2"+
		"\2\2EF\7*\2\2F\16\3\2\2\2GH\7+\2\2H\20\3\2\2\2IJ\7}\2\2J\22\3\2\2\2KL"+
		"\7\177\2\2L\24\3\2\2\2MN\7<\2\2N\26\3\2\2\2OP\7z\2\2P\30\3\2\2\2QR\7%"+
		"\2\2R\32\3\2\2\2ST\7\60\2\2T\34\3\2\2\2UV\7u\2\2VW\7j\2\2WX\7q\2\2XY\7"+
		"y\2\2YZ\7\"\2\2Z[\7c\2\2[\\\7u\2\2\\\36\3\2\2\2]^\7y\2\2^_\7k\2\2_`\7"+
		"p\2\2`a\7f\2\2ab\7q\2\2bc\7y\2\2c \3\2\2\2de\7l\2\2ef\7r\2\2fg\7g\2\2"+
		"gh\7i\2\2h\"\3\2\2\2ij\7r\2\2jk\7p\2\2kl\7i\2\2l$\3\2\2\2mn\t\2\2\2n&"+
		"\3\2\2\2op\t\3\2\2p(\3\2\2\2qs\5%\23\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2t"+
		"u\3\2\2\2u*\3\2\2\2vw\5)\25\2wx\5\33\16\2xy\5)\25\2y,\3\2\2\2z|\5\'\24"+
		"\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~.\3\2\2\2\177\u0080\7<\2\2"+
		"\u0080\u0081\7?\2\2\u0081\60\3\2\2\2\u0082\u0084\t\4\2\2\u0083\u0082\3"+
		"\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0088\b\31\2\2\u0088\62\3\2\2\2\6\2t}\u0085\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
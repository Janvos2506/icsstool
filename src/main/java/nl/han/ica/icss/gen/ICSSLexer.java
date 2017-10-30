// Generated from C:/Users/Jan/Desktop/startcode/src/main/antlr4/nl/han/ica/icss/parser\ICSS.g4 by ANTLR 4.7
package nl.han.ica.icss.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ICSSLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, HEXCODE=16, 
		INT=17, BOOLEAN=18, HEXDIGIT=19, VARIABLE=20, WORD=21, ADD=22, SUB=23, 
		GREATER=24, LESS=25, EQUAL=26, OR=27, WS=28, SPACE=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "HEXCODE", "INT", 
		"BOOLEAN", "HEXDIGIT", "VARIABLE", "WORD", "ADD", "SUB", "GREATER", "LESS", 
		"EQUAL", "OR", "WS", "SPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#'", "'.'", "'a'", "'b'", "'c'", "'d'", "'e'", "'f'", "':='", 
		"';'", "'{'", "'}'", "':'", "'-'", "'px'", null, null, null, null, null, 
		null, null, null, null, null, null, "'||'", null, "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "HEXCODE", "INT", "BOOLEAN", "HEXDIGIT", "VARIABLE", 
		"WORD", "ADD", "SUB", "GREATER", "LESS", "EQUAL", "OR", "WS", "SPACE"
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


	public ICSSLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ICSS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u0097\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21e\n\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23r\n\23\3\24\3\24\3\25\6\25w\n\25\r\25\16\25x\3\26"+
		"\6\26|\n\26\r\26\16\26}\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\34\3\35\6\35\u008e\n\35\r\35\16\35\u008f\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\2\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37\3\2\r\3\2%%\5\2\62;CHch\3\2\62;\4\2C\\aa\3\2c|\3"+
		"\2--\3\2//\3\2@@\3\2>>\3\2??\5\2\13\f\17\17\"\"\2\u009b\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2"+
		"\2\5?\3\2\2\2\7A\3\2\2\2\tC\3\2\2\2\13E\3\2\2\2\rG\3\2\2\2\17I\3\2\2\2"+
		"\21K\3\2\2\2\23M\3\2\2\2\25P\3\2\2\2\27R\3\2\2\2\31T\3\2\2\2\33V\3\2\2"+
		"\2\35X\3\2\2\2\37Z\3\2\2\2!]\3\2\2\2#f\3\2\2\2%q\3\2\2\2\'s\3\2\2\2)v"+
		"\3\2\2\2+{\3\2\2\2-\177\3\2\2\2/\u0081\3\2\2\2\61\u0083\3\2\2\2\63\u0085"+
		"\3\2\2\2\65\u0087\3\2\2\2\67\u0089\3\2\2\29\u008d\3\2\2\2;\u0093\3\2\2"+
		"\2=>\7%\2\2>\4\3\2\2\2?@\7\60\2\2@\6\3\2\2\2AB\7c\2\2B\b\3\2\2\2CD\7d"+
		"\2\2D\n\3\2\2\2EF\7e\2\2F\f\3\2\2\2GH\7f\2\2H\16\3\2\2\2IJ\7g\2\2J\20"+
		"\3\2\2\2KL\7h\2\2L\22\3\2\2\2MN\7<\2\2NO\7?\2\2O\24\3\2\2\2PQ\7=\2\2Q"+
		"\26\3\2\2\2RS\7}\2\2S\30\3\2\2\2TU\7\177\2\2U\32\3\2\2\2VW\7<\2\2W\34"+
		"\3\2\2\2XY\7/\2\2Y\36\3\2\2\2Z[\7r\2\2[\\\7z\2\2\\ \3\2\2\2]^\t\2\2\2"+
		"^_\t\3\2\2_`\t\3\2\2`d\t\3\2\2ab\t\3\2\2bc\t\3\2\2ce\t\3\2\2da\3\2\2\2"+
		"de\3\2\2\2e\"\3\2\2\2fg\t\4\2\2g$\3\2\2\2hi\7v\2\2ij\7t\2\2jk\7w\2\2k"+
		"r\7g\2\2lm\7h\2\2mn\7c\2\2no\7n\2\2op\7u\2\2pr\7g\2\2qh\3\2\2\2ql\3\2"+
		"\2\2r&\3\2\2\2st\t\3\2\2t(\3\2\2\2uw\t\5\2\2vu\3\2\2\2wx\3\2\2\2xv\3\2"+
		"\2\2xy\3\2\2\2y*\3\2\2\2z|\t\6\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2"+
		"\2\2~,\3\2\2\2\177\u0080\t\7\2\2\u0080.\3\2\2\2\u0081\u0082\t\b\2\2\u0082"+
		"\60\3\2\2\2\u0083\u0084\t\t\2\2\u0084\62\3\2\2\2\u0085\u0086\t\n\2\2\u0086"+
		"\64\3\2\2\2\u0087\u0088\t\13\2\2\u0088\66\3\2\2\2\u0089\u008a\7~\2\2\u008a"+
		"\u008b\7~\2\2\u008b8\3\2\2\2\u008c\u008e\t\f\2\2\u008d\u008c\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2"+
		"\2\2\u0091\u0092\b\35\2\2\u0092:\3\2\2\2\u0093\u0094\7\"\2\2\u0094\u0095"+
		"\3\2\2\2\u0095\u0096\b\36\2\2\u0096<\3\2\2\2\b\2dqx}\u008f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
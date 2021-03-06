// Generated from Cactus.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CactusLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ELSE=1, INT=2, MAIN=3, RETURN=4, WHILE=5, READ=6, WRITE=7, FI=8, IF=9, 
		ID=10, UID=11, CONST=12, ADD=13, SUB=14, MUL=15, DIV=16, MOD=17, ASSIGN=18, 
		EQU=19, NE=20, GE=21, GT=22, LE=23, LT=24, AND=25, OR=26, NOT=27, LP=28, 
		RP=29, LB=30, RB=31, SEMI=32, WS=33, COMMENT=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ELSE", "INT", "MAIN", "RETURN", "WHILE", "READ", "WRITE", "FI", "IF", 
			"ID", "UID", "CONST", "ADD", "SUB", "MUL", "DIV", "MOD", "ASSIGN", "EQU", 
			"NE", "GE", "GT", "LE", "LT", "AND", "OR", "NOT", "LP", "RP", "LB", "RB", 
			"SEMI", "WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'else'", "'int'", "'main'", "'return'", "'while'", "'read'", "'write'", 
			"'fi'", "'if'", null, null, null, "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'='", "'=='", "'!='", "'>='", "'>'", "'<='", "'<'", "'&&'", "'||'", 
			"'!'", "'('", "')'", "'{'", "'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ELSE", "INT", "MAIN", "RETURN", "WHILE", "READ", "WRITE", "FI", 
			"IF", "ID", "UID", "CONST", "ADD", "SUB", "MUL", "DIV", "MOD", "ASSIGN", 
			"EQU", "NE", "GE", "GT", "LE", "LT", "AND", "OR", "NOT", "LP", "RP", 
			"LB", "RB", "SEMI", "WS", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public CactusLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cactus.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u00cc\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\7\13"+
		"v\n\13\f\13\16\13y\13\13\3\f\3\f\7\f}\n\f\f\f\16\f\u0080\13\f\3\r\3\r"+
		"\3\r\7\r\u0085\n\r\f\r\16\r\u0088\13\r\5\r\u008a\n\r\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\""+
		"\6\"\u00bb\n\"\r\"\16\"\u00bc\3\"\3\"\3#\3#\3#\7#\u00c4\n#\f#\16#\u00c7"+
		"\13#\3#\3#\3#\3#\2\2$\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$\3\2\f\4\2aac|\5\2\62;aac|\4\2C\\aa\5\2"+
		"\62;C\\aa\3\2\62\62\3\2\63;\3\2\62;\5\2\13\f\17\17\"\"\4\2,,\61\61\3\2"+
		"\f\f\2\u00d1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\3G\3\2\2\2\5L\3\2\2\2\7P\3\2\2\2\tU\3\2\2\2\13\\\3\2\2\2\rb\3\2\2\2"+
		"\17g\3\2\2\2\21m\3\2\2\2\23p\3\2\2\2\25s\3\2\2\2\27z\3\2\2\2\31\u0089"+
		"\3\2\2\2\33\u008b\3\2\2\2\35\u008d\3\2\2\2\37\u008f\3\2\2\2!\u0091\3\2"+
		"\2\2#\u0093\3\2\2\2%\u0095\3\2\2\2\'\u0097\3\2\2\2)\u009a\3\2\2\2+\u009d"+
		"\3\2\2\2-\u00a0\3\2\2\2/\u00a2\3\2\2\2\61\u00a5\3\2\2\2\63\u00a7\3\2\2"+
		"\2\65\u00aa\3\2\2\2\67\u00ad\3\2\2\29\u00af\3\2\2\2;\u00b1\3\2\2\2=\u00b3"+
		"\3\2\2\2?\u00b5\3\2\2\2A\u00b7\3\2\2\2C\u00ba\3\2\2\2E\u00c0\3\2\2\2G"+
		"H\7g\2\2HI\7n\2\2IJ\7u\2\2JK\7g\2\2K\4\3\2\2\2LM\7k\2\2MN\7p\2\2NO\7v"+
		"\2\2O\6\3\2\2\2PQ\7o\2\2QR\7c\2\2RS\7k\2\2ST\7p\2\2T\b\3\2\2\2UV\7t\2"+
		"\2VW\7g\2\2WX\7v\2\2XY\7w\2\2YZ\7t\2\2Z[\7p\2\2[\n\3\2\2\2\\]\7y\2\2]"+
		"^\7j\2\2^_\7k\2\2_`\7n\2\2`a\7g\2\2a\f\3\2\2\2bc\7t\2\2cd\7g\2\2de\7c"+
		"\2\2ef\7f\2\2f\16\3\2\2\2gh\7y\2\2hi\7t\2\2ij\7k\2\2jk\7v\2\2kl\7g\2\2"+
		"l\20\3\2\2\2mn\7h\2\2no\7k\2\2o\22\3\2\2\2pq\7k\2\2qr\7h\2\2r\24\3\2\2"+
		"\2sw\t\2\2\2tv\t\3\2\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\26\3\2"+
		"\2\2yw\3\2\2\2z~\t\4\2\2{}\t\5\2\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2"+
		"~\177\3\2\2\2\177\30\3\2\2\2\u0080~\3\2\2\2\u0081\u008a\t\6\2\2\u0082"+
		"\u0086\t\7\2\2\u0083\u0085\t\b\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2"+
		"\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u008a\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0089\u0081\3\2\2\2\u0089\u0082\3\2\2\2\u008a\32\3\2\2"+
		"\2\u008b\u008c\7-\2\2\u008c\34\3\2\2\2\u008d\u008e\7/\2\2\u008e\36\3\2"+
		"\2\2\u008f\u0090\7,\2\2\u0090 \3\2\2\2\u0091\u0092\7\61\2\2\u0092\"\3"+
		"\2\2\2\u0093\u0094\7\'\2\2\u0094$\3\2\2\2\u0095\u0096\7?\2\2\u0096&\3"+
		"\2\2\2\u0097\u0098\7?\2\2\u0098\u0099\7?\2\2\u0099(\3\2\2\2\u009a\u009b"+
		"\7#\2\2\u009b\u009c\7?\2\2\u009c*\3\2\2\2\u009d\u009e\7@\2\2\u009e\u009f"+
		"\7?\2\2\u009f,\3\2\2\2\u00a0\u00a1\7@\2\2\u00a1.\3\2\2\2\u00a2\u00a3\7"+
		">\2\2\u00a3\u00a4\7?\2\2\u00a4\60\3\2\2\2\u00a5\u00a6\7>\2\2\u00a6\62"+
		"\3\2\2\2\u00a7\u00a8\7(\2\2\u00a8\u00a9\7(\2\2\u00a9\64\3\2\2\2\u00aa"+
		"\u00ab\7~\2\2\u00ab\u00ac\7~\2\2\u00ac\66\3\2\2\2\u00ad\u00ae\7#\2\2\u00ae"+
		"8\3\2\2\2\u00af\u00b0\7*\2\2\u00b0:\3\2\2\2\u00b1\u00b2\7+\2\2\u00b2<"+
		"\3\2\2\2\u00b3\u00b4\7}\2\2\u00b4>\3\2\2\2\u00b5\u00b6\7\177\2\2\u00b6"+
		"@\3\2\2\2\u00b7\u00b8\7=\2\2\u00b8B\3\2\2\2\u00b9\u00bb\t\t\2\2\u00ba"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\b\"\2\2\u00bfD\3\2\2\2\u00c0\u00c1"+
		"\t\n\2\2\u00c1\u00c5\t\n\2\2\u00c2\u00c4\n\13\2\2\u00c3\u00c2\3\2\2\2"+
		"\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8"+
		"\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\t\13\2\2\u00c9\u00ca\3\2\2\2"+
		"\u00ca\u00cb\b#\2\2\u00cbF\3\2\2\2\t\2w~\u0086\u0089\u00bc\u00c5\3\b\2"+
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
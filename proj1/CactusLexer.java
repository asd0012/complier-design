// Generated from Cactus.g4 by ANTLR 4.5.2
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
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ELSE=1, ID=2, UID=3, CONST=4, ADD=5, SUB=6, MUL=7, DIV=8, MOD=9, EQU=10, 
		NE=11, GT=12, GE=13, LT=14, LE=15, AND=16, OR=17, NOT=18, ASSIGN=19, LBRACKET=20, 
		RBRACKET=21, LCBRACKET=22, RCBRACKET=23, SEMI=24, FI=25, IF=26, INT=27, 
		MAIN=28, RETURN=29, WHILE=30, READ=31, WRITE=32, COMMENT=33, WSPACE=34;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ELSE", "ID", "UID", "CONST", "ADD", "SUB", "MUL", "DIV", "MOD", "EQU", 
		"NE", "GT", "GE", "LT", "LE", "AND", "OR", "NOT", "ASSIGN", "LBRACKET", 
		"RBRACKET", "LCBRACKET", "RCBRACKET", "SEMI", "FI", "IF", "INT", "MAIN", 
		"RETURN", "WHILE", "READ", "WRITE", "COMMENT", "WSPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'else'", null, null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'=='", 
		"'!='", "'>'", "'>='", "'<'", "'<='", "'&&'", "'||'", "'!'", "'='", "'('", 
		"')'", "'{'", "'}'", "';'", "'fi'", "'if'", "'int'", "'main'", "'return'", 
		"'while'", "'read'", "'write'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ELSE", "ID", "UID", "CONST", "ADD", "SUB", "MUL", "DIV", "MOD", 
		"EQU", "NE", "GT", "GE", "LT", "LE", "AND", "OR", "NOT", "ASSIGN", "LBRACKET", 
		"RBRACKET", "LCBRACKET", "RCBRACKET", "SEMI", "FI", "IF", "INT", "MAIN", 
		"RETURN", "WHILE", "READ", "WRITE", "COMMENT", "WSPACE"
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
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2$\u00cf\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\3\3\3\3\7\3O\n\3\f\3\16\3R\13\3"+
		"\3\4\3\4\7\4V\n\4\f\4\16\4Y\13\4\3\5\3\5\5\5]\n\5\3\5\3\5\7\5a\n\5\f\5"+
		"\16\5d\13\5\5\5f\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\""+
		"\7\"\u00c0\n\"\f\"\16\"\u00c3\13\"\3\"\3\"\3\"\3\"\3#\6#\u00ca\n#\r#\16"+
		"#\u00cb\3#\3#\2\2$\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$\3\2\r\4\2aac|\5\2\62;aac|\4\2C\\aa\5\2"+
		"\62;C\\aa\3\2\62\62\3\2//\3\2\63;\3\2\62;\4\2,,\61\61\3\2\f\f\4\2\13\f"+
		"\"\"\u00d5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\3G\3\2\2\2\5L\3\2\2\2\7S\3\2\2\2\te\3\2\2\2\13g\3\2\2\2\ri\3\2\2\2\17"+
		"k\3\2\2\2\21m\3\2\2\2\23o\3\2\2\2\25q\3\2\2\2\27t\3\2\2\2\31w\3\2\2\2"+
		"\33y\3\2\2\2\35|\3\2\2\2\37~\3\2\2\2!\u0081\3\2\2\2#\u0084\3\2\2\2%\u0087"+
		"\3\2\2\2\'\u0089\3\2\2\2)\u008b\3\2\2\2+\u008d\3\2\2\2-\u008f\3\2\2\2"+
		"/\u0091\3\2\2\2\61\u0093\3\2\2\2\63\u0095\3\2\2\2\65\u0098\3\2\2\2\67"+
		"\u009b\3\2\2\29\u009f\3\2\2\2;\u00a4\3\2\2\2=\u00ab\3\2\2\2?\u00b1\3\2"+
		"\2\2A\u00b6\3\2\2\2C\u00bc\3\2\2\2E\u00c9\3\2\2\2GH\7g\2\2HI\7n\2\2IJ"+
		"\7u\2\2JK\7g\2\2K\4\3\2\2\2LP\t\2\2\2MO\t\3\2\2NM\3\2\2\2OR\3\2\2\2PN"+
		"\3\2\2\2PQ\3\2\2\2Q\6\3\2\2\2RP\3\2\2\2SW\t\4\2\2TV\t\5\2\2UT\3\2\2\2"+
		"VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\b\3\2\2\2YW\3\2\2\2Zf\t\6\2\2[]\t\7\2"+
		"\2\\[\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^b\t\b\2\2_a\t\t\2\2`_\3\2\2\2ad\3\2"+
		"\2\2b`\3\2\2\2bc\3\2\2\2cf\3\2\2\2db\3\2\2\2eZ\3\2\2\2e\\\3\2\2\2f\n\3"+
		"\2\2\2gh\7-\2\2h\f\3\2\2\2ij\7/\2\2j\16\3\2\2\2kl\7,\2\2l\20\3\2\2\2m"+
		"n\7\61\2\2n\22\3\2\2\2op\7\'\2\2p\24\3\2\2\2qr\7?\2\2rs\7?\2\2s\26\3\2"+
		"\2\2tu\7#\2\2uv\7?\2\2v\30\3\2\2\2wx\7@\2\2x\32\3\2\2\2yz\7@\2\2z{\7?"+
		"\2\2{\34\3\2\2\2|}\7>\2\2}\36\3\2\2\2~\177\7>\2\2\177\u0080\7?\2\2\u0080"+
		" \3\2\2\2\u0081\u0082\7(\2\2\u0082\u0083\7(\2\2\u0083\"\3\2\2\2\u0084"+
		"\u0085\7~\2\2\u0085\u0086\7~\2\2\u0086$\3\2\2\2\u0087\u0088\7#\2\2\u0088"+
		"&\3\2\2\2\u0089\u008a\7?\2\2\u008a(\3\2\2\2\u008b\u008c\7*\2\2\u008c*"+
		"\3\2\2\2\u008d\u008e\7+\2\2\u008e,\3\2\2\2\u008f\u0090\7}\2\2\u0090.\3"+
		"\2\2\2\u0091\u0092\7\177\2\2\u0092\60\3\2\2\2\u0093\u0094\7=\2\2\u0094"+
		"\62\3\2\2\2\u0095\u0096\7h\2\2\u0096\u0097\7k\2\2\u0097\64\3\2\2\2\u0098"+
		"\u0099\7k\2\2\u0099\u009a\7h\2\2\u009a\66\3\2\2\2\u009b\u009c\7k\2\2\u009c"+
		"\u009d\7p\2\2\u009d\u009e\7v\2\2\u009e8\3\2\2\2\u009f\u00a0\7o\2\2\u00a0"+
		"\u00a1\7c\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7p\2\2\u00a3:\3\2\2\2\u00a4"+
		"\u00a5\7t\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a8\7w\2\2"+
		"\u00a8\u00a9\7t\2\2\u00a9\u00aa\7p\2\2\u00aa<\3\2\2\2\u00ab\u00ac\7y\2"+
		"\2\u00ac\u00ad\7j\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7n\2\2\u00af\u00b0"+
		"\7g\2\2\u00b0>\3\2\2\2\u00b1\u00b2\7t\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4"+
		"\7c\2\2\u00b4\u00b5\7f\2\2\u00b5@\3\2\2\2\u00b6\u00b7\7y\2\2\u00b7\u00b8"+
		"\7t\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7v\2\2\u00ba\u00bb\7g\2\2\u00bb"+
		"B\3\2\2\2\u00bc\u00bd\t\n\2\2\u00bd\u00c1\t\n\2\2\u00be\u00c0\n\13\2\2"+
		"\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2"+
		"\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\t\13\2\2"+
		"\u00c5\u00c6\3\2\2\2\u00c6\u00c7\b\"\2\2\u00c7D\3\2\2\2\u00c8\u00ca\t"+
		"\f\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\b#\2\2\u00ceF\3\2\2\2\n"+
		"\2PW\\be\u00c1\u00cb\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
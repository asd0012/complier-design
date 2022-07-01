// Generated from Cactus.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CactusParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ELSE=1, ID=2, UID=3, CONST=4, ADD=5, SUB=6, MUL=7, DIV=8, MOD=9, EQU=10, 
		NE=11, GT=12, GE=13, LT=14, LE=15, AND=16, OR=17, NOT=18, ASSIGN=19, LBRACKET=20, 
		RBRACKET=21, LCBRACKET=22, RCBRACKET=23, SEMI=24, FI=25, IF=26, INT=27, 
		MAIN=28, RETURN=29, WHILE=30, READ=31, WRITE=32, COMMENT=33, WSPACE=34;
	public static final int
		RULE_token = 0;
	public static final String[] ruleNames = {
		"token"
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

	@Override
	public String getGrammarFileName() { return "Cactus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CactusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TokenContext extends ParserRuleContext {
		public List<TerminalNode> ELSE() { return getTokens(CactusParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(CactusParser.ELSE, i);
		}
		public List<TerminalNode> ID() { return getTokens(CactusParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CactusParser.ID, i);
		}
		public List<TerminalNode> UID() { return getTokens(CactusParser.UID); }
		public TerminalNode UID(int i) {
			return getToken(CactusParser.UID, i);
		}
		public List<TerminalNode> CONST() { return getTokens(CactusParser.CONST); }
		public TerminalNode CONST(int i) {
			return getToken(CactusParser.CONST, i);
		}
		public List<TerminalNode> ADD() { return getTokens(CactusParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(CactusParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(CactusParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(CactusParser.SUB, i);
		}
		public List<TerminalNode> MUL() { return getTokens(CactusParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(CactusParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(CactusParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(CactusParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(CactusParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(CactusParser.MOD, i);
		}
		public List<TerminalNode> EQU() { return getTokens(CactusParser.EQU); }
		public TerminalNode EQU(int i) {
			return getToken(CactusParser.EQU, i);
		}
		public List<TerminalNode> NE() { return getTokens(CactusParser.NE); }
		public TerminalNode NE(int i) {
			return getToken(CactusParser.NE, i);
		}
		public List<TerminalNode> GT() { return getTokens(CactusParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(CactusParser.GT, i);
		}
		public List<TerminalNode> GE() { return getTokens(CactusParser.GE); }
		public TerminalNode GE(int i) {
			return getToken(CactusParser.GE, i);
		}
		public List<TerminalNode> LT() { return getTokens(CactusParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(CactusParser.LT, i);
		}
		public List<TerminalNode> LE() { return getTokens(CactusParser.LE); }
		public TerminalNode LE(int i) {
			return getToken(CactusParser.LE, i);
		}
		public List<TerminalNode> AND() { return getTokens(CactusParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(CactusParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(CactusParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(CactusParser.OR, i);
		}
		public List<TerminalNode> NOT() { return getTokens(CactusParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(CactusParser.NOT, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(CactusParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(CactusParser.ASSIGN, i);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(CactusParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(CactusParser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(CactusParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(CactusParser.RBRACKET, i);
		}
		public List<TerminalNode> LCBRACKET() { return getTokens(CactusParser.LCBRACKET); }
		public TerminalNode LCBRACKET(int i) {
			return getToken(CactusParser.LCBRACKET, i);
		}
		public List<TerminalNode> RCBRACKET() { return getTokens(CactusParser.RCBRACKET); }
		public TerminalNode RCBRACKET(int i) {
			return getToken(CactusParser.RCBRACKET, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(CactusParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CactusParser.SEMI, i);
		}
		public List<TerminalNode> FI() { return getTokens(CactusParser.FI); }
		public TerminalNode FI(int i) {
			return getToken(CactusParser.FI, i);
		}
		public List<TerminalNode> IF() { return getTokens(CactusParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(CactusParser.IF, i);
		}
		public List<TerminalNode> INT() { return getTokens(CactusParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(CactusParser.INT, i);
		}
		public List<TerminalNode> MAIN() { return getTokens(CactusParser.MAIN); }
		public TerminalNode MAIN(int i) {
			return getToken(CactusParser.MAIN, i);
		}
		public List<TerminalNode> RETURN() { return getTokens(CactusParser.RETURN); }
		public TerminalNode RETURN(int i) {
			return getToken(CactusParser.RETURN, i);
		}
		public List<TerminalNode> WHILE() { return getTokens(CactusParser.WHILE); }
		public TerminalNode WHILE(int i) {
			return getToken(CactusParser.WHILE, i);
		}
		public List<TerminalNode> READ() { return getTokens(CactusParser.READ); }
		public TerminalNode READ(int i) {
			return getToken(CactusParser.READ, i);
		}
		public List<TerminalNode> WRITE() { return getTokens(CactusParser.WRITE); }
		public TerminalNode WRITE(int i) {
			return getToken(CactusParser.WRITE, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(CactusParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(CactusParser.COMMENT, i);
		}
		public List<TerminalNode> WSPACE() { return getTokens(CactusParser.WSPACE); }
		public TerminalNode WSPACE(int i) {
			return getToken(CactusParser.WSPACE, i);
		}
		public TokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitToken(this);
		}
	}

	public final TokenContext token() throws RecognitionException {
		TokenContext _localctx = new TokenContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_token);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(5);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ELSE) | (1L << ID) | (1L << UID) | (1L << CONST) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << MOD) | (1L << EQU) | (1L << NE) | (1L << GT) | (1L << GE) | (1L << LT) | (1L << LE) | (1L << AND) | (1L << OR) | (1L << NOT) | (1L << ASSIGN) | (1L << LBRACKET) | (1L << RBRACKET) | (1L << LCBRACKET) | (1L << RCBRACKET) | (1L << SEMI) | (1L << FI) | (1L << IF) | (1L << INT) | (1L << MAIN) | (1L << RETURN) | (1L << WHILE) | (1L << READ) | (1L << WRITE) | (1L << COMMENT) | (1L << WSPACE))) != 0)) {
				{
				{
				setState(2);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ELSE) | (1L << ID) | (1L << UID) | (1L << CONST) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << MOD) | (1L << EQU) | (1L << NE) | (1L << GT) | (1L << GE) | (1L << LT) | (1L << LE) | (1L << AND) | (1L << OR) | (1L << NOT) | (1L << ASSIGN) | (1L << LBRACKET) | (1L << RBRACKET) | (1L << LCBRACKET) | (1L << RCBRACKET) | (1L << SEMI) | (1L << FI) | (1L << IF) | (1L << INT) | (1L << MAIN) | (1L << RETURN) | (1L << WHILE) | (1L << READ) | (1L << WRITE) | (1L << COMMENT) | (1L << WSPACE))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(7);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3$\13\4\2\t\2\3\2\7"+
		"\2\6\n\2\f\2\16\2\t\13\2\3\2\2\2\3\2\2\3\3\2\3$\n\2\7\3\2\2\2\4\6\t\2"+
		"\2\2\5\4\3\2\2\2\6\t\3\2\2\2\7\5\3\2\2\2\7\b\3\2\2\2\b\3\3\2\2\2\t\7\3"+
		"\2\2\2\3\7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
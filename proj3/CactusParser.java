// Generated from Cactus.g4 by ANTLR 4.7.2
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
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ELSE=1, INT=2, MAIN=3, RETURN=4, WHILE=5, READ=6, WRITE=7, FI=8, IF=9, 
		ID=10, UID=11, CONST=12, ADD=13, SUB=14, MUL=15, DIV=16, MOD=17, ASSIGN=18, 
		EQU=19, NE=20, GE=21, GT=22, LE=23, LT=24, AND=25, OR=26, NOT=27, LP=28, 
		RP=29, LB=30, RB=31, SEMI=32, WS=33, COMMENT=34;
	public static final int
		RULE_program = 0, RULE_declarations = 1, RULE_statements = 2, RULE_statement = 3, 
		RULE_else_statement = 4, RULE_bool_expression = 5, RULE_bool_expression1 = 6, 
		RULE_bool_term = 7, RULE_bool_term1 = 8, RULE_bool_factor = 9, RULE_rel_expression = 10, 
		RULE_relation_op = 11, RULE_arith_expression = 12, RULE_arith_expression1 = 13, 
		RULE_arith_term = 14, RULE_arith_term1 = 15, RULE_arith_factor = 16, RULE_primary_expression = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declarations", "statements", "statement", "else_statement", 
			"bool_expression", "bool_expression1", "bool_term", "bool_term1", "bool_factor", 
			"rel_expression", "relation_op", "arith_expression", "arith_expression1", 
			"arith_term", "arith_term1", "arith_factor", "primary_expression"
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

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(CactusParser.MAIN, 0); }
		public TerminalNode LP() { return getToken(CactusParser.LP, 0); }
		public TerminalNode RP() { return getToken(CactusParser.RP, 0); }
		public TerminalNode LB() { return getToken(CactusParser.LB, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode RB() { return getToken(CactusParser.RB, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(MAIN);
			setState(37);
			match(LP);
			setState(38);
			match(RP);
			setState(39);
			match(LB);
				 System.out.println("\t" + ".data");
			setState(41);
			declarations();

					System.out.println("\t" + ".text");
					System.out.println("main:");
				
			setState(43);
			statements(0,1);
			setState(44);
			match(RB);
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

	public static class DeclarationsContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode INT() { return getToken(CactusParser.INT, 0); }
		public TerminalNode ID() { return getToken(CactusParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(CactusParser.SEMI, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitDeclarations(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarations);
		try {
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				match(INT);
				setState(47);
				((DeclarationsContext)_localctx).ID = match(ID);

					System.out.println((((DeclarationsContext)_localctx).ID!=null?((DeclarationsContext)_localctx).ID.getText():null)+":\t.word\t0");	


				setState(49);
				match(SEMI);
				setState(50);
				declarations();
				}
				break;
			case RETURN:
			case WHILE:
			case READ:
			case WRITE:
			case IF:
			case ID:
			case RB:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class StatementsContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int nreg;
		public int nlabel;
		public StatementContext statement;
		public StatementsContext statements;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StatementsContext(ParserRuleContext parent, int invokingState, int reg, int label) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements(int reg,int label) throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState(), reg, label);
		enterRule(_localctx, 4, RULE_statements);
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
			case WHILE:
			case READ:
			case WRITE:
			case IF:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				((StatementsContext)_localctx).statement = statement(_localctx.reg,_localctx.label);
				setState(55);
				((StatementsContext)_localctx).statements = statements(((StatementsContext)_localctx).statement.nreg,((StatementsContext)_localctx).statement.nlabel);

					((StatementsContext)_localctx).nreg = ((StatementsContext)_localctx).statements.nreg;
					((StatementsContext)_localctx).nlabel = ((StatementsContext)_localctx).statements.nlabel;

				}
				break;
			case RB:
				enterOuterAlt(_localctx, 2);
				{

					((StatementsContext)_localctx).nreg = _localctx.reg;
					((StatementsContext)_localctx).nlabel = _localctx.label;

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

	public static class StatementContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int nreg;
		public int nlabel;
		public Token ID;
		public Arith_expressionContext arith_expression;
		public Bool_expressionContext bool_expression;
		public StatementsContext statements;
		public Else_statementContext else_statement;
		public TerminalNode ID() { return getToken(CactusParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(CactusParser.ASSIGN, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CactusParser.SEMI, 0); }
		public TerminalNode IF() { return getToken(CactusParser.IF, 0); }
		public TerminalNode LP() { return getToken(CactusParser.LP, 0); }
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(CactusParser.RP, 0); }
		public TerminalNode LB() { return getToken(CactusParser.LB, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode RB() { return getToken(CactusParser.RB, 0); }
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(CactusParser.WHILE, 0); }
		public TerminalNode READ() { return getToken(CactusParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(CactusParser.WRITE, 0); }
		public TerminalNode RETURN() { return getToken(CactusParser.RETURN, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StatementContext(ParserRuleContext parent, int invokingState, int reg, int label) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement(int reg,int label) throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState(), reg, label);
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				((StatementContext)_localctx).ID = match(ID);
				setState(62);
				match(ASSIGN);
				setState(63);
				((StatementContext)_localctx).arith_expression = arith_expression(_localctx.reg,_localctx.label);

					System.out.println("\tla\t$t"+((StatementContext)_localctx).arith_expression.nreg+", "+(((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null));
					System.out.println("\tsw\t$t"+((StatementContext)_localctx).arith_expression.place+", 0($t"+((StatementContext)_localctx).arith_expression.nreg+")");
					((StatementContext)_localctx).nreg =  ((StatementContext)_localctx).arith_expression.nreg-1;
					((StatementContext)_localctx).nlabel = ((StatementContext)_localctx).arith_expression.nlabel;

				setState(65);
				match(SEMI);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(IF);
				setState(68);
				match(LP);

					int b_true=_localctx.label++;
					int b_false=_localctx.label++;
					//int b_next=_localctx.label++;

				setState(70);
				((StatementContext)_localctx).bool_expression = bool_expression(_localctx.reg,_localctx.label,b_true,b_false);
				setState(71);
				match(RP);
				setState(72);
				match(LB);

					System.out.println("L"+b_true+":");

				setState(74);
				((StatementContext)_localctx).statements = statements(((StatementContext)_localctx).bool_expression.nreg,((StatementContext)_localctx).bool_expression.nlabel);
				setState(75);
				match(RB);
				setState(76);
				((StatementContext)_localctx).else_statement = else_statement(((StatementContext)_localctx).statements.nreg,((StatementContext)_localctx).statements.nlabel,b_false);

					((StatementContext)_localctx).nreg = ((StatementContext)_localctx).else_statement.nreg;
					((StatementContext)_localctx).nlabel = ((StatementContext)_localctx).else_statement.nlabel;

				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{

					int L_Begin=_localctx.label++;
					System.out.println("L"+L_Begin+":");

				setState(80);
				match(WHILE);
				setState(81);
				match(LP);

					int b_true=_localctx.label++;
					int b_false=_localctx.label++;

				setState(83);
				((StatementContext)_localctx).bool_expression = bool_expression(_localctx.reg,_localctx.label,b_true,b_false);
				setState(84);
				match(RP);
				setState(85);
				match(LB);

					System.out.println("L"+b_true+":");

				setState(87);
				((StatementContext)_localctx).statements = statements(((StatementContext)_localctx).bool_expression.nreg,((StatementContext)_localctx).bool_expression.nlabel);

					System.out.println("\tb\tL"+L_Begin);

				setState(89);
				match(RB);

					System.out.println("L"+b_false+":");
					((StatementContext)_localctx).nreg = ((StatementContext)_localctx).statements.nreg;
					((StatementContext)_localctx).nlabel = ((StatementContext)_localctx).statements.nlabel;

				}
				break;
			case READ:
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				match(READ);
				setState(93);
				((StatementContext)_localctx).ID = match(ID);

					System.out.println("\tli\t$vo, 5");
					System.out.println("\tsyscall");
					System.out.println("\tla\t$t"+_localctx.reg+", "+(((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null));
					System.out.println("\tsw\t$vo, 0($t"+_localctx.reg+")");
					((StatementContext)_localctx).nreg = _localctx.reg;
					((StatementContext)_localctx).nlabel = _localctx.label;

				setState(95);
				match(SEMI);
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 5);
				{
				setState(96);
				match(WRITE);
				setState(97);
				((StatementContext)_localctx).arith_expression = arith_expression(_localctx.reg,_localctx.label);

					System.out.println("\tmove\t$a0, $t"+((StatementContext)_localctx).arith_expression.place);
					System.out.println("\tli\t$v0, 1");
					System.out.println("\tsyscall");
					((StatementContext)_localctx).nreg = ((StatementContext)_localctx).arith_expression.nreg;
					((StatementContext)_localctx).nlabel = ((StatementContext)_localctx).arith_expression.nlabel;

				setState(99);
				match(SEMI);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 6);
				{
				setState(101);
				match(RETURN);

					System.out.println("\tli\t$vo, 10");
					System.out.println("\tsyscall");
					((StatementContext)_localctx).nreg = 0;
					((StatementContext)_localctx).nlabel = _localctx.label;

				setState(103);
				match(SEMI);
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

	public static class Else_statementContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int b_false;
		public int nreg;
		public int nlabel;
		public StatementsContext statements;
		public TerminalNode ELSE() { return getToken(CactusParser.ELSE, 0); }
		public TerminalNode LB() { return getToken(CactusParser.LB, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode RB() { return getToken(CactusParser.RB, 0); }
		public TerminalNode FI() { return getToken(CactusParser.FI, 0); }
		public Else_statementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Else_statementContext(ParserRuleContext parent, int invokingState, int reg, int label, int b_false) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
			this.b_false = b_false;
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterElse_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitElse_statement(this);
		}
	}

	public final Else_statementContext else_statement(int reg,int label,int b_false) throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState(), reg, label, b_false);
		enterRule(_localctx, 8, RULE_else_statement);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(ELSE);
				setState(107);
				match(LB);

					int b_next=_localctx.label+1;
					System.out.println("\tb\t:"+b_next);
					System.out.println("L"+_localctx.b_false+":");

				setState(109);
				((Else_statementContext)_localctx).statements = statements(_localctx.reg,_localctx.label);

					System.out.println("L"+b_next+":");
					((Else_statementContext)_localctx).nreg = ((Else_statementContext)_localctx).statements.nreg;
					((Else_statementContext)_localctx).nlabel = ((Else_statementContext)_localctx).statements.nlabel;

				setState(111);
				match(RB);

					System.out.println("L"+_localctx.b_false+":");
					((Else_statementContext)_localctx).nreg = _localctx.reg;
					((Else_statementContext)_localctx).nlabel = _localctx.label;

				setState(113);
				match(FI);
				}
				break;
			case FI:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(FI);

					System.out.println("L"+_localctx.b_false+":");

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

	public static class Bool_expressionContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int b_true;
		public int b_false;
		public int nreg;
		public int nlabel;
		public Bool_termContext bool_term;
		public Bool_expression1Context bool_expression1;
		public Bool_termContext bool_term() {
			return getRuleContext(Bool_termContext.class,0);
		}
		public Bool_expression1Context bool_expression1() {
			return getRuleContext(Bool_expression1Context.class,0);
		}
		public Bool_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Bool_expressionContext(ParserRuleContext parent, int invokingState, int reg, int label, int b_true, int b_false) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
			this.b_true = b_true;
			this.b_false = b_false;
		}
		@Override public int getRuleIndex() { return RULE_bool_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterBool_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitBool_expression(this);
		}
	}

	public final Bool_expressionContext bool_expression(int reg,int label,int b_true,int b_false) throws RecognitionException {
		Bool_expressionContext _localctx = new Bool_expressionContext(_ctx, getState(), reg, label, b_true, b_false);
		enterRule(_localctx, 10, RULE_bool_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{

				int bt_f=_localctx.label++;

			setState(120);
			((Bool_expressionContext)_localctx).bool_term = bool_term(_localctx.reg,_localctx.label,_localctx.b_true,bt_f);
			setState(121);
			((Bool_expressionContext)_localctx).bool_expression1 = bool_expression1(((Bool_expressionContext)_localctx).bool_term.nreg, ((Bool_expressionContext)_localctx).bool_term.nlabel, _localctx.b_true,_localctx.b_false,bt_f);

				((Bool_expressionContext)_localctx).nreg = ((Bool_expressionContext)_localctx).bool_expression1.nreg;
				((Bool_expressionContext)_localctx).nlabel = ((Bool_expressionContext)_localctx).bool_expression1.nlabel;

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

	public static class Bool_expression1Context extends ParserRuleContext {
		public int reg;
		public int label;
		public int b_true;
		public int b_false;
		public int bt_f;
		public int nreg;
		public int nlabel;
		public Bool_termContext bool_term;
		public Bool_expression1Context bool_expression1;
		public TerminalNode OR() { return getToken(CactusParser.OR, 0); }
		public Bool_termContext bool_term() {
			return getRuleContext(Bool_termContext.class,0);
		}
		public Bool_expression1Context bool_expression1() {
			return getRuleContext(Bool_expression1Context.class,0);
		}
		public Bool_expression1Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Bool_expression1Context(ParserRuleContext parent, int invokingState, int reg, int label, int b_true, int b_false, int bt_f) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
			this.b_true = b_true;
			this.b_false = b_false;
			this.bt_f = bt_f;
		}
		@Override public int getRuleIndex() { return RULE_bool_expression1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterBool_expression1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitBool_expression1(this);
		}
	}

	public final Bool_expression1Context bool_expression1(int reg,int label,int b_true,int b_false,int bt_f) throws RecognitionException {
		Bool_expression1Context _localctx = new Bool_expression1Context(_ctx, getState(), reg, label, b_true, b_false, bt_f);
		enterRule(_localctx, 12, RULE_bool_expression1);
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(OR);

					System.out.println("L"+_localctx.bt_f+":");
					((Bool_expression1Context)_localctx).bt_f = _localctx.label++;

				setState(126);
				((Bool_expression1Context)_localctx).bool_term = bool_term(_localctx.reg,_localctx.label,_localctx.b_true,_localctx.bt_f);
				setState(127);
				((Bool_expression1Context)_localctx).bool_expression1 = bool_expression1(((Bool_expression1Context)_localctx).bool_term.nreg,((Bool_expression1Context)_localctx).bool_term.nlabel,_localctx.b_true,_localctx.b_false,_localctx.bt_f);

					((Bool_expression1Context)_localctx).nreg = ((Bool_expression1Context)_localctx).bool_expression1.nreg;
					((Bool_expression1Context)_localctx).nlabel = ((Bool_expression1Context)_localctx).bool_expression1.nlabel;

				}
				break;
			case RP:
				enterOuterAlt(_localctx, 2);
				{

					System.out.println("L"+_localctx.bt_f+":");
					System.out.println("\tb L"+_localctx.b_false);
					((Bool_expression1Context)_localctx).nreg = _localctx.reg;
					((Bool_expression1Context)_localctx).nlabel = _localctx.label;

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

	public static class Bool_termContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int b_true;
		public int b_false;
		public int nreg;
		public int nlabel;
		public Bool_factorContext bool_factor;
		public Bool_term1Context bool_term1;
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public Bool_term1Context bool_term1() {
			return getRuleContext(Bool_term1Context.class,0);
		}
		public Bool_termContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Bool_termContext(ParserRuleContext parent, int invokingState, int reg, int label, int b_true, int b_false) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
			this.b_true = b_true;
			this.b_false = b_false;
		}
		@Override public int getRuleIndex() { return RULE_bool_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterBool_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitBool_term(this);
		}
	}

	public final Bool_termContext bool_term(int reg,int label,int b_true,int b_false) throws RecognitionException {
		Bool_termContext _localctx = new Bool_termContext(_ctx, getState(), reg, label, b_true, b_false);
		enterRule(_localctx, 14, RULE_bool_term);
		try {
			enterOuterAlt(_localctx, 1);
			{

				int bt_t=_localctx.label++;		

			setState(134);
			((Bool_termContext)_localctx).bool_factor = bool_factor(_localctx.reg,_localctx.label,bt_t,_localctx.b_false);
			setState(135);
			((Bool_termContext)_localctx).bool_term1 = bool_term1(((Bool_termContext)_localctx).bool_factor.nreg,((Bool_termContext)_localctx).bool_factor.nlabel,_localctx.b_true,_localctx.b_false,bt_t);

				((Bool_termContext)_localctx).nreg = ((Bool_termContext)_localctx).bool_term1.nreg;
				((Bool_termContext)_localctx).nlabel = ((Bool_termContext)_localctx).bool_term1.nlabel;

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

	public static class Bool_term1Context extends ParserRuleContext {
		public int reg;
		public int label;
		public int b_true;
		public int b_false;
		public int bt_t;
		public int nreg;
		public int nlabel;
		public Bool_factorContext bool_factor;
		public Bool_term1Context bool_term1;
		public TerminalNode AND() { return getToken(CactusParser.AND, 0); }
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public Bool_term1Context bool_term1() {
			return getRuleContext(Bool_term1Context.class,0);
		}
		public Bool_term1Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Bool_term1Context(ParserRuleContext parent, int invokingState, int reg, int label, int b_true, int b_false, int bt_t) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
			this.b_true = b_true;
			this.b_false = b_false;
			this.bt_t = bt_t;
		}
		@Override public int getRuleIndex() { return RULE_bool_term1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterBool_term1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitBool_term1(this);
		}
	}

	public final Bool_term1Context bool_term1(int reg,int label,int b_true,int b_false,int bt_t) throws RecognitionException {
		Bool_term1Context _localctx = new Bool_term1Context(_ctx, getState(), reg, label, b_true, b_false, bt_t);
		enterRule(_localctx, 16, RULE_bool_term1);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(AND);

					System.out.println("L"+_localctx.bt_t+":");
					((Bool_term1Context)_localctx).bt_t = _localctx.label++;

				setState(140);
				((Bool_term1Context)_localctx).bool_factor = bool_factor(_localctx.reg,_localctx.label,_localctx.bt_t,_localctx.b_false);
				setState(141);
				((Bool_term1Context)_localctx).bool_term1 = bool_term1(((Bool_term1Context)_localctx).bool_factor.nreg,((Bool_term1Context)_localctx).bool_factor.nlabel,_localctx.b_true,_localctx.b_false,_localctx.bt_t);

					((Bool_term1Context)_localctx).nreg = ((Bool_term1Context)_localctx).bool_term1.nreg;
					((Bool_term1Context)_localctx).nlabel = ((Bool_term1Context)_localctx).bool_term1.nlabel;

				}
				break;
			case OR:
			case RP:
				enterOuterAlt(_localctx, 2);
				{

					System.out.println("L"+_localctx.bt_t+":");
					System.out.println("\tb L"+_localctx.b_true);
					((Bool_term1Context)_localctx).nreg = _localctx.reg;
					((Bool_term1Context)_localctx).nlabel = _localctx.label;

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

	public static class Bool_factorContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int b_true;
		public int b_false;
		public int nreg;
		public int nlabel;
		public Bool_factorContext bool_factor;
		public Rel_expressionContext rel_expression;
		public TerminalNode NOT() { return getToken(CactusParser.NOT, 0); }
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public Rel_expressionContext rel_expression() {
			return getRuleContext(Rel_expressionContext.class,0);
		}
		public Bool_factorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Bool_factorContext(ParserRuleContext parent, int invokingState, int reg, int label, int b_true, int b_false) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
			this.b_true = b_true;
			this.b_false = b_false;
		}
		@Override public int getRuleIndex() { return RULE_bool_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterBool_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitBool_factor(this);
		}
	}

	public final Bool_factorContext bool_factor(int reg,int label,int b_true,int b_false) throws RecognitionException {
		Bool_factorContext _localctx = new Bool_factorContext(_ctx, getState(), reg, label, b_true, b_false);
		enterRule(_localctx, 18, RULE_bool_factor);
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(NOT);
				setState(148);
				((Bool_factorContext)_localctx).bool_factor = bool_factor(_localctx.reg,_localctx.label,_localctx.b_false,b_true);

					((Bool_factorContext)_localctx).nreg = ((Bool_factorContext)_localctx).bool_factor.nreg;		
					((Bool_factorContext)_localctx).nlabel = ((Bool_factorContext)_localctx).bool_factor.nlabel;

				}
				break;
			case ID:
			case CONST:
			case SUB:
			case LP:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				((Bool_factorContext)_localctx).rel_expression = rel_expression(_localctx.reg,_localctx.label,_localctx.b_true,_localctx.b_false);

					((Bool_factorContext)_localctx).nreg = ((Bool_factorContext)_localctx).rel_expression.nreg;
					((Bool_factorContext)_localctx).nlabel = ((Bool_factorContext)_localctx).rel_expression.nlabel;

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

	public static class Rel_expressionContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int b_true;
		public int b_false;
		public int nreg;
		public int nlabel;
		public Arith_expressionContext ae0;
		public Arith_expressionContext arith_expression;
		public Relation_opContext relation_op;
		public Arith_expressionContext ae1;
		public Relation_opContext relation_op() {
			return getRuleContext(Relation_opContext.class,0);
		}
		public List<Arith_expressionContext> arith_expression() {
			return getRuleContexts(Arith_expressionContext.class);
		}
		public Arith_expressionContext arith_expression(int i) {
			return getRuleContext(Arith_expressionContext.class,i);
		}
		public Rel_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Rel_expressionContext(ParserRuleContext parent, int invokingState, int reg, int label, int b_true, int b_false) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
			this.b_true = b_true;
			this.b_false = b_false;
		}
		@Override public int getRuleIndex() { return RULE_rel_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterRel_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitRel_expression(this);
		}
	}

	public final Rel_expressionContext rel_expression(int reg,int label,int b_true,int b_false) throws RecognitionException {
		Rel_expressionContext _localctx = new Rel_expressionContext(_ctx, getState(), reg, label, b_true, b_false);
		enterRule(_localctx, 20, RULE_rel_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			((Rel_expressionContext)_localctx).ae0 = ((Rel_expressionContext)_localctx).arith_expression = arith_expression(_localctx.reg,_localctx.label);
			setState(157);
			((Rel_expressionContext)_localctx).relation_op = relation_op();
			setState(158);
			((Rel_expressionContext)_localctx).ae1 = ((Rel_expressionContext)_localctx).arith_expression = arith_expression(((Rel_expressionContext)_localctx).arith_expression.nreg,((Rel_expressionContext)_localctx).arith_expression.nlabel);

				System.out.println("\t"+((Rel_expressionContext)_localctx).relation_op.op+" $t"+((Rel_expressionContext)_localctx).ae0.place+", $t"+((Rel_expressionContext)_localctx).ae1.place+", L"+b_true);
				System.out.println("\tb\tL"+b_false);
				((Rel_expressionContext)_localctx).nreg = ((Rel_expressionContext)_localctx).arith_expression.nreg-2;
				((Rel_expressionContext)_localctx).nlabel = ((Rel_expressionContext)_localctx).arith_expression.nlabel;

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

	public static class Relation_opContext extends ParserRuleContext {
		public String op;
		public TerminalNode EQU() { return getToken(CactusParser.EQU, 0); }
		public TerminalNode NE() { return getToken(CactusParser.NE, 0); }
		public TerminalNode GT() { return getToken(CactusParser.GT, 0); }
		public TerminalNode GE() { return getToken(CactusParser.GE, 0); }
		public TerminalNode LT() { return getToken(CactusParser.LT, 0); }
		public TerminalNode LE() { return getToken(CactusParser.LE, 0); }
		public Relation_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterRelation_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitRelation_op(this);
		}
	}

	public final Relation_opContext relation_op() throws RecognitionException {
		Relation_opContext _localctx = new Relation_opContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_relation_op);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQU:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(EQU);
				((Relation_opContext)_localctx).op =  "beq";
				}
				break;
			case NE:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(NE);
				((Relation_opContext)_localctx).op =  "bne";
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				match(GT);
				((Relation_opContext)_localctx).op =  "bgt";
				}
				break;
			case GE:
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
				match(GE);
				((Relation_opContext)_localctx).op =  "bge";
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 5);
				{
				setState(169);
				match(LT);
				((Relation_opContext)_localctx).op =  "blt";
				}
				break;
			case LE:
				enterOuterAlt(_localctx, 6);
				{
				setState(171);
				match(LE);
				((Relation_opContext)_localctx).op =  "ble";
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

	public static class Arith_expressionContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int nreg;
		public int nlabel;
		public int place;
		public Arith_termContext arith_term;
		public Arith_expression1Context arith_expression1;
		public Arith_termContext arith_term() {
			return getRuleContext(Arith_termContext.class,0);
		}
		public Arith_expression1Context arith_expression1() {
			return getRuleContext(Arith_expression1Context.class,0);
		}
		public Arith_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Arith_expressionContext(ParserRuleContext parent, int invokingState, int reg, int label) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
		}
		@Override public int getRuleIndex() { return RULE_arith_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterArith_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitArith_expression(this);
		}
	}

	public final Arith_expressionContext arith_expression(int reg,int label) throws RecognitionException {
		Arith_expressionContext _localctx = new Arith_expressionContext(_ctx, getState(), reg, label);
		enterRule(_localctx, 24, RULE_arith_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			((Arith_expressionContext)_localctx).arith_term = arith_term(_localctx.reg,_localctx.label);
			setState(176);
			((Arith_expressionContext)_localctx).arith_expression1 = arith_expression1(((Arith_expressionContext)_localctx).arith_term.nreg,((Arith_expressionContext)_localctx).arith_term.nlabel, ((Arith_expressionContext)_localctx).arith_term.place);

				((Arith_expressionContext)_localctx).nreg = ((Arith_expressionContext)_localctx).arith_expression1.nreg;
				((Arith_expressionContext)_localctx).nlabel = ((Arith_expressionContext)_localctx).arith_expression1.nlabel;
				((Arith_expressionContext)_localctx).place = ((Arith_expressionContext)_localctx).arith_expression1.place;

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

	public static class Arith_expression1Context extends ParserRuleContext {
		public int reg;
		public int label;
		public int s_place;
		public int nreg;
		public int nlabel;
		public int place;
		public Arith_termContext arith_term;
		public Arith_expression1Context arith_expression1;
		public TerminalNode ADD() { return getToken(CactusParser.ADD, 0); }
		public Arith_termContext arith_term() {
			return getRuleContext(Arith_termContext.class,0);
		}
		public Arith_expression1Context arith_expression1() {
			return getRuleContext(Arith_expression1Context.class,0);
		}
		public TerminalNode SUB() { return getToken(CactusParser.SUB, 0); }
		public Arith_expression1Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Arith_expression1Context(ParserRuleContext parent, int invokingState, int reg, int label, int s_place) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
			this.s_place = s_place;
		}
		@Override public int getRuleIndex() { return RULE_arith_expression1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterArith_expression1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitArith_expression1(this);
		}
	}

	public final Arith_expression1Context arith_expression1(int reg,int label,int s_place) throws RecognitionException {
		Arith_expression1Context _localctx = new Arith_expression1Context(_ctx, getState(), reg, label, s_place);
		enterRule(_localctx, 26, RULE_arith_expression1);
		try {
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(ADD);
				setState(180);
				((Arith_expression1Context)_localctx).arith_term = arith_term(_localctx.reg,_localctx.label);

					System.out.println("\tadd\t$t"+_localctx.s_place+", $t"+_localctx.s_place+", $t"+((Arith_expression1Context)_localctx).arith_term.place);

				setState(182);
				((Arith_expression1Context)_localctx).arith_expression1 = arith_expression1(((Arith_expression1Context)_localctx).arith_term.nreg,((Arith_expression1Context)_localctx).arith_term.nlabel,_localctx.s_place);

					((Arith_expression1Context)_localctx).place = ((Arith_expression1Context)_localctx).arith_expression1.place;
					((Arith_expression1Context)_localctx).nlabel = ((Arith_expression1Context)_localctx).arith_expression1.nlabel;
					((Arith_expression1Context)_localctx).nreg = ((Arith_expression1Context)_localctx).arith_expression1.nreg-1;

				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(SUB);
				setState(186);
				((Arith_expression1Context)_localctx).arith_term = arith_term(_localctx.reg,_localctx.label);

					System.out.println("\tsub\t$t"+_localctx.s_place+", $t"+_localctx.s_place+", $t"+((Arith_expression1Context)_localctx).arith_term.place);

				setState(188);
				((Arith_expression1Context)_localctx).arith_expression1 = arith_expression1(((Arith_expression1Context)_localctx).arith_term.nreg,((Arith_expression1Context)_localctx).arith_term.nlabel, _localctx.s_place);

					((Arith_expression1Context)_localctx).place = ((Arith_expression1Context)_localctx).arith_expression1.place;
					((Arith_expression1Context)_localctx).nlabel = ((Arith_expression1Context)_localctx).arith_expression1.nlabel;
					((Arith_expression1Context)_localctx).nreg = ((Arith_expression1Context)_localctx).arith_expression1.nreg-1;

				}
				break;
			case EQU:
			case NE:
			case GE:
			case GT:
			case LE:
			case LT:
			case AND:
			case OR:
			case RP:
			case SEMI:
				enterOuterAlt(_localctx, 3);
				{

					((Arith_expression1Context)_localctx).nlabel = _localctx.label;
					((Arith_expression1Context)_localctx).nreg = _localctx.reg;
					((Arith_expression1Context)_localctx).place = _localctx.s_place;

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

	public static class Arith_termContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int nreg;
		public int nlabel;
		public int place;
		public Arith_factorContext arith_factor;
		public Arith_term1Context arith_term1;
		public Arith_factorContext arith_factor() {
			return getRuleContext(Arith_factorContext.class,0);
		}
		public Arith_term1Context arith_term1() {
			return getRuleContext(Arith_term1Context.class,0);
		}
		public Arith_termContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Arith_termContext(ParserRuleContext parent, int invokingState, int reg, int label) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
		}
		@Override public int getRuleIndex() { return RULE_arith_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterArith_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitArith_term(this);
		}
	}

	public final Arith_termContext arith_term(int reg,int label) throws RecognitionException {
		Arith_termContext _localctx = new Arith_termContext(_ctx, getState(), reg, label);
		enterRule(_localctx, 28, RULE_arith_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			((Arith_termContext)_localctx).arith_factor = arith_factor(_localctx.reg,_localctx.label);
			setState(195);
			((Arith_termContext)_localctx).arith_term1 = arith_term1(((Arith_termContext)_localctx).arith_factor.nreg,((Arith_termContext)_localctx).arith_factor.nlabel,((Arith_termContext)_localctx).arith_factor.place);

					((Arith_termContext)_localctx).nreg = ((Arith_termContext)_localctx).arith_term1.nreg;
					((Arith_termContext)_localctx).nlabel = ((Arith_termContext)_localctx).arith_term1.nlabel;
					((Arith_termContext)_localctx).place = ((Arith_termContext)_localctx).arith_term1.place;
				
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

	public static class Arith_term1Context extends ParserRuleContext {
		public int reg;
		public int label;
		public int s_place;
		public int nreg;
		public int nlabel;
		public int place;
		public Arith_factorContext arith_factor;
		public Arith_term1Context arith_term1;
		public TerminalNode MUL() { return getToken(CactusParser.MUL, 0); }
		public Arith_factorContext arith_factor() {
			return getRuleContext(Arith_factorContext.class,0);
		}
		public Arith_term1Context arith_term1() {
			return getRuleContext(Arith_term1Context.class,0);
		}
		public TerminalNode DIV() { return getToken(CactusParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(CactusParser.MOD, 0); }
		public Arith_term1Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Arith_term1Context(ParserRuleContext parent, int invokingState, int reg, int label, int s_place) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
			this.s_place = s_place;
		}
		@Override public int getRuleIndex() { return RULE_arith_term1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterArith_term1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitArith_term1(this);
		}
	}

	public final Arith_term1Context arith_term1(int reg,int label,int s_place) throws RecognitionException {
		Arith_term1Context _localctx = new Arith_term1Context(_ctx, getState(), reg, label, s_place);
		enterRule(_localctx, 30, RULE_arith_term1);
		try {
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(MUL);
				setState(199);
				((Arith_term1Context)_localctx).arith_factor = arith_factor(_localctx.reg,_localctx.label);

					System.out.println("\tmul\t$t"+_localctx.s_place+", $t"+_localctx.s_place+", $t"+((Arith_term1Context)_localctx).arith_factor.place);
				setState(201);
				((Arith_term1Context)_localctx).arith_term1 = arith_term1(((Arith_term1Context)_localctx).arith_factor.nreg,((Arith_term1Context)_localctx).arith_factor.nlabel,_localctx.s_place);

					((Arith_term1Context)_localctx).place = ((Arith_term1Context)_localctx).arith_term1.place;
					((Arith_term1Context)_localctx).nlabel = ((Arith_term1Context)_localctx).arith_term1.nlabel;
					((Arith_term1Context)_localctx).nreg = ((Arith_term1Context)_localctx).arith_term1.nreg-1;

				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(DIV);
				setState(205);
				((Arith_term1Context)_localctx).arith_factor = arith_factor(_localctx.reg,_localctx.label);

						System.out.println("\tdiv\t$t"+_localctx.s_place+", $t"+_localctx.s_place+", $t"+((Arith_term1Context)_localctx).arith_factor.place);
						System.out.println("\tmflo\t$t"+_localctx.s_place);

				setState(207);
				((Arith_term1Context)_localctx).arith_term1 = arith_term1(((Arith_term1Context)_localctx).arith_factor.nreg,((Arith_term1Context)_localctx).arith_factor.nlabel,_localctx.s_place);

					((Arith_term1Context)_localctx).place = ((Arith_term1Context)_localctx).arith_term1.place;
					((Arith_term1Context)_localctx).nlabel = ((Arith_term1Context)_localctx).arith_term1.nlabel;
					((Arith_term1Context)_localctx).nreg = ((Arith_term1Context)_localctx).arith_term1.nreg -1;

				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				match(MOD);
				setState(211);
				((Arith_term1Context)_localctx).arith_factor = arith_factor(_localctx.reg,_localctx.label);

				   	System.out.println("\trem\t$t"+_localctx.s_place+", $t"+_localctx.s_place+", $t"+((Arith_term1Context)_localctx).arith_factor.place);
				   	System.out.println("\tmfhl\t$t"+_localctx.s_place);

				setState(213);
				((Arith_term1Context)_localctx).arith_term1 = arith_term1(((Arith_term1Context)_localctx).arith_factor.nreg,((Arith_term1Context)_localctx).arith_factor.nlabel,((Arith_term1Context)_localctx).arith_factor.place);

					((Arith_term1Context)_localctx).place = ((Arith_term1Context)_localctx).arith_term1.place;
					((Arith_term1Context)_localctx).nlabel = ((Arith_term1Context)_localctx).arith_term1.nlabel;
					((Arith_term1Context)_localctx).nreg = ((Arith_term1Context)_localctx).arith_term1.nreg-1;

				}
				break;
			case ADD:
			case SUB:
			case EQU:
			case NE:
			case GE:
			case GT:
			case LE:
			case LT:
			case AND:
			case OR:
			case RP:
			case SEMI:
				enterOuterAlt(_localctx, 4);
				{

					((Arith_term1Context)_localctx).nlabel = _localctx.label;
					((Arith_term1Context)_localctx).nreg = _localctx.reg;
					((Arith_term1Context)_localctx).place = _localctx.s_place;

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

	public static class Arith_factorContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int nreg;
		public int nlabel;
		public int place;
		public Arith_factorContext arith_factor;
		public Primary_expressionContext primary_expression;
		public TerminalNode SUB() { return getToken(CactusParser.SUB, 0); }
		public Arith_factorContext arith_factor() {
			return getRuleContext(Arith_factorContext.class,0);
		}
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public Arith_factorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Arith_factorContext(ParserRuleContext parent, int invokingState, int reg, int label) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
		}
		@Override public int getRuleIndex() { return RULE_arith_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterArith_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitArith_factor(this);
		}
	}

	public final Arith_factorContext arith_factor(int reg,int label) throws RecognitionException {
		Arith_factorContext _localctx = new Arith_factorContext(_ctx, getState(), reg, label);
		enterRule(_localctx, 32, RULE_arith_factor);
		try {
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(SUB);
				setState(220);
				((Arith_factorContext)_localctx).arith_factor = arith_factor(_localctx.reg,_localctx.label);

					System.out.println("\tneg\t$t"+((Arith_factorContext)_localctx).arith_factor.place+", $t"+((Arith_factorContext)_localctx).arith_factor.place);
					((Arith_factorContext)_localctx).nreg = ((Arith_factorContext)_localctx).arith_factor.nreg;
					((Arith_factorContext)_localctx).nlabel = ((Arith_factorContext)_localctx).arith_factor.nlabel;
					((Arith_factorContext)_localctx).place = ((Arith_factorContext)_localctx).arith_factor.place;

				}
				break;
			case ID:
			case CONST:
			case LP:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				((Arith_factorContext)_localctx).primary_expression = primary_expression(_localctx.reg,_localctx.label);

					((Arith_factorContext)_localctx).nreg =  ((Arith_factorContext)_localctx).primary_expression.nreg;
					((Arith_factorContext)_localctx).nlabel = ((Arith_factorContext)_localctx).primary_expression.nlabel;
					((Arith_factorContext)_localctx).place = ((Arith_factorContext)_localctx).primary_expression.place;

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

	public static class Primary_expressionContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int nreg;
		public int nlabel;
		public int place;
		public Token CONST;
		public Token ID;
		public Arith_expressionContext arith_expression;
		public TerminalNode CONST() { return getToken(CactusParser.CONST, 0); }
		public TerminalNode ID() { return getToken(CactusParser.ID, 0); }
		public TerminalNode LP() { return getToken(CactusParser.LP, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(CactusParser.RP, 0); }
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Primary_expressionContext(ParserRuleContext parent, int invokingState, int reg, int label) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitPrimary_expression(this);
		}
	}

	public final Primary_expressionContext primary_expression(int reg,int label) throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState(), reg, label);
		enterRule(_localctx, 34, RULE_primary_expression);
		try {
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				((Primary_expressionContext)_localctx).CONST = match(CONST);

					System.out.println("\tli\t$t"+_localctx.reg+", "+(((Primary_expressionContext)_localctx).CONST!=null?((Primary_expressionContext)_localctx).CONST.getText():null));		
					((Primary_expressionContext)_localctx).nreg = _localctx.reg+1;
					((Primary_expressionContext)_localctx).nlabel = _localctx.label;
					((Primary_expressionContext)_localctx).place = _localctx.reg;

				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				((Primary_expressionContext)_localctx).ID = match(ID);

					System.out.println("\tla\t$t"+_localctx.reg+", "+(((Primary_expressionContext)_localctx).ID!=null?((Primary_expressionContext)_localctx).ID.getText():null));
					System.out.println("\tlw\t$t"+_localctx.reg+", 0($t"+_localctx.reg+")");
					((Primary_expressionContext)_localctx).nreg = _localctx.reg+1;
					((Primary_expressionContext)_localctx).nlabel = _localctx.label;
					((Primary_expressionContext)_localctx).place = _localctx.reg; 

				}
				break;
			case LP:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				match(LP);
				setState(233);
				((Primary_expressionContext)_localctx).arith_expression = arith_expression(_localctx.reg,_localctx.label);
				setState(234);
				match(RP);

					((Primary_expressionContext)_localctx).nreg = ((Primary_expressionContext)_localctx).arith_expression.nreg;
					((Primary_expressionContext)_localctx).nlabel = ((Primary_expressionContext)_localctx).arith_expression.nlabel;
					((Primary_expressionContext)_localctx).place = ((Primary_expressionContext)_localctx).arith_expression.place;

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u00f2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3\67\n\3\3\4\3\4\3\4\3\4\3\4\5\4>\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5k\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6x\n\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0086\n\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0094\n\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u009d\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b0\n\r\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00c3"+
		"\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00dc\n\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e5\n\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u00f0\n\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$\2\2\2\u00f7\2&\3\2\2\2\4\66\3\2\2\2\6=\3\2\2\2"+
		"\bj\3\2\2\2\nw\3\2\2\2\fy\3\2\2\2\16\u0085\3\2\2\2\20\u0087\3\2\2\2\22"+
		"\u0093\3\2\2\2\24\u009c\3\2\2\2\26\u009e\3\2\2\2\30\u00af\3\2\2\2\32\u00b1"+
		"\3\2\2\2\34\u00c2\3\2\2\2\36\u00c4\3\2\2\2 \u00db\3\2\2\2\"\u00e4\3\2"+
		"\2\2$\u00ef\3\2\2\2&\'\7\5\2\2\'(\7\36\2\2()\7\37\2\2)*\7 \2\2*+\b\2\1"+
		"\2+,\5\4\3\2,-\b\2\1\2-.\5\6\4\2./\7!\2\2/\3\3\2\2\2\60\61\7\4\2\2\61"+
		"\62\7\f\2\2\62\63\b\3\1\2\63\64\7\"\2\2\64\67\5\4\3\2\65\67\3\2\2\2\66"+
		"\60\3\2\2\2\66\65\3\2\2\2\67\5\3\2\2\289\5\b\5\29:\5\6\4\2:;\b\4\1\2;"+
		">\3\2\2\2<>\b\4\1\2=8\3\2\2\2=<\3\2\2\2>\7\3\2\2\2?@\7\f\2\2@A\7\24\2"+
		"\2AB\5\32\16\2BC\b\5\1\2CD\7\"\2\2Dk\3\2\2\2EF\7\13\2\2FG\7\36\2\2GH\b"+
		"\5\1\2HI\5\f\7\2IJ\7\37\2\2JK\7 \2\2KL\b\5\1\2LM\5\6\4\2MN\7!\2\2NO\5"+
		"\n\6\2OP\b\5\1\2Pk\3\2\2\2QR\b\5\1\2RS\7\7\2\2ST\7\36\2\2TU\b\5\1\2UV"+
		"\5\f\7\2VW\7\37\2\2WX\7 \2\2XY\b\5\1\2YZ\5\6\4\2Z[\b\5\1\2[\\\7!\2\2\\"+
		"]\b\5\1\2]k\3\2\2\2^_\7\b\2\2_`\7\f\2\2`a\b\5\1\2ak\7\"\2\2bc\7\t\2\2"+
		"cd\5\32\16\2de\b\5\1\2ef\7\"\2\2fk\3\2\2\2gh\7\6\2\2hi\b\5\1\2ik\7\"\2"+
		"\2j?\3\2\2\2jE\3\2\2\2jQ\3\2\2\2j^\3\2\2\2jb\3\2\2\2jg\3\2\2\2k\t\3\2"+
		"\2\2lm\7\3\2\2mn\7 \2\2no\b\6\1\2op\5\6\4\2pq\b\6\1\2qr\7!\2\2rs\b\6\1"+
		"\2st\7\n\2\2tx\3\2\2\2uv\7\n\2\2vx\b\6\1\2wl\3\2\2\2wu\3\2\2\2x\13\3\2"+
		"\2\2yz\b\7\1\2z{\5\20\t\2{|\5\16\b\2|}\b\7\1\2}\r\3\2\2\2~\177\7\34\2"+
		"\2\177\u0080\b\b\1\2\u0080\u0081\5\20\t\2\u0081\u0082\5\16\b\2\u0082\u0083"+
		"\b\b\1\2\u0083\u0086\3\2\2\2\u0084\u0086\b\b\1\2\u0085~\3\2\2\2\u0085"+
		"\u0084\3\2\2\2\u0086\17\3\2\2\2\u0087\u0088\b\t\1\2\u0088\u0089\5\24\13"+
		"\2\u0089\u008a\5\22\n\2\u008a\u008b\b\t\1\2\u008b\21\3\2\2\2\u008c\u008d"+
		"\7\33\2\2\u008d\u008e\b\n\1\2\u008e\u008f\5\24\13\2\u008f\u0090\5\22\n"+
		"\2\u0090\u0091\b\n\1\2\u0091\u0094\3\2\2\2\u0092\u0094\b\n\1\2\u0093\u008c"+
		"\3\2\2\2\u0093\u0092\3\2\2\2\u0094\23\3\2\2\2\u0095\u0096\7\35\2\2\u0096"+
		"\u0097\5\24\13\2\u0097\u0098\b\13\1\2\u0098\u009d\3\2\2\2\u0099\u009a"+
		"\5\26\f\2\u009a\u009b\b\13\1\2\u009b\u009d\3\2\2\2\u009c\u0095\3\2\2\2"+
		"\u009c\u0099\3\2\2\2\u009d\25\3\2\2\2\u009e\u009f\5\32\16\2\u009f\u00a0"+
		"\5\30\r\2\u00a0\u00a1\5\32\16\2\u00a1\u00a2\b\f\1\2\u00a2\27\3\2\2\2\u00a3"+
		"\u00a4\7\25\2\2\u00a4\u00b0\b\r\1\2\u00a5\u00a6\7\26\2\2\u00a6\u00b0\b"+
		"\r\1\2\u00a7\u00a8\7\30\2\2\u00a8\u00b0\b\r\1\2\u00a9\u00aa\7\27\2\2\u00aa"+
		"\u00b0\b\r\1\2\u00ab\u00ac\7\32\2\2\u00ac\u00b0\b\r\1\2\u00ad\u00ae\7"+
		"\31\2\2\u00ae\u00b0\b\r\1\2\u00af\u00a3\3\2\2\2\u00af\u00a5\3\2\2\2\u00af"+
		"\u00a7\3\2\2\2\u00af\u00a9\3\2\2\2\u00af\u00ab\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00b0\31\3\2\2\2\u00b1\u00b2\5\36\20\2\u00b2\u00b3\5\34\17\2\u00b3"+
		"\u00b4\b\16\1\2\u00b4\33\3\2\2\2\u00b5\u00b6\7\17\2\2\u00b6\u00b7\5\36"+
		"\20\2\u00b7\u00b8\b\17\1\2\u00b8\u00b9\5\34\17\2\u00b9\u00ba\b\17\1\2"+
		"\u00ba\u00c3\3\2\2\2\u00bb\u00bc\7\20\2\2\u00bc\u00bd\5\36\20\2\u00bd"+
		"\u00be\b\17\1\2\u00be\u00bf\5\34\17\2\u00bf\u00c0\b\17\1\2\u00c0\u00c3"+
		"\3\2\2\2\u00c1\u00c3\b\17\1\2\u00c2\u00b5\3\2\2\2\u00c2\u00bb\3\2\2\2"+
		"\u00c2\u00c1\3\2\2\2\u00c3\35\3\2\2\2\u00c4\u00c5\5\"\22\2\u00c5\u00c6"+
		"\5 \21\2\u00c6\u00c7\b\20\1\2\u00c7\37\3\2\2\2\u00c8\u00c9\7\21\2\2\u00c9"+
		"\u00ca\5\"\22\2\u00ca\u00cb\b\21\1\2\u00cb\u00cc\5 \21\2\u00cc\u00cd\b"+
		"\21\1\2\u00cd\u00dc\3\2\2\2\u00ce\u00cf\7\22\2\2\u00cf\u00d0\5\"\22\2"+
		"\u00d0\u00d1\b\21\1\2\u00d1\u00d2\5 \21\2\u00d2\u00d3\b\21\1\2\u00d3\u00dc"+
		"\3\2\2\2\u00d4\u00d5\7\23\2\2\u00d5\u00d6\5\"\22\2\u00d6\u00d7\b\21\1"+
		"\2\u00d7\u00d8\5 \21\2\u00d8\u00d9\b\21\1\2\u00d9\u00dc\3\2\2\2\u00da"+
		"\u00dc\b\21\1\2\u00db\u00c8\3\2\2\2\u00db\u00ce\3\2\2\2\u00db\u00d4\3"+
		"\2\2\2\u00db\u00da\3\2\2\2\u00dc!\3\2\2\2\u00dd\u00de\7\20\2\2\u00de\u00df"+
		"\5\"\22\2\u00df\u00e0\b\22\1\2\u00e0\u00e5\3\2\2\2\u00e1\u00e2\5$\23\2"+
		"\u00e2\u00e3\b\22\1\2\u00e3\u00e5\3\2\2\2\u00e4\u00dd\3\2\2\2\u00e4\u00e1"+
		"\3\2\2\2\u00e5#\3\2\2\2\u00e6\u00e7\7\16\2\2\u00e7\u00f0\b\23\1\2\u00e8"+
		"\u00e9\7\f\2\2\u00e9\u00f0\b\23\1\2\u00ea\u00eb\7\36\2\2\u00eb\u00ec\5"+
		"\32\16\2\u00ec\u00ed\7\37\2\2\u00ed\u00ee\b\23\1\2\u00ee\u00f0\3\2\2\2"+
		"\u00ef\u00e6\3\2\2\2\u00ef\u00e8\3\2\2\2\u00ef\u00ea\3\2\2\2\u00f0%\3"+
		"\2\2\2\16\66=jw\u0085\u0093\u009c\u00af\u00c2\u00db\u00e4\u00ef";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
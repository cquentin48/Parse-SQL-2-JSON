// Generated from /home/quentin/Documents/personnel/sql_parser/src/sql_2_json/where.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class whereParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		QUOTED_DATE=1, DATE=2, SELECT=3, FROM=4, WHERE=5, IN=6, ON=7, NOT=8, EXCEPT=9, 
		EQ=10, DIFFERENT=11, INNER_JOIN=12, LEFT_JOIN=13, RIGHT_JOIN=14, NATURAL_JOIN=15, 
		FULL_OUTER_JOIN=16, DOUBLE_QUOTATION_MARK=17, SINGLE_QUOTATION_MARK=18, 
		NUMBER=19, DECIMAL_PART=20, COMMA=21, SEMICOLON=22, POINT=23, STAR=24, 
		GREATER=25, GEQ=26, LOWER=27, LEQ=28, SLASH=29, OPAR=30, CPAR=31, BETWEEN=32, 
		AND=33, OR=34, LIKE=35, LETTER=36, DIGIT=37, TEXT=38, STRING=39, FUNCTION_NAME=40, 
		SPACE=41;
	public static final int
		RULE_where_stmt = 0, RULE_where_and_or_condition = 1, RULE_and_or_operators = 2, 
		RULE_where_condition = 3, RULE_where_simple_condition = 4, RULE_where_between_condition = 5, 
		RULE_where_like_condition = 6, RULE_where_function_condition = 7, RULE_where_in_condition = 8, 
		RULE_function_name = 9, RULE_argument_list = 10, RULE_eq_type = 11, RULE_obj_type = 12, 
		RULE_table_column_name = 13, RULE_table_name = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"where_stmt", "where_and_or_condition", "and_or_operators", "where_condition", 
			"where_simple_condition", "where_between_condition", "where_like_condition", 
			"where_function_condition", "where_in_condition", "function_name", "argument_list", 
			"eq_type", "obj_type", "table_column_name", "table_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "'='", null, 
			null, null, null, null, null, "'\"'", "'''", null, null, "','", "';'", 
			"'.'", "'*'", "'>'", "'>='", "'<'", "'<='", "'/'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "QUOTED_DATE", "DATE", "SELECT", "FROM", "WHERE", "IN", "ON", "NOT", 
			"EXCEPT", "EQ", "DIFFERENT", "INNER_JOIN", "LEFT_JOIN", "RIGHT_JOIN", 
			"NATURAL_JOIN", "FULL_OUTER_JOIN", "DOUBLE_QUOTATION_MARK", "SINGLE_QUOTATION_MARK", 
			"NUMBER", "DECIMAL_PART", "COMMA", "SEMICOLON", "POINT", "STAR", "GREATER", 
			"GEQ", "LOWER", "LEQ", "SLASH", "OPAR", "CPAR", "BETWEEN", "AND", "OR", 
			"LIKE", "LETTER", "DIGIT", "TEXT", "STRING", "FUNCTION_NAME", "SPACE"
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
	public String getGrammarFileName() { return "where.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public whereParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Where_stmtContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(whereParser.WHERE, 0); }
		public Where_conditionContext where_condition() {
			return getRuleContext(Where_conditionContext.class,0);
		}
		public Where_and_or_conditionContext where_and_or_condition() {
			return getRuleContext(Where_and_or_conditionContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(whereParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(whereParser.SPACE, i);
		}
		public Where_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_stmt; }
	}

	public final Where_stmtContext where_stmt() throws RecognitionException {
		Where_stmtContext _localctx = new Where_stmtContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_where_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(WHERE);
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(31);
				match(SPACE);
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(37);
				where_condition();
				}
				break;
			case 2:
				{
				setState(38);
				where_and_or_condition();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Where_and_or_conditionContext extends ParserRuleContext {
		public Where_and_or_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_and_or_condition; }
	 
		public Where_and_or_conditionContext() { }
		public void copyFrom(Where_and_or_conditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Right_and_orContext extends Where_and_or_conditionContext {
		public List<TerminalNode> OPAR() { return getTokens(whereParser.OPAR); }
		public TerminalNode OPAR(int i) {
			return getToken(whereParser.OPAR, i);
		}
		public Where_conditionContext where_condition() {
			return getRuleContext(Where_conditionContext.class,0);
		}
		public List<TerminalNode> CPAR() { return getTokens(whereParser.CPAR); }
		public TerminalNode CPAR(int i) {
			return getToken(whereParser.CPAR, i);
		}
		public And_or_operatorsContext and_or_operators() {
			return getRuleContext(And_or_operatorsContext.class,0);
		}
		public Where_and_or_conditionContext where_and_or_condition() {
			return getRuleContext(Where_and_or_conditionContext.class,0);
		}
		public Right_and_orContext(Where_and_or_conditionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Left_and_orContext extends Where_and_or_conditionContext {
		public List<TerminalNode> OPAR() { return getTokens(whereParser.OPAR); }
		public TerminalNode OPAR(int i) {
			return getToken(whereParser.OPAR, i);
		}
		public Where_and_or_conditionContext where_and_or_condition() {
			return getRuleContext(Where_and_or_conditionContext.class,0);
		}
		public List<TerminalNode> CPAR() { return getTokens(whereParser.CPAR); }
		public TerminalNode CPAR(int i) {
			return getToken(whereParser.CPAR, i);
		}
		public And_or_operatorsContext and_or_operators() {
			return getRuleContext(And_or_operatorsContext.class,0);
		}
		public Where_conditionContext where_condition() {
			return getRuleContext(Where_conditionContext.class,0);
		}
		public Left_and_orContext(Where_and_or_conditionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Double_and_orContext extends Where_and_or_conditionContext {
		public List<TerminalNode> OPAR() { return getTokens(whereParser.OPAR); }
		public TerminalNode OPAR(int i) {
			return getToken(whereParser.OPAR, i);
		}
		public List<Where_and_or_conditionContext> where_and_or_condition() {
			return getRuleContexts(Where_and_or_conditionContext.class);
		}
		public Where_and_or_conditionContext where_and_or_condition(int i) {
			return getRuleContext(Where_and_or_conditionContext.class,i);
		}
		public List<TerminalNode> CPAR() { return getTokens(whereParser.CPAR); }
		public TerminalNode CPAR(int i) {
			return getToken(whereParser.CPAR, i);
		}
		public And_or_operatorsContext and_or_operators() {
			return getRuleContext(And_or_operatorsContext.class,0);
		}
		public Double_and_orContext(Where_and_or_conditionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class End_of_where_and_orContext extends Where_and_or_conditionContext {
		public List<Where_conditionContext> where_condition() {
			return getRuleContexts(Where_conditionContext.class);
		}
		public Where_conditionContext where_condition(int i) {
			return getRuleContext(Where_conditionContext.class,i);
		}
		public And_or_operatorsContext and_or_operators() {
			return getRuleContext(And_or_operatorsContext.class,0);
		}
		public End_of_where_and_orContext(Where_and_or_conditionContext ctx) { copyFrom(ctx); }
	}

	public final Where_and_or_conditionContext where_and_or_condition() throws RecognitionException {
		Where_and_or_conditionContext _localctx = new Where_and_or_conditionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_where_and_or_condition);
		try {
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new End_of_where_and_orContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				where_condition();
				setState(42);
				and_or_operators();
				setState(43);
				where_condition();
				}
				break;
			case 2:
				_localctx = new Right_and_orContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				match(OPAR);
				setState(46);
				where_condition();
				setState(47);
				match(CPAR);
				setState(48);
				and_or_operators();
				setState(49);
				match(OPAR);
				setState(50);
				where_and_or_condition();
				setState(51);
				match(CPAR);
				}
				break;
			case 3:
				_localctx = new Left_and_orContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				match(OPAR);
				setState(54);
				where_and_or_condition();
				setState(55);
				match(CPAR);
				setState(56);
				and_or_operators();
				setState(57);
				match(OPAR);
				setState(58);
				where_condition();
				setState(59);
				match(CPAR);
				}
				break;
			case 4:
				_localctx = new Double_and_orContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				match(OPAR);
				setState(62);
				where_and_or_condition();
				setState(63);
				match(CPAR);
				setState(64);
				and_or_operators();
				setState(65);
				match(OPAR);
				setState(66);
				where_and_or_condition();
				setState(67);
				match(CPAR);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class And_or_operatorsContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(whereParser.AND, 0); }
		public TerminalNode OR() { return getToken(whereParser.OR, 0); }
		public And_or_operatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_or_operators; }
	}

	public final And_or_operatorsContext and_or_operators() throws RecognitionException {
		And_or_operatorsContext _localctx = new And_or_operatorsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_and_or_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Where_conditionContext extends ParserRuleContext {
		public Where_simple_conditionContext where_simple_condition() {
			return getRuleContext(Where_simple_conditionContext.class,0);
		}
		public Where_between_conditionContext where_between_condition() {
			return getRuleContext(Where_between_conditionContext.class,0);
		}
		public Where_like_conditionContext where_like_condition() {
			return getRuleContext(Where_like_conditionContext.class,0);
		}
		public Where_function_conditionContext where_function_condition() {
			return getRuleContext(Where_function_conditionContext.class,0);
		}
		public Where_in_conditionContext where_in_condition() {
			return getRuleContext(Where_in_conditionContext.class,0);
		}
		public Where_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_condition; }
	}

	public final Where_conditionContext where_condition() throws RecognitionException {
		Where_conditionContext _localctx = new Where_conditionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_where_condition);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				where_simple_condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				where_between_condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				where_like_condition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				where_function_condition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(77);
				where_in_condition();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Where_simple_conditionContext extends ParserRuleContext {
		public Table_column_nameContext table_column_name() {
			return getRuleContext(Table_column_nameContext.class,0);
		}
		public Eq_typeContext eq_type() {
			return getRuleContext(Eq_typeContext.class,0);
		}
		public Obj_typeContext obj_type() {
			return getRuleContext(Obj_typeContext.class,0);
		}
		public Where_simple_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_simple_condition; }
	}

	public final Where_simple_conditionContext where_simple_condition() throws RecognitionException {
		Where_simple_conditionContext _localctx = new Where_simple_conditionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_where_simple_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			table_column_name();
			setState(81);
			eq_type();
			setState(82);
			obj_type();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Where_between_conditionContext extends ParserRuleContext {
		public Table_column_nameContext table_column_name() {
			return getRuleContext(Table_column_nameContext.class,0);
		}
		public TerminalNode BETWEEN() { return getToken(whereParser.BETWEEN, 0); }
		public List<Obj_typeContext> obj_type() {
			return getRuleContexts(Obj_typeContext.class);
		}
		public Obj_typeContext obj_type(int i) {
			return getRuleContext(Obj_typeContext.class,i);
		}
		public TerminalNode AND() { return getToken(whereParser.AND, 0); }
		public Where_between_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_between_condition; }
	}

	public final Where_between_conditionContext where_between_condition() throws RecognitionException {
		Where_between_conditionContext _localctx = new Where_between_conditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_where_between_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			table_column_name();
			setState(85);
			match(BETWEEN);
			setState(86);
			obj_type();
			setState(87);
			match(AND);
			setState(88);
			obj_type();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Where_like_conditionContext extends ParserRuleContext {
		public Table_column_nameContext table_column_name() {
			return getRuleContext(Table_column_nameContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(whereParser.LIKE, 0); }
		public TerminalNode TEXT() { return getToken(whereParser.TEXT, 0); }
		public TerminalNode NOT() { return getToken(whereParser.NOT, 0); }
		public Where_like_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_like_condition; }
	}

	public final Where_like_conditionContext where_like_condition() throws RecognitionException {
		Where_like_conditionContext _localctx = new Where_like_conditionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_where_like_condition);
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				table_column_name();
				setState(91);
				match(LIKE);
				setState(92);
				match(TEXT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				table_column_name();
				setState(95);
				match(NOT);
				setState(96);
				match(LIKE);
				setState(97);
				match(TEXT);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Where_function_conditionContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode OPAR() { return getToken(whereParser.OPAR, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(whereParser.CPAR, 0); }
		public Where_function_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_function_condition; }
	}

	public final Where_function_conditionContext where_function_condition() throws RecognitionException {
		Where_function_conditionContext _localctx = new Where_function_conditionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_where_function_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			function_name();
			setState(102);
			match(OPAR);
			setState(103);
			argument_list();
			setState(104);
			match(CPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Where_in_conditionContext extends ParserRuleContext {
		public Table_column_nameContext table_column_name() {
			return getRuleContext(Table_column_nameContext.class,0);
		}
		public TerminalNode IN() { return getToken(whereParser.IN, 0); }
		public TerminalNode OPAR() { return getToken(whereParser.OPAR, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(whereParser.CPAR, 0); }
		public List<TerminalNode> SPACE() { return getTokens(whereParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(whereParser.SPACE, i);
		}
		public Where_in_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_in_condition; }
	}

	public final Where_in_conditionContext where_in_condition() throws RecognitionException {
		Where_in_conditionContext _localctx = new Where_in_conditionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_where_in_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			table_column_name();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(107);
				match(SPACE);
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			match(IN);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(114);
				match(SPACE);
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			match(OPAR);
			setState(121);
			argument_list();
			setState(122);
			match(CPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_nameContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(whereParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(whereParser.STRING, i);
		}
		public TerminalNode POINT() { return getToken(whereParser.POINT, 0); }
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function_name);
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(STRING);
				setState(125);
				match(POINT);
				setState(126);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				match(STRING);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Argument_listContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(whereParser.COMMA, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public TerminalNode QUOTED_DATE() { return getToken(whereParser.QUOTED_DATE, 0); }
		public TerminalNode TEXT() { return getToken(whereParser.TEXT, 0); }
		public TerminalNode NUMBER() { return getToken(whereParser.NUMBER, 0); }
		public Table_column_nameContext table_column_name() {
			return getRuleContext(Table_column_nameContext.class,0);
		}
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_argument_list);
		try {
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case QUOTED_DATE:
					{
					setState(130);
					match(QUOTED_DATE);
					}
					break;
				case TEXT:
					{
					setState(131);
					match(TEXT);
					}
					break;
				case NUMBER:
					{
					setState(132);
					match(NUMBER);
					}
					break;
				case DOUBLE_QUOTATION_MARK:
				case SINGLE_QUOTATION_MARK:
				case STRING:
					{
					setState(133);
					table_column_name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(136);
				match(COMMA);
				setState(137);
				argument_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case QUOTED_DATE:
					{
					setState(138);
					match(QUOTED_DATE);
					}
					break;
				case TEXT:
					{
					setState(139);
					match(TEXT);
					}
					break;
				case NUMBER:
					{
					setState(140);
					match(NUMBER);
					}
					break;
				case DOUBLE_QUOTATION_MARK:
				case SINGLE_QUOTATION_MARK:
				case STRING:
					{
					setState(141);
					table_column_name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Eq_typeContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(whereParser.EQ, 0); }
		public TerminalNode GREATER() { return getToken(whereParser.GREATER, 0); }
		public TerminalNode LOWER() { return getToken(whereParser.LOWER, 0); }
		public TerminalNode GEQ() { return getToken(whereParser.GEQ, 0); }
		public TerminalNode LEQ() { return getToken(whereParser.LEQ, 0); }
		public TerminalNode DIFFERENT() { return getToken(whereParser.DIFFERENT, 0); }
		public Eq_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq_type; }
	}

	public final Eq_typeContext eq_type() throws RecognitionException {
		Eq_typeContext _localctx = new Eq_typeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_eq_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 503319552L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Obj_typeContext extends ParserRuleContext {
		public TerminalNode QUOTED_DATE() { return getToken(whereParser.QUOTED_DATE, 0); }
		public TerminalNode TEXT() { return getToken(whereParser.TEXT, 0); }
		public TerminalNode NUMBER() { return getToken(whereParser.NUMBER, 0); }
		public Obj_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj_type; }
	}

	public final Obj_typeContext obj_type() throws RecognitionException {
		Obj_typeContext _localctx = new Obj_typeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_obj_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 274878431234L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Table_column_nameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(whereParser.STRING, 0); }
		public List<TerminalNode> DOUBLE_QUOTATION_MARK() { return getTokens(whereParser.DOUBLE_QUOTATION_MARK); }
		public TerminalNode DOUBLE_QUOTATION_MARK(int i) {
			return getToken(whereParser.DOUBLE_QUOTATION_MARK, i);
		}
		public List<TerminalNode> SINGLE_QUOTATION_MARK() { return getTokens(whereParser.SINGLE_QUOTATION_MARK); }
		public TerminalNode SINGLE_QUOTATION_MARK(int i) {
			return getToken(whereParser.SINGLE_QUOTATION_MARK, i);
		}
		public Table_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_column_name; }
	}

	public final Table_column_nameContext table_column_name() throws RecognitionException {
		Table_column_nameContext _localctx = new Table_column_nameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_table_column_name);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(STRING);
				}
				break;
			case DOUBLE_QUOTATION_MARK:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(DOUBLE_QUOTATION_MARK);
				setState(152);
				match(STRING);
				setState(153);
				match(DOUBLE_QUOTATION_MARK);
				}
				break;
			case SINGLE_QUOTATION_MARK:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				match(SINGLE_QUOTATION_MARK);
				setState(155);
				match(STRING);
				setState(156);
				match(SINGLE_QUOTATION_MARK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Table_nameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(whereParser.STRING, 0); }
		public List<TerminalNode> DOUBLE_QUOTATION_MARK() { return getTokens(whereParser.DOUBLE_QUOTATION_MARK); }
		public TerminalNode DOUBLE_QUOTATION_MARK(int i) {
			return getToken(whereParser.DOUBLE_QUOTATION_MARK, i);
		}
		public List<TerminalNode> SINGLE_QUOTATION_MARK() { return getTokens(whereParser.SINGLE_QUOTATION_MARK); }
		public TerminalNode SINGLE_QUOTATION_MARK(int i) {
			return getToken(whereParser.SINGLE_QUOTATION_MARK, i);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_table_name);
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(STRING);
				}
				break;
			case DOUBLE_QUOTATION_MARK:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(DOUBLE_QUOTATION_MARK);
				setState(161);
				match(STRING);
				setState(162);
				match(DOUBLE_QUOTATION_MARK);
				}
				break;
			case SINGLE_QUOTATION_MARK:
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				match(SINGLE_QUOTATION_MARK);
				setState(164);
				match(STRING);
				setState(165);
				match(SINGLE_QUOTATION_MARK);
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
		"\u0004\u0001)\u00a9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0005\u0000!\b\u0000\n\u0000\f\u0000$\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u0000(\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001F\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003O\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006d\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0005\bm\b\b\n\b\f\bp\t\b\u0001\b\u0001\b"+
		"\u0005\bt\b\b\n\b\f\bw\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u0081\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u0087\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u008f"+
		"\b\n\u0003\n\u0091\b\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u009e\b\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u00a7\b\u000e\u0001\u000e\u0000\u0000\u000f\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000"+
		"\u0003\u0001\u0000!\"\u0002\u0000\n\u000b\u0019\u001c\u0003\u0000\u0001"+
		"\u0001\u0013\u0013&&\u00b1\u0000\u001e\u0001\u0000\u0000\u0000\u0002E"+
		"\u0001\u0000\u0000\u0000\u0004G\u0001\u0000\u0000\u0000\u0006N\u0001\u0000"+
		"\u0000\u0000\bP\u0001\u0000\u0000\u0000\nT\u0001\u0000\u0000\u0000\fc"+
		"\u0001\u0000\u0000\u0000\u000ee\u0001\u0000\u0000\u0000\u0010j\u0001\u0000"+
		"\u0000\u0000\u0012\u0080\u0001\u0000\u0000\u0000\u0014\u0090\u0001\u0000"+
		"\u0000\u0000\u0016\u0092\u0001\u0000\u0000\u0000\u0018\u0094\u0001\u0000"+
		"\u0000\u0000\u001a\u009d\u0001\u0000\u0000\u0000\u001c\u00a6\u0001\u0000"+
		"\u0000\u0000\u001e\"\u0005\u0005\u0000\u0000\u001f!\u0005)\u0000\u0000"+
		" \u001f\u0001\u0000\u0000\u0000!$\u0001\u0000\u0000\u0000\" \u0001\u0000"+
		"\u0000\u0000\"#\u0001\u0000\u0000\u0000#\'\u0001\u0000\u0000\u0000$\""+
		"\u0001\u0000\u0000\u0000%(\u0003\u0006\u0003\u0000&(\u0003\u0002\u0001"+
		"\u0000\'%\u0001\u0000\u0000\u0000\'&\u0001\u0000\u0000\u0000(\u0001\u0001"+
		"\u0000\u0000\u0000)*\u0003\u0006\u0003\u0000*+\u0003\u0004\u0002\u0000"+
		"+,\u0003\u0006\u0003\u0000,F\u0001\u0000\u0000\u0000-.\u0005\u001e\u0000"+
		"\u0000./\u0003\u0006\u0003\u0000/0\u0005\u001f\u0000\u000001\u0003\u0004"+
		"\u0002\u000012\u0005\u001e\u0000\u000023\u0003\u0002\u0001\u000034\u0005"+
		"\u001f\u0000\u00004F\u0001\u0000\u0000\u000056\u0005\u001e\u0000\u0000"+
		"67\u0003\u0002\u0001\u000078\u0005\u001f\u0000\u000089\u0003\u0004\u0002"+
		"\u00009:\u0005\u001e\u0000\u0000:;\u0003\u0006\u0003\u0000;<\u0005\u001f"+
		"\u0000\u0000<F\u0001\u0000\u0000\u0000=>\u0005\u001e\u0000\u0000>?\u0003"+
		"\u0002\u0001\u0000?@\u0005\u001f\u0000\u0000@A\u0003\u0004\u0002\u0000"+
		"AB\u0005\u001e\u0000\u0000BC\u0003\u0002\u0001\u0000CD\u0005\u001f\u0000"+
		"\u0000DF\u0001\u0000\u0000\u0000E)\u0001\u0000\u0000\u0000E-\u0001\u0000"+
		"\u0000\u0000E5\u0001\u0000\u0000\u0000E=\u0001\u0000\u0000\u0000F\u0003"+
		"\u0001\u0000\u0000\u0000GH\u0007\u0000\u0000\u0000H\u0005\u0001\u0000"+
		"\u0000\u0000IO\u0003\b\u0004\u0000JO\u0003\n\u0005\u0000KO\u0003\f\u0006"+
		"\u0000LO\u0003\u000e\u0007\u0000MO\u0003\u0010\b\u0000NI\u0001\u0000\u0000"+
		"\u0000NJ\u0001\u0000\u0000\u0000NK\u0001\u0000\u0000\u0000NL\u0001\u0000"+
		"\u0000\u0000NM\u0001\u0000\u0000\u0000O\u0007\u0001\u0000\u0000\u0000"+
		"PQ\u0003\u001a\r\u0000QR\u0003\u0016\u000b\u0000RS\u0003\u0018\f\u0000"+
		"S\t\u0001\u0000\u0000\u0000TU\u0003\u001a\r\u0000UV\u0005 \u0000\u0000"+
		"VW\u0003\u0018\f\u0000WX\u0005!\u0000\u0000XY\u0003\u0018\f\u0000Y\u000b"+
		"\u0001\u0000\u0000\u0000Z[\u0003\u001a\r\u0000[\\\u0005#\u0000\u0000\\"+
		"]\u0005&\u0000\u0000]d\u0001\u0000\u0000\u0000^_\u0003\u001a\r\u0000_"+
		"`\u0005\b\u0000\u0000`a\u0005#\u0000\u0000ab\u0005&\u0000\u0000bd\u0001"+
		"\u0000\u0000\u0000cZ\u0001\u0000\u0000\u0000c^\u0001\u0000\u0000\u0000"+
		"d\r\u0001\u0000\u0000\u0000ef\u0003\u0012\t\u0000fg\u0005\u001e\u0000"+
		"\u0000gh\u0003\u0014\n\u0000hi\u0005\u001f\u0000\u0000i\u000f\u0001\u0000"+
		"\u0000\u0000jn\u0003\u001a\r\u0000km\u0005)\u0000\u0000lk\u0001\u0000"+
		"\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001"+
		"\u0000\u0000\u0000oq\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000"+
		"qu\u0005\u0006\u0000\u0000rt\u0005)\u0000\u0000sr\u0001\u0000\u0000\u0000"+
		"tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000"+
		"\u0000vx\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000xy\u0005\u001e"+
		"\u0000\u0000yz\u0003\u0014\n\u0000z{\u0005\u001f\u0000\u0000{\u0011\u0001"+
		"\u0000\u0000\u0000|}\u0005\'\u0000\u0000}~\u0005\u0017\u0000\u0000~\u0081"+
		"\u0005\'\u0000\u0000\u007f\u0081\u0005\'\u0000\u0000\u0080|\u0001\u0000"+
		"\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0013\u0001\u0000"+
		"\u0000\u0000\u0082\u0087\u0005\u0001\u0000\u0000\u0083\u0087\u0005&\u0000"+
		"\u0000\u0084\u0087\u0005\u0013\u0000\u0000\u0085\u0087\u0003\u001a\r\u0000"+
		"\u0086\u0082\u0001\u0000\u0000\u0000\u0086\u0083\u0001\u0000\u0000\u0000"+
		"\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0085\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u0015\u0000\u0000"+
		"\u0089\u0091\u0003\u0014\n\u0000\u008a\u008f\u0005\u0001\u0000\u0000\u008b"+
		"\u008f\u0005&\u0000\u0000\u008c\u008f\u0005\u0013\u0000\u0000\u008d\u008f"+
		"\u0003\u001a\r\u0000\u008e\u008a\u0001\u0000\u0000\u0000\u008e\u008b\u0001"+
		"\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008d\u0001"+
		"\u0000\u0000\u0000\u008f\u0091\u0001\u0000\u0000\u0000\u0090\u0086\u0001"+
		"\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0015\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0007\u0001\u0000\u0000\u0093\u0017\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0007\u0002\u0000\u0000\u0095\u0019\u0001"+
		"\u0000\u0000\u0000\u0096\u009e\u0005\'\u0000\u0000\u0097\u0098\u0005\u0011"+
		"\u0000\u0000\u0098\u0099\u0005\'\u0000\u0000\u0099\u009e\u0005\u0011\u0000"+
		"\u0000\u009a\u009b\u0005\u0012\u0000\u0000\u009b\u009c\u0005\'\u0000\u0000"+
		"\u009c\u009e\u0005\u0012\u0000\u0000\u009d\u0096\u0001\u0000\u0000\u0000"+
		"\u009d\u0097\u0001\u0000\u0000\u0000\u009d\u009a\u0001\u0000\u0000\u0000"+
		"\u009e\u001b\u0001\u0000\u0000\u0000\u009f\u00a7\u0005\'\u0000\u0000\u00a0"+
		"\u00a1\u0005\u0011\u0000\u0000\u00a1\u00a2\u0005\'\u0000\u0000\u00a2\u00a7"+
		"\u0005\u0011\u0000\u0000\u00a3\u00a4\u0005\u0012\u0000\u0000\u00a4\u00a5"+
		"\u0005\'\u0000\u0000\u00a5\u00a7\u0005\u0012\u0000\u0000\u00a6\u009f\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a0\u0001\u0000\u0000\u0000\u00a6\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a7\u001d\u0001\u0000\u0000\u0000\r\"\'ENcnu\u0080"+
		"\u0086\u008e\u0090\u009d\u00a6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
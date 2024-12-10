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
		AND=33, LIKE=34, LETTER=35, DIGIT=36, TEXT=37, STRING=38, FUNCTION_NAME=39, 
		SPACE=40;
	public static final int
		RULE_where_stmt = 0, RULE_where_and_condition = 1, RULE_where_condition = 2, 
		RULE_where_simple_condition = 3, RULE_where_between_condition = 4, RULE_where_like_condition = 5, 
		RULE_where_function_condition = 6, RULE_where_in_condition = 7, RULE_function_name = 8, 
		RULE_argument_list = 9, RULE_eq_type = 10, RULE_obj_type = 11, RULE_table_column_name = 12, 
		RULE_table_name = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"where_stmt", "where_and_condition", "where_condition", "where_simple_condition", 
			"where_between_condition", "where_like_condition", "where_function_condition", 
			"where_in_condition", "function_name", "argument_list", "eq_type", "obj_type", 
			"table_column_name", "table_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "'='", "'!='", 
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
			"GEQ", "LOWER", "LEQ", "SLASH", "OPAR", "CPAR", "BETWEEN", "AND", "LIKE", 
			"LETTER", "DIGIT", "TEXT", "STRING", "FUNCTION_NAME", "SPACE"
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
		public Where_and_conditionContext where_and_condition() {
			return getRuleContext(Where_and_conditionContext.class,0);
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
			setState(28);
			match(WHERE);
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(29);
				match(SPACE);
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(37);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(35);
				where_condition();
				}
				break;
			case 2:
				{
				setState(36);
				where_and_condition();
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
	public static class Where_and_conditionContext extends ParserRuleContext {
		public List<Where_conditionContext> where_condition() {
			return getRuleContexts(Where_conditionContext.class);
		}
		public Where_conditionContext where_condition(int i) {
			return getRuleContext(Where_conditionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(whereParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(whereParser.AND, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(whereParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(whereParser.SPACE, i);
		}
		public Where_and_conditionContext where_and_condition() {
			return getRuleContext(Where_and_conditionContext.class,0);
		}
		public Where_and_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_and_condition; }
	}

	public final Where_and_conditionContext where_and_condition() throws RecognitionException {
		Where_and_conditionContext _localctx = new Where_and_conditionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_where_and_condition);
		int _la;
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				where_condition();
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(40);
					match(SPACE);
					}
					}
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(46);
				match(AND);
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(47);
					match(SPACE);
					}
					}
					setState(52);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(53);
				where_condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				where_condition();
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(56);
					match(SPACE);
					}
					}
					setState(61);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(62);
				match(AND);
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(63);
					match(SPACE);
					}
					}
					setState(68);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(69);
				where_condition();
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(70);
					match(SPACE);
					}
					}
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(76);
				match(AND);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(77);
					match(SPACE);
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(83);
				where_and_condition();
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
		enterRule(_localctx, 4, RULE_where_condition);
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				where_simple_condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				where_between_condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				where_like_condition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				where_function_condition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(91);
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
		enterRule(_localctx, 6, RULE_where_simple_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			table_column_name();
			setState(95);
			eq_type();
			setState(96);
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
		enterRule(_localctx, 8, RULE_where_between_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			table_column_name();
			setState(99);
			match(BETWEEN);
			setState(100);
			obj_type();
			setState(101);
			match(AND);
			setState(102);
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
		enterRule(_localctx, 10, RULE_where_like_condition);
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				table_column_name();
				setState(105);
				match(LIKE);
				setState(106);
				match(TEXT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				table_column_name();
				setState(109);
				match(NOT);
				setState(110);
				match(LIKE);
				setState(111);
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
		enterRule(_localctx, 12, RULE_where_function_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			function_name();
			setState(116);
			match(OPAR);
			setState(117);
			argument_list();
			setState(118);
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
		enterRule(_localctx, 14, RULE_where_in_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			table_column_name();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(121);
				match(SPACE);
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			match(IN);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(128);
				match(SPACE);
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			match(OPAR);
			setState(135);
			argument_list();
			setState(136);
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
		enterRule(_localctx, 16, RULE_function_name);
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(STRING);
				setState(139);
				match(POINT);
				setState(140);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
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
		enterRule(_localctx, 18, RULE_argument_list);
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case QUOTED_DATE:
					{
					setState(144);
					match(QUOTED_DATE);
					}
					break;
				case TEXT:
					{
					setState(145);
					match(TEXT);
					}
					break;
				case NUMBER:
					{
					setState(146);
					match(NUMBER);
					}
					break;
				case DOUBLE_QUOTATION_MARK:
				case SINGLE_QUOTATION_MARK:
				case STRING:
					{
					setState(147);
					table_column_name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(150);
				match(COMMA);
				setState(151);
				argument_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case QUOTED_DATE:
					{
					setState(152);
					match(QUOTED_DATE);
					}
					break;
				case TEXT:
					{
					setState(153);
					match(TEXT);
					}
					break;
				case NUMBER:
					{
					setState(154);
					match(NUMBER);
					}
					break;
				case DOUBLE_QUOTATION_MARK:
				case SINGLE_QUOTATION_MARK:
				case STRING:
					{
					setState(155);
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
		enterRule(_localctx, 20, RULE_eq_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
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
		enterRule(_localctx, 22, RULE_obj_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 137439477762L) != 0)) ) {
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
		enterRule(_localctx, 24, RULE_table_column_name);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(STRING);
				}
				break;
			case DOUBLE_QUOTATION_MARK:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(DOUBLE_QUOTATION_MARK);
				setState(166);
				match(STRING);
				setState(167);
				match(DOUBLE_QUOTATION_MARK);
				}
				break;
			case SINGLE_QUOTATION_MARK:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				match(SINGLE_QUOTATION_MARK);
				setState(169);
				match(STRING);
				setState(170);
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
		enterRule(_localctx, 26, RULE_table_name);
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(STRING);
				}
				break;
			case DOUBLE_QUOTATION_MARK:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(DOUBLE_QUOTATION_MARK);
				setState(175);
				match(STRING);
				setState(176);
				match(DOUBLE_QUOTATION_MARK);
				}
				break;
			case SINGLE_QUOTATION_MARK:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				match(SINGLE_QUOTATION_MARK);
				setState(178);
				match(STRING);
				setState(179);
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
		"\u0004\u0001(\u00b7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0005\u0000\u001f\b"+
		"\u0000\n\u0000\f\u0000\"\t\u0000\u0001\u0000\u0001\u0000\u0003\u0000&"+
		"\b\u0000\u0001\u0001\u0001\u0001\u0005\u0001*\b\u0001\n\u0001\f\u0001"+
		"-\t\u0001\u0001\u0001\u0001\u0001\u0005\u00011\b\u0001\n\u0001\f\u0001"+
		"4\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		":\b\u0001\n\u0001\f\u0001=\t\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"A\b\u0001\n\u0001\f\u0001D\t\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"H\b\u0001\n\u0001\f\u0001K\t\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"O\b\u0001\n\u0001\f\u0001R\t\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"V\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002]\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005r\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0005\u0007{\b\u0007\n\u0007\f\u0007~\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u0082\b\u0007\n\u0007\f\u0007\u0085\t\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b"+
		"\u008f\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0095\b\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u009d\b\t\u0003\t\u009f\b\t"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u00ac\b\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u00b5\b\r\u0001\r\u0000\u0000\u000e"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u0000\u0002\u0002\u0000\n\u000b\u0019\u001c\u0003\u0000\u0001\u0001\u0013"+
		"\u0013%%\u00c4\u0000\u001c\u0001\u0000\u0000\u0000\u0002U\u0001\u0000"+
		"\u0000\u0000\u0004\\\u0001\u0000\u0000\u0000\u0006^\u0001\u0000\u0000"+
		"\u0000\bb\u0001\u0000\u0000\u0000\nq\u0001\u0000\u0000\u0000\fs\u0001"+
		"\u0000\u0000\u0000\u000ex\u0001\u0000\u0000\u0000\u0010\u008e\u0001\u0000"+
		"\u0000\u0000\u0012\u009e\u0001\u0000\u0000\u0000\u0014\u00a0\u0001\u0000"+
		"\u0000\u0000\u0016\u00a2\u0001\u0000\u0000\u0000\u0018\u00ab\u0001\u0000"+
		"\u0000\u0000\u001a\u00b4\u0001\u0000\u0000\u0000\u001c \u0005\u0005\u0000"+
		"\u0000\u001d\u001f\u0005(\u0000\u0000\u001e\u001d\u0001\u0000\u0000\u0000"+
		"\u001f\"\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 !\u0001"+
		"\u0000\u0000\u0000!%\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000"+
		"#&\u0003\u0004\u0002\u0000$&\u0003\u0002\u0001\u0000%#\u0001\u0000\u0000"+
		"\u0000%$\u0001\u0000\u0000\u0000&\u0001\u0001\u0000\u0000\u0000\'+\u0003"+
		"\u0004\u0002\u0000(*\u0005(\u0000\u0000)(\u0001\u0000\u0000\u0000*-\u0001"+
		"\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000"+
		",.\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000.2\u0005!\u0000\u0000"+
		"/1\u0005(\u0000\u00000/\u0001\u0000\u0000\u000014\u0001\u0000\u0000\u0000"+
		"20\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000035\u0001\u0000\u0000"+
		"\u000042\u0001\u0000\u0000\u000056\u0003\u0004\u0002\u00006V\u0001\u0000"+
		"\u0000\u00007;\u0003\u0004\u0002\u00008:\u0005(\u0000\u000098\u0001\u0000"+
		"\u0000\u0000:=\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001"+
		"\u0000\u0000\u0000<>\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000"+
		">B\u0005!\u0000\u0000?A\u0005(\u0000\u0000@?\u0001\u0000\u0000\u0000A"+
		"D\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000"+
		"\u0000CE\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000EI\u0003\u0004"+
		"\u0002\u0000FH\u0005(\u0000\u0000GF\u0001\u0000\u0000\u0000HK\u0001\u0000"+
		"\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JL\u0001"+
		"\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000LP\u0005!\u0000\u0000MO\u0005"+
		"(\u0000\u0000NM\u0001\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000PN\u0001"+
		"\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QS\u0001\u0000\u0000\u0000"+
		"RP\u0001\u0000\u0000\u0000ST\u0003\u0002\u0001\u0000TV\u0001\u0000\u0000"+
		"\u0000U\'\u0001\u0000\u0000\u0000U7\u0001\u0000\u0000\u0000V\u0003\u0001"+
		"\u0000\u0000\u0000W]\u0003\u0006\u0003\u0000X]\u0003\b\u0004\u0000Y]\u0003"+
		"\n\u0005\u0000Z]\u0003\f\u0006\u0000[]\u0003\u000e\u0007\u0000\\W\u0001"+
		"\u0000\u0000\u0000\\X\u0001\u0000\u0000\u0000\\Y\u0001\u0000\u0000\u0000"+
		"\\Z\u0001\u0000\u0000\u0000\\[\u0001\u0000\u0000\u0000]\u0005\u0001\u0000"+
		"\u0000\u0000^_\u0003\u0018\f\u0000_`\u0003\u0014\n\u0000`a\u0003\u0016"+
		"\u000b\u0000a\u0007\u0001\u0000\u0000\u0000bc\u0003\u0018\f\u0000cd\u0005"+
		" \u0000\u0000de\u0003\u0016\u000b\u0000ef\u0005!\u0000\u0000fg\u0003\u0016"+
		"\u000b\u0000g\t\u0001\u0000\u0000\u0000hi\u0003\u0018\f\u0000ij\u0005"+
		"\"\u0000\u0000jk\u0005%\u0000\u0000kr\u0001\u0000\u0000\u0000lm\u0003"+
		"\u0018\f\u0000mn\u0005\b\u0000\u0000no\u0005\"\u0000\u0000op\u0005%\u0000"+
		"\u0000pr\u0001\u0000\u0000\u0000qh\u0001\u0000\u0000\u0000ql\u0001\u0000"+
		"\u0000\u0000r\u000b\u0001\u0000\u0000\u0000st\u0003\u0010\b\u0000tu\u0005"+
		"\u001e\u0000\u0000uv\u0003\u0012\t\u0000vw\u0005\u001f\u0000\u0000w\r"+
		"\u0001\u0000\u0000\u0000x|\u0003\u0018\f\u0000y{\u0005(\u0000\u0000zy"+
		"\u0001\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000"+
		"\u0000|}\u0001\u0000\u0000\u0000}\u007f\u0001\u0000\u0000\u0000~|\u0001"+
		"\u0000\u0000\u0000\u007f\u0083\u0005\u0006\u0000\u0000\u0080\u0082\u0005"+
		"(\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0085\u0001\u0000"+
		"\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000"+
		"\u0000\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0005\u001e\u0000\u0000\u0087\u0088\u0003\u0012"+
		"\t\u0000\u0088\u0089\u0005\u001f\u0000\u0000\u0089\u000f\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0005&\u0000\u0000\u008b\u008c\u0005\u0017\u0000\u0000"+
		"\u008c\u008f\u0005&\u0000\u0000\u008d\u008f\u0005&\u0000\u0000\u008e\u008a"+
		"\u0001\u0000\u0000\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u0011"+
		"\u0001\u0000\u0000\u0000\u0090\u0095\u0005\u0001\u0000\u0000\u0091\u0095"+
		"\u0005%\u0000\u0000\u0092\u0095\u0005\u0013\u0000\u0000\u0093\u0095\u0003"+
		"\u0018\f\u0000\u0094\u0090\u0001\u0000\u0000\u0000\u0094\u0091\u0001\u0000"+
		"\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0093\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0097\u0005\u0015"+
		"\u0000\u0000\u0097\u009f\u0003\u0012\t\u0000\u0098\u009d\u0005\u0001\u0000"+
		"\u0000\u0099\u009d\u0005%\u0000\u0000\u009a\u009d\u0005\u0013\u0000\u0000"+
		"\u009b\u009d\u0003\u0018\f\u0000\u009c\u0098\u0001\u0000\u0000\u0000\u009c"+
		"\u0099\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c"+
		"\u009b\u0001\u0000\u0000\u0000\u009d\u009f\u0001\u0000\u0000\u0000\u009e"+
		"\u0094\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009f"+
		"\u0013\u0001\u0000\u0000\u0000\u00a0\u00a1\u0007\u0000\u0000\u0000\u00a1"+
		"\u0015\u0001\u0000\u0000\u0000\u00a2\u00a3\u0007\u0001\u0000\u0000\u00a3"+
		"\u0017\u0001\u0000\u0000\u0000\u00a4\u00ac\u0005&\u0000\u0000\u00a5\u00a6"+
		"\u0005\u0011\u0000\u0000\u00a6\u00a7\u0005&\u0000\u0000\u00a7\u00ac\u0005"+
		"\u0011\u0000\u0000\u00a8\u00a9\u0005\u0012\u0000\u0000\u00a9\u00aa\u0005"+
		"&\u0000\u0000\u00aa\u00ac\u0005\u0012\u0000\u0000\u00ab\u00a4\u0001\u0000"+
		"\u0000\u0000\u00ab\u00a5\u0001\u0000\u0000\u0000\u00ab\u00a8\u0001\u0000"+
		"\u0000\u0000\u00ac\u0019\u0001\u0000\u0000\u0000\u00ad\u00b5\u0005&\u0000"+
		"\u0000\u00ae\u00af\u0005\u0011\u0000\u0000\u00af\u00b0\u0005&\u0000\u0000"+
		"\u00b0\u00b5\u0005\u0011\u0000\u0000\u00b1\u00b2\u0005\u0012\u0000\u0000"+
		"\u00b2\u00b3\u0005&\u0000\u0000\u00b3\u00b5\u0005\u0012\u0000\u0000\u00b4"+
		"\u00ad\u0001\u0000\u0000\u0000\u00b4\u00ae\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b5\u001b\u0001\u0000\u0000\u0000\u0013"+
		" %+2;BIPU\\q|\u0083\u008e\u0094\u009c\u009e\u00ab\u00b4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
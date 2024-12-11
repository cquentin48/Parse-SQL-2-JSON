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
		RULE_where_stmt = 0, RULE_where_and_condition = 1, RULE_where_or_condition = 2, 
		RULE_where_condition = 3, RULE_where_simple_condition = 4, RULE_where_between_condition = 5, 
		RULE_where_like_condition = 6, RULE_where_function_condition = 7, RULE_where_in_condition = 8, 
		RULE_function_name = 9, RULE_argument_list = 10, RULE_eq_type = 11, RULE_obj_type = 12, 
		RULE_table_column_name = 13, RULE_table_name = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"where_stmt", "where_and_condition", "where_or_condition", "where_condition", 
			"where_simple_condition", "where_between_condition", "where_like_condition", 
			"where_function_condition", "where_in_condition", "function_name", "argument_list", 
			"eq_type", "obj_type", "table_column_name", "table_name"
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
		public TerminalNode OPAR() { return getToken(whereParser.OPAR, 0); }
		public List<Where_conditionContext> where_condition() {
			return getRuleContexts(Where_conditionContext.class);
		}
		public Where_conditionContext where_condition(int i) {
			return getRuleContext(Where_conditionContext.class,i);
		}
		public TerminalNode AND() { return getToken(whereParser.AND, 0); }
		public TerminalNode CPAR() { return getToken(whereParser.CPAR, 0); }
		public Where_and_conditionContext where_and_condition() {
			return getRuleContext(Where_and_conditionContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(whereParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(whereParser.SPACE, i);
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
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				match(OPAR);
				setState(42);
				where_condition();
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(43);
					match(SPACE);
					}
					}
					setState(48);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(49);
				match(AND);
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(50);
					match(SPACE);
					}
					}
					setState(55);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(58);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(56);
					where_condition();
					}
					break;
				case 2:
					{
					setState(57);
					where_and_condition();
					}
					break;
				}
				setState(60);
				match(CPAR);
				}
				break;
			case DOUBLE_QUOTATION_MARK:
			case SINGLE_QUOTATION_MARK:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				where_condition();
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
				match(AND);
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
				setState(78);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(76);
					where_condition();
					}
					break;
				case 2:
					{
					setState(77);
					where_and_condition();
					}
					break;
				}
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
	public static class Where_or_conditionContext extends ParserRuleContext {
		public TerminalNode OPAR() { return getToken(whereParser.OPAR, 0); }
		public List<Where_conditionContext> where_condition() {
			return getRuleContexts(Where_conditionContext.class);
		}
		public Where_conditionContext where_condition(int i) {
			return getRuleContext(Where_conditionContext.class,i);
		}
		public TerminalNode AND() { return getToken(whereParser.AND, 0); }
		public TerminalNode CPAR() { return getToken(whereParser.CPAR, 0); }
		public Where_or_conditionContext where_or_condition() {
			return getRuleContext(Where_or_conditionContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(whereParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(whereParser.SPACE, i);
		}
		public Where_or_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_or_condition; }
	}

	public final Where_or_conditionContext where_or_condition() throws RecognitionException {
		Where_or_conditionContext _localctx = new Where_or_conditionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_where_or_condition);
		int _la;
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(OPAR);
				setState(83);
				where_condition();
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(84);
					match(SPACE);
					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(90);
				match(AND);
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(91);
					match(SPACE);
					}
					}
					setState(96);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(99);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(97);
					where_condition();
					}
					break;
				case 2:
					{
					setState(98);
					where_or_condition();
					}
					break;
				}
				setState(101);
				match(CPAR);
				}
				break;
			case DOUBLE_QUOTATION_MARK:
			case SINGLE_QUOTATION_MARK:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				where_condition();
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(104);
					match(SPACE);
					}
					}
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(110);
				match(AND);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(111);
					match(SPACE);
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(119);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(117);
					where_condition();
					}
					break;
				case 2:
					{
					setState(118);
					where_or_condition();
					}
					break;
				}
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
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				where_simple_condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				where_between_condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				where_like_condition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(126);
				where_function_condition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(127);
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
			setState(130);
			table_column_name();
			setState(131);
			eq_type();
			setState(132);
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
			setState(134);
			table_column_name();
			setState(135);
			match(BETWEEN);
			setState(136);
			obj_type();
			setState(137);
			match(AND);
			setState(138);
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
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				table_column_name();
				setState(141);
				match(LIKE);
				setState(142);
				match(TEXT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				table_column_name();
				setState(145);
				match(NOT);
				setState(146);
				match(LIKE);
				setState(147);
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
			setState(151);
			function_name();
			setState(152);
			match(OPAR);
			setState(153);
			argument_list();
			setState(154);
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
			setState(156);
			table_column_name();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(157);
				match(SPACE);
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
			match(IN);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(164);
				match(SPACE);
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170);
			match(OPAR);
			setState(171);
			argument_list();
			setState(172);
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
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(STRING);
				setState(175);
				match(POINT);
				setState(176);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
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
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case QUOTED_DATE:
					{
					setState(180);
					match(QUOTED_DATE);
					}
					break;
				case TEXT:
					{
					setState(181);
					match(TEXT);
					}
					break;
				case NUMBER:
					{
					setState(182);
					match(NUMBER);
					}
					break;
				case DOUBLE_QUOTATION_MARK:
				case SINGLE_QUOTATION_MARK:
				case STRING:
					{
					setState(183);
					table_column_name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(186);
				match(COMMA);
				setState(187);
				argument_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case QUOTED_DATE:
					{
					setState(188);
					match(QUOTED_DATE);
					}
					break;
				case TEXT:
					{
					setState(189);
					match(TEXT);
					}
					break;
				case NUMBER:
					{
					setState(190);
					match(NUMBER);
					}
					break;
				case DOUBLE_QUOTATION_MARK:
				case SINGLE_QUOTATION_MARK:
				case STRING:
					{
					setState(191);
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
			setState(196);
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
			setState(198);
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
		enterRule(_localctx, 26, RULE_table_column_name);
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(STRING);
				}
				break;
			case DOUBLE_QUOTATION_MARK:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(DOUBLE_QUOTATION_MARK);
				setState(202);
				match(STRING);
				setState(203);
				match(DOUBLE_QUOTATION_MARK);
				}
				break;
			case SINGLE_QUOTATION_MARK:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				match(SINGLE_QUOTATION_MARK);
				setState(205);
				match(STRING);
				setState(206);
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
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(STRING);
				}
				break;
			case DOUBLE_QUOTATION_MARK:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(DOUBLE_QUOTATION_MARK);
				setState(211);
				match(STRING);
				setState(212);
				match(DOUBLE_QUOTATION_MARK);
				}
				break;
			case SINGLE_QUOTATION_MARK:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				match(SINGLE_QUOTATION_MARK);
				setState(214);
				match(STRING);
				setState(215);
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
		"\u0004\u0001(\u00db\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0005\u0000!\b\u0000\n\u0000\f\u0000$\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u0000(\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"-\b\u0001\n\u0001\f\u00010\t\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"4\b\u0001\n\u0001\f\u00017\t\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		";\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"A\b\u0001\n\u0001\f\u0001D\t\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"H\b\u0001\n\u0001\f\u0001K\t\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"O\b\u0001\u0003\u0001Q\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002V\b\u0002\n\u0002\f\u0002Y\t\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002]\b\u0002\n\u0002\f\u0002`\t\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002d\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002j\b\u0002\n\u0002\f\u0002m\t\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002q\b\u0002\n\u0002\f\u0002t\t\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002x\b\u0002\u0003\u0002z\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u0081\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u0096\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0005\b\u009f\b\b\n\b\f\b\u00a2\t\b\u0001\b\u0001\b\u0005"+
		"\b\u00a6\b\b\n\b\f\b\u00a9\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0003\t\u00b3\b\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u00b9\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00c1\b\n\u0003\n\u00c3\b\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00d0"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u00d9\b\u000e\u0001\u000e\u0000\u0000\u000f"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u0000\u0002\u0002\u0000\n\u000b\u0019\u001c\u0003\u0000\u0001\u0001"+
		"\u0013\u0013%%\u00ee\u0000\u001e\u0001\u0000\u0000\u0000\u0002P\u0001"+
		"\u0000\u0000\u0000\u0004y\u0001\u0000\u0000\u0000\u0006\u0080\u0001\u0000"+
		"\u0000\u0000\b\u0082\u0001\u0000\u0000\u0000\n\u0086\u0001\u0000\u0000"+
		"\u0000\f\u0095\u0001\u0000\u0000\u0000\u000e\u0097\u0001\u0000\u0000\u0000"+
		"\u0010\u009c\u0001\u0000\u0000\u0000\u0012\u00b2\u0001\u0000\u0000\u0000"+
		"\u0014\u00c2\u0001\u0000\u0000\u0000\u0016\u00c4\u0001\u0000\u0000\u0000"+
		"\u0018\u00c6\u0001\u0000\u0000\u0000\u001a\u00cf\u0001\u0000\u0000\u0000"+
		"\u001c\u00d8\u0001\u0000\u0000\u0000\u001e\"\u0005\u0005\u0000\u0000\u001f"+
		"!\u0005(\u0000\u0000 \u001f\u0001\u0000\u0000\u0000!$\u0001\u0000\u0000"+
		"\u0000\" \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#\'\u0001"+
		"\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000%(\u0003\u0006\u0003\u0000"+
		"&(\u0003\u0002\u0001\u0000\'%\u0001\u0000\u0000\u0000\'&\u0001\u0000\u0000"+
		"\u0000(\u0001\u0001\u0000\u0000\u0000)*\u0005\u001e\u0000\u0000*.\u0003"+
		"\u0006\u0003\u0000+-\u0005(\u0000\u0000,+\u0001\u0000\u0000\u0000-0\u0001"+
		"\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000"+
		"/1\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000015\u0005!\u0000\u0000"+
		"24\u0005(\u0000\u000032\u0001\u0000\u0000\u000047\u0001\u0000\u0000\u0000"+
		"53\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u00006:\u0001\u0000\u0000"+
		"\u000075\u0001\u0000\u0000\u00008;\u0003\u0006\u0003\u00009;\u0003\u0002"+
		"\u0001\u0000:8\u0001\u0000\u0000\u0000:9\u0001\u0000\u0000\u0000;<\u0001"+
		"\u0000\u0000\u0000<=\u0005\u001f\u0000\u0000=Q\u0001\u0000\u0000\u0000"+
		">B\u0003\u0006\u0003\u0000?A\u0005(\u0000\u0000@?\u0001\u0000\u0000\u0000"+
		"AD\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000"+
		"\u0000CE\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000EI\u0005!\u0000"+
		"\u0000FH\u0005(\u0000\u0000GF\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000"+
		"\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JN\u0001\u0000"+
		"\u0000\u0000KI\u0001\u0000\u0000\u0000LO\u0003\u0006\u0003\u0000MO\u0003"+
		"\u0002\u0001\u0000NL\u0001\u0000\u0000\u0000NM\u0001\u0000\u0000\u0000"+
		"OQ\u0001\u0000\u0000\u0000P)\u0001\u0000\u0000\u0000P>\u0001\u0000\u0000"+
		"\u0000Q\u0003\u0001\u0000\u0000\u0000RS\u0005\u001e\u0000\u0000SW\u0003"+
		"\u0006\u0003\u0000TV\u0005(\u0000\u0000UT\u0001\u0000\u0000\u0000VY\u0001"+
		"\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000"+
		"XZ\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000Z^\u0005!\u0000\u0000"+
		"[]\u0005(\u0000\u0000\\[\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000"+
		"^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_c\u0001\u0000\u0000"+
		"\u0000`^\u0001\u0000\u0000\u0000ad\u0003\u0006\u0003\u0000bd\u0003\u0004"+
		"\u0002\u0000ca\u0001\u0000\u0000\u0000cb\u0001\u0000\u0000\u0000de\u0001"+
		"\u0000\u0000\u0000ef\u0005\u001f\u0000\u0000fz\u0001\u0000\u0000\u0000"+
		"gk\u0003\u0006\u0003\u0000hj\u0005(\u0000\u0000ih\u0001\u0000\u0000\u0000"+
		"jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000"+
		"\u0000ln\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000nr\u0005!\u0000"+
		"\u0000oq\u0005(\u0000\u0000po\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000"+
		"\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000sw\u0001\u0000"+
		"\u0000\u0000tr\u0001\u0000\u0000\u0000ux\u0003\u0006\u0003\u0000vx\u0003"+
		"\u0004\u0002\u0000wu\u0001\u0000\u0000\u0000wv\u0001\u0000\u0000\u0000"+
		"xz\u0001\u0000\u0000\u0000yR\u0001\u0000\u0000\u0000yg\u0001\u0000\u0000"+
		"\u0000z\u0005\u0001\u0000\u0000\u0000{\u0081\u0003\b\u0004\u0000|\u0081"+
		"\u0003\n\u0005\u0000}\u0081\u0003\f\u0006\u0000~\u0081\u0003\u000e\u0007"+
		"\u0000\u007f\u0081\u0003\u0010\b\u0000\u0080{\u0001\u0000\u0000\u0000"+
		"\u0080|\u0001\u0000\u0000\u0000\u0080}\u0001\u0000\u0000\u0000\u0080~"+
		"\u0001\u0000\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0007"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0003\u001a\r\u0000\u0083\u0084\u0003"+
		"\u0016\u000b\u0000\u0084\u0085\u0003\u0018\f\u0000\u0085\t\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0003\u001a\r\u0000\u0087\u0088\u0005 \u0000"+
		"\u0000\u0088\u0089\u0003\u0018\f\u0000\u0089\u008a\u0005!\u0000\u0000"+
		"\u008a\u008b\u0003\u0018\f\u0000\u008b\u000b\u0001\u0000\u0000\u0000\u008c"+
		"\u008d\u0003\u001a\r\u0000\u008d\u008e\u0005\"\u0000\u0000\u008e\u008f"+
		"\u0005%\u0000\u0000\u008f\u0096\u0001\u0000\u0000\u0000\u0090\u0091\u0003"+
		"\u001a\r\u0000\u0091\u0092\u0005\b\u0000\u0000\u0092\u0093\u0005\"\u0000"+
		"\u0000\u0093\u0094\u0005%\u0000\u0000\u0094\u0096\u0001\u0000\u0000\u0000"+
		"\u0095\u008c\u0001\u0000\u0000\u0000\u0095\u0090\u0001\u0000\u0000\u0000"+
		"\u0096\r\u0001\u0000\u0000\u0000\u0097\u0098\u0003\u0012\t\u0000\u0098"+
		"\u0099\u0005\u001e\u0000\u0000\u0099\u009a\u0003\u0014\n\u0000\u009a\u009b"+
		"\u0005\u001f\u0000\u0000\u009b\u000f\u0001\u0000\u0000\u0000\u009c\u00a0"+
		"\u0003\u001a\r\u0000\u009d\u009f\u0005(\u0000\u0000\u009e\u009d\u0001"+
		"\u0000\u0000\u0000\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0\u009e\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a7\u0005"+
		"\u0006\u0000\u0000\u00a4\u00a6\u0005(\u0000\u0000\u00a5\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00aa\u0001\u0000"+
		"\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\u001e"+
		"\u0000\u0000\u00ab\u00ac\u0003\u0014\n\u0000\u00ac\u00ad\u0005\u001f\u0000"+
		"\u0000\u00ad\u0011\u0001\u0000\u0000\u0000\u00ae\u00af\u0005&\u0000\u0000"+
		"\u00af\u00b0\u0005\u0017\u0000\u0000\u00b0\u00b3\u0005&\u0000\u0000\u00b1"+
		"\u00b3\u0005&\u0000\u0000\u00b2\u00ae\u0001\u0000\u0000\u0000\u00b2\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b3\u0013\u0001\u0000\u0000\u0000\u00b4\u00b9"+
		"\u0005\u0001\u0000\u0000\u00b5\u00b9\u0005%\u0000\u0000\u00b6\u00b9\u0005"+
		"\u0013\u0000\u0000\u00b7\u00b9\u0003\u001a\r\u0000\u00b8\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b5\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bb\u0005\u0015\u0000\u0000\u00bb\u00c3\u0003\u0014"+
		"\n\u0000\u00bc\u00c1\u0005\u0001\u0000\u0000\u00bd\u00c1\u0005%\u0000"+
		"\u0000\u00be\u00c1\u0005\u0013\u0000\u0000\u00bf\u00c1\u0003\u001a\r\u0000"+
		"\u00c0\u00bc\u0001\u0000\u0000\u0000\u00c0\u00bd\u0001\u0000\u0000\u0000"+
		"\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2\u00b8\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3\u0015\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c5\u0007\u0000\u0000\u0000\u00c5\u0017\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c7\u0007\u0001\u0000\u0000\u00c7\u0019\u0001\u0000\u0000\u0000"+
		"\u00c8\u00d0\u0005&\u0000\u0000\u00c9\u00ca\u0005\u0011\u0000\u0000\u00ca"+
		"\u00cb\u0005&\u0000\u0000\u00cb\u00d0\u0005\u0011\u0000\u0000\u00cc\u00cd"+
		"\u0005\u0012\u0000\u0000\u00cd\u00ce\u0005&\u0000\u0000\u00ce\u00d0\u0005"+
		"\u0012\u0000\u0000\u00cf\u00c8\u0001\u0000\u0000\u0000\u00cf\u00c9\u0001"+
		"\u0000\u0000\u0000\u00cf\u00cc\u0001\u0000\u0000\u0000\u00d0\u001b\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d9\u0005&\u0000\u0000\u00d2\u00d3\u0005\u0011"+
		"\u0000\u0000\u00d3\u00d4\u0005&\u0000\u0000\u00d4\u00d9\u0005\u0011\u0000"+
		"\u0000\u00d5\u00d6\u0005\u0012\u0000\u0000\u00d6\u00d7\u0005&\u0000\u0000"+
		"\u00d7\u00d9\u0005\u0012\u0000\u0000\u00d8\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d2\u0001\u0000\u0000\u0000\u00d8\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d9\u001d\u0001\u0000\u0000\u0000\u001a\"\'.5:BINPW^ckrwy\u0080\u0095"+
		"\u00a0\u00a7\u00b2\u00b8\u00c0\u00c2\u00cf\u00d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
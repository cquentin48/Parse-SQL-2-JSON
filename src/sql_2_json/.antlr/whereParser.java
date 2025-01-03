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
				where_and_or_condition(0);
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
		public List<Where_conditionContext> where_condition() {
			return getRuleContexts(Where_conditionContext.class);
		}
		public Where_conditionContext where_condition(int i) {
			return getRuleContext(Where_conditionContext.class,i);
		}
		public And_or_operatorsContext and_or_operators() {
			return getRuleContext(And_or_operatorsContext.class,0);
		}
		public List<Where_and_or_conditionContext> where_and_or_condition() {
			return getRuleContexts(Where_and_or_conditionContext.class);
		}
		public Where_and_or_conditionContext where_and_or_condition(int i) {
			return getRuleContext(Where_and_or_conditionContext.class,i);
		}
		public Where_and_or_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_and_or_condition; }
	}

	public final Where_and_or_conditionContext where_and_or_condition() throws RecognitionException {
		return where_and_or_condition(0);
	}

	private Where_and_or_conditionContext where_and_or_condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Where_and_or_conditionContext _localctx = new Where_and_or_conditionContext(_ctx, _parentState);
		Where_and_or_conditionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_where_and_or_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(42);
				where_condition();
				setState(43);
				and_or_operators();
				setState(44);
				where_and_or_condition(2);
				}
				break;
			case 2:
				{
				setState(46);
				where_condition();
				setState(47);
				and_or_operators();
				setState(48);
				where_condition();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(60);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new Where_and_or_conditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_where_and_or_condition);
						setState(52);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(53);
						and_or_operators();
						setState(54);
						where_and_or_condition(5);
						}
						break;
					case 2:
						{
						_localctx = new Where_and_or_conditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_where_and_or_condition);
						setState(56);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(57);
						and_or_operators();
						setState(58);
						where_condition();
						}
						break;
					}
					} 
				}
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
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
			setState(65);
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
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				where_simple_condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				where_between_condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				where_like_condition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				where_function_condition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(71);
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
			setState(74);
			table_column_name();
			setState(75);
			eq_type();
			setState(76);
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
			setState(78);
			table_column_name();
			setState(79);
			match(BETWEEN);
			setState(80);
			obj_type();
			setState(81);
			match(AND);
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
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				table_column_name();
				setState(85);
				match(LIKE);
				setState(86);
				match(TEXT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				table_column_name();
				setState(89);
				match(NOT);
				setState(90);
				match(LIKE);
				setState(91);
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
			setState(95);
			function_name();
			setState(96);
			match(OPAR);
			setState(97);
			argument_list();
			setState(98);
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
			setState(100);
			table_column_name();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(101);
				match(SPACE);
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			match(IN);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(108);
				match(SPACE);
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			match(OPAR);
			setState(115);
			argument_list();
			setState(116);
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
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(STRING);
				setState(119);
				match(POINT);
				setState(120);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
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
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case QUOTED_DATE:
					{
					setState(124);
					match(QUOTED_DATE);
					}
					break;
				case TEXT:
					{
					setState(125);
					match(TEXT);
					}
					break;
				case NUMBER:
					{
					setState(126);
					match(NUMBER);
					}
					break;
				case DOUBLE_QUOTATION_MARK:
				case SINGLE_QUOTATION_MARK:
				case STRING:
					{
					setState(127);
					table_column_name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(130);
				match(COMMA);
				setState(131);
				argument_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case QUOTED_DATE:
					{
					setState(132);
					match(QUOTED_DATE);
					}
					break;
				case TEXT:
					{
					setState(133);
					match(TEXT);
					}
					break;
				case NUMBER:
					{
					setState(134);
					match(NUMBER);
					}
					break;
				case DOUBLE_QUOTATION_MARK:
				case SINGLE_QUOTATION_MARK:
				case STRING:
					{
					setState(135);
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
			setState(140);
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
			setState(142);
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
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(STRING);
				}
				break;
			case DOUBLE_QUOTATION_MARK:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(DOUBLE_QUOTATION_MARK);
				setState(146);
				match(STRING);
				setState(147);
				match(DOUBLE_QUOTATION_MARK);
				}
				break;
			case SINGLE_QUOTATION_MARK:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				match(SINGLE_QUOTATION_MARK);
				setState(149);
				match(STRING);
				setState(150);
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
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(STRING);
				}
				break;
			case DOUBLE_QUOTATION_MARK:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(DOUBLE_QUOTATION_MARK);
				setState(155);
				match(STRING);
				setState(156);
				match(DOUBLE_QUOTATION_MARK);
				}
				break;
			case SINGLE_QUOTATION_MARK:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				match(SINGLE_QUOTATION_MARK);
				setState(158);
				match(STRING);
				setState(159);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return where_and_or_condition_sempred((Where_and_or_conditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean where_and_or_condition_sempred(Where_and_or_conditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001)\u00a3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0005\u0000!\b\u0000\n\u0000\f\u0000$\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u0000(\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"3\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001=\b\u0001\n\u0001\f\u0001"+
		"@\t\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003I\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"^\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0005\bg\b\b\n\b\f\bj\t\b\u0001\b\u0001\b\u0005\bn\b"+
		"\b\n\b\f\bq\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t{\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0081"+
		"\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0089\b\n"+
		"\u0003\n\u008b\b\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0098\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00a1\b\u000e\u0001\u000e\u0000\u0001\u0002\u000f\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000"+
		"\u0003\u0001\u0000!\"\u0002\u0000\n\u000b\u0019\u001c\u0003\u0000\u0001"+
		"\u0001\u0013\u0013&&\u00ab\u0000\u001e\u0001\u0000\u0000\u0000\u00022"+
		"\u0001\u0000\u0000\u0000\u0004A\u0001\u0000\u0000\u0000\u0006H\u0001\u0000"+
		"\u0000\u0000\bJ\u0001\u0000\u0000\u0000\nN\u0001\u0000\u0000\u0000\f]"+
		"\u0001\u0000\u0000\u0000\u000e_\u0001\u0000\u0000\u0000\u0010d\u0001\u0000"+
		"\u0000\u0000\u0012z\u0001\u0000\u0000\u0000\u0014\u008a\u0001\u0000\u0000"+
		"\u0000\u0016\u008c\u0001\u0000\u0000\u0000\u0018\u008e\u0001\u0000\u0000"+
		"\u0000\u001a\u0097\u0001\u0000\u0000\u0000\u001c\u00a0\u0001\u0000\u0000"+
		"\u0000\u001e\"\u0005\u0005\u0000\u0000\u001f!\u0005)\u0000\u0000 \u001f"+
		"\u0001\u0000\u0000\u0000!$\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000"+
		"\u0000\"#\u0001\u0000\u0000\u0000#\'\u0001\u0000\u0000\u0000$\"\u0001"+
		"\u0000\u0000\u0000%(\u0003\u0006\u0003\u0000&(\u0003\u0002\u0001\u0000"+
		"\'%\u0001\u0000\u0000\u0000\'&\u0001\u0000\u0000\u0000(\u0001\u0001\u0000"+
		"\u0000\u0000)*\u0006\u0001\uffff\uffff\u0000*+\u0003\u0006\u0003\u0000"+
		"+,\u0003\u0004\u0002\u0000,-\u0003\u0002\u0001\u0002-3\u0001\u0000\u0000"+
		"\u0000./\u0003\u0006\u0003\u0000/0\u0003\u0004\u0002\u000001\u0003\u0006"+
		"\u0003\u000013\u0001\u0000\u0000\u00002)\u0001\u0000\u0000\u00002.\u0001"+
		"\u0000\u0000\u00003>\u0001\u0000\u0000\u000045\n\u0004\u0000\u000056\u0003"+
		"\u0004\u0002\u000067\u0003\u0002\u0001\u00057=\u0001\u0000\u0000\u0000"+
		"89\n\u0003\u0000\u00009:\u0003\u0004\u0002\u0000:;\u0003\u0006\u0003\u0000"+
		";=\u0001\u0000\u0000\u0000<4\u0001\u0000\u0000\u0000<8\u0001\u0000\u0000"+
		"\u0000=@\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000"+
		"\u0000\u0000?\u0003\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000"+
		"AB\u0007\u0000\u0000\u0000B\u0005\u0001\u0000\u0000\u0000CI\u0003\b\u0004"+
		"\u0000DI\u0003\n\u0005\u0000EI\u0003\f\u0006\u0000FI\u0003\u000e\u0007"+
		"\u0000GI\u0003\u0010\b\u0000HC\u0001\u0000\u0000\u0000HD\u0001\u0000\u0000"+
		"\u0000HE\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HG\u0001\u0000"+
		"\u0000\u0000I\u0007\u0001\u0000\u0000\u0000JK\u0003\u001a\r\u0000KL\u0003"+
		"\u0016\u000b\u0000LM\u0003\u0018\f\u0000M\t\u0001\u0000\u0000\u0000NO"+
		"\u0003\u001a\r\u0000OP\u0005 \u0000\u0000PQ\u0003\u0018\f\u0000QR\u0005"+
		"!\u0000\u0000RS\u0003\u0018\f\u0000S\u000b\u0001\u0000\u0000\u0000TU\u0003"+
		"\u001a\r\u0000UV\u0005#\u0000\u0000VW\u0005&\u0000\u0000W^\u0001\u0000"+
		"\u0000\u0000XY\u0003\u001a\r\u0000YZ\u0005\b\u0000\u0000Z[\u0005#\u0000"+
		"\u0000[\\\u0005&\u0000\u0000\\^\u0001\u0000\u0000\u0000]T\u0001\u0000"+
		"\u0000\u0000]X\u0001\u0000\u0000\u0000^\r\u0001\u0000\u0000\u0000_`\u0003"+
		"\u0012\t\u0000`a\u0005\u001e\u0000\u0000ab\u0003\u0014\n\u0000bc\u0005"+
		"\u001f\u0000\u0000c\u000f\u0001\u0000\u0000\u0000dh\u0003\u001a\r\u0000"+
		"eg\u0005)\u0000\u0000fe\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000"+
		"hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ik\u0001\u0000\u0000"+
		"\u0000jh\u0001\u0000\u0000\u0000ko\u0005\u0006\u0000\u0000ln\u0005)\u0000"+
		"\u0000ml\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000om\u0001\u0000"+
		"\u0000\u0000op\u0001\u0000\u0000\u0000pr\u0001\u0000\u0000\u0000qo\u0001"+
		"\u0000\u0000\u0000rs\u0005\u001e\u0000\u0000st\u0003\u0014\n\u0000tu\u0005"+
		"\u001f\u0000\u0000u\u0011\u0001\u0000\u0000\u0000vw\u0005\'\u0000\u0000"+
		"wx\u0005\u0017\u0000\u0000x{\u0005\'\u0000\u0000y{\u0005\'\u0000\u0000"+
		"zv\u0001\u0000\u0000\u0000zy\u0001\u0000\u0000\u0000{\u0013\u0001\u0000"+
		"\u0000\u0000|\u0081\u0005\u0001\u0000\u0000}\u0081\u0005&\u0000\u0000"+
		"~\u0081\u0005\u0013\u0000\u0000\u007f\u0081\u0003\u001a\r\u0000\u0080"+
		"|\u0001\u0000\u0000\u0000\u0080}\u0001\u0000\u0000\u0000\u0080~\u0001"+
		"\u0000\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0005\u0015\u0000\u0000\u0083\u008b\u0003"+
		"\u0014\n\u0000\u0084\u0089\u0005\u0001\u0000\u0000\u0085\u0089\u0005&"+
		"\u0000\u0000\u0086\u0089\u0005\u0013\u0000\u0000\u0087\u0089\u0003\u001a"+
		"\r\u0000\u0088\u0084\u0001\u0000\u0000\u0000\u0088\u0085\u0001\u0000\u0000"+
		"\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0087\u0001\u0000\u0000"+
		"\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a\u0080\u0001\u0000\u0000"+
		"\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u0015\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0007\u0001\u0000\u0000\u008d\u0017\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0007\u0002\u0000\u0000\u008f\u0019\u0001\u0000\u0000"+
		"\u0000\u0090\u0098\u0005\'\u0000\u0000\u0091\u0092\u0005\u0011\u0000\u0000"+
		"\u0092\u0093\u0005\'\u0000\u0000\u0093\u0098\u0005\u0011\u0000\u0000\u0094"+
		"\u0095\u0005\u0012\u0000\u0000\u0095\u0096\u0005\'\u0000\u0000\u0096\u0098"+
		"\u0005\u0012\u0000\u0000\u0097\u0090\u0001\u0000\u0000\u0000\u0097\u0091"+
		"\u0001\u0000\u0000\u0000\u0097\u0094\u0001\u0000\u0000\u0000\u0098\u001b"+
		"\u0001\u0000\u0000\u0000\u0099\u00a1\u0005\'\u0000\u0000\u009a\u009b\u0005"+
		"\u0011\u0000\u0000\u009b\u009c\u0005\'\u0000\u0000\u009c\u00a1\u0005\u0011"+
		"\u0000\u0000\u009d\u009e\u0005\u0012\u0000\u0000\u009e\u009f\u0005\'\u0000"+
		"\u0000\u009f\u00a1\u0005\u0012\u0000\u0000\u00a0\u0099\u0001\u0000\u0000"+
		"\u0000\u00a0\u009a\u0001\u0000\u0000\u0000\u00a0\u009d\u0001\u0000\u0000"+
		"\u0000\u00a1\u001d\u0001\u0000\u0000\u0000\u000f\"\'2<>H]hoz\u0080\u0088"+
		"\u008a\u0097\u00a0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
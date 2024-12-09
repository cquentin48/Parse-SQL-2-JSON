// Generated from /home/quentin/Documents/personnel/sql_parser/src/sql_2_json/Sql.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SqlParser extends Parser {
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
		RULE_whole_query = 0, RULE_query = 1, RULE_select_stmt = 2, RULE_every_columns = 3, 
		RULE_from_stmt = 4, RULE_no_join_table = 5, RULE_inner_join_table = 6, 
		RULE_inner_join_type = 7, RULE_inner_join_eq = 8, RULE_natural_join_stmt = 9, 
		RULE_where_stmt = 10, RULE_where_condition = 11, RULE_where_simple_condition = 12, 
		RULE_where_between_condition = 13, RULE_where_like_condition = 14, RULE_where_function_condition = 15, 
		RULE_where_in_condition = 16, RULE_function_name = 17, RULE_argument_list = 18, 
		RULE_eq_type = 19, RULE_obj_type = 20, RULE_table_column_name = 21, RULE_table_name = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"whole_query", "query", "select_stmt", "every_columns", "from_stmt", 
			"no_join_table", "inner_join_table", "inner_join_type", "inner_join_eq", 
			"natural_join_stmt", "where_stmt", "where_condition", "where_simple_condition", 
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
	public String getGrammarFileName() { return "Sql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Whole_queryContext extends ParserRuleContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SqlParser.SEMICOLON, 0); }
		public List<TerminalNode> SPACE() { return getTokens(SqlParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(SqlParser.SPACE, i);
		}
		public Whole_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whole_query; }
	}

	public final Whole_queryContext whole_query() throws RecognitionException {
		Whole_queryContext _localctx = new Whole_queryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_whole_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			query();
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
			match(SEMICOLON);
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
	public static class QueryContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SqlParser.SELECT, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlParser.FROM, 0); }
		public From_stmtContext from_stmt() {
			return getRuleContext(From_stmtContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(SqlParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(SqlParser.SPACE, i);
		}
		public Where_stmtContext where_stmt() {
			return getRuleContext(Where_stmtContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_query);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(SELECT);
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
			select_stmt();
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
			match(FROM);
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
			from_stmt();
			setState(80);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(77);
					match(SPACE);
					}
					} 
				}
				setState(82);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(83);
				where_stmt();
				}
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
	public static class Select_stmtContext extends ParserRuleContext {
		public List<Table_column_nameContext> table_column_name() {
			return getRuleContexts(Table_column_nameContext.class);
		}
		public Table_column_nameContext table_column_name(int i) {
			return getRuleContext(Table_column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(SqlParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(SqlParser.SPACE, i);
		}
		public Every_columnsContext every_columns() {
			return getRuleContext(Every_columnsContext.class,0);
		}
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_select_stmt);
		int _la;
		try {
			int _alt;
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_QUOTATION_MARK:
			case SINGLE_QUOTATION_MARK:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(86);
						table_column_name();
						setState(87);
						match(COMMA);
						setState(91);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==SPACE) {
							{
							{
							setState(88);
							match(SPACE);
							}
							}
							setState(93);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						} 
					}
					setState(98);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(99);
				table_column_name();
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				every_columns();
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
	public static class Every_columnsContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(SqlParser.STAR, 0); }
		public Every_columnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_every_columns; }
	}

	public final Every_columnsContext every_columns() throws RecognitionException {
		Every_columnsContext _localctx = new Every_columnsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_every_columns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(STAR);
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
	public static class From_stmtContext extends ParserRuleContext {
		public No_join_tableContext no_join_table() {
			return getRuleContext(No_join_tableContext.class,0);
		}
		public Inner_join_tableContext inner_join_table() {
			return getRuleContext(Inner_join_tableContext.class,0);
		}
		public Natural_join_stmtContext natural_join_stmt() {
			return getRuleContext(Natural_join_stmtContext.class,0);
		}
		public From_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_stmt; }
	}

	public final From_stmtContext from_stmt() throws RecognitionException {
		From_stmtContext _localctx = new From_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_from_stmt);
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				no_join_table();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				inner_join_table();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				natural_join_stmt();
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
	public static class No_join_tableContext extends ParserRuleContext {
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(SqlParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(SqlParser.SPACE, i);
		}
		public No_join_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_join_table; }
	}

	public final No_join_tableContext no_join_table() throws RecognitionException {
		No_join_tableContext _localctx = new No_join_tableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_no_join_table);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(110);
					table_name();
					setState(111);
					match(COMMA);
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SPACE) {
						{
						{
						setState(112);
						match(SPACE);
						}
						}
						setState(117);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(123);
			table_name();
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
	public static class Inner_join_tableContext extends ParserRuleContext {
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public Inner_join_typeContext inner_join_type() {
			return getRuleContext(Inner_join_typeContext.class,0);
		}
		public TerminalNode ON() { return getToken(SqlParser.ON, 0); }
		public Inner_join_eqContext inner_join_eq() {
			return getRuleContext(Inner_join_eqContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(SqlParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(SqlParser.SPACE, i);
		}
		public Inner_join_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inner_join_table; }
	}

	public final Inner_join_tableContext inner_join_table() throws RecognitionException {
		Inner_join_tableContext _localctx = new Inner_join_tableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_inner_join_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			table_name();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(126);
				match(SPACE);
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
			inner_join_type();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(133);
				match(SPACE);
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
			table_name();
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(140);
				match(SPACE);
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
			match(ON);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(147);
				match(SPACE);
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153);
			inner_join_eq();
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
	public static class Inner_join_typeContext extends ParserRuleContext {
		public TerminalNode INNER_JOIN() { return getToken(SqlParser.INNER_JOIN, 0); }
		public TerminalNode LEFT_JOIN() { return getToken(SqlParser.LEFT_JOIN, 0); }
		public TerminalNode RIGHT_JOIN() { return getToken(SqlParser.RIGHT_JOIN, 0); }
		public TerminalNode FULL_OUTER_JOIN() { return getToken(SqlParser.FULL_OUTER_JOIN, 0); }
		public Inner_join_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inner_join_type; }
	}

	public final Inner_join_typeContext inner_join_type() throws RecognitionException {
		Inner_join_typeContext _localctx = new Inner_join_typeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_inner_join_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 94208L) != 0)) ) {
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
	public static class Inner_join_eqContext extends ParserRuleContext {
		public List<Table_column_nameContext> table_column_name() {
			return getRuleContexts(Table_column_nameContext.class);
		}
		public Table_column_nameContext table_column_name(int i) {
			return getRuleContext(Table_column_nameContext.class,i);
		}
		public TerminalNode EQ() { return getToken(SqlParser.EQ, 0); }
		public List<TerminalNode> SPACE() { return getTokens(SqlParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(SqlParser.SPACE, i);
		}
		public Inner_join_eqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inner_join_eq; }
	}

	public final Inner_join_eqContext inner_join_eq() throws RecognitionException {
		Inner_join_eqContext _localctx = new Inner_join_eqContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_inner_join_eq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			table_column_name();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(158);
				match(SPACE);
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			match(EQ);
			setState(165);
			table_column_name();
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
	public static class Natural_join_stmtContext extends ParserRuleContext {
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public TerminalNode NATURAL_JOIN() { return getToken(SqlParser.NATURAL_JOIN, 0); }
		public List<TerminalNode> SPACE() { return getTokens(SqlParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(SqlParser.SPACE, i);
		}
		public Natural_join_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_natural_join_stmt; }
	}

	public final Natural_join_stmtContext natural_join_stmt() throws RecognitionException {
		Natural_join_stmtContext _localctx = new Natural_join_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_natural_join_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			table_name();
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(168);
				match(SPACE);
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
			match(NATURAL_JOIN);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(175);
				match(SPACE);
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181);
			table_name();
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
	public static class Where_stmtContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(SqlParser.WHERE, 0); }
		public Where_conditionContext where_condition() {
			return getRuleContext(Where_conditionContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(SqlParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(SqlParser.SPACE, i);
		}
		public Where_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_stmt; }
	}

	public final Where_stmtContext where_stmt() throws RecognitionException {
		Where_stmtContext _localctx = new Where_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_where_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(WHERE);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(184);
				match(SPACE);
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(190);
			where_condition();
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
		public Where_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_condition; }
	}

	public final Where_conditionContext where_condition() throws RecognitionException {
		Where_conditionContext _localctx = new Where_conditionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_where_condition);
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				where_simple_condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				where_between_condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				where_like_condition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				where_function_condition();
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
		enterRule(_localctx, 24, RULE_where_simple_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			table_column_name();
			setState(199);
			eq_type();
			setState(200);
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
		public TerminalNode BETWEEN() { return getToken(SqlParser.BETWEEN, 0); }
		public List<Obj_typeContext> obj_type() {
			return getRuleContexts(Obj_typeContext.class);
		}
		public Obj_typeContext obj_type(int i) {
			return getRuleContext(Obj_typeContext.class,i);
		}
		public TerminalNode AND() { return getToken(SqlParser.AND, 0); }
		public Where_between_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_between_condition; }
	}

	public final Where_between_conditionContext where_between_condition() throws RecognitionException {
		Where_between_conditionContext _localctx = new Where_between_conditionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_where_between_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			table_column_name();
			setState(203);
			match(BETWEEN);
			setState(204);
			obj_type();
			setState(205);
			match(AND);
			setState(206);
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
		public TerminalNode LIKE() { return getToken(SqlParser.LIKE, 0); }
		public TerminalNode TEXT() { return getToken(SqlParser.TEXT, 0); }
		public TerminalNode NOT() { return getToken(SqlParser.NOT, 0); }
		public Where_like_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_like_condition; }
	}

	public final Where_like_conditionContext where_like_condition() throws RecognitionException {
		Where_like_conditionContext _localctx = new Where_like_conditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_where_like_condition);
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				table_column_name();
				setState(209);
				match(LIKE);
				setState(210);
				match(TEXT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				table_column_name();
				setState(213);
				match(NOT);
				setState(214);
				match(LIKE);
				setState(215);
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
		public TerminalNode OPAR() { return getToken(SqlParser.OPAR, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(SqlParser.CPAR, 0); }
		public Where_function_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_function_condition; }
	}

	public final Where_function_conditionContext where_function_condition() throws RecognitionException {
		Where_function_conditionContext _localctx = new Where_function_conditionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_where_function_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			function_name();
			setState(220);
			match(OPAR);
			setState(221);
			argument_list();
			setState(222);
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
		public TerminalNode IN() { return getToken(SqlParser.IN, 0); }
		public TerminalNode OPAR() { return getToken(SqlParser.OPAR, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(SqlParser.CPAR, 0); }
		public List<TerminalNode> SPACE() { return getTokens(SqlParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(SqlParser.SPACE, i);
		}
		public Where_in_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_in_condition; }
	}

	public final Where_in_conditionContext where_in_condition() throws RecognitionException {
		Where_in_conditionContext _localctx = new Where_in_conditionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_where_in_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			table_column_name();
			setState(226); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(225);
				match(SPACE);
				}
				}
				setState(228); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(230);
			match(IN);
			setState(232); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(231);
				match(SPACE);
				}
				}
				setState(234); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(236);
			match(OPAR);
			setState(237);
			argument_list();
			setState(238);
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
		public List<TerminalNode> STRING() { return getTokens(SqlParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlParser.STRING, i);
		}
		public TerminalNode POINT() { return getToken(SqlParser.POINT, 0); }
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_function_name);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				match(STRING);
				setState(241);
				match(POINT);
				setState(242);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
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
		public TerminalNode COMMA() { return getToken(SqlParser.COMMA, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public TerminalNode QUOTED_DATE() { return getToken(SqlParser.QUOTED_DATE, 0); }
		public TerminalNode TEXT() { return getToken(SqlParser.TEXT, 0); }
		public TerminalNode NUMBER() { return getToken(SqlParser.NUMBER, 0); }
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
		enterRule(_localctx, 36, RULE_argument_list);
		try {
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case QUOTED_DATE:
					{
					setState(246);
					match(QUOTED_DATE);
					}
					break;
				case TEXT:
					{
					setState(247);
					match(TEXT);
					}
					break;
				case NUMBER:
					{
					setState(248);
					match(NUMBER);
					}
					break;
				case DOUBLE_QUOTATION_MARK:
				case SINGLE_QUOTATION_MARK:
				case STRING:
					{
					setState(249);
					table_column_name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(252);
				match(COMMA);
				setState(253);
				argument_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case QUOTED_DATE:
					{
					setState(254);
					match(QUOTED_DATE);
					}
					break;
				case TEXT:
					{
					setState(255);
					match(TEXT);
					}
					break;
				case NUMBER:
					{
					setState(256);
					match(NUMBER);
					}
					break;
				case DOUBLE_QUOTATION_MARK:
				case SINGLE_QUOTATION_MARK:
				case STRING:
					{
					setState(257);
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
		public TerminalNode EQ() { return getToken(SqlParser.EQ, 0); }
		public TerminalNode GREATER() { return getToken(SqlParser.GREATER, 0); }
		public TerminalNode LOWER() { return getToken(SqlParser.LOWER, 0); }
		public TerminalNode GEQ() { return getToken(SqlParser.GEQ, 0); }
		public TerminalNode LEQ() { return getToken(SqlParser.LEQ, 0); }
		public TerminalNode DIFFERENT() { return getToken(SqlParser.DIFFERENT, 0); }
		public Eq_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq_type; }
	}

	public final Eq_typeContext eq_type() throws RecognitionException {
		Eq_typeContext _localctx = new Eq_typeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_eq_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
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
		public TerminalNode QUOTED_DATE() { return getToken(SqlParser.QUOTED_DATE, 0); }
		public TerminalNode TEXT() { return getToken(SqlParser.TEXT, 0); }
		public TerminalNode NUMBER() { return getToken(SqlParser.NUMBER, 0); }
		public Obj_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj_type; }
	}

	public final Obj_typeContext obj_type() throws RecognitionException {
		Obj_typeContext _localctx = new Obj_typeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_obj_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
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
		public TerminalNode STRING() { return getToken(SqlParser.STRING, 0); }
		public List<TerminalNode> DOUBLE_QUOTATION_MARK() { return getTokens(SqlParser.DOUBLE_QUOTATION_MARK); }
		public TerminalNode DOUBLE_QUOTATION_MARK(int i) {
			return getToken(SqlParser.DOUBLE_QUOTATION_MARK, i);
		}
		public List<TerminalNode> SINGLE_QUOTATION_MARK() { return getTokens(SqlParser.SINGLE_QUOTATION_MARK); }
		public TerminalNode SINGLE_QUOTATION_MARK(int i) {
			return getToken(SqlParser.SINGLE_QUOTATION_MARK, i);
		}
		public Table_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_column_name; }
	}

	public final Table_column_nameContext table_column_name() throws RecognitionException {
		Table_column_nameContext _localctx = new Table_column_nameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_table_column_name);
		try {
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(STRING);
				}
				break;
			case DOUBLE_QUOTATION_MARK:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(DOUBLE_QUOTATION_MARK);
				setState(268);
				match(STRING);
				setState(269);
				match(DOUBLE_QUOTATION_MARK);
				}
				break;
			case SINGLE_QUOTATION_MARK:
				enterOuterAlt(_localctx, 3);
				{
				setState(270);
				match(SINGLE_QUOTATION_MARK);
				setState(271);
				match(STRING);
				setState(272);
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
		public TerminalNode STRING() { return getToken(SqlParser.STRING, 0); }
		public List<TerminalNode> DOUBLE_QUOTATION_MARK() { return getTokens(SqlParser.DOUBLE_QUOTATION_MARK); }
		public TerminalNode DOUBLE_QUOTATION_MARK(int i) {
			return getToken(SqlParser.DOUBLE_QUOTATION_MARK, i);
		}
		public List<TerminalNode> SINGLE_QUOTATION_MARK() { return getTokens(SqlParser.SINGLE_QUOTATION_MARK); }
		public TerminalNode SINGLE_QUOTATION_MARK(int i) {
			return getToken(SqlParser.SINGLE_QUOTATION_MARK, i);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_table_name);
		try {
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(STRING);
				}
				break;
			case DOUBLE_QUOTATION_MARK:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				match(DOUBLE_QUOTATION_MARK);
				setState(277);
				match(STRING);
				setState(278);
				match(DOUBLE_QUOTATION_MARK);
				}
				break;
			case SINGLE_QUOTATION_MARK:
				enterOuterAlt(_localctx, 3);
				{
				setState(279);
				match(SINGLE_QUOTATION_MARK);
				setState(280);
				match(STRING);
				setState(281);
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
		"\u0004\u0001(\u011d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000\u0005\u00001\b\u0000"+
		"\n\u0000\f\u00004\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0005\u0001:\b\u0001\n\u0001\f\u0001=\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001A\b\u0001\n\u0001\f\u0001D\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001H\b\u0001\n\u0001\f\u0001K\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001O\b\u0001\n\u0001\f\u0001R\t\u0001\u0001\u0001\u0003\u0001"+
		"U\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002Z\b\u0002\n\u0002"+
		"\f\u0002]\t\u0002\u0005\u0002_\b\u0002\n\u0002\f\u0002b\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002f\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004m\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005r\b\u0005\n\u0005\f\u0005u\t\u0005\u0005"+
		"\u0005w\b\u0005\n\u0005\f\u0005z\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u0080\b\u0006\n\u0006\f\u0006\u0083\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006\u0087\b\u0006\n\u0006\f\u0006\u008a"+
		"\t\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u008e\b\u0006\n\u0006\f\u0006"+
		"\u0091\t\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0095\b\u0006\n\u0006"+
		"\f\u0006\u0098\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0005\b\u00a0\b\b\n\b\f\b\u00a3\t\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0005\t\u00aa\b\t\n\t\f\t\u00ad\t\t\u0001\t\u0001\t"+
		"\u0005\t\u00b1\b\t\n\t\f\t\u00b4\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0005"+
		"\n\u00ba\b\n\n\n\f\n\u00bd\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u00c5\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u00da\b\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0004\u0010"+
		"\u00e3\b\u0010\u000b\u0010\f\u0010\u00e4\u0001\u0010\u0001\u0010\u0004"+
		"\u0010\u00e9\b\u0010\u000b\u0010\f\u0010\u00ea\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u00f5\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u00fb\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u0103\b\u0012\u0003\u0012\u0105\b"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u0112\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u011b\b\u0016\u0001\u0016\u0000"+
		"\u0000\u0017\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,\u0000\u0003\u0002\u0000\f\u000e\u0010"+
		"\u0010\u0002\u0000\n\u000b\u0019\u001c\u0003\u0000\u0001\u0001\u0013\u0013"+
		"%%\u012c\u0000.\u0001\u0000\u0000\u0000\u00027\u0001\u0000\u0000\u0000"+
		"\u0004e\u0001\u0000\u0000\u0000\u0006g\u0001\u0000\u0000\u0000\bl\u0001"+
		"\u0000\u0000\u0000\nx\u0001\u0000\u0000\u0000\f}\u0001\u0000\u0000\u0000"+
		"\u000e\u009b\u0001\u0000\u0000\u0000\u0010\u009d\u0001\u0000\u0000\u0000"+
		"\u0012\u00a7\u0001\u0000\u0000\u0000\u0014\u00b7\u0001\u0000\u0000\u0000"+
		"\u0016\u00c4\u0001\u0000\u0000\u0000\u0018\u00c6\u0001\u0000\u0000\u0000"+
		"\u001a\u00ca\u0001\u0000\u0000\u0000\u001c\u00d9\u0001\u0000\u0000\u0000"+
		"\u001e\u00db\u0001\u0000\u0000\u0000 \u00e0\u0001\u0000\u0000\u0000\""+
		"\u00f4\u0001\u0000\u0000\u0000$\u0104\u0001\u0000\u0000\u0000&\u0106\u0001"+
		"\u0000\u0000\u0000(\u0108\u0001\u0000\u0000\u0000*\u0111\u0001\u0000\u0000"+
		"\u0000,\u011a\u0001\u0000\u0000\u0000.2\u0003\u0002\u0001\u0000/1\u0005"+
		"(\u0000\u00000/\u0001\u0000\u0000\u000014\u0001\u0000\u0000\u000020\u0001"+
		"\u0000\u0000\u000023\u0001\u0000\u0000\u000035\u0001\u0000\u0000\u0000"+
		"42\u0001\u0000\u0000\u000056\u0005\u0016\u0000\u00006\u0001\u0001\u0000"+
		"\u0000\u00007;\u0005\u0003\u0000\u00008:\u0005(\u0000\u000098\u0001\u0000"+
		"\u0000\u0000:=\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001"+
		"\u0000\u0000\u0000<>\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000"+
		">B\u0003\u0004\u0002\u0000?A\u0005(\u0000\u0000@?\u0001\u0000\u0000\u0000"+
		"AD\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000"+
		"\u0000CE\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000EI\u0005\u0004"+
		"\u0000\u0000FH\u0005(\u0000\u0000GF\u0001\u0000\u0000\u0000HK\u0001\u0000"+
		"\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JL\u0001"+
		"\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000LP\u0003\b\u0004\u0000MO\u0005"+
		"(\u0000\u0000NM\u0001\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000PN\u0001"+
		"\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QT\u0001\u0000\u0000\u0000"+
		"RP\u0001\u0000\u0000\u0000SU\u0003\u0014\n\u0000TS\u0001\u0000\u0000\u0000"+
		"TU\u0001\u0000\u0000\u0000U\u0003\u0001\u0000\u0000\u0000VW\u0003*\u0015"+
		"\u0000W[\u0005\u0015\u0000\u0000XZ\u0005(\u0000\u0000YX\u0001\u0000\u0000"+
		"\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000"+
		"\u0000\u0000\\_\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000^V\u0001"+
		"\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000"+
		"`a\u0001\u0000\u0000\u0000ac\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000"+
		"\u0000cf\u0003*\u0015\u0000df\u0003\u0006\u0003\u0000e`\u0001\u0000\u0000"+
		"\u0000ed\u0001\u0000\u0000\u0000f\u0005\u0001\u0000\u0000\u0000gh\u0005"+
		"\u0018\u0000\u0000h\u0007\u0001\u0000\u0000\u0000im\u0003\n\u0005\u0000"+
		"jm\u0003\f\u0006\u0000km\u0003\u0012\t\u0000li\u0001\u0000\u0000\u0000"+
		"lj\u0001\u0000\u0000\u0000lk\u0001\u0000\u0000\u0000m\t\u0001\u0000\u0000"+
		"\u0000no\u0003,\u0016\u0000os\u0005\u0015\u0000\u0000pr\u0005(\u0000\u0000"+
		"qp\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000"+
		"\u0000st\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000"+
		"\u0000\u0000vn\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001"+
		"\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y{\u0001\u0000\u0000\u0000"+
		"zx\u0001\u0000\u0000\u0000{|\u0003,\u0016\u0000|\u000b\u0001\u0000\u0000"+
		"\u0000}\u0081\u0003,\u0016\u0000~\u0080\u0005(\u0000\u0000\u007f~\u0001"+
		"\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0084\u0001"+
		"\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0088\u0003"+
		"\u000e\u0007\u0000\u0085\u0087\u0005(\u0000\u0000\u0086\u0085\u0001\u0000"+
		"\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008b\u0001\u0000"+
		"\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u008f\u0003,\u0016"+
		"\u0000\u008c\u008e\u0005(\u0000\u0000\u008d\u008c\u0001\u0000\u0000\u0000"+
		"\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0092\u0001\u0000\u0000\u0000"+
		"\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0096\u0005\u0007\u0000\u0000"+
		"\u0093\u0095\u0005(\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0095"+
		"\u0098\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\u0001\u0000\u0000\u0000\u0097\u0099\u0001\u0000\u0000\u0000\u0098"+
		"\u0096\u0001\u0000\u0000\u0000\u0099\u009a\u0003\u0010\b\u0000\u009a\r"+
		"\u0001\u0000\u0000\u0000\u009b\u009c\u0007\u0000\u0000\u0000\u009c\u000f"+
		"\u0001\u0000\u0000\u0000\u009d\u00a1\u0003*\u0015\u0000\u009e\u00a0\u0005"+
		"(\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0005\n\u0000\u0000\u00a5\u00a6\u0003*\u0015"+
		"\u0000\u00a6\u0011\u0001\u0000\u0000\u0000\u00a7\u00ab\u0003,\u0016\u0000"+
		"\u00a8\u00aa\u0005(\u0000\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ad\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ae\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ae\u00b2\u0005\u000f\u0000\u0000\u00af"+
		"\u00b1\u0005(\u0000\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b5\u0001\u0000\u0000\u0000\u00b4\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0003,\u0016\u0000\u00b6\u0013\u0001"+
		"\u0000\u0000\u0000\u00b7\u00bb\u0005\u0005\u0000\u0000\u00b8\u00ba\u0005"+
		"(\u0000\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000"+
		"\u0000\u0000\u00bc\u00be\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000"+
		"\u0000\u0000\u00be\u00bf\u0003\u0016\u000b\u0000\u00bf\u0015\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c5\u0003\u0018\f\u0000\u00c1\u00c5\u0003\u001a\r"+
		"\u0000\u00c2\u00c5\u0003\u001c\u000e\u0000\u00c3\u00c5\u0003\u001e\u000f"+
		"\u0000\u00c4\u00c0\u0001\u0000\u0000\u0000\u00c4\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c5\u0017\u0001\u0000\u0000\u0000\u00c6\u00c7\u0003*\u0015\u0000"+
		"\u00c7\u00c8\u0003&\u0013\u0000\u00c8\u00c9\u0003(\u0014\u0000\u00c9\u0019"+
		"\u0001\u0000\u0000\u0000\u00ca\u00cb\u0003*\u0015\u0000\u00cb\u00cc\u0005"+
		" \u0000\u0000\u00cc\u00cd\u0003(\u0014\u0000\u00cd\u00ce\u0005!\u0000"+
		"\u0000\u00ce\u00cf\u0003(\u0014\u0000\u00cf\u001b\u0001\u0000\u0000\u0000"+
		"\u00d0\u00d1\u0003*\u0015\u0000\u00d1\u00d2\u0005\"\u0000\u0000\u00d2"+
		"\u00d3\u0005%\u0000\u0000\u00d3\u00da\u0001\u0000\u0000\u0000\u00d4\u00d5"+
		"\u0003*\u0015\u0000\u00d5\u00d6\u0005\b\u0000\u0000\u00d6\u00d7\u0005"+
		"\"\u0000\u0000\u00d7\u00d8\u0005%\u0000\u0000\u00d8\u00da\u0001\u0000"+
		"\u0000\u0000\u00d9\u00d0\u0001\u0000\u0000\u0000\u00d9\u00d4\u0001\u0000"+
		"\u0000\u0000\u00da\u001d\u0001\u0000\u0000\u0000\u00db\u00dc\u0003\"\u0011"+
		"\u0000\u00dc\u00dd\u0005\u001e\u0000\u0000\u00dd\u00de\u0003$\u0012\u0000"+
		"\u00de\u00df\u0005\u001f\u0000\u0000\u00df\u001f\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e2\u0003*\u0015\u0000\u00e1\u00e3\u0005(\u0000\u0000\u00e2\u00e1"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e8\u0005\u0006\u0000\u0000\u00e7\u00e9"+
		"\u0005(\u0000\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001"+
		"\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005"+
		"\u001e\u0000\u0000\u00ed\u00ee\u0003$\u0012\u0000\u00ee\u00ef\u0005\u001f"+
		"\u0000\u0000\u00ef!\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005&\u0000\u0000"+
		"\u00f1\u00f2\u0005\u0017\u0000\u0000\u00f2\u00f5\u0005&\u0000\u0000\u00f3"+
		"\u00f5\u0005&\u0000\u0000\u00f4\u00f0\u0001\u0000\u0000\u0000\u00f4\u00f3"+
		"\u0001\u0000\u0000\u0000\u00f5#\u0001\u0000\u0000\u0000\u00f6\u00fb\u0005"+
		"\u0001\u0000\u0000\u00f7\u00fb\u0005%\u0000\u0000\u00f8\u00fb\u0005\u0013"+
		"\u0000\u0000\u00f9\u00fb\u0003*\u0015\u0000\u00fa\u00f6\u0001\u0000\u0000"+
		"\u0000\u00fa\u00f7\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000"+
		"\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fd\u0005\u0015\u0000\u0000\u00fd\u0105\u0003$\u0012\u0000"+
		"\u00fe\u0103\u0005\u0001\u0000\u0000\u00ff\u0103\u0005%\u0000\u0000\u0100"+
		"\u0103\u0005\u0013\u0000\u0000\u0101\u0103\u0003*\u0015\u0000\u0102\u00fe"+
		"\u0001\u0000\u0000\u0000\u0102\u00ff\u0001\u0000\u0000\u0000\u0102\u0100"+
		"\u0001\u0000\u0000\u0000\u0102\u0101\u0001\u0000\u0000\u0000\u0103\u0105"+
		"\u0001\u0000\u0000\u0000\u0104\u00fa\u0001\u0000\u0000\u0000\u0104\u0102"+
		"\u0001\u0000\u0000\u0000\u0105%\u0001\u0000\u0000\u0000\u0106\u0107\u0007"+
		"\u0001\u0000\u0000\u0107\'\u0001\u0000\u0000\u0000\u0108\u0109\u0007\u0002"+
		"\u0000\u0000\u0109)\u0001\u0000\u0000\u0000\u010a\u0112\u0005&\u0000\u0000"+
		"\u010b\u010c\u0005\u0011\u0000\u0000\u010c\u010d\u0005&\u0000\u0000\u010d"+
		"\u0112\u0005\u0011\u0000\u0000\u010e\u010f\u0005\u0012\u0000\u0000\u010f"+
		"\u0110\u0005&\u0000\u0000\u0110\u0112\u0005\u0012\u0000\u0000\u0111\u010a"+
		"\u0001\u0000\u0000\u0000\u0111\u010b\u0001\u0000\u0000\u0000\u0111\u010e"+
		"\u0001\u0000\u0000\u0000\u0112+\u0001\u0000\u0000\u0000\u0113\u011b\u0005"+
		"&\u0000\u0000\u0114\u0115\u0005\u0011\u0000\u0000\u0115\u0116\u0005&\u0000"+
		"\u0000\u0116\u011b\u0005\u0011\u0000\u0000\u0117\u0118\u0005\u0012\u0000"+
		"\u0000\u0118\u0119\u0005&\u0000\u0000\u0119\u011b\u0005\u0012\u0000\u0000"+
		"\u011a\u0113\u0001\u0000\u0000\u0000\u011a\u0114\u0001\u0000\u0000\u0000"+
		"\u011a\u0117\u0001\u0000\u0000\u0000\u011b-\u0001\u0000\u0000\u0000\u001e"+
		"2;BIPT[`elsx\u0081\u0088\u008f\u0096\u00a1\u00ab\u00b2\u00bb\u00c4\u00d9"+
		"\u00e4\u00ea\u00f4\u00fa\u0102\u0104\u0111\u011a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
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
		RULE_function_name = 16, RULE_argument_list = 17, RULE_eq_type = 18, RULE_obj_type = 19, 
		RULE_table_column_name = 20, RULE_table_name = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"whole_query", "query", "select_stmt", "every_columns", "from_stmt", 
			"no_join_table", "inner_join_table", "inner_join_type", "inner_join_eq", 
			"natural_join_stmt", "where_stmt", "where_condition", "where_simple_condition", 
			"where_between_condition", "where_like_condition", "where_function_condition", 
			"function_name", "argument_list", "eq_type", "obj_type", "table_column_name", 
			"table_name"
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
			setState(44);
			query();
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(45);
				match(SPACE);
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
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
			setState(53);
			match(SELECT);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(54);
				match(SPACE);
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			select_stmt();
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(61);
				match(SPACE);
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			match(FROM);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(68);
				match(SPACE);
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			from_stmt();
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(75);
					match(SPACE);
					}
					} 
				}
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(81);
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
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_QUOTATION_MARK:
			case SINGLE_QUOTATION_MARK:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(84);
						table_column_name();
						setState(85);
						match(COMMA);
						setState(89);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==SPACE) {
							{
							{
							setState(86);
							match(SPACE);
							}
							}
							setState(91);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						} 
					}
					setState(96);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(97);
				table_column_name();
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
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
			setState(101);
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
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				no_join_table();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				inner_join_table();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
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
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(108);
					table_name();
					setState(109);
					match(COMMA);
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SPACE) {
						{
						{
						setState(110);
						match(SPACE);
						}
						}
						setState(115);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(121);
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
			setState(123);
			table_name();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(124);
				match(SPACE);
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
			inner_join_type();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(131);
				match(SPACE);
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
			table_name();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(138);
				match(SPACE);
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
			match(ON);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(145);
				match(SPACE);
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
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
			setState(153);
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
			setState(155);
			table_column_name();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(156);
				match(SPACE);
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			match(EQ);
			setState(163);
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
			setState(165);
			table_name();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(166);
				match(SPACE);
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
			match(NATURAL_JOIN);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(173);
				match(SPACE);
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(179);
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
			setState(181);
			match(WHERE);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(182);
				match(SPACE);
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
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
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				where_simple_condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				where_between_condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				where_like_condition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
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
			setState(196);
			table_column_name();
			setState(197);
			eq_type();
			setState(198);
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
			setState(200);
			table_column_name();
			setState(201);
			match(BETWEEN);
			setState(202);
			obj_type();
			setState(203);
			match(AND);
			setState(204);
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
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				table_column_name();
				setState(207);
				match(LIKE);
				setState(208);
				match(TEXT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				table_column_name();
				setState(211);
				match(NOT);
				setState(212);
				match(LIKE);
				setState(213);
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
			setState(217);
			function_name();
			setState(218);
			match(OPAR);
			setState(219);
			argument_list();
			setState(220);
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
		enterRule(_localctx, 32, RULE_function_name);
		try {
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(STRING);
				setState(223);
				match(POINT);
				setState(224);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
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
		enterRule(_localctx, 34, RULE_argument_list);
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case QUOTED_DATE:
					{
					setState(228);
					match(QUOTED_DATE);
					}
					break;
				case TEXT:
					{
					setState(229);
					match(TEXT);
					}
					break;
				case NUMBER:
					{
					setState(230);
					match(NUMBER);
					}
					break;
				case DOUBLE_QUOTATION_MARK:
				case SINGLE_QUOTATION_MARK:
				case STRING:
					{
					setState(231);
					table_column_name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(234);
				match(COMMA);
				setState(235);
				argument_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case QUOTED_DATE:
					{
					setState(236);
					match(QUOTED_DATE);
					}
					break;
				case TEXT:
					{
					setState(237);
					match(TEXT);
					}
					break;
				case NUMBER:
					{
					setState(238);
					match(NUMBER);
					}
					break;
				case DOUBLE_QUOTATION_MARK:
				case SINGLE_QUOTATION_MARK:
				case STRING:
					{
					setState(239);
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
		enterRule(_localctx, 36, RULE_eq_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
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
		enterRule(_localctx, 38, RULE_obj_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
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
		enterRule(_localctx, 40, RULE_table_column_name);
		try {
			setState(255);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(STRING);
				}
				break;
			case DOUBLE_QUOTATION_MARK:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				match(DOUBLE_QUOTATION_MARK);
				setState(250);
				match(STRING);
				setState(251);
				match(DOUBLE_QUOTATION_MARK);
				}
				break;
			case SINGLE_QUOTATION_MARK:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				match(SINGLE_QUOTATION_MARK);
				setState(253);
				match(STRING);
				setState(254);
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
		enterRule(_localctx, 42, RULE_table_name);
		try {
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				match(STRING);
				}
				break;
			case DOUBLE_QUOTATION_MARK:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				match(DOUBLE_QUOTATION_MARK);
				setState(259);
				match(STRING);
				setState(260);
				match(DOUBLE_QUOTATION_MARK);
				}
				break;
			case SINGLE_QUOTATION_MARK:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				match(SINGLE_QUOTATION_MARK);
				setState(262);
				match(STRING);
				setState(263);
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
		"\u0004\u0001(\u010b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0001\u0000\u0005\u0000/\b\u0000\n\u0000\f\u00002\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u00018\b\u0001"+
		"\n\u0001\f\u0001;\t\u0001\u0001\u0001\u0001\u0001\u0005\u0001?\b\u0001"+
		"\n\u0001\f\u0001B\t\u0001\u0001\u0001\u0001\u0001\u0005\u0001F\b\u0001"+
		"\n\u0001\f\u0001I\t\u0001\u0001\u0001\u0001\u0001\u0005\u0001M\b\u0001"+
		"\n\u0001\f\u0001P\t\u0001\u0001\u0001\u0003\u0001S\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002X\b\u0002\n\u0002\f\u0002[\t\u0002"+
		"\u0005\u0002]\b\u0002\n\u0002\f\u0002`\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002d\b\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004k\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005p\b\u0005\n\u0005\f\u0005s\t\u0005\u0005\u0005u\b\u0005\n"+
		"\u0005\f\u0005x\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0005\u0006~\b\u0006\n\u0006\f\u0006\u0081\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u0085\b\u0006\n\u0006\f\u0006\u0088\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u008c\b\u0006\n\u0006\f\u0006\u008f\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u0093\b\u0006\n\u0006\f\u0006\u0096\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0005"+
		"\b\u009e\b\b\n\b\f\b\u00a1\t\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t"+
		"\u0005\t\u00a8\b\t\n\t\f\t\u00ab\t\t\u0001\t\u0001\t\u0005\t\u00af\b\t"+
		"\n\t\f\t\u00b2\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0005\n\u00b8\b\n\n"+
		"\n\f\n\u00bb\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u00c3\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u00d8\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u00e3\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u00e9\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u00f1\b\u0011\u0003\u0011\u00f3\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u0100\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u0109\b\u0015\u0001\u0015\u0000\u0000"+
		"\u0016\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*\u0000\u0003\u0002\u0000\f\u000e\u0010\u0010"+
		"\u0002\u0000\n\u000b\u0019\u001c\u0003\u0000\u0001\u0001\u0013\u0013%"+
		"%\u0119\u0000,\u0001\u0000\u0000\u0000\u00025\u0001\u0000\u0000\u0000"+
		"\u0004c\u0001\u0000\u0000\u0000\u0006e\u0001\u0000\u0000\u0000\bj\u0001"+
		"\u0000\u0000\u0000\nv\u0001\u0000\u0000\u0000\f{\u0001\u0000\u0000\u0000"+
		"\u000e\u0099\u0001\u0000\u0000\u0000\u0010\u009b\u0001\u0000\u0000\u0000"+
		"\u0012\u00a5\u0001\u0000\u0000\u0000\u0014\u00b5\u0001\u0000\u0000\u0000"+
		"\u0016\u00c2\u0001\u0000\u0000\u0000\u0018\u00c4\u0001\u0000\u0000\u0000"+
		"\u001a\u00c8\u0001\u0000\u0000\u0000\u001c\u00d7\u0001\u0000\u0000\u0000"+
		"\u001e\u00d9\u0001\u0000\u0000\u0000 \u00e2\u0001\u0000\u0000\u0000\""+
		"\u00f2\u0001\u0000\u0000\u0000$\u00f4\u0001\u0000\u0000\u0000&\u00f6\u0001"+
		"\u0000\u0000\u0000(\u00ff\u0001\u0000\u0000\u0000*\u0108\u0001\u0000\u0000"+
		"\u0000,0\u0003\u0002\u0001\u0000-/\u0005(\u0000\u0000.-\u0001\u0000\u0000"+
		"\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000001\u0001\u0000"+
		"\u0000\u000013\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u000034\u0005"+
		"\u0016\u0000\u00004\u0001\u0001\u0000\u0000\u000059\u0005\u0003\u0000"+
		"\u000068\u0005(\u0000\u000076\u0001\u0000\u0000\u00008;\u0001\u0000\u0000"+
		"\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:<\u0001\u0000"+
		"\u0000\u0000;9\u0001\u0000\u0000\u0000<@\u0003\u0004\u0002\u0000=?\u0005"+
		"(\u0000\u0000>=\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001"+
		"\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AC\u0001\u0000\u0000\u0000"+
		"B@\u0001\u0000\u0000\u0000CG\u0005\u0004\u0000\u0000DF\u0005(\u0000\u0000"+
		"ED\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000"+
		"\u0000GH\u0001\u0000\u0000\u0000HJ\u0001\u0000\u0000\u0000IG\u0001\u0000"+
		"\u0000\u0000JN\u0003\b\u0004\u0000KM\u0005(\u0000\u0000LK\u0001\u0000"+
		"\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001"+
		"\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000"+
		"QS\u0003\u0014\n\u0000RQ\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000"+
		"S\u0003\u0001\u0000\u0000\u0000TU\u0003(\u0014\u0000UY\u0005\u0015\u0000"+
		"\u0000VX\u0005(\u0000\u0000WV\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000"+
		"\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z]\u0001\u0000"+
		"\u0000\u0000[Y\u0001\u0000\u0000\u0000\\T\u0001\u0000\u0000\u0000]`\u0001"+
		"\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000"+
		"_a\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000ad\u0003(\u0014\u0000"+
		"bd\u0003\u0006\u0003\u0000c^\u0001\u0000\u0000\u0000cb\u0001\u0000\u0000"+
		"\u0000d\u0005\u0001\u0000\u0000\u0000ef\u0005\u0018\u0000\u0000f\u0007"+
		"\u0001\u0000\u0000\u0000gk\u0003\n\u0005\u0000hk\u0003\f\u0006\u0000i"+
		"k\u0003\u0012\t\u0000jg\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000"+
		"ji\u0001\u0000\u0000\u0000k\t\u0001\u0000\u0000\u0000lm\u0003*\u0015\u0000"+
		"mq\u0005\u0015\u0000\u0000np\u0005(\u0000\u0000on\u0001\u0000\u0000\u0000"+
		"ps\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000"+
		"\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000tl\u0001\u0000"+
		"\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001"+
		"\u0000\u0000\u0000wy\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000"+
		"yz\u0003*\u0015\u0000z\u000b\u0001\u0000\u0000\u0000{\u007f\u0003*\u0015"+
		"\u0000|~\u0005(\u0000\u0000}|\u0001\u0000\u0000\u0000~\u0081\u0001\u0000"+
		"\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000"+
		"\u0000\u0080\u0082\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000"+
		"\u0000\u0082\u0086\u0003\u000e\u0007\u0000\u0083\u0085\u0005(\u0000\u0000"+
		"\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000"+
		"\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000"+
		"\u0087\u0089\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000"+
		"\u0089\u008d\u0003*\u0015\u0000\u008a\u008c\u0005(\u0000\u0000\u008b\u008a"+
		"\u0001\u0000\u0000\u0000\u008c\u008f\u0001\u0000\u0000\u0000\u008d\u008b"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0090"+
		"\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0094"+
		"\u0005\u0007\u0000\u0000\u0091\u0093\u0005(\u0000\u0000\u0092\u0091\u0001"+
		"\u0000\u0000\u0000\u0093\u0096\u0001\u0000\u0000\u0000\u0094\u0092\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0097\u0001"+
		"\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u0098\u0003"+
		"\u0010\b\u0000\u0098\r\u0001\u0000\u0000\u0000\u0099\u009a\u0007\u0000"+
		"\u0000\u0000\u009a\u000f\u0001\u0000\u0000\u0000\u009b\u009f\u0003(\u0014"+
		"\u0000\u009c\u009e\u0005(\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000"+
		"\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\n\u0000\u0000\u00a3"+
		"\u00a4\u0003(\u0014\u0000\u00a4\u0011\u0001\u0000\u0000\u0000\u00a5\u00a9"+
		"\u0003*\u0015\u0000\u00a6\u00a8\u0005(\u0000\u0000\u00a7\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac\u00b0\u0005\u000f"+
		"\u0000\u0000\u00ad\u00af\u0005(\u0000\u0000\u00ae\u00ad\u0001\u0000\u0000"+
		"\u0000\u00af\u00b2\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b4\u0003*\u0015\u0000"+
		"\u00b4\u0013\u0001\u0000\u0000\u0000\u00b5\u00b9\u0005\u0005\u0000\u0000"+
		"\u00b6\u00b8\u0005(\u0000\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b8"+
		"\u00bb\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bc\u0001\u0000\u0000\u0000\u00bb"+
		"\u00b9\u0001\u0000\u0000\u0000\u00bc\u00bd\u0003\u0016\u000b\u0000\u00bd"+
		"\u0015\u0001\u0000\u0000\u0000\u00be\u00c3\u0003\u0018\f\u0000\u00bf\u00c3"+
		"\u0003\u001a\r\u0000\u00c0\u00c3\u0003\u001c\u000e\u0000\u00c1\u00c3\u0003"+
		"\u001e\u000f\u0000\u00c2\u00be\u0001\u0000\u0000\u0000\u00c2\u00bf\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c3\u0017\u0001\u0000\u0000\u0000\u00c4\u00c5\u0003"+
		"(\u0014\u0000\u00c5\u00c6\u0003$\u0012\u0000\u00c6\u00c7\u0003&\u0013"+
		"\u0000\u00c7\u0019\u0001\u0000\u0000\u0000\u00c8\u00c9\u0003(\u0014\u0000"+
		"\u00c9\u00ca\u0005 \u0000\u0000\u00ca\u00cb\u0003&\u0013\u0000\u00cb\u00cc"+
		"\u0005!\u0000\u0000\u00cc\u00cd\u0003&\u0013\u0000\u00cd\u001b\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cf\u0003(\u0014\u0000\u00cf\u00d0\u0005\"\u0000"+
		"\u0000\u00d0\u00d1\u0005%\u0000\u0000\u00d1\u00d8\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d3\u0003(\u0014\u0000\u00d3\u00d4\u0005\b\u0000\u0000\u00d4"+
		"\u00d5\u0005\"\u0000\u0000\u00d5\u00d6\u0005%\u0000\u0000\u00d6\u00d8"+
		"\u0001\u0000\u0000\u0000\u00d7\u00ce\u0001\u0000\u0000\u0000\u00d7\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d8\u001d\u0001\u0000\u0000\u0000\u00d9\u00da"+
		"\u0003 \u0010\u0000\u00da\u00db\u0005\u001e\u0000\u0000\u00db\u00dc\u0003"+
		"\"\u0011\u0000\u00dc\u00dd\u0005\u001f\u0000\u0000\u00dd\u001f\u0001\u0000"+
		"\u0000\u0000\u00de\u00df\u0005&\u0000\u0000\u00df\u00e0\u0005\u0017\u0000"+
		"\u0000\u00e0\u00e3\u0005&\u0000\u0000\u00e1\u00e3\u0005&\u0000\u0000\u00e2"+
		"\u00de\u0001\u0000\u0000\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e3"+
		"!\u0001\u0000\u0000\u0000\u00e4\u00e9\u0005\u0001\u0000\u0000\u00e5\u00e9"+
		"\u0005%\u0000\u0000\u00e6\u00e9\u0005\u0013\u0000\u0000\u00e7\u00e9\u0003"+
		"(\u0014\u0000\u00e8\u00e4\u0001\u0000\u0000\u0000\u00e8\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005\u0015"+
		"\u0000\u0000\u00eb\u00f3\u0003\"\u0011\u0000\u00ec\u00f1\u0005\u0001\u0000"+
		"\u0000\u00ed\u00f1\u0005%\u0000\u0000\u00ee\u00f1\u0005\u0013\u0000\u0000"+
		"\u00ef\u00f1\u0003(\u0014\u0000\u00f0\u00ec\u0001\u0000\u0000\u0000\u00f0"+
		"\u00ed\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0"+
		"\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f3\u0001\u0000\u0000\u0000\u00f2"+
		"\u00e8\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f3"+
		"#\u0001\u0000\u0000\u0000\u00f4\u00f5\u0007\u0001\u0000\u0000\u00f5%\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f7\u0007\u0002\u0000\u0000\u00f7\'\u0001\u0000"+
		"\u0000\u0000\u00f8\u0100\u0005&\u0000\u0000\u00f9\u00fa\u0005\u0011\u0000"+
		"\u0000\u00fa\u00fb\u0005&\u0000\u0000\u00fb\u0100\u0005\u0011\u0000\u0000"+
		"\u00fc\u00fd\u0005\u0012\u0000\u0000\u00fd\u00fe\u0005&\u0000\u0000\u00fe"+
		"\u0100\u0005\u0012\u0000\u0000\u00ff\u00f8\u0001\u0000\u0000\u0000\u00ff"+
		"\u00f9\u0001\u0000\u0000\u0000\u00ff\u00fc\u0001\u0000\u0000\u0000\u0100"+
		")\u0001\u0000\u0000\u0000\u0101\u0109\u0005&\u0000\u0000\u0102\u0103\u0005"+
		"\u0011\u0000\u0000\u0103\u0104\u0005&\u0000\u0000\u0104\u0109\u0005\u0011"+
		"\u0000\u0000\u0105\u0106\u0005\u0012\u0000\u0000\u0106\u0107\u0005&\u0000"+
		"\u0000\u0107\u0109\u0005\u0012\u0000\u0000\u0108\u0101\u0001\u0000\u0000"+
		"\u0000\u0108\u0102\u0001\u0000\u0000\u0000\u0108\u0105\u0001\u0000\u0000"+
		"\u0000\u0109+\u0001\u0000\u0000\u0000\u001c09@GNRY^cjqv\u007f\u0086\u008d"+
		"\u0094\u009f\u00a9\u00b0\u00b9\u00c2\u00d7\u00e2\u00e8\u00f0\u00f2\u00ff"+
		"\u0108";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
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
		NUMBER=1, SELECT=2, FROM=3, WHERE=4, IN=5, ON=6, NOT=7, EXCEPT=8, EQ=9, 
		INNER_JOIN=10, LEFT_JOIN=11, RIGHT_JOIN=12, NATURAL_JOIN=13, FULL_OUTER_JOIN=14, 
		DOUBLE_QUOTATION_MARK=15, SINGLE_QUOTATION_MARK=16, COMMA=17, SEMICOLON=18, 
		POINT=19, STAR=20, GREATER=21, GEQ=22, LOWER=23, LEQ=24, SLASH=25, LETTER=26, 
		DIGIT=27, STRING=28, TEXT=29, SPACE=30;
	public static final int
		RULE_whole_query = 0, RULE_query = 1, RULE_select_stmt = 2, RULE_every_columns = 3, 
		RULE_from_stmt = 4, RULE_no_join_table = 5, RULE_inner_join_table = 6, 
		RULE_inner_join_type = 7, RULE_inner_join_eq = 8, RULE_natural_join_stmt = 9, 
		RULE_where_stmt = 10, RULE_where_condition = 11, RULE_obj_type = 12, RULE_formatted_date = 13, 
		RULE_date = 14, RULE_table_column_name = 15, RULE_table_name = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"whole_query", "query", "select_stmt", "every_columns", "from_stmt", 
			"no_join_table", "inner_join_table", "inner_join_type", "inner_join_eq", 
			"natural_join_stmt", "where_stmt", "where_condition", "obj_type", "formatted_date", 
			"date", "table_column_name", "table_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "'='", null, null, 
			null, null, null, "'\"'", "'''", "','", "';'", "'.'", "'*'", "'>'", "'>='", 
			"'<'", "'<='", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMBER", "SELECT", "FROM", "WHERE", "IN", "ON", "NOT", "EXCEPT", 
			"EQ", "INNER_JOIN", "LEFT_JOIN", "RIGHT_JOIN", "NATURAL_JOIN", "FULL_OUTER_JOIN", 
			"DOUBLE_QUOTATION_MARK", "SINGLE_QUOTATION_MARK", "COMMA", "SEMICOLON", 
			"POINT", "STAR", "GREATER", "GEQ", "LOWER", "LEQ", "SLASH", "LETTER", 
			"DIGIT", "STRING", "TEXT", "SPACE"
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
			setState(34);
			query();
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(35);
				match(SPACE);
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41);
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
			setState(43);
			match(SELECT);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(44);
				match(SPACE);
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			select_stmt();
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(51);
				match(SPACE);
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			match(FROM);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(58);
				match(SPACE);
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			from_stmt();
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(65);
					match(SPACE);
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(71);
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
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_QUOTATION_MARK:
			case SINGLE_QUOTATION_MARK:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(74);
						table_column_name();
						setState(75);
						match(COMMA);
						setState(79);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==SPACE) {
							{
							{
							setState(76);
							match(SPACE);
							}
							}
							setState(81);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						} 
					}
					setState(86);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(87);
				table_column_name();
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
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
			setState(91);
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
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				no_join_table();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				inner_join_table();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
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
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(98);
					table_name();
					setState(99);
					match(COMMA);
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SPACE) {
						{
						{
						setState(100);
						match(SPACE);
						}
						}
						setState(105);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(111);
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
			setState(113);
			table_name();
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
			inner_join_type();
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
			table_name();
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
			match(ON);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(135);
				match(SPACE);
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
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
			setState(143);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 23552L) != 0)) ) {
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
			setState(145);
			table_column_name();
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(146);
				match(SPACE);
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			match(EQ);
			setState(153);
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
			setState(155);
			table_name();
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
			match(NATURAL_JOIN);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(163);
				match(SPACE);
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169);
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
			setState(171);
			match(WHERE);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(172);
				match(SPACE);
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
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
		public Table_column_nameContext table_column_name() {
			return getRuleContext(Table_column_nameContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlParser.EQ, 0); }
		public Obj_typeContext obj_type() {
			return getRuleContext(Obj_typeContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			table_column_name();
			setState(181);
			match(EQ);
			setState(182);
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
	public static class Obj_typeContext extends ParserRuleContext {
		public Formatted_dateContext formatted_date() {
			return getRuleContext(Formatted_dateContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(SqlParser.TEXT, 0); }
		public TerminalNode NUMBER() { return getToken(SqlParser.NUMBER, 0); }
		public Obj_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj_type; }
	}

	public final Obj_typeContext obj_type() throws RecognitionException {
		Obj_typeContext _localctx = new Obj_typeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_obj_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_QUOTATION_MARK:
			case SINGLE_QUOTATION_MARK:
				{
				setState(184);
				formatted_date();
				}
				break;
			case TEXT:
				{
				setState(185);
				match(TEXT);
				}
				break;
			case NUMBER:
				{
				setState(186);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Formatted_dateContext extends ParserRuleContext {
		public List<TerminalNode> SINGLE_QUOTATION_MARK() { return getTokens(SqlParser.SINGLE_QUOTATION_MARK); }
		public TerminalNode SINGLE_QUOTATION_MARK(int i) {
			return getToken(SqlParser.SINGLE_QUOTATION_MARK, i);
		}
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public List<TerminalNode> DOUBLE_QUOTATION_MARK() { return getTokens(SqlParser.DOUBLE_QUOTATION_MARK); }
		public TerminalNode DOUBLE_QUOTATION_MARK(int i) {
			return getToken(SqlParser.DOUBLE_QUOTATION_MARK, i);
		}
		public Formatted_dateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formatted_date; }
	}

	public final Formatted_dateContext formatted_date() throws RecognitionException {
		Formatted_dateContext _localctx = new Formatted_dateContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_formatted_date);
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLE_QUOTATION_MARK:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(SINGLE_QUOTATION_MARK);
				setState(190);
				date();
				setState(191);
				match(SINGLE_QUOTATION_MARK);
				}
				break;
			case DOUBLE_QUOTATION_MARK:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				match(DOUBLE_QUOTATION_MARK);
				setState(194);
				date();
				setState(195);
				match(DOUBLE_QUOTATION_MARK);
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
	public static class DateContext extends ParserRuleContext {
		public List<TerminalNode> SLASH() { return getTokens(SqlParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(SqlParser.SLASH, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(SqlParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(SqlParser.DIGIT, i);
		}
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_date);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(199);
				match(DIGIT);
				}
				}
				setState(202); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(204);
			match(SLASH);
			setState(206); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(205);
				match(DIGIT);
				}
				}
				setState(208); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(210);
			match(SLASH);
			setState(212); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(211);
				match(DIGIT);
				}
				}
				setState(214); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
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
		enterRule(_localctx, 30, RULE_table_column_name);
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				match(STRING);
				}
				break;
			case DOUBLE_QUOTATION_MARK:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				match(DOUBLE_QUOTATION_MARK);
				setState(218);
				match(STRING);
				setState(219);
				match(DOUBLE_QUOTATION_MARK);
				}
				break;
			case SINGLE_QUOTATION_MARK:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				match(SINGLE_QUOTATION_MARK);
				setState(221);
				match(STRING);
				setState(222);
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
		enterRule(_localctx, 32, RULE_table_name);
		try {
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(STRING);
				}
				break;
			case DOUBLE_QUOTATION_MARK:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				match(DOUBLE_QUOTATION_MARK);
				setState(227);
				match(STRING);
				setState(228);
				match(DOUBLE_QUOTATION_MARK);
				}
				break;
			case SINGLE_QUOTATION_MARK:
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				match(SINGLE_QUOTATION_MARK);
				setState(230);
				match(STRING);
				setState(231);
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
		"\u0004\u0001\u001e\u00eb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0005\u0000%\b"+
		"\u0000\n\u0000\f\u0000(\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0005\u0001.\b\u0001\n\u0001\f\u00011\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u00015\b\u0001\n\u0001\f\u00018\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001<\b\u0001\n\u0001\f\u0001?\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001C\b\u0001\n\u0001\f\u0001F\t\u0001\u0001\u0001\u0003"+
		"\u0001I\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002N\b\u0002"+
		"\n\u0002\f\u0002Q\t\u0002\u0005\u0002S\b\u0002\n\u0002\f\u0002V\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002Z\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004a\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005f\b\u0005\n\u0005\f\u0005i\t\u0005"+
		"\u0005\u0005k\b\u0005\n\u0005\f\u0005n\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0005\u0006t\b\u0006\n\u0006\f\u0006w\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006{\b\u0006\n\u0006\f\u0006~\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006\u0082\b\u0006\n\u0006\f\u0006\u0085"+
		"\t\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0089\b\u0006\n\u0006\f\u0006"+
		"\u008c\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b"+
		"\u0001\b\u0005\b\u0094\b\b\n\b\f\b\u0097\t\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0005\t\u009e\b\t\n\t\f\t\u00a1\t\t\u0001\t\u0001\t\u0005\t"+
		"\u00a5\b\t\n\t\f\t\u00a8\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0005\n\u00ae"+
		"\b\n\n\n\f\n\u00b1\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u00bc\b\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00c6\b\r\u0001"+
		"\u000e\u0004\u000e\u00c9\b\u000e\u000b\u000e\f\u000e\u00ca\u0001\u000e"+
		"\u0001\u000e\u0004\u000e\u00cf\b\u000e\u000b\u000e\f\u000e\u00d0\u0001"+
		"\u000e\u0001\u000e\u0004\u000e\u00d5\b\u000e\u000b\u000e\f\u000e\u00d6"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u00e0\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00e9\b\u0010"+
		"\u0001\u0010\u0000\u0000\u0011\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \u0000\u0001\u0002\u0000\n"+
		"\f\u000e\u000e\u00f8\u0000\"\u0001\u0000\u0000\u0000\u0002+\u0001\u0000"+
		"\u0000\u0000\u0004Y\u0001\u0000\u0000\u0000\u0006[\u0001\u0000\u0000\u0000"+
		"\b`\u0001\u0000\u0000\u0000\nl\u0001\u0000\u0000\u0000\fq\u0001\u0000"+
		"\u0000\u0000\u000e\u008f\u0001\u0000\u0000\u0000\u0010\u0091\u0001\u0000"+
		"\u0000\u0000\u0012\u009b\u0001\u0000\u0000\u0000\u0014\u00ab\u0001\u0000"+
		"\u0000\u0000\u0016\u00b4\u0001\u0000\u0000\u0000\u0018\u00bb\u0001\u0000"+
		"\u0000\u0000\u001a\u00c5\u0001\u0000\u0000\u0000\u001c\u00c8\u0001\u0000"+
		"\u0000\u0000\u001e\u00df\u0001\u0000\u0000\u0000 \u00e8\u0001\u0000\u0000"+
		"\u0000\"&\u0003\u0002\u0001\u0000#%\u0005\u001e\u0000\u0000$#\u0001\u0000"+
		"\u0000\u0000%(\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000&\'\u0001"+
		"\u0000\u0000\u0000\')\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000"+
		")*\u0005\u0012\u0000\u0000*\u0001\u0001\u0000\u0000\u0000+/\u0005\u0002"+
		"\u0000\u0000,.\u0005\u001e\u0000\u0000-,\u0001\u0000\u0000\u0000.1\u0001"+
		"\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u0000"+
		"02\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000026\u0003\u0004\u0002"+
		"\u000035\u0005\u001e\u0000\u000043\u0001\u0000\u0000\u000058\u0001\u0000"+
		"\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000079\u0001"+
		"\u0000\u0000\u000086\u0001\u0000\u0000\u00009=\u0005\u0003\u0000\u0000"+
		":<\u0005\u001e\u0000\u0000;:\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000"+
		"\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>@\u0001\u0000"+
		"\u0000\u0000?=\u0001\u0000\u0000\u0000@D\u0003\b\u0004\u0000AC\u0005\u001e"+
		"\u0000\u0000BA\u0001\u0000\u0000\u0000CF\u0001\u0000\u0000\u0000DB\u0001"+
		"\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000"+
		"FD\u0001\u0000\u0000\u0000GI\u0003\u0014\n\u0000HG\u0001\u0000\u0000\u0000"+
		"HI\u0001\u0000\u0000\u0000I\u0003\u0001\u0000\u0000\u0000JK\u0003\u001e"+
		"\u000f\u0000KO\u0005\u0011\u0000\u0000LN\u0005\u001e\u0000\u0000ML\u0001"+
		"\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000"+
		"OP\u0001\u0000\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000"+
		"\u0000RJ\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000"+
		"\u0000\u0000TU\u0001\u0000\u0000\u0000UW\u0001\u0000\u0000\u0000VT\u0001"+
		"\u0000\u0000\u0000WZ\u0003\u001e\u000f\u0000XZ\u0003\u0006\u0003\u0000"+
		"YT\u0001\u0000\u0000\u0000YX\u0001\u0000\u0000\u0000Z\u0005\u0001\u0000"+
		"\u0000\u0000[\\\u0005\u0014\u0000\u0000\\\u0007\u0001\u0000\u0000\u0000"+
		"]a\u0003\n\u0005\u0000^a\u0003\f\u0006\u0000_a\u0003\u0012\t\u0000`]\u0001"+
		"\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`_\u0001\u0000\u0000\u0000"+
		"a\t\u0001\u0000\u0000\u0000bc\u0003 \u0010\u0000cg\u0005\u0011\u0000\u0000"+
		"df\u0005\u001e\u0000\u0000ed\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000"+
		"\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hk\u0001\u0000"+
		"\u0000\u0000ig\u0001\u0000\u0000\u0000jb\u0001\u0000\u0000\u0000kn\u0001"+
		"\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000"+
		"mo\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000op\u0003 \u0010\u0000"+
		"p\u000b\u0001\u0000\u0000\u0000qu\u0003 \u0010\u0000rt\u0005\u001e\u0000"+
		"\u0000sr\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000"+
		"\u0000\u0000uv\u0001\u0000\u0000\u0000vx\u0001\u0000\u0000\u0000wu\u0001"+
		"\u0000\u0000\u0000x|\u0003\u000e\u0007\u0000y{\u0005\u001e\u0000\u0000"+
		"zy\u0001\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000"+
		"\u0000|}\u0001\u0000\u0000\u0000}\u007f\u0001\u0000\u0000\u0000~|\u0001"+
		"\u0000\u0000\u0000\u007f\u0083\u0003 \u0010\u0000\u0080\u0082\u0005\u001e"+
		"\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0085\u0001\u0000"+
		"\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000"+
		"\u0000\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000"+
		"\u0000\u0000\u0086\u008a\u0005\u0006\u0000\u0000\u0087\u0089\u0005\u001e"+
		"\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008c\u0001\u0000"+
		"\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000"+
		"\u0000\u0000\u008b\u008d\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000"+
		"\u0000\u0000\u008d\u008e\u0003\u0010\b\u0000\u008e\r\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0007\u0000\u0000\u0000\u0090\u000f\u0001\u0000\u0000"+
		"\u0000\u0091\u0095\u0003\u001e\u000f\u0000\u0092\u0094\u0005\u001e\u0000"+
		"\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u0097\u0001\u0000\u0000"+
		"\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000"+
		"\u0000\u0096\u0098\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\u0005\t\u0000\u0000\u0099\u009a\u0003\u001e\u000f\u0000"+
		"\u009a\u0011\u0001\u0000\u0000\u0000\u009b\u009f\u0003 \u0010\u0000\u009c"+
		"\u009e\u0005\u001e\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009e"+
		"\u00a1\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a2\u0001\u0000\u0000\u0000\u00a1"+
		"\u009f\u0001\u0000\u0000\u0000\u00a2\u00a6\u0005\r\u0000\u0000\u00a3\u00a5"+
		"\u0005\u001e\u0000\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a9\u0001\u0000\u0000\u0000\u00a8\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a9\u00aa\u0003 \u0010\u0000\u00aa\u0013\u0001"+
		"\u0000\u0000\u0000\u00ab\u00af\u0005\u0004\u0000\u0000\u00ac\u00ae\u0005"+
		"\u001e\u0000\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001"+
		"\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b2\u0001\u0000\u0000\u0000\u00b1\u00af\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b3\u0003\u0016\u000b\u0000\u00b3\u0015\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0003\u001e\u000f\u0000\u00b5\u00b6\u0005"+
		"\t\u0000\u0000\u00b6\u00b7\u0003\u0018\f\u0000\u00b7\u0017\u0001\u0000"+
		"\u0000\u0000\u00b8\u00bc\u0003\u001a\r\u0000\u00b9\u00bc\u0005\u001d\u0000"+
		"\u0000\u00ba\u00bc\u0005\u0001\u0000\u0000\u00bb\u00b8\u0001\u0000\u0000"+
		"\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bc\u0019\u0001\u0000\u0000\u0000\u00bd\u00be\u0005\u0010\u0000"+
		"\u0000\u00be\u00bf\u0003\u001c\u000e\u0000\u00bf\u00c0\u0005\u0010\u0000"+
		"\u0000\u00c0\u00c6\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005\u000f\u0000"+
		"\u0000\u00c2\u00c3\u0003\u001c\u000e\u0000\u00c3\u00c4\u0005\u000f\u0000"+
		"\u0000\u00c4\u00c6\u0001\u0000\u0000\u0000\u00c5\u00bd\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c1\u0001\u0000\u0000\u0000\u00c6\u001b\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c9\u0005\u001b\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000"+
		"\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000"+
		"\u0000\u00cc\u00ce\u0005\u0019\u0000\u0000\u00cd\u00cf\u0005\u001b\u0000"+
		"\u0000\u00ce\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d4\u0005\u0019\u0000"+
		"\u0000\u00d3\u00d5\u0005\u001b\u0000\u0000\u00d4\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u001d\u0001\u0000\u0000"+
		"\u0000\u00d8\u00e0\u0005\u001c\u0000\u0000\u00d9\u00da\u0005\u000f\u0000"+
		"\u0000\u00da\u00db\u0005\u001c\u0000\u0000\u00db\u00e0\u0005\u000f\u0000"+
		"\u0000\u00dc\u00dd\u0005\u0010\u0000\u0000\u00dd\u00de\u0005\u001c\u0000"+
		"\u0000\u00de\u00e0\u0005\u0010\u0000\u0000\u00df\u00d8\u0001\u0000\u0000"+
		"\u0000\u00df\u00d9\u0001\u0000\u0000\u0000\u00df\u00dc\u0001\u0000\u0000"+
		"\u0000\u00e0\u001f\u0001\u0000\u0000\u0000\u00e1\u00e9\u0005\u001c\u0000"+
		"\u0000\u00e2\u00e3\u0005\u000f\u0000\u0000\u00e3\u00e4\u0005\u001c\u0000"+
		"\u0000\u00e4\u00e9\u0005\u000f\u0000\u0000\u00e5\u00e6\u0005\u0010\u0000"+
		"\u0000\u00e6\u00e7\u0005\u001c\u0000\u0000\u00e7\u00e9\u0005\u0010\u0000"+
		"\u0000\u00e8\u00e1\u0001\u0000\u0000\u0000\u00e8\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e5\u0001\u0000\u0000\u0000\u00e9!\u0001\u0000\u0000\u0000"+
		"\u001b&/6=DHOTY`glu|\u0083\u008a\u0095\u009f\u00a6\u00af\u00bb\u00c5\u00ca"+
		"\u00d0\u00d6\u00df\u00e8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
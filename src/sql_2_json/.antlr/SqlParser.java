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
		INNER_JOIN=10, LEFT_JOIN=11, RIGHT_JOIN=12, NATURAL_JOIN=13, DOUBLE_QUOTATION_MARK=14, 
		SINGLE_QUOTATION_MARK=15, COMMA=16, SEMICOLON=17, POINT=18, STAR=19, GREATER=20, 
		GEQ=21, LOWER=22, LEQ=23, LETTER=24, DIGIT=25, SPACE=26, STRING=27;
	public static final int
		RULE_whole_query = 0, RULE_query = 1, RULE_select_stmt = 2, RULE_from_stmt = 3, 
		RULE_no_join_table = 4, RULE_inner_join_table = 5, RULE_inner_join_type = 6, 
		RULE_inner_join_eq = 7, RULE_natural_join_stmt = 8, RULE_every_columns = 9, 
		RULE_table_column_name = 10, RULE_table_name = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"whole_query", "query", "select_stmt", "from_stmt", "no_join_table", 
			"inner_join_table", "inner_join_type", "inner_join_eq", "natural_join_stmt", 
			"every_columns", "table_column_name", "table_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "'='", null, null, 
			null, null, "'\"'", "'''", "','", "';'", "'.'", "'*'", "'>'", "'>='", 
			"'<'", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMBER", "SELECT", "FROM", "WHERE", "IN", "ON", "NOT", "EXCEPT", 
			"EQ", "INNER_JOIN", "LEFT_JOIN", "RIGHT_JOIN", "NATURAL_JOIN", "DOUBLE_QUOTATION_MARK", 
			"SINGLE_QUOTATION_MARK", "COMMA", "SEMICOLON", "POINT", "STAR", "GREATER", 
			"GEQ", "LOWER", "LEQ", "LETTER", "DIGIT", "SPACE", "STRING"
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
		public Whole_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whole_query; }
	}

	public final Whole_queryContext whole_query() throws RecognitionException {
		Whole_queryContext _localctx = new Whole_queryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_whole_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			query();
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
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(SELECT);
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(27);
				match(SPACE);
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33);
			select_stmt();
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(34);
				match(SPACE);
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
			match(FROM);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(41);
				match(SPACE);
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
			from_stmt();
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
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_QUOTATION_MARK:
			case SINGLE_QUOTATION_MARK:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(49);
						table_column_name();
						setState(50);
						match(COMMA);
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
						}
						} 
					}
					setState(61);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(62);
				table_column_name();
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
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
		enterRule(_localctx, 6, RULE_from_stmt);
		try {
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				no_join_table();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				inner_join_table();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
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
		enterRule(_localctx, 8, RULE_no_join_table);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(71);
					table_name();
					setState(72);
					match(COMMA);
					setState(76);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SPACE) {
						{
						{
						setState(73);
						match(SPACE);
						}
						}
						setState(78);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(84);
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
		enterRule(_localctx, 10, RULE_inner_join_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			table_name();
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(87);
				match(SPACE);
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			inner_join_type();
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(94);
				match(SPACE);
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			table_name();
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
			match(ON);
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
		public Inner_join_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inner_join_type; }
	}

	public final Inner_join_typeContext inner_join_type() throws RecognitionException {
		Inner_join_typeContext _localctx = new Inner_join_typeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_inner_join_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7168L) != 0)) ) {
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
		enterRule(_localctx, 14, RULE_inner_join_eq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			table_column_name();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(119);
				match(SPACE);
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			match(EQ);
			setState(126);
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
		enterRule(_localctx, 16, RULE_natural_join_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			table_name();
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(129);
				match(SPACE);
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135);
			match(NATURAL_JOIN);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(136);
				match(SPACE);
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
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
	public static class Every_columnsContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(SqlParser.STAR, 0); }
		public Every_columnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_every_columns; }
	}

	public final Every_columnsContext every_columns() throws RecognitionException {
		Every_columnsContext _localctx = new Every_columnsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_every_columns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
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
		enterRule(_localctx, 20, RULE_table_column_name);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(STRING);
				}
				break;
			case DOUBLE_QUOTATION_MARK:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(DOUBLE_QUOTATION_MARK);
				setState(148);
				match(STRING);
				setState(149);
				match(DOUBLE_QUOTATION_MARK);
				}
				break;
			case SINGLE_QUOTATION_MARK:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				match(SINGLE_QUOTATION_MARK);
				setState(151);
				match(STRING);
				setState(152);
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
		enterRule(_localctx, 22, RULE_table_name);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(STRING);
				}
				break;
			case DOUBLE_QUOTATION_MARK:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(DOUBLE_QUOTATION_MARK);
				setState(157);
				match(STRING);
				setState(158);
				match(DOUBLE_QUOTATION_MARK);
				}
				break;
			case SINGLE_QUOTATION_MARK:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				match(SINGLE_QUOTATION_MARK);
				setState(160);
				match(STRING);
				setState(161);
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
		"\u0004\u0001\u001b\u00a5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001\u001d\b\u0001"+
		"\n\u0001\f\u0001 \t\u0001\u0001\u0001\u0001\u0001\u0005\u0001$\b\u0001"+
		"\n\u0001\f\u0001\'\t\u0001\u0001\u0001\u0001\u0001\u0005\u0001+\b\u0001"+
		"\n\u0001\f\u0001.\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u00025\b\u0002\n\u0002\f\u00028\t\u0002\u0005\u0002"+
		":\b\u0002\n\u0002\f\u0002=\t\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"A\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003F\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004K\b\u0004\n\u0004\f\u0004N\t"+
		"\u0004\u0005\u0004P\b\u0004\n\u0004\f\u0004S\t\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0005\u0005Y\b\u0005\n\u0005\f\u0005\\"+
		"\t\u0005\u0001\u0005\u0001\u0005\u0005\u0005`\b\u0005\n\u0005\f\u0005"+
		"c\t\u0005\u0001\u0005\u0001\u0005\u0005\u0005g\b\u0005\n\u0005\f\u0005"+
		"j\t\u0005\u0001\u0005\u0001\u0005\u0005\u0005n\b\u0005\n\u0005\f\u0005"+
		"q\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0005\u0007y\b\u0007\n\u0007\f\u0007|\t\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0005\b\u0083\b\b\n\b\f\b\u0086"+
		"\t\b\u0001\b\u0001\b\u0005\b\u008a\b\b\n\b\f\b\u008d\t\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u009a\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00a3\b\u000b\u0001\u000b\u0000"+
		"\u0000\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000"+
		"\u0001\u0001\u0000\n\f\u00ad\u0000\u0018\u0001\u0000\u0000\u0000\u0002"+
		"\u001a\u0001\u0000\u0000\u0000\u0004@\u0001\u0000\u0000\u0000\u0006E\u0001"+
		"\u0000\u0000\u0000\bQ\u0001\u0000\u0000\u0000\nV\u0001\u0000\u0000\u0000"+
		"\ft\u0001\u0000\u0000\u0000\u000ev\u0001\u0000\u0000\u0000\u0010\u0080"+
		"\u0001\u0000\u0000\u0000\u0012\u0090\u0001\u0000\u0000\u0000\u0014\u0099"+
		"\u0001\u0000\u0000\u0000\u0016\u00a2\u0001\u0000\u0000\u0000\u0018\u0019"+
		"\u0003\u0002\u0001\u0000\u0019\u0001\u0001\u0000\u0000\u0000\u001a\u001e"+
		"\u0005\u0002\u0000\u0000\u001b\u001d\u0005\u001a\u0000\u0000\u001c\u001b"+
		"\u0001\u0000\u0000\u0000\u001d \u0001\u0000\u0000\u0000\u001e\u001c\u0001"+
		"\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f!\u0001\u0000"+
		"\u0000\u0000 \u001e\u0001\u0000\u0000\u0000!%\u0003\u0004\u0002\u0000"+
		"\"$\u0005\u001a\u0000\u0000#\"\u0001\u0000\u0000\u0000$\'\u0001\u0000"+
		"\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&(\u0001"+
		"\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000(,\u0005\u0003\u0000\u0000"+
		")+\u0005\u001a\u0000\u0000*)\u0001\u0000\u0000\u0000+.\u0001\u0000\u0000"+
		"\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-/\u0001\u0000"+
		"\u0000\u0000.,\u0001\u0000\u0000\u0000/0\u0003\u0006\u0003\u00000\u0003"+
		"\u0001\u0000\u0000\u000012\u0003\u0014\n\u000026\u0005\u0010\u0000\u0000"+
		"35\u0005\u001a\u0000\u000043\u0001\u0000\u0000\u000058\u0001\u0000\u0000"+
		"\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u00007:\u0001\u0000"+
		"\u0000\u000086\u0001\u0000\u0000\u000091\u0001\u0000\u0000\u0000:=\u0001"+
		"\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000"+
		"<>\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000>A\u0003\u0014\n\u0000"+
		"?A\u0003\u0012\t\u0000@;\u0001\u0000\u0000\u0000@?\u0001\u0000\u0000\u0000"+
		"A\u0005\u0001\u0000\u0000\u0000BF\u0003\b\u0004\u0000CF\u0003\n\u0005"+
		"\u0000DF\u0003\u0010\b\u0000EB\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000"+
		"\u0000ED\u0001\u0000\u0000\u0000F\u0007\u0001\u0000\u0000\u0000GH\u0003"+
		"\u0016\u000b\u0000HL\u0005\u0010\u0000\u0000IK\u0005\u001a\u0000\u0000"+
		"JI\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000"+
		"\u0000LM\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000"+
		"\u0000\u0000OG\u0001\u0000\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001"+
		"\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RT\u0001\u0000\u0000\u0000"+
		"SQ\u0001\u0000\u0000\u0000TU\u0003\u0016\u000b\u0000U\t\u0001\u0000\u0000"+
		"\u0000VZ\u0003\u0016\u000b\u0000WY\u0005\u001a\u0000\u0000XW\u0001\u0000"+
		"\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001"+
		"\u0000\u0000\u0000[]\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000"+
		"]a\u0003\f\u0006\u0000^`\u0005\u001a\u0000\u0000_^\u0001\u0000\u0000\u0000"+
		"`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000"+
		"\u0000bd\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000dh\u0003\u0016"+
		"\u000b\u0000eg\u0005\u001a\u0000\u0000fe\u0001\u0000\u0000\u0000gj\u0001"+
		"\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000"+
		"ik\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000ko\u0005\u0006\u0000"+
		"\u0000ln\u0005\u001a\u0000\u0000ml\u0001\u0000\u0000\u0000nq\u0001\u0000"+
		"\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pr\u0001"+
		"\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000rs\u0003\u000e\u0007\u0000"+
		"s\u000b\u0001\u0000\u0000\u0000tu\u0007\u0000\u0000\u0000u\r\u0001\u0000"+
		"\u0000\u0000vz\u0003\u0014\n\u0000wy\u0005\u001a\u0000\u0000xw\u0001\u0000"+
		"\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001"+
		"\u0000\u0000\u0000{}\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000"+
		"}~\u0005\t\u0000\u0000~\u007f\u0003\u0014\n\u0000\u007f\u000f\u0001\u0000"+
		"\u0000\u0000\u0080\u0084\u0003\u0016\u000b\u0000\u0081\u0083\u0005\u001a"+
		"\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000"+
		"\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000"+
		"\u0000\u0000\u0085\u0087\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000"+
		"\u0000\u0000\u0087\u008b\u0005\r\u0000\u0000\u0088\u008a\u0005\u001a\u0000"+
		"\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u008d\u0001\u0000\u0000"+
		"\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000"+
		"\u0000\u008c\u008e\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0003\u0016\u000b\u0000\u008f\u0011\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0005\u0013\u0000\u0000\u0091\u0013\u0001\u0000\u0000"+
		"\u0000\u0092\u009a\u0005\u001b\u0000\u0000\u0093\u0094\u0005\u000e\u0000"+
		"\u0000\u0094\u0095\u0005\u001b\u0000\u0000\u0095\u009a\u0005\u000e\u0000"+
		"\u0000\u0096\u0097\u0005\u000f\u0000\u0000\u0097\u0098\u0005\u001b\u0000"+
		"\u0000\u0098\u009a\u0005\u000f\u0000\u0000\u0099\u0092\u0001\u0000\u0000"+
		"\u0000\u0099\u0093\u0001\u0000\u0000\u0000\u0099\u0096\u0001\u0000\u0000"+
		"\u0000\u009a\u0015\u0001\u0000\u0000\u0000\u009b\u00a3\u0005\u001b\u0000"+
		"\u0000\u009c\u009d\u0005\u000e\u0000\u0000\u009d\u009e\u0005\u001b\u0000"+
		"\u0000\u009e\u00a3\u0005\u000e\u0000\u0000\u009f\u00a0\u0005\u000f\u0000"+
		"\u0000\u00a0\u00a1\u0005\u001b\u0000\u0000\u00a1\u00a3\u0005\u000f\u0000"+
		"\u0000\u00a2\u009b\u0001\u0000\u0000\u0000\u00a2\u009c\u0001\u0000\u0000"+
		"\u0000\u00a2\u009f\u0001\u0000\u0000\u0000\u00a3\u0017\u0001\u0000\u0000"+
		"\u0000\u0012\u001e%,6;@ELQZahoz\u0084\u008b\u0099\u00a2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
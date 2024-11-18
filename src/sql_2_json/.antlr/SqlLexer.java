// Generated from /home/quentin/Documents/personnel/sql_parser/src/sql_2_json/Sql.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SqlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, SELECT=2, FROM=3, WHERE=4, IN=5, NOT=6, EXCEPT=7, QUOTATION_MARK=8, 
		COMMA=9, SEMICOLON=10, POINT=11, STAR=12, GREATER=13, GEQ=14, LOWER=15, 
		LEQ=16, LETTER=17, DIGIT=18, SPACE=19, STRING=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NUMBER", "SELECT", "FROM", "WHERE", "IN", "NOT", "EXCEPT", "QUOTATION_MARK", 
			"COMMA", "SEMICOLON", "POINT", "STAR", "GREATER", "GEQ", "LOWER", "LEQ", 
			"LETTER", "DIGIT", "SPACE", "STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "'\"'", "','", "';'", 
			"'.'", "'*'", "'>'", "'>='", "'<'", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMBER", "SELECT", "FROM", "WHERE", "IN", "NOT", "EXCEPT", "QUOTATION_MARK", 
			"COMMA", "SEMICOLON", "POINT", "STAR", "GREATER", "GEQ", "LOWER", "LEQ", 
			"LETTER", "DIGIT", "SPACE", "STRING"
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


	public SqlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Sql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0014\u009a\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0004\u0000"+
		"+\b\u0000\u000b\u0000\f\u0000,\u0001\u0000\u0001\u0000\u0004\u00001\b"+
		"\u0000\u000b\u0000\f\u00002\u0005\u00005\b\u0000\n\u0000\f\u00008\t\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001F\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002P\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\\\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004b\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005j\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006x\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0004"+
		"\u0013\u0097\b\u0013\u000b\u0013\f\u0013\u0098\u0000\u0000\u0014\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014\u0001\u0000\u0004\u0001"+
		"\u000009\u0002\u0000AZaz\u0003\u0000\t\n\r\r  \u0004\u000009AZ__az\u00a3"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0001*\u0001\u0000\u0000\u0000"+
		"\u0003E\u0001\u0000\u0000\u0000\u0005O\u0001\u0000\u0000\u0000\u0007["+
		"\u0001\u0000\u0000\u0000\ta\u0001\u0000\u0000\u0000\u000bi\u0001\u0000"+
		"\u0000\u0000\rw\u0001\u0000\u0000\u0000\u000fy\u0001\u0000\u0000\u0000"+
		"\u0011{\u0001\u0000\u0000\u0000\u0013}\u0001\u0000\u0000\u0000\u0015\u007f"+
		"\u0001\u0000\u0000\u0000\u0017\u0081\u0001\u0000\u0000\u0000\u0019\u0083"+
		"\u0001\u0000\u0000\u0000\u001b\u0085\u0001\u0000\u0000\u0000\u001d\u0088"+
		"\u0001\u0000\u0000\u0000\u001f\u008a\u0001\u0000\u0000\u0000!\u008d\u0001"+
		"\u0000\u0000\u0000#\u008f\u0001\u0000\u0000\u0000%\u0091\u0001\u0000\u0000"+
		"\u0000\'\u0096\u0001\u0000\u0000\u0000)+\u0007\u0000\u0000\u0000*)\u0001"+
		"\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000"+
		",-\u0001\u0000\u0000\u0000-6\u0001\u0000\u0000\u0000.0\u0003\u0015\n\u0000"+
		"/1\u0007\u0000\u0000\u00000/\u0001\u0000\u0000\u000012\u0001\u0000\u0000"+
		"\u000020\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000035\u0001\u0000"+
		"\u0000\u00004.\u0001\u0000\u0000\u000058\u0001\u0000\u0000\u000064\u0001"+
		"\u0000\u0000\u000067\u0001\u0000\u0000\u00007\u0002\u0001\u0000\u0000"+
		"\u000086\u0001\u0000\u0000\u00009:\u0005s\u0000\u0000:;\u0005e\u0000\u0000"+
		";<\u0005l\u0000\u0000<=\u0005e\u0000\u0000=>\u0005c\u0000\u0000>F\u0005"+
		"t\u0000\u0000?@\u0005S\u0000\u0000@A\u0005E\u0000\u0000AB\u0005L\u0000"+
		"\u0000BC\u0005E\u0000\u0000CD\u0005C\u0000\u0000DF\u0005T\u0000\u0000"+
		"E9\u0001\u0000\u0000\u0000E?\u0001\u0000\u0000\u0000F\u0004\u0001\u0000"+
		"\u0000\u0000GH\u0005f\u0000\u0000HI\u0005r\u0000\u0000IJ\u0005o\u0000"+
		"\u0000JP\u0005m\u0000\u0000KL\u0005F\u0000\u0000LM\u0005R\u0000\u0000"+
		"MN\u0005O\u0000\u0000NP\u0005M\u0000\u0000OG\u0001\u0000\u0000\u0000O"+
		"K\u0001\u0000\u0000\u0000P\u0006\u0001\u0000\u0000\u0000QR\u0005w\u0000"+
		"\u0000RS\u0005h\u0000\u0000ST\u0005e\u0000\u0000TU\u0005r\u0000\u0000"+
		"U\\\u0005e\u0000\u0000VW\u0005W\u0000\u0000WX\u0005H\u0000\u0000XY\u0005"+
		"E\u0000\u0000YZ\u0005R\u0000\u0000Z\\\u0005E\u0000\u0000[Q\u0001\u0000"+
		"\u0000\u0000[V\u0001\u0000\u0000\u0000\\\b\u0001\u0000\u0000\u0000]^\u0005"+
		"i\u0000\u0000^b\u0005n\u0000\u0000_`\u0005I\u0000\u0000`b\u0005N\u0000"+
		"\u0000a]\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000b\n\u0001\u0000"+
		"\u0000\u0000cd\u0005n\u0000\u0000de\u0005o\u0000\u0000ej\u0005t\u0000"+
		"\u0000fg\u0005N\u0000\u0000gh\u0005O\u0000\u0000hj\u0005T\u0000\u0000"+
		"ic\u0001\u0000\u0000\u0000if\u0001\u0000\u0000\u0000j\f\u0001\u0000\u0000"+
		"\u0000kl\u0005e\u0000\u0000lm\u0005x\u0000\u0000mn\u0005c\u0000\u0000"+
		"no\u0005e\u0000\u0000op\u0005p\u0000\u0000px\u0005t\u0000\u0000qr\u0005"+
		"E\u0000\u0000rs\u0005X\u0000\u0000st\u0005C\u0000\u0000tu\u0005E\u0000"+
		"\u0000uv\u0005P\u0000\u0000vx\u0005T\u0000\u0000wk\u0001\u0000\u0000\u0000"+
		"wq\u0001\u0000\u0000\u0000x\u000e\u0001\u0000\u0000\u0000yz\u0005\"\u0000"+
		"\u0000z\u0010\u0001\u0000\u0000\u0000{|\u0005,\u0000\u0000|\u0012\u0001"+
		"\u0000\u0000\u0000}~\u0005;\u0000\u0000~\u0014\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0005.\u0000\u0000\u0080\u0016\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u0005*\u0000\u0000\u0082\u0018\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0005>\u0000\u0000\u0084\u001a\u0001\u0000\u0000\u0000\u0085\u0086\u0005"+
		">\u0000\u0000\u0086\u0087\u0005=\u0000\u0000\u0087\u001c\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0005<\u0000\u0000\u0089\u001e\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0005<\u0000\u0000\u008b\u008c\u0005=\u0000\u0000\u008c "+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0007\u0001\u0000\u0000\u008e\"\u0001"+
		"\u0000\u0000\u0000\u008f\u0090\u0007\u0000\u0000\u0000\u0090$\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\u0007\u0002\u0000\u0000\u0092\u0093\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0006\u0012\u0000\u0000\u0094&\u0001\u0000\u0000"+
		"\u0000\u0095\u0097\u0007\u0003\u0000\u0000\u0096\u0095\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099(\u0001\u0000\u0000\u0000"+
		"\u000b\u0000,26EO[aiw\u0098\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
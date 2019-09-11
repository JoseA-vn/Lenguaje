// Generated from Simple.g4 by ANTLR 4.4
package org.poc.leng.newleng;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		START=1, END=2, SUM=3, REST=4, MULT=5, DIV=6, FLOTANTE=7, BOOLEANO=8, 
		INT=9, FLOAT=10, BOOL=11, ASSIG=12, MAY_Q=13, MEN_Q=14, IGUAL=15, AND=16, 
		OR=17, PAR_L=18, PAR_R=19, KEY_L=20, KEY_R=21, IF=22, ELSE=23, ELIF=24, 
		ENDIF=25, FOR=26, ENDFOR=27, DELIM=28, WHILE=29, ENDWH=30, READ=31, WRITTE=32, 
		ID=33, COMMENT=34, WS=35;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'"
	};
	public static final String[] ruleNames = {
		"START", "END", "SUM", "REST", "MULT", "DIV", "FALSE", "TRUE", "NUMBER", 
		"DOT", "FLOTANTE", "BOOLEANO", "INT", "FLOAT", "BOOL", "ASSIG", "MAY_Q", 
		"MEN_Q", "IGUAL", "AND", "OR", "PAR_L", "PAR_R", "KEY_L", "KEY_R", "IF", 
		"ELSE", "ELIF", "ENDIF", "FOR", "ENDFOR", "DELIM", "WHILE", "ENDWH", "READ", 
		"WRITTE", "ID", "COMMENT", "WS"
	};


	public SimpleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2%\u010b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\5\rz\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3&\6&\u00f3\n&\r&\16&\u00f4\3\'\3\'\7\'\u00f9"+
		"\n\'\f\'\16\'\u00fc\13\'\3\'\5\'\u00ff\n\'\3\'\3\'\3\'\3\'\3(\6(\u0106"+
		"\n(\r(\16(\u0107\3(\3(\3\u00fa\2)\3\3\5\4\7\5\t\6\13\7\r\b\17\2\21\2\23"+
		"\2\25\2\27\t\31\n\33\13\35\f\37\r!\16#\17%\20\'\21)\22+\23-\24/\25\61"+
		"\26\63\27\65\30\67\319\32;\33=\34?\35A\36C\37E G!I\"K#M$O%\3\2\5\5\2."+
		".\62\62;;\4\2C\\c|\5\2\13\f\17\17\"\"\u010b\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3Q\3\2\2\2\5X\3\2\2\2\7\\\3\2"+
		"\2\2\t^\3\2\2\2\13`\3\2\2\2\rb\3\2\2\2\17d\3\2\2\2\21j\3\2\2\2\23o\3\2"+
		"\2\2\25q\3\2\2\2\27s\3\2\2\2\31y\3\2\2\2\33{\3\2\2\2\35\u0082\3\2\2\2"+
		"\37\u0087\3\2\2\2!\u008e\3\2\2\2#\u0091\3\2\2\2%\u0093\3\2\2\2\'\u0095"+
		"\3\2\2\2)\u0097\3\2\2\2+\u009b\3\2\2\2-\u009e\3\2\2\2/\u00a0\3\2\2\2\61"+
		"\u00a2\3\2\2\2\63\u00a4\3\2\2\2\65\u00a6\3\2\2\2\67\u00a9\3\2\2\29\u00ae"+
		"\3\2\2\2;\u00b6\3\2\2\2=\u00bd\3\2\2\2?\u00c2\3\2\2\2A\u00cb\3\2\2\2C"+
		"\u00cd\3\2\2\2E\u00d6\3\2\2\2G\u00e3\3\2\2\2I\u00e8\3\2\2\2K\u00f2\3\2"+
		"\2\2M\u00f6\3\2\2\2O\u0105\3\2\2\2QR\7k\2\2RS\7p\2\2ST\7k\2\2TU\7e\2\2"+
		"UV\7k\2\2VW\7q\2\2W\4\3\2\2\2XY\7h\2\2YZ\7k\2\2Z[\7p\2\2[\6\3\2\2\2\\"+
		"]\7-\2\2]\b\3\2\2\2^_\7/\2\2_\n\3\2\2\2`a\7,\2\2a\f\3\2\2\2bc\7\61\2\2"+
		"c\16\3\2\2\2de\7h\2\2ef\7c\2\2fg\7n\2\2gh\7u\2\2hi\7g\2\2i\20\3\2\2\2"+
		"jk\7v\2\2kl\7t\2\2lm\7w\2\2mn\7g\2\2n\22\3\2\2\2op\t\2\2\2p\24\3\2\2\2"+
		"qr\7\60\2\2r\26\3\2\2\2st\5\23\n\2tu\5\25\13\2uv\5\23\n\2v\30\3\2\2\2"+
		"wz\5\21\t\2xz\5\17\b\2yw\3\2\2\2yx\3\2\2\2z\32\3\2\2\2{|\7g\2\2|}\7p\2"+
		"\2}~\7v\2\2~\177\7g\2\2\177\u0080\7t\2\2\u0080\u0081\7q\2\2\u0081\34\3"+
		"\2\2\2\u0082\u0083\7t\2\2\u0083\u0084\7g\2\2\u0084\u0085\7c\2\2\u0085"+
		"\u0086\7n\2\2\u0086\36\3\2\2\2\u0087\u0088\7n\2\2\u0088\u0089\7q\2\2\u0089"+
		"\u008a\7i\2\2\u008a\u008b\7k\2\2\u008b\u008c\7e\2\2\u008c\u008d\7q\2\2"+
		"\u008d \3\2\2\2\u008e\u008f\7>\2\2\u008f\u0090\7/\2\2\u0090\"\3\2\2\2"+
		"\u0091\u0092\7@\2\2\u0092$\3\2\2\2\u0093\u0094\7>\2\2\u0094&\3\2\2\2\u0095"+
		"\u0096\7?\2\2\u0096(\3\2\2\2\u0097\u0098\7c\2\2\u0098\u0099\7p\2\2\u0099"+
		"\u009a\7f\2\2\u009a*\3\2\2\2\u009b\u009c\7q\2\2\u009c\u009d\7t\2\2\u009d"+
		",\3\2\2\2\u009e\u009f\7*\2\2\u009f.\3\2\2\2\u00a0\u00a1\7+\2\2\u00a1\60"+
		"\3\2\2\2\u00a2\u00a3\7}\2\2\u00a3\62\3\2\2\2\u00a4\u00a5\7}\2\2\u00a5"+
		"\64\3\2\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a8\7k\2\2\u00a8\66\3\2\2\2\u00a9"+
		"\u00aa\7u\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7p\2\2\u00ac\u00ad\7q\2\2"+
		"\u00ad8\3\2\2\2\u00ae\u00af\7u\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7p\2"+
		"\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7a\2\2\u00b3\u00b4\7u\2\2\u00b4\u00b5"+
		"\7k\2\2\u00b5:\3\2\2\2\u00b6\u00b7\7h\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9"+
		"\7p\2\2\u00b9\u00ba\7a\2\2\u00ba\u00bb\7u\2\2\u00bb\u00bc\7k\2\2\u00bc"+
		"<\3\2\2\2\u00bd\u00be\7r\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0\7t\2\2\u00c0"+
		"\u00c1\7c\2\2\u00c1>\3\2\2\2\u00c2\u00c3\7h\2\2\u00c3\u00c4\7k\2\2\u00c4"+
		"\u00c5\7p\2\2\u00c5\u00c6\7a\2\2\u00c6\u00c7\7r\2\2\u00c7\u00c8\7c\2\2"+
		"\u00c8\u00c9\7t\2\2\u00c9\u00ca\7c\2\2\u00ca@\3\2\2\2\u00cb\u00cc\7=\2"+
		"\2\u00ccB\3\2\2\2\u00cd\u00ce\7o\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0\7"+
		"g\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7v\2\2\u00d2\u00d3\7t\2\2\u00d3\u00d4"+
		"\7c\2\2\u00d4\u00d5\7u\2\2\u00d5D\3\2\2\2\u00d6\u00d7\7h\2\2\u00d7\u00d8"+
		"\7k\2\2\u00d8\u00d9\7p\2\2\u00d9\u00da\7a\2\2\u00da\u00db\7o\2\2\u00db"+
		"\u00dc\7k\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de\7p\2\2\u00de\u00df\7v\2\2"+
		"\u00df\u00e0\7t\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2\7u\2\2\u00e2F\3\2\2"+
		"\2\u00e3\u00e4\7n\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7"+
		"\7t\2\2\u00e7H\3\2\2\2\u00e8\u00e9\7g\2\2\u00e9\u00ea\7u\2\2\u00ea\u00eb"+
		"\7e\2\2\u00eb\u00ec\7t\2\2\u00ec\u00ed\7k\2\2\u00ed\u00ee\7d\2\2\u00ee"+
		"\u00ef\7k\2\2\u00ef\u00f0\7t\2\2\u00f0J\3\2\2\2\u00f1\u00f3\t\3\2\2\u00f2"+
		"\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2"+
		"\2\2\u00f5L\3\2\2\2\u00f6\u00fa\7#\2\2\u00f7\u00f9\13\2\2\2\u00f8\u00f7"+
		"\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb"+
		"\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00ff\7\17\2\2\u00fe\u00fd\3"+
		"\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\7\f\2\2\u0101"+
		"\u0102\3\2\2\2\u0102\u0103\b\'\2\2\u0103N\3\2\2\2\u0104\u0106\t\4\2\2"+
		"\u0105\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108"+
		"\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\b(\2\2\u010aP\3\2\2\2\b\2y\u00f4"+
		"\u00fa\u00fe\u0107\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
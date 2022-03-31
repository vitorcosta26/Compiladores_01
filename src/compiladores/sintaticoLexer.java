package compiladores;
// Generated from sintatico.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class sintaticoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ESPACO=1, PROGRAM=2, INTEGER=3, BOOLEAN=4, BEGIN=5, END=6, WHILE=7, DO=8, 
		READ=9, VAR=10, FALSE=11, TRUE=12, WRITE=13, STRING=14, IF=15, ELSE=16, 
		THEN=17, OR=18, AND=19, NEG=20, COMENTARIO=21, CADEIA=22, OPLOG=23, OPNEG=24, 
		OPAD=25, OPMULT=26, OPREL=27, MAIS=28, MENOS=29, VEZES=30, DIV=31, MAIOR=32, 
		MENOR=33, MAIG=34, MENIG=35, IGUAL=36, DIFER=37, PVIG=38, ABPAR=39, FPAR=40, 
		ATRIB=41, DPONTOS=42, PONTO=43, VIG=44, IDENTIFIER=45, CTE=46;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ESPACO", "PROGRAM", "INTEGER", "BOOLEAN", "BEGIN", "END", "WHILE", "DO", 
			"READ", "VAR", "FALSE", "TRUE", "WRITE", "STRING", "IF", "ELSE", "THEN", 
			"OR", "AND", "NEG", "COMENTARIO", "CADEIA", "OPLOG", "OPNEG", "OPAD", 
			"OPMULT", "OPREL", "MAIS", "MENOS", "VEZES", "DIV", "MAIOR", "MENOR", 
			"MAIG", "MENIG", "IGUAL", "DIFER", "PVIG", "ABPAR", "FPAR", "ATRIB", 
			"DPONTOS", "PONTO", "VIG", "IDENTIFIER", "CTE", "NUMERO", "LETRA", "A", 
			"B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", 
			"P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ESPACO", "PROGRAM", "INTEGER", "BOOLEAN", "BEGIN", "END", "WHILE", 
			"DO", "READ", "VAR", "FALSE", "TRUE", "WRITE", "STRING", "IF", "ELSE", 
			"THEN", "OR", "AND", "NEG", "COMENTARIO", "CADEIA", "OPLOG", "OPNEG", 
			"OPAD", "OPMULT", "OPREL", "MAIS", "MENOS", "VEZES", "DIV", "MAIOR", 
			"MENOR", "MAIG", "MENIG", "IGUAL", "DIFER", "PVIG", "ABPAR", "FPAR", 
			"ATRIB", "DPONTOS", "PONTO", "VIG", "IDENTIFIER", "CTE"
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


	public sintaticoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "sintatico.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u0196\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\3\2\6\2\u0099\n\2\r\2\16\2\u009a\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\7\26\u0105\n\26\f\26\16\26\u0108\13\26\3\26\3\26"+
		"\3\27\3\27\7\27\u010e\n\27\f\27\16\27\u0111\13\27\3\27\3\27\3\30\3\30"+
		"\5\30\u0117\n\30\3\31\3\31\3\32\3\32\5\32\u011d\n\32\3\33\3\33\5\33\u0121"+
		"\n\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0129\n\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'"+
		"\3\'\3(\3(\3)\3)\3*\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\7.\u0155\n.\f.\16"+
		".\u0158\13.\3/\6/\u015b\n/\r/\16/\u015c\3\60\3\60\3\61\3\61\3\62\3\62"+
		"\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3"+
		";\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3"+
		"F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\2\2L\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\2a\2c\2e\2g\2i\2k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083"+
		"\2\u0085\2\u0087\2\u0089\2\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095"+
		"\2\3\2!\5\2\13\f\17\17\"\"\4\2\f\f\17\17\6\2\f\f\17\17$$^^\3\2\62;\4\2"+
		"C\\c|\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj"+
		"\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2S"+
		"Sss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4"+
		"\2\\\\||\2\u0187\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\3\u0098\3\2\2\2\5\u009e\3\2\2\2\7\u00a6\3\2\2\2\t\u00ae\3\2\2\2\13\u00b6"+
		"\3\2\2\2\r\u00bc\3\2\2\2\17\u00c0\3\2\2\2\21\u00c6\3\2\2\2\23\u00c9\3"+
		"\2\2\2\25\u00ce\3\2\2\2\27\u00d2\3\2\2\2\31\u00d8\3\2\2\2\33\u00dd\3\2"+
		"\2\2\35\u00e3\3\2\2\2\37\u00ea\3\2\2\2!\u00ed\3\2\2\2#\u00f2\3\2\2\2%"+
		"\u00f7\3\2\2\2\'\u00fa\3\2\2\2)\u00fe\3\2\2\2+\u0100\3\2\2\2-\u010b\3"+
		"\2\2\2/\u0116\3\2\2\2\61\u0118\3\2\2\2\63\u011c\3\2\2\2\65\u0120\3\2\2"+
		"\2\67\u0128\3\2\2\29\u012a\3\2\2\2;\u012c\3\2\2\2=\u012e\3\2\2\2?\u0130"+
		"\3\2\2\2A\u0132\3\2\2\2C\u0134\3\2\2\2E\u0136\3\2\2\2G\u0139\3\2\2\2I"+
		"\u013c\3\2\2\2K\u013f\3\2\2\2M\u0142\3\2\2\2O\u0144\3\2\2\2Q\u0146\3\2"+
		"\2\2S\u0148\3\2\2\2U\u014b\3\2\2\2W\u014d\3\2\2\2Y\u014f\3\2\2\2[\u0151"+
		"\3\2\2\2]\u015a\3\2\2\2_\u015e\3\2\2\2a\u0160\3\2\2\2c\u0162\3\2\2\2e"+
		"\u0164\3\2\2\2g\u0166\3\2\2\2i\u0168\3\2\2\2k\u016a\3\2\2\2m\u016c\3\2"+
		"\2\2o\u016e\3\2\2\2q\u0170\3\2\2\2s\u0172\3\2\2\2u\u0174\3\2\2\2w\u0176"+
		"\3\2\2\2y\u0178\3\2\2\2{\u017a\3\2\2\2}\u017c\3\2\2\2\177\u017e\3\2\2"+
		"\2\u0081\u0180\3\2\2\2\u0083\u0182\3\2\2\2\u0085\u0184\3\2\2\2\u0087\u0186"+
		"\3\2\2\2\u0089\u0188\3\2\2\2\u008b\u018a\3\2\2\2\u008d\u018c\3\2\2\2\u008f"+
		"\u018e\3\2\2\2\u0091\u0190\3\2\2\2\u0093\u0192\3\2\2\2\u0095\u0194\3\2"+
		"\2\2\u0097\u0099\t\2\2\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\b\2"+
		"\2\2\u009d\4\3\2\2\2\u009e\u009f\5\u0081A\2\u009f\u00a0\5\u0085C\2\u00a0"+
		"\u00a1\5\177@\2\u00a1\u00a2\5o8\2\u00a2\u00a3\5\u0085C\2\u00a3\u00a4\5"+
		"c\62\2\u00a4\u00a5\5{>\2\u00a5\6\3\2\2\2\u00a6\u00a7\5s:\2\u00a7\u00a8"+
		"\5}?\2\u00a8\u00a9\5\u0089E\2\u00a9\u00aa\5k\66\2\u00aa\u00ab\5o8\2\u00ab"+
		"\u00ac\5k\66\2\u00ac\u00ad\5\u0085C\2\u00ad\b\3\2\2\2\u00ae\u00af\5e\63"+
		"\2\u00af\u00b0\5\177@\2\u00b0\u00b1\5\177@\2\u00b1\u00b2\5y=\2\u00b2\u00b3"+
		"\5k\66\2\u00b3\u00b4\5c\62\2\u00b4\u00b5\5}?\2\u00b5\n\3\2\2\2\u00b6\u00b7"+
		"\5e\63\2\u00b7\u00b8\5k\66\2\u00b8\u00b9\5o8\2\u00b9\u00ba\5s:\2\u00ba"+
		"\u00bb\5}?\2\u00bb\f\3\2\2\2\u00bc\u00bd\5k\66\2\u00bd\u00be\5}?\2\u00be"+
		"\u00bf\5i\65\2\u00bf\16\3\2\2\2\u00c0\u00c1\5\u008fH\2\u00c1\u00c2\5q"+
		"9\2\u00c2\u00c3\5s:\2\u00c3\u00c4\5y=\2\u00c4\u00c5\5k\66\2\u00c5\20\3"+
		"\2\2\2\u00c6\u00c7\5i\65\2\u00c7\u00c8\5\177@\2\u00c8\22\3\2\2\2\u00c9"+
		"\u00ca\5\u0085C\2\u00ca\u00cb\5k\66\2\u00cb\u00cc\5c\62\2\u00cc\u00cd"+
		"\5i\65\2\u00cd\24\3\2\2\2\u00ce\u00cf\5\u008dG\2\u00cf\u00d0\5c\62\2\u00d0"+
		"\u00d1\5\u0085C\2\u00d1\26\3\2\2\2\u00d2\u00d3\5m\67\2\u00d3\u00d4\5c"+
		"\62\2\u00d4\u00d5\5y=\2\u00d5\u00d6\5\u0087D\2\u00d6\u00d7\5k\66\2\u00d7"+
		"\30\3\2\2\2\u00d8\u00d9\5\u0089E\2\u00d9\u00da\5\u0085C\2\u00da\u00db"+
		"\5\u008bF\2\u00db\u00dc\5k\66\2\u00dc\32\3\2\2\2\u00dd\u00de\5\u008fH"+
		"\2\u00de\u00df\5\u0085C\2\u00df\u00e0\5s:\2\u00e0\u00e1\5\u0089E\2\u00e1"+
		"\u00e2\5k\66\2\u00e2\34\3\2\2\2\u00e3\u00e4\5\u0087D\2\u00e4\u00e5\5\u0089"+
		"E\2\u00e5\u00e6\5\u0085C\2\u00e6\u00e7\5s:\2\u00e7\u00e8\5}?\2\u00e8\u00e9"+
		"\5o8\2\u00e9\36\3\2\2\2\u00ea\u00eb\5s:\2\u00eb\u00ec\5m\67\2\u00ec \3"+
		"\2\2\2\u00ed\u00ee\5k\66\2\u00ee\u00ef\5y=\2\u00ef\u00f0\5\u0087D\2\u00f0"+
		"\u00f1\5k\66\2\u00f1\"\3\2\2\2\u00f2\u00f3\5\u0089E\2\u00f3\u00f4\5q9"+
		"\2\u00f4\u00f5\5k\66\2\u00f5\u00f6\5}?\2\u00f6$\3\2\2\2\u00f7\u00f8\5"+
		"\177@\2\u00f8\u00f9\5\u0085C\2\u00f9&\3\2\2\2\u00fa\u00fb\5c\62\2\u00fb"+
		"\u00fc\5}?\2\u00fc\u00fd\5i\65\2\u00fd(\3\2\2\2\u00fe\u00ff\7\u0080\2"+
		"\2\u00ff*\3\2\2\2\u0100\u0101\7\61\2\2\u0101\u0102\7\61\2\2\u0102\u0106"+
		"\3\2\2\2\u0103\u0105\n\3\2\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u0106\3\2"+
		"\2\2\u0109\u010a\b\26\2\2\u010a,\3\2\2\2\u010b\u010f\7$\2\2\u010c\u010e"+
		"\n\4\2\2\u010d\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0113\7$"+
		"\2\2\u0113.\3\2\2\2\u0114\u0117\5%\23\2\u0115\u0117\5\'\24\2\u0116\u0114"+
		"\3\2\2\2\u0116\u0115\3\2\2\2\u0117\60\3\2\2\2\u0118\u0119\5)\25\2\u0119"+
		"\62\3\2\2\2\u011a\u011d\59\35\2\u011b\u011d\5;\36\2\u011c\u011a\3\2\2"+
		"\2\u011c\u011b\3\2\2\2\u011d\64\3\2\2\2\u011e\u0121\5=\37\2\u011f\u0121"+
		"\5? \2\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121\66\3\2\2\2\u0122"+
		"\u0129\5C\"\2\u0123\u0129\5G$\2\u0124\u0129\5A!\2\u0125\u0129\5E#\2\u0126"+
		"\u0129\5I%\2\u0127\u0129\5K&\2\u0128\u0122\3\2\2\2\u0128\u0123\3\2\2\2"+
		"\u0128\u0124\3\2\2\2\u0128\u0125\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0127"+
		"\3\2\2\2\u01298\3\2\2\2\u012a\u012b\7-\2\2\u012b:\3\2\2\2\u012c\u012d"+
		"\7/\2\2\u012d<\3\2\2\2\u012e\u012f\7,\2\2\u012f>\3\2\2\2\u0130\u0131\7"+
		"\61\2\2\u0131@\3\2\2\2\u0132\u0133\7@\2\2\u0133B\3\2\2\2\u0134\u0135\7"+
		">\2\2\u0135D\3\2\2\2\u0136\u0137\7@\2\2\u0137\u0138\7?\2\2\u0138F\3\2"+
		"\2\2\u0139\u013a\7>\2\2\u013a\u013b\7?\2\2\u013bH\3\2\2\2\u013c\u013d"+
		"\7?\2\2\u013d\u013e\7?\2\2\u013eJ\3\2\2\2\u013f\u0140\7>\2\2\u0140\u0141"+
		"\7@\2\2\u0141L\3\2\2\2\u0142\u0143\7=\2\2\u0143N\3\2\2\2\u0144\u0145\7"+
		"*\2\2\u0145P\3\2\2\2\u0146\u0147\7+\2\2\u0147R\3\2\2\2\u0148\u0149\7<"+
		"\2\2\u0149\u014a\7?\2\2\u014aT\3\2\2\2\u014b\u014c\7<\2\2\u014cV\3\2\2"+
		"\2\u014d\u014e\7\60\2\2\u014eX\3\2\2\2\u014f\u0150\7.\2\2\u0150Z\3\2\2"+
		"\2\u0151\u0156\5a\61\2\u0152\u0155\5a\61\2\u0153\u0155\5_\60\2\u0154\u0152"+
		"\3\2\2\2\u0154\u0153\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157\\\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015b\5_\60\2"+
		"\u015a\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d"+
		"\3\2\2\2\u015d^\3\2\2\2\u015e\u015f\t\5\2\2\u015f`\3\2\2\2\u0160\u0161"+
		"\t\6\2\2\u0161b\3\2\2\2\u0162\u0163\t\7\2\2\u0163d\3\2\2\2\u0164\u0165"+
		"\t\b\2\2\u0165f\3\2\2\2\u0166\u0167\t\t\2\2\u0167h\3\2\2\2\u0168\u0169"+
		"\t\n\2\2\u0169j\3\2\2\2\u016a\u016b\t\13\2\2\u016bl\3\2\2\2\u016c\u016d"+
		"\t\f\2\2\u016dn\3\2\2\2\u016e\u016f\t\r\2\2\u016fp\3\2\2\2\u0170\u0171"+
		"\t\16\2\2\u0171r\3\2\2\2\u0172\u0173\t\17\2\2\u0173t\3\2\2\2\u0174\u0175"+
		"\t\20\2\2\u0175v\3\2\2\2\u0176\u0177\t\21\2\2\u0177x\3\2\2\2\u0178\u0179"+
		"\t\22\2\2\u0179z\3\2\2\2\u017a\u017b\t\23\2\2\u017b|\3\2\2\2\u017c\u017d"+
		"\t\24\2\2\u017d~\3\2\2\2\u017e\u017f\t\25\2\2\u017f\u0080\3\2\2\2\u0180"+
		"\u0181\t\26\2\2\u0181\u0082\3\2\2\2\u0182\u0183\t\27\2\2\u0183\u0084\3"+
		"\2\2\2\u0184\u0185\t\30\2\2\u0185\u0086\3\2\2\2\u0186\u0187\t\31\2\2\u0187"+
		"\u0088\3\2\2\2\u0188\u0189\t\32\2\2\u0189\u008a\3\2\2\2\u018a\u018b\t"+
		"\33\2\2\u018b\u008c\3\2\2\2\u018c\u018d\t\34\2\2\u018d\u008e\3\2\2\2\u018e"+
		"\u018f\t\35\2\2\u018f\u0090\3\2\2\2\u0190\u0191\t\36\2\2\u0191\u0092\3"+
		"\2\2\2\u0192\u0193\t\37\2\2\u0193\u0094\3\2\2\2\u0194\u0195\t \2\2\u0195"+
		"\u0096\3\2\2\2\r\2\u009a\u0106\u010f\u0116\u011c\u0120\u0128\u0154\u0156"+
		"\u015c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
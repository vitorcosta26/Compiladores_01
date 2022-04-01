// Generated from sintatico.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class sintaticoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ESPACO=1, COMENTARIO=2, CADEIA=3, PROGRAM=4, INTEGER=5, BOOLEAN=6, BEGIN=7, 
		END=8, WHILE=9, DO=10, READ=11, VAR=12, FALSE=13, TRUE=14, WRITE=15, STRING=16, 
		IF=17, ELSE=18, THEN=19, OPLOG=20, OPNEG=21, OPAD=22, OPMULT=23, OPREL=24, 
		OR=25, AND=26, NEG=27, MAIS=28, MENOS=29, VEZES=30, DIV=31, MAIOR=32, 
		MENOR=33, MAIG=34, MENIG=35, IGUAL=36, DIFER=37, PVIG=38, ABPAR=39, FPAR=40, 
		ATRIB=41, DPONTOS=42, PONTO=43, VIG=44, ID=45, CTE=46;
	public static final String[] tokenNames = {
		"<INVALID>", "ESPACO", "COMENTARIO", "CADEIA", "PROGRAM", "INTEGER", "BOOLEAN", 
		"BEGIN", "END", "WHILE", "DO", "READ", "VAR", "FALSE", "TRUE", "WRITE", 
		"STRING", "IF", "ELSE", "THEN", "OPLOG", "OPNEG", "OPAD", "OPMULT", "OPREL", 
		"OR", "AND", "'~'", "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'>='", 
		"'<='", "'=='", "'<>'", "';'", "'('", "')'", "':='", "':'", "'.'", "','", 
		"ID", "CTE"
	};
	public static final int
		RULE_prog = 0, RULE_decls = 1, RULE_listDecl = 2, RULE_declTip = 3, RULE_listId = 4, 
		RULE_tip = 5, RULE_cmdComp = 6, RULE_listCmd = 7, RULE_cmd = 8, RULE_cmdIf = 9, 
		RULE_cmdWhile = 10, RULE_cmdRead = 11, RULE_cmdWrite = 12, RULE_listW = 13, 
		RULE_elemW = 14, RULE_cmdAtrib = 15, RULE_expr = 16;
	public static final String[] ruleNames = {
		"prog", "decls", "listDecl", "declTip", "listId", "tip", "cmdComp", "listCmd", 
		"cmd", "cmdIf", "cmdWhile", "cmdRead", "cmdWrite", "listW", "elemW", "cmdAtrib", 
		"expr"
	};

	@Override
	public String getGrammarFileName() { return "sintatico.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public sintaticoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(sintaticoParser.ID, 0); }
		public TerminalNode PVIG() { return getToken(sintaticoParser.PVIG, 0); }
		public CmdCompContext cmdComp() {
			return getRuleContext(CmdCompContext.class,0);
		}
		public TerminalNode PONTO() { return getToken(sintaticoParser.PONTO, 0); }
		public TerminalNode PROGRAM() { return getToken(sintaticoParser.PROGRAM, 0); }
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaticoListener ) ((sintaticoListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaticoListener ) ((sintaticoListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); match(PROGRAM);
			setState(35); match(ID);
			setState(36); match(PVIG);
			setState(37); decls();
			setState(38); cmdComp();
			setState(39); match(PONTO);
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

	public static class DeclsContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(sintaticoParser.VAR, 0); }
		public ListDeclContext listDecl() {
			return getRuleContext(ListDeclContext.class,0);
		}
		public TerminalNode ESPACO() { return getToken(sintaticoParser.ESPACO, 0); }
		public DeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaticoListener ) ((sintaticoListener)listener).enterDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaticoListener ) ((sintaticoListener)listener).exitDecls(this);
		}
	}

	public final DeclsContext decls() throws RecognitionException {
		DeclsContext _localctx = new DeclsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decls);
		try {
			setState(44);
			switch (_input.LA(1)) {
			case ESPACO:
				enterOuterAlt(_localctx, 1);
				{
				setState(41); match(ESPACO);
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(42); match(VAR);
				setState(43); listDecl();
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

	public static class ListDeclContext extends ParserRuleContext {
		public DeclTipContext declTip() {
			return getRuleContext(DeclTipContext.class,0);
		}
		public ListDeclContext listDecl() {
			return getRuleContext(ListDeclContext.class,0);
		}
		public ListDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaticoListener ) ((sintaticoListener)listener).enterListDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaticoListener ) ((sintaticoListener)listener).exitListDecl(this);
		}
	}

	public final ListDeclContext listDecl() throws RecognitionException {
		ListDeclContext _localctx = new ListDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_listDecl);
		try {
			setState(50);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46); declTip();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47); declTip();
				setState(48); listDecl();
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

	public static class DeclTipContext extends ParserRuleContext {
		public ListIdContext listId() {
			return getRuleContext(ListIdContext.class,0);
		}
		public TerminalNode PVIG() { return getToken(sintaticoParser.PVIG, 0); }
		public TipContext tip() {
			return getRuleContext(TipContext.class,0);
		}
		public TerminalNode DPONTOS() { return getToken(sintaticoParser.DPONTOS, 0); }
		public DeclTipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declTip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaticoListener ) ((sintaticoListener)listener).enterDeclTip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaticoListener ) ((sintaticoListener)listener).exitDeclTip(this);
		}
	}

	public final DeclTipContext declTip() throws RecognitionException {
		DeclTipContext _localctx = new DeclTipContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declTip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); listId();
			setState(53); match(DPONTOS);
			setState(54); tip();
			setState(55); match(PVIG);
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

	public static class ListIdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(sintaticoParser.ID, 0); }
		public ListIdContext listId() {
			return getRuleContext(ListIdContext.class,0);
		}
		public TerminalNode VIG() { return getToken(sintaticoParser.VIG, 0); }
		public ListIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaticoListener ) ((sintaticoListener)listener).enterListId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaticoListener ) ((sintaticoListener)listener).exitListId(this);
		}
	}

	public final ListIdContext listId() throws RecognitionException {
		ListIdContext _localctx = new ListIdContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_listId);
		try {
			setState(61);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57); match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58); match(ID);
				setState(59); match(VIG);
				setState(60); listId();
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

	public static class TipContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(sintaticoParser.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(sintaticoParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(sintaticoParser.BOOLEAN, 0); }
		public TipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaticoListener ) ((sintaticoListener)listener).enterTip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaticoListener ) ((sintaticoListener)listener).exitTip(this);
		}
	}

	public final TipContext tip() throws RecognitionException {
		TipContext _localctx = new TipContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tip);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << BOOLEAN) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class CmdCompContext extends ParserRuleContext {
		public ListCmdContext listCmd() {
			return getRuleContext(ListCmdContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(sintaticoParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(sintaticoParser.END, 0); }
		public CmdCompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdComp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaticoListener ) ((sintaticoListener)listener).enterCmdComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaticoListener ) ((sintaticoListener)listener).exitCmdComp(this);
		}
	}

	public final CmdCompContext cmdComp() throws RecognitionException {
		CmdCompContext _localctx = new CmdCompContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmdComp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); match(BEGIN);
			setState(66); listCmd();
			setState(67); match(END);
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

	public static class ListCmdContext extends ParserRuleContext {
		public TerminalNode PVIG() { return getToken(sintaticoParser.PVIG, 0); }
		public ListCmdContext listCmd() {
			return getRuleContext(ListCmdContext.class,0);
		}
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public ListCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaticoListener ) ((sintaticoListener)listener).enterListCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaticoListener ) ((sintaticoListener)listener).exitListCmd(this);
		}
	}

	public final ListCmdContext listCmd() throws RecognitionException {
		ListCmdContext _localctx = new ListCmdContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_listCmd);
		try {
			setState(74);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69); cmd();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70); cmd();
				setState(71); match(PVIG);
				setState(72); listCmd();
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

	public static class CmdContext extends ParserRuleContext {
		public CmdWhileContext cmdWhile() {
			return getRuleContext(CmdWhileContext.class,0);
		}
		public CmdIfContext cmdIf() {
			return getRuleContext(CmdIfContext.class,0);
		}
		public CmdReadContext cmdRead() {
			return getRuleContext(CmdReadContext.class,0);
		}
		public CmdCompContext cmdComp() {
			return getRuleContext(CmdCompContext.class,0);
		}
		public CmdAtribContext cmdAtrib() {
			return getRuleContext(CmdAtribContext.class,0);
		}
		public CmdWriteContext cmdWrite() {
			return getRuleContext(CmdWriteContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaticoListener ) ((sintaticoListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaticoListener ) ((sintaticoListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmd);
		try {
			setState(82);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(76); cmdIf();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(77); cmdWhile();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 3);
				{
				setState(78); cmdRead();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 4);
				{
				setState(79); cmdWrite();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(80); cmdAtrib();
				}
				break;
			case BEGIN:
				enterOuterAlt(_localctx, 6);
				{
				setState(81); cmdComp();
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

	public static class CmdIfContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(sintaticoParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(sintaticoParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(sintaticoParser.THEN, 0); }
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaticoListener ) ((sintaticoListener)listener).enterCmdIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaticoListener ) ((sintaticoListener)listener).exitCmdIf(this);
		}
	}

	public final CmdIfContext cmdIf() throws RecognitionException {
		CmdIfContext _localctx = new CmdIfContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmdIf);
		try {
			setState(96);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84); match(IF);
				setState(85); expr(0);
				setState(86); match(THEN);
				setState(87); cmd();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89); match(IF);
				setState(90); expr(0);
				setState(91); match(THEN);
				setState(92); cmd();
				setState(93); match(ELSE);
				setState(94); cmd();
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

	public static class CmdWhileContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DO() { return getToken(sintaticoParser.DO, 0); }
		public TerminalNode WHILE() { return getToken(sintaticoParser.WHILE, 0); }
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public CmdWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaticoListener ) ((sintaticoListener)listener).enterCmdWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaticoListener ) ((sintaticoListener)listener).exitCmdWhile(this);
		}
	}

	public final CmdWhileContext cmdWhile() throws RecognitionException {
		CmdWhileContext _localctx = new CmdWhileContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cmdWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); match(WHILE);
			setState(99); expr(0);
			setState(100); match(DO);
			setState(101); cmd();
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

	public static class CmdReadContext extends ParserRuleContext {
		public ListIdContext listId() {
			return getRuleContext(ListIdContext.class,0);
		}
		public TerminalNode ABPAR() { return getToken(sintaticoParser.ABPAR, 0); }
		public TerminalNode READ() { return getToken(sintaticoParser.READ, 0); }
		public TerminalNode FPAR() { return getToken(sintaticoParser.FPAR, 0); }
		public CmdReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdRead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaticoListener ) ((sintaticoListener)listener).enterCmdRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaticoListener ) ((sintaticoListener)listener).exitCmdRead(this);
		}
	}

	public final CmdReadContext cmdRead() throws RecognitionException {
		CmdReadContext _localctx = new CmdReadContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cmdRead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); match(READ);
			setState(104); match(ABPAR);
			setState(105); listId();
			setState(106); match(FPAR);
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

	public static class CmdWriteContext extends ParserRuleContext {
		public ListWContext listW() {
			return getRuleContext(ListWContext.class,0);
		}
		public TerminalNode WRITE() { return getToken(sintaticoParser.WRITE, 0); }
		public TerminalNode ABPAR() { return getToken(sintaticoParser.ABPAR, 0); }
		public TerminalNode FPAR() { return getToken(sintaticoParser.FPAR, 0); }
		public CmdWriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdWrite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaticoListener ) ((sintaticoListener)listener).enterCmdWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaticoListener ) ((sintaticoListener)listener).exitCmdWrite(this);
		}
	}

	public final CmdWriteContext cmdWrite() throws RecognitionException {
		CmdWriteContext _localctx = new CmdWriteContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cmdWrite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108); match(WRITE);
			setState(109); match(ABPAR);
			setState(110); listW();
			setState(111); match(FPAR);
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

	public static class ListWContext extends ParserRuleContext {
		public ListWContext listW() {
			return getRuleContext(ListWContext.class,0);
		}
		public TerminalNode VIG() { return getToken(sintaticoParser.VIG, 0); }
		public ElemWContext elemW() {
			return getRuleContext(ElemWContext.class,0);
		}
		public ListWContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listW; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaticoListener ) ((sintaticoListener)listener).enterListW(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaticoListener ) ((sintaticoListener)listener).exitListW(this);
		}
	}

	public final ListWContext listW() throws RecognitionException {
		ListWContext _localctx = new ListWContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_listW);
		try {
			setState(118);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113); elemW();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114); elemW();
				setState(115); match(VIG);
				setState(116); listW();
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

	public static class ElemWContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(sintaticoParser.CADEIA, 0); }
		public ElemWContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elemW; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaticoListener ) ((sintaticoListener)listener).enterElemW(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaticoListener ) ((sintaticoListener)listener).exitElemW(this);
		}
	}

	public final ElemWContext elemW() throws RecognitionException {
		ElemWContext _localctx = new ElemWContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_elemW);
		try {
			setState(122);
			switch (_input.LA(1)) {
			case FALSE:
			case TRUE:
			case OPNEG:
			case OPAD:
			case ABPAR:
			case ID:
			case CTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(120); expr(0);
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(121); match(CADEIA);
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

	public static class CmdAtribContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(sintaticoParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ATRIB() { return getToken(sintaticoParser.ATRIB, 0); }
		public CmdAtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAtrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaticoListener ) ((sintaticoListener)listener).enterCmdAtrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaticoListener ) ((sintaticoListener)listener).exitCmdAtrib(this);
		}
	}

	public final CmdAtribContext cmdAtrib() throws RecognitionException {
		CmdAtribContext _localctx = new CmdAtribContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cmdAtrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); match(ID);
			setState(125); match(ATRIB);
			setState(126); expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode OPAD() { return getToken(sintaticoParser.OPAD, 0); }
		public TerminalNode FALSE() { return getToken(sintaticoParser.FALSE, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> OPNEG() { return getTokens(sintaticoParser.OPNEG); }
		public TerminalNode TRUE() { return getToken(sintaticoParser.TRUE, 0); }
		public TerminalNode OPREL() { return getToken(sintaticoParser.OPREL, 0); }
		public TerminalNode OPMULT() { return getToken(sintaticoParser.OPMULT, 0); }
		public TerminalNode OPNEG(int i) {
			return getToken(sintaticoParser.OPNEG, i);
		}
		public TerminalNode FPAR() { return getToken(sintaticoParser.FPAR, 0); }
		public TerminalNode ID() { return getToken(sintaticoParser.ID, 0); }
		public TerminalNode CTE() { return getToken(sintaticoParser.CTE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode ABPAR() { return getToken(sintaticoParser.ABPAR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaticoListener ) ((sintaticoListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaticoListener ) ((sintaticoListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(130);
				_la = _input.LA(1);
				if (_la==OPNEG) {
					{
					setState(129); match(OPNEG);
					}
				}

				setState(132); match(ABPAR);
				setState(133); expr(0);
				setState(134); match(FPAR);
				}
				break;
			case 2:
				{
				setState(137);
				_la = _input.LA(1);
				if (_la==OPNEG) {
					{
					setState(136); match(OPNEG);
					}
				}

				setState(139); match(ID);
				}
				break;
			case 3:
				{
				setState(141);
				_la = _input.LA(1);
				if (_la==OPNEG) {
					{
					setState(140); match(OPNEG);
					}
				}

				setState(144);
				_la = _input.LA(1);
				if (_la==OPAD) {
					{
					setState(143); match(OPAD);
					}
				}

				setState(146); match(CTE);
				}
				break;
			case 4:
				{
				setState(148);
				_la = _input.LA(1);
				if (_la==OPNEG) {
					{
					setState(147); match(OPNEG);
					}
				}

				setState(150); match(TRUE);
				}
				break;
			case 5:
				{
				setState(152);
				_la = _input.LA(1);
				if (_la==OPNEG) {
					{
					setState(151); match(OPNEG);
					}
				}

				setState(154); match(FALSE);
				}
				break;
			case 6:
				{
				setState(156);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(155); match(OPNEG);
					}
					break;
				}
				setState(158); match(OPNEG);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(172);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(170);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(161);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(162); match(OPMULT);
						setState(163); expr(9);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(164);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(165); match(OPAD);
						setState(166); expr(8);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(167);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(168); match(OPREL);
						setState(169); expr(7);
						}
						break;
					}
					} 
				}
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 8);
		case 1: return precpred(_ctx, 7);
		case 2: return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\60\u00b2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\5\3/\n\3\3\4\3\4\3\4\3\4\5\4"+
		"\65\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6@\n\6\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\5\tM\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\nU\n\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13c\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\5\17y\n\17\3\20\3\20\5\20}\n\20\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\5\22\u0085\n\22\3\22\3\22\3\22\3\22\3\22\5\22\u008c\n\22"+
		"\3\22\3\22\5\22\u0090\n\22\3\22\5\22\u0093\n\22\3\22\3\22\5\22\u0097\n"+
		"\22\3\22\3\22\5\22\u009b\n\22\3\22\3\22\5\22\u009f\n\22\3\22\5\22\u00a2"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00ad\n\22\f\22"+
		"\16\22\u00b0\13\22\3\22\2\3\"\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"\2\3\4\2\7\b\22\22\u00bb\2$\3\2\2\2\4.\3\2\2\2\6\64\3\2\2\2\b\66\3"+
		"\2\2\2\n?\3\2\2\2\fA\3\2\2\2\16C\3\2\2\2\20L\3\2\2\2\22T\3\2\2\2\24b\3"+
		"\2\2\2\26d\3\2\2\2\30i\3\2\2\2\32n\3\2\2\2\34x\3\2\2\2\36|\3\2\2\2 ~\3"+
		"\2\2\2\"\u00a1\3\2\2\2$%\7\6\2\2%&\7/\2\2&\'\7(\2\2\'(\5\4\3\2()\5\16"+
		"\b\2)*\7-\2\2*\3\3\2\2\2+/\7\3\2\2,-\7\16\2\2-/\5\6\4\2.+\3\2\2\2.,\3"+
		"\2\2\2/\5\3\2\2\2\60\65\5\b\5\2\61\62\5\b\5\2\62\63\5\6\4\2\63\65\3\2"+
		"\2\2\64\60\3\2\2\2\64\61\3\2\2\2\65\7\3\2\2\2\66\67\5\n\6\2\678\7,\2\2"+
		"89\5\f\7\29:\7(\2\2:\t\3\2\2\2;@\7/\2\2<=\7/\2\2=>\7.\2\2>@\5\n\6\2?;"+
		"\3\2\2\2?<\3\2\2\2@\13\3\2\2\2AB\t\2\2\2B\r\3\2\2\2CD\7\t\2\2DE\5\20\t"+
		"\2EF\7\n\2\2F\17\3\2\2\2GM\5\22\n\2HI\5\22\n\2IJ\7(\2\2JK\5\20\t\2KM\3"+
		"\2\2\2LG\3\2\2\2LH\3\2\2\2M\21\3\2\2\2NU\5\24\13\2OU\5\26\f\2PU\5\30\r"+
		"\2QU\5\32\16\2RU\5 \21\2SU\5\16\b\2TN\3\2\2\2TO\3\2\2\2TP\3\2\2\2TQ\3"+
		"\2\2\2TR\3\2\2\2TS\3\2\2\2U\23\3\2\2\2VW\7\23\2\2WX\5\"\22\2XY\7\25\2"+
		"\2YZ\5\22\n\2Zc\3\2\2\2[\\\7\23\2\2\\]\5\"\22\2]^\7\25\2\2^_\5\22\n\2"+
		"_`\7\24\2\2`a\5\22\n\2ac\3\2\2\2bV\3\2\2\2b[\3\2\2\2c\25\3\2\2\2de\7\13"+
		"\2\2ef\5\"\22\2fg\7\f\2\2gh\5\22\n\2h\27\3\2\2\2ij\7\r\2\2jk\7)\2\2kl"+
		"\5\n\6\2lm\7*\2\2m\31\3\2\2\2no\7\21\2\2op\7)\2\2pq\5\34\17\2qr\7*\2\2"+
		"r\33\3\2\2\2sy\5\36\20\2tu\5\36\20\2uv\7.\2\2vw\5\34\17\2wy\3\2\2\2xs"+
		"\3\2\2\2xt\3\2\2\2y\35\3\2\2\2z}\5\"\22\2{}\7\5\2\2|z\3\2\2\2|{\3\2\2"+
		"\2}\37\3\2\2\2~\177\7/\2\2\177\u0080\7+\2\2\u0080\u0081\5\"\22\2\u0081"+
		"!\3\2\2\2\u0082\u0084\b\22\1\2\u0083\u0085\7\27\2\2\u0084\u0083\3\2\2"+
		"\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\7)\2\2\u0087\u0088"+
		"\5\"\22\2\u0088\u0089\7*\2\2\u0089\u00a2\3\2\2\2\u008a\u008c\7\27\2\2"+
		"\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u00a2"+
		"\7/\2\2\u008e\u0090\7\27\2\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0092\3\2\2\2\u0091\u0093\7\30\2\2\u0092\u0091\3\2\2\2\u0092\u0093\3"+
		"\2\2\2\u0093\u0094\3\2\2\2\u0094\u00a2\7\60\2\2\u0095\u0097\7\27\2\2\u0096"+
		"\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u00a2\7\20"+
		"\2\2\u0099\u009b\7\27\2\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u00a2\7\17\2\2\u009d\u009f\7\27\2\2\u009e\u009d\3"+
		"\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\7\27\2\2\u00a1"+
		"\u0082\3\2\2\2\u00a1\u008b\3\2\2\2\u00a1\u008f\3\2\2\2\u00a1\u0096\3\2"+
		"\2\2\u00a1\u009a\3\2\2\2\u00a1\u009e\3\2\2\2\u00a2\u00ae\3\2\2\2\u00a3"+
		"\u00a4\f\n\2\2\u00a4\u00a5\7\31\2\2\u00a5\u00ad\5\"\22\13\u00a6\u00a7"+
		"\f\t\2\2\u00a7\u00a8\7\30\2\2\u00a8\u00ad\5\"\22\n\u00a9\u00aa\f\b\2\2"+
		"\u00aa\u00ab\7\32\2\2\u00ab\u00ad\5\"\22\t\u00ac\u00a3\3\2\2\2\u00ac\u00a6"+
		"\3\2\2\2\u00ac\u00a9\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af#\3\2\2\2\u00b0\u00ae\3\2\2\2\24.\64?LTbx|\u0084\u008b"+
		"\u008f\u0092\u0096\u009a\u009e\u00a1\u00ac\u00ae";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
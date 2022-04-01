package compilador;

// Generated from sintatico.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link sintaticoParser}.
 */
public interface sintaticoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link sintaticoParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(sintaticoParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticoParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(sintaticoParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticoParser#decls}.
	 * @param ctx the parse tree
	 */
	void enterDecls(sintaticoParser.DeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticoParser#decls}.
	 * @param ctx the parse tree
	 */
	void exitDecls(sintaticoParser.DeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticoParser#listDecl}.
	 * @param ctx the parse tree
	 */
	void enterListDecl(sintaticoParser.ListDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticoParser#listDecl}.
	 * @param ctx the parse tree
	 */
	void exitListDecl(sintaticoParser.ListDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticoParser#declTip}.
	 * @param ctx the parse tree
	 */
	void enterDeclTip(sintaticoParser.DeclTipContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticoParser#declTip}.
	 * @param ctx the parse tree
	 */
	void exitDeclTip(sintaticoParser.DeclTipContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticoParser#listId}.
	 * @param ctx the parse tree
	 */
	void enterListId(sintaticoParser.ListIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticoParser#listId}.
	 * @param ctx the parse tree
	 */
	void exitListId(sintaticoParser.ListIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticoParser#tip}.
	 * @param ctx the parse tree
	 */
	void enterTip(sintaticoParser.TipContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticoParser#tip}.
	 * @param ctx the parse tree
	 */
	void exitTip(sintaticoParser.TipContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticoParser#cmdComp}.
	 * @param ctx the parse tree
	 */
	void enterCmdComp(sintaticoParser.CmdCompContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticoParser#cmdComp}.
	 * @param ctx the parse tree
	 */
	void exitCmdComp(sintaticoParser.CmdCompContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticoParser#listCmd}.
	 * @param ctx the parse tree
	 */
	void enterListCmd(sintaticoParser.ListCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticoParser#listCmd}.
	 * @param ctx the parse tree
	 */
	void exitListCmd(sintaticoParser.ListCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticoParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(sintaticoParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticoParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(sintaticoParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticoParser#cmdIf}.
	 * @param ctx the parse tree
	 */
	void enterCmdIf(sintaticoParser.CmdIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticoParser#cmdIf}.
	 * @param ctx the parse tree
	 */
	void exitCmdIf(sintaticoParser.CmdIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticoParser#cmdWhile}.
	 * @param ctx the parse tree
	 */
	void enterCmdWhile(sintaticoParser.CmdWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticoParser#cmdWhile}.
	 * @param ctx the parse tree
	 */
	void exitCmdWhile(sintaticoParser.CmdWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticoParser#cmdRead}.
	 * @param ctx the parse tree
	 */
	void enterCmdRead(sintaticoParser.CmdReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticoParser#cmdRead}.
	 * @param ctx the parse tree
	 */
	void exitCmdRead(sintaticoParser.CmdReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticoParser#cmdWrite}.
	 * @param ctx the parse tree
	 */
	void enterCmdWrite(sintaticoParser.CmdWriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticoParser#cmdWrite}.
	 * @param ctx the parse tree
	 */
	void exitCmdWrite(sintaticoParser.CmdWriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticoParser#listW}.
	 * @param ctx the parse tree
	 */
	void enterListW(sintaticoParser.ListWContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticoParser#listW}.
	 * @param ctx the parse tree
	 */
	void exitListW(sintaticoParser.ListWContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticoParser#elemW}.
	 * @param ctx the parse tree
	 */
	void enterElemW(sintaticoParser.ElemWContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticoParser#elemW}.
	 * @param ctx the parse tree
	 */
	void exitElemW(sintaticoParser.ElemWContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticoParser#cmdAtrib}.
	 * @param ctx the parse tree
	 */
	void enterCmdAtrib(sintaticoParser.CmdAtribContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticoParser#cmdAtrib}.
	 * @param ctx the parse tree
	 */
	void exitCmdAtrib(sintaticoParser.CmdAtribContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(sintaticoParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(sintaticoParser.ExprContext ctx);
}
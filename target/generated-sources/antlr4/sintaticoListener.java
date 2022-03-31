// Generated from sintatico.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link sintaticoParser}.
 */
public interface sintaticoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link sintaticoParser#cmdRead}.
	 * @param ctx the parse tree
	 */
	void enterCmdRead(@NotNull sintaticoParser.CmdReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticoParser#cmdRead}.
	 * @param ctx the parse tree
	 */
	void exitCmdRead(@NotNull sintaticoParser.CmdReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticoParser#cmdComp}.
	 * @param ctx the parse tree
	 */
	void enterCmdComp(@NotNull sintaticoParser.CmdCompContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticoParser#cmdComp}.
	 * @param ctx the parse tree
	 */
	void exitCmdComp(@NotNull sintaticoParser.CmdCompContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticoParser#listCmd}.
	 * @param ctx the parse tree
	 */
	void enterListCmd(@NotNull sintaticoParser.ListCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticoParser#listCmd}.
	 * @param ctx the parse tree
	 */
	void exitListCmd(@NotNull sintaticoParser.ListCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticoParser#listDecl}.
	 * @param ctx the parse tree
	 */
	void enterListDecl(@NotNull sintaticoParser.ListDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticoParser#listDecl}.
	 * @param ctx the parse tree
	 */
	void exitListDecl(@NotNull sintaticoParser.ListDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticoParser#elemW}.
	 * @param ctx the parse tree
	 */
	void enterElemW(@NotNull sintaticoParser.ElemWContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticoParser#elemW}.
	 * @param ctx the parse tree
	 */
	void exitElemW(@NotNull sintaticoParser.ElemWContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticoParser#cmdWhile}.
	 * @param ctx the parse tree
	 */
	void enterCmdWhile(@NotNull sintaticoParser.CmdWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticoParser#cmdWhile}.
	 * @param ctx the parse tree
	 */
	void exitCmdWhile(@NotNull sintaticoParser.CmdWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticoParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull sintaticoParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticoParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull sintaticoParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticoParser#listId}.
	 * @param ctx the parse tree
	 */
	void enterListId(@NotNull sintaticoParser.ListIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticoParser#listId}.
	 * @param ctx the parse tree
	 */
	void exitListId(@NotNull sintaticoParser.ListIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticoParser#cmdIf}.
	 * @param ctx the parse tree
	 */
	void enterCmdIf(@NotNull sintaticoParser.CmdIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticoParser#cmdIf}.
	 * @param ctx the parse tree
	 */
	void exitCmdIf(@NotNull sintaticoParser.CmdIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticoParser#cmdAtrib}.
	 * @param ctx the parse tree
	 */
	void enterCmdAtrib(@NotNull sintaticoParser.CmdAtribContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticoParser#cmdAtrib}.
	 * @param ctx the parse tree
	 */
	void exitCmdAtrib(@NotNull sintaticoParser.CmdAtribContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticoParser#decls}.
	 * @param ctx the parse tree
	 */
	void enterDecls(@NotNull sintaticoParser.DeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticoParser#decls}.
	 * @param ctx the parse tree
	 */
	void exitDecls(@NotNull sintaticoParser.DeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticoParser#tip}.
	 * @param ctx the parse tree
	 */
	void enterTip(@NotNull sintaticoParser.TipContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticoParser#tip}.
	 * @param ctx the parse tree
	 */
	void exitTip(@NotNull sintaticoParser.TipContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticoParser#cmdWrite}.
	 * @param ctx the parse tree
	 */
	void enterCmdWrite(@NotNull sintaticoParser.CmdWriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticoParser#cmdWrite}.
	 * @param ctx the parse tree
	 */
	void exitCmdWrite(@NotNull sintaticoParser.CmdWriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticoParser#listW}.
	 * @param ctx the parse tree
	 */
	void enterListW(@NotNull sintaticoParser.ListWContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticoParser#listW}.
	 * @param ctx the parse tree
	 */
	void exitListW(@NotNull sintaticoParser.ListWContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull sintaticoParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull sintaticoParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticoParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(@NotNull sintaticoParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticoParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(@NotNull sintaticoParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticoParser#declTip}.
	 * @param ctx the parse tree
	 */
	void enterDeclTip(@NotNull sintaticoParser.DeclTipContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticoParser#declTip}.
	 * @param ctx the parse tree
	 */
	void exitDeclTip(@NotNull sintaticoParser.DeclTipContext ctx);
}
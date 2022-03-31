package compiladores;
// Generated from sintatico.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link sintaticoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface sintaticoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link sintaticoParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(sintaticoParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintaticoParser#decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecls(sintaticoParser.DeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintaticoParser#listDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListDecl(sintaticoParser.ListDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintaticoParser#declTip}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclTip(sintaticoParser.DeclTipContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintaticoParser#listId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListId(sintaticoParser.ListIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintaticoParser#tip}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTip(sintaticoParser.TipContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintaticoParser#cmdComp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdComp(sintaticoParser.CmdCompContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintaticoParser#listCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListCmd(sintaticoParser.ListCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintaticoParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(sintaticoParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintaticoParser#cmdIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdIf(sintaticoParser.CmdIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintaticoParser#cmdWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdWhile(sintaticoParser.CmdWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintaticoParser#cmdRead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdRead(sintaticoParser.CmdReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintaticoParser#cmdWrite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdWrite(sintaticoParser.CmdWriteContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintaticoParser#listW}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListW(sintaticoParser.ListWContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintaticoParser#elemW}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElemW(sintaticoParser.ElemWContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintaticoParser#cmdAtrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdAtrib(sintaticoParser.CmdAtribContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintaticoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(sintaticoParser.ExprContext ctx);
}
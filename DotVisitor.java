// Generated from Dot.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DotParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DotVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DotParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(DotParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Grafo}
	 * labeled alternative in {@link DotParser#graph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrafo(DotParser.GrafoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Stc}
	 * labeled alternative in {@link DotParser#stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStc(DotParser.StcContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Nodo}
	 * labeled alternative in {@link DotParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodo(DotParser.NodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Edge}
	 * labeled alternative in {@link DotParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdge(DotParser.EdgeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Attr}
	 * labeled alternative in {@link DotParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr(DotParser.AttrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assing}
	 * labeled alternative in {@link DotParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssing(DotParser.AssingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AList}
	 * labeled alternative in {@link DotParser#attr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAList(DotParser.AListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Aarr}
	 * labeled alternative in {@link DotParser#attr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAarr(DotParser.AarrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Ass}
	 * labeled alternative in {@link DotParser#a_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAss(DotParser.AssContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Subgrafo}
	 * labeled alternative in {@link DotParser#edge_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubgrafo(DotParser.SubgrafoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NodeEdge}
	 * labeled alternative in {@link DotParser#edgeRHS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodeEdge(DotParser.NodeEdgeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NodeAttr}
	 * labeled alternative in {@link DotParser#node_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodeAttr(DotParser.NodeAttrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NodeO}
	 * labeled alternative in {@link DotParser#node_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodeO(DotParser.NodeOContext ctx);
	/**
	 * Visit a parse tree produced by {@link DotParser#port}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort(DotParser.PortContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link DotParser#subgraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(DotParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Identify}
	 * labeled alternative in {@link DotParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentify(DotParser.IdentifyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link DotParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(DotParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link DotParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(DotParser.NumberContext ctx);
}
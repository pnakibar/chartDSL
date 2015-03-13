// Generated from /home/pedronakibar/IdeaProjects/MyLang/MyLang.g4 by ANTLR 4.5
package gen;

import org.jfree.chart.ChartUtilities;
import org.jfree.chart.ChartFactory;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyLangParser}.
 */
public interface MyLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull MyLangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull MyLangParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#adddata}.
	 * @param ctx the parse tree
	 */
	void enterAdddata(@NotNull MyLangParser.AdddataContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#adddata}.
	 * @param ctx the parse tree
	 */
	void exitAdddata(@NotNull MyLangParser.AdddataContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#piedata}.
	 * @param ctx the parse tree
	 */
	void enterPiedata(@NotNull MyLangParser.PiedataContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#piedata}.
	 * @param ctx the parse tree
	 */
	void exitPiedata(@NotNull MyLangParser.PiedataContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#chartdata}.
	 * @param ctx the parse tree
	 */
	void enterChartdata(@NotNull MyLangParser.ChartdataContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#chartdata}.
	 * @param ctx the parse tree
	 */
	void exitChartdata(@NotNull MyLangParser.ChartdataContext ctx);
}
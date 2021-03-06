// Generated from /home/pedronakibar/IdeaProjects/Grafik/MyLang.g4 by ANTLR 4.5
package gen;

import org.jfree.chart.ChartUtilities;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;

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
	 * Enter a parse tree produced by {@link MyLangParser#getShowAs}.
	 * @param ctx the parse tree
	 */
	void enterGetShowAs(@NotNull MyLangParser.GetShowAsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#getShowAs}.
	 * @param ctx the parse tree
	 */
	void exitGetShowAs(@NotNull MyLangParser.GetShowAsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#showAsWindow}.
	 * @param ctx the parse tree
	 */
	void enterShowAsWindow(@NotNull MyLangParser.ShowAsWindowContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#showAsWindow}.
	 * @param ctx the parse tree
	 */
	void exitShowAsWindow(@NotNull MyLangParser.ShowAsWindowContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#showAsPNG}.
	 * @param ctx the parse tree
	 */
	void enterShowAsPNG(@NotNull MyLangParser.ShowAsPNGContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#showAsPNG}.
	 * @param ctx the parse tree
	 */
	void exitShowAsPNG(@NotNull MyLangParser.ShowAsPNGContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#showAsJPEG}.
	 * @param ctx the parse tree
	 */
	void enterShowAsJPEG(@NotNull MyLangParser.ShowAsJPEGContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#showAsJPEG}.
	 * @param ctx the parse tree
	 */
	void exitShowAsJPEG(@NotNull MyLangParser.ShowAsJPEGContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#getname}.
	 * @param ctx the parse tree
	 */
	void enterGetname(@NotNull MyLangParser.GetnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#getname}.
	 * @param ctx the parse tree
	 */
	void exitGetname(@NotNull MyLangParser.GetnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#getdata}.
	 * @param ctx the parse tree
	 */
	void enterGetdata(@NotNull MyLangParser.GetdataContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#getdata}.
	 * @param ctx the parse tree
	 */
	void exitGetdata(@NotNull MyLangParser.GetdataContext ctx);
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
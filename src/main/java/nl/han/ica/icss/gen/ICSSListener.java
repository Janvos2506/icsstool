// Generated from C:/Users/Jan/Desktop/startcode/src/main/antlr4/nl/han/ica/icss/parser\ICSS.g4 by ANTLR 4.7
package nl.han.ica.icss.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ICSSParser}.
 */
public interface ICSSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ICSSParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void enterStylesheet(ICSSParser.StylesheetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void exitStylesheet(ICSSParser.StylesheetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(ICSSParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(ICSSParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#idselector}.
	 * @param ctx the parse tree
	 */
	void enterIdselector(ICSSParser.IdselectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#idselector}.
	 * @param ctx the parse tree
	 */
	void exitIdselector(ICSSParser.IdselectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#classselector}.
	 * @param ctx the parse tree
	 */
	void enterClassselector(ICSSParser.ClassselectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#classselector}.
	 * @param ctx the parse tree
	 */
	void exitClassselector(ICSSParser.ClassselectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#htmltag}.
	 * @param ctx the parse tree
	 */
	void enterHtmltag(ICSSParser.HtmltagContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#htmltag}.
	 * @param ctx the parse tree
	 */
	void exitHtmltag(ICSSParser.HtmltagContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ICSSParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ICSSParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#styleblock}.
	 * @param ctx the parse tree
	 */
	void enterStyleblock(ICSSParser.StyleblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#styleblock}.
	 * @param ctx the parse tree
	 */
	void exitStyleblock(ICSSParser.StyleblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#stylerule}.
	 * @param ctx the parse tree
	 */
	void enterStylerule(ICSSParser.StyleruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#stylerule}.
	 * @param ctx the parse tree
	 */
	void exitStylerule(ICSSParser.StyleruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#statementid}.
	 * @param ctx the parse tree
	 */
	void enterStatementid(ICSSParser.StatementidContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#statementid}.
	 * @param ctx the parse tree
	 */
	void exitStatementid(ICSSParser.StatementidContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#statementvalue}.
	 * @param ctx the parse tree
	 */
	void enterStatementvalue(ICSSParser.StatementvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#statementvalue}.
	 * @param ctx the parse tree
	 */
	void exitStatementvalue(ICSSParser.StatementvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#hex}.
	 * @param ctx the parse tree
	 */
	void enterHex(ICSSParser.HexContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#hex}.
	 * @param ctx the parse tree
	 */
	void exitHex(ICSSParser.HexContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#size}.
	 * @param ctx the parse tree
	 */
	void enterSize(ICSSParser.SizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#size}.
	 * @param ctx the parse tree
	 */
	void exitSize(ICSSParser.SizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(ICSSParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(ICSSParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(ICSSParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(ICSSParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#logicoperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicoperator(ICSSParser.LogicoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#logicoperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicoperator(ICSSParser.LogicoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#optional}.
	 * @param ctx the parse tree
	 */
	void enterOptional(ICSSParser.OptionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#optional}.
	 * @param ctx the parse tree
	 */
	void exitOptional(ICSSParser.OptionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(ICSSParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(ICSSParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(ICSSParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(ICSSParser.OperationContext ctx);
}
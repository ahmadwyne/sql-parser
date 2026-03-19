// Generated from CreateTableSQL.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CreateTableSQLParser}.
 */
public interface CreateTableSQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CreateTableSQLParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(CreateTableSQLParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableSQLParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(CreateTableSQLParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableSQLParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(CreateTableSQLParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableSQLParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(CreateTableSQLParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableSQLParser#columnDefList}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefList(CreateTableSQLParser.ColumnDefListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableSQLParser#columnDefList}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefList(CreateTableSQLParser.ColumnDefListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableSQLParser#columnDef}.
	 * @param ctx the parse tree
	 */
	void enterColumnDef(CreateTableSQLParser.ColumnDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableSQLParser#columnDef}.
	 * @param ctx the parse tree
	 */
	void exitColumnDef(CreateTableSQLParser.ColumnDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableSQLParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(CreateTableSQLParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableSQLParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(CreateTableSQLParser.ColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableSQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(CreateTableSQLParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableSQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(CreateTableSQLParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableSQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterColumnConstraint(CreateTableSQLParser.ColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableSQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitColumnConstraint(CreateTableSQLParser.ColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableSQLParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void enterTableConstraint(CreateTableSQLParser.TableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableSQLParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void exitTableConstraint(CreateTableSQLParser.TableConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableSQLParser#columnNameList}.
	 * @param ctx the parse tree
	 */
	void enterColumnNameList(CreateTableSQLParser.ColumnNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableSQLParser#columnNameList}.
	 * @param ctx the parse tree
	 */
	void exitColumnNameList(CreateTableSQLParser.ColumnNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableSQLParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(CreateTableSQLParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableSQLParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(CreateTableSQLParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableSQLParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(CreateTableSQLParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableSQLParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(CreateTableSQLParser.DefaultValueContext ctx);
}
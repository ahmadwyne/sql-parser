// Generated from CreateTableSQL.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CreateTableSQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CreateTableSQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CreateTableSQLParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(CreateTableSQLParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableSQLParser#createTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(CreateTableSQLParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableSQLParser#columnDefList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDefList(CreateTableSQLParser.ColumnDefListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableSQLParser#columnDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDef(CreateTableSQLParser.ColumnDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableSQLParser#columnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(CreateTableSQLParser.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableSQLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(CreateTableSQLParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableSQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnConstraint(CreateTableSQLParser.ColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableSQLParser#tableConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableConstraint(CreateTableSQLParser.TableConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableSQLParser#columnNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnNameList(CreateTableSQLParser.ColumnNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableSQLParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(CreateTableSQLParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableSQLParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(CreateTableSQLParser.DefaultValueContext ctx);
}
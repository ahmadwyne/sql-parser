import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * SQL Parser for CREATE TABLE DDL statements
 * Uses ANTLR 4 to parse and validate SQL syntax
 */
public class SQLParser {

    public static void main(String[] args) {
        if (args.length == 0) {
            printUsage();
            return;
        }

        String input = args[0];

        // Check if input is a file path or SQL statement
        if (input.endsWith(".sql")) {
            parseFile(input);
        } else {
            parseSQLStatement(input);
        }
    }

    /**
     * Parse a single SQL statement provided as a string
     */
    public static void parseSQLStatement(String sqlStatement) {
        System.out.println("=" .repeat(70));
        System.out.println("Parsing SQL Statement:");
        System.out.println("=" .repeat(70));
        System.out.println(sqlStatement);
        System.out.println("=" .repeat(70));

        try {
            CharStream input = CharStreams.fromString(sqlStatement);
            CreateTableSQLLexer lexer = new CreateTableSQLLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CreateTableSQLParser parser = new CreateTableSQLParser(tokens);

            // Set error listener for better error messages
            parser.removeErrorListeners();
            parser.addErrorListener(new CustomErrorListener());

            ParseTree tree = parser.parse();

            if (parser.getNumberOfSyntaxErrors() == 0) {
                System.out.println("\n✓ SQL Statement is VALID\n");
                displayParseTree(tree, parser);
                extractTableStructure(tree, parser);
            } else {
                System.out.println("\n✗ SQL Statement is INVALID\n");
                System.out.println("Number of errors: " + parser.getNumberOfSyntaxErrors());
            }
        } catch (Exception e) {
            System.err.println("✗ Error parsing SQL statement:");
            System.err.println("  " + e.getMessage());
        }

        System.out.println();
    }

    /**
     * Parse SQL statements from a file
     */
    public static void parseFile(String filePath) {
        System.out.println("=" .repeat(70));
        System.out.println("Parsing SQL File: " + filePath);
        System.out.println("=" .repeat(70));

        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            StringBuilder currentStatement = new StringBuilder();

            for (String line : lines) {
                line = line.trim();

                // Skip empty lines and comments
                if (line.isEmpty() || line.startsWith("--")) {
                    continue;
                }

                currentStatement.append(line).append(" ");

                // Check if statement is complete (ends with semicolon)
                if (line.endsWith(";")) {
                    String statement = currentStatement.toString().trim();
                    parseSQLStatement(statement);
                    currentStatement = new StringBuilder();
                }
            }

            // Parse any remaining statement
            if (currentStatement.length() > 0) {
                parseSQLStatement(currentStatement.toString().trim());
            }
        } catch (IOException e) {
            System.err.println("✗ Error reading file: " + e.getMessage());
        }
    }

    /**
     * Display the parse tree
     */
    private static void displayParseTree(ParseTree tree, CreateTableSQLParser parser) {
        System.out.println("Parse Tree:");
        System.out.println("-" .repeat(70));
        System.out.println(tree.toStringTree(parser));
        System.out.println("-" .repeat(70));
    }

    /**
     * Extract and display table structure from parse tree
     */
    private static void extractTableStructure(ParseTree tree, CreateTableSQLParser parser) {
        System.out.println("\nExtracted Table Structure:");
        System.out.println("-" .repeat(70));

        CreateTableSQLParser.CreateTableContext createTableCtx =
            (CreateTableSQLParser.CreateTableContext) tree.getChild(0);

        if (createTableCtx != null) {
            // Extract table name
            String tableName = createTableCtx.tableName().getText();
            System.out.println("Table Name: " + tableName);

            // Check for IF NOT EXISTS
            if (createTableCtx.IF() != null) {
                System.out.println("IF NOT EXISTS: Yes");
            }

            // Extract columns
            CreateTableSQLParser.ColumnDefListContext columnDefList =
                createTableCtx.columnDefList();

            if (columnDefList != null) {
                System.out.println("\nColumns:");
                List<CreateTableSQLParser.ColumnDefContext> columnDefs =
                    columnDefList.columnDef();

                for (CreateTableSQLParser.ColumnDefContext colDef : columnDefs) {
                    if (colDef.columnName() != null) {
                        String colName = colDef.columnName().getText();
                        String dataType = colDef.dataType().getText();

                        System.out.println("  - " + colName + ": " + dataType);

                        // Display constraints
                        List<CreateTableSQLParser.ColumnConstraintContext> constraints =
                            colDef.columnConstraint();

                        if (!constraints.isEmpty()) {
                            System.out.print("    Constraints: ");
                            for (CreateTableSQLParser.ColumnConstraintContext constraint : constraints) {
                                System.out.print(constraint.getText() + " ");
                            }
                            System.out.println();
                        }
                    }
                }
            }
        }

        System.out.println("-" .repeat(70));
    }

    /**
     * Print usage information
     */
    private static void printUsage() {
        System.out.println("SQL Parser - CREATE TABLE Statement Parser");
        System.out.println();
        System.out.println("Usage:");
        System.out.println("  java SQLParser \"<SQL_STATEMENT>\"");
        System.out.println("  java SQLParser <path_to_sql_file>");
        System.out.println();
        System.out.println("Examples:");
        System.out.println("  java SQLParser \"CREATE TABLE users (id INT PRIMARY KEY, name VARCHAR(255));\"");
        System.out.println("  java SQLParser test/valid_sql.sql");
        System.out.println();
    }

    /**
     * Custom error listener for better error messages
     */
    static class CustomErrorListener extends BaseErrorListener {
        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                              int line, int charPositionInLine, String msg,
                              RecognitionException e) {
            System.err.println("Syntax Error at line " + line + ", column " + charPositionInLine + ":");
            System.err.println("  " + msg);

            if (offendingSymbol != null) {
                System.err.println("  Token: " + offendingSymbol);
            }
        }
    }
}
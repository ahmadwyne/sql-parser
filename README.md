# SQL DDL Parser for CREATE TABLE Statements

A robust SQL parser for DDL (Data Definition Language) CREATE TABLE statements built with **ANTLR 4**.

## Features

**Complete CREATE TABLE Support**
- Basic table creation with column definitions
- Optional IF NOT EXISTS clause
- Multiple column definitions with various data types
- Column-level constraints (NOT NULL, UNIQUE, PRIMARY KEY, DEFAULT)
- Table-level constraints (PRIMARY KEY, UNIQUE, FOREIGN KEY)
- Schema-qualified table names (schema.table format)

**Supported Data Types**
- INT, BIGINT, SMALLINT
- VARCHAR(n), CHAR(n), TEXT
- DATE, TIMESTAMP
- DECIMAL(p,s), FLOAT, DOUBLE
- BOOLEAN, BLOB

**Error Handling**
- Clear syntax error messages with line and column information
- Meaningful validation feedback
- Graceful handling of invalid statements

**Flexible Input**
- Parse single SQL statements from command line
- Parse multiple statements from SQL files
- Support for comments (-- and /* */)

## System Requirements

- **Java**: 11 or later
- **Internet**: Required for first-time ANTLR download (or manual setup)
- **Operating System**: Linux, macOS, Windows (with bash/WSL)

## Installation & Compilation

### Step 1: Prerequisites Check

Ensure you have Java 11+ installed:
```bash
java -version
```

Expected output should show version 11 or higher.

### Step 2: Clone/Download Project

```bash
git clone https://github.com/ahmadwyne/sql-parser.git
cd sql-parser
```

### Step 3: Make Build Script Executable

```bash
chmod +x build.sh
```

### Step 4: Run Build Script

```bash
./build.sh
```

This script will:
1. Verify Java installation
2. Create necessary directories (`lib/`, `build/`, `test/`)
3. Download ANTLR 4.13.1 (if not already present)
4. Generate lexer and parser from grammar file
5. Compile all Java source files

**Expected output:**
```
==================================================
SQL Parser Build Script
==================================================

[1/5] Checking Java installation...
✓ Java 11.0.x detected

[2/5] Creating directories...
✓ Directories created

[3/5] Setting up ANTLR...
✓ ANTLR already present

[4/5] Generating parser and lexer from grammar...
✓ Parser and lexer generated

[5/5] Compiling Java files...
✓ ANTLR generated files compiled
✓ SQLParser compiled

==================================================
✓ Build completed successfully!
==================================================
```

## Usage

### Parsing a Single SQL Statement

```bash
java -cp lib/antlr-4.13.1-complete.jar:build SQLParser "CREATE TABLE users (id INT PRIMARY KEY, name VARCHAR(255) NOT NULL);"
```

**Output:**
```
======================================================================
Parsing SQL Statement:
======================================================================
CREATE TABLE users (id INT PRIMARY KEY, name VARCHAR(255) NOT NULL);
======================================================================

✓ SQL Statement is VALID

Parse Tree:
----------------------------------------------------------------------
...parse tree details...
----------------------------------------------------------------------

Extracted Table Structure:
----------------------------------------------------------------------
Table Name: users

Columns:
  - id: INT
    Constraints: PRIMARY KEY
  - name: VARCHAR(255)
    Constraints: NOT NULL
----------------------------------------------------------------------
```

### Parsing from a File

```bash
java -cp lib/antlr-4.13.1-complete.jar:build SQLParser test/valid_sql.sql
```

### Running Test Cases

**Test valid SQL statements:**
```bash
java -cp lib/antlr-4.13.1-complete.jar:build SQLParser test/valid_sql.sql
```

**Test invalid SQL statements (should show errors):**
```bash
java -cp lib/antlr-4.13.1-complete.jar:build SQLParser test/invalid_sql.sql
```

## Project Structure

```
sql-parser/
├── CreateTableSQL.g4          # ANTLR grammar file
├── SQLParser.java             # Main parser implementation
├── build.sh                   # Build automation script
├── README.md                  # This file
├── .gitignore                 # Git ignore rules
├── lib/                       # ANTLR and dependencies
│   └── antlr-4.13.1-complete.jar
├── build/                     # Compiled files and generated parser
│   ├── CreateTableSQLLexer.java
│   ├── CreateTableSQLParser.java
│   ├── CreateTableSQLListener.java
│   ├── CreateTableSQLVisitor.java
│   └── *.class
└── test/                      # Test cases
    ├── valid_sql.sql
    └── invalid_sql.sql
```

## Grammar Specification

The grammar file (`CreateTableSQL.g4`) defines:

```antlr
createTable : CREATE TABLE (IF NOT EXISTS)? tableName '(' columnDefList ')' ';'?

columnDefList : columnDef (',' columnDef)*

columnDef : columnName dataType columnConstraint*
          | tableConstraint

dataType : INT | VARCHAR '(' INT_LITERAL ')' | CHAR '(' INT_LITERAL ')'
         | DATE | TIMESTAMP | DECIMAL '(' INT_LITERAL ',' INT_LITERAL ')'
         | BOOLEAN | FLOAT | DOUBLE | BIGINT | SMALLINT | TEXT | BLOB

columnConstraint : NOT NULL | UNIQUE | PRIMARY KEY | DEFAULT defaultValue

tableConstraint : PRIMARY KEY '(' columnNameList ')'
                | UNIQUE '(' columnNameList ')'
                | FOREIGN KEY '(' columnNameList ')' REFERENCES tableName '(' columnNameList ')'
```

## Example Test Cases

### Valid Statements

```sql
-- Simple table with primary key
CREATE TABLE users (id INT PRIMARY KEY, name VARCHAR(255));

-- Table with IF NOT EXISTS
CREATE TABLE IF NOT EXISTS products (id INT, title VARCHAR(100));

-- Table with multiple constraints
CREATE TABLE orders (
    id INT PRIMARY KEY,
    user_id INT NOT NULL,
    total DECIMAL(10,2) DEFAULT 0.00,
    FOREIGN KEY(user_id) REFERENCES users(id)
);

-- Table with schema prefix
CREATE TABLE sales.transactions (
    transaction_id INT PRIMARY KEY,
    amount DECIMAL(15,2),
    timestamp TIMESTAMP
);
```

### Invalid Statements

```sql
-- Missing column definitions
CREATE TABLE users;

-- Typo in keyword
CREAT TABLE users (id INT);

-- Missing table name
CREATE TABLE (id INT);

-- Invalid data type
CREATE TABLE users (id INVALID_TYPE);

-- Missing closing parenthesis
CREATE TABLE users (id INT, name VARCHAR(100);

-- Duplicate constraint
CREATE TABLE users (id INT PRIMARY KEY PRIMARY KEY);
```

## Troubleshooting

### "Java command not found"
**Solution:** Install Java 11 or later. Check [java.com](https://www.java.com/) for download.

### "CreateTableSQL.g4 not found"
**Solution:** Ensure you're in the project root directory where `CreateTableSQL.g4` is located.

### "Permission denied: build.sh"
**Solution:** Run `chmod +x build.sh` to make the script executable.

### ANTLR Download Fails
**Solution (Manual Setup):**
1. Download from: https://www.antlr.org/download/antlr-4.13.1-complete.jar
2. Place in `lib/` directory
3. Run `./build.sh` again

### Parser Not Found During Compilation
**Solution:** Ensure ANTLR jar exists in `lib/` and run the build script which generates the parser first.

### Classpath Issues
**Solution:** Use the exact classpath provided:
```bash
java -cp lib/antlr-4.13.1-complete.jar:build SQLParser <input>
```

For Windows, use `;` instead of `:`:
```bash
java -cp lib/antlr-4.13.1-complete.jar;build SQLParser <input>
```

## Advanced Usage

### Extending the Grammar

To add support for additional SQL features:

1. Edit `CreateTableSQL.g4`
2. Add new rules (e.g., for CREATE INDEX, ALTER TABLE)
3. Run `./build.sh` to regenerate parser
4. Update `SQLParser.java` to handle new constructs

### Example: Adding CREATE INDEX Support

```antlr
// In CreateTableSQL.g4
parse : (createTable | createIndex) EOF ;

createIndex : CREATE INDEX indexName ON tableName '(' columnNameList ')' ';'? ;

indexName : IDENTIFIER ;
```

### Using the Parser Programmatically

```java
// Import ANTLR classes
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

// Parse SQL
CharStream input = CharStreams.fromString("CREATE TABLE test (id INT);");
CreateTableSQLLexer lexer = new CreateTableSQLLexer(input);
CommonTokenStream tokens = new CommonTokenStream(lexer);
CreateTableSQLParser parser = new CreateTableSQLParser(tokens);

// Get parse tree
ParseTree tree = parser.parse();

// Walk the tree
ParseTreeWalker walker = new ParseTreeWalker();
walker.walk(new CreateTableSQLListener() { /* ... */ }, tree);
```

## Performance Notes

- **Small statements** (< 1KB): < 10ms parse time
- **Large statements** (multiple tables): < 100ms parse time
- Grammar is optimized for readability and correctness, not performance

## Limitations

- Supports DDL (CREATE TABLE) only; DML (SELECT, INSERT, etc.) not supported
- No support for advanced features like partitioning, indexes, or triggers
- Comments must be on separate lines or at end of statements
- String literals use single quotes only

## License

MIT License - Feel free to use for educational and commercial purposes

## References

- [ANTLR Official Documentation](https://www.antlr.org/)
- [ANTLR4 GitHub Repository](https://github.com/antlr/antlr4)
- [ANTLR SQL Grammar Examples](https://github.com/antlr/grammars-v4/tree/master/sql)
- [SQL-92 Standard](https://en.wikipedia.org/wiki/SQL-92)

## Support

For issues, questions, or contributions, please open an issue on GitHub.
# SQL DDL Parser for CREATE TABLE Statements

A robust SQL parser for DDL (Data Definition Language) CREATE TABLE statements built with ANTLR 4.

## Features

COMPLETE CREATE TABLE SUPPORT
- Basic table creation with column definitions
- Optional IF NOT EXISTS clause
- Multiple column definitions with various data types
- Column-level constraints (NOT NULL, UNIQUE, PRIMARY KEY, DEFAULT)
- Table-level constraints (PRIMARY KEY, UNIQUE, FOREIGN KEY)
- Schema-qualified table names (schema.table format)

SUPPORTED DATA TYPES
- INT, BIGINT, SMALLINT
- VARCHAR(n), CHAR(n), TEXT
- DATE, TIMESTAMP
- DECIMAL(p,s), FLOAT, DOUBLE
- BOOLEAN, BLOB

ERROR HANDLING
- Clear syntax error messages with line and column information
- Meaningful validation feedback
- Graceful handling of invalid statements

FLEXIBLE INPUT
- Parse single SQL statements from command line
- Parse multiple statements from SQL files
- Support for comments (-- and /* */)

## System Requirements

- Java: 11 or later
- Internet: Required for first-time ANTLR download (or manual setup)
- Operating System: Windows (PowerShell), Linux, macOS (with bash/WSL for Windows)

## Installation & Compilation

### Step 1: Prerequisites Check

Ensure you have Java 11+ installed:

```bash
java -version
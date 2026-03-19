@echo off
setlocal enabledelayedexpansion

echo ==================================================
echo SQL Parser Build Script for Windows
echo ==================================================
echo.

REM Check for Java
echo [1/5] Checking Java installation...
java -version >nul 2>&1
if errorlevel 1 (
    echo Error: Java is not installed
    echo Please install Java 11 or later
    exit /b 1
)

for /f tokens^=2 %%i in ('java -version 2^>^&1 ^| findstr /R "version"') do (
    set "JAVA_VERSION=%%i"
)
echo Success: Java found - %JAVA_VERSION%
echo.

REM Create directories
echo [2/5] Creating directories...
if not exist "lib" mkdir lib
if not exist "build" mkdir build
if not exist "test" mkdir test
echo Success: Directories created
echo.

REM Download ANTLR if not present
echo [3/5] Setting up ANTLR...
if not exist "lib\antlr-4.13.1-complete.jar" (
    echo Downloading ANTLR 4.13.1...
    powershell -Command "(New-Object System.Net.ServicePointManager).SecurityProtocol = [System.Net.ServicePointManager]::SecurityProtocol -bor 3072; (New-Object System.Net.WebClient).DownloadFile('https://www.antlr.org/download/antlr-4.13.1-complete.jar', 'lib\antlr-4.13.1-complete.jar')"
    if errorlevel 1 (
        echo Error: Failed to download ANTLR
        exit /b 1
    )
    echo Success: ANTLR downloaded
) else (
    echo Success: ANTLR already present
)
echo.

REM Check if grammar file exists
if not exist "CreateTableSQL.g4" (
    echo Error: CreateTableSQL.g4 not found
    exit /b 1
)

REM Generate parser and lexer
echo [4/5] Generating parser and lexer from grammar...
java -jar lib\antlr-4.13.1-complete.jar CreateTableSQL.g4 -visitor -listener -o build
if errorlevel 1 (
    echo Error: Failed to generate parser and lexer
    exit /b 1
)
echo Success: Parser and lexer generated
echo.

REM Compile Java files
echo [5/5] Compiling Java files...
javac -cp "lib\antlr-4.13.1-complete.jar;.\build" -d build build\CreateTableSQL*.java
if errorlevel 1 (
    echo Error: Failed to compile ANTLR files
    exit /b 1
)
echo Success: ANTLR generated files compiled

javac -cp "lib\antlr-4.13.1-complete.jar;.\build" -d build SQLParser.java
if errorlevel 1 (
    echo Error: Failed to compile SQLParser
    exit /b 1
)
echo Success: SQLParser compiled
echo.

echo ==================================================
echo Success: Build completed successfully!
echo ==================================================
echo.
echo Next steps:
echo 1. Run a single SQL statement:
echo    java -cp "lib\antlr-4.13.1-complete.jar;.\build" SQLParser "CREATE TABLE users (id INT PRIMARY KEY);"
echo.
echo 2. Parse a file:
echo    java -cp "lib\antlr-4.13.1-complete.jar;.\build" SQLParser test\valid_sql.sql
echo.
echo 3. More examples:
echo    java -cp "lib\antlr-4.13.1-complete.jar;.\build" SQLParser "CREATE TABLE IF NOT EXISTS products (id INT, price DECIMAL(10,2));"
echo    java -cp "lib\antlr-4.13.1-complete.jar;.\build" SQLParser test\invalid_sql.sql
echo.
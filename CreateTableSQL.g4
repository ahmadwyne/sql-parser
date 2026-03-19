grammar CreateTableSQL;

// Main parsing rule
parse : createTable EOF ;

createTable
    : CREATE TABLE (IF NOT EXISTS)? tableName '(' columnDefList ')' ';'?
    ;

columnDefList
    : columnDef (',' columnDef)*
    ;

columnDef
    : columnName dataType columnConstraint*
    | tableConstraint
    ;

columnName
    : IDENTIFIER
    ;

dataType
    : INT
    | VARCHAR '(' INT_LITERAL ')'
    | CHAR '(' INT_LITERAL ')'
    | DATE
    | TIMESTAMP
    | DECIMAL '(' INT_LITERAL ',' INT_LITERAL ')'
    | BOOLEAN
    | FLOAT
    | DOUBLE
    | BIGINT
    | SMALLINT
    | TEXT
    | BLOB
    ;

columnConstraint
    : NOT NULL
    | UNIQUE
    | PRIMARY KEY
    | DEFAULT defaultValue
    ;

tableConstraint
    : PRIMARY KEY '(' columnNameList ')'
    | UNIQUE '(' columnNameList ')'
    | FOREIGN KEY '(' columnNameList ')' REFERENCES tableName '(' columnNameList ')'
    ;

columnNameList
    : IDENTIFIER (',' IDENTIFIER)*
    ;

tableName
    : (IDENTIFIER '.')? IDENTIFIER
    ;

defaultValue
    : INT_LITERAL
    | STRING_LITERAL
    | BOOLEAN_LITERAL
    | NULL
    ;

// Keywords
CREATE      : 'CREATE' | 'create' ;
TABLE       : 'TABLE' | 'table' ;
IF          : 'IF' | 'if' ;
NOT         : 'NOT' | 'not' ;
EXISTS      : 'EXISTS' | 'exists' ;
NULL        : 'NULL' | 'null' ;
UNIQUE      : 'UNIQUE' | 'unique' ;
PRIMARY     : 'PRIMARY' | 'primary' ;
KEY         : 'KEY' | 'key' ;
FOREIGN     : 'FOREIGN' | 'foreign' ;
REFERENCES  : 'REFERENCES' | 'references' ;
DEFAULT     : 'DEFAULT' | 'default' ;

// Data Types
INT         : 'INT' | 'int' ;
VARCHAR     : 'VARCHAR' | 'varchar' ;
CHAR        : 'CHAR' | 'char' ;
DATE        : 'DATE' | 'date' ;
TIMESTAMP   : 'TIMESTAMP' | 'timestamp' ;
DECIMAL     : 'DECIMAL' | 'decimal' ;
BOOLEAN     : 'BOOLEAN' | 'boolean' ;
FLOAT       : 'FLOAT' | 'float' ;
DOUBLE      : 'DOUBLE' | 'double' ;
BIGINT      : 'BIGINT' | 'bigint' ;
SMALLINT    : 'SMALLINT' | 'smallint' ;
TEXT        : 'TEXT' | 'text' ;
BLOB        : 'BLOB' | 'blob' ;

// Literals and Identifiers
IDENTIFIER
    : [a-zA-Z_][a-zA-Z_0-9]*
    ;

INT_LITERAL
    : [0-9]+
    ;

STRING_LITERAL
    : '\'' (~['\r\n])* '\''
    ;

BOOLEAN_LITERAL
    : 'TRUE' | 'FALSE' | 'true' | 'false'
    ;

// Whitespace
WS
    : [ \t\r\n]+ -> skip
    ;

// Comments
LINE_COMMENT
    : '--' ~[\r\n]* -> skip
    ;

BLOCK_COMMENT
    : '/*' .*? '*/' -> skip
    ;
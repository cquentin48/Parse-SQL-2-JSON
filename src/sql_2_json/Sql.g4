grammar Sql;

whole_query: query;

query: SELECT SPACE* select_stmt SPACE* FROM SPACE* from_stmt;

select_stmt:	
	(table_column_name COMMA SPACE*)* table_column_name
	| every_columns;

from_stmt: no_join_table | inner_join_table | natural_join_stmt;

no_join_table: (table_name COMMA SPACE*)* table_name;

inner_join_table: table_name SPACE* inner_join_type SPACE* table_name
	SPACE* ON SPACE* inner_join_eq;
inner_join_type: INNER_JOIN | LEFT_JOIN | RIGHT_JOIN;
inner_join_eq : table_column_name SPACE* EQ table_column_name;

natural_join_stmt: table_name SPACE* NATURAL_JOIN SPACE* table_name;

every_columns: STAR;

NUMBER: [0-9]+ (POINT [0-9]+)*;

SELECT: 'select' | 'SELECT';
FROM: 'from' | 'FROM';
WHERE: 'where' | 'WHERE';
IN: 'in' | 'IN';
ON: 'on' | 'ON';
NOT: 'not' | 'NOT';
EXCEPT: 'except' | 'EXCEPT';
EQ: '=';

INNER_JOIN: 'inner join' | 'INNER JOIN';
LEFT_JOIN: 'left join' | 'LEFT JOIN';
RIGHT_JOIN: 'right join' | 'RIGHT JOIN';
NATURAL_JOIN: 'natural join' | 'NATURAL JOIN';

table_column_name: 
	STRING |
	DOUBLE_QUOTATION_MARK STRING DOUBLE_QUOTATION_MARK |
	SINGLE_QUOTATION_MARK STRING SINGLE_QUOTATION_MARK;

table_name: 
	STRING |
	DOUBLE_QUOTATION_MARK STRING DOUBLE_QUOTATION_MARK |
	SINGLE_QUOTATION_MARK STRING SINGLE_QUOTATION_MARK;

DOUBLE_QUOTATION_MARK: '"';
SINGLE_QUOTATION_MARK: '\'';

COMMA: ',';
SEMICOLON: ';';
POINT: '.';
STAR: '*';
GREATER: '>';
GEQ: '>=';
LOWER: '<';
LEQ: '<=';

LETTER: [a-zA-Z];
DIGIT: [0-9];
SPACE: [\t\r\n ] -> skip;

STRING: [a-zA-Z0-9_]+;
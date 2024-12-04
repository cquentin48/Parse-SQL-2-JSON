grammar Sql;

whole_query: query SPACE* SEMICOLON;

query: SELECT SPACE* select_stmt SPACE* FROM SPACE* from_stmt SPACE* where_stmt?;

select_stmt:	
	(table_column_name COMMA SPACE*)* table_column_name
	| every_columns;
every_columns: STAR;

from_stmt: no_join_table | inner_join_table | natural_join_stmt;
no_join_table: (table_name COMMA SPACE*)* table_name;
inner_join_table: table_name SPACE* inner_join_type SPACE* table_name
	SPACE* ON SPACE* inner_join_eq;
inner_join_type: INNER_JOIN | LEFT_JOIN | RIGHT_JOIN | FULL_OUTER_JOIN;
inner_join_eq : table_column_name SPACE* EQ table_column_name;
natural_join_stmt: table_name SPACE* NATURAL_JOIN SPACE* table_name;

where_stmt: WHERE SPACE* where_condition;
where_condition: where_simple_condition | where_between_condition | where_like_condition ;

where_simple_condition: table_column_name eq_type obj_type;
where_between_condition: table_column_name BETWEEN obj_type AND obj_type;
where_like_condition: table_column_name LIKE TEXT | table_column_name NOT LIKE TEXT;

eq_type : EQ | GREATER | LOWER | GEQ | LEQ | DIFFERENT;
obj_type : (QUOTED_DATE | TEXT | NUMBER);

QUOTED_DATE: (SINGLE_QUOTATION_MARK | DOUBLE_QUOTATION_MARK) DATE (SINGLE_QUOTATION_MARK| DOUBLE_QUOTATION_MARK);
DATE: YEAR+ SLASH MONTH+ SLASH DAY+;
fragment YEAR: DIGIT DIGIT DIGIT DIGIT;
fragment MONTH: '0'[1-9] | '1'[0-2];
fragment DAY: '0'[1-9] | [12][0-9] | '3'[01];

SELECT: 'select' | 'SELECT';
FROM: 'from' | 'FROM';
WHERE: 'where' | 'WHERE';
IN: 'in' | 'IN';
ON: 'on' | 'ON';
NOT: 'not' | 'NOT';
EXCEPT: 'except' | 'EXCEPT';
EQ: '=';
DIFFERENT: '!=';

INNER_JOIN: 'inner join' | 'INNER JOIN';
LEFT_JOIN: 'left join' | 'LEFT JOIN';
RIGHT_JOIN: 'right join' | 'RIGHT JOIN';
NATURAL_JOIN: 'natural join' | 'NATURAL JOIN';
FULL_OUTER_JOIN: 'full outer join' | 'FULL OUTER JOIN';

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

NUMBER: '-'? DIGIT+ DECIMAL_PART?;

DECIMAL_PART: POINT DIGIT+;

COMMA: ',';
SEMICOLON: ';';
POINT: '.';
STAR: '*';
GREATER: '>';
GEQ: '>=';
LOWER: '<';
LEQ: '<=';
SLASH: '/';
OPAR: '(';
CPAR: ')';
BETWEEN: 'BETWEEN' | 'between';
AND: 'AND' | 'and';
LIKE: 'like' | 'LIKE';

LETTER: [a-zA-Z];
DIGIT: [0-9];
TEXT:
	SINGLE_QUOTATION_MARK (.~('"'))*? SINGLE_QUOTATION_MARK
	| DOUBLE_QUOTATION_MARK (.~('"'))*? DOUBLE_QUOTATION_MARK;
STRING: [a-zA-Z0-9_]+;

SPACE: [ \t\r\n]+ -> skip;
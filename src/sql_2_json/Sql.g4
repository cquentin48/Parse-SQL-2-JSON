grammar Sql;

whole_query: query;

query: select_stmt*;

select_stmt:
	SELECT SPACE* (
		((table_column_name COMMA SPACE*)* table_column_name*)
	    | everything
	);

everything: STAR;

NUMBER: [0-9]+ (POINT [0-9]+)*;

SELECT: ('select' | 'SELECT');
FROM: ('from' | 'FROM');
WHERE: ('where' | 'WHERE');
IN: ('in' | 'IN');
NOT: ('not' | 'NOT');
EXCEPT: ('except' | 'EXCEPT');

table_column_name: STRING;

QUOTATION_MARK: '"';
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
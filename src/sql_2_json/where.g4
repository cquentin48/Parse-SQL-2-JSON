grammar where;

import tokens;

where_stmt:
	WHERE SPACE* (where_condition | where_and_condition);
where_and_condition:
	OPAR where_condition SPACE* AND SPACE* (where_condition | where_and_condition) CPAR
	| where_condition SPACE* AND SPACE* (where_condition | where_and_condition);

where_condition:
	where_simple_condition
	| where_between_condition
	| where_like_condition
	| where_function_condition
	| where_in_condition;

where_simple_condition: table_column_name eq_type obj_type;
where_between_condition:
	table_column_name BETWEEN obj_type AND obj_type;
where_like_condition:
	table_column_name LIKE TEXT
	| table_column_name NOT LIKE TEXT;
where_function_condition: function_name OPAR argument_list CPAR;
where_in_condition:
	table_column_name SPACE* IN SPACE* OPAR argument_list CPAR;

function_name: STRING POINT STRING | STRING;
argument_list: (QUOTED_DATE | TEXT | NUMBER | table_column_name) COMMA argument_list
	| (QUOTED_DATE | TEXT | NUMBER | table_column_name);

eq_type: EQ | GREATER | LOWER | GEQ | LEQ | DIFFERENT;
obj_type: (QUOTED_DATE | TEXT | NUMBER);
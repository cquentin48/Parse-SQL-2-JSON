grammar where;

import tokens;

where_stmt:
	WHERE SPACE* (where_condition | where_and_or_condition);
where_and_or_condition:
	where_condition and_or_operators where_condition #end_of_where_and_or
	| OPAR where_condition CPAR and_or_operators OPAR where_and_or_condition CPAR #right_and_or
	| OPAR where_and_or_condition CPAR and_or_operators OPAR where_condition CPAR #left_and_or
	| OPAR where_and_or_condition CPAR and_or_operators OPAR where_and_or_condition CPAR #double_and_or;
and_or_operators : AND | OR;

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
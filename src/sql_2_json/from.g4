grammar from;

import tokens;

from_stmt: no_join_table | inner_join_table | natural_join_stmt;
no_join_table: (table_name COMMA SPACE*)* table_name;
inner_join_table: table_name SPACE* inner_join_type SPACE* table_name
	SPACE* ON SPACE* inner_join_eq;
inner_join_type: INNER_JOIN | LEFT_JOIN | RIGHT_JOIN | FULL_OUTER_JOIN;
inner_join_eq : table_column_name SPACE* EQ table_column_name;
natural_join_stmt: table_name SPACE* NATURAL_JOIN SPACE* table_name;
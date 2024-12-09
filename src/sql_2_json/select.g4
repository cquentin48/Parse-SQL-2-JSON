grammar select;

import tokens;

select_stmt:	
	(table_column_name COMMA SPACE*)* table_column_name
	| every_columns;
every_columns: STAR;
grammar Sql;

import select, from, where;

whole_query: query SPACE* SEMICOLON;

query: SELECT SPACE* select_stmt SPACE* FROM SPACE* from_stmt SPACE* where_stmt?;
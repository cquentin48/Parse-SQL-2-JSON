# Generated from Sql.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .SqlParser import SqlParser
else:
    from SqlParser import SqlParser

# This class defines a complete listener for a parse tree produced by SqlParser.
class SqlListener(ParseTreeListener):
    def __init__(self):
        super().__init__()
        self.column_names = []

    # Enter a parse tree produced by SqlParser#whole_query.
    def enterWhole_query(self, ctx:SqlParser.Whole_queryContext):
        ctx.query()

    # Exit a parse tree produced by SqlParser#whole_query.
    def exitWhole_query(self, ctx:SqlParser.Whole_queryContext):
        pass


    # Enter a parse tree produced by SqlParser#query.
    def enterQuery(self, ctx:SqlParser.QueryContext):
        ctx.select_stmt()

    # Exit a parse tree produced by SqlParser#query.
    def exitQuery(self, ctx:SqlParser.QueryContext):
        pass


    # Enter a parse tree produced by SqlParser#select_stmt.
    def enterSelect_stmt(self, ctx:SqlParser.Select_stmtContext):
        ctx.everything()
        ctx.table_column_name()

    # Exit a parse tree produced by SqlParser#select_stmt.
    def exitSelect_stmt(self, ctx:SqlParser.Select_stmtContext):
        pass


    # Enter a parse tree produced by SqlParser#everything.
    def enterEverything(self, ctx:SqlParser.EverythingContext):
        self.column_names.append('__everything')

    # Exit a parse tree produced by SqlParser#everything.
    def exitEverything(self, ctx:SqlParser.EverythingContext):
        pass


    # Enter a parse tree produced by SqlParser#table_column_name.
    def enterTable_column_name(self, ctx:SqlParser.Table_column_nameContext):
        self.column_names.append(ctx.getText())

    # Exit a parse tree produced by SqlParser#table_column_name.
    def exitTable_column_name(self, ctx:SqlParser.Table_column_nameContext):
        pass



del SqlParser
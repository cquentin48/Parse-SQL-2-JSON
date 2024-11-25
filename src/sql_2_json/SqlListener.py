# Generated from Sql.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .SqlParser import SqlParser
else:
    from SqlParser import SqlParser

# This class defines a complete listener for a parse tree produced by SqlParser.


class SqlListener(ParseTreeListener):
    def __init__(self):
        """
        Object creation method
        """
        super().__init__()
        # Select statement
        self.column_names = []

        # From statement
        self.table_names = []
        self.joins = {}
        self.join_type = ""

        # Conditions
        self.conditions = []

    # Enter a parse tree produced by SqlParser#whole_query.
    def enterWhole_query(self, ctx: SqlParser.Whole_queryContext):
        ctx.query()

    # Exit a parse tree produced by SqlParser#whole_query.
    def exitWhole_query(self, ctx: SqlParser.Whole_queryContext):
        pass

    # Enter a parse tree produced by SqlParser#query.
    def enterQuery(self, ctx: SqlParser.QueryContext):
        ctx.select_stmt()
        ctx.from_stmt()
        ctx.where_stmt()

    # Exit a parse tree produced by SqlParser#query.
    def exitQuery(self, ctx: SqlParser.QueryContext):
        pass

    # Enter a parse tree produced by SqlParser#select_stmt.
    def enterSelect_stmt(self, ctx: SqlParser.Select_stmtContext):
        ctx.table_column_name()
        ctx.every_columns()

    # Exit a parse tree produced by SqlParser#select_stmt.
    def exitSelect_stmt(self, ctx: SqlParser.Select_stmtContext):
        pass

    # Enter a parse tree produced by SqlParser#every_columns.
    def enterEvery_columns(self, ctx: SqlParser.Every_columnsContext):
        self.column_names.append('__everything')

    # Exit a parse tree produced by SqlParser#every_columns.
    def exitEvery_columns(self, ctx: SqlParser.Every_columnsContext):
        pass

    # Enter a parse tree produced by SqlParser#from_stmt.
    def enterFrom_stmt(self, ctx: SqlParser.From_stmtContext):
        ctx.no_join_table()
        ctx.inner_join_table()

    # Exit a parse tree produced by SqlParser#from_stmt.
    def exitFrom_stmt(self, ctx: SqlParser.From_stmtContext):
        pass

    # Enter a parse tree produced by SqlParser#no_join_table.
    def enterNo_join_table(self, ctx: SqlParser.No_join_tableContext):
        ctx.table_name()

    # Exit a parse tree produced by SqlParser#no_join_table.
    def exitNo_join_table(self, ctx: SqlParser.No_join_tableContext):
        pass

    # Enter a parse tree produced by SqlParser#inner_join_table.
    def enterInner_join_table(self, ctx: SqlParser.Inner_join_tableContext):
        self.join_type = ctx.inner_join_type().getText().upper().replace(' ', '_')

        table_name_class = "Table_nameContext"
        table_names = [child.getText() for child in ctx.getChildren()
                       if type(child).__name__ == table_name_class]

        if self.join_type not in self.joins:
            self.joins[self.join_type] = []

        self.joins[self.join_type].append({
            0: {
                'table_name': table_names[0],
                'attributes': []
            },
            1: {
                'table_name': table_names[1],
                'attributes': []
            },
        })

    # Exit a parse tree produced by SqlParser#inner_join_table.
    def exitInner_join_table(self, ctx: SqlParser.Inner_join_tableContext):
        pass

    # Enter a parse tree produced by SqlParser#inner_join_type.
    def enterInner_join_type(self, ctx: SqlParser.Inner_join_typeContext):
        return ctx.getText()

    # Exit a parse tree produced by SqlParser#inner_join_type.
    def exitInner_join_type(self, ctx: SqlParser.Inner_join_typeContext):
        pass

    # Enter a parse tree produced by SqlParser#inner_join_eq.
    def enterInner_join_eq(self, ctx: SqlParser.Inner_join_eqContext):
        current_join_index = len(self.joins[self.join_type])-1

        table_name_parser_class = "Table_column_nameContext"

        column_names = [elem for elem
                        in ctx.getChildren()
                        if type(elem).__name__ == table_name_parser_class
                        or elem.getText() == '=']
        equality_object = [elem for elem in ctx.getChildren()
                           if type(elem).__name__ != table_name_parser_class
                           and elem.getText() == '='][0]
        eq_index = column_names.index(equality_object)

        for i in range(0, eq_index):
            self.joins[self.join_type][current_join_index][0]['attributes'].append(
                column_names[i].STRING().getText()
            )
        for i in range(eq_index+1, len(column_names)):
            self.joins[self.join_type][current_join_index][1]['attributes'].append(
                column_names[i].STRING().getText()
            )

    # Exit a parse tree produced by SqlParser#inner_join_eq.
    def exitInner_join_eq(self, ctx: SqlParser.Inner_join_eqContext):
        pass

    # Enter a parse tree produced by SqlParser#natural_join_stmt.
    def enterNatural_join_stmt(self, ctx: SqlParser.Natural_join_stmtContext):
        tables = [elem.getText() for elem in ctx.getChildren()
                  if type(elem).__name__ == 'Table_nameContext']
        if 'NATURAL_JOIN' not in self.joins:
            self.joins['NATURAL_JOIN'] = []
        self.joins['NATURAL_JOIN'].append(tables)

    # Exit a parse tree produced by SqlParser#natural_join_stmt.
    def exitNatural_join_stmt(self, ctx: SqlParser.Natural_join_stmtContext):
        pass

    # Enter a parse tree produced by SqlParser#where_stmt.
    def enterWhere_stmt(self, ctx: SqlParser.Where_stmtContext):
        ctx.where_condition()

    # Exit a parse tree produced by SqlParser#where_stmt.
    def exitWhere_stmt(self, ctx: SqlParser.Where_stmtContext):
        pass

    # Enter a parse tree produced by SqlParser#where_condition.
    def enterWhere_condition(self, ctx: SqlParser.Where_conditionContext):
        self.conditions.append({
            'column_name':ctx.getChild(0).getText(),
            'value':ctx.obj_type().getText()
        })

    # Enter a parse tree produced by SqlParser#obj_type.
    def enterObj_type(self, ctx: SqlParser.Obj_typeContext):
        ctx_type = ctx.getChild(0).__class__.__name__.replace('Context','').lower()
        if ctx_type == 'terminalnodeimpl':
            return f'Number : {ctx.getChild(0)}'
        if ctx_type == 'table_column_name':
            return ctx.getChild(0).STRING()

    # Exit a parse tree produced by SqlParser#obj_type.
    def exitObj_type(self, ctx: SqlParser.Obj_typeContext):
        pass


    # Enter a parse tree produced by SqlParser#formatted_date.
    def enterFormatted_date(self, ctx:SqlParser.Formatted_dateContext):
        pass

    # Exit a parse tree produced by SqlParser#formatted_date.
    def exitFormatted_date(self, ctx:SqlParser.Formatted_dateContext):
        pass


    # Enter a parse tree produced by SqlParser#date.
    def enterDate(self, ctx: SqlParser.DateContext):
        pass

    # Exit a parse tree produced by SqlParser#date.
    def exitDate(self, ctx: SqlParser.DateContext):
        pass

    # Enter a parse tree produced by SqlParser#table_column_name.

    def enterTable_column_name(self, ctx: SqlParser.Table_column_nameContext):
        self.column_names.append(ctx.STRING().getText())

    # Exit a parse tree produced by SqlParser#table_column_name.
    def exitTable_column_name(self, ctx: SqlParser.Table_column_nameContext):
        pass

    # Enter a parse tree produced by SqlParser#table_name.
    def enterTable_name(self, ctx: SqlParser.Table_nameContext):
        self.table_names.append(ctx.STRING().getText())

    # Exit a parse tree produced by SqlParser#table_name.
    def exitTable_name(self, ctx: SqlParser.Table_nameContext):
        pass


del SqlParser

# Generated from Sql.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:  # pragma: no cover
    from .SqlParser import SqlParser
else:  # pragma: no cover
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
        ctx.where_simple_condition()
        ctx.where_between_condition()

    # Exit a parse tree produced by SqlParser#where_condition.
    def exitWhere_condition(self, ctx: SqlParser.Where_conditionContext):
        pass

    # Enter a parse tree produced by SqlParser#where_simple_condition.
    def enterWhere_simple_condition(self, ctx: SqlParser.Where_simple_conditionContext):
        self.conditions.append({
            'column_name': ctx.getChild(0).getText(),
            'type': ctx.getChild(1).getText()
        })
        self.where_mode = 'simple'
        ctx.eq_type()
        ctx.obj_type()

    # Exit a parse tree produced by SqlParser#where_simple_condition.
    def exitWhere_simple_condition(self, ctx: SqlParser.Where_simple_conditionContext):
        pass

    # Enter a parse tree produced by SqlParser#where_between_condition.
    def enterWhere_between_condition(self, ctx: SqlParser.Where_between_conditionContext):
        self.conditions.append({
            'column_name': ctx.getChild(0).getText(),
            'type': 'between',
            'values': []
        })
        self.where_mode = 'between'
        ctx.obj_type()

    # Exit a parse tree produced by SqlParser#where_between_condition.
    def exitWhere_between_condition(self, ctx: SqlParser.Where_between_conditionContext):
        pass

    # Enter a parse tree produced by SqlParser#where_like_condition.
    def enterWhere_like_condition(self, ctx: SqlParser.Where_like_conditionContext):
        offset = 0
        if ctx.getChild(1).getText().upper() == 'NOT':
            equality_type = 'NOT_LIKE'
            offset += 1
        else:
            equality_type = 'LIKE'
        self.conditions.append({
            'column_name': ctx.getChild(0).getText(),
            'type': equality_type,
            'value': eval(ctx.getChild(offset+2).getText())
        })

    # Exit a parse tree produced by SqlParser#where_like_condition.
    def exitWhere_like_condition(self, ctx: SqlParser.Where_like_conditionContext):
        pass


    # Enter a parse tree produced by SqlParser#where_function_condition.
    def enterWhere_function_condition(self, ctx:SqlParser.Where_function_conditionContext):
        self.conditions.append({
            'function_name':ctx.function_name().getText(),
            'type':'FUNCTION'
        })
        ctx.argument_list()
        pass

    # Exit a parse tree produced by SqlParser#where_function_condition.
    def exitWhere_function_condition(self, ctx:SqlParser.Where_function_conditionContext):
        pass


    # Enter a parse tree produced by SqlParser#where_in_condition.
    def enterWhere_in_condition(self, ctx:SqlParser.Where_in_conditionContext):
        pass

    # Exit a parse tree produced by SqlParser#where_in_condition.
    def exitWhere_in_condition(self, ctx:SqlParser.Where_in_conditionContext):
        pass


    # Enter a parse tree produced by SqlParser#argument_list.
    def enterArgument_list(self, ctx:SqlParser.Argument_listContext):
        last_condition_index = len(self.conditions)-1
        if last_condition_index < 0:
            raise ValueError("Must create a condition before appending"+
                             " the argument list of a function into it!")
        
        if 'conditions' not in self.conditions[last_condition_index]:
            self.conditions[last_condition_index]["arguments"] = []
        arguments = self.conditions[last_condition_index]["arguments"]
        value = ctx.getChild(0).getText()
        if value.isalnum():
            value = int(value)
        else:
            value = value[1:-1]
        arguments.append(value)
        ctx.argument_list()

    # Exit a parse tree produced by SqlParser#argument_list.
    def exitArgument_list(self, ctx:SqlParser.Argument_listContext):
        pass


    # Enter a parse tree produced by SqlParser#eq_type.
    def enterEq_type(self, ctx: SqlParser.Eq_typeContext):
        value = ''
        match ctx.getChild(0).getText():
            case '=':
                value = 'EQUALITY'
            case '<':
                value = 'LOWER'
            case '>':
                value = 'HIGHER'
            case '>=':
                value = 'HEQ'
            case '<=':
                value = 'LEQ'
            case '!=':
                value = 'NOT_EQUAL'

        last_column_index = len(self.conditions)-1
        self.conditions[last_column_index]['type'] = value

    # Exit a parse tree produced by SqlParser#eq_type.
    def exitEq_type(self, ctx: SqlParser.Eq_typeContext):
        pass

    # Enter a parse tree produced by SqlParser#obj_type.

    def enterObj_type(self, ctx: SqlParser.Obj_typeContext):
        value = ctx.getChild(0).getText()
        if value.isalnum():
            value = int(value)
        else:
            value = value[1:-1]
        last_condition_index = len(self.conditions)-1
        match self.where_mode:
            case 'simple':
                self.conditions[last_condition_index]['value'] = value
            case 'between':
                self.conditions[last_condition_index]['values'].append(value)

    # Exit a parse tree produced by SqlParser#obj_type.
    def exitObj_type(self, ctx: SqlParser.Obj_typeContext):
        pass

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

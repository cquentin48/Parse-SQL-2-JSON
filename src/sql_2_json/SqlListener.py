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
        self.where_mode = ""
        self.where_and_level = 0
        self.sub_where_and_level = 0
        self.current_updated_sub_conditions = []

    # Enter a parse tree produced by SqlParser#whole_query.
    def enterWhole_query(self, ctx:SqlParser.Whole_queryContext):
        ctx.query()

    # Exit a parse tree produced by SqlParser#whole_query.
    def exitWhole_query(self, ctx:SqlParser.Whole_queryContext):
        pass


    # Enter a parse tree produced by SqlParser#query.
    def enterQuery(self, ctx:SqlParser.QueryContext):
        ctx.select_stmt()
        ctx.from_stmt()
        ctx.where_stmt()

    # Exit a parse tree produced by SqlParser#query.
    def exitQuery(self, ctx:SqlParser.QueryContext):
        pass


    # Enter a parse tree produced by SqlParser#select_stmt.
    def enterSelect_stmt(self, ctx:SqlParser.Select_stmtContext):
        ctx.table_column_name()
        ctx.every_columns()

    # Exit a parse tree produced by SqlParser#select_stmt.
    def exitSelect_stmt(self, ctx:SqlParser.Select_stmtContext):
        pass


    # Enter a parse tree produced by SqlParser#every_columns.
    def enterEvery_columns(self, ctx:SqlParser.Every_columnsContext):
        self.column_names.append('__everything')

    # Exit a parse tree produced by SqlParser#every_columns.
    def exitEvery_columns(self, ctx:SqlParser.Every_columnsContext):
        pass


    # Enter a parse tree produced by SqlParser#table_column_name.
    def enterTable_column_name(self, ctx:SqlParser.Table_column_nameContext):
        self.column_names.append(ctx.STRING().getText())

    # Exit a parse tree produced by SqlParser#table_column_name.
    def exitTable_column_name(self, ctx:SqlParser.Table_column_nameContext):
        pass


    # Enter a parse tree produced by SqlParser#table_name.
    def enterTable_name(self, ctx:SqlParser.Table_nameContext):
        self.table_names.append(ctx.STRING().getText())

    # Exit a parse tree produced by SqlParser#table_name.
    def exitTable_name(self, ctx:SqlParser.Table_nameContext):
        pass


    # Enter a parse tree produced by SqlParser#from_stmt.
    def enterFrom_stmt(self, ctx:SqlParser.From_stmtContext):
        ctx.no_join_table()
        ctx.inner_join_table()

    # Exit a parse tree produced by SqlParser#from_stmt.
    def exitFrom_stmt(self, ctx:SqlParser.From_stmtContext):
        pass


    # Enter a parse tree produced by SqlParser#no_join_table.
    def enterNo_join_table(self, ctx:SqlParser.No_join_tableContext):
        ctx.table_name()

    # Exit a parse tree produced by SqlParser#no_join_table.
    def exitNo_join_table(self, ctx:SqlParser.No_join_tableContext):
        pass


    # Enter a parse tree produced by SqlParser#inner_join_table.
    def enterInner_join_table(self, ctx:SqlParser.Inner_join_tableContext):
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
    def exitInner_join_table(self, ctx:SqlParser.Inner_join_tableContext):
        pass

    # Enter a parse tree produced by SqlParser#inner_join_type.
    def enterInner_join_type(self, ctx:SqlParser.Inner_join_typeContext):
        return ctx.getText()

    # Exit a parse tree produced by SqlParser#inner_join_type.
    def exitInner_join_type(self, ctx:SqlParser.Inner_join_typeContext):
        pass


    # Enter a parse tree produced by SqlParser#inner_join_eq.
    def enterInner_join_eq(self, ctx:SqlParser.Inner_join_eqContext):
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
    def exitInner_join_eq(self, ctx:SqlParser.Inner_join_eqContext):
        pass

    # Enter a parse tree produced by SqlParser#natural_join_stmt.
    def enterNatural_join_stmt(self, ctx: SqlParser.Natural_join_stmtContext):
        tables = [elem.getText() for elem in ctx.getChildren()
                  if type(elem).__name__ == 'Table_nameContext']
        if 'NATURAL_JOIN' not in self.joins:
            self.joins['NATURAL_JOIN'] = []
        self.joins['NATURAL_JOIN'].append(tables)

    # Exit a parse tree produced by SqlParser#natural_join_stmt.
    def exitNatural_join_stmt(self, ctx:SqlParser.Natural_join_stmtContext):
        pass

    # Enter a parse tree produced by SqlParser#where_stmt.
    def enterWhere_stmt(self, ctx:SqlParser.Where_stmtContext):
        ctx.where_condition()

    # Exit a parse tree produced by SqlParser#where_stmt.
    def exitWhere_stmt(self, ctx:SqlParser.Where_stmtContext):
        pass


    # Enter a parse tree produced by SqlParser#end_of_where_and_or.
    def enterEnd_of_where_and_or(self, ctx:SqlParser.End_of_where_and_orContext):
        print(f'Enter end of where and or : {ctx.getText()}')
        operator = [elem.getText()
                    for elem in ctx.getChildren()
                    if type(elem).__name__ == 'And_or_operatorsContext'][0]
        self.conditions.append({'type': operator.upper(),'conditions': []})
        self.where_mode = operator.upper()

    # Exit a parse tree produced by SqlParser#end_of_where_and_or.
    def exitEnd_of_where_and_or(self, ctx:SqlParser.End_of_where_and_orContext):
        print("End of end of where and or")


    # Enter a parse tree produced by SqlParser#right_and_or.
    def enterRight_and_or(self, ctx:SqlParser.Right_and_orContext):
        print(f"Enter right and or : {ctx.getText()}")
        operator = [child.getText() for child
                    in ctx.getChildren()
                    if type(child).__name__ == 'And_or_operatorsContext'][0]
        self.current_updated_sub_conditions.append({
            'operator':operator.upper(),
            'conditions':[]
        })
        # If the children count in 
        if len(self.current_updated_sub_conditions) > 1:
            upper_branch = self.current_updated_sub_conditions[-2]
            upper_branch.append(self.current_updated_sub_conditions[-1])
            

    # Exit a parse tree produced by SqlParser#right_and_or.
    def exitRight_and_or(self, ctx:SqlParser.Right_and_orContext):
        print("Exit right and or")
        conditions_types = [
            'Where_conditionContext',
            'End_of_where_and_orContext',
            'Left_and_orContext',
            'Right_and_orContext',
            'Double_and_orContext'
        ]
        children_count = len([child for child in ctx.getChildren() if type(child).__name__ in conditions_types])
        if len(self.current_updated_sub_conditions[-1]['conditions']) == children_count:
            del self.current_updated_sub_conditions[-1]


    # Enter a parse tree produced by SqlParser#left_and_or.
    def enterLeft_and_or(self, ctx:SqlParser.Left_and_orContext):
        print([type(child) for child in ctx.getChildren()])

    # Exit a parse tree produced by SqlParser#left_and_or.
    def exitLeft_and_or(self, ctx:SqlParser.Left_and_orContext):
        pass


    # Enter a parse tree produced by SqlParser#double_and_or.
    def enterDouble_and_or(self, ctx:SqlParser.Double_and_orContext):
        pass

    # Exit a parse tree produced by SqlParser#double_and_or.
    def exitDouble_and_or(self, ctx:SqlParser.Double_and_orContext):
        pass

    # Exit a parse tree produced by SqlParser#where_and_or_condition.
    def exitWhere_and_or_condition(self, ctx:SqlParser.Where_and_or_conditionContext):
        pass


    # Enter a parse tree produced by SqlParser#and_or_operators.
    def enterAnd_or_operators(self, ctx:SqlParser.And_or_operatorsContext):
        pass

    # Exit a parse tree produced by SqlParser#and_or_operators.
    def exitAnd_or_operators(self, ctx:SqlParser.And_or_operatorsContext):
        pass


    # Enter a parse tree produced by SqlParser#where_condition.
    def enterWhere_condition(self, ctx:SqlParser.Where_conditionContext):
        ctx.where_and_or_condition()
        ctx.where_simple_condition()
        ctx.where_between_condition()

    # Exit a parse tree produced by SqlParser#where_condition.
    def exitWhere_condition(self, ctx: SqlParser.Where_conditionContext):
        pass

    # Enter a parse tree produced by SqlParser#where_simple_condition.
    def enterWhere_simple_condition(self, ctx: SqlParser.Where_simple_conditionContext):
        new_condition = {
            'column_name': ctx.getChild(0).getText(),
            'type': ctx.getChild(1).getText()
        }
        if self.where_mode == 'AND' or self.where_mode == 'OR':
            last_condition_index = len(self.conditions)-1
            self.conditions[last_condition_index]['conditions'].append(
                new_condition)
        else:
            self.where_mode = 'SIMPLE'
            self.conditions.append(new_condition)
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
    def exitWhere_between_condition(self, ctx:SqlParser.Where_between_conditionContext):
        pass


    # Enter a parse tree produced by SqlParser#where_like_condition.
    def enterWhere_like_condition(self, ctx:SqlParser.Where_like_conditionContext):
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
    def exitWhere_like_condition(self, ctx:SqlParser.Where_like_conditionContext):
        pass


    # Enter a parse tree produced by SqlParser#where_function_condition.
    def enterWhere_function_condition(self, ctx:SqlParser.Where_function_conditionContext):
        self.conditions.append({
            'function_name': ctx.function_name().getText(),
            'type': 'FUNCTION'
        })
        ctx.argument_list()

    # Exit a parse tree produced by SqlParser#where_function_condition.
    def exitWhere_function_condition(self, ctx:SqlParser.Where_function_conditionContext):
        pass


    # Enter a parse tree produced by SqlParser#where_in_condition.
    def enterWhere_in_condition(self, ctx:SqlParser.Where_in_conditionContext):
        self.conditions.append({
            'type': 'IN',
            'col_name': ctx.getChild(0).getText()
        })
        ctx.argument_list()

    # Exit a parse tree produced by SqlParser#where_in_condition.
    def exitWhere_in_condition(self, ctx:SqlParser.Where_in_conditionContext):
        pass


    # Enter a parse tree produced by SqlParser#function_name.
    def enterFunction_name(self, ctx:SqlParser.Function_nameContext):
        pass

    # Exit a parse tree produced by SqlParser#function_name.
    def exitFunction_name(self, ctx:SqlParser.Function_nameContext):
        pass


    # Enter a parse tree produced by SqlParser#argument_list.
    def enterArgument_list(self, ctx:SqlParser.Argument_listContext):
        last_condition_index = len(self.conditions)-1
        if last_condition_index < 0:
            raise ValueError("Must create a condition before appending" +
                             " the argument list of a function into it!")

        if 'value_list' not in self.conditions[last_condition_index]:
            self.conditions[last_condition_index]["value_list"] = []
        value = ctx.getChild(0).getText()
        if value.isalnum():
            value = int(value)
        else:
            value = value[1:-1]
        self.conditions[last_condition_index]["value_list"].append(value)

        ctx.argument_list()

    # Exit a parse tree produced by SqlParser#argument_list.
    def exitArgument_list(self, ctx:SqlParser.Argument_listContext):
        pass


    # Enter a parse tree produced by SqlParser#eq_type.
    def enterEq_type(self, ctx:SqlParser.Eq_typeContext):
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

        last_column_index = -1
        if self.where_mode == 'SIMPLE':
            self.conditions[last_column_index]['type'] = value
        else:
            self.conditions[last_column_index]['conditions'][-1]['type'] =\
                value

    # Exit a parse tree produced by SqlParser#eq_type.
    def exitEq_type(self, ctx:SqlParser.Eq_typeContext):
        pass


    # Enter a parse tree produced by SqlParser#obj_type.
    def enterObj_type(self, ctx:SqlParser.Obj_typeContext):
        value = ctx.getChild(0).getText()
        if value.isalnum():
            value = int(value)
        else:
            value = value[1:-1]
        last_condition_index = len(self.conditions)-1
        match self.where_mode:
            case 'SIMPLE':
                self.conditions[last_condition_index]['value'] = value
            case 'between':
                self.conditions[last_condition_index]['values'].append(value)
            case 'AND'|'OR':
                self.conditions[-1]['conditions'][-1]['value'] = value

    # Exit a parse tree produced by SqlParser#obj_type.
    def exitObj_type(self, ctx:SqlParser.Obj_typeContext):
        pass



del SqlParser
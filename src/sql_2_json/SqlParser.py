# Generated from Sql.g4 by ANTLR 4.13.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,33,201,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        2,14,7,14,1,0,1,0,5,0,33,8,0,10,0,12,0,36,9,0,1,0,1,0,1,1,1,1,5,
        1,42,8,1,10,1,12,1,45,9,1,1,1,1,1,5,1,49,8,1,10,1,12,1,52,9,1,1,
        1,1,1,5,1,56,8,1,10,1,12,1,59,9,1,1,1,1,1,5,1,63,8,1,10,1,12,1,66,
        9,1,1,1,3,1,69,8,1,1,2,1,2,1,2,5,2,74,8,2,10,2,12,2,77,9,2,5,2,79,
        8,2,10,2,12,2,82,9,2,1,2,1,2,3,2,86,8,2,1,3,1,3,1,4,1,4,1,4,3,4,
        93,8,4,1,5,1,5,1,5,5,5,98,8,5,10,5,12,5,101,9,5,5,5,103,8,5,10,5,
        12,5,106,9,5,1,5,1,5,1,6,1,6,5,6,112,8,6,10,6,12,6,115,9,6,1,6,1,
        6,5,6,119,8,6,10,6,12,6,122,9,6,1,6,1,6,5,6,126,8,6,10,6,12,6,129,
        9,6,1,6,1,6,5,6,133,8,6,10,6,12,6,136,9,6,1,6,1,6,1,7,1,7,1,8,1,
        8,5,8,144,8,8,10,8,12,8,147,9,8,1,8,1,8,1,8,1,9,1,9,5,9,154,8,9,
        10,9,12,9,157,9,9,1,9,1,9,5,9,161,8,9,10,9,12,9,164,9,9,1,9,1,9,
        1,10,1,10,5,10,170,8,10,10,10,12,10,173,9,10,1,10,1,10,1,11,1,11,
        1,11,1,11,1,12,1,12,1,13,1,13,1,13,1,13,1,13,1,13,1,13,3,13,190,
        8,13,1,14,1,14,1,14,1,14,1,14,1,14,1,14,3,14,199,8,14,1,14,0,0,15,
        0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,0,2,2,0,11,13,15,15,3,0,
        1,1,18,18,31,31,210,0,30,1,0,0,0,2,39,1,0,0,0,4,85,1,0,0,0,6,87,
        1,0,0,0,8,92,1,0,0,0,10,104,1,0,0,0,12,109,1,0,0,0,14,139,1,0,0,
        0,16,141,1,0,0,0,18,151,1,0,0,0,20,167,1,0,0,0,22,176,1,0,0,0,24,
        180,1,0,0,0,26,189,1,0,0,0,28,198,1,0,0,0,30,34,3,2,1,0,31,33,5,
        33,0,0,32,31,1,0,0,0,33,36,1,0,0,0,34,32,1,0,0,0,34,35,1,0,0,0,35,
        37,1,0,0,0,36,34,1,0,0,0,37,38,5,21,0,0,38,1,1,0,0,0,39,43,5,3,0,
        0,40,42,5,33,0,0,41,40,1,0,0,0,42,45,1,0,0,0,43,41,1,0,0,0,43,44,
        1,0,0,0,44,46,1,0,0,0,45,43,1,0,0,0,46,50,3,4,2,0,47,49,5,33,0,0,
        48,47,1,0,0,0,49,52,1,0,0,0,50,48,1,0,0,0,50,51,1,0,0,0,51,53,1,
        0,0,0,52,50,1,0,0,0,53,57,5,4,0,0,54,56,5,33,0,0,55,54,1,0,0,0,56,
        59,1,0,0,0,57,55,1,0,0,0,57,58,1,0,0,0,58,60,1,0,0,0,59,57,1,0,0,
        0,60,64,3,8,4,0,61,63,5,33,0,0,62,61,1,0,0,0,63,66,1,0,0,0,64,62,
        1,0,0,0,64,65,1,0,0,0,65,68,1,0,0,0,66,64,1,0,0,0,67,69,3,20,10,
        0,68,67,1,0,0,0,68,69,1,0,0,0,69,3,1,0,0,0,70,71,3,26,13,0,71,75,
        5,20,0,0,72,74,5,33,0,0,73,72,1,0,0,0,74,77,1,0,0,0,75,73,1,0,0,
        0,75,76,1,0,0,0,76,79,1,0,0,0,77,75,1,0,0,0,78,70,1,0,0,0,79,82,
        1,0,0,0,80,78,1,0,0,0,80,81,1,0,0,0,81,83,1,0,0,0,82,80,1,0,0,0,
        83,86,3,26,13,0,84,86,3,6,3,0,85,80,1,0,0,0,85,84,1,0,0,0,86,5,1,
        0,0,0,87,88,5,23,0,0,88,7,1,0,0,0,89,93,3,10,5,0,90,93,3,12,6,0,
        91,93,3,18,9,0,92,89,1,0,0,0,92,90,1,0,0,0,92,91,1,0,0,0,93,9,1,
        0,0,0,94,95,3,28,14,0,95,99,5,20,0,0,96,98,5,33,0,0,97,96,1,0,0,
        0,98,101,1,0,0,0,99,97,1,0,0,0,99,100,1,0,0,0,100,103,1,0,0,0,101,
        99,1,0,0,0,102,94,1,0,0,0,103,106,1,0,0,0,104,102,1,0,0,0,104,105,
        1,0,0,0,105,107,1,0,0,0,106,104,1,0,0,0,107,108,3,28,14,0,108,11,
        1,0,0,0,109,113,3,28,14,0,110,112,5,33,0,0,111,110,1,0,0,0,112,115,
        1,0,0,0,113,111,1,0,0,0,113,114,1,0,0,0,114,116,1,0,0,0,115,113,
        1,0,0,0,116,120,3,14,7,0,117,119,5,33,0,0,118,117,1,0,0,0,119,122,
        1,0,0,0,120,118,1,0,0,0,120,121,1,0,0,0,121,123,1,0,0,0,122,120,
        1,0,0,0,123,127,3,28,14,0,124,126,5,33,0,0,125,124,1,0,0,0,126,129,
        1,0,0,0,127,125,1,0,0,0,127,128,1,0,0,0,128,130,1,0,0,0,129,127,
        1,0,0,0,130,134,5,7,0,0,131,133,5,33,0,0,132,131,1,0,0,0,133,136,
        1,0,0,0,134,132,1,0,0,0,134,135,1,0,0,0,135,137,1,0,0,0,136,134,
        1,0,0,0,137,138,3,16,8,0,138,13,1,0,0,0,139,140,7,0,0,0,140,15,1,
        0,0,0,141,145,3,26,13,0,142,144,5,33,0,0,143,142,1,0,0,0,144,147,
        1,0,0,0,145,143,1,0,0,0,145,146,1,0,0,0,146,148,1,0,0,0,147,145,
        1,0,0,0,148,149,5,10,0,0,149,150,3,26,13,0,150,17,1,0,0,0,151,155,
        3,28,14,0,152,154,5,33,0,0,153,152,1,0,0,0,154,157,1,0,0,0,155,153,
        1,0,0,0,155,156,1,0,0,0,156,158,1,0,0,0,157,155,1,0,0,0,158,162,
        5,14,0,0,159,161,5,33,0,0,160,159,1,0,0,0,161,164,1,0,0,0,162,160,
        1,0,0,0,162,163,1,0,0,0,163,165,1,0,0,0,164,162,1,0,0,0,165,166,
        3,28,14,0,166,19,1,0,0,0,167,171,5,5,0,0,168,170,5,33,0,0,169,168,
        1,0,0,0,170,173,1,0,0,0,171,169,1,0,0,0,171,172,1,0,0,0,172,174,
        1,0,0,0,173,171,1,0,0,0,174,175,3,22,11,0,175,21,1,0,0,0,176,177,
        3,26,13,0,177,178,5,10,0,0,178,179,3,24,12,0,179,23,1,0,0,0,180,
        181,7,1,0,0,181,25,1,0,0,0,182,190,5,32,0,0,183,184,5,16,0,0,184,
        185,5,32,0,0,185,190,5,16,0,0,186,187,5,17,0,0,187,188,5,32,0,0,
        188,190,5,17,0,0,189,182,1,0,0,0,189,183,1,0,0,0,189,186,1,0,0,0,
        190,27,1,0,0,0,191,199,5,32,0,0,192,193,5,16,0,0,193,194,5,32,0,
        0,194,199,5,16,0,0,195,196,5,17,0,0,196,197,5,32,0,0,197,199,5,17,
        0,0,198,191,1,0,0,0,198,192,1,0,0,0,198,195,1,0,0,0,199,29,1,0,0,
        0,22,34,43,50,57,64,68,75,80,85,92,99,104,113,120,127,134,145,155,
        162,171,189,198
    ]

class SqlParser ( Parser ):

    grammarFileName = "Sql.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "'='", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "'\"'", "'''", 
                     "<INVALID>", "<INVALID>", "','", "';'", "'.'", "'*'", 
                     "'>'", "'>='", "'<'", "'<='", "'/'" ]

    symbolicNames = [ "<INVALID>", "QUOTED_DATE", "DATE", "SELECT", "FROM", 
                      "WHERE", "IN", "ON", "NOT", "EXCEPT", "EQ", "INNER_JOIN", 
                      "LEFT_JOIN", "RIGHT_JOIN", "NATURAL_JOIN", "FULL_OUTER_JOIN", 
                      "DOUBLE_QUOTATION_MARK", "SINGLE_QUOTATION_MARK", 
                      "NUMBER", "DECIMAL_PART", "COMMA", "SEMICOLON", "POINT", 
                      "STAR", "GREATER", "GEQ", "LOWER", "LEQ", "SLASH", 
                      "LETTER", "DIGIT", "TEXT", "STRING", "SPACE" ]

    RULE_whole_query = 0
    RULE_query = 1
    RULE_select_stmt = 2
    RULE_every_columns = 3
    RULE_from_stmt = 4
    RULE_no_join_table = 5
    RULE_inner_join_table = 6
    RULE_inner_join_type = 7
    RULE_inner_join_eq = 8
    RULE_natural_join_stmt = 9
    RULE_where_stmt = 10
    RULE_where_condition = 11
    RULE_obj_type = 12
    RULE_table_column_name = 13
    RULE_table_name = 14

    ruleNames =  [ "whole_query", "query", "select_stmt", "every_columns", 
                   "from_stmt", "no_join_table", "inner_join_table", "inner_join_type", 
                   "inner_join_eq", "natural_join_stmt", "where_stmt", "where_condition", 
                   "obj_type", "table_column_name", "table_name" ]

    EOF = Token.EOF
    QUOTED_DATE=1
    DATE=2
    SELECT=3
    FROM=4
    WHERE=5
    IN=6
    ON=7
    NOT=8
    EXCEPT=9
    EQ=10
    INNER_JOIN=11
    LEFT_JOIN=12
    RIGHT_JOIN=13
    NATURAL_JOIN=14
    FULL_OUTER_JOIN=15
    DOUBLE_QUOTATION_MARK=16
    SINGLE_QUOTATION_MARK=17
    NUMBER=18
    DECIMAL_PART=19
    COMMA=20
    SEMICOLON=21
    POINT=22
    STAR=23
    GREATER=24
    GEQ=25
    LOWER=26
    LEQ=27
    SLASH=28
    LETTER=29
    DIGIT=30
    TEXT=31
    STRING=32
    SPACE=33

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class Whole_queryContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def query(self):
            return self.getTypedRuleContext(SqlParser.QueryContext,0)


        def SEMICOLON(self):
            return self.getToken(SqlParser.SEMICOLON, 0)

        def SPACE(self, i:int=None):
            if i is None:
                return self.getTokens(SqlParser.SPACE)
            else:
                return self.getToken(SqlParser.SPACE, i)

        def getRuleIndex(self):
            return SqlParser.RULE_whole_query

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterWhole_query" ):
                listener.enterWhole_query(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitWhole_query" ):
                listener.exitWhole_query(self)




    def whole_query(self):

        localctx = SqlParser.Whole_queryContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_whole_query)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 30
            self.query()
            self.state = 34
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==33:
                self.state = 31
                self.match(SqlParser.SPACE)
                self.state = 36
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 37
            self.match(SqlParser.SEMICOLON)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class QueryContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def SELECT(self):
            return self.getToken(SqlParser.SELECT, 0)

        def select_stmt(self):
            return self.getTypedRuleContext(SqlParser.Select_stmtContext,0)


        def FROM(self):
            return self.getToken(SqlParser.FROM, 0)

        def from_stmt(self):
            return self.getTypedRuleContext(SqlParser.From_stmtContext,0)


        def SPACE(self, i:int=None):
            if i is None:
                return self.getTokens(SqlParser.SPACE)
            else:
                return self.getToken(SqlParser.SPACE, i)

        def where_stmt(self):
            return self.getTypedRuleContext(SqlParser.Where_stmtContext,0)


        def getRuleIndex(self):
            return SqlParser.RULE_query

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterQuery" ):
                listener.enterQuery(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitQuery" ):
                listener.exitQuery(self)




    def query(self):

        localctx = SqlParser.QueryContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_query)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 39
            self.match(SqlParser.SELECT)
            self.state = 43
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==33:
                self.state = 40
                self.match(SqlParser.SPACE)
                self.state = 45
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 46
            self.select_stmt()
            self.state = 50
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==33:
                self.state = 47
                self.match(SqlParser.SPACE)
                self.state = 52
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 53
            self.match(SqlParser.FROM)
            self.state = 57
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==33:
                self.state = 54
                self.match(SqlParser.SPACE)
                self.state = 59
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 60
            self.from_stmt()
            self.state = 64
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,4,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 61
                    self.match(SqlParser.SPACE) 
                self.state = 66
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,4,self._ctx)

            self.state = 68
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==5:
                self.state = 67
                self.where_stmt()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Select_stmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def table_column_name(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SqlParser.Table_column_nameContext)
            else:
                return self.getTypedRuleContext(SqlParser.Table_column_nameContext,i)


        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(SqlParser.COMMA)
            else:
                return self.getToken(SqlParser.COMMA, i)

        def SPACE(self, i:int=None):
            if i is None:
                return self.getTokens(SqlParser.SPACE)
            else:
                return self.getToken(SqlParser.SPACE, i)

        def every_columns(self):
            return self.getTypedRuleContext(SqlParser.Every_columnsContext,0)


        def getRuleIndex(self):
            return SqlParser.RULE_select_stmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSelect_stmt" ):
                listener.enterSelect_stmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSelect_stmt" ):
                listener.exitSelect_stmt(self)




    def select_stmt(self):

        localctx = SqlParser.Select_stmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_select_stmt)
        self._la = 0 # Token type
        try:
            self.state = 85
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [16, 17, 32]:
                self.enterOuterAlt(localctx, 1)
                self.state = 80
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,7,self._ctx)
                while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                    if _alt==1:
                        self.state = 70
                        self.table_column_name()
                        self.state = 71
                        self.match(SqlParser.COMMA)
                        self.state = 75
                        self._errHandler.sync(self)
                        _la = self._input.LA(1)
                        while _la==33:
                            self.state = 72
                            self.match(SqlParser.SPACE)
                            self.state = 77
                            self._errHandler.sync(self)
                            _la = self._input.LA(1)
                 
                    self.state = 82
                    self._errHandler.sync(self)
                    _alt = self._interp.adaptivePredict(self._input,7,self._ctx)

                self.state = 83
                self.table_column_name()
                pass
            elif token in [23]:
                self.enterOuterAlt(localctx, 2)
                self.state = 84
                self.every_columns()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Every_columnsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def STAR(self):
            return self.getToken(SqlParser.STAR, 0)

        def getRuleIndex(self):
            return SqlParser.RULE_every_columns

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterEvery_columns" ):
                listener.enterEvery_columns(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitEvery_columns" ):
                listener.exitEvery_columns(self)




    def every_columns(self):

        localctx = SqlParser.Every_columnsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_every_columns)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 87
            self.match(SqlParser.STAR)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class From_stmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def no_join_table(self):
            return self.getTypedRuleContext(SqlParser.No_join_tableContext,0)


        def inner_join_table(self):
            return self.getTypedRuleContext(SqlParser.Inner_join_tableContext,0)


        def natural_join_stmt(self):
            return self.getTypedRuleContext(SqlParser.Natural_join_stmtContext,0)


        def getRuleIndex(self):
            return SqlParser.RULE_from_stmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFrom_stmt" ):
                listener.enterFrom_stmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFrom_stmt" ):
                listener.exitFrom_stmt(self)




    def from_stmt(self):

        localctx = SqlParser.From_stmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_from_stmt)
        try:
            self.state = 92
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,9,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 89
                self.no_join_table()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 90
                self.inner_join_table()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 91
                self.natural_join_stmt()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class No_join_tableContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def table_name(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SqlParser.Table_nameContext)
            else:
                return self.getTypedRuleContext(SqlParser.Table_nameContext,i)


        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(SqlParser.COMMA)
            else:
                return self.getToken(SqlParser.COMMA, i)

        def SPACE(self, i:int=None):
            if i is None:
                return self.getTokens(SqlParser.SPACE)
            else:
                return self.getToken(SqlParser.SPACE, i)

        def getRuleIndex(self):
            return SqlParser.RULE_no_join_table

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterNo_join_table" ):
                listener.enterNo_join_table(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitNo_join_table" ):
                listener.exitNo_join_table(self)




    def no_join_table(self):

        localctx = SqlParser.No_join_tableContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_no_join_table)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 104
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,11,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 94
                    self.table_name()
                    self.state = 95
                    self.match(SqlParser.COMMA)
                    self.state = 99
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    while _la==33:
                        self.state = 96
                        self.match(SqlParser.SPACE)
                        self.state = 101
                        self._errHandler.sync(self)
                        _la = self._input.LA(1)
             
                self.state = 106
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,11,self._ctx)

            self.state = 107
            self.table_name()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Inner_join_tableContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def table_name(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SqlParser.Table_nameContext)
            else:
                return self.getTypedRuleContext(SqlParser.Table_nameContext,i)


        def inner_join_type(self):
            return self.getTypedRuleContext(SqlParser.Inner_join_typeContext,0)


        def ON(self):
            return self.getToken(SqlParser.ON, 0)

        def inner_join_eq(self):
            return self.getTypedRuleContext(SqlParser.Inner_join_eqContext,0)


        def SPACE(self, i:int=None):
            if i is None:
                return self.getTokens(SqlParser.SPACE)
            else:
                return self.getToken(SqlParser.SPACE, i)

        def getRuleIndex(self):
            return SqlParser.RULE_inner_join_table

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterInner_join_table" ):
                listener.enterInner_join_table(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitInner_join_table" ):
                listener.exitInner_join_table(self)




    def inner_join_table(self):

        localctx = SqlParser.Inner_join_tableContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_inner_join_table)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 109
            self.table_name()
            self.state = 113
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==33:
                self.state = 110
                self.match(SqlParser.SPACE)
                self.state = 115
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 116
            self.inner_join_type()
            self.state = 120
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==33:
                self.state = 117
                self.match(SqlParser.SPACE)
                self.state = 122
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 123
            self.table_name()
            self.state = 127
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==33:
                self.state = 124
                self.match(SqlParser.SPACE)
                self.state = 129
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 130
            self.match(SqlParser.ON)
            self.state = 134
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==33:
                self.state = 131
                self.match(SqlParser.SPACE)
                self.state = 136
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 137
            self.inner_join_eq()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Inner_join_typeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def INNER_JOIN(self):
            return self.getToken(SqlParser.INNER_JOIN, 0)

        def LEFT_JOIN(self):
            return self.getToken(SqlParser.LEFT_JOIN, 0)

        def RIGHT_JOIN(self):
            return self.getToken(SqlParser.RIGHT_JOIN, 0)

        def FULL_OUTER_JOIN(self):
            return self.getToken(SqlParser.FULL_OUTER_JOIN, 0)

        def getRuleIndex(self):
            return SqlParser.RULE_inner_join_type

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterInner_join_type" ):
                listener.enterInner_join_type(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitInner_join_type" ):
                listener.exitInner_join_type(self)




    def inner_join_type(self):

        localctx = SqlParser.Inner_join_typeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_inner_join_type)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 139
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 47104) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Inner_join_eqContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def table_column_name(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SqlParser.Table_column_nameContext)
            else:
                return self.getTypedRuleContext(SqlParser.Table_column_nameContext,i)


        def EQ(self):
            return self.getToken(SqlParser.EQ, 0)

        def SPACE(self, i:int=None):
            if i is None:
                return self.getTokens(SqlParser.SPACE)
            else:
                return self.getToken(SqlParser.SPACE, i)

        def getRuleIndex(self):
            return SqlParser.RULE_inner_join_eq

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterInner_join_eq" ):
                listener.enterInner_join_eq(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitInner_join_eq" ):
                listener.exitInner_join_eq(self)




    def inner_join_eq(self):

        localctx = SqlParser.Inner_join_eqContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_inner_join_eq)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 141
            self.table_column_name()
            self.state = 145
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==33:
                self.state = 142
                self.match(SqlParser.SPACE)
                self.state = 147
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 148
            self.match(SqlParser.EQ)
            self.state = 149
            self.table_column_name()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Natural_join_stmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def table_name(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SqlParser.Table_nameContext)
            else:
                return self.getTypedRuleContext(SqlParser.Table_nameContext,i)


        def NATURAL_JOIN(self):
            return self.getToken(SqlParser.NATURAL_JOIN, 0)

        def SPACE(self, i:int=None):
            if i is None:
                return self.getTokens(SqlParser.SPACE)
            else:
                return self.getToken(SqlParser.SPACE, i)

        def getRuleIndex(self):
            return SqlParser.RULE_natural_join_stmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterNatural_join_stmt" ):
                listener.enterNatural_join_stmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitNatural_join_stmt" ):
                listener.exitNatural_join_stmt(self)




    def natural_join_stmt(self):

        localctx = SqlParser.Natural_join_stmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_natural_join_stmt)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 151
            self.table_name()
            self.state = 155
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==33:
                self.state = 152
                self.match(SqlParser.SPACE)
                self.state = 157
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 158
            self.match(SqlParser.NATURAL_JOIN)
            self.state = 162
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==33:
                self.state = 159
                self.match(SqlParser.SPACE)
                self.state = 164
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 165
            self.table_name()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Where_stmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def WHERE(self):
            return self.getToken(SqlParser.WHERE, 0)

        def where_condition(self):
            return self.getTypedRuleContext(SqlParser.Where_conditionContext,0)


        def SPACE(self, i:int=None):
            if i is None:
                return self.getTokens(SqlParser.SPACE)
            else:
                return self.getToken(SqlParser.SPACE, i)

        def getRuleIndex(self):
            return SqlParser.RULE_where_stmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterWhere_stmt" ):
                listener.enterWhere_stmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitWhere_stmt" ):
                listener.exitWhere_stmt(self)




    def where_stmt(self):

        localctx = SqlParser.Where_stmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_where_stmt)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 167
            self.match(SqlParser.WHERE)
            self.state = 171
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==33:
                self.state = 168
                self.match(SqlParser.SPACE)
                self.state = 173
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 174
            self.where_condition()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Where_conditionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def table_column_name(self):
            return self.getTypedRuleContext(SqlParser.Table_column_nameContext,0)


        def EQ(self):
            return self.getToken(SqlParser.EQ, 0)

        def obj_type(self):
            return self.getTypedRuleContext(SqlParser.Obj_typeContext,0)


        def getRuleIndex(self):
            return SqlParser.RULE_where_condition

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterWhere_condition" ):
                listener.enterWhere_condition(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitWhere_condition" ):
                listener.exitWhere_condition(self)




    def where_condition(self):

        localctx = SqlParser.Where_conditionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_where_condition)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 176
            self.table_column_name()
            self.state = 177
            self.match(SqlParser.EQ)
            self.state = 178
            self.obj_type()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Obj_typeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def QUOTED_DATE(self):
            return self.getToken(SqlParser.QUOTED_DATE, 0)

        def TEXT(self):
            return self.getToken(SqlParser.TEXT, 0)

        def NUMBER(self):
            return self.getToken(SqlParser.NUMBER, 0)

        def getRuleIndex(self):
            return SqlParser.RULE_obj_type

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterObj_type" ):
                listener.enterObj_type(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitObj_type" ):
                listener.exitObj_type(self)




    def obj_type(self):

        localctx = SqlParser.Obj_typeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_obj_type)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 180
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 2147745794) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Table_column_nameContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def STRING(self):
            return self.getToken(SqlParser.STRING, 0)

        def DOUBLE_QUOTATION_MARK(self, i:int=None):
            if i is None:
                return self.getTokens(SqlParser.DOUBLE_QUOTATION_MARK)
            else:
                return self.getToken(SqlParser.DOUBLE_QUOTATION_MARK, i)

        def SINGLE_QUOTATION_MARK(self, i:int=None):
            if i is None:
                return self.getTokens(SqlParser.SINGLE_QUOTATION_MARK)
            else:
                return self.getToken(SqlParser.SINGLE_QUOTATION_MARK, i)

        def getRuleIndex(self):
            return SqlParser.RULE_table_column_name

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTable_column_name" ):
                listener.enterTable_column_name(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTable_column_name" ):
                listener.exitTable_column_name(self)




    def table_column_name(self):

        localctx = SqlParser.Table_column_nameContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_table_column_name)
        try:
            self.state = 189
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [32]:
                self.enterOuterAlt(localctx, 1)
                self.state = 182
                self.match(SqlParser.STRING)
                pass
            elif token in [16]:
                self.enterOuterAlt(localctx, 2)
                self.state = 183
                self.match(SqlParser.DOUBLE_QUOTATION_MARK)
                self.state = 184
                self.match(SqlParser.STRING)
                self.state = 185
                self.match(SqlParser.DOUBLE_QUOTATION_MARK)
                pass
            elif token in [17]:
                self.enterOuterAlt(localctx, 3)
                self.state = 186
                self.match(SqlParser.SINGLE_QUOTATION_MARK)
                self.state = 187
                self.match(SqlParser.STRING)
                self.state = 188
                self.match(SqlParser.SINGLE_QUOTATION_MARK)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Table_nameContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def STRING(self):
            return self.getToken(SqlParser.STRING, 0)

        def DOUBLE_QUOTATION_MARK(self, i:int=None):
            if i is None:
                return self.getTokens(SqlParser.DOUBLE_QUOTATION_MARK)
            else:
                return self.getToken(SqlParser.DOUBLE_QUOTATION_MARK, i)

        def SINGLE_QUOTATION_MARK(self, i:int=None):
            if i is None:
                return self.getTokens(SqlParser.SINGLE_QUOTATION_MARK)
            else:
                return self.getToken(SqlParser.SINGLE_QUOTATION_MARK, i)

        def getRuleIndex(self):
            return SqlParser.RULE_table_name

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTable_name" ):
                listener.enterTable_name(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTable_name" ):
                listener.exitTable_name(self)




    def table_name(self):

        localctx = SqlParser.Table_nameContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_table_name)
        try:
            self.state = 198
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [32]:
                self.enterOuterAlt(localctx, 1)
                self.state = 191
                self.match(SqlParser.STRING)
                pass
            elif token in [16]:
                self.enterOuterAlt(localctx, 2)
                self.state = 192
                self.match(SqlParser.DOUBLE_QUOTATION_MARK)
                self.state = 193
                self.match(SqlParser.STRING)
                self.state = 194
                self.match(SqlParser.DOUBLE_QUOTATION_MARK)
                pass
            elif token in [17]:
                self.enterOuterAlt(localctx, 3)
                self.state = 195
                self.match(SqlParser.SINGLE_QUOTATION_MARK)
                self.state = 196
                self.match(SqlParser.STRING)
                self.state = 197
                self.match(SqlParser.SINGLE_QUOTATION_MARK)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx






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
        4,1,30,223,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        2,14,7,14,2,15,7,15,2,16,7,16,1,0,1,0,5,0,37,8,0,10,0,12,0,40,9,
        0,1,0,1,0,1,1,1,1,5,1,46,8,1,10,1,12,1,49,9,1,1,1,1,1,5,1,53,8,1,
        10,1,12,1,56,9,1,1,1,1,1,5,1,60,8,1,10,1,12,1,63,9,1,1,1,1,1,5,1,
        67,8,1,10,1,12,1,70,9,1,1,1,3,1,73,8,1,1,2,1,2,1,2,5,2,78,8,2,10,
        2,12,2,81,9,2,5,2,83,8,2,10,2,12,2,86,9,2,1,2,1,2,3,2,90,8,2,1,3,
        1,3,1,4,1,4,1,4,3,4,97,8,4,1,5,1,5,1,5,5,5,102,8,5,10,5,12,5,105,
        9,5,5,5,107,8,5,10,5,12,5,110,9,5,1,5,1,5,1,6,1,6,5,6,116,8,6,10,
        6,12,6,119,9,6,1,6,1,6,5,6,123,8,6,10,6,12,6,126,9,6,1,6,1,6,5,6,
        130,8,6,10,6,12,6,133,9,6,1,6,1,6,5,6,137,8,6,10,6,12,6,140,9,6,
        1,6,1,6,1,7,1,7,1,8,1,8,5,8,148,8,8,10,8,12,8,151,9,8,1,8,1,8,1,
        8,1,9,1,9,5,9,158,8,9,10,9,12,9,161,9,9,1,9,1,9,5,9,165,8,9,10,9,
        12,9,168,9,9,1,9,1,9,1,10,1,10,5,10,174,8,10,10,10,12,10,177,9,10,
        1,10,1,10,1,11,1,11,1,11,1,11,1,12,1,12,1,12,3,12,188,8,12,1,13,
        1,13,1,13,1,13,1,13,1,13,1,13,1,13,3,13,198,8,13,1,14,4,14,201,8,
        14,11,14,12,14,202,1,15,1,15,1,15,1,15,1,15,1,15,1,15,3,15,212,8,
        15,1,16,1,16,1,16,1,16,1,16,1,16,1,16,3,16,221,8,16,1,16,0,0,17,
        0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,0,1,2,0,10,12,14,14,
        234,0,34,1,0,0,0,2,43,1,0,0,0,4,89,1,0,0,0,6,91,1,0,0,0,8,96,1,0,
        0,0,10,108,1,0,0,0,12,113,1,0,0,0,14,143,1,0,0,0,16,145,1,0,0,0,
        18,155,1,0,0,0,20,171,1,0,0,0,22,180,1,0,0,0,24,187,1,0,0,0,26,197,
        1,0,0,0,28,200,1,0,0,0,30,211,1,0,0,0,32,220,1,0,0,0,34,38,3,2,1,
        0,35,37,5,30,0,0,36,35,1,0,0,0,37,40,1,0,0,0,38,36,1,0,0,0,38,39,
        1,0,0,0,39,41,1,0,0,0,40,38,1,0,0,0,41,42,5,18,0,0,42,1,1,0,0,0,
        43,47,5,2,0,0,44,46,5,30,0,0,45,44,1,0,0,0,46,49,1,0,0,0,47,45,1,
        0,0,0,47,48,1,0,0,0,48,50,1,0,0,0,49,47,1,0,0,0,50,54,3,4,2,0,51,
        53,5,30,0,0,52,51,1,0,0,0,53,56,1,0,0,0,54,52,1,0,0,0,54,55,1,0,
        0,0,55,57,1,0,0,0,56,54,1,0,0,0,57,61,5,3,0,0,58,60,5,30,0,0,59,
        58,1,0,0,0,60,63,1,0,0,0,61,59,1,0,0,0,61,62,1,0,0,0,62,64,1,0,0,
        0,63,61,1,0,0,0,64,68,3,8,4,0,65,67,5,30,0,0,66,65,1,0,0,0,67,70,
        1,0,0,0,68,66,1,0,0,0,68,69,1,0,0,0,69,72,1,0,0,0,70,68,1,0,0,0,
        71,73,3,20,10,0,72,71,1,0,0,0,72,73,1,0,0,0,73,3,1,0,0,0,74,75,3,
        30,15,0,75,79,5,17,0,0,76,78,5,30,0,0,77,76,1,0,0,0,78,81,1,0,0,
        0,79,77,1,0,0,0,79,80,1,0,0,0,80,83,1,0,0,0,81,79,1,0,0,0,82,74,
        1,0,0,0,83,86,1,0,0,0,84,82,1,0,0,0,84,85,1,0,0,0,85,87,1,0,0,0,
        86,84,1,0,0,0,87,90,3,30,15,0,88,90,3,6,3,0,89,84,1,0,0,0,89,88,
        1,0,0,0,90,5,1,0,0,0,91,92,5,20,0,0,92,7,1,0,0,0,93,97,3,10,5,0,
        94,97,3,12,6,0,95,97,3,18,9,0,96,93,1,0,0,0,96,94,1,0,0,0,96,95,
        1,0,0,0,97,9,1,0,0,0,98,99,3,32,16,0,99,103,5,17,0,0,100,102,5,30,
        0,0,101,100,1,0,0,0,102,105,1,0,0,0,103,101,1,0,0,0,103,104,1,0,
        0,0,104,107,1,0,0,0,105,103,1,0,0,0,106,98,1,0,0,0,107,110,1,0,0,
        0,108,106,1,0,0,0,108,109,1,0,0,0,109,111,1,0,0,0,110,108,1,0,0,
        0,111,112,3,32,16,0,112,11,1,0,0,0,113,117,3,32,16,0,114,116,5,30,
        0,0,115,114,1,0,0,0,116,119,1,0,0,0,117,115,1,0,0,0,117,118,1,0,
        0,0,118,120,1,0,0,0,119,117,1,0,0,0,120,124,3,14,7,0,121,123,5,30,
        0,0,122,121,1,0,0,0,123,126,1,0,0,0,124,122,1,0,0,0,124,125,1,0,
        0,0,125,127,1,0,0,0,126,124,1,0,0,0,127,131,3,32,16,0,128,130,5,
        30,0,0,129,128,1,0,0,0,130,133,1,0,0,0,131,129,1,0,0,0,131,132,1,
        0,0,0,132,134,1,0,0,0,133,131,1,0,0,0,134,138,5,6,0,0,135,137,5,
        30,0,0,136,135,1,0,0,0,137,140,1,0,0,0,138,136,1,0,0,0,138,139,1,
        0,0,0,139,141,1,0,0,0,140,138,1,0,0,0,141,142,3,16,8,0,142,13,1,
        0,0,0,143,144,7,0,0,0,144,15,1,0,0,0,145,149,3,30,15,0,146,148,5,
        30,0,0,147,146,1,0,0,0,148,151,1,0,0,0,149,147,1,0,0,0,149,150,1,
        0,0,0,150,152,1,0,0,0,151,149,1,0,0,0,152,153,5,9,0,0,153,154,3,
        30,15,0,154,17,1,0,0,0,155,159,3,32,16,0,156,158,5,30,0,0,157,156,
        1,0,0,0,158,161,1,0,0,0,159,157,1,0,0,0,159,160,1,0,0,0,160,162,
        1,0,0,0,161,159,1,0,0,0,162,166,5,13,0,0,163,165,5,30,0,0,164,163,
        1,0,0,0,165,168,1,0,0,0,166,164,1,0,0,0,166,167,1,0,0,0,167,169,
        1,0,0,0,168,166,1,0,0,0,169,170,3,32,16,0,170,19,1,0,0,0,171,175,
        5,4,0,0,172,174,5,30,0,0,173,172,1,0,0,0,174,177,1,0,0,0,175,173,
        1,0,0,0,175,176,1,0,0,0,176,178,1,0,0,0,177,175,1,0,0,0,178,179,
        3,22,11,0,179,21,1,0,0,0,180,181,3,30,15,0,181,182,5,9,0,0,182,183,
        3,24,12,0,183,23,1,0,0,0,184,188,3,26,13,0,185,188,5,29,0,0,186,
        188,5,1,0,0,187,184,1,0,0,0,187,185,1,0,0,0,187,186,1,0,0,0,188,
        25,1,0,0,0,189,190,5,16,0,0,190,191,3,28,14,0,191,192,5,16,0,0,192,
        198,1,0,0,0,193,194,5,15,0,0,194,195,3,28,14,0,195,196,5,15,0,0,
        196,198,1,0,0,0,197,189,1,0,0,0,197,193,1,0,0,0,198,27,1,0,0,0,199,
        201,5,27,0,0,200,199,1,0,0,0,201,202,1,0,0,0,202,200,1,0,0,0,202,
        203,1,0,0,0,203,29,1,0,0,0,204,212,5,28,0,0,205,206,5,15,0,0,206,
        207,5,28,0,0,207,212,5,15,0,0,208,209,5,16,0,0,209,210,5,28,0,0,
        210,212,5,16,0,0,211,204,1,0,0,0,211,205,1,0,0,0,211,208,1,0,0,0,
        212,31,1,0,0,0,213,221,5,28,0,0,214,215,5,15,0,0,215,216,5,28,0,
        0,216,221,5,15,0,0,217,218,5,16,0,0,218,219,5,28,0,0,219,221,5,16,
        0,0,220,213,1,0,0,0,220,214,1,0,0,0,220,217,1,0,0,0,221,33,1,0,0,
        0,25,38,47,54,61,68,72,79,84,89,96,103,108,117,124,131,138,149,159,
        166,175,187,197,202,211,220
    ]

class SqlParser ( Parser ):

    grammarFileName = "Sql.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "'='", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "'\"'", "'''", "','", "';'", 
                     "'.'", "'*'", "'>'", "'>='", "'<'", "'<='", "'/'" ]

    symbolicNames = [ "<INVALID>", "NUMBER", "SELECT", "FROM", "WHERE", 
                      "IN", "ON", "NOT", "EXCEPT", "EQ", "INNER_JOIN", "LEFT_JOIN", 
                      "RIGHT_JOIN", "NATURAL_JOIN", "FULL_OUTER_JOIN", "DOUBLE_QUOTATION_MARK", 
                      "SINGLE_QUOTATION_MARK", "COMMA", "SEMICOLON", "POINT", 
                      "STAR", "GREATER", "GEQ", "LOWER", "LEQ", "SLASH", 
                      "LETTER", "DIGIT", "STRING", "TEXT", "SPACE" ]

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
    RULE_formatted_date = 13
    RULE_date = 14
    RULE_table_column_name = 15
    RULE_table_name = 16

    ruleNames =  [ "whole_query", "query", "select_stmt", "every_columns", 
                   "from_stmt", "no_join_table", "inner_join_table", "inner_join_type", 
                   "inner_join_eq", "natural_join_stmt", "where_stmt", "where_condition", 
                   "obj_type", "formatted_date", "date", "table_column_name", 
                   "table_name" ]

    EOF = Token.EOF
    NUMBER=1
    SELECT=2
    FROM=3
    WHERE=4
    IN=5
    ON=6
    NOT=7
    EXCEPT=8
    EQ=9
    INNER_JOIN=10
    LEFT_JOIN=11
    RIGHT_JOIN=12
    NATURAL_JOIN=13
    FULL_OUTER_JOIN=14
    DOUBLE_QUOTATION_MARK=15
    SINGLE_QUOTATION_MARK=16
    COMMA=17
    SEMICOLON=18
    POINT=19
    STAR=20
    GREATER=21
    GEQ=22
    LOWER=23
    LEQ=24
    SLASH=25
    LETTER=26
    DIGIT=27
    STRING=28
    TEXT=29
    SPACE=30

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
            self.state = 34
            self.query()
            self.state = 38
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==30:
                self.state = 35
                self.match(SqlParser.SPACE)
                self.state = 40
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 41
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
            self.state = 43
            self.match(SqlParser.SELECT)
            self.state = 47
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==30:
                self.state = 44
                self.match(SqlParser.SPACE)
                self.state = 49
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 50
            self.select_stmt()
            self.state = 54
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==30:
                self.state = 51
                self.match(SqlParser.SPACE)
                self.state = 56
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 57
            self.match(SqlParser.FROM)
            self.state = 61
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==30:
                self.state = 58
                self.match(SqlParser.SPACE)
                self.state = 63
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 64
            self.from_stmt()
            self.state = 68
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,4,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 65
                    self.match(SqlParser.SPACE) 
                self.state = 70
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,4,self._ctx)

            self.state = 72
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==4:
                self.state = 71
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
            self.state = 89
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [15, 16, 28]:
                self.enterOuterAlt(localctx, 1)
                self.state = 84
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,7,self._ctx)
                while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                    if _alt==1:
                        self.state = 74
                        self.table_column_name()
                        self.state = 75
                        self.match(SqlParser.COMMA)
                        self.state = 79
                        self._errHandler.sync(self)
                        _la = self._input.LA(1)
                        while _la==30:
                            self.state = 76
                            self.match(SqlParser.SPACE)
                            self.state = 81
                            self._errHandler.sync(self)
                            _la = self._input.LA(1)
                 
                    self.state = 86
                    self._errHandler.sync(self)
                    _alt = self._interp.adaptivePredict(self._input,7,self._ctx)

                self.state = 87
                self.table_column_name()
                pass
            elif token in [20]:
                self.enterOuterAlt(localctx, 2)
                self.state = 88
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
            self.state = 91
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
            self.state = 96
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,9,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 93
                self.no_join_table()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 94
                self.inner_join_table()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 95
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
            self.state = 108
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,11,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 98
                    self.table_name()
                    self.state = 99
                    self.match(SqlParser.COMMA)
                    self.state = 103
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    while _la==30:
                        self.state = 100
                        self.match(SqlParser.SPACE)
                        self.state = 105
                        self._errHandler.sync(self)
                        _la = self._input.LA(1)
             
                self.state = 110
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,11,self._ctx)

            self.state = 111
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
            self.state = 113
            self.table_name()
            self.state = 117
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==30:
                self.state = 114
                self.match(SqlParser.SPACE)
                self.state = 119
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 120
            self.inner_join_type()
            self.state = 124
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==30:
                self.state = 121
                self.match(SqlParser.SPACE)
                self.state = 126
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 127
            self.table_name()
            self.state = 131
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==30:
                self.state = 128
                self.match(SqlParser.SPACE)
                self.state = 133
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 134
            self.match(SqlParser.ON)
            self.state = 138
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==30:
                self.state = 135
                self.match(SqlParser.SPACE)
                self.state = 140
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 141
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
            self.state = 143
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 23552) != 0)):
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
            self.state = 145
            self.table_column_name()
            self.state = 149
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==30:
                self.state = 146
                self.match(SqlParser.SPACE)
                self.state = 151
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 152
            self.match(SqlParser.EQ)
            self.state = 153
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
            self.state = 155
            self.table_name()
            self.state = 159
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==30:
                self.state = 156
                self.match(SqlParser.SPACE)
                self.state = 161
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 162
            self.match(SqlParser.NATURAL_JOIN)
            self.state = 166
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==30:
                self.state = 163
                self.match(SqlParser.SPACE)
                self.state = 168
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 169
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
            self.state = 171
            self.match(SqlParser.WHERE)
            self.state = 175
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==30:
                self.state = 172
                self.match(SqlParser.SPACE)
                self.state = 177
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 178
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
            self.state = 180
            self.table_column_name()
            self.state = 181
            self.match(SqlParser.EQ)
            self.state = 182
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

        def formatted_date(self):
            return self.getTypedRuleContext(SqlParser.Formatted_dateContext,0)


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
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 187
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [15, 16]:
                self.state = 184
                self.formatted_date()
                pass
            elif token in [29]:
                self.state = 185
                self.match(SqlParser.TEXT)
                pass
            elif token in [1]:
                self.state = 186
                self.match(SqlParser.NUMBER)
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


    class Formatted_dateContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def SINGLE_QUOTATION_MARK(self, i:int=None):
            if i is None:
                return self.getTokens(SqlParser.SINGLE_QUOTATION_MARK)
            else:
                return self.getToken(SqlParser.SINGLE_QUOTATION_MARK, i)

        def date(self):
            return self.getTypedRuleContext(SqlParser.DateContext,0)


        def DOUBLE_QUOTATION_MARK(self, i:int=None):
            if i is None:
                return self.getTokens(SqlParser.DOUBLE_QUOTATION_MARK)
            else:
                return self.getToken(SqlParser.DOUBLE_QUOTATION_MARK, i)

        def getRuleIndex(self):
            return SqlParser.RULE_formatted_date

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFormatted_date" ):
                listener.enterFormatted_date(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFormatted_date" ):
                listener.exitFormatted_date(self)




    def formatted_date(self):

        localctx = SqlParser.Formatted_dateContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_formatted_date)
        try:
            self.state = 197
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [16]:
                self.enterOuterAlt(localctx, 1)
                self.state = 189
                self.match(SqlParser.SINGLE_QUOTATION_MARK)
                self.state = 190
                self.date()
                self.state = 191
                self.match(SqlParser.SINGLE_QUOTATION_MARK)
                pass
            elif token in [15]:
                self.enterOuterAlt(localctx, 2)
                self.state = 193
                self.match(SqlParser.DOUBLE_QUOTATION_MARK)
                self.state = 194
                self.date()
                self.state = 195
                self.match(SqlParser.DOUBLE_QUOTATION_MARK)
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


    class DateContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def DIGIT(self, i:int=None):
            if i is None:
                return self.getTokens(SqlParser.DIGIT)
            else:
                return self.getToken(SqlParser.DIGIT, i)

        def getRuleIndex(self):
            return SqlParser.RULE_date

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDate" ):
                listener.enterDate(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDate" ):
                listener.exitDate(self)




    def date(self):

        localctx = SqlParser.DateContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_date)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 200 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 199
                self.match(SqlParser.DIGIT)
                self.state = 202 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==27):
                    break

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
        self.enterRule(localctx, 30, self.RULE_table_column_name)
        try:
            self.state = 211
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [28]:
                self.enterOuterAlt(localctx, 1)
                self.state = 204
                self.match(SqlParser.STRING)
                pass
            elif token in [15]:
                self.enterOuterAlt(localctx, 2)
                self.state = 205
                self.match(SqlParser.DOUBLE_QUOTATION_MARK)
                self.state = 206
                self.match(SqlParser.STRING)
                self.state = 207
                self.match(SqlParser.DOUBLE_QUOTATION_MARK)
                pass
            elif token in [16]:
                self.enterOuterAlt(localctx, 3)
                self.state = 208
                self.match(SqlParser.SINGLE_QUOTATION_MARK)
                self.state = 209
                self.match(SqlParser.STRING)
                self.state = 210
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
        self.enterRule(localctx, 32, self.RULE_table_name)
        try:
            self.state = 220
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [28]:
                self.enterOuterAlt(localctx, 1)
                self.state = 213
                self.match(SqlParser.STRING)
                pass
            elif token in [15]:
                self.enterOuterAlt(localctx, 2)
                self.state = 214
                self.match(SqlParser.DOUBLE_QUOTATION_MARK)
                self.state = 215
                self.match(SqlParser.STRING)
                self.state = 216
                self.match(SqlParser.DOUBLE_QUOTATION_MARK)
                pass
            elif token in [16]:
                self.enterOuterAlt(localctx, 3)
                self.state = 217
                self.match(SqlParser.SINGLE_QUOTATION_MARK)
                self.state = 218
                self.match(SqlParser.STRING)
                self.state = 219
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






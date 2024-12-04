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
        4,1,40,267,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,2,20,
        7,20,2,21,7,21,1,0,1,0,5,0,47,8,0,10,0,12,0,50,9,0,1,0,1,0,1,1,1,
        1,5,1,56,8,1,10,1,12,1,59,9,1,1,1,1,1,5,1,63,8,1,10,1,12,1,66,9,
        1,1,1,1,1,5,1,70,8,1,10,1,12,1,73,9,1,1,1,1,1,5,1,77,8,1,10,1,12,
        1,80,9,1,1,1,3,1,83,8,1,1,2,1,2,1,2,5,2,88,8,2,10,2,12,2,91,9,2,
        5,2,93,8,2,10,2,12,2,96,9,2,1,2,1,2,3,2,100,8,2,1,3,1,3,1,4,1,4,
        1,4,3,4,107,8,4,1,5,1,5,1,5,5,5,112,8,5,10,5,12,5,115,9,5,5,5,117,
        8,5,10,5,12,5,120,9,5,1,5,1,5,1,6,1,6,5,6,126,8,6,10,6,12,6,129,
        9,6,1,6,1,6,5,6,133,8,6,10,6,12,6,136,9,6,1,6,1,6,5,6,140,8,6,10,
        6,12,6,143,9,6,1,6,1,6,5,6,147,8,6,10,6,12,6,150,9,6,1,6,1,6,1,7,
        1,7,1,8,1,8,5,8,158,8,8,10,8,12,8,161,9,8,1,8,1,8,1,8,1,9,1,9,5,
        9,168,8,9,10,9,12,9,171,9,9,1,9,1,9,5,9,175,8,9,10,9,12,9,178,9,
        9,1,9,1,9,1,10,1,10,5,10,184,8,10,10,10,12,10,187,9,10,1,10,1,10,
        1,11,1,11,1,11,1,11,3,11,195,8,11,1,12,1,12,1,12,1,12,1,13,1,13,
        1,13,1,13,1,13,1,13,1,14,1,14,1,14,1,14,1,14,1,14,1,14,1,14,1,14,
        3,14,216,8,14,1,15,1,15,1,15,1,15,1,15,1,16,1,16,1,16,1,16,3,16,
        227,8,16,1,17,1,17,1,17,1,17,3,17,233,8,17,1,17,1,17,1,17,1,17,1,
        17,1,17,3,17,241,8,17,3,17,243,8,17,1,18,1,18,1,19,1,19,1,20,1,20,
        1,20,1,20,1,20,1,20,1,20,3,20,256,8,20,1,21,1,21,1,21,1,21,1,21,
        1,21,1,21,3,21,265,8,21,1,21,0,0,22,0,2,4,6,8,10,12,14,16,18,20,
        22,24,26,28,30,32,34,36,38,40,42,0,3,2,0,12,14,16,16,2,0,10,11,25,
        28,3,0,1,1,19,19,37,37,281,0,44,1,0,0,0,2,53,1,0,0,0,4,99,1,0,0,
        0,6,101,1,0,0,0,8,106,1,0,0,0,10,118,1,0,0,0,12,123,1,0,0,0,14,153,
        1,0,0,0,16,155,1,0,0,0,18,165,1,0,0,0,20,181,1,0,0,0,22,194,1,0,
        0,0,24,196,1,0,0,0,26,200,1,0,0,0,28,215,1,0,0,0,30,217,1,0,0,0,
        32,226,1,0,0,0,34,242,1,0,0,0,36,244,1,0,0,0,38,246,1,0,0,0,40,255,
        1,0,0,0,42,264,1,0,0,0,44,48,3,2,1,0,45,47,5,40,0,0,46,45,1,0,0,
        0,47,50,1,0,0,0,48,46,1,0,0,0,48,49,1,0,0,0,49,51,1,0,0,0,50,48,
        1,0,0,0,51,52,5,22,0,0,52,1,1,0,0,0,53,57,5,3,0,0,54,56,5,40,0,0,
        55,54,1,0,0,0,56,59,1,0,0,0,57,55,1,0,0,0,57,58,1,0,0,0,58,60,1,
        0,0,0,59,57,1,0,0,0,60,64,3,4,2,0,61,63,5,40,0,0,62,61,1,0,0,0,63,
        66,1,0,0,0,64,62,1,0,0,0,64,65,1,0,0,0,65,67,1,0,0,0,66,64,1,0,0,
        0,67,71,5,4,0,0,68,70,5,40,0,0,69,68,1,0,0,0,70,73,1,0,0,0,71,69,
        1,0,0,0,71,72,1,0,0,0,72,74,1,0,0,0,73,71,1,0,0,0,74,78,3,8,4,0,
        75,77,5,40,0,0,76,75,1,0,0,0,77,80,1,0,0,0,78,76,1,0,0,0,78,79,1,
        0,0,0,79,82,1,0,0,0,80,78,1,0,0,0,81,83,3,20,10,0,82,81,1,0,0,0,
        82,83,1,0,0,0,83,3,1,0,0,0,84,85,3,40,20,0,85,89,5,21,0,0,86,88,
        5,40,0,0,87,86,1,0,0,0,88,91,1,0,0,0,89,87,1,0,0,0,89,90,1,0,0,0,
        90,93,1,0,0,0,91,89,1,0,0,0,92,84,1,0,0,0,93,96,1,0,0,0,94,92,1,
        0,0,0,94,95,1,0,0,0,95,97,1,0,0,0,96,94,1,0,0,0,97,100,3,40,20,0,
        98,100,3,6,3,0,99,94,1,0,0,0,99,98,1,0,0,0,100,5,1,0,0,0,101,102,
        5,24,0,0,102,7,1,0,0,0,103,107,3,10,5,0,104,107,3,12,6,0,105,107,
        3,18,9,0,106,103,1,0,0,0,106,104,1,0,0,0,106,105,1,0,0,0,107,9,1,
        0,0,0,108,109,3,42,21,0,109,113,5,21,0,0,110,112,5,40,0,0,111,110,
        1,0,0,0,112,115,1,0,0,0,113,111,1,0,0,0,113,114,1,0,0,0,114,117,
        1,0,0,0,115,113,1,0,0,0,116,108,1,0,0,0,117,120,1,0,0,0,118,116,
        1,0,0,0,118,119,1,0,0,0,119,121,1,0,0,0,120,118,1,0,0,0,121,122,
        3,42,21,0,122,11,1,0,0,0,123,127,3,42,21,0,124,126,5,40,0,0,125,
        124,1,0,0,0,126,129,1,0,0,0,127,125,1,0,0,0,127,128,1,0,0,0,128,
        130,1,0,0,0,129,127,1,0,0,0,130,134,3,14,7,0,131,133,5,40,0,0,132,
        131,1,0,0,0,133,136,1,0,0,0,134,132,1,0,0,0,134,135,1,0,0,0,135,
        137,1,0,0,0,136,134,1,0,0,0,137,141,3,42,21,0,138,140,5,40,0,0,139,
        138,1,0,0,0,140,143,1,0,0,0,141,139,1,0,0,0,141,142,1,0,0,0,142,
        144,1,0,0,0,143,141,1,0,0,0,144,148,5,7,0,0,145,147,5,40,0,0,146,
        145,1,0,0,0,147,150,1,0,0,0,148,146,1,0,0,0,148,149,1,0,0,0,149,
        151,1,0,0,0,150,148,1,0,0,0,151,152,3,16,8,0,152,13,1,0,0,0,153,
        154,7,0,0,0,154,15,1,0,0,0,155,159,3,40,20,0,156,158,5,40,0,0,157,
        156,1,0,0,0,158,161,1,0,0,0,159,157,1,0,0,0,159,160,1,0,0,0,160,
        162,1,0,0,0,161,159,1,0,0,0,162,163,5,10,0,0,163,164,3,40,20,0,164,
        17,1,0,0,0,165,169,3,42,21,0,166,168,5,40,0,0,167,166,1,0,0,0,168,
        171,1,0,0,0,169,167,1,0,0,0,169,170,1,0,0,0,170,172,1,0,0,0,171,
        169,1,0,0,0,172,176,5,15,0,0,173,175,5,40,0,0,174,173,1,0,0,0,175,
        178,1,0,0,0,176,174,1,0,0,0,176,177,1,0,0,0,177,179,1,0,0,0,178,
        176,1,0,0,0,179,180,3,42,21,0,180,19,1,0,0,0,181,185,5,5,0,0,182,
        184,5,40,0,0,183,182,1,0,0,0,184,187,1,0,0,0,185,183,1,0,0,0,185,
        186,1,0,0,0,186,188,1,0,0,0,187,185,1,0,0,0,188,189,3,22,11,0,189,
        21,1,0,0,0,190,195,3,24,12,0,191,195,3,26,13,0,192,195,3,28,14,0,
        193,195,3,30,15,0,194,190,1,0,0,0,194,191,1,0,0,0,194,192,1,0,0,
        0,194,193,1,0,0,0,195,23,1,0,0,0,196,197,3,40,20,0,197,198,3,36,
        18,0,198,199,3,38,19,0,199,25,1,0,0,0,200,201,3,40,20,0,201,202,
        5,32,0,0,202,203,3,38,19,0,203,204,5,33,0,0,204,205,3,38,19,0,205,
        27,1,0,0,0,206,207,3,40,20,0,207,208,5,34,0,0,208,209,5,37,0,0,209,
        216,1,0,0,0,210,211,3,40,20,0,211,212,5,8,0,0,212,213,5,34,0,0,213,
        214,5,37,0,0,214,216,1,0,0,0,215,206,1,0,0,0,215,210,1,0,0,0,216,
        29,1,0,0,0,217,218,3,32,16,0,218,219,5,30,0,0,219,220,3,34,17,0,
        220,221,5,31,0,0,221,31,1,0,0,0,222,223,5,38,0,0,223,224,5,23,0,
        0,224,227,5,38,0,0,225,227,5,38,0,0,226,222,1,0,0,0,226,225,1,0,
        0,0,227,33,1,0,0,0,228,233,5,1,0,0,229,233,5,37,0,0,230,233,5,19,
        0,0,231,233,3,40,20,0,232,228,1,0,0,0,232,229,1,0,0,0,232,230,1,
        0,0,0,232,231,1,0,0,0,233,234,1,0,0,0,234,235,5,21,0,0,235,243,3,
        34,17,0,236,241,5,1,0,0,237,241,5,37,0,0,238,241,5,19,0,0,239,241,
        3,40,20,0,240,236,1,0,0,0,240,237,1,0,0,0,240,238,1,0,0,0,240,239,
        1,0,0,0,241,243,1,0,0,0,242,232,1,0,0,0,242,240,1,0,0,0,243,35,1,
        0,0,0,244,245,7,1,0,0,245,37,1,0,0,0,246,247,7,2,0,0,247,39,1,0,
        0,0,248,256,5,38,0,0,249,250,5,17,0,0,250,251,5,38,0,0,251,256,5,
        17,0,0,252,253,5,18,0,0,253,254,5,38,0,0,254,256,5,18,0,0,255,248,
        1,0,0,0,255,249,1,0,0,0,255,252,1,0,0,0,256,41,1,0,0,0,257,265,5,
        38,0,0,258,259,5,17,0,0,259,260,5,38,0,0,260,265,5,17,0,0,261,262,
        5,18,0,0,262,263,5,38,0,0,263,265,5,18,0,0,264,257,1,0,0,0,264,258,
        1,0,0,0,264,261,1,0,0,0,265,43,1,0,0,0,28,48,57,64,71,78,82,89,94,
        99,106,113,118,127,134,141,148,159,169,176,185,194,215,226,232,240,
        242,255,264
    ]

class SqlParser ( Parser ):

    grammarFileName = "Sql.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "'='", "'!='", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "'\"'", "'''", "<INVALID>", "<INVALID>", "','", "';'", 
                     "'.'", "'*'", "'>'", "'>='", "'<'", "'<='", "'/'", 
                     "'('", "')'" ]

    symbolicNames = [ "<INVALID>", "QUOTED_DATE", "DATE", "SELECT", "FROM", 
                      "WHERE", "IN", "ON", "NOT", "EXCEPT", "EQ", "DIFFERENT", 
                      "INNER_JOIN", "LEFT_JOIN", "RIGHT_JOIN", "NATURAL_JOIN", 
                      "FULL_OUTER_JOIN", "DOUBLE_QUOTATION_MARK", "SINGLE_QUOTATION_MARK", 
                      "NUMBER", "DECIMAL_PART", "COMMA", "SEMICOLON", "POINT", 
                      "STAR", "GREATER", "GEQ", "LOWER", "LEQ", "SLASH", 
                      "OPAR", "CPAR", "BETWEEN", "AND", "LIKE", "LETTER", 
                      "DIGIT", "TEXT", "STRING", "FUNCTION_NAME", "SPACE" ]

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
    RULE_where_simple_condition = 12
    RULE_where_between_condition = 13
    RULE_where_like_condition = 14
    RULE_where_function_condition = 15
    RULE_function_name = 16
    RULE_argument_list = 17
    RULE_eq_type = 18
    RULE_obj_type = 19
    RULE_table_column_name = 20
    RULE_table_name = 21

    ruleNames =  [ "whole_query", "query", "select_stmt", "every_columns", 
                   "from_stmt", "no_join_table", "inner_join_table", "inner_join_type", 
                   "inner_join_eq", "natural_join_stmt", "where_stmt", "where_condition", 
                   "where_simple_condition", "where_between_condition", 
                   "where_like_condition", "where_function_condition", "function_name", 
                   "argument_list", "eq_type", "obj_type", "table_column_name", 
                   "table_name" ]

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
    DIFFERENT=11
    INNER_JOIN=12
    LEFT_JOIN=13
    RIGHT_JOIN=14
    NATURAL_JOIN=15
    FULL_OUTER_JOIN=16
    DOUBLE_QUOTATION_MARK=17
    SINGLE_QUOTATION_MARK=18
    NUMBER=19
    DECIMAL_PART=20
    COMMA=21
    SEMICOLON=22
    POINT=23
    STAR=24
    GREATER=25
    GEQ=26
    LOWER=27
    LEQ=28
    SLASH=29
    OPAR=30
    CPAR=31
    BETWEEN=32
    AND=33
    LIKE=34
    LETTER=35
    DIGIT=36
    TEXT=37
    STRING=38
    FUNCTION_NAME=39
    SPACE=40

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
            self.state = 44
            self.query()
            self.state = 48
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==40:
                self.state = 45
                self.match(SqlParser.SPACE)
                self.state = 50
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 51
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
            self.state = 53
            self.match(SqlParser.SELECT)
            self.state = 57
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==40:
                self.state = 54
                self.match(SqlParser.SPACE)
                self.state = 59
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 60
            self.select_stmt()
            self.state = 64
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==40:
                self.state = 61
                self.match(SqlParser.SPACE)
                self.state = 66
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 67
            self.match(SqlParser.FROM)
            self.state = 71
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==40:
                self.state = 68
                self.match(SqlParser.SPACE)
                self.state = 73
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 74
            self.from_stmt()
            self.state = 78
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,4,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 75
                    self.match(SqlParser.SPACE) 
                self.state = 80
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,4,self._ctx)

            self.state = 82
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==5:
                self.state = 81
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
            self.state = 99
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [17, 18, 38]:
                self.enterOuterAlt(localctx, 1)
                self.state = 94
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,7,self._ctx)
                while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                    if _alt==1:
                        self.state = 84
                        self.table_column_name()
                        self.state = 85
                        self.match(SqlParser.COMMA)
                        self.state = 89
                        self._errHandler.sync(self)
                        _la = self._input.LA(1)
                        while _la==40:
                            self.state = 86
                            self.match(SqlParser.SPACE)
                            self.state = 91
                            self._errHandler.sync(self)
                            _la = self._input.LA(1)
                 
                    self.state = 96
                    self._errHandler.sync(self)
                    _alt = self._interp.adaptivePredict(self._input,7,self._ctx)

                self.state = 97
                self.table_column_name()
                pass
            elif token in [24]:
                self.enterOuterAlt(localctx, 2)
                self.state = 98
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
            self.state = 101
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
            self.state = 106
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,9,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 103
                self.no_join_table()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 104
                self.inner_join_table()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 105
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
            self.state = 118
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,11,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 108
                    self.table_name()
                    self.state = 109
                    self.match(SqlParser.COMMA)
                    self.state = 113
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    while _la==40:
                        self.state = 110
                        self.match(SqlParser.SPACE)
                        self.state = 115
                        self._errHandler.sync(self)
                        _la = self._input.LA(1)
             
                self.state = 120
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,11,self._ctx)

            self.state = 121
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
            self.state = 123
            self.table_name()
            self.state = 127
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==40:
                self.state = 124
                self.match(SqlParser.SPACE)
                self.state = 129
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 130
            self.inner_join_type()
            self.state = 134
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==40:
                self.state = 131
                self.match(SqlParser.SPACE)
                self.state = 136
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 137
            self.table_name()
            self.state = 141
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==40:
                self.state = 138
                self.match(SqlParser.SPACE)
                self.state = 143
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 144
            self.match(SqlParser.ON)
            self.state = 148
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==40:
                self.state = 145
                self.match(SqlParser.SPACE)
                self.state = 150
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 151
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
            self.state = 153
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 94208) != 0)):
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
            self.state = 155
            self.table_column_name()
            self.state = 159
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==40:
                self.state = 156
                self.match(SqlParser.SPACE)
                self.state = 161
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 162
            self.match(SqlParser.EQ)
            self.state = 163
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
            self.state = 165
            self.table_name()
            self.state = 169
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==40:
                self.state = 166
                self.match(SqlParser.SPACE)
                self.state = 171
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 172
            self.match(SqlParser.NATURAL_JOIN)
            self.state = 176
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==40:
                self.state = 173
                self.match(SqlParser.SPACE)
                self.state = 178
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 179
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
            self.state = 181
            self.match(SqlParser.WHERE)
            self.state = 185
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==40:
                self.state = 182
                self.match(SqlParser.SPACE)
                self.state = 187
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 188
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

        def where_simple_condition(self):
            return self.getTypedRuleContext(SqlParser.Where_simple_conditionContext,0)


        def where_between_condition(self):
            return self.getTypedRuleContext(SqlParser.Where_between_conditionContext,0)


        def where_like_condition(self):
            return self.getTypedRuleContext(SqlParser.Where_like_conditionContext,0)


        def where_function_condition(self):
            return self.getTypedRuleContext(SqlParser.Where_function_conditionContext,0)


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
            self.state = 194
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,20,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 190
                self.where_simple_condition()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 191
                self.where_between_condition()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 192
                self.where_like_condition()
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 193
                self.where_function_condition()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Where_simple_conditionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def table_column_name(self):
            return self.getTypedRuleContext(SqlParser.Table_column_nameContext,0)


        def eq_type(self):
            return self.getTypedRuleContext(SqlParser.Eq_typeContext,0)


        def obj_type(self):
            return self.getTypedRuleContext(SqlParser.Obj_typeContext,0)


        def getRuleIndex(self):
            return SqlParser.RULE_where_simple_condition

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterWhere_simple_condition" ):
                listener.enterWhere_simple_condition(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitWhere_simple_condition" ):
                listener.exitWhere_simple_condition(self)




    def where_simple_condition(self):

        localctx = SqlParser.Where_simple_conditionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_where_simple_condition)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 196
            self.table_column_name()
            self.state = 197
            self.eq_type()
            self.state = 198
            self.obj_type()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Where_between_conditionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def table_column_name(self):
            return self.getTypedRuleContext(SqlParser.Table_column_nameContext,0)


        def BETWEEN(self):
            return self.getToken(SqlParser.BETWEEN, 0)

        def obj_type(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SqlParser.Obj_typeContext)
            else:
                return self.getTypedRuleContext(SqlParser.Obj_typeContext,i)


        def AND(self):
            return self.getToken(SqlParser.AND, 0)

        def getRuleIndex(self):
            return SqlParser.RULE_where_between_condition

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterWhere_between_condition" ):
                listener.enterWhere_between_condition(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitWhere_between_condition" ):
                listener.exitWhere_between_condition(self)




    def where_between_condition(self):

        localctx = SqlParser.Where_between_conditionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_where_between_condition)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 200
            self.table_column_name()
            self.state = 201
            self.match(SqlParser.BETWEEN)
            self.state = 202
            self.obj_type()
            self.state = 203
            self.match(SqlParser.AND)
            self.state = 204
            self.obj_type()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Where_like_conditionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def table_column_name(self):
            return self.getTypedRuleContext(SqlParser.Table_column_nameContext,0)


        def LIKE(self):
            return self.getToken(SqlParser.LIKE, 0)

        def TEXT(self):
            return self.getToken(SqlParser.TEXT, 0)

        def NOT(self):
            return self.getToken(SqlParser.NOT, 0)

        def getRuleIndex(self):
            return SqlParser.RULE_where_like_condition

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterWhere_like_condition" ):
                listener.enterWhere_like_condition(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitWhere_like_condition" ):
                listener.exitWhere_like_condition(self)




    def where_like_condition(self):

        localctx = SqlParser.Where_like_conditionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_where_like_condition)
        try:
            self.state = 215
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,21,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 206
                self.table_column_name()
                self.state = 207
                self.match(SqlParser.LIKE)
                self.state = 208
                self.match(SqlParser.TEXT)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 210
                self.table_column_name()
                self.state = 211
                self.match(SqlParser.NOT)
                self.state = 212
                self.match(SqlParser.LIKE)
                self.state = 213
                self.match(SqlParser.TEXT)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Where_function_conditionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def function_name(self):
            return self.getTypedRuleContext(SqlParser.Function_nameContext,0)


        def OPAR(self):
            return self.getToken(SqlParser.OPAR, 0)

        def argument_list(self):
            return self.getTypedRuleContext(SqlParser.Argument_listContext,0)


        def CPAR(self):
            return self.getToken(SqlParser.CPAR, 0)

        def getRuleIndex(self):
            return SqlParser.RULE_where_function_condition

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterWhere_function_condition" ):
                listener.enterWhere_function_condition(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitWhere_function_condition" ):
                listener.exitWhere_function_condition(self)




    def where_function_condition(self):

        localctx = SqlParser.Where_function_conditionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_where_function_condition)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 217
            self.function_name()
            self.state = 218
            self.match(SqlParser.OPAR)
            self.state = 219
            self.argument_list()
            self.state = 220
            self.match(SqlParser.CPAR)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Function_nameContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def STRING(self, i:int=None):
            if i is None:
                return self.getTokens(SqlParser.STRING)
            else:
                return self.getToken(SqlParser.STRING, i)

        def POINT(self):
            return self.getToken(SqlParser.POINT, 0)

        def getRuleIndex(self):
            return SqlParser.RULE_function_name

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFunction_name" ):
                listener.enterFunction_name(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFunction_name" ):
                listener.exitFunction_name(self)




    def function_name(self):

        localctx = SqlParser.Function_nameContext(self, self._ctx, self.state)
        self.enterRule(localctx, 32, self.RULE_function_name)
        try:
            self.state = 226
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,22,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 222
                self.match(SqlParser.STRING)
                self.state = 223
                self.match(SqlParser.POINT)
                self.state = 224
                self.match(SqlParser.STRING)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 225
                self.match(SqlParser.STRING)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Argument_listContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def COMMA(self):
            return self.getToken(SqlParser.COMMA, 0)

        def argument_list(self):
            return self.getTypedRuleContext(SqlParser.Argument_listContext,0)


        def QUOTED_DATE(self):
            return self.getToken(SqlParser.QUOTED_DATE, 0)

        def TEXT(self):
            return self.getToken(SqlParser.TEXT, 0)

        def NUMBER(self):
            return self.getToken(SqlParser.NUMBER, 0)

        def table_column_name(self):
            return self.getTypedRuleContext(SqlParser.Table_column_nameContext,0)


        def getRuleIndex(self):
            return SqlParser.RULE_argument_list

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterArgument_list" ):
                listener.enterArgument_list(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitArgument_list" ):
                listener.exitArgument_list(self)




    def argument_list(self):

        localctx = SqlParser.Argument_listContext(self, self._ctx, self.state)
        self.enterRule(localctx, 34, self.RULE_argument_list)
        try:
            self.state = 242
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,25,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 232
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [1]:
                    self.state = 228
                    self.match(SqlParser.QUOTED_DATE)
                    pass
                elif token in [37]:
                    self.state = 229
                    self.match(SqlParser.TEXT)
                    pass
                elif token in [19]:
                    self.state = 230
                    self.match(SqlParser.NUMBER)
                    pass
                elif token in [17, 18, 38]:
                    self.state = 231
                    self.table_column_name()
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 234
                self.match(SqlParser.COMMA)
                self.state = 235
                self.argument_list()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 240
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [1]:
                    self.state = 236
                    self.match(SqlParser.QUOTED_DATE)
                    pass
                elif token in [37]:
                    self.state = 237
                    self.match(SqlParser.TEXT)
                    pass
                elif token in [19]:
                    self.state = 238
                    self.match(SqlParser.NUMBER)
                    pass
                elif token in [17, 18, 38]:
                    self.state = 239
                    self.table_column_name()
                    pass
                else:
                    raise NoViableAltException(self)

                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Eq_typeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EQ(self):
            return self.getToken(SqlParser.EQ, 0)

        def GREATER(self):
            return self.getToken(SqlParser.GREATER, 0)

        def LOWER(self):
            return self.getToken(SqlParser.LOWER, 0)

        def GEQ(self):
            return self.getToken(SqlParser.GEQ, 0)

        def LEQ(self):
            return self.getToken(SqlParser.LEQ, 0)

        def DIFFERENT(self):
            return self.getToken(SqlParser.DIFFERENT, 0)

        def getRuleIndex(self):
            return SqlParser.RULE_eq_type

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterEq_type" ):
                listener.enterEq_type(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitEq_type" ):
                listener.exitEq_type(self)




    def eq_type(self):

        localctx = SqlParser.Eq_typeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 36, self.RULE_eq_type)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 244
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 503319552) != 0)):
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
        self.enterRule(localctx, 38, self.RULE_obj_type)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 246
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 137439477762) != 0)):
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
        self.enterRule(localctx, 40, self.RULE_table_column_name)
        try:
            self.state = 255
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [38]:
                self.enterOuterAlt(localctx, 1)
                self.state = 248
                self.match(SqlParser.STRING)
                pass
            elif token in [17]:
                self.enterOuterAlt(localctx, 2)
                self.state = 249
                self.match(SqlParser.DOUBLE_QUOTATION_MARK)
                self.state = 250
                self.match(SqlParser.STRING)
                self.state = 251
                self.match(SqlParser.DOUBLE_QUOTATION_MARK)
                pass
            elif token in [18]:
                self.enterOuterAlt(localctx, 3)
                self.state = 252
                self.match(SqlParser.SINGLE_QUOTATION_MARK)
                self.state = 253
                self.match(SqlParser.STRING)
                self.state = 254
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
        self.enterRule(localctx, 42, self.RULE_table_name)
        try:
            self.state = 264
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [38]:
                self.enterOuterAlt(localctx, 1)
                self.state = 257
                self.match(SqlParser.STRING)
                pass
            elif token in [17]:
                self.enterOuterAlt(localctx, 2)
                self.state = 258
                self.match(SqlParser.DOUBLE_QUOTATION_MARK)
                self.state = 259
                self.match(SqlParser.STRING)
                self.state = 260
                self.match(SqlParser.DOUBLE_QUOTATION_MARK)
                pass
            elif token in [18]:
                self.enterOuterAlt(localctx, 3)
                self.state = 261
                self.match(SqlParser.SINGLE_QUOTATION_MARK)
                self.state = 262
                self.match(SqlParser.STRING)
                self.state = 263
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






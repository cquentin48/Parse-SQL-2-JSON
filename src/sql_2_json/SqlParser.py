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
        4,1,27,165,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,1,0,1,0,1,1,1,1,5,
        1,29,8,1,10,1,12,1,32,9,1,1,1,1,1,5,1,36,8,1,10,1,12,1,39,9,1,1,
        1,1,1,5,1,43,8,1,10,1,12,1,46,9,1,1,1,1,1,1,2,1,2,1,2,5,2,53,8,2,
        10,2,12,2,56,9,2,5,2,58,8,2,10,2,12,2,61,9,2,1,2,1,2,3,2,65,8,2,
        1,3,1,3,1,3,3,3,70,8,3,1,4,1,4,1,4,5,4,75,8,4,10,4,12,4,78,9,4,5,
        4,80,8,4,10,4,12,4,83,9,4,1,4,1,4,1,5,1,5,5,5,89,8,5,10,5,12,5,92,
        9,5,1,5,1,5,5,5,96,8,5,10,5,12,5,99,9,5,1,5,1,5,5,5,103,8,5,10,5,
        12,5,106,9,5,1,5,1,5,5,5,110,8,5,10,5,12,5,113,9,5,1,5,1,5,1,6,1,
        6,1,7,1,7,5,7,121,8,7,10,7,12,7,124,9,7,1,7,1,7,1,7,1,8,1,8,5,8,
        131,8,8,10,8,12,8,134,9,8,1,8,1,8,5,8,138,8,8,10,8,12,8,141,9,8,
        1,8,1,8,1,9,1,9,1,10,1,10,1,10,1,10,1,10,1,10,1,10,3,10,154,8,10,
        1,11,1,11,1,11,1,11,1,11,1,11,1,11,3,11,163,8,11,1,11,0,0,12,0,2,
        4,6,8,10,12,14,16,18,20,22,0,1,1,0,10,12,173,0,24,1,0,0,0,2,26,1,
        0,0,0,4,64,1,0,0,0,6,69,1,0,0,0,8,81,1,0,0,0,10,86,1,0,0,0,12,116,
        1,0,0,0,14,118,1,0,0,0,16,128,1,0,0,0,18,144,1,0,0,0,20,153,1,0,
        0,0,22,162,1,0,0,0,24,25,3,2,1,0,25,1,1,0,0,0,26,30,5,2,0,0,27,29,
        5,26,0,0,28,27,1,0,0,0,29,32,1,0,0,0,30,28,1,0,0,0,30,31,1,0,0,0,
        31,33,1,0,0,0,32,30,1,0,0,0,33,37,3,4,2,0,34,36,5,26,0,0,35,34,1,
        0,0,0,36,39,1,0,0,0,37,35,1,0,0,0,37,38,1,0,0,0,38,40,1,0,0,0,39,
        37,1,0,0,0,40,44,5,3,0,0,41,43,5,26,0,0,42,41,1,0,0,0,43,46,1,0,
        0,0,44,42,1,0,0,0,44,45,1,0,0,0,45,47,1,0,0,0,46,44,1,0,0,0,47,48,
        3,6,3,0,48,3,1,0,0,0,49,50,3,20,10,0,50,54,5,16,0,0,51,53,5,26,0,
        0,52,51,1,0,0,0,53,56,1,0,0,0,54,52,1,0,0,0,54,55,1,0,0,0,55,58,
        1,0,0,0,56,54,1,0,0,0,57,49,1,0,0,0,58,61,1,0,0,0,59,57,1,0,0,0,
        59,60,1,0,0,0,60,62,1,0,0,0,61,59,1,0,0,0,62,65,3,20,10,0,63,65,
        3,18,9,0,64,59,1,0,0,0,64,63,1,0,0,0,65,5,1,0,0,0,66,70,3,8,4,0,
        67,70,3,10,5,0,68,70,3,16,8,0,69,66,1,0,0,0,69,67,1,0,0,0,69,68,
        1,0,0,0,70,7,1,0,0,0,71,72,3,22,11,0,72,76,5,16,0,0,73,75,5,26,0,
        0,74,73,1,0,0,0,75,78,1,0,0,0,76,74,1,0,0,0,76,77,1,0,0,0,77,80,
        1,0,0,0,78,76,1,0,0,0,79,71,1,0,0,0,80,83,1,0,0,0,81,79,1,0,0,0,
        81,82,1,0,0,0,82,84,1,0,0,0,83,81,1,0,0,0,84,85,3,22,11,0,85,9,1,
        0,0,0,86,90,3,22,11,0,87,89,5,26,0,0,88,87,1,0,0,0,89,92,1,0,0,0,
        90,88,1,0,0,0,90,91,1,0,0,0,91,93,1,0,0,0,92,90,1,0,0,0,93,97,3,
        12,6,0,94,96,5,26,0,0,95,94,1,0,0,0,96,99,1,0,0,0,97,95,1,0,0,0,
        97,98,1,0,0,0,98,100,1,0,0,0,99,97,1,0,0,0,100,104,3,22,11,0,101,
        103,5,26,0,0,102,101,1,0,0,0,103,106,1,0,0,0,104,102,1,0,0,0,104,
        105,1,0,0,0,105,107,1,0,0,0,106,104,1,0,0,0,107,111,5,6,0,0,108,
        110,5,26,0,0,109,108,1,0,0,0,110,113,1,0,0,0,111,109,1,0,0,0,111,
        112,1,0,0,0,112,114,1,0,0,0,113,111,1,0,0,0,114,115,3,14,7,0,115,
        11,1,0,0,0,116,117,7,0,0,0,117,13,1,0,0,0,118,122,3,20,10,0,119,
        121,5,26,0,0,120,119,1,0,0,0,121,124,1,0,0,0,122,120,1,0,0,0,122,
        123,1,0,0,0,123,125,1,0,0,0,124,122,1,0,0,0,125,126,5,9,0,0,126,
        127,3,20,10,0,127,15,1,0,0,0,128,132,3,22,11,0,129,131,5,26,0,0,
        130,129,1,0,0,0,131,134,1,0,0,0,132,130,1,0,0,0,132,133,1,0,0,0,
        133,135,1,0,0,0,134,132,1,0,0,0,135,139,5,13,0,0,136,138,5,26,0,
        0,137,136,1,0,0,0,138,141,1,0,0,0,139,137,1,0,0,0,139,140,1,0,0,
        0,140,142,1,0,0,0,141,139,1,0,0,0,142,143,3,22,11,0,143,17,1,0,0,
        0,144,145,5,19,0,0,145,19,1,0,0,0,146,154,5,27,0,0,147,148,5,14,
        0,0,148,149,5,27,0,0,149,154,5,14,0,0,150,151,5,15,0,0,151,152,5,
        27,0,0,152,154,5,15,0,0,153,146,1,0,0,0,153,147,1,0,0,0,153,150,
        1,0,0,0,154,21,1,0,0,0,155,163,5,27,0,0,156,157,5,14,0,0,157,158,
        5,27,0,0,158,163,5,14,0,0,159,160,5,15,0,0,160,161,5,27,0,0,161,
        163,5,15,0,0,162,155,1,0,0,0,162,156,1,0,0,0,162,159,1,0,0,0,163,
        23,1,0,0,0,18,30,37,44,54,59,64,69,76,81,90,97,104,111,122,132,139,
        153,162
    ]

class SqlParser ( Parser ):

    grammarFileName = "Sql.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "'='", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "'\"'", "'''", "','", "';'", "'.'", "'*'", 
                     "'>'", "'>='", "'<'", "'<='" ]

    symbolicNames = [ "<INVALID>", "NUMBER", "SELECT", "FROM", "WHERE", 
                      "IN", "ON", "NOT", "EXCEPT", "EQ", "INNER_JOIN", "LEFT_JOIN", 
                      "RIGHT_JOIN", "NATURAL_JOIN", "DOUBLE_QUOTATION_MARK", 
                      "SINGLE_QUOTATION_MARK", "COMMA", "SEMICOLON", "POINT", 
                      "STAR", "GREATER", "GEQ", "LOWER", "LEQ", "LETTER", 
                      "DIGIT", "SPACE", "STRING" ]

    RULE_whole_query = 0
    RULE_query = 1
    RULE_select_stmt = 2
    RULE_from_stmt = 3
    RULE_no_join_table = 4
    RULE_inner_join_table = 5
    RULE_inner_join_type = 6
    RULE_inner_join_eq = 7
    RULE_natural_join_stmt = 8
    RULE_every_columns = 9
    RULE_table_column_name = 10
    RULE_table_name = 11

    ruleNames =  [ "whole_query", "query", "select_stmt", "from_stmt", "no_join_table", 
                   "inner_join_table", "inner_join_type", "inner_join_eq", 
                   "natural_join_stmt", "every_columns", "table_column_name", 
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
    DOUBLE_QUOTATION_MARK=14
    SINGLE_QUOTATION_MARK=15
    COMMA=16
    SEMICOLON=17
    POINT=18
    STAR=19
    GREATER=20
    GEQ=21
    LOWER=22
    LEQ=23
    LETTER=24
    DIGIT=25
    SPACE=26
    STRING=27

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
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 24
            self.query()
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
            self.state = 26
            self.match(SqlParser.SELECT)
            self.state = 30
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==26:
                self.state = 27
                self.match(SqlParser.SPACE)
                self.state = 32
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 33
            self.select_stmt()
            self.state = 37
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==26:
                self.state = 34
                self.match(SqlParser.SPACE)
                self.state = 39
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 40
            self.match(SqlParser.FROM)
            self.state = 44
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==26:
                self.state = 41
                self.match(SqlParser.SPACE)
                self.state = 46
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 47
            self.from_stmt()
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
            self.state = 64
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [14, 15, 27]:
                self.enterOuterAlt(localctx, 1)
                self.state = 59
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,4,self._ctx)
                while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                    if _alt==1:
                        self.state = 49
                        self.table_column_name()
                        self.state = 50
                        self.match(SqlParser.COMMA)
                        self.state = 54
                        self._errHandler.sync(self)
                        _la = self._input.LA(1)
                        while _la==26:
                            self.state = 51
                            self.match(SqlParser.SPACE)
                            self.state = 56
                            self._errHandler.sync(self)
                            _la = self._input.LA(1)
                 
                    self.state = 61
                    self._errHandler.sync(self)
                    _alt = self._interp.adaptivePredict(self._input,4,self._ctx)

                self.state = 62
                self.table_column_name()
                pass
            elif token in [19]:
                self.enterOuterAlt(localctx, 2)
                self.state = 63
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
        self.enterRule(localctx, 6, self.RULE_from_stmt)
        try:
            self.state = 69
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,6,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 66
                self.no_join_table()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 67
                self.inner_join_table()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 68
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
        self.enterRule(localctx, 8, self.RULE_no_join_table)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 81
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,8,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 71
                    self.table_name()
                    self.state = 72
                    self.match(SqlParser.COMMA)
                    self.state = 76
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    while _la==26:
                        self.state = 73
                        self.match(SqlParser.SPACE)
                        self.state = 78
                        self._errHandler.sync(self)
                        _la = self._input.LA(1)
             
                self.state = 83
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,8,self._ctx)

            self.state = 84
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
        self.enterRule(localctx, 10, self.RULE_inner_join_table)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 86
            self.table_name()
            self.state = 90
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==26:
                self.state = 87
                self.match(SqlParser.SPACE)
                self.state = 92
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 93
            self.inner_join_type()
            self.state = 97
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==26:
                self.state = 94
                self.match(SqlParser.SPACE)
                self.state = 99
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 100
            self.table_name()
            self.state = 104
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==26:
                self.state = 101
                self.match(SqlParser.SPACE)
                self.state = 106
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 107
            self.match(SqlParser.ON)
            self.state = 111
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==26:
                self.state = 108
                self.match(SqlParser.SPACE)
                self.state = 113
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 114
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
        self.enterRule(localctx, 12, self.RULE_inner_join_type)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 116
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 7168) != 0)):
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
        self.enterRule(localctx, 14, self.RULE_inner_join_eq)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 118
            self.table_column_name()
            self.state = 122
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==26:
                self.state = 119
                self.match(SqlParser.SPACE)
                self.state = 124
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 125
            self.match(SqlParser.EQ)
            self.state = 126
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
        self.enterRule(localctx, 16, self.RULE_natural_join_stmt)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 128
            self.table_name()
            self.state = 132
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==26:
                self.state = 129
                self.match(SqlParser.SPACE)
                self.state = 134
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 135
            self.match(SqlParser.NATURAL_JOIN)
            self.state = 139
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==26:
                self.state = 136
                self.match(SqlParser.SPACE)
                self.state = 141
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 142
            self.table_name()
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
        self.enterRule(localctx, 18, self.RULE_every_columns)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 144
            self.match(SqlParser.STAR)
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
        self.enterRule(localctx, 20, self.RULE_table_column_name)
        try:
            self.state = 153
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [27]:
                self.enterOuterAlt(localctx, 1)
                self.state = 146
                self.match(SqlParser.STRING)
                pass
            elif token in [14]:
                self.enterOuterAlt(localctx, 2)
                self.state = 147
                self.match(SqlParser.DOUBLE_QUOTATION_MARK)
                self.state = 148
                self.match(SqlParser.STRING)
                self.state = 149
                self.match(SqlParser.DOUBLE_QUOTATION_MARK)
                pass
            elif token in [15]:
                self.enterOuterAlt(localctx, 3)
                self.state = 150
                self.match(SqlParser.SINGLE_QUOTATION_MARK)
                self.state = 151
                self.match(SqlParser.STRING)
                self.state = 152
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
        self.enterRule(localctx, 22, self.RULE_table_name)
        try:
            self.state = 162
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [27]:
                self.enterOuterAlt(localctx, 1)
                self.state = 155
                self.match(SqlParser.STRING)
                pass
            elif token in [14]:
                self.enterOuterAlt(localctx, 2)
                self.state = 156
                self.match(SqlParser.DOUBLE_QUOTATION_MARK)
                self.state = 157
                self.match(SqlParser.STRING)
                self.state = 158
                self.match(SqlParser.DOUBLE_QUOTATION_MARK)
                pass
            elif token in [15]:
                self.enterOuterAlt(localctx, 3)
                self.state = 159
                self.match(SqlParser.SINGLE_QUOTATION_MARK)
                self.state = 160
                self.match(SqlParser.STRING)
                self.state = 161
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






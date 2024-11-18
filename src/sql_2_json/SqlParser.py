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
        4,1,20,52,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,1,0,1,0,1,1,5,
        1,14,8,1,10,1,12,1,17,9,1,1,2,1,2,5,2,21,8,2,10,2,12,2,24,9,2,1,
        2,1,2,1,2,5,2,29,8,2,10,2,12,2,32,9,2,5,2,34,8,2,10,2,12,2,37,9,
        2,1,2,5,2,40,8,2,10,2,12,2,43,9,2,1,2,3,2,46,8,2,1,3,1,3,1,4,1,4,
        1,4,0,0,5,0,2,4,6,8,0,0,52,0,10,1,0,0,0,2,15,1,0,0,0,4,18,1,0,0,
        0,6,47,1,0,0,0,8,49,1,0,0,0,10,11,3,2,1,0,11,1,1,0,0,0,12,14,3,4,
        2,0,13,12,1,0,0,0,14,17,1,0,0,0,15,13,1,0,0,0,15,16,1,0,0,0,16,3,
        1,0,0,0,17,15,1,0,0,0,18,22,5,2,0,0,19,21,5,19,0,0,20,19,1,0,0,0,
        21,24,1,0,0,0,22,20,1,0,0,0,22,23,1,0,0,0,23,45,1,0,0,0,24,22,1,
        0,0,0,25,26,3,8,4,0,26,30,5,9,0,0,27,29,5,19,0,0,28,27,1,0,0,0,29,
        32,1,0,0,0,30,28,1,0,0,0,30,31,1,0,0,0,31,34,1,0,0,0,32,30,1,0,0,
        0,33,25,1,0,0,0,34,37,1,0,0,0,35,33,1,0,0,0,35,36,1,0,0,0,36,41,
        1,0,0,0,37,35,1,0,0,0,38,40,3,8,4,0,39,38,1,0,0,0,40,43,1,0,0,0,
        41,39,1,0,0,0,41,42,1,0,0,0,42,46,1,0,0,0,43,41,1,0,0,0,44,46,3,
        6,3,0,45,35,1,0,0,0,45,44,1,0,0,0,46,5,1,0,0,0,47,48,5,12,0,0,48,
        7,1,0,0,0,49,50,5,20,0,0,50,9,1,0,0,0,6,15,22,30,35,41,45
    ]

class SqlParser ( Parser ):

    grammarFileName = "Sql.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "'\"'", "','", "';'", "'.'", "'*'", "'>'", "'>='", 
                     "'<'", "'<='" ]

    symbolicNames = [ "<INVALID>", "NUMBER", "SELECT", "FROM", "WHERE", 
                      "IN", "NOT", "EXCEPT", "QUOTATION_MARK", "COMMA", 
                      "SEMICOLON", "POINT", "STAR", "GREATER", "GEQ", "LOWER", 
                      "LEQ", "LETTER", "DIGIT", "SPACE", "STRING" ]

    RULE_whole_query = 0
    RULE_query = 1
    RULE_select_stmt = 2
    RULE_everything = 3
    RULE_table_column_name = 4

    ruleNames =  [ "whole_query", "query", "select_stmt", "everything", 
                   "table_column_name" ]

    EOF = Token.EOF
    NUMBER=1
    SELECT=2
    FROM=3
    WHERE=4
    IN=5
    NOT=6
    EXCEPT=7
    QUOTATION_MARK=8
    COMMA=9
    SEMICOLON=10
    POINT=11
    STAR=12
    GREATER=13
    GEQ=14
    LOWER=15
    LEQ=16
    LETTER=17
    DIGIT=18
    SPACE=19
    STRING=20

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
            self.state = 10
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

        def select_stmt(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SqlParser.Select_stmtContext)
            else:
                return self.getTypedRuleContext(SqlParser.Select_stmtContext,i)


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
            self.state = 15
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==2:
                self.state = 12
                self.select_stmt()
                self.state = 17
                self._errHandler.sync(self)
                _la = self._input.LA(1)

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

        def SELECT(self):
            return self.getToken(SqlParser.SELECT, 0)

        def everything(self):
            return self.getTypedRuleContext(SqlParser.EverythingContext,0)


        def SPACE(self, i:int=None):
            if i is None:
                return self.getTokens(SqlParser.SPACE)
            else:
                return self.getToken(SqlParser.SPACE, i)

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
            self.enterOuterAlt(localctx, 1)
            self.state = 18
            self.match(SqlParser.SELECT)
            self.state = 22
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==19:
                self.state = 19
                self.match(SqlParser.SPACE)
                self.state = 24
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 45
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [-1, 2, 20]:
                self.state = 35
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,3,self._ctx)
                while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                    if _alt==1:
                        self.state = 25
                        self.table_column_name()
                        self.state = 26
                        self.match(SqlParser.COMMA)
                        self.state = 30
                        self._errHandler.sync(self)
                        _la = self._input.LA(1)
                        while _la==19:
                            self.state = 27
                            self.match(SqlParser.SPACE)
                            self.state = 32
                            self._errHandler.sync(self)
                            _la = self._input.LA(1)
                 
                    self.state = 37
                    self._errHandler.sync(self)
                    _alt = self._interp.adaptivePredict(self._input,3,self._ctx)

                self.state = 41
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==20:
                    self.state = 38
                    self.table_column_name()
                    self.state = 43
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                pass
            elif token in [12]:
                self.state = 44
                self.everything()
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


    class EverythingContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def STAR(self):
            return self.getToken(SqlParser.STAR, 0)

        def getRuleIndex(self):
            return SqlParser.RULE_everything

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterEverything" ):
                listener.enterEverything(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitEverything" ):
                listener.exitEverything(self)




    def everything(self):

        localctx = SqlParser.EverythingContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_everything)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 47
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
        self.enterRule(localctx, 8, self.RULE_table_column_name)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 49
            self.match(SqlParser.STRING)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx






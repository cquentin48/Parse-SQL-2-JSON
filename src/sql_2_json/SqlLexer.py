# Generated from Sql.g4 by ANTLR 4.13.2
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
    from typing import TextIO
else:
    from typing.io import TextIO


def serializedATN():
    return [
        4, 0, 20, 154, 6, -1, 2, 0, 7, 0, 2, 1, 7, 1, 2, 2, 7, 2, 2, 3, 7, 3, 2, 4, 7, 4, 2, 5, 7, 5,
        2, 6, 7, 6, 2, 7, 7, 7, 2, 8, 7, 8, 2, 9, 7, 9, 2, 10, 7, 10, 2, 11, 7, 11, 2, 12, 7, 12, 2,
        13, 7, 13, 2, 14, 7, 14, 2, 15, 7, 15, 2, 16, 7, 16, 2, 17, 7, 17, 2, 18, 7, 18, 2, 19, 7,
        19, 1, 0, 4, 0, 43, 8, 0, 11, 0, 12, 0, 44, 1, 0, 1, 0, 4, 0, 49, 8, 0, 11, 0, 12, 0, 50, 5,
        0, 53, 8, 0, 10, 0, 12, 0, 56, 9, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
        1, 1, 1, 1, 1, 3, 1, 70, 8, 1, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 3, 2, 80, 8, 2,
        1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 3, 3, 92, 8, 3, 1, 4, 1, 4, 1, 4, 1,
        4, 3, 4, 98, 8, 4, 1, 5, 1, 5, 1, 5, 1, 5, 1, 5, 1, 5, 3, 5, 106, 8, 5, 1, 6, 1, 6, 1, 6, 1, 6,
        1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 3, 6, 120, 8, 6, 1, 7, 1, 7, 1, 8, 1, 8, 1, 9,
        1, 9, 1, 10, 1, 10, 1, 11, 1, 11, 1, 12, 1, 12, 1, 13, 1, 13, 1, 13, 1, 14, 1, 14, 1, 15,
        1, 15, 1, 15, 1, 16, 1, 16, 1, 17, 1, 17, 1, 18, 1, 18, 1, 18, 1, 18, 1, 19, 4, 19, 151,
        8, 19, 11, 19, 12, 19, 152, 0, 0, 20, 1, 1, 3, 2, 5, 3, 7, 4, 9, 5, 11, 6, 13, 7, 15, 8, 17,
        9, 19, 10, 21, 11, 23, 12, 25, 13, 27, 14, 29, 15, 31, 16, 33, 17, 35, 18, 37, 19, 39,
        20, 1, 0, 4, 1, 0, 48, 57, 2, 0, 65, 90, 97, 122, 3, 0, 9, 10, 13, 13, 32, 32, 4, 0, 48,
        57, 65, 90, 95, 95, 97, 122, 163, 0, 1, 1, 0, 0, 0, 0, 3, 1, 0, 0, 0, 0, 5, 1, 0, 0, 0, 0,
        7, 1, 0, 0, 0, 0, 9, 1, 0, 0, 0, 0, 11, 1, 0, 0, 0, 0, 13, 1, 0, 0, 0, 0, 15, 1, 0, 0, 0, 0, 17,
        1, 0, 0, 0, 0, 19, 1, 0, 0, 0, 0, 21, 1, 0, 0, 0, 0, 23, 1, 0, 0, 0, 0, 25, 1, 0, 0, 0, 0, 27,
        1, 0, 0, 0, 0, 29, 1, 0, 0, 0, 0, 31, 1, 0, 0, 0, 0, 33, 1, 0, 0, 0, 0, 35, 1, 0, 0, 0, 0, 37,
        1, 0, 0, 0, 0, 39, 1, 0, 0, 0, 1, 42, 1, 0, 0, 0, 3, 69, 1, 0, 0, 0, 5, 79, 1, 0, 0, 0, 7, 91,
        1, 0, 0, 0, 9, 97, 1, 0, 0, 0, 11, 105, 1, 0, 0, 0, 13, 119, 1, 0, 0, 0, 15, 121, 1, 0, 0,
        0, 17, 123, 1, 0, 0, 0, 19, 125, 1, 0, 0, 0, 21, 127, 1, 0, 0, 0, 23, 129, 1, 0, 0, 0, 25,
        131, 1, 0, 0, 0, 27, 133, 1, 0, 0, 0, 29, 136, 1, 0, 0, 0, 31, 138, 1, 0, 0, 0, 33, 141,
        1, 0, 0, 0, 35, 143, 1, 0, 0, 0, 37, 145, 1, 0, 0, 0, 39, 150, 1, 0, 0, 0, 41, 43, 7, 0, 0,
        0, 42, 41, 1, 0, 0, 0, 43, 44, 1, 0, 0, 0, 44, 42, 1, 0, 0, 0, 44, 45, 1, 0, 0, 0, 45, 54,
        1, 0, 0, 0, 46, 48, 3, 21, 10, 0, 47, 49, 7, 0, 0, 0, 48, 47, 1, 0, 0, 0, 49, 50, 1, 0, 0,
        0, 50, 48, 1, 0, 0, 0, 50, 51, 1, 0, 0, 0, 51, 53, 1, 0, 0, 0, 52, 46, 1, 0, 0, 0, 53, 56,
        1, 0, 0, 0, 54, 52, 1, 0, 0, 0, 54, 55, 1, 0, 0, 0, 55, 2, 1, 0, 0, 0, 56, 54, 1, 0, 0, 0, 57,
        58, 5, 115, 0, 0, 58, 59, 5, 101, 0, 0, 59, 60, 5, 108, 0, 0, 60, 61, 5, 101, 0, 0, 61,
        62, 5, 99, 0, 0, 62, 70, 5, 116, 0, 0, 63, 64, 5, 83, 0, 0, 64, 65, 5, 69, 0, 0, 65, 66,
        5, 76, 0, 0, 66, 67, 5, 69, 0, 0, 67, 68, 5, 67, 0, 0, 68, 70, 5, 84, 0, 0, 69, 57, 1, 0,
        0, 0, 69, 63, 1, 0, 0, 0, 70, 4, 1, 0, 0, 0, 71, 72, 5, 102, 0, 0, 72, 73, 5, 114, 0, 0, 73,
        74, 5, 111, 0, 0, 74, 80, 5, 109, 0, 0, 75, 76, 5, 70, 0, 0, 76, 77, 5, 82, 0, 0, 77, 78,
        5, 79, 0, 0, 78, 80, 5, 77, 0, 0, 79, 71, 1, 0, 0, 0, 79, 75, 1, 0, 0, 0, 80, 6, 1, 0, 0, 0,
        81, 82, 5, 119, 0, 0, 82, 83, 5, 104, 0, 0, 83, 84, 5, 101, 0, 0, 84, 85, 5, 114, 0, 0,
        85, 92, 5, 101, 0, 0, 86, 87, 5, 87, 0, 0, 87, 88, 5, 72, 0, 0, 88, 89, 5, 69, 0, 0, 89,
        90, 5, 82, 0, 0, 90, 92, 5, 69, 0, 0, 91, 81, 1, 0, 0, 0, 91, 86, 1, 0, 0, 0, 92, 8, 1, 0,
        0, 0, 93, 94, 5, 105, 0, 0, 94, 98, 5, 110, 0, 0, 95, 96, 5, 73, 0, 0, 96, 98, 5, 78, 0,
        0, 97, 93, 1, 0, 0, 0, 97, 95, 1, 0, 0, 0, 98, 10, 1, 0, 0, 0, 99, 100, 5, 110, 0, 0, 100,
        101, 5, 111, 0, 0, 101, 106, 5, 116, 0, 0, 102, 103, 5, 78, 0, 0, 103, 104, 5, 79, 0,
        0, 104, 106, 5, 84, 0, 0, 105, 99, 1, 0, 0, 0, 105, 102, 1, 0, 0, 0, 106, 12, 1, 0, 0, 0,
        107, 108, 5, 101, 0, 0, 108, 109, 5, 120, 0, 0, 109, 110, 5, 99, 0, 0, 110, 111, 5, 101,
        0, 0, 111, 112, 5, 112, 0, 0, 112, 120, 5, 116, 0, 0, 113, 114, 5, 69, 0, 0, 114, 115,
        5, 88, 0, 0, 115, 116, 5, 67, 0, 0, 116, 117, 5, 69, 0, 0, 117, 118, 5, 80, 0, 0, 118,
        120, 5, 84, 0, 0, 119, 107, 1, 0, 0, 0, 119, 113, 1, 0, 0, 0, 120, 14, 1, 0, 0, 0, 121,
        122, 5, 34, 0, 0, 122, 16, 1, 0, 0, 0, 123, 124, 5, 44, 0, 0, 124, 18, 1, 0, 0, 0, 125,
        126, 5, 59, 0, 0, 126, 20, 1, 0, 0, 0, 127, 128, 5, 46, 0, 0, 128, 22, 1, 0, 0, 0, 129,
        130, 5, 42, 0, 0, 130, 24, 1, 0, 0, 0, 131, 132, 5, 62, 0, 0, 132, 26, 1, 0, 0, 0, 133,
        134, 5, 62, 0, 0, 134, 135, 5, 61, 0, 0, 135, 28, 1, 0, 0, 0, 136, 137, 5, 60, 0, 0, 137,
        30, 1, 0, 0, 0, 138, 139, 5, 60, 0, 0, 139, 140, 5, 61, 0, 0, 140, 32, 1, 0, 0, 0, 141,
        142, 7, 1, 0, 0, 142, 34, 1, 0, 0, 0, 143, 144, 7, 0, 0, 0, 144, 36, 1, 0, 0, 0, 145, 146,
        7, 2, 0, 0, 146, 147, 1, 0, 0, 0, 147, 148, 6, 18, 0, 0, 148, 38, 1, 0, 0, 0, 149, 151,
        7, 3, 0, 0, 150, 149, 1, 0, 0, 0, 151, 152, 1, 0, 0, 0, 152, 150, 1, 0, 0, 0, 152, 153,
        1, 0, 0, 0, 153, 40, 1, 0, 0, 0, 11, 0, 44, 50, 54, 69, 79, 91, 97, 105, 119, 152, 1, 6,
        0, 0
    ]


class SqlLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [DFA(ds, i) for i, ds in enumerate(atn.decisionToState)]

    NUMBER = 1
    SELECT = 2
    FROM = 3
    WHERE = 4
    IN = 5
    NOT = 6
    EXCEPT = 7
    QUOTATION_MARK = 8
    COMMA = 9
    SEMICOLON = 10
    POINT = 11
    STAR = 12
    GREATER = 13
    GEQ = 14
    LOWER = 15
    LEQ = 16
    LETTER = 17
    DIGIT = 18
    SPACE = 19
    STRING = 20

    channelNames = [u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN"]

    modeNames = ["DEFAULT_MODE"]

    literalNames = ["<INVALID>",
                    "'\"'", "','", "';'", "'.'", "'*'", "'>'", "'>='", "'<'", "'<='"]

    symbolicNames = ["<INVALID>",
                     "NUMBER", "SELECT", "FROM", "WHERE", "IN", "NOT", "EXCEPT",
                     "QUOTATION_MARK", "COMMA", "SEMICOLON", "POINT", "STAR", "GREATER",
                     "GEQ", "LOWER", "LEQ", "LETTER", "DIGIT", "SPACE", "STRING"]

    ruleNames = ["NUMBER", "SELECT", "FROM", "WHERE", "IN", "NOT", "EXCEPT",
                 "QUOTATION_MARK", "COMMA", "SEMICOLON", "POINT", "STAR",
                 "GREATER", "GEQ", "LOWER", "LEQ", "LETTER", "DIGIT", "SPACE",
                 "STRING"]

    grammarFileName = "Sql.g4"

    def __init__(self, input=None, output: TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = LexerATNSimulator(
            self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None
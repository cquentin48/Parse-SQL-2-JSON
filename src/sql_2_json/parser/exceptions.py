from antlr4.error.ErrorListener import ErrorListener

class LexerError(ErrorListener):
    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        raise Exception(
            f"Lexer error when parsing line {line} at column {column} : {msg}. "
            f"\n Offending symbol : {offendingSymbol}."
        )

class ParseError(ErrorListener):
    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        raise Exception(
            f"Parse error when parsing line {line} at column {column} : {msg}. "+
            f"\n Offending symbol : {offendingSymbol}."
        )
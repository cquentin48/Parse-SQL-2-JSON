"""
SQL 2 JSON parser main module

To use it, simply use the following statement :

.. highlight:: python
.. code-block:: python
    from sql_2_json import SQL2JSON
    
    parser = SQL2JSON()
    
    query = "Select * from MY_TABLE;"
    query_params = parser.parse_request(query)
"""
from antlr4 import CommonTokenStream, InputStream, ParseTreeWalker

from .SqlLexer import SqlLexer
from .SqlListener import SqlListener
from .SqlParser import SqlParser

class SQL2JSON:
    """
    SQL Parser main class
    """
    def __init__(self):
        self.listener = SqlListener()

    def parse_request(self, query: str) -> str:
        """ Parse SQL request

        :type query: str
        :param query: SQL query
        """
        lexer = SqlLexer(InputStream(query))
        stream = CommonTokenStream(lexer)
        parser = SqlParser(stream)

        walker = ParseTreeWalker()
        walker.walk(self.listener, parser.whole_query())

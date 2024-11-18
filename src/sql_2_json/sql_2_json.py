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

from dataclasses import dataclass

@dataclass
class SQL2JSON:
    """
    SQL Parser main class
    """

    def parse_request(self, query: str) -> str:
        """ Parse SQL request

        :type query: str
        :param query: SQL query

        :raises NotImplementedError: Method not yet implemented!
        """
        raise NotImplementedError(f'The parse method with the query {query} ' +
                                  'is not yet implemented!')

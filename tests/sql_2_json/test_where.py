import unittest

from src.sql_2_json import SQL2JSON

class TestWhere(unittest.TestCase):
    """
    SQL Parser where clause unit test class
    """
    
    def test_where_simple_equality(self):
        """
        Test if the parser can identify the query condition
        """
        
        # Given
        test_object = SQL2JSON()
        example_query = "select * from test where t1='t1';"
        
        # Acts
        test_object.parse_request(example_query)
        expected_ouput = [{'column_name':'t1','value':"'t1'"}]
        
        # Asserts
        self.assertEqual(test_object.listener.conditions, expected_ouput)

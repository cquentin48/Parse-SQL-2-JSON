"""
Main class test module
"""

import unittest

from src import SQL2JSON

class TestSQL2JSON(unittest.TestCase):
    """
    SQL 2 JSON main module test case
    """

    def test_parse_request_should_raise_not_implemented_exception(self):
        """
        Given current state, the `parse_request` method should normally raise
        a `NotImplement` Exception
        """

        # Given
        test_object = SQL2JSON()
        example_query = "Select * from MY_TABLE;"

        # Acts & Assert
        self.assertRaises(NotImplementedError,
                          test_object.parse_request, example_query)

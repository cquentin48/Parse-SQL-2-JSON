"""
Main class test module
"""

import unittest

from src import SQL2JSON


class TestSelect(unittest.TestCase):
    """
    SQL 2 JSON main module test case
    """

    def test_parse_request_with_column_name(self):
        """
        The `parse_request` method should return the list of the column name if specified
        """

        # Given
        test_object = SQL2JSON()
        column_name = "Test2"
        example_query = f"select {column_name} from test;"

        # Acts
        test_object.parse_request(example_query)
        expected_column_names = [column_name]

        # Assert
        self.assertEqual(test_object.listener.column_names,
                         expected_column_names)

    def test_parse_request_with_column_name_single_quote(self):
        """
        The `parse_request` method should return the list of the column name if specified
        (with single quote).
        """

        # Given
        test_object = SQL2JSON()
        column_name = "Test2"
        example_query = f"select '{column_name}' from test;"

        # Acts
        test_object.parse_request(example_query)
        expected_column_names = [column_name]

        # Assert
        self.assertEqual(test_object.listener.column_names,
                         expected_column_names)

    def test_parse_request_with_column_name_double_quote(self):
        """
        The `parse_request` method should return the list of the column name if specified
        (with double quote).
        """

        # Given
        test_object = SQL2JSON()
        column_name = "Test2"
        example_query = f'select "{column_name}" from test;'

        # Acts
        test_object.parse_request(example_query)
        expected_column_names = [column_name]

        # Assert
        self.assertEqual(test_object.listener.column_names,
                         expected_column_names)

    def test_parse_request_with_two_columns_name(self):
        """
        The `parse_request` method should return the list of every column name if specified
        """

        # Given
        test_object = SQL2JSON()
        first_column_name = "Test1"
        second_colum_name = "Test2"
        example_query = f"select {first_column_name}, {second_colum_name} from test;"

        # Acts
        test_object.parse_request(example_query)
        expected_column_names = [first_column_name, second_colum_name]

        # Assert
        self.assertEqual(test_object.listener.column_names,
                         expected_column_names)

    def test_parse_request_all_column_name_should_return_everything(self):
        """
        The parse method should fetch the table name
        """
        # Given
        test_object = SQL2JSON()
        example_query = "select * from test;"

        # Acts
        test_object.parse_request(example_query)
        expected_column_names = ['__everything']

        # Assert
        self.assertEqual(test_object.listener.column_names,
                         expected_column_names)

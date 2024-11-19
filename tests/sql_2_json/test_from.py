"""
Main class test module
"""

import unittest

from src import SQL2JSON


class TestFROM(unittest.TestCase):
    """
    Test from parser unit test class
    """

    def test_parse_request_table_name(self):
        """
        With the `parse_request` method, the parser should be able to
        fetch the table name
        """
        # Given
        test_object = SQL2JSON()
        example_query = "select * from test;"

        # Acts
        test_object.parse_request(example_query)
        expected_table_names = ['test']

        # Assert
        self.assertEqual(test_object.listener.table_names,
                         expected_table_names)

    def test_parse_request_table_names(self):
        """
        With the parse request, the parser should be able to parse multiple table names
        """
        # Given
        test_object = SQL2JSON()
        example_query = "select * from test, test2;"

        # Acts
        test_object.parse_request(example_query)
        expected_table_names = ['test', 'test2']

        # Assert
        self.assertEqual(test_object.listener.table_names,
                         expected_table_names)

    def test_parse_request_table_names_single_inner_join(self):
        """
        With the parse request, the parser should be able to parse multiple table names
        on the inner join
        """
        # Given
        test_object = SQL2JSON()
        example_query = "select * from test inner join test2 on t1=t2;"

        # Acts
        test_object.parse_request(example_query)
        expected_table_names = ['test', 'test2']
        expected_joins = {
            'INNER_JOIN': [{
                0: {'table_name': 'test', 'attributes': ['t1']},
                1: {'table_name': 'test2', 'attributes': ['t2']},
            }]
        }

        # Assert
        self.assertEqual(test_object.listener.table_names,
                         expected_table_names)
        self.assertEqual(test_object.listener.joins,
                         expected_joins)

    def test_parse_request_table_names_single_left_join(self):
        """
        With the parse request, the parser should be able to parse multiple table names
        and joins on the left join.
        """
        # Given
        test_object = SQL2JSON()
        example_query = "select * from test left join test2 on t1=t2;"

        # Acts
        test_object.parse_request(example_query)
        expected_table_names = ['test', 'test2']
        expected_joins = {
            'LEFT_JOIN': [{
                0: {'table_name': 'test', 'attributes': ['t1']},
                1: {'table_name': 'test2', 'attributes': ['t2']},
            }]
        }

        # Assert
        self.assertEqual(test_object.listener.table_names,
                         expected_table_names)
        self.assertEqual(test_object.listener.joins,
                         expected_joins)

    def test_parse_request_table_names_single_right_join(self):
        """
        With the parse request, the parser should be able to parse multiple table names
        on the right join
        """
        # Given
        test_object = SQL2JSON()
        example_query = "select * from test right join test2 on t1=t2;"

        # Acts
        test_object.parse_request(example_query)
        expected_table_names = ['test', 'test2']
        expected_joins = {
            'RIGHT_JOIN': [{
                0: {'table_name': 'test', 'attributes': ['t1']},
                1: {'table_name': 'test2', 'attributes': ['t2']},
            }]
        }

        # Assert
        self.assertEqual(test_object.listener.table_names,
                         expected_table_names)
        self.assertEqual(test_object.listener.joins,
                         expected_joins)

    def test_parse_request_table_names_single_natural_join(self):
        """
        With the parse request, the parser should be able to parse multiple table names
        on the natural join
        """
        # Given
        test_object = SQL2JSON()
        example_query = "select * from test natural join test2;"

        # Acts
        test_object.parse_request(example_query)
        expected_table_names = ['test', 'test2']
        expected_joins = {
            'NATURAL_JOIN': [['test', 'test2']]
        }

        # Assert
        self.assertEqual(test_object.listener.table_names,
                         expected_table_names)
        self.assertEqual(test_object.listener.joins,
                         expected_joins)

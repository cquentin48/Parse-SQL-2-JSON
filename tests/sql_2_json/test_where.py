import unittest

from src.sql_2_json import SQL2JSON


class TestWhere(unittest.TestCase):
    """
    SQL Parser where clause unit test class
    """

    def test_where_simple_equality(self):
        """
        Test if the parser can identify the query condition with string parameters
        """

        # Given
        test_object = SQL2JSON()
        example_query = "select * from test where t1='t1';"

        # Acts
        test_object.parse_request(example_query)
        expected_ouput = [{'column_name': 't1',
                           'type': 'EQUALITY', 'value': "t1"}]

        # Asserts
        self.assertEqual(test_object.listener.conditions, expected_ouput)

    def test_where_simple_equality_number(self):
        """
        Test if the parser can identify the query condition with number parameters
        """

        # Given
        test_object = SQL2JSON()
        example_query = "select * from test where t1>35;"

        # Acts
        test_object.parse_request(example_query)
        expected_ouput = [{'column_name': 't1', 'type': 'HIGHER', 'value': 35}]

        # Asserts
        self.assertEqual(test_object.listener.conditions, expected_ouput)

    def test_where_simple_equality_number_lower(self):
        """
        Test if the parser can identify the query condition with number parameters (lower condition)
        """

        # Given
        test_object = SQL2JSON()
        example_query = "select * from test where t1<35;"

        # Acts
        test_object.parse_request(example_query)
        expected_ouput = [{'column_name': 't1', 'type': 'LOWER', 'value': 35}]

        # Asserts
        self.assertEqual(test_object.listener.conditions, expected_ouput)

    def test_where_simple_equality_number_heq(self):
        """
        Test if the parser can identify the query condition with number parameters (higher or equal)
        """

        # Given
        test_object = SQL2JSON()
        example_query = "select * from test where t1 >= 35;"

        # Acts
        test_object.parse_request(example_query)
        expected_ouput = [{'column_name': 't1', 'type': 'HEQ', 'value': 35}]

        # Asserts
        self.assertEqual(test_object.listener.conditions, expected_ouput)

    def test_where_simple_equality_number_not_equal(self):
        """
        Test if the parser can identify the query condition with number parameters (not equal condition)
        """

        # Given
        test_object = SQL2JSON()
        example_query = "select * from test where t1 !=  35;"

        # Acts
        test_object.parse_request(example_query)
        expected_ouput = [{'column_name': 't1',
                           'type': 'NOT_EQUAL', 'value': 35}]

        # Asserts
        self.assertEqual(test_object.listener.conditions, expected_ouput)

    def test_where_between_equality(self):
        """
        Test if the parser can identify the query between condition with string parameters
        """

        # Given
        test_object = SQL2JSON()
        example_query = "select * from test where t1 between 't1' and 't2';"

        # Acts
        test_object.parse_request(example_query)
        expected_ouput = [{'column_name': 't1',
                           'type': 'between', 'values': ['t1', 't2']}]

        # Asserts
        self.assertEqual(test_object.listener.conditions, expected_ouput)

    def test_where_between_equality_number(self):
        """
        Test if the parser can identify the between query condition with number parameters
        """

        # Given
        test_object = SQL2JSON()
        example_query = "select * from test where t1 between 10 and 15;"

        # Acts
        test_object.parse_request(example_query)
        expected_ouput = [{'column_name': 't1',
                           'type': 'between', 'values': [10, 15]}]

        # Asserts
        self.assertEqual(test_object.listener.conditions, expected_ouput)

    def test_where_between_equality_date(self):
        """
        Test if the parser can identify the between query condition with date parameters
        """

        # Given
        test_object = SQL2JSON()
        example_query = "select * from test where t1 between '2020/10/06' and '2020/10/20';"

        # Acts
        test_object.parse_request(example_query)
        expected_ouput = [
            {'column_name': 't1', 'type': 'between', 'values': ['2020/10/06', '2020/10/20']}]

        # Asserts
        self.assertEqual(test_object.listener.conditions, expected_ouput)

    def test_where_like_equality(self):
        """
        Test if the parser can identify the like equality (the condition is set to true here)
        """

        # Given
        test_object = SQL2JSON()
        example_query = "select * from test where t1 like 'a%';"

        # Acts
        test_object.parse_request(example_query)
        expected_ouput = [
            {'column_name': 't1', 'type': 'LIKE', 'value': 'a%'}]

        # Asserts
        self.assertEqual(test_object.listener.conditions, expected_ouput)

    def test_where_like_neg_equality(self):
        """
        Test if the parser can identify the like equality (the condition is set to false here)
        """

        # Given
        test_object = SQL2JSON()
        example_query = "select * from test where t1 not like 'b%';"

        # Acts
        test_object.parse_request(example_query)
        expected_ouput = [
            {'column_name': 't1', 'type': 'NOT_LIKE', 'value': 'b%'}]

        # Asserts
        self.assertEqual(test_object.listener.conditions, expected_ouput)

    def test_where_in_equality_multiple_values(self):
        """
        Test if the parser can identify the IN condition (multiple values in the list)
        """

        # Given
        test_object = SQL2JSON()
        example_query = "select * from test where col in (1,2,3,4);"

        # Acts
        test_object.parse_request(example_query)
        expected_ouput = [
            {'type': 'IN', 'col_name': 'col', 'value_list': [1, 2, 3, 4]}]

        # Asserts
        self.assertEqual(test_object.listener.conditions, expected_ouput)

    def test_where_in_equality_single_value(self):
        """
        Test if the parser can identify the IN condition (single value in the list)
        """

        # Given
        test_object = SQL2JSON()
        example_query = "select * from test where col in (1);"

        # Acts
        test_object.parse_request(example_query)
        expected_ouput = [
            {'type': 'IN', 'col_name': 'col', 'value_list': [1]}]

        # Asserts
        self.assertEqual(test_object.listener.conditions, expected_ouput)

    def test_where_AND_equality(self):
        """
        Test if the parser can identify two conditions packed with an AND
        """

        # Given
        test_object = SQL2JSON()
        example_query = "select * from test where col != '32' and col2 != '42';"

        # Acts
        test_object.parse_request(example_query)
        expected_conditions = [
            {
                'type': 'AND',
                'conditions': [
                    {'column_name': 'col', 'type': 'NOT_EQUAL', 'value': '32'},
                    {'column_name': 'col2', 'type': 'NOT_EQUAL', 'value': '42'},
                ]
            }
        ]

        # Asserts
        self.assertEqual(test_object.listener.conditions, expected_conditions)

    def test_where_AND_equality_three_operators(self):
        """
        Test if the parser can identify two conditions packed with an OR
        """

        # Given
        test_object = SQL2JSON()
        example_query = "select * from test where col != '32' and col2 != '42' or col3 != '52';"

        # Acts
        test_object.parse_request(example_query)
        expected_conditions = [
            {
                'type': 'AND',
                'conditions': [
                    {'column_name': 'col', 'type': 'NOT_EQUAL', 'value': '32'},
                    {'column_name': 'col2', 'type': 'NOT_EQUAL', 'value': '42'},
                    {'column_name': 'col3', 'type': 'NOT_EQUAL', 'value': '52'}
                ]
            }
        ]

        # Asserts
        self.assertEqual(test_object.listener.conditions, expected_conditions)

# Parser-SQL2JSON

Parse SQL query and returns the result into a JSON format.

## How to use it

You can use it like this to fetch the params :

```python
from sql_2_json import SQL2JSON

# Creating a query parser
parser = SQL2JSON()

# Adding the query
query = "Select param1, param2 from table;"

# outputs
query_args = parser.parse_request(query)
```

## Commands
Here is a list of the following commands set in the makefile, ready to be used (a big thank you to Alex Bender for his article [https://dev.to/alexbender/makefile-with-help-message-3d4h](Makefile with help message
)):

```shell
dev_install                    Install dependencies (the debug one will be ignored)
help                           Show the commands and the associated description
html_report                    Displays the result of the test command into an HTML page
install                        Install dependencies (the debug one will be ignored)
lint                           Check for code writing errors
sh_report                      Displays the result of the test command into a shell table
test                           Launch the unit test suite (could be used later for reports in HTML or Shell output)
```
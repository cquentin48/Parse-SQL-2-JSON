help: ## Show the commands and the associated description
	@grep -E '^[a-zA-Z_-]+:.*?## .*$$' $(MAKEFILE_LIST) | sort | awk 'BEGIN {FS = ":.*?## "}; {printf "\033[36m%-30s\033[0m %s\n", $$1, $$2}'

lint: ## Check for code writing errors
	pylint --rcfile=.pylintrc src tests

test: ## Launch the unit test suite (could be used later for reports in HTML or Shell output)
	coverage run -m unittest discover tests

html_report: ## Displays the result of the test command into an HTML page
	coverage html

sh_report: ## Displays the result of the test command into a shell table
	coverage report

install: ## Install dependencies (the debug one will be ignored)
	pip install .

dev_install: ## Install dependencies (the debug one will be ignored)
	pip install -e '.[dev]'
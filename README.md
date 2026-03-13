# Selenium Java Automation Framework

A compact web test automation framework built with Java, Selenium WebDriver, Maven, and TestNG.

This project demonstrates a practical starter framework for browser-based test automation with reusable setup, externalized configuration, and data-driven execution using Excel.

## What I Built

- Automated website login flow testing with Selenium WebDriver
- Config-driven browser and URL setup using properties files
- Externalized UI locators for easier maintenance
- Data-driven test execution with TestNG and Apache POI
- Reusable base test class for browser lifecycle management
- Default TestNG reporting for test execution results

## Tech Stack

- Java
- Selenium WebDriver
- TestNG
- Maven
- Apache POI
- WebDriverManager

## Project Structure

```text
TestAutomationFramework/
|-- pom.xml
|-- testrunner/
|   `-- testng.xml
|-- src/test/java/
|   |-- base/
|   |   `-- BaseTest.java
|   |-- testcase/
|   |   `-- MyFirstTestFW.java
|   `-- utilities/
|       |-- ReadXLSdata.java
|       `-- readpropertyFile.java
`-- src/test/resources/
    |-- configfiles/
    |   |-- config.properties
    |   `-- locators.properties
    `-- testdata/
        `-- testdata.xlsx
```

## Framework Highlights

### BaseTest

The base layer initializes the browser, loads configuration files, opens the target application, and handles teardown after test execution.

### Data-Driven Testing

Test data is stored in Excel and supplied to TestNG tests through a reusable data provider built with Apache POI.

### Externalized Configuration

Application URL, browser selection, and element locators are separated from test logic through `.properties` files for easier updates.

## Run The Tests

From the `TestAutomationFramework` folder:

```bash
mvn test
```

You can also run the suite from:

```text
TestAutomationFramework/testrunner/testng.xml
```

## Configuration Example

```properties
browser=firefox
testurl=https://www.zoho.com/
```

## Why This Project

This project showcases my understanding of:

- Selenium-based web automation
- Java test framework structuring
- TestNG data providers and execution flow
- Maintainable test configuration using external files
- Building a reusable foundation for future automation scaling

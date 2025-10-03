# 🚀 Selenium Java Automation Framework

A **modular test automation framework** built with **Selenium, TestNG, Maven, and Page Object Model (POM)**, designed for **scalability, maintainability, and CI/CD integration**.  
This framework demonstrates expertise in **automation architecture, data-driven testing, reusable components, and structured reporting**.

---

## 📂 Project Structure

TestAutomationFramework
│── pom.xml # Maven configuration & dependencies
│── src/test/java
│ ├── base/BaseTest.java # WebDriver setup & reusable test base
│ ├── testcase/MyFirstTestFW.java # Sample test case using POM & TestNG
│ ├── utilities/ReadXLSdata.java # Excel-driven data provider
│ ├── utilities/readpropertyFile.java # Config file handler
│── src/test/resources # Test data & configuration files
│── testrunner/ # TestNG runner XMLs
│── test-output/ # TestNG reports


---

## ⚡ Key Features

- **Page Object Model (POM):** Enhances maintainability & reusability.  
- **TestNG Integration:** Parallel execution, reporting, and annotations.  
- **Excel-Driven Data Handling:** Flexible data provider for test cases.  
- **Maven Build Management:** Dependency handling & CI/CD readiness.  
- **Configuration Management:** Centralized property file handling.  
- **Reporting:** Auto-generated TestNG reports with logs and test results.  
- **Scalable Architecture:** Easy to extend for new test modules.  

---

## 🛠️ Tech Stack

- **Language:** Java  
- **Test Automation:** Selenium WebDriver  
- **Testing Framework:** TestNG  
- **Build Tool:** Maven  
- **Data Handling:** Apache POI (Excel)  
- **IDE:** IntelliJ IDEA  
---

## ▶️ Getting Started

### Prerequisites
- Java JDK 8+  
- Maven 3+  
- IntelliJ IDEA / Eclipse  

### Setup
```bash
# Clone repository
git clone <repo-url>
cd TestAutomationFramework

# Install dependencies
mvn clean install
# Run all TestNG tests
mvn test


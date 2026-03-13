# 📱 Selenium Java Automation Framework

A **modular web test automation framework** built using **Selenium, Java, Maven, and TestNG**.  
The framework follows **Page Object Model (POM)** design pattern, enabling **scalable, maintainable, and reusable** automation for Android and iOS apps.  
It supports **data-driven testing, parallel execution, CI/CD pipelines, and structured reporting**.

---

## 📂 Project Structure

```

AppiumAutomationFramework
│── pom.xml                         # Maven build configuration & dependencies
│── src/test/java
│   ├── base/BaseTest.java           # Driver setup & common hooks
│   ├── pages/                       # Page Object Model classes for app screens
│   ├── tests/                       # TestNG test classes
│   ├── utilities/                   # Reusable helpers (data, waits, config, screenshots)
│   ├── config/ConfigManager.java    # Loads app & device capabilities from properties file
│── src/test/resources
│   ├── testdata/                    # Test data files (Excel/JSON)
│   ├── capabilities.properties      # Appium server & device config
│   ├── testng.xml                   # TestNG suite definitions
│── reports/                         # Test reports (TestNG/Allure/Extent)

````

---

## ⚡ Key Features

- **Page Object Model (POM):** Structured page classes for app screens.  
- **TestNG Integration:** Parallel execution, groups, priorities, and reporting.  
- **Appium Capabilities Management:** Configurable via `capabilities.properties`.  
- **Data-Driven Testing:** Support for Excel/JSON/CSV test data.  
- **Reusable Utilities:**  
  - Wait strategies (explicit, fluent waits)  
  - Screenshot capture on failure  
  - Property/config loader  
- **Cross-Platform Support:** Android & iOS readiness.  
- **CI/CD Friendly:** Easily integrated with Jenkins/GitHub Actions.  
- **Reporting:** TestNG reports with support for Allure/Extent.  

---

## 🛠️ Tech Stack

- **Language:** Java  
- **Mobile Automation:** Appium  
- **Testing Framework:** TestNG  
- **Build Tool:** Maven  
- **Data Handling:** Apache POI (Excel) / JSON  
- **Device Support:** Android Emulator, Real Devices, iOS Simulator  
- **CI/CD:** Jenkins / GitHub Actions  

---

## ▶️ Getting Started

### Prerequisites
- Java JDK 8+  
- Maven 3+  
- Node.js & Appium Server  
- Android SDK (for Android) / Xcode (for iOS)  
- Device or Emulator/Simulator  

### Setup
```bash
# Clone repository
git clone <repo-url>
cd AppiumAutomationFramework

# Install dependencies
mvn clean install
````

### Run Tests

```bash
# Run all tests
mvn test

# Run a specific suite
mvn test -DsuiteXmlFile=testng.xml
```

---

## 📊 Reporting

* **Default TestNG Reports:** Generated under `/test-output`.
* **Allure Reports (optional):**

  ```bash
  mvn allure:serve
  ```
* **Extent Reports (optional):** For detailed execution logs & screenshots.

---
---

## 🎯 Highlights for Portfolio

* Demonstrates **mobile automation expertise** with Appium & Java.
* Showcases **reusable automation architecture** with POM & utilities.
* Ready for **cross-platform execution (Android/iOS)**.
* Includes **data-driven testing & structured reporting**.

```

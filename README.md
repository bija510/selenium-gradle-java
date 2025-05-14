# Selenium Gradle Java Automation Framework

This project is a structured Selenium test automation framework using **Java**, **Gradle**, and **TestNG**, with integrated support for **Allure Reports**. It's designed to support multiple environments, organized test suites, reusable utilities, and comprehensive data management.

---

## 🛠 Prerequisites
- Intellij IDEA Community version (IDE)
- Java JDK (8 or higher)
- Gradle (wrapper included)
- File --> setting--> plugins --> Testng Snippets
- Supported IDEs: IntelliJ IDEA, Eclipse, or any editor with Java support

---
## 🧰 Technologies Used

- **Java**
- **Selenium WebDriver 4.29**
- **Gradle**
- **TestNG**
- **Allure Reporting**

---

## 📁 Project Structure

```
selenium-gradle-java/
│
├── build/
│   ├── allure-results/         # Allure result files generated after test execution
│   └── reports/                # gradle reports
│
├── configuration/
│   ├── config-qa.properties    # QA environment configuration
│   ├── config-uat.properties   # UAT environment configuration
│   └── config-prod.properties  # Production environment configuration
│
├── data/
│   ├── output-data/            # Output data generated from tests
│   ├── test-data/              # Input data for tests (CSV, Excel, JSON, etc.)
│   └── upload-file/            # Files used for upload tests
│
├── screenshots/                # Screenshots of failed tests
│
├── test-suites/
│   ├── smoke.xml               # TestNG suite for smoke tests
│   ├── sanity.xml              # TestNG suite for sanity tests
│   └── regression.xml          # TestNG suite for regression tests
│
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── BaseUtility/    # Utility classes (driver setup, configs, etc.)
│   │       └── BaseClass/      # Base test classes with common logic
│   ├── test/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── qa/
│   │   │           └── tests/  # Actual test cases
│   │   └── resources/          # Additional test-specific resources
│
├── build.gradle                # Gradle build script with dependencies ie; Selenium, TestNG
```

## 🧱 Page Object Model (POM) Design Pattern

This framework follows the **Page Object Model (POM)** design pattern to enhance **test maintenance**, **readability**, and **reusability**.

### 🔹 What is POM?

The Page Object Model is a design pattern that creates an object repository for web UI elements. It separates test logic from UI interactions by encapsulating page-specific logic and locators inside dedicated classes (called "Page Objects").

Each web page in the application has a corresponding **Page Class** that contains:

- Web element locators (`By` or `@FindBy`)
- Actions (methods) that can be performed on those elements

### 🔸 Benefits of Using POM

- ✅ Improved **code reusability**
- ✅ Clear **separation of concerns**
- ✅ Easy **maintenance** — changes in UI affect only the Page class
- ✅ More **readable** and **clean** test cases


## 🧩  To create the testng.xml file download this plugin
```declarative
file --> setting--> plugins --> Create TestNG XML
```

## 🚀 Running Tests from Azure pipeline, jenkins

Use the following command to clean the build directory and run tests:

```bash
.\gradlew.bat clean test "-DsuiteXmlFile=<suite-file>"
```

Replace `<suite-file>` with one of the following:

- `testng.xml` – default test suite
- `smoke.xml` – for smoke tests
- `sanity.xml` – for sanity tests
- `regression.xml` – for regression tests

### 🔁 Example Commands

```bash
.\gradlew.bat clean test "-DsuiteXmlFile=smoke.xml"
.\gradlew.bat clean test "-DsuiteXmlFile=sanity.xml"
.\gradlew.bat clean test "-DsuiteXmlFile=regression.xml"
```
### 📊 To view the allure report

- Config files are selected based on the environment (QA, UAT, PROD) and can be loaded dynamically.
- Allure results are generated under `build/allure-results` and can be viewed using:

```bash
allure serve build/allure-results
```

- Ensure all file paths for uploads, input data, and output locations are correctly referenced in the test logic.

---


## 📬 Contact

For questions or support, please contact [your-email@example.com].

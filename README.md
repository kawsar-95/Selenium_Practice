Here is an updated `README.md` file with more detailed instructions and information about the tools used:

```markdown
# Selenium and API Testing Project

This project demonstrates the use of Selenium WebDriver for web automation and RestAssured for API testing. It includes examples of both GET and POST requests, as well as web interactions using Selenium.

## Tools Used

- **Java 21**: The programming language used for writing the tests.
- **Maven**: A build automation tool used for managing project dependencies.
- **ChromeDriver**: A WebDriver implementation for Chrome, used for running Selenium tests.
- **IntelliJ IDEA**: An integrated development environment (IDE) used for writing and running the code.
- **Selenium WebDriver**: A tool for automating web application testing.
- **RestAssured**: A Java library for testing RESTful web services.
- **TestNG**: A testing framework inspired by JUnit and NUnit.

## Prerequisites

- Java 21
- Maven
- ChromeDriver (for Selenium)
- IntelliJ IDEA (or any other IDE)

## Setup

1. **Clone the repository:**
   ```sh
   git clone <repository-url>
   cd <repository-directory>
   ```

2. **Install dependencies:**
   Ensure your `pom.xml` includes the necessary dependencies for Selenium, TestNG, and RestAssured.

3. **Set up ChromeDriver:**
   Download ChromeDriver and set the system property in your code:
   ```java
   System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
   ```

## Running the Tests

### Selenium Tests

1. **Navigate to the Selenium test file.**

2. **Run the Selenium test:**
    - Open the test file in IntelliJ IDEA.
    - Right-click on the file and select `Run`.

### API Tests

1. **Navigate to the API test file.**

2. **Run the API test:**
    - Open the test file in IntelliJ IDEA.
    - Right-click on the file and select `Run`.


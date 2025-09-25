**Automation Documentation**

1**Testing Strategy**

Objective: Automate critical flows of the ExtramilePlay website (Login, Game Booking, and Booking Negative Scenarios).

Approach:

Functional testing: Verify login scenarios (positive & negative), game booking flows, and validation messages for incorrect input.

Verification: Use assertions (Assert.assertEquals, Assert.assertTrue) and Reporter.log() for detailed logging.

Scope: Covers main user workflows, ensuring high-priority test cases are automated and can be executed repeatedly for regression testing.

2**Framework Choice**

Language: Java

Automation Tool: Selenium WebDriver

Test Management: TestNG (for test execution, grouping and reporting)

Design Pattern: Page Object Model (POM)

Page classes (LoginPage, GamesPage, BookingNegativePage) separate UI locators and actions from test logic.

Reporting:

Built-in TestNG HTML report.

Reporter.log() used to log detailed steps in reports and console.

3**Future Enhancements**

CI/CD Integration: Run tests automatically on every push using GitHub Actions or Jenkins.

Screenshot Capture: Take screenshots on test failures to improve report visibility.

Cross-browser Testing: Add support for Firefox, Edge, etc., using WebDriver.

Data-Driven Testing: Externalize test data using Excel/CSV/JSON.

Parallel Execution: Enable parallel execution in TestNG for faster regression runs.

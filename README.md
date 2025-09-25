# ExtramilePlay Automation Project

## Project Description
This is a QA automation project for **ExtramilePlay** login and Game booking functionality.  
It automates both **positive and negative test scenarios** using **Selenium WebDriver** and **TestNG**.  

- **Login Tests:** Positive login, invalid credentials, blank fields.  
- **Game Booking Tests:** Select a game, book slots with valid data.  
- **Booking Negative Tests:** Fill booking form with missing/invalid data and verify error messages.

## Tools & Frameworks Used
- **Language - Java**  
- **Selenium WebDriver**  
- **TestNG**  - for test management and reporting
- **Maven**  - Maven project structure
- **ChromeDriver**  - latest version compatible with Chrome browser 

---

## Project Structure

ExtramilePlay/
│
├─ src/main/java/Extramileplay/pages/ # Page Object Classes
│ ├─ LoginPage.java
│ ├─ GamesPage.java
│ └─ BookingNegativePage.java
│
├─ src/test/java/extramileplay/tests/ # Test Classes
│ ├─ LoginTest.java
│ ├─ GameTest.java
│ └─ BookingNegativeTest.java
│
├─ testng.xml # TestNG suite
├─ test-output/ # Auto-generated TestNG HTML reports
└─ README.md # Project documentation

---

## Prerequisites
- **Java JDK 8+** installed  
- **Eclipse IDE**  
- **TestNG plugin** installed in Eclipse  
- **Chrome browser** and matching **ChromeDriver**  
- **Maven** - for dependency management 

---

## Setup Instructions
1. Create the project in **Eclipse**.  
2. Ensure **TestNG library** is added to the project build path.  
3. Update **ChromeDriver path** in `BaseTest` class 
4. Verify all page classes and test classes are present.  

---

## Execution Tests

### Eclipse**
1. Right-click on **Test Class**.  
2. Select **Run As → TestNG Test**.  

**TestNG Reports**

After test execution, open: <project_root>/test-output/index.html


**Test Details**
**Login Tests**

Positive login with valid credentials.

Negative tests: invalid username, invalid password, blank fields.

Verification: Dashboard URL

**Game Booking Tests**

Select a game, fill booking form, select date and time, submit reservation.

**Booking Negative Tests**

Fill booking form with missing/invalid data.

Verify error messages for: Name, Company, Phone number, Address.





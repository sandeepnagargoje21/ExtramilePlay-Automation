package Extramileplay.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import Extramileplay.pages.LoginPage;


public class BaseTest {
	
	 protected WebDriver driver;

	    @BeforeMethod
	    public void setUp() {
	    	driver = new ChromeDriver();
	        driver.manage().window().maximize(); 
	        new LoginPage(driver);
	    }

	@AfterMethod
	public void tearDown() {
		if (driver != null) {
		 driver.quit(); 
		}
	}
}



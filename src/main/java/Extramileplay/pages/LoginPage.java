package Extramileplay.pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	private WebDriver driver;
	private WebDriverWait wait;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	private  By usernameField = By.xpath("//input[@id='email']");
	private  By passwordField = By.xpath("//input[@id='password']");
	private  By loginButton   = By.xpath("//button[text()='Sign In']");
	private  By loginwithpassword = By.xpath("(//div[@class='login-via-tab'])[1]");

	public void open(String url) {
		driver.get(url);
	}

	public void switchToPasswordLogin () {
		WebElement passwordLoginLink = wait.until(ExpectedConditions.visibilityOfElementLocated(loginwithpassword));
		passwordLoginLink.click();
	}

	public void enterUsername(String username){
		driver.findElement(usernameField).sendKeys(username);
	}

	public void enterPassword(String password){
		driver.findElement(passwordField).sendKeys(password);
	}

	public void clickLogin(){
		driver.findElement(loginButton).click();
	}

	public void login(String user, String pass){
		enterUsername(user);
		enterPassword(pass);
		clickLogin();
	}

	public boolean isDashboardDisplayed() {
		return driver.getCurrentUrl().contains("https://staging.extramileplay.com/");
	}
}

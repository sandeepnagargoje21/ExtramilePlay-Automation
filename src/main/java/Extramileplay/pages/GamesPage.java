package Extramileplay.pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GamesPage {

	private WebDriver driver;
	private WebDriverWait wait;

	public GamesPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	private  By Game = By.xpath("//h5[text()='The Haunting Chase: A Halloween Mystery Hunt']");
	private  By EnterEmail = By.xpath("//input[@placeholder='Enter your work email address']");
	private  By reservation = By.xpath("//button[contains(text(),'Make A Reservation')]");
	private  By datePicker = By.xpath("//input[@placeholder='Select Date']");
	private  By timeDropdown = By.xpath("//select[contains(@id,'timeSelect')]");
	private  By entername = By.xpath("//input[@name='clientFullName']");
	private  By companyname = By.xpath("//input[@name='orgName']");
	private  By phonenumber = By.xpath("//input[@class='form-control ']");
	private  By address = By.xpath("//input[@name='address']");



	public void open(String url) {
		driver.get(url);
	}

	public void Gamebooking(String email) {

		WebElement gameElement = wait.until(ExpectedConditions.presenceOfElementLocated(Game));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true); window.scrollBy(0,-120);", gameElement);

		try {
			wait.until(ExpectedConditions.elementToBeClickable(gameElement)).click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", gameElement);
		}

		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}

		WebElement emailBox = wait.until(ExpectedConditions.visibilityOfElementLocated(EnterEmail));
		js.executeScript("arguments[0].scrollIntoView(true); window.scrollBy(0,-120);", emailBox);
		emailBox.sendKeys(email);
	}

	public void clickreservation() {
		WebElement reservationElement = wait.until(ExpectedConditions.visibilityOfElementLocated(reservation));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true); window.scrollBy(0,-100);", reservationElement);

		try {
			wait.until(ExpectedConditions.elementToBeClickable(reservationElement)).click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", reservationElement);
		}
	}

	public void selectDate(String date) {
		WebElement dateInput = wait.until(ExpectedConditions.elementToBeClickable(datePicker));
		dateInput.clear();

		dateInput.sendKeys(date);

		dateInput.sendKeys(Keys.ENTER);

		wait.until(driver -> dateInput.getAttribute("value").equals(date));
	}

	public void selectTime(String timeValue) {
		WebElement timeElement = wait.until(ExpectedConditions.elementToBeClickable(timeDropdown));
		Select select = new Select(timeElement);
		select.selectByVisibleText(timeValue);

	}

	public void enterfullname(String name) {
		driver.findElement(entername).sendKeys(name);

	}

	public void entercompanyname(String company) {
		WebElement companyName = wait.until(ExpectedConditions.visibilityOfElementLocated(companyname));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true); window.scrollBy(0,-120);", companyName);
		companyName.sendKeys(company);
	}

	public void enternumber(String number) {
		WebElement phoneNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(phonenumber));
		phoneNumber.sendKeys(number);

	}

	public void enteraddress(String add) {
		driver.findElement(address).sendKeys(add);
	}
}

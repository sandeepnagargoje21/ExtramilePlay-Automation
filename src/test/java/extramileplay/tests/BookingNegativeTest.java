package extramileplay.tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import Extramileplay.core.BaseTest;
import Extramileplay.pages.BookingNegativePage;

public class BookingNegativeTest extends BaseTest {


	@Test
	public void testBookingWithMissingData() {

		BookingNegativePage bookingPage = new BookingNegativePage(driver);
		
		Reporter.log("Opening booking page", true);
		bookingPage.open("https://staging.extramileplay.com/book-event");
		
        Reporter.log("Filling booking form with missing/invalid data", true);
		bookingPage.Gamebooking("sandeepnagargoje21@gmail.com");
		bookingPage.clickreservation();
		bookingPage.selectDate("2025/10/01");
		bookingPage.selectTime("10:00 AM GMT+5:30");
		bookingPage.enterfullname("S");
		bookingPage.entercompanyname("B");
		bookingPage.enternumber("7666");
		bookingPage.enteraddress("P");

		String nameError = bookingPage.getNameErrorMessage();
		String companyError = bookingPage.getcompanyErrorMessage();
		String numberError = bookingPage.getnumberErrorMessage();
		String addressError= bookingPage.getaddressErrorMessage();


		Assert.assertEquals(nameError, "name must contain more then 3 charater");
        Reporter.log("Name error message verified: " + nameError, true);

		Assert.assertEquals(companyError, "Please enter valid company name");
        Reporter.log("Company error message verified: " + companyError, true);

		Assert.assertEquals(numberError, "Invalid phone no*917666 false");
        Reporter.log("Number error message verified: " + numberError, true);

		Assert.assertEquals(addressError, "Please enter correct address");
        Reporter.log("Address error message verified: " + addressError, true);

        Reporter.log("Booking form negative test completed", true);



	}

}

package extramileplay.tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import Extramileplay.core.BaseTest;
import Extramileplay.pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test
	public void positiveLogin() {
		  LoginPage login = new LoginPage(driver);
		  
	      login.open("https://staging.extramileplay.com/signin");
	      login.switchToPasswordLogin();
	      login.login("sandeepnagargoje21@gmail.com", "Sandy@1995");

	      try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	       
	        String stableUrl = "https://staging.extramileplay.com/";
	        driver.get(stableUrl);

	        String currentUrl = driver.getCurrentUrl();
	        Assert.assertEquals(currentUrl, stableUrl, "Redirection Failed!");

	        boolean isDashboard = login.isDashboardDisplayed();
	        Assert.assertTrue(isDashboard, "Dashboard URL verification FAILED");
	        System.out.println("Dashboard URL: " + driver.getCurrentUrl());
	}

		    @Test
		    public void invalidPassword() {
		        LoginPage login = new LoginPage(driver);
		        login.open("https://staging.extramileplay.com/signin");
		        login.switchToPasswordLogin();
		        login.login("sandeepnagargoje21@gmail.com", "Sandy@1");
		    }
	
		    @Test
		    public void invalidUsername() {
		        LoginPage login = new LoginPage(driver);
		        login.open("https://staging.extramileplay.com/signin");
		        login.switchToPasswordLogin();
		        login.login("sandeepnagargoje2@gmail.com", "Sandy@1995");
		    }
	
		    @Test
		    public void blankUsernameAndPassword() {
		        LoginPage login = new LoginPage(driver);
		        login.open("https://staging.extramileplay.com/signin");
		        login.switchToPasswordLogin();
		        login.login("", "");
		    }
	
		    @Test
		    public void blankUsernameOnly() {
		        LoginPage login = new LoginPage(driver);
		        login.open("https://staging.extramileplay.com/signin");
		        login.switchToPasswordLogin();
		        login.login("", "Sandy@1995"); 
		    }
	
		    @Test
		    public void blankPasswordOnly() {
		        LoginPage login = new LoginPage(driver);
		        login.open("https://staging.extramileplay.com/signin");
		        login.switchToPasswordLogin();
		        login.login("sandeepnagargoje21@gmail.com", "");
		    }
}


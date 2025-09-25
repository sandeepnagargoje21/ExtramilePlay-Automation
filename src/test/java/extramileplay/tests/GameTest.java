package extramileplay.tests;

import org.testng.annotations.Test;
import Extramileplay.core.BaseTest;
import Extramileplay.pages.GamesPage;

public class GameTest extends BaseTest {


	@Test
	public void selectgamebookslot() {
		GamesPage game = new GamesPage(driver);
		game.open("https://staging.extramileplay.com/book-event");
		game.Gamebooking("sandeepnagargoje21@gmail.com");
		game.clickreservation();
		game.selectDate("2025/10/03");
		game.selectTime("10:00 AM GMT+5:30");
		game.enterfullname("Sandeep Nagargoje");
		game.entercompanyname("BNZ Green Technologies");
		game.enternumber("7666948348");
		game.enteraddress("Katraj, Pune");

	}

}
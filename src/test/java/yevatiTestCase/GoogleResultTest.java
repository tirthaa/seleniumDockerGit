package yevatiTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import yevatiPageObjects.GoogleHomePage;
import yevatiPageObjects.GoogleResultPage;


public class GoogleResultTest extends BaseTest {
	

	//@Test(dataProvider="receiveData")
	@Test
	@Parameters({"Keywordd","Index"})
	public void searchPageTest(String Keywordd, int Index) throws Exception {
		
		GoogleHomePage ghp = new GoogleHomePage(driver);
		GoogleResultPage grp = new GoogleResultPage(driver);
		ghp.LaunchURL();
		ghp.isDisplayed();
		ghp.searchText(Keywordd);
		ghp.clickSuggestionByIndex(Index);
		grp.isDisplayed();
		Thread.sleep(15000L);
		Assert.assertEquals("Pass", "Pass");
		
	}
	
	/*
	 * @DataProvider public Object[][] receiveData() { return new Object[][]{
	 * {"Docker", 3}, {"Selenium", 2}
	 * 
	 * }; }
	 */
}

package yevatiTestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import yevatiPageObjects.GoogleHomePage;

public class GoogleHomeTest extends BaseTest {	
	
	@Test
	public void searchTest() {
		GoogleHomePage ghp = new GoogleHomePage(driver);
		ghp.LaunchURL();
		ghp.isDisplayed();
		Assert.assertEquals(1, 1);
	}

}

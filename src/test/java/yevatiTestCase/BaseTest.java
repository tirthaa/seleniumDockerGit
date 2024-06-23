package yevatiTestCase;

import java.net.MalformedURLException;

import java.net.*;  

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	protected  WebDriver driver;
	
	@BeforeTest
	public void setupDriver() throws MalformedURLException {
		
		String host = "localhost";
		String GetBrowser = "Chrome";
		
		
		if(System.getProperty("HUB_HOST") != null) {
			host = System.getProperty("HUB_HOST");
		}
		
		//Complete URL - Remote
		String FullURL = "http://" + host + ":4444/wd/hub";
		
		DesiredCapabilities dc = null;
		if(GetBrowser.equalsIgnoreCase("Chrome")) {
			dc = DesiredCapabilities.chrome();
			//WebDriverManager.chromedriver().setup();
			//driver = new ChromeDriver();
		} else if(GetBrowser.equalsIgnoreCase("Firefox")) {
			dc = DesiredCapabilities.firefox();
			//WebDriverManager.firefoxdriver().setup();
			//driver = new FirefoxDriver();
		} else if(GetBrowser.equalsIgnoreCase("Edge")) {
			dc = DesiredCapabilities.edge();
			//WebDriverManager.edgedriver().setup();
			//driver = new EdgeDriver();
		} else {
			dc = DesiredCapabilities.chrome();
		}			

		
		//Initialization Remote Driver
		//this.driver = new RemoteWebDriver(new URL(FullURL), dc);
		this.driver = new RemoteWebDriver(new URL(FullURL), dc);
		
		
		//dc=DesiredCapabilities.edge();
		//dc.setCapability(capabilityName, value);
		//this.driver = new RemoteWebdriver;
		
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		
		//System.setProperty("webdriver.edge.driver", "C:\\Project\\BrowserDriver\\chromedriver.exe");
		//driver = new EdgeDriver();
		

		
	}
	
	@AfterTest
	public void quitDriver() {
		this.driver.quit();
	}
	

}

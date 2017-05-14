package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ApplicationPages.HomePage;
import Factory.BrowserFactory;
import Factory.DataProviderFactory;

public class HomePageTest {
	WebDriver driver = BrowserFactory.openBrowser("firefox");
	
	@BeforeMethod
	public void startTest(){
		
		//driver.get(DataProviderFactory.getConfig().getApplication());;
		String url= DataProviderFactory.getConfig().getApplication();
		driver.get(url);
		//driver.get("http://fashiontrend.myavactis.com/");
		}
	
	@Test
	public void verifyHomepageTest(){
		
		HomePage Home_page=PageFactory.initElements(driver,HomePage.class);
		Home_page.MyAccountlinkClick();
		String header=Home_page.getApplicationTitle();
		Assert.assertEquals(header,"Avactis Demo Store");
		
	}
	
	@AfterMethod
	public void CloseTest(){
			BrowserFactory.CloseBrowser();
		
	}
	
}

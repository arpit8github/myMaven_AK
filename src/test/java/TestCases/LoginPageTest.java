package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ApplicationPages.HomePage;
import ApplicationPages.LoginPage;
import Factory.BrowserFactory;
import Factory.DataProviderFactory;

public class LoginPageTest {
	
	WebDriver driver = BrowserFactory.openBrowser("firefox");
	
	@BeforeMethod
	public void startTest(){
		
		//driver.get(DataProviderFactory.getConfig().getApplication());;
		String url= DataProviderFactory.getConfig().getApplication();
		driver.get(url);
		//driver.get("http://fashiontrend.myavactis.com/");
		}
	
	@Test
	public void verifyLoginTest(){
		LoginPage Login_page=PageFactory.initElements(driver,LoginPage.class);
		String uname=DataProviderFactory.getData().getExcelData(0, 1, 0);
		String pwd=DataProviderFactory.getData().getExcelData(0, 1, 1);
		Login_page.loginlinkClick();
		Login_page.EmailClick(uname);
		Login_page.passwordClick(pwd);
		Login_page.LoginClick();
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		//WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='hidden-sm'])[3]")));
		Assert.assertTrue(driver.findElement(By.xpath("(//span[@class='hidden-sm'])[3]")).isDisplayed());
		
}
	
	@AfterMethod
	public void CloseTest(){
			BrowserFactory.CloseBrowser();
		
	}

}

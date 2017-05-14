package Factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver openBrowser(String Browser){
		
		if (Browser.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
		}
		
		else if (Browser.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.InternetExplorer.driver",DataProviderFactory.getConfig().getIEPath());
			driver = new InternetExplorerDriver();
		}
		
		else if (Browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver",DataProviderFactory.getConfig().getChromePath());
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver ;
		
	}
	
	public static void CloseBrowser(){
		driver.close();
	}

}

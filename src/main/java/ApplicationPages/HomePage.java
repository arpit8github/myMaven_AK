package ApplicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		}
	
	@FindBy(xpath="(//span[@class='hidden-xs'])[1]")
	WebElement Homelink;
	
	@FindBy(xpath="(//span[@class='hidden-xs'])[2]")
	WebElement MyAccountlink;
	
	@FindBy(xpath="(//span[@class='hidden-xs'])[3]")
	WebElement MyCartlink;
	
	@FindBy(xpath="(//span[@class='hidden-xs'])[4]")
	WebElement Wishlistlink;
	
	@FindBy(xpath="(//span[@class='hidden-xs'])[5]")
	WebElement loginlink;
	
	public void HomelinkClick(){
		Homelink.click();
	}
	
	public void MyAccountlinkClick(){
		MyAccountlink.click();
	}
	
	public void MyCartlinkClick(){
		MyCartlink.click();
	}
	
	public void WishlistlinkClick(){
		MyCartlink.click();
	}
	
	public void loginlinkClick(){
		MyCartlink.click();
	}
	
	public String getApplicationTitle(){
		
		String Title=driver.getTitle();
		return Title;
	}
	
	
	
	
	
		
		
		
		
		
		
		
	

}

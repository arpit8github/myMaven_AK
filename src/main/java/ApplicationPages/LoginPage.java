package ApplicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Factory.DataProviderFactory;

public class LoginPage {
	
WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
		}
	
	@FindBy(xpath=".//*[@id='account_sign_in_form_email_id']")
	WebElement Email;
	
	@FindBy(xpath=".//*[@id='account_sign_in_form_passwd_id']")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Log In']")
	WebElement loginbutton;
	
	@FindBy(xpath="(//span[@class='hidden-xs'])[5]")
	WebElement loginlink;
	
	public void EmailClick(String uname){
		Email.sendKeys(uname);
	}
	
	public void passwordClick(String pwd){
		password.sendKeys(pwd);;
	}
	
	public void LoginClick(){
		loginbutton.click();
	}
	
	public void loginlinkClick(){
		loginlink.click();
	}
	
	
	

}

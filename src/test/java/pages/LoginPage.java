package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseClass;



public class LoginPage {
	
	WebDriver driver = BaseClass.driver;
	
	@FindBy(id = "user-name")
	WebElement UserName;
	
	@FindBy(name = "password")
	WebElement Password;
	
	@FindBy(id = "login-button")
	WebElement Login;
	
	public LoginPage () {
		
		PageFactory.initElements(driver, this);
	}
	
	public void LoginFuction(String UserNameVal, String PasswordVal) {
		
		UserName.sendKeys(UserNameVal);
		Password.sendKeys(PasswordVal);
		Login.click();
		
	}

}

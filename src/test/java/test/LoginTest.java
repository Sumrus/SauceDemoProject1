package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends BaseClass {
	
	
	@Test
	public void LoginFailure () {
		
		LoginPage log = new LoginPage();
		log.LoginFuction("abc@gmail.com", "xctvni");
		
		WebElement ErrorMsg = driver.findElement(By.xpath("//*[@data-test='error']"));
		
		String ActualMsg = ErrorMsg.getText();
		String ExpMsg = "Epic sadface: Username and password do not match any user in this service";
				
				
		AssertJUnit.assertEquals(ActualMsg, ExpMsg);
		
	}
	
	@Test
	public void SuccessfulLogin() {
		
		LoginPage log = new LoginPage();
		log.LoginFuction("standard_user", "secret_sauce");
		
	}
	

}

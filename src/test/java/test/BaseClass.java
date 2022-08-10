package test;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void SetUp(Method method) {
		
		
		//first setup is to define the driver
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		System.setProperty("webdriver.gecko.driver", "geckodriver");
		
		
		//creating the obj
		//webdriver is Interface therefore creating the obj of ChromeDriver which is implimenting the webdriver
		
		 driver = new ChromeDriver();
		 
		// driver = new FirefoxDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		//Maximising the Window
		
		driver.manage().window().maximize();
		
		//Implicit Wait
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
	}
	
	@AfterMethod
	public void TearDown() {
		
		driver.close();
	}

}

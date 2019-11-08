package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import testbase.TestBase;

public class TestNGSecCase extends TestBase {
	
	public static WebDriver driver;
	public static String expval,actval;
	
	
	@Test
	public void logintest()
	{
		//Step1: lauch Gecko Driver
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\browserexe\\geckodriver.exe");
		
		//Step2: launch Firefox
		driver = new FirefoxDriver();
		
		//Step3: Get Url and navigate to Url
		driver.get("https://www.linkedin.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Step4: Find Elements
		
	    driver.findElement(By.id("login-email")).sendKeys("john#gmail.com");
	    driver.findElement(By.id("login-password")).sendKeys("567890");
	    driver.findElement(By.xpath("//*[@id='login-submit']")).click();
	    
	    driver.quit();
		
		
	}

}

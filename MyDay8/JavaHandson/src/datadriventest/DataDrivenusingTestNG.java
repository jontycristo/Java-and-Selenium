package datadriventest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataDrivenusingTestNG {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\browserexe\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://in.ebay.com/");
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fin.ebay.com%2F");
		Actions action = new Actions(driver);
		//action.moveToElement(driver.findElement(By.linkText("Sign in"))).build().perform();
		driver.findElement(By.linkText("register")).click();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void Form(String firstname, String lastname, String emailaddress, String password){
		
		driver.findElement(By.id("firstname")).clear();
		driver.findElement(By.id("firstname")).sendKeys(firstname);
		driver.findElement(By.id("lastname")).clear();
		driver.findElement(By.id("lastname")).sendKeys(lastname);
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(emailaddress);
		driver.findElement(By.id("PASSWORD")).clear();
		driver.findElement(By.id("PASSWORD")).sendKeys(password); 
		
	}
	
	@AfterTest
	public void tearDown(){
		
		driver.quit();
		
	}

}

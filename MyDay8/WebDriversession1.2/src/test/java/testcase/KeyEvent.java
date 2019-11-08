package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyEvent {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			// Step1: Launch Gecko Driver
			
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\browserexe\\geckodriver.exe");
			
			//Step2: Launch Browser
			
			driver = new FirefoxDriver();
			
			//Open Gmail
			
			driver.get("https://www.gmail.com/");
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.findElement(By.id("identifierId")).sendKeys("jontycristo");
			Thread.sleep(3000);
			driver.findElement(By.id("identifierId")).sendKeys(Keys.ENTER);
			driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("test");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys(Keys.ENTER);
			
			String errortxt= driver.findElement(By.xpath("//div[@jsname='B34EJ']")).getText();
			
			System.out.println("Error Message: "+errortxt);
			
			driver.quit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
		

	}

}

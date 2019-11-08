package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicXpath {
	
	public static WebDriver driver;
	

	public static void main(String[] args) {
		
		try {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\browserexe\\geckodriver.exe");
			driver = new FirefoxDriver();
			
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get( 	"https://www.gmail.com");
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("jontycristo");
			driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
			Thread.sleep(4000);
			
			driver.quit();
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

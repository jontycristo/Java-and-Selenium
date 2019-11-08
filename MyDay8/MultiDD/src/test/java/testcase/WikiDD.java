package testcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WikiDD {
	
	public static String vURL;
	public static WebDriver driver;

	public static void main(String[] args) {
		
		//Step 1: Launch Chrome Driver
		try {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\browserexe\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.wikipedia.org/");
			Thread.sleep(4000);
			
			WebElement lang = driver.findElement(By.xpath("//*[@id='searchLanguage']"));
			
			List <WebElement> DDOptions = lang.findElements(By.tagName("option"));
						
			Select se = new Select(lang);
			
			se.selectByVisibleText("Suomi");
			se.selectByIndex(5);
			se.selectByValue("9");
			
			driver.quit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

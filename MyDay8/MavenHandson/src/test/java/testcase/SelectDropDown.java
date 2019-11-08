package testcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectDropDown {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		try {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\browserexe\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://www.fb.com");
			Thread.sleep(4000);
			
			
			
			List <WebElement> Alloptions = driver.findElements(By.tagName("option"));
			
			
			
			System.out.println(Alloptions.get(0).getText());
			System.out.println();
			
			for (int i = 0; i<Alloptions.size();i++ )
			{
				System.out.println(driver.findElements(By.tagName("option")).get(i).getText());
				
			}
			
			
			WebElement DropDownList = driver.findElement(By.id("day"));
			
			String AllVal = DropDownList.findElements(By.tagName("option")).get(0).getText();
			
			for (int i = 0; i<AllVal.length();i++)
			{
				System.out.println(driver.findElements(By.tagName("option")).get(i).getText());
			}
			
			
			driver.quit();
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


}

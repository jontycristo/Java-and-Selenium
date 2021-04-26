package testcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDD {
	
	public static WebDriver driver;
	public static String vURL; 

	public static void main(String[] args) {
		//Step 1 Launch Gecko driver
		 
		vURL="http://www.fb.com";
		try {
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\browserexe\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(vURL);
			Thread.sleep(4000);
			
			//driver.findElements(By.tagName("option"));
			
			//WebElement AllDD = driver.findElement(By.xpath("//*[@id='month']"));
			
			WebElement AllDD = driver.findElement(By.cssSelector("#month")); 
			
			List <WebElement> DropdownOptions = AllDD.findElements(By.tagName("option"));
			
			
			Select se = new Select(AllDD);
			se.selectByIndex(5);
			se.selectByValue("6");
			se.selectByVisibleText("Dec");
			
			List<WebElement> list=se.getOptions();
			System.out.println(list);
			
			Thread.sleep(4000);
			
			
			//List <WebElement> DropdownOptions = driver.findElements(By.tagName("option"));
			
//			System.out.println(DropdownOptions.size());
//			System.out.println(DropdownOptions.get(0).getText());
//			
			
			
			driver.quit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
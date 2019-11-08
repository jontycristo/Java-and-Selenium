package testcase;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SpiceJet {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\browserexe\\geckodriver.exe");
		
		//Step 2: Launch Browser
		driver = new FirefoxDriver();
		
		//Step3: Open URL
		driver.get("https://www.spicejet.com/");
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//input[@class='input_fromto checkSpecialCharacters ui-autocomplete-input']")).clear();
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.linkText("ADD-ONS"))).build().perform();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		WebElement DD;
		DD = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("MyFlexiPlan")));
		DD.click(); 
//		WebElement DDList = driver.findElement(By.xpath("//*[@id='ui-id-275']"));
//		
//		List<WebElement> Allopt = DDList.findElements(By.xpath("//*[@id='ui-id-95']/div/p[1]/span[1]"));
//		
//		
//		Select se = new Select(DDList);
//		se.selectByValue("Mumbai, India");
	
		driver.quit();
	}

}

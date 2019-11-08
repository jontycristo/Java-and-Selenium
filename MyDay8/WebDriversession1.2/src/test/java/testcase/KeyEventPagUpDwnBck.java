package testcase;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class KeyEventPagUpDwnBck {
	
	public static WebDriver driver;
	

	public static void main(String[] args) {
		
		try {
			// Step1: Launch Gecko Driver
			
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\browserexe\\geckodriver.exe");
						
			//Step2: Launch Browser
						
			driver = new FirefoxDriver();
						
			//Open Gmail
						
			driver.get("https://www.spicejet.com/");
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			//WebElemet list = driver.findElement(By.xpath("//span[@class='NlWrkb snByac']"));
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
			
			/*Thread.sleep(2000);
			
			driver.switchTo().frame("");
			
			WebElement list = driver.findElement(By.xpath("//*[@id='initialView']/div[2]/div[3]/div/div"));
			
			//List<WebElement> DD = list.findElements(By.);
			
			System.out.println(list);
			
			Select se = new Select(list);
			se.selectByIndex(0);*/
			
			Thread.sleep(4000);
			
			WebElement DD = driver.findElement(By.id("highlight-addons"));
			
			driver.findElement(By.linkText("MyFlexiPlan")).click();
			//List<WebElement> list = DD.findElements(By.tagName("a"));
			
			
			//Select se = new Select (DD);
			//se.selectByVisibleText("MyFlexiPlan");
			
			Thread.sleep(2000);
			//String exptxt = "My Flexi Plan";
			WebElement actualtxt = driver.findElement(By.xpath("//*[@id='staticmainContentFullpage']/div/p[1]"));//.getText();
			System.out.println("Text Message is: "+actualtxt);
			
			
				actualtxt.sendKeys(Keys.PAGE_DOWN);
				Thread.sleep(4000);
				//driver.findElement(By.xpath("//*[@id='staticmainContentFullpage']/h1")).sendKeys(Keys.PAGE_UP);
				//Thread.sleep(4000);
				//driver.navigate().back();
				//Thread.sleep(2000);
			
			
			driver.quit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

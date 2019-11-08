package testcase;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class MultiWindows {
	
	public static WebDriver driver;
	

	public static void main(String[] args) {
		
		try {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\browserexe\\geckodriver.exe");
			driver = new FirefoxDriver();
			
			driver.get("https://www.hdfcbank.com/");
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			Set<String> winids = driver.getWindowHandles();
			Iterator<String> iterator = winids.iterator();
			
			driver.findElement(By.linkText("Personal Loan EMI Calculator")).click();
			
			winids= driver.getWindowHandles();
			iterator = winids.iterator();
			
			String mainwindow = iterator.next();
			System.out.println("Main Windo Id--> "+mainwindow);
			
			String secondwindow = iterator.next();
			System.out.println("Second Window Id--> "+secondwindow);
			
			Thread.sleep(4000);
			
			driver.switchTo().window(secondwindow);
			driver.close();
			
			//Wait wait = new FluentWait<String>(driver.findElement(By.linkText("Personal Loan EMI Calculator"))).pollingEvery(10, TimeUnit.SECONDS)

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		

	}

}

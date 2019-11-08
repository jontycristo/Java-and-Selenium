package testcase;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Naukri {
	
	public static WebDriver driver;
	

	public static void main(String[] args) throws Exception {
		
		
		
		
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\browserexe\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/");
		
			
		Set<String> WinIds = driver.getWindowHandles();
		Iterator<String> iterator = WinIds.iterator();
		
		String mainwinid =  iterator.next();
		
		System.out.println("Main Window ID: "+mainwinid);
		String childwin1 =  iterator.next();
		String childwin2 =  iterator.next();
		String childwin3 =  iterator.next();
		driver.switchTo().window(childwin1);
		driver.close();
		driver.switchTo().window(childwin2);
		driver.close();
		driver.switchTo().window(childwin3);
		driver.close();
		driver.switchTo().window(mainwinid);
		
		driver.findElement(By.linkText("Login")).click();
		
		Thread.sleep(3000);
		
		
		
		driver.quit();

	}

}

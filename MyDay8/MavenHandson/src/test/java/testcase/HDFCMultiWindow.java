package testcase;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HDFCMultiWindow {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		try {
			//Step 1: Launch Gecko driver
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\browserexe\\geckodriver.exe");
			
			// Step2: Launch Firefox browser
			driver = new FirefoxDriver();
			
			//Step3: Open URL
			driver.get("https://www.hdfcbank.com/");
			Thread.sleep(4000);
			
			//Step4: Get Window ID
			Set <String> MultiWin = driver.getWindowHandles();
			Iterator<String> WinID = MultiWin.iterator();
			
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[1]/div[2]/ul/li[1]/a")).click();
			Thread.sleep(5000);
			
			MultiWin= driver.getWindowHandles();
			WinID = MultiWin.iterator();
			
			driver.findElement(By.cssSelector("body > div.container.ng-scope > section.box > div > div.col2.clearfix > div.form > div.result > div > div.txt_center > a")).click();
			Thread.sleep(2000);
			
			MultiWin = driver.getWindowHandles();
			WinID = MultiWin.iterator();
			
			String frstwin = WinID.next();
			System.out.println(frstwin);
			
			String secwin = WinID.next();
			System.out.println(secwin);
			
			String thirdwin = WinID.next();
			System.out.println(thirdwin);
			
			driver.switchTo().window(thirdwin);
			driver.close();
			Thread.sleep(2000);
			
			driver.switchTo().window(secwin);
			driver.close();
			Thread.sleep(2000);
			
			driver.switchTo().window(frstwin);
			driver.close();
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

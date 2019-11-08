package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GoogleNavi {
	
	public static String vURL, browsername;
	public static WebDriver driver;

	public static void main(String[] args) {
	try {
		vURL="https://www.google.com";	
		browsername="IE";
			
		switch (browsername) {
		case "Firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mary\\workspace\\MyDay8\\Googlenav\\src\\main\\resources\\browserexe\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
			
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mary\\workspace\\MyDay8\\Googlenav\\src\\main\\resources\\browserexe\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
			
		case "IE":
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Mary\\workspace\\MyDay8\\Googlenav\\src\\main\\resources\\browserexe\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;

		default:
			System.out.println("Selenium Does not support any other browser");
			break;
		}
		
		driver.get(vURL);
		Thread.sleep(5000);
		driver.findElement(By.linkText("Business")).click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.linkText("LEARN MORE")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.quit();
		
		
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}

package testcase;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class Navigation {

	public static WebDriver driver;
	public static String vURL;
	
	public static void main(String[] args) {
		
		try {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\browserexe\\geckodriver.exe");
			driver =  new FirefoxDriver();
			
			driver.get("https://www.google.com");
			Thread.sleep(4000);
			driver.findElement(By.linkText("Gmail")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(2000);
			driver.navigate().forward();
			Thread.sleep(2000);
			
			driver.quit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

package testcase;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NaukriProfileUpdate {

	public static WebDriver driver;

	public static void main(String[] args) {

		try {

			// Step 1: Launh Chrome Driver
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir" + "") + "\\src\\test\\resources\\browserexe\\chromedriver.exe");

			// Step 2: Launch Chrome Browser
			driver = new ChromeDriver();
			driver.manage().window().maximize();

			// Step3: Open Naukri.com
			driver.get("https://www.naukri.com/");

			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver, 20);
			// WebElement linktext =
			// wait.until(ExpectedConditions.visibilityOfElementLocated((( ));

			// Set<String> winIds = driver.getWindowHandles();
			// Iterator<String> iterator= winIds.iterator();
			//
			// String mainwin = iterator.next();
			// System.out.println("Main Window ID: "+ mainwin);
			// driver.switchTo().window(mainwin);
			//
			// //Click on Login Button
			// driver.findElement(By.linkText("LOGIN")).click();
			//
			// String loginwin = iterator.next();
			// System.out.println("Login Window Id: "+loginwin);
			//
			// driver.switchTo().window(mainwin);
			// driver.close();
			//
			// driver.switchTo().defaultContent();
			// String expvalue ="Login";
			//
			// Thread.sleep(3000);
			//
			driver.findElement(By.id("eLoginNew")).clear();
			driver.findElement(By.id("eLoginNew")).sendKeys("jontycristo@gmail.com");

			// WebElement username =
			// driver.findElement(By.xpath("//*[@id='eLoginNew']"));
			// username.sendKeys("jontycristo@gmail.com");
			// String actval =
			// driver.findElement(By.xpath("//*[@id='loginForm']/div[1]/div/strong")).getText();
			// System.out.println("Actual Value: "+ actval);

			// if(expvalue.equalsIgnoreCase(actval)){
			//
			// System.out.println("Pass");
			//
			// }
			// else{
			// System.out.println("Fail");
			// }

			Thread.sleep(4000);
			// driver.quit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

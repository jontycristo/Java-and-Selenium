import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class RediffAlerthandling {

	
	public static String browsername, vURL,vusername,vPassword;
	public static WebDriver driver;
	
	public static void main(String[] args) {
		vURL="https://www.rediff.com";
		vusername="test";
		vPassword="";
		System.out.println(System.getProperty("user.dir"));
		
		try {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mary\\workspace\\MyDay8\\RediffScreenshot\\src\\main\\resources\\browserexe\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(vURL);
			Thread.sleep(2000);
			driver.findElement(By.linkText("Sign in")).click();
			driver.findElement(By.id("login1")).sendKeys(vusername);
			driver.findElement(By.id("password")).sendKeys(vPassword);
			driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input")).click();
			Thread.sleep(2000);
			Alert alert = driver.switchTo().alert();
			String Almsg = driver.switchTo().alert().getText();
			String expectedmsg="Test";
			System.out.println(Almsg);
			if(expectedmsg.equalsIgnoreCase(Almsg))
			{
				System.out.println("Pass");
			}
			else
			{
				System.out.println("Fail");
			}
			
			alert.accept();
			driver.switchTo().defaultContent();
			driver.findElement(By.id("login1")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("password"));
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
			
			
			driver.quit();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

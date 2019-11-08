package testcase;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertHandling {
	
	public static String vURL, vusername, vPass;
	public static WebDriver driver;
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		vURL="https://www.rediff.com";
		vusername="test";
		vPass="";
		
		try {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\browserexe\\geckodriver.exe");
			driver   = new FirefoxDriver();
			driver.get(vURL);
			Thread.sleep(2000);
			
			driver.findElement(By.linkText("Sign in")).click();
			driver.findElement(By.id("login1")).sendKeys(vusername);
			driver.findElement(By.id("password")).sendKeys(vPass);
			driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input")).click();
			Thread.sleep(2000);
			
		
			Alert alert = driver.switchTo().alert();
			String ActualTxt = driver.switchTo().alert().getText();
			
			System.out.println(ActualTxt);
			
			String expected="test";
			
			if (ActualTxt.equalsIgnoreCase(expected))
			{
				System.out.println("Pass");
			}
			
			else
			{
				System.out.println("Fail");
			}
			
			AlertHandling.getscreenshot(System.getProperty("user.dir")+"\\src\\test\\resources\\screenshots\\"+GetCurrectTimeStamp().replace("-", "_").replace(".", "_")+".jpg");
			
			alert.accept();
			driver.switchTo().defaultContent();
			driver.findElement(By.id("login1")).clear();
			
			Thread.sleep(2000);
			
			driver.quit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
			AlertHandling.getscreenshot(System.getProperty("user.dir")+"\\src\\test\\resources\\screenshots\\"+GetCurrectTimeStamp().replace("-", "_").replace(".", "_"));
			e.printStackTrace();
		}

	}
	
	public static void getscreenshot(String path) throws Exception
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //The below method will save the screen shot in d drive with name "screenshot.png"
           FileUtils.copyFile(scrFile, new File(path));
		
	}
	
	public static String GetCurrectTimeStamp()
	{
		SimpleDateFormat strFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		Date now = new Date();
		String strDate = strFormat.format(now);
		return strDate;
	}

}

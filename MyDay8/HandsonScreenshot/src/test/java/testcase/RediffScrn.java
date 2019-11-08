package testcase;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RediffScrn {
	
	public static String vURL,vusername,vPass;
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		// Step1: Launch gecko driver
		
		try {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\browserexefile\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://www.rediff.com");
			Thread.sleep(4000);
			
			RediffScrn.getScreenshot(System.getProperty("user.dir")+"\\src\\test\\resources\\screenshots\\"+GetCurrentTimeStamp().replace(":", "_").replace(".", "_")+".jpg");
			
			driver.quit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
			RediffScrn.getScreenshot(System.getProperty("user.dir")+"\\src\\test\\resources\\screenshots\\"+GetCurrentTimeStamp().replace(":", "_").replace(".", "_"));
			
			e.printStackTrace();
		}

	}
	
	public static void getScreenshot(String path) throws Exception
	{
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(srcfile, new File(path));
	}
	
	public static String GetCurrentTimeStamp()
	{
		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss.SSS");
		Date now = new Date();
		String srcdate = sdfDate.format(now);
		return srcdate;
	}

}

package testcase;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotFacebook {

	public static WebDriver driver;
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//TakeScreenshot obj = new TakeScreenshot();
		
		try {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\browserfiles\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.fb.com");
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			TakeScreenshotFacebook.getScreenshot(System.getProperty("user.dir")+"\\src\\test\\resources\\screenshots\\"+getCurrentTimeStamp().replace(":", "_").replace(".", "_")+".jpg");
			
			driver.quit();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
			TakeScreenshotFacebook.getScreenshot(System.getProperty("user.dir")+"\\src\\test\\resources\\screenshots\\"+getCurrentTimeStamp().replace(":", "_").replace(".", "_"));
			e.printStackTrace();
		}
		
		

	}
	
	public static void getScreenshot (String path) throws Exception 
	{
		File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrfile, new File(path));
	}
	
	public static String getCurrentTimeStamp()
	{
		SimpleDateFormat sdrDate = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss.SSS");
		Date now = new Date();
		String strDate = sdrDate.format(now);
		return strDate;
	}

}

package testcase;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBScrnshot {
	
	public static String vURL;
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
		vURL = "https://www.fb.com";
		
		System.getProperty("user.dir");
		
		//Step 1: Launch Chrome Driver
		try {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\browserexe\\chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.get(vURL);
			
			Thread.sleep(4000);
			
			FBScrnshot.getscreenshot(System.getProperty("user.dir")+"\\src\\test\\resources\\screenshots"+GetCurrentTimeStamp().replace("-", "_").replace(".", "_")+".jpg");
			
			
			driver.quit();
			
		} catch (InterruptedException e) {
			FBScrnshot.getscreenshot(System.getProperty("user.dir")+"\\src\\test\\resources\\screenshots"+GetCurrentTimeStamp().replace("-", "_").replace(".", "_"));
			e.printStackTrace();
		}
	}
	
	public static void getscreenshot(String path) throws Exception 
    {
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         //The below method will save the screen shot in d drive with name "screenshot.png"
            FileUtils.copyFile(scrFile, new File(path));
    }
	
	public static String GetCurrentTimeStamp()
	{
		SimpleDateFormat strDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:.SSS");
		Date now = new Date();
		String strFormat = strDate.format(now);
		return strFormat;
	}

}

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RediffScrnshots {
	
	public static String browsername, vURL;
	public static WebDriver driver;
	

	public static void main(String[] args) throws Exception {
		
		vURL="https://www.rediff.com";
		System.out.println(System.getProperty("user.dir"));
		
		try {
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\browserexe\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(vURL);
			
					
			RediffScrnshots.getscreenshot(System.getProperty("user.dir")+"\\src\\test\\resources\\screenshots\\"+GetCurrentTimeStamp().replace(":", "_").replace(".","_")+".jpg");
			
			driver.quit();
		} catch (Exception e) {
			
			RediffScrnshots.getscreenshot(System.getProperty("user.dir")+"\\src\\test\\resources\\screenshots\\"+GetCurrentTimeStamp().replace(":", "_").replace(".","_"));
			
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
		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		Date now = new Date();
		String strDate = sdfDate.format(now);
		System.out.println(strDate);
		return strDate;
	}

}

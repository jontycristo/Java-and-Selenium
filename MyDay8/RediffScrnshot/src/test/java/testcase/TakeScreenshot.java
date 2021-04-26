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

public class TakeScreenshot {

	public static WebDriver driver;

	public static void main(String[] args) throws Exception {

		try {
			// Step 1: Launch Chrome Driver

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\browserfiles\\chromedriver.exe");

			// Step 2: Launch Chrome Browser

			driver = new ChromeDriver();

			driver.get("https://www.rediff.com");

			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			driver.manage().window().maximize();

			TakeScreenshot.getscreenshot(System.getProperty("user.dir") + "\\src\\test\\resources\\screenshots\\"
					+ GetCurrentTimeStamp().replace(":", "_").replace(".", "_") + ".jpg");

			// Thread.sleep(4000);

			driver.quit();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block

			TakeScreenshot.getscreenshot(System.getProperty("user.dir") + "\\src\\test\\resources\\screenshots"
					+ GetCurrentTimeStamp().replace(":", "_").replace(".", "_"));

			e.printStackTrace();
		}

	}

	public static void getscreenshot(String path) throws Exception {

		File srcfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(srcfile, new File(path));

		/*
		 * File scrFile =
		 * ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //The
		 * below method will save the screen shot in d drive with name
		 * "screenshot.png" FileUtils.copyFile(scrFile, new File(path));
		 */

	}

	public static String GetCurrentTimeStamp() {
		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		Date now = new Date();
		String strDate = sdfDate.format(now);
		return strDate;
	}

}
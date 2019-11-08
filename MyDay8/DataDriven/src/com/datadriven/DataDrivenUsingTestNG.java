package com.datadriven;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utlity.testUtil;

public class DataDrivenUsingTestNG {

	public static WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\com\\browserexe\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.get("https://www.naukri.com/");
		driver.get("https://freecrm.com/");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Login")).click();
		/*Set<String> winids = driver.getWindowHandles();
		Iterator<String> iterator = winids.iterator();
		String mainwindow = iterator.next();
		driver.switchTo().window(mainwindow);
		driver.findElement(By.linkText("LOGIN")).click();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
*/
	}

	@DataProvider
	public Iterator<Object[]> getTestData() {
		ArrayList<Object[]> testdata = testUtil.getExcelData();
		return testdata.iterator();
	}

	@Test(dataProvider = "getTestData")
	public void login(String username, String password) throws Exception {
		try {
			driver.findElement(By.id("eLoginNew")).clear();
			driver.findElement(By.id("eLoginNew")).sendKeys(username);
			driver.findElement(By.id("pLogin")).clear();
			driver.findElement(By.id("pLogin")).sendKeys(password);

			Thread.sleep(3000);

			DataDrivenUsingTestNG.getscreenshot(System.getProperty("user.dir") + "\\src\\com\\screenhots"
					+ GetCurrentTimeStamp().replace(":", "_").replace(".", "_") + ".jpg");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			DataDrivenUsingTestNG.getscreenshot(System.getProperty("user.dir") + "\\src\\com\\screenhots"
					+ GetCurrentTimeStamp().replace(":", "_").replace(".", "_"));
			e.printStackTrace();
		}
		
		
	}
	
	public static void getscreenshot(String path) throws Exception {

		File srcfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile, new File(path));

	}

	public String GetCurrentTimeStamp() {

		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		Date now = new Date();
		String strDate = sdfDate.format(now);
		return strDate;

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	

}

package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	public static WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Java Session\\Resource\\Browser Exe files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.google.com");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test(priority = 1, groups = "Title")
	public void GoogleTitleTest() {
		try {
			String title = driver.getTitle();
			System.out.println(title);
			Assert.assertEquals(title, "Google1234");

			/*
			 * if (title.equals("GoogleNe")) { System.out.println("Passed"); }
			 * else { System.out.println("Failed"); }
			 */
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 2, groups = "Logo")
	public void GoogleLogoTest() {
		try {
			Boolean b = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
			Assert.assertTrue(b);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 3, groups = "Mail test")
	public void MailTest() {

		Boolean b = driver.findElement(By.linkText("mail")).isEnabled();

	}

	@Test(priority = 4, groups = "Test")
	public void Test1() {

		System.out.println("Test 2");
	}

	@Test(priority = 4, groups = "Test")
	public void Test2() {

		System.out.println("Test 3");
	}

	@Test(priority = 4, groups = "Test")
	public void Test3() {

		System.out.println("Test 4");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}

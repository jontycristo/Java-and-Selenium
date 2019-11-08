package com.testngscreenshot;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class TakesScreenshotTest extends Base{

	@BeforeMethod
	public void setUp(){
		intializatio();
	}
	
	@Test(priority=1)
	public void takeScreenshot1(){
		String title = driver.getTitle();
		Assert.assertEquals(title, "Google123");
	}
	
	@Test(priority=2)
	public void takeScreenshot2(){
		String title = driver.getTitle();
		Assert.assertEquals(title, "Google");
	}
	
	@Test(priority=3)
	public void takeScreenshot3(){
		String title = driver.getTitle();
		Assert.assertEquals(title, "GoogleTest");
	}
	
	@Test(priority=4)
	public void takeScreenshot4(){
		String title = driver.getTitle();
		Assert.assertEquals(title, "GoogleS");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}

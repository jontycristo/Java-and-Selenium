package com.crm.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void intialize(){
		intialization();
		loginPage = new LoginPage();
	}
	
	/*@Test(priority=3)
	public void validateLoginTitle(){
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "#1 Free CRM software for any business - FreeCRM.com");
	}
	
	@Test(priority=2)
	public void validateCRMLogoTest(){
		boolean b = loginPage.validateCRMLogo();
		System.out.println("Image Displayed: "+b);
		Assert.assertTrue(b);
	}*/
	
	@Test(priority=1)
	public void validateLogintest(){
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		homePage = loginPage.ValdiateLogin(prop.getProperty("email"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}

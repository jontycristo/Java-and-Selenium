package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;

	public HomePageTest() {
		super();
	}

	// Test cases should be independent so we launch browser for every test
	// cases
	@BeforeMethod
	public void setUp() {
		intialization();
		loginPage = new LoginPage();
		contactsPage = new ContactsPage();
		homePage = loginPage.ValdiateLogin(prop.getProperty("email"), prop.getProperty("password"));
	}

	@Test(priority = 1)
	public void verifyHomePageTitle() {
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "CRM", "HomePage Title does not match");
	}

	@Test(priority = 2)
	public void verifyUserNameLable() {
		Assert.assertTrue(homePage.verifyUserNameLable());
	}

	@Test(priority = 3)
	public void verifyContactsLinkTest() throws Exception {
		contactsPage = homePage.clickOnContactsLink();
		Thread.sleep(5000);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}

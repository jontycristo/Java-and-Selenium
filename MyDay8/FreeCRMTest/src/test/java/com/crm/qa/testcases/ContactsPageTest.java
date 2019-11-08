package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	String sheetName ="DataSheet";
	
	public ContactsPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		intialization();
		loginPage = new LoginPage();
		contactsPage = new ContactsPage();
		homePage = loginPage.ValdiateLogin(prop.getProperty("email"), prop.getProperty("password"));
		contactsPage = homePage.clickOnContactsLink();
	}
	
	@DataProvider
	public Object[][] getCRMTestData(){
		Object[][] data = TestUtil.getTestData(sheetName);
		return data;
	}
	
	/*@Test(priority=1)
	public void verifyContactLable() throws Exception{
		
		Assert.assertTrue(contactsPage.verifyContactLable(),"Contact Lable is missing on the page");
	}
	
	@Test(priority=2)
	public void verifyContactByNameTest() throws Exception{
		
		contactsPage.selectContatcsByName("Arunachalam Thangaraja");
	}*/
	
	@Test(priority=3, dataProvider="getCRMTestData")
	public void verifyCreateContact(String fstName, String lstName, String comp, String source){
		contactsPage.createNewContact(fstName, lstName, comp, source);
	}
	
	@AfterMethod
	public void tearDown(){
		//driver.quit();
	}

}

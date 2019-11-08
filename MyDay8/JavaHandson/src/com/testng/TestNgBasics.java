package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {

	// @Before are precondition annotations-- runs before execution of test case

	@BeforeSuite
	public void setUp() {
		System.out.println("Setup system property Chrome");
	}

	@BeforeTest
	public void launchbrowser() {
		System.out.println("Launch Browser");
	}

	@BeforeClass
	public void enterURL () {
		System.out.println("Enter into App");
	}

	@BeforeMethod
	public void Login() {
		System.out.println("Login into App");
	}

	// @Test are test cases

	@Test
	public void googleTitleTest() {
		System.out.println("Google Title Test");
	}
	
	@Test
	public void searchTest(){
		System.out.println("Search test case");
	}
	
	@Test
	public void selectProduct(){
		System.out.println("Product Selected");
	}

	@AfterMethod
	public void Logout() {
		System.out.println("Logout from the APP");
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("Close all Browser");
	}

	@AfterTest
	public void deleteAllCookies() {
		System.out.println("Clear all cookies");
	}

	@AfterSuite
	public void Generateeport() {
		System.out.println("Generate All report");
	}

}

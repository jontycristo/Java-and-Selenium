package testcase;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGFrstCase {
	
	public static String expval = "John";
	public static String actualval="Cris";
	
	@BeforeMethod
	
	public void login()
	{
		System.out.println("login---@BeforeMethod");
		
		
	}
	
	@Test(priority=1)
	public void searchIphone()
	{
		System.out.println("Search Iphone---@testcase1");

	}
	
	@Test(priority=2,dependsOnMethods={"searchIphone"})
	
	public void AddtoCart()
	{
		System.out.println("Add IPhone to cart---@Tescase2");
		Assert.assertEquals(actualval, expval);
	}
	
	@Test(priority=3,dependsOnMethods={"searchIphone","AddtoCart"})
	
	public void OrderIphone()
	{
		System.out.println("Order Iphone---@Tescase3");
	}

	public void logout()
	{
		System.out.println("Logout Sucessfully--@AfterMethod");
		System.out.println("==============================");
	}
}

package com.testng;

import org.testng.annotations.Test;

public class DependsOnMethodTest {
	
	@Test
	public void Login(){
		int a = 9/1;
		System.out.println("A= "+a);
	}
	
	@Test(dependsOnMethods="Login")
	public void Profile(){
		System.out.println("Profile Tab");
	}
	
	@Test(dependsOnMethods="Login")
	public void Search(){
		System.out.println("Search Tab");
	}
	
	@Test(dependsOnMethods="Login")
	public void Product(){
		System.out.println("Product Tab");
	}
	
	@Test(dependsOnMethods="Login")
	public void AddToCart(){
		System.out.println("Add to Cart");
	}
	
	@Test(invocationCount=10)
	public void Run(){
		System.out.println("Run 10 times");
	}

}

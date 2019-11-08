package com.testng;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(invocationCount=10)
	public void IncocationTest(){
		System.out.println("Invocation Test 10 times");
	}

}

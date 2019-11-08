package com.testng;

import org.testng.annotations.Test;

public class TimeOutsException {

	/*@Test(invocationTimeOut = 2000)
	public void InfinateLoop() {

		int i = 1;
		while (i == 1) {
			System.out.println(i);
		}

	}*/
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void Convert(){
		String x = "100A";
		Integer.parseInt(x);
	}
}

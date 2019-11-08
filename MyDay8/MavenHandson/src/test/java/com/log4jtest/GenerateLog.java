package com.log4jtest;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenerateLog {

	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Logger log = Logger.getLogger(GenerateLog.class);
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\browserexe\\geckodriver.exe");
		driver = new FirefoxDriver();
		log.info("Browser Launched");
		driver.get("http://www.google.com");
		log.info("URL loaded");
		
		String title = driver.getTitle();
		System.out.println("Get Title: "+title);
		log.info("Get Title: "+title);
		 if(title.equals("Google")){
			 System.out.println("Passed");
			 log.info("Title is correct and Test case is Passed");
		 } 
		 else{
			 System.out.println("Failed");
			 log.info("Title is incorrect and Test case is Failed");
		 }
		 
		 driver.quit();

	}

}

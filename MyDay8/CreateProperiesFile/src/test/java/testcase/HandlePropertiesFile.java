package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import testbase.TestBase;

public class HandlePropertiesFile extends TestBase {
	
	
	@Test
	public void searchnametext()
	{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir"+"\\src\\test\\resources\\browserexe\\geckodriver.exe"));
		driver = new FirefoxDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

}

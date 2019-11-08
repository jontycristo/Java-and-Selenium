package testbase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
	
	@BeforeTest
	public void openbrowser()
	{
		System.out.println("Open Browser--@BeforeClass");
	}
	
	@AfterTest
	
	public void tearDown()
	{
		System.out.println("Close Browser--@AfterTes");		
	}

}

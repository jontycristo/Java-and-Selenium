package testbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
	
	public static WebDriver driver;
	public static String vexpval,vactval,path;
	public static File file;
	public static FileInputStream fs;
	public static Properties prop;
	
	@BeforeTest
	
	public void intialization() throws IOException
	{
		String path = System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\config.properties";
		file = new File(path);
		fs = new FileInputStream(file);
		prop = new Properties();
		prop.load(fs);
	}
	
	@AfterTest
	
	public void tearDown()
	{
		driver.quit();
	}
	

}

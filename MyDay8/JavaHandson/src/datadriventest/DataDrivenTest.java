package datadriventest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.excel.utility.Xls_Reader;

public class DataDrivenTest {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\browserexe\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://in.ebay.com/");
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fin.ebay.com%2F");
		Actions action = new Actions(driver);
		//action.moveToElement(driver.findElement(By.linkText("Sign in"))).build().perform();
		driver.findElement(By.linkText("register")).click();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Xls_Reader reader = new Xls_Reader("C:\\Users\\Mary\\workspace\\MyDay8\\JavaHandson\\src\\com\\testdata\\TestData.xlsx");
				
		int RowCount = reader.getRowCount("RegDataTest");
		System.out.println("Row count "+RowCount);
		reader.addColumn("RegDataTest", "Status");
		
		//Parameterization done by for loop
		
		for(int rowNum = 2; rowNum<=RowCount; rowNum++){
			
			String firstname = reader.getCellData("RegDataTest", "firstname",rowNum);
			System.out.println(firstname);
			String lastname = reader.getCellData("RegDataTest", "lastname", rowNum);
			System.out.println(lastname);
			String emailaddress = reader.getCellData("RegDataTest", "emailaddress", rowNum);
			System.out.println(emailaddress);
			String password = reader.getCellData("RegDataTest", "password", rowNum);
			System.out.println(password);
			
			driver.findElement(By.id("firstname")).clear();
			driver.findElement(By.id("firstname")).sendKeys(firstname);
			driver.findElement(By.id("lastname")).clear();
			driver.findElement(By.id("lastname")).sendKeys(lastname);
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("email")).sendKeys(emailaddress);
			driver.findElement(By.id("PASSWORD")).clear();
			driver.findElement(By.id("PASSWORD")).sendKeys(password);
			
			reader.setCellData("RegDataTest", "Status", rowNum, "Pass");
		
		}
		
	}

}

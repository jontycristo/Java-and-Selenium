package webTableConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.excel.utility.Xls_Reader;

public class HandleWebTable {

	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\browserexe\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		
		String beforeXpath_companyname="//*[@id='customers']/tbody/tr[";
		String afterXpath_companyname="]/td[1]";
		
		String beforeXpath_contactname="//*[@id='customers']/tbody/tr[";
		String afterXpath_contactname="]/td[2]";
		
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id='customers']//tr"));
		System.out.println("Total row: "+rows.size());
		
		Xls_Reader reader = new Xls_Reader("C:\\Users\\Mary\\workspace\\MyDay8\\JavaHandson\\src\\com\\testdata\\TestData.xlsx");
		reader.addSheet("HomePage");
		reader.addColumn("HomePage", "CompanyName");
		reader.addColumn("HomePage", "ContactName");
		
		for(int i =2;i<=7;i++){
			
			String actualXpath_companyname=beforeXpath_companyname+i+afterXpath_companyname;
			
			String companyName = driver.findElement(By.xpath(actualXpath_companyname)).getText();
			System.out.println(companyName);
			
			reader.setCellData("HomePage", "CompanyName", i, companyName);
			
			String actualXpath_contactname=beforeXpath_contactname+i+afterXpath_contactname;
			
			String contactname = driver.findElement(By.xpath(actualXpath_contactname)).getText();
			System.out.println(contactname);
			
			reader.setCellData("HomePage", "ContactName", i, companyName);
			
			
		}
		

	}

}

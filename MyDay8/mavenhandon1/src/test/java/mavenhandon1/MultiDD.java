package mavenhandon1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiDD {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\browserexe\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.get("https://www.fb.com");
			WebElement AllDD = driver.findElement(By.xpath("//select[@id='day']")); ////*[@id="day"]
			List<WebElement> element = AllDD.findElements(By.tagName("option"));
			int count = element.size();
			System.out.println(count);
			
			for (int i=0; i<count;i++){
				
				System.out.println(element.get(i).getText());
			}
			
			
			Thread.sleep(4000);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			driver.quit();
		}

	}

}

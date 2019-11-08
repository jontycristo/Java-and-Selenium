package handlingPopup;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleWindowPopup {

	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\src\\browserexe\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("http://www.popuptest.com/goodpopups.html");
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[1]")).click();
			
			Set<String> handles = driver.getWindowHandles();
			Iterator<String> iterator = handles.iterator();
			
			String mainwinid= iterator.next();
			
			System.out.println("Parent Window id: "+mainwinid);
			
			String childwin=iterator.next();
			System.out.println("Parent Window id: "+childwin);
			
			driver.switchTo().window(childwin);
			Thread.sleep(5000);
			driver.close();
			driver.switchTo().window(mainwinid);
			System.out.println("Parent Window Title: "+driver.getTitle());
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

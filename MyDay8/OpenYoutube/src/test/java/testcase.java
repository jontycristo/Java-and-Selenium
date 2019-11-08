import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testcase {
	
	public static String vURL, browsername;
	WebDriver driver;

	public static void main(String[] args) {
		
		try {
			vURL="https://www.youtube.com";
			
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Mary\\workspace\\MyDay8\\OpenYoutube\\src\\test\\resources\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get(vURL);
			Thread.sleep(5000);
			driver.quit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

package mavenhandon1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoveMovement {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir"+"\\src\\test\\resources\\browserexe\\chromedriver.exe"));
		driver = new ChromeDriver();
		driver.get("https://www.google.com");

	}

}

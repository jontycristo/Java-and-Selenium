package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTest {

	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\browserexe\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.fb.com");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement firstName = driver.findElement(By.xpath("//input[contains(@name,'firstname')]"));
		WebElement lastName = driver.findElement(By.xpath("//input[contains(@name,'lastname')]"));

		sendKeys(driver, firstName, 20, "Cristo");
		sendKeys(driver, lastName, 10, "Jonty");

	}

	public static void sendKeys(WebDriver driver, WebElement element, long timeOut, String value) {
		new WebDriverWait(driver, timeOut).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}

}

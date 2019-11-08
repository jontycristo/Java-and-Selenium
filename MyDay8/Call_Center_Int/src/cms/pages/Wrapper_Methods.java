package cms.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.testng.log4testng.Logger;

import com.sun.org.apache.bcel.internal.generic.Select;

public class Wrapper_Methods {
	protected static RemoteWebDriver driver;
	Logger logger = Logger.getLogger("CSRLogs");

	public Properties loadObjectRepository(String FileName) throws FileNotFoundException, IOException {
		// Step 1: Instantiate Properties (java.util)
		Properties p = new Properties();
		// Step 2: Load the Property file
		p.load(new FileInputStream(new File(FileName)));
		return p;
	}

	public boolean launchBankLogin(String browser, String path, String url) throws IOException {
		try {
			Thread.sleep(500);
			System.out.println("wrapper method");
			if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", path + "\\geckodriver.exe");
				// System.out.println(path+"\\geckodriver.exe");
				driver = new FirefoxDriver();

			} else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", path + "\\chromedriver.exe");
				driver = new ChromeDriver();

			} else if (browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", path + "\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}

			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			driver.get(url);

		} catch (Exception e) {
			System.out.println("Exception : - " + e.getMessage());
			e.printStackTrace();
			ATUReports.add("Browser opening failed", browser, LogAs.FAILED, new CaptureScreen(ScreenshotOf.DESKTOP));
		}
		return true;

	}

	public String getTextByXpath(String Xpath) throws InterruptedException {
		Thread.sleep(300);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath)));
		return driver.findElement(By.xpath(Xpath)).getText();
	}

	public boolean clickByXpathUsingAction(String xpath1) throws InterruptedException {
		Thread.sleep(300);
		WebElement element = driver.findElement(By.xpath(xpath1));
		Actions action = new Actions(driver);
		action.moveToElement(element).click().perform();
		return true;

	}

	public boolean clickByXpath(String Xpath) throws InterruptedException {
		Thread.sleep(300);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath)));
		driver.findElement(By.xpath(Xpath)).click();
		return true;
	}

	public boolean enterTextByXpath(String Xpath, String Text) throws InterruptedException {
		Thread.sleep(300);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath)));
		driver.findElement(By.xpath(Xpath)).clear();
		// System.out.println("Text"+Text);
		driver.findElement(By.xpath(Xpath)).sendKeys(Text);

		return true;
	}

	public void scrollingToElementByXpath(String xpath) throws InterruptedException {
		Thread.sleep(300);
		WebElement element = driver.findElement(By.xpath(xpath));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
	}

	public void scrollingToElementByID(String id) throws InterruptedException {
		Thread.sleep(300);
		WebElement element = driver.findElement(By.id(id));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
	}

	public String getAttrTextByXpath(String Xpath, String AttName) throws InterruptedException {
		Thread.sleep(300);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath)));
		String Text = driver.findElement(By.xpath(Xpath)).getAttribute(AttName);
		return Text;
	}

	public boolean IsDisplayedByXpath(String Xpath) {
		boolean xpath = false;
		try {
			Thread.sleep(300);
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath)));
			xpath = driver.findElement(By.xpath(Xpath)).isDisplayed();
		} catch (Exception e) {
		}
		return xpath;
	}

	public boolean clickByLinkText(String Linktext) throws InterruptedException {
		Thread.sleep(300);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(Linktext)));
		driver.findElement(By.linkText(Linktext)).click();
		return true;
	}

	public boolean selectValueByXpath(String Xpath, String Value) throws InterruptedException {
		Thread.sleep(300);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath)));
		Select x = new Select(driver.findElement(By.xpath(Xpath)));
		x.selectByVisibleText(Value);
		return true;
	}

	public int getSizeByXpath(String Xpath) throws InterruptedException {
		Thread.sleep(300);
		scrollingToElementByXpath(Xpath);
		List<WebElement> element = driver.findElements(By.xpath(Xpath));
		return element.size();
	}

	public boolean verifyTextByXpath(String Xpath, String Text) throws InterruptedException {
		Thread.sleep(300);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath)));
		boolean a = false;
		String B = driver.findElement(By.xpath(Xpath)).getText();

		if (B.equals(Text)) {
			a = true;
		}
		return a;
	}

	public boolean selectsysdateByXpath(String Xpath1, String Xpath2) throws InterruptedException {
		Thread.sleep(300);
		driver.findElement(By.xpath(Xpath2)).click();
		DateFormat dateformat1 = new SimpleDateFormat("dd");
		Date date1 = new Date();
		String today = dateformat1.format(date1);

		WebElement dateWidget = driver.findElement(By.xpath(Xpath1));
		List<WebElement> columns = dateWidget.findElements(By.tagName("td"));

		for (WebElement cell : columns) {
			if (cell.getText().equals(today)) {
				cell.click();																																																																				
				break;
			}
		}
		return true;
	}
	
	public boolean selectfromdateByXpath(String Xpath1) throws InterruptedException {
		Thread.sleep(300);
		JavascriptExecutor jsExecutor;
		jsExecutor = (JavascriptExecutor) driver;
		driver.findElement(By.xpath(Xpath1)).click();
		jsExecutor.executeScript("$(\"#validFromDate\").val('11/06/2018')");
		return true;
	}


	public boolean selecttodateByXpath(String Xpath1) throws InterruptedException {
		Thread.sleep(300);
		JavascriptExecutor jsExecutor;
		jsExecutor = (JavascriptExecutor) driver;
		driver.findElement(By.xpath(Xpath1)).click();
		jsExecutor.executeScript("$(\"#validToDate\").val('10/01/2021')");
		return true;
	}

	public boolean enterTextById(String Id, String Text) throws InterruptedException {
		Thread.sleep(300);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(Id)));
		driver.findElement(By.id(Id)).click();
		driver.findElement(By.id(Id)).clear();
		driver.findElement(By.id(Id)).sendKeys(Text);
		return true;
	}

	public boolean selectVisibleTextByXpath(String Xpath, String Text) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath)));
		Select x = new Select(driver.findElement(By.xpath(Xpath)));
		x.selectByVisibleText(Text);
		return true;
	}

	public String getTextById(String Id) throws InterruptedException {
		Thread.sleep(300);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(Id)));
		return driver.findElement(By.id(Id)).getText();
	}

	public boolean verifyTextById(String Id, String Text) throws InterruptedException {
		Thread.sleep(300);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(Id)));
		boolean a = false;
		String B = driver.findElement(By.id(Id)).getText();
		// System.out.println("1212"+B+"12");
		if (B.equals(Text)) {
			a = true;
		}
		return a;
	}

	public String getAttrTextById(String Id, String AttName) throws InterruptedException {
		Thread.sleep(300);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(Id)));
		String Text = driver.findElement(By.id(Id)).getAttribute(AttName);
		return Text;
	}

	public boolean clickById(String Id) throws InterruptedException {
		Thread.sleep(300);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(Id)));
		driver.findElement(By.id(Id)).click();
		return true;
	}

	public void close() {
		try {
			driver.quit();
			Set<Thread> threads = Thread.getAllStackTraces().keySet();

			for (Thread t : threads) {
				t.getThreadGroup().destroy();
			}

		} catch (Exception e) {
		}

	}
	public boolean IsEnabledById(String Id) {
		boolean id = false;
		try {
			Thread.sleep(300);
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(Id)));
			id = driver.findElement(By.id(Id)).isEnabled();
		} catch (Exception e) {
		}
		return id;
	}
	
	public void ErrorMsg(String Xpath) {
		try {
			By data = By.xpath(Xpath);
			if (!data.equals("") && data != null) {
				String Errormsg = driver.findElement(By.xpath(Xpath)).getText();

				Thread.sleep(1000);
				if (!Errormsg.equals("Invalid To month ") && Errormsg != null) {
					// 2018 02 2018 06
					ATUReports.add("To Month validation", "--", "Statements should not display", Errormsg, LogAs.PASSED,
							new CaptureScreen(ScreenshotOf.DESKTOP));
					logger.debug("ViewStatements update:" + Errormsg);
					System.out.println("ViewStatements update::" + Errormsg);

				} else if (!Errormsg.equals("To month should be greater than or equal to From month")
						&& Errormsg != null) {

					ATUReports.add("To Month & From Month validation", "--", "Statements should not display", Errormsg,
							LogAs.PASSED, new CaptureScreen(ScreenshotOf.DESKTOP));
					logger.debug("ViewStatements update:" + Errormsg);
					System.out.println("ViewStatements update::" + Errormsg);
				} else if (!Errormsg.equals("To year should be greater than or equal to From year")
						&& Errormsg != null) {
					// 2018 08 2017 12
					ATUReports.add("To Year & Year Month validation", "--", "Statements should not display", Errormsg,
							LogAs.PASSED, new CaptureScreen(ScreenshotOf.DESKTOP));
					logger.debug("ViewStatements update:" + Errormsg);
					System.out.println("ViewStatements update::" + Errormsg);
				} else if (!Errormsg.equals("Period can not greater than 12 months") && Errormsg != null) {
					// 2016 08 2017 12
					ATUReports.add("12 Months validation", "--", "Statements should not display", Errormsg,
							LogAs.PASSED, new CaptureScreen(ScreenshotOf.DESKTOP));
					logger.debug("ViewStatements update:" + Errormsg);
					System.out.println("ViewStatements update::" + Errormsg);
				}else if (!Errormsg.equals("Invalid Card Status") && Errormsg != null) {

					ATUReports.add("Card Status validation", "Inactive card", "EmailStatements should not display",
							Errormsg, LogAs.FAILED, new CaptureScreen(ScreenshotOf.DESKTOP));
					logger.debug("EmailStatements update:" + Errormsg);
					System.out.println("EmailStatements update::" + Errormsg);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public boolean switchToFirstWindow() throws InterruptedException{	
		Thread.sleep(300);
		Set<String> window = driver.getWindowHandles();
		for (String string : window) {
			driver.switchTo().window(string);
			break;
		}
		return true;
	}
	public boolean switchToLastWindow() throws InterruptedException{
		Thread.sleep(300);
		Set<String> window = driver.getWindowHandles();
		for (String string : window) {
			driver.switchTo().window(string);
		}
		return true;
	}
	public boolean IsEnabledByXpath(String Xpath) throws InterruptedException {
		Thread.sleep(300);
		boolean xpath = false;
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath)));
			xpath = driver.findElement(By.xpath(Xpath)).isEnabled();
		} catch (Exception e) {
		}
		return xpath;
	}
}
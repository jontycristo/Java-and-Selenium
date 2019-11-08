package cms.pages;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Welcome extends BasePage {
	Properties prop;

	public Welcome() {
		try {
			prop = loadObjectRepository("properties\\Welcome.properties");

		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}
	}

	public Welcome verifyMainPageHeading(String data) {
		try {
			Thread.sleep(2000);
			IsElementsDisplayedByXpath(prop.getProperty("WelcomePage.MainPageHeading.Xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public Welcome verifySearchBoxinPage(String Card, String Acct, String FName, String LName, String DOB, String EAddr,
			String IDNO, String OnlineID, String CellPNO, String PassNO, String ProxyNO) {
		try {
			IsElementsDisplayedByXpath(prop.getProperty("WelcomePage.CardText.Xpath"), Card);
			IsElementsDisplayedByXpath(prop.getProperty("WelcomePage.AcctText.Xpath"), Acct);
			IsElementsDisplayedByXpath(prop.getProperty("WelcomePage.FNameText.Xpath"), FName);
			IsElementsDisplayedByXpath(prop.getProperty("WelcomePage.LNameText.Xpath"), LName);
			IsElementsDisplayedByXpath(prop.getProperty("WelcomePage.DOBText.Xpath"), DOB);
			IsElementsDisplayedByXpath(prop.getProperty("WelcomePage.EAddrText.Xpath"), EAddr);
			IsElementsDisplayedByXpath(prop.getProperty("WelcomePage.IDNOText.Xpath"), IDNO);
			IsElementsDisplayedByXpath(prop.getProperty("WelcomePage.OnlineIDText.Xpath"), OnlineID);
			IsElementsDisplayedByXpath(prop.getProperty("WelcomePage.CellPNOText.Xpath"), CellPNO);
			IsElementsDisplayedByXpath(prop.getProperty("WelcomePage.PassNOText.Xpath"), PassNO);
			IsElementsDisplayedByXpath(prop.getProperty("WelcomePage.ProxyNOText.Xpath"), ProxyNO);

			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return this;
	}

	public Welcome verifyButtonsinPage(String Search, String Group, String User, String RRN_Search) {
		try {
			IsElementsDisplayedByXpath(prop.getProperty("WelcomePage.SearchButton.Xpath"), Search);
			IsElementsDisplayedByXpath(prop.getProperty("WelcomePage.GroupButton.Xpath"), Group);
			IsElementsDisplayedByXpath(prop.getProperty("WelcomePage.UserButton.Xpath"), User);
			IsElementsDisplayedByXpath(prop.getProperty("WelcomePage.RRN_SearchButton.Xpath"), RRN_Search);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return this;
	}

	public Welcome verifyLinksinPage(String Home, String MySetUp) {
		try {
			IsElementsDisplayedByXpath(prop.getProperty("WelcomePage.HomeLink.Xpath"), Home);
			IsElementsDisplayedByXpath(prop.getProperty("WelcomePage.MySetUpLink.Xpath"), MySetUp);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return this;
	}

	public MySetUpage clickMySetup(String Linktext) {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(Linktext)));
		driver.findElement(By.linkText(Linktext)).click();
		return new MySetUpage();
	}

	public User clickUser(String data) throws InterruptedException {

		clickOnTabByXpath(prop.getProperty("WelcomePage.usertab.Xpath"), data);
		return new User();
	}

	public Group clickGrouptab(String data) throws InterruptedException {

		clickOnTabByXpath(prop.getProperty("WelcomePage.GroupButton.Xpath"), data);

		return new Group();
	}

	public RRNSearch clickRRNSearchtab() throws InterruptedException {

		clickOnTabByXpath(prop.getProperty("WelcomePage.RRN_SearchButton.Xpath"), "RRNSearch");

		return new RRNSearch();
	}

	public Welcome searchelement(String ename, String edata1, String edata2, String edata3, String edata4,
			String edata5, String edata6, String edata7, String edata8, String edata9, String edata10, String edata11)
			throws InterruptedException {
		switch (ename) {
		case "Card": {
			enterTextByXpathBase(prop.getProperty("WelcomePage.Card.Xpath"), edata1);
			break;
		}
		case "Account": {
			enterTextByXpathBase(prop.getProperty("WelcomePage.Account.Xpath"), edata2);
			break;
		}
		case "LastName": {
			enterTextByXpathBase(prop.getProperty("WelcomePage.LastName.Xpath"), edata3);
			break;
		}
		case "FirstName": {
			enterTextByXpathBase(prop.getProperty("WelcomePage.FirstName.Xpath"), edata4);
			break;
		}
		case "DateOfBirth": {
			enterTextByXpathBase(prop.getProperty("WelcomePage.DateOfBirth.Xpath"), edata5);
			break;
		}
		case "EmailAddress": {
			enterTextByXpathBase(prop.getProperty("WelcomePage.EmailAddress.Xpath"), edata6);
			break;
		}
		case "IDNumber": {
			enterTextByXpathBase(prop.getProperty("WelcomePage.IDNumber.Xpath"), edata7);
			break;
		}
		case "OnlineUserID": {
			enterTextByXpathBase(prop.getProperty("WelcomePage.OnlineUserID.Xpath"), edata8);
			break;
		}
		case "CellNumber": {
			enterTextByXpathBase(prop.getProperty("WelcomePage.CellNumber.Xpath"), edata9);
			break;
		}
		case "PassPortNo": {
			enterTextByXpathBase(prop.getProperty("WelcomePage.PassPortNo.Xpath"), edata10);
			break;
		}
		case "ProxyNo": {
			enterTextByXpathBase(prop.getProperty("WelcomePage.ProxyNo.Xpath"), edata11);
			break;
		}
		}

		return this;
	}

	public Create_Call clickSearchtab() throws InterruptedException {

		clickOnTabByXpath(prop.getProperty("WelcomePage.SearchButton.Xpath"), "Search");

		return new Create_Call();
	}

	public Welcome Logout() {
		try {
			clickButtonByXpath(prop.getProperty("WelcomePage.Logoutmenu.Xpath"), "Logout");
			logger.debug("The System Logout Successfully");

		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Exception in Logout", e);
		}
		return this;
	}

	public void quitBrowser() {
		try {
			driver.manage().deleteAllCookies();
			closeBrowser();
		//	driver.manage().deleteAllCookies();
			logger.debug("The Browser Closed Successfully");
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("The Browser Closing Exception", e);
		}

	}

}

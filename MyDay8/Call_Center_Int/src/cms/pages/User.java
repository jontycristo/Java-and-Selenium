package cms.pages;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;

public class User extends BasePage {
	Properties prop;

	public User() {
		try {
			prop = loadObjectRepository("properties\\User.properties");

		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}
	}

	public User verifyMainPageHeading(String data) {
		try {
			IsElementsDisplayedByXpath(prop.getProperty("Userpage.UserPageHeading.Xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public User verifyTextinPage1(String Createnewlink, String Userid, String Username, String status, String search,
			String Userid1, String Username1, String status1, String group, String Eaddr, String VFDate, String VTDate,
			String MobNo, String DispSensData, String edit, String resetsession) {
		try {
			verifyTextByXpathBase(prop.getProperty("Userpage.CreatenewlinkText.Xpath"), Createnewlink);
			verifyTextByXpathBase(prop.getProperty("Userpage.UseridText.Xpath"), Userid);
			verifyTextByXpathBase(prop.getProperty("Userpage.UsernameText.Xpath"), Username);
			verifyTextByXpathBase(prop.getProperty("Userpage.statusText.Xpath"), status);
			IsElementsDisplayedByXpath(prop.getProperty("Userpage.searchText.Xpath"), search);
			verifyTextByXpathBase(prop.getProperty("Userpage.Userid1Text.Xpath"), Userid1);
			verifyTextByXpathBase(prop.getProperty("Userpage.Username1Text.Xpath"), Username1);
			verifyTextByXpathBase(prop.getProperty("Userpage.status1Text.Xpath"), status1);
			verifyTextByXpathBase(prop.getProperty("Userpage.groupText.Xpath"), group);
			verifyTextByXpathBase(prop.getProperty("Userpage.EaddrText.Xpath"), Eaddr);
			verifyTextByXpathBase(prop.getProperty("Userpage.VFDateText.Xpath"), VFDate);
			verifyTextByXpathBase(prop.getProperty("Userpage.VTDateText.Xpath"), VTDate);
			verifyTextByXpathBase(prop.getProperty("Userpage.MobNoText.Xpath"), MobNo);
			verifyTextByXpathBase(prop.getProperty("Userpage.DispSensDataText.Xpath"), DispSensData);
			verifyTextByXpathBase(prop.getProperty("Userpage.editText.Xpath"), edit);
			verifyTextByXpathBase(prop.getProperty("Userpage.resetsessionText.Xpath"), resetsession);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return this;
	}

	public User CreateUser(String Linktext) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(Linktext)));
		driver.findElement(By.linkText(Linktext)).click();
		return this;
	}

	public User verifyAddUserPageHeading(String data) {
		try {
			IsElementsDisplayedByXpath(prop.getProperty("AddUserpage.AddUserPageHeading.Xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public User displayTextinPage(String UPdet, String coninfo, String UProfdet, String UserAuth, String UID,
			String UName, String MobNo, String EAddr, String VFDate, String VTDate, String Grp, String DispSensData,
			String Yes, String No) {
		try {
			IsElementsDisplayedByXpath(prop.getProperty("AddUserpage.UPdetText.Xpath"), UPdet);
			IsElementsDisplayedByXpath(prop.getProperty("AddUserpage.ContctInfoText.Xpath"), coninfo);
			IsElementsDisplayedByXpath(prop.getProperty("AddUserpage.UProfdetText.Xpath"), UProfdet);
			IsElementsDisplayedByXpath(prop.getProperty("AddUserpage.UserAuthText.Xpath"), UserAuth);
			IsElementsDisplayedByXpath(prop.getProperty("AddUserpage.UIDText.Xpath"), UID);
			IsElementsDisplayedByXpath(prop.getProperty("AddUserpage.UNameText.Xpath"), UName);
			IsElementsDisplayedByXpath(prop.getProperty("AddUserpage.MobNoText.Xpath"), MobNo);
			IsElementsDisplayedByXpath(prop.getProperty("AddUserpage.EAddrText.Xpath"), EAddr);
			IsElementsDisplayedByXpath(prop.getProperty("AddUserpage.VFDateText.Xpath"), VFDate);
			IsElementsDisplayedByXpath(prop.getProperty("AddUserpage.VTDateText.Xpath"), VTDate);
			IsElementsDisplayedByXpath(prop.getProperty("AddUserpage.GrpText.Xpath"), Grp);
			IsElementsDisplayedByXpath(prop.getProperty("AddUserpage.DispSensDataText.Xpath"), DispSensData);
			IsElementsDisplayedByXpath(prop.getProperty("AddUserpage.Yes.Xpath"), Yes);
			IsElementsDisplayedByXpath(prop.getProperty("AddUserpage.No.Xpath"), No);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return this;
	}

	public User verifyTextinPage2(String UPdet, String coninfo, String UProfdet, String UserAuth, String UID,
			String UName, String MobNo, String EAddr, String VFDate, String VTDate, String Grp, String DispSensData,
			String Yes, String No) {
		try {
			verifyTextByXpathBase(prop.getProperty("AddUserpage.UPdetText.Xpath"), UPdet);
			verifyTextByXpathBase(prop.getProperty("AddUserpage.ContctInfoText.Xpath"), coninfo);
			verifyTextByXpathBase(prop.getProperty("AddUserpage.UProfdetText.Xpath"), UProfdet);
			verifyTextByXpathBase(prop.getProperty("AddUserpage.UserAuthText.Xpath"), UserAuth);
			verifyTextByXpathBase(prop.getProperty("AddUserpage.UIDText.Xpath"), UID);
			verifyTextByXpathBase(prop.getProperty("AddUserpage.UNameText.Xpath"), UName);
			verifyTextByXpathBase(prop.getProperty("AddUserpage.MobNoText.Xpath"), MobNo);
			verifyTextByXpathBase(prop.getProperty("AddUserpage.EAddrText.Xpath"), EAddr);
			verifyTextByXpathBase(prop.getProperty("AddUserpage.VFDateText.Xpath"), VFDate);
			verifyTextByXpathBase(prop.getProperty("AddUserpage.VTDateText.Xpath"), VTDate);
			verifyTextByXpathBase(prop.getProperty("AddUserpage.GrpText.Xpath"), Grp);
			verifyTextByXpathBase(prop.getProperty("AddUserpage.DispSensDataText.Xpath"), DispSensData);
			verifyTextByXpathBase(prop.getProperty("AddUserpage.Yes.Xpath"), Yes);
			verifyTextByXpathBase(prop.getProperty("AddUserpage.No.Xpath"), No);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return this;
	}

	public User enterTexttosearchByXpath(String userid, String username) throws InterruptedException {
		enterTextByXpathBase(prop.getProperty("SearchUserpage.userid1.Xpath"), userid);
		enterTextByXpathBase(prop.getProperty("SearchUserpage.username1.Xpath"), username);
		return this;
	}

	public User selectstatustosearch(String status, String status1, String status2, String status3, String status4)
			throws InterruptedException {
		{
			switch (status) {
			case "Activate": {
				selectValueByXpath(prop.getProperty("SearchUserpage.Status1.Xpath"), status1);
				break;
			}
			case "Suspended": {
				selectValueByXpath(prop.getProperty("SearchUserpage.Status1.Xpath"), status2);
				break;
			}
			case "Locked": {
				selectValueByXpath(prop.getProperty("SearchUserpage.Status1.Xpath"), status3);
				break;
			}
			case "Expired": {
				selectValueByXpath(prop.getProperty("SearchUserpage.Status1.Xpath"), status4);
				break;
			}
			}

			return this;
		}
	}

	public User clickOnSearchBtn() {
		try {
			clickByXpath(prop.getProperty("SearchUserpage.Searchbtn.Xpath"), "Search");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public User resultsearchMessage(String data) {
		try {
			logger.debug("resultsearchMessage invoked" + "---" + "Search_User" + " " + "for" + " " + data);
			if (driver.findElement(By.xpath("//*[starts-with(text(),'No Records Found')]")).isDisplayed()) {
				ATUReports.add("User Not Present", data, "The User Should be Exists", data, LogAs.PASSED,
						new CaptureScreen(ScreenshotOf.DESKTOP));
				logger.error("Login code already exists" + "---" + "Search_User" + " " + "for" + " " + data);
			} else {
				ATUReports.add("User Present", data, "The User Should be Exists", data, LogAs.PASSED,
						new CaptureScreen(ScreenshotOf.DESKTOP));
				logger.info("The User found successfully" + "---" + "Search_User" + " " + "for" + " " + data);
			}
		} catch (Exception e) {
			e.printStackTrace();
			ATUReports.add("Search User Exception", data, "The Entered User Should be Exists", data, LogAs.FAILED,
					new CaptureScreen(ScreenshotOf.DESKTOP));
			logger.info("Exception in Adding New User", e);
		}
		return this;

	}

	public User verifyButtonByXpath(String Back, String Submit, String Clear) throws InterruptedException {
		IsElementsDisplayedByXpath(prop.getProperty("AddUserpage.backbtn.Xpath"), Back);
		IsElementsDisplayedByXpath(prop.getProperty("AddUserpage.submitbtn.Xpath"), Submit);
		IsElementsDisplayedByXpath(prop.getProperty("AddUserpage.clearbtn.Xpath"), Clear);

		return this;
	}

	public User enterTextByXpath(String userid, String username, String mobnum, String emailaddr, String group)
			throws InterruptedException {
		enterTextByXpathBase(prop.getProperty("AddUserpage.userid.Xpath"), userid);
		enterTextByXpathBase(prop.getProperty("AddUserpage.username.Xpath"), username);
		enterTextByXpathBase(prop.getProperty("AddUserpage.mobnum.Xpath"), mobnum);
		enterTextByXpathBase(prop.getProperty("AddUserpage.emailaddr.Xpath"), emailaddr);
//		selectsysdateByXpathBase(prop.getProperty("AddUserpage.datepicker.Xpath"),
//				prop.getProperty("AddUserpage.frmdate.Xpath"));
		selectfromdateByXpathBase(prop.getProperty("AddUserpage.frmdate.Xpath"));
		// fromdate();
		selecttodateByXpathBase(prop.getProperty("AddUserpage.todate.Xpath"));
		selectUsingValueByXpath(prop.getProperty("AddUserpage.group.Xpath"), group);
		return this;
	}

	public User clickradioButtonByXpath(String radiobtn) throws InterruptedException {
		logger.debug("clickradioButtonByXpath invoked" + "---" + radiobtn);
		if (radiobtn.equalsIgnoreCase("No")) {
			clickByXpath(prop.getProperty("AddUserpage.nobtn.Xpath"));
			ATUReports.add("Radio Button clicked", radiobtn, LogAs.PASSED, new CaptureScreen(ScreenshotOf.DESKTOP));
			logger.debug("clickradioButtonByXpath - Button Clicked" + "---" + radiobtn);
		} else {
			clickByXpath(prop.getProperty("AddUserpage.yesbtn.Xpath"));
			ATUReports.add("Radio Button clicked", radiobtn, LogAs.PASSED, new CaptureScreen(ScreenshotOf.DESKTOP));
			logger.debug("clickradioButtonByXpath - Button Clicked" + "---" + radiobtn);
		}
		return this;
	}

	public User clickButtonByXpath(String btn) throws InterruptedException {
		logger.debug("clickButtonByXpath invoked" + "---" + btn);
		if (btn.equalsIgnoreCase("Submit")) {
			clickByXpath(prop.getProperty("AddUserpage.submitbuttn.Xpath"));
			ATUReports.add("Button clicked", btn, LogAs.PASSED, new CaptureScreen(ScreenshotOf.DESKTOP));
			logger.debug("clickButtonByXpath - Button Clicked" + "---" + btn);
		} else if (btn.equalsIgnoreCase("Clear")) {
			clickByXpath(prop.getProperty("AddUserpage.clearbtn.Xpath"));
			ATUReports.add("Button clicked", btn, LogAs.PASSED, new CaptureScreen(ScreenshotOf.DESKTOP));
			logger.debug("clickButtonByXpath - Button Clicked" + "---" + btn);
		} else {
			clickByXpath(prop.getProperty("AddUserpage.backbtn.Xpath"));
			ATUReports.add("Button clicked", btn, LogAs.PASSED, new CaptureScreen(ScreenshotOf.DESKTOP));
			logger.debug("clickButtonByXpath - Button Clicked" + "---" + btn);
		}
		return this;
	}

	public User resultMessage(String data) {
		try {
			logger.debug("resultMessage invoked" + "---" + "Add_User" + " " + "for" + " " + data);
			if (driver.findElement(By.xpath("//*[starts-with(text(),'Login code already exists')]")).isDisplayed()) {
				ATUReports.add("Result Displayed", data, "The Entered User Should Not be Exists", data, LogAs.FAILED,
						new CaptureScreen(ScreenshotOf.DESKTOP));
				logger.error("Login code already exists" + "---" + "Add_User" + " " + "for" + " " + data);
			} else {
				ATUReports.add("Result Displayed", data, "The Entered User Should Not be Exists", data, LogAs.PASSED,
						new CaptureScreen(ScreenshotOf.DESKTOP));
				logger.info("The New User is added successfully" + "---" + "Add_User" + " " + "for" + " " + data);
			}
		} catch (Exception e) {
			e.printStackTrace();
			ATUReports.add("Add User Exception", data, "The Entered User Should be Exists", data, LogAs.FAILED,
					new CaptureScreen(ScreenshotOf.DESKTOP));
			logger.info("Exception in Adding New User", e);
		}
		return this;

	}

	public User fromdate() throws InterruptedException {
		logger.debug("Select the From Date");
		driver.findElement(By.id("validFromDate")).click();
		DateFormat dateformat1 = new SimpleDateFormat("dd");
		Date date1 = new Date();
		String today = dateformat1.format(date1);

		WebElement dateWidget = driver.findElement(By.xpath(".//DIV[@id='ui-datepicker-div']"));
		List<WebElement> columns = dateWidget.findElements(By.tagName("td"));
		Thread.sleep(2000);

		for (WebElement cell : columns) {
			if (cell.getText().equals(today)) {
				cell.click();
				break;
			}

		}
		ATUReports.add("From Date", LogAs.PASSED, new CaptureScreen(ScreenshotOf.DESKTOP));
		return this;
	}

	public Welcome Logout() {
		try {
			clickButtonByXpath(prop.getProperty("Logoutmenu.Xpath"), "Logout");
			// clickByLinkText(data);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Welcome();
	}
}

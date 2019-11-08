package cms.pages;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.testng.log4testng.Logger;

public class BasePage extends Wrapper_Methods {
	Logger logger = Logger.getLogger("CSRLogs");

	public String launchBrowser(String value1, String value2, String value3, String Authorname, String ProjectName) {
		try {
			logger.debug("Invoke the Browser");
			launchBankLogin(value1, value2, value3);
			// setATUreportConfig(PageDesc, Authorname, ProjectName);
			ATUReports.add("Browser opened ", LogAs.INFO, new CaptureScreen(ScreenshotOf.DESKTOP));
			logger.debug("launchBrowser - Browser Launched");
		} catch (Exception e) {
			logger.debug("launchBrowser - Browser Launch Failed in Exception Block");
			ATUReports.add("Launch Browser failed", LogAs.FAILED, new CaptureScreen(ScreenshotOf.DESKTOP));
			logger.error(e);
		}
		return value1;
	}

	public String clickByXpathBase(String Value, String data) throws InterruptedException {
		try {
			logger.debug("clickByXpathBase invoked" + data);
			// scrollingToElementByXpath(Value);
			String value = getTextByXpath(Value);
			if (value.equalsIgnoreCase(data)) {
				clickByXpath(Value);
				ATUReports.add("Button clicked", data, getTextByXpath(Value), data, LogAs.PASSED,
						new CaptureScreen(ScreenshotOf.DESKTOP));
			} else {
				ATUReports.add("Button not clicked", data, getTextByXpath(Value), data, LogAs.FAILED,
						new CaptureScreen(ScreenshotOf.DESKTOP));
			}
			logger.debug("clickByXpathBase - Button Clicked successfully" + "---" + data);
		} catch (Exception e) {
			logger.debug("clickByXpathBase - Button click Failed in Exception Block" + "---" + data);
			ATUReports.add("Button click failed", data, getTextByXpath(Value), data, LogAs.FAILED,
					new CaptureScreen(ScreenshotOf.DESKTOP));
			logger.error(e);
		}
		return Value;
	}

	public String enterTextByXpathBase(String value, String data) throws InterruptedException {
		try {
			logger.debug("enterTextByXpathBase invoked" + "---" + data);
			if (enterTextByXpath(value, data)) {

				ATUReports.add("Text Entered", data, getTextByXpath(value), data, LogAs.PASSED,
						new CaptureScreen(ScreenshotOf.DESKTOP));
			} else
				ATUReports.add("Text not entered", data, getTextByXpath(value), data, LogAs.FAILED,
						new CaptureScreen(ScreenshotOf.DESKTOP));
			logger.debug("enterTextByXpathBase - Text Entered successfully" + "---" + data);
		} catch (Exception e) {
			logger.debug("enterTextByXpathBase - Text Entry Failed in Exception Block" + "---" + data);
			ATUReports.add("Text entry failed", data, getTextByXpath(value), data, LogAs.FAILED,
					new CaptureScreen(ScreenshotOf.DESKTOP));
			logger.error(e);
		}
		return value;
	}

	public String enterValueByXpathBase(String value, String data) throws InterruptedException {
		try {
			logger.debug("enterValueByXpathBase invoked" + "---" + data);
			if (enterTextByXpath(value, data)) {

				ATUReports.add("Value Entered", data, getTextByXpath(value), data, LogAs.PASSED,
						new CaptureScreen(ScreenshotOf.DESKTOP));
			} else
				ATUReports.add("Value not entered", data, getTextByXpath(value), data, LogAs.FAILED,
						new CaptureScreen(ScreenshotOf.DESKTOP));
			logger.debug("enterValueByXpathBase - Text Entered successfully" + "---" + data);
		} catch (Exception e) {
			logger.debug("enterValueByXpathBase - Text Entry Failed in Exception Block" + "---" + data);
			ATUReports.add("Value entry failed", data, getTextByXpath(value), data, LogAs.FAILED,
					new CaptureScreen(ScreenshotOf.DESKTOP));
			logger.error(e);
		}
		return value;
	}

	public String clickButtonsByXpath(String Value, String data) throws InterruptedException {
		try {
			scrollingToElementByXpath(Value);
			logger.debug("clickButtonsByXpath invoked" + "---" + data);
			if (clickByXpath(Value)) {
				ATUReports.add("Button clicked", data, getTextByXpath(Value), data, LogAs.PASSED,
						new CaptureScreen(ScreenshotOf.DESKTOP));
				logger.debug("clickButtonsByXpath - Button Clicked successfully" + "---" + data);
			} else {
				ATUReports.add("Button not clicked", data, getTextByXpath(Value), data, LogAs.FAILED,
						new CaptureScreen(ScreenshotOf.DESKTOP));
				logger.debug("clickButtonsByXpath - Unable to Click On Button" + "---" + data);
			}
		} catch (Exception e) {
			logger.debug("clickButtonsByXpath - Button click Failed in Exception Block" + "---" + data);
			ATUReports.add("Button click failed", data, getTextByXpath(Value), data, LogAs.FAILED,
					new CaptureScreen(ScreenshotOf.DESKTOP));
			logger.error(e);
		}
		return Value;
	}

	public String IsElementsDisplayedByXpath(String Xpath, String data) throws InterruptedException {
		try {
			scrollingToElementByXpath(Xpath);
			logger.debug("IsElementsDisplayedByXpath invoked" + "---" + data);
			if (IsDisplayedByXpath(Xpath))
				ATUReports.add("Element Displayed", data, getTextByXpath(Xpath), data, LogAs.PASSED,
						new CaptureScreen(ScreenshotOf.DESKTOP));
			else
				ATUReports.add("Element not Displayed", data, getTextByXpath(Xpath), data, LogAs.FAILED,
						new CaptureScreen(ScreenshotOf.DESKTOP));
			logger.debug("IsElementsDisplayedByXpath - Elements Displayed" + "---" + data);
		} catch (Exception e) {
			logger.debug("IsElementsDisplayedByXpath - Elements Display Verification Failed in Exception Block" + "---"
					+ data);
			ATUReports.add("Element not present", data, getTextByXpath(Xpath), data, LogAs.FAILED,
					new CaptureScreen(ScreenshotOf.DESKTOP));
			logger.error(e);
		}
		return Xpath;
	}

	public String IsRsltElementsDisplayedByXpath(String Xpath, String data) throws InterruptedException {
		try {
			scrollingToElementByXpath(Xpath);
			logger.debug("IsRsltElementsDisplayedByXpath invoked" + "---" + data);
			if (IsDisplayedByXpath(Xpath))
				ATUReports.add("Result Displayed", data, "", getTextByXpath(Xpath), LogAs.PASSED,
						new CaptureScreen(ScreenshotOf.DESKTOP));
			else
				ATUReports.add("Result not Displayed", data, "", getTextByXpath(Xpath), LogAs.FAILED,
						new CaptureScreen(ScreenshotOf.DESKTOP));
			logger.debug("IsRsltElementsDisplayedByXpath - Elements Displayed" + "---" + data);
		} catch (Exception e) {
			logger.debug("IsRsltElementsDisplayedByXpath - Elements Display Verification Failed in Exception Block"
					+ "---" + data);
			ATUReports.add("Result not present", data, "", getTextByXpath(Xpath), LogAs.FAILED,
					new CaptureScreen(ScreenshotOf.DESKTOP));
			logger.error(e);
		}
		return Xpath;
	}

	public String clickLinkByLinkText(String data) {
		try {
			logger.debug("clickLinkByLinkText invoked" + "---" + data);
			if (clickByLinkText(data)) {
				ATUReports.add("Link clicked", data, LogAs.PASSED, new CaptureScreen(ScreenshotOf.DESKTOP));
			} else {
				ATUReports.add("Link not clicked", data, LogAs.FAILED, new CaptureScreen(ScreenshotOf.DESKTOP));
			}
			logger.debug("clickLinkByLinkText - Link Clicked" + "---" + data);
		} catch (Exception e) {
			logger.debug("clickLinkByLinkText - Link Click Failed in Exception Block" + "---" + data);
			ATUReports.add("Link click failed", LogAs.FAILED, new CaptureScreen(ScreenshotOf.DESKTOP));
		}
		return data;
	}

	public String selectUsingValueByXpath(String Value, String data) {

		try {
			logger.debug("selectUsingValueByXpath invoked");
			if (selectValueByXpath(Value, data)) {
				ATUReports.add("Option selected", data, getTextByXpath(Value), data, LogAs.PASSED,
						new CaptureScreen(ScreenshotOf.DESKTOP));
				logger.debug("selectUsingValueByXpath - Option Selected" + "---" + data);
			} else {
				ATUReports.add("Option not selected", data, getTextByXpath(Value), data, LogAs.FAILED,
						new CaptureScreen(ScreenshotOf.DESKTOP));
				logger.debug("selectUsingValueByXpath - Option Not Selected" + "---" + data);
			}

		} catch (Exception e) {
			logger.debug("selectUsingValueByXpath - Option Selection Failed in Exception Block");
			ATUReports.add("Option selection failed", LogAs.FAILED, new CaptureScreen(ScreenshotOf.DESKTOP));
			logger.error(e);
		}
		return Value;

	}

	public String selectRadioButtonByXpath(String Value, String data) throws InterruptedException {
		try {
			scrollingToElementByXpath(Value);
			logger.debug("selectRadioButtonByXpath invoked" + "---" + data);
			String value = getAttrTextByXpath(Value, "value");

			if (value.equalsIgnoreCase(data)) {
				if (clickByXpath(Value)) {
					ATUReports.add("Radio Button Clicked", data, getTextByXpath(Value), data, LogAs.PASSED,
							new CaptureScreen(ScreenshotOf.DESKTOP));
					logger.debug("selectRadioButtonByXpath - Radio Button Selected");
				} else {
					ATUReports.add("Radio Button not Clicked", data, getTextByXpath(Value), data, LogAs.FAILED,
							new CaptureScreen(ScreenshotOf.DESKTOP));
					logger.debug("selectRadioButtonByXpath - Radio Button Not Selected");
				}

			}
		}

		catch (Exception e) {
			logger.error("selectRadioButtonByXpath - Check Box Selection Failed in Exception Block", e);
			ATUReports.add("Button Click failed", data, getTextByXpath(Value), data, LogAs.FAILED,
					new CaptureScreen(ScreenshotOf.DESKTOP));
		}
		return Value;
	}

	public String verifyTextByXpathBase(String Value, String data) throws InterruptedException {
		try {
			logger.debug("verifyTextByXpathBase invoked");
			if (verifyTextByXpath(Value, data)) {
				ATUReports.add("Text verified ", data, getTextByXpath(Value), data, LogAs.PASSED,
						new CaptureScreen(ScreenshotOf.DESKTOP));
				logger.debug("verifyTextByXpathBase - Text Verifed" + "---" + " User " + data);
			} else {
				ATUReports.add("Text not verified", data, getTextByXpath(Value), data, LogAs.FAILED,
						new CaptureScreen(ScreenshotOf.DESKTOP));
				logger.debug("verifyTextByXpathBase - Text Not Verifed" + "---" + " User " + data);
			}

		} catch (Exception e) {
			logger.debug("verifyTextByXpathBase - Text Verification Failed in Exception Block");
			ATUReports.add("Text verification failed", data, getTextByXpath(Value), data, LogAs.FAILED,
					new CaptureScreen(ScreenshotOf.DESKTOP));
			logger.error("Text Verification Exception", e);
		}
		return Value;
	}

	public String selectsysdateByXpathBase(String Value1, String Value2) {
		try {
			logger.debug("selectsysdateByXpathBase invoked");
			if (selectsysdateByXpath(Value1, Value2)) {
				ATUReports.add("Date Selected ", LogAs.PASSED, new CaptureScreen(ScreenshotOf.DESKTOP));
				logger.debug("selectsysdateByXpathBase - SysDate is Selected");
			} else {
				ATUReports.add("Date not Selected", LogAs.FAILED, new CaptureScreen(ScreenshotOf.DESKTOP));
				logger.debug("selectsysdateByXpathBase - SysDate is Not Selected");
			}

		} catch (Exception e) {
			logger.debug("selectsysdateByXpathBase - Date Selection Failed in Exception Block");
			ATUReports.add("Date selection failed", LogAs.FAILED, new CaptureScreen(ScreenshotOf.DESKTOP));
			logger.error(e);
		}
		return Value1;
	}

	public String selecttodateByXpathBase(String Value1) {
		try {
			logger.debug("selecttodateByXpathBase invoked");
			if (selecttodateByXpath(Value1)) {
				ATUReports.add("To Date Selected ", LogAs.PASSED, new CaptureScreen(ScreenshotOf.DESKTOP));
				logger.debug("selecttodateByXpathBase - ToDate is Selected");
			} else {
				ATUReports.add("To Date not Selected", LogAs.FAILED, new CaptureScreen(ScreenshotOf.DESKTOP));
				logger.debug("selecttodateByXpathBase - ToDate is Not Selected");
			}

		} catch (Exception e) {
			logger.debug("selecttodateByXpathBase - Date Selection Failed in Exception Block");
			ATUReports.add("Date selection failed", LogAs.FAILED, new CaptureScreen(ScreenshotOf.DESKTOP));
			logger.error(e);
		}
		return Value1;

	}
	
	public String selectfromdateByXpathBase(String Value1) {
		try {
			logger.debug("selectfromdateByXpathBase invoked");
			if (selectfromdateByXpath(Value1)) {
				ATUReports.add("From Date Selected ", LogAs.PASSED, new CaptureScreen(ScreenshotOf.DESKTOP));
				logger.debug("selectfromdateByXpathBase - FromDate is Selected");
			} else {
				ATUReports.add("From Date not Selected", LogAs.FAILED, new CaptureScreen(ScreenshotOf.DESKTOP));
				logger.debug("selectfromdateByXpathBase - FromDate is Not Selected");
			}

		} catch (Exception e) {
			logger.debug("selectfromdateByXpathBase -From Date Selection Failed in Exception Block");
			ATUReports.add("Date selection failed", LogAs.FAILED, new CaptureScreen(ScreenshotOf.DESKTOP));
			logger.error(e);
		}
		return Value1;

	}

	public String clickButtonByXpath(String Value, String data) {
		try {
			scrollingToElementByXpath(Value);
			logger.debug("clickButtonByXpath invoked" + "---" + data);
			String value = getAttrTextByXpath(Value, "value");

			if (value.equalsIgnoreCase(data)) {
				if (clickByXpath(Value)) {
					ATUReports.add("Button clicked", data, LogAs.PASSED, new CaptureScreen(ScreenshotOf.DESKTOP));
					logger.debug("clickButtonByXpath - Button Clicked" + "---" + data);
				} else {
					ATUReports.add("Button not clicked", data, LogAs.FAILED, new CaptureScreen(ScreenshotOf.DESKTOP));
					logger.debug("clickButtonByXpath - Button Not Clicked" + "---" + data);
				}
			}

		} catch (Exception e) {
			logger.debug("clickButtonByXpath - Button Click Failed in Exception Block" + "---" + data);
			ATUReports.add("Button click failed", LogAs.FAILED, new CaptureScreen(ScreenshotOf.DESKTOP));
		}
		return Value;
	}

	public String enterTextByIdBase(String value, String data) {
		try {
			logger.debug("enterTextByIdBase invoked" + "---" + data);
			if (enterTextById(value, data))
				ATUReports.add("Text Entered", data, LogAs.PASSED, new CaptureScreen(ScreenshotOf.DESKTOP));
			else
				ATUReports.add("Text not entered", data, LogAs.FAILED, new CaptureScreen(ScreenshotOf.DESKTOP));
			logger.debug("enterTextByIdBase - Text entered successfully" + "---" + data);
		} catch (Exception e) {
			logger.debug("enterTextByIdBase - Text Entry Failed in Exception Block" + "---" + data);
			ATUReports.add("Text entry failed", LogAs.FAILED, new CaptureScreen(ScreenshotOf.DESKTOP));
			logger.error(e);
		}
		return value;
	}

	public String verifyTextByIdBase(String Value, String data) {
		try {
			logger.debug("verifyTextByIdBase invoked" + "---" + data);
			if (verifyTextById(Value, data)) {
				ATUReports.add("Text verified ", "", data, getTextById(Value), LogAs.PASSED,
						new CaptureScreen(ScreenshotOf.DESKTOP));
			} else {
				ATUReports.add("Text not verified", "", data, getTextById(Value), LogAs.FAILED,
						new CaptureScreen(ScreenshotOf.DESKTOP));
			}
			logger.debug("verifyTextByIdBase - Text Verified" + "---" + data);
		} catch (Exception e) {
			logger.debug("verifyTextByIdBase - Text Verification Failed in Exception Block" + "---" + data);
			ATUReports.add("Text verification failed", LogAs.FAILED, new CaptureScreen(ScreenshotOf.DESKTOP));
			logger.error(e);
		}
		return Value;
	}

	public void verifyTextfromTable(String Xpath, String XpathVal, String data)
			throws FileNotFoundException, IOException, InterruptedException {
		scrollingToElementByXpath(Xpath);
		int size = getSizeByXpath(Xpath);
		try {
			boolean flag = false;
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath)));

			for (int i = 1; i <= size; i++) {
				scrollingToElementByXpath(Xpath + "[" + (i) + "]/td");
				int size2 = getSizeByXpath(Xpath + "[" + (i) + "]/td");
				String val = getTextByXpath(Xpath + "[" + (i) + "]" + XpathVal).trim();
				if (val.equals(data)) {
					ATUReports.add("Text Matched", val, data, LogAs.PASSED, new CaptureScreen(ScreenshotOf.DESKTOP));
					flag = true;
					break;
				} else {
					ATUReports.add("Text not Matched", val, data, LogAs.FAILED,
							new CaptureScreen(ScreenshotOf.DESKTOP));
				}

				if (flag) {
					break;
				}
				logger.debug("Link clicked" + "---" + data);
			}
		} catch (NoSuchElementException e) {
			logger.debug("Link Selection Failed in NoSuchElement Block" + "---" + data);
			ATUReports.add("No such element present", LogAs.FAILED, new CaptureScreen(ScreenshotOf.DESKTOP));
			logger.error(e);
		} catch (WebDriverException e1) {
			logger.debug("Link Selection Failed in WebDriverException" + "---" + data);
			ATUReports.add("Text Verification failed", LogAs.FAILED, new CaptureScreen(ScreenshotOf.DESKTOP));
			logger.error(e1);
		}

	}

	public String clickButtonByIdBase(String Value, String data) {
		try {
			logger.debug("clickButtonByIdBase invoked" + "---" + data);

			String Text = getAttrTextById(Value, "value").trim();
			if (Text.equalsIgnoreCase(data)) {
				if (clickById(Value)) {
					ATUReports.add("Button clicked", data, LogAs.PASSED, new CaptureScreen(ScreenshotOf.DESKTOP));
					logger.debug("clickButtonById - Button Clicked" + "---" + data);
				} else {
					ATUReports.add("Button not clicked", data, LogAs.FAILED, new CaptureScreen(ScreenshotOf.DESKTOP));
					logger.debug("clickButtonById - Button Not Clicked" + "---" + data);
				}
			}

		} catch (Exception e) {
			logger.debug("clickButtonById - Button Click Failed in Exception Block" + "---" + data);
			ATUReports.add("Button click failed", LogAs.FAILED, new CaptureScreen(ScreenshotOf.DESKTOP));
		}
		return Value;
	}

	public String clickCheckBoxByXpath(String Value, String data) throws InterruptedException {
		try {

			scrollingToElementByXpath(Value);
			logger.debug("clickCheckBoxByXpath invoked" + "---" + data);
			if (clickByXpath(Value)) {
				ATUReports.add("Check Box Selected", data, getTextByXpath(Value), data, LogAs.PASSED,
						new CaptureScreen(ScreenshotOf.DESKTOP));
				logger.debug("clickCheckBoxByXpath - Check Box Selected successfully" + "---" + data);
			} else {
				ATUReports.add("Check Box Not Selected", data, getTextByXpath(Value), data, LogAs.FAILED,
						new CaptureScreen(ScreenshotOf.DESKTOP));
				logger.debug("clickCheckBoxByXpath - Check Box Not Selected" + "---" + data);
			}

		} catch (Exception e) {
			logger.debug("clickByXpath - Check Box click Failed in Exception Block" + "---" + data);
			ATUReports.add("Check Box Selection failed", data, getTextByXpath(Value), data, LogAs.FAILED,
					new CaptureScreen(ScreenshotOf.DESKTOP));
			logger.error(e);
		}
		return Value;
	}

	public String clickOnTabByXpath(String Value, String data) throws InterruptedException {
		try {

			scrollingToElementByXpath(Value);
			logger.debug("clickOnTabByXpath invoked" + "---" + data);
			if (clickByXpath(Value)) {
				ATUReports.add("Tab clicked", data, getTextByXpath(Value), data, LogAs.PASSED,
						new CaptureScreen(ScreenshotOf.DESKTOP));
				logger.debug("clickOnTabByXpath - Tab Clicked successfully" + "---" + data);
			} else {
				ATUReports.add("Tab not clicked", data, getTextByXpath(Value), data, LogAs.FAILED,
						new CaptureScreen(ScreenshotOf.DESKTOP));
				logger.debug("clickOnTabByXpath - Unable to Click On Tab" + "---" + data);
			}
		} catch (Exception e) {
			logger.debug("clickOnTabByXpath - Tab click Failed in Exception Block" + "---" + data);
			ATUReports.add("Tab click failed", data, getTextByXpath(Value), data, LogAs.FAILED,
					new CaptureScreen(ScreenshotOf.DESKTOP));
			logger.error(e);
		}
		return Value;
	}

	public String clickByXpath(String Value, String data) {
		try {

			scrollingToElementByXpath(Value);
			logger.debug("clickByXpath invoked" + "---" + data);
			if (clickByXpath(Value)) {
				ATUReports.add("Button clicked", data, LogAs.PASSED, new CaptureScreen(ScreenshotOf.DESKTOP));
			} else {
				ATUReports.add("Button not clicked", data, LogAs.FAILED, new CaptureScreen(ScreenshotOf.DESKTOP));
			}
			logger.debug("clickByXpath - Button Clicked successfully" + "---" + data);
		} catch (Exception e) {
			logger.debug("clickByXpath - Button click Failed in Exception Block" + "---" + data);
			ATUReports.add("Button click failed", LogAs.FAILED, new CaptureScreen(ScreenshotOf.DESKTOP));
			// CommonLogger.errorLog(e);
		}
		return Value;
	}

	public String clickOnTabByID(String Value, String data) throws InterruptedException {
		try {

			scrollingToElementByID(Value);
			logger.debug("clickOnTabByID invoked" + "---" + data);
			if (clickByXpath(Value)) {
				ATUReports.add("Tab clicked", data, getTextById(Value), data, LogAs.PASSED,
						new CaptureScreen(ScreenshotOf.DESKTOP));
				logger.debug("clickOnTabByID - Tab Clicked successfully" + "---" + data);
			} else {
				ATUReports.add("Tab not clicked", data, getTextById(Value), data, LogAs.FAILED,
						new CaptureScreen(ScreenshotOf.DESKTOP));
				logger.debug("clickOnTabByID - Unable to Click On Tab" + "---" + data);
			}
		} catch (Exception e) {
			logger.debug("clickOnTabByID - Tab click Failed in Exception Block" + "---" + data);
			ATUReports.add("Tab click failed", data, getTextById(Value), data, LogAs.FAILED,
					new CaptureScreen(ScreenshotOf.DESKTOP));
			logger.error(e);
		}
		return Value;
	}

	public BasePage closeBrowser() {
		try {
			logger.debug("closeBrowser invoked");
			ATUReports.add("Browser closed", LogAs.INFO, new CaptureScreen(ScreenshotOf.DESKTOP));
			close();
			
			logger.debug("closeBrowser - Browser Closed");
		} catch (Exception e) {
			logger.debug("closeBrowser - Browser Close Failed in Exception Block");
			ATUReports.add("Launch Browser failed", LogAs.FAILED, new CaptureScreen(ScreenshotOf.DESKTOP));
			logger.error(e);
		}
		return this;
	}

	public String selectUsingVisibleTextByXpath(String Value, String data) {
		try {
			logger.debug("selectUsingVisibleTextByXpath invoked");
			if (selectVisibleTextByXpath(Value, data)) {
				ATUReports.add("Option selected", data, getTextByXpath(Value), data, LogAs.PASSED,
						new CaptureScreen(ScreenshotOf.DESKTOP));
			} else {
				ATUReports.add("Option not selected", data, LogAs.FAILED, new CaptureScreen(ScreenshotOf.DESKTOP));
			}
			logger.debug("selectUsingVisibleTextByXpath - Option Selected");
		} catch (Exception e) {
			logger.debug("selectUsingVisibleTextByXpath - Option Selection Failed in Exception Block");
			ATUReports.add("Option selection failed", LogAs.FAILED, new CaptureScreen(ScreenshotOf.DESKTOP));
			logger.error(e);
		}
		return Value;

	}

	public String IsElementsEnabledById(String Id, String data) {
		try {
			logger.debug("IsElementsEnabledById invoked");
			if (IsEnabledById(Id))
				ATUReports.add("Element Enabled", "", data, data, LogAs.PASSED,
						new CaptureScreen(ScreenshotOf.DESKTOP));
			else
				ATUReports.add("Element not Enabled", data, LogAs.FAILED, new CaptureScreen(ScreenshotOf.DESKTOP));
			logger.debug("IsElementsEnabledById - Elements Enabled");
		} catch (Exception e) {
			logger.debug("IsElementsEnabledById - Elements Enable Verification Failed in Exception Block");
			ATUReports.add("Element not present", LogAs.FAILED, new CaptureScreen(ScreenshotOf.DESKTOP));
		}
		return Id;
	}

	public String IsElementsEnabledByXpath(String Xpath, String data) {
		try {
			logger.debug("IsElementsEnabledByXpath invoked");
			if (IsEnabledByXpath(Xpath))
				ATUReports.add("Element Enabled", data, LogAs.PASSED, new CaptureScreen(ScreenshotOf.DESKTOP));
			else
				ATUReports.add("Element not Enabled", data, LogAs.FAILED, new CaptureScreen(ScreenshotOf.DESKTOP));
			logger.debug("IsElementsEnabledByXpath - Elements Enabled");
		} catch (Exception e) {
			logger.debug("IsElementsEnabledByXpath - Elements Enable Verification Failed in Exception Block");
			ATUReports.add("Element not present", LogAs.FAILED, new CaptureScreen(ScreenshotOf.DESKTOP));
		}
		return Xpath;
	}

}
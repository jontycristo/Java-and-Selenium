package cms.pages;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class KitToKit extends BasePage {
	Properties prop;

	public KitToKit() {
		try {
			prop = loadObjectRepository("properties\\KitToKit.properties");

		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}
	}

	public KitToKit verifyfielsdsinPage(String PageHeading, String proceed) {
		try {
			IsElementsDisplayedByXpath(prop.getProperty("KitToKitPage.PageHeading.Xpath"), PageHeading);
			IsElementsDisplayedByXpath(prop.getProperty("KitToKitPage.proceed.Xpath"), proceed);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public KitToKit ClickOnRadioBtn(String scenario) {
		try {
			if (scenario.equalsIgnoreCase("M2M")) {
				clickByXpath(prop.getProperty("KitToKitPage.multomulbtn.Xpath"), "Multi To Multi");
			} else if (scenario.equalsIgnoreCase("S2M")) {
				clickByXpath(prop.getProperty("KitToKitPage.singletomulbtn.Xpath"), "Single To Multi");
			} else {
				clickByXpath(prop.getProperty("KitToKitPage.singletosinglebtn.Xpath"), "Single To single");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public KitToKit ClickOnProceed() {
		try {
			clickByXpath(prop.getProperty("KitToKitPage.proceedbtn.Xpath"), "Proceed");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public KitToKit verifyfielsdsinNewPage(String CardNo, String Status, String Reason, String NewCardNo,
			String proceed1) {
		try {
			IsElementsDisplayedByXpath(prop.getProperty("KitToKitPage.CardNoText.Xpath"), CardNo);
			IsElementsDisplayedByXpath(prop.getProperty("KitToKitPage.StatusText.Xpath"), Status);
			IsElementsDisplayedByXpath(prop.getProperty("KitToKitPage.ReasonText.Xpath"), Reason);
			IsElementsDisplayedByXpath(prop.getProperty("KitToKitPage.NewCardNoText.Xpath"), NewCardNo);
			IsElementsDisplayedByXpath(prop.getProperty("KitToKitPage.proceed1.Xpath"), proceed1);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public KitToKit enterNewCardNo(String NewCardNo) {
		try {
			enterValueByXpathBase(prop.getProperty("KitToKitPage.NewCardNo.Xpath"), NewCardNo);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	public KitToKit enterNewCardNo1(String NewCardNo) {
		try {
			enterValueByXpathBase(prop.getProperty("KitToKitPage.NewCardNo.Xpath"), NewCardNo);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public KitToKit ClickOnProceedbtn() {
		try {
			clickByXpath(prop.getProperty("KitToKitPage.proceedbtn1.Xpath"), "Proceed");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public KitToKit resultMessage(String data) {
		try {
			logger.debug("resultMessage invoked" + "---" + "KitToKit" + " " + "for" + " " + data);
			if (driver
					.findElement(
							By.xpath("//*[starts-with(text(),'Both cards from new kit must be in Inactive status')]"))
					.isDisplayed()) {
				ATUReports.add("Result Displayed", data, getTextByXpath(prop.getProperty("KitToKitPage.error1.Xpath")),
						data, LogAs.PASSED, new CaptureScreen(ScreenshotOf.DESKTOP));
				logger.error("Both cards from new kit must be in Inactive status" + "---" + "KitToKit" + " "
						+ "New Card Number is" + " " + data);
			} else {
				ATUReports.add("Result Displayed", data, "The Kit is Replaced successfully", data, LogAs.PASSED,
						new CaptureScreen(ScreenshotOf.DESKTOP));
				logger.info("The Kit is Replaced successfully" + "---" + "KitToKit" + " " + "New Card Number is" + " "
						+ data);
			}
		} 
			catch (Exception e) {
			e.printStackTrace();
			ATUReports.add("Kit_To_Kit Exception", data, "Exception in Kit_To_Kit Replacement", data, LogAs.FAILED,
					new CaptureScreen(ScreenshotOf.DESKTOP));
			logger.info("Exception in Kit Replacement ", e);
		}
		return this;
	}
	public KitToKit verifyfielsdsinresultPage(String ResultHeading, String message, String CardNum, String Status1,
			String Backbtn) {
		try {
			IsElementsDisplayedByXpath(prop.getProperty("KitToKitPage.ResultHeadingText.Xpath"), ResultHeading);
			IsElementsDisplayedByXpath(prop.getProperty("KitToKitPage.messageText.Xpath"), message);
			IsElementsDisplayedByXpath(prop.getProperty("KitToKitPage.CardNumText.Xpath"), CardNum);
			IsElementsDisplayedByXpath(prop.getProperty("KitToKitPage.Status1Text.Xpath"), Status1);
			IsElementsDisplayedByXpath(prop.getProperty("KitToKitPage.BackbtnText.Xpath"), Backbtn);
			IsRsltElementsDisplayedByXpath(prop.getProperty("KitToKitPage.rsltmsgText.Xpath"), message);
			IsRsltElementsDisplayedByXpath(prop.getProperty("KitToKitPage.CardNumbText.Xpath"), CardNum);
			IsRsltElementsDisplayedByXpath(prop.getProperty("KitToKitPage.CardStatusText.Xpath"), Status1);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	

	public Welcome callClose() {
		try {
			enterTextByXpathBase(prop.getProperty("Comment.Xpath"), "close the call please");
			Thread.sleep(1000);
			clickByXpath(prop.getProperty("CallClose.Xpath"), "Call Close");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Welcome();
	}

}

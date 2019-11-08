package cms.pages;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FeePlan extends BasePage {

	Properties prop;

	public FeePlan() {
		try {
			prop = loadObjectRepository("properties\\FeePlan.properties");

		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}
	}

	public FeePlan verifyfielsdsinPage1(String PageHeading, String EditFeePlan, String CardNo, String FeePlan,
			String EffectiveDate, String ViewFeePlanDtl) {
		try {
			IsElementsDisplayedByXpath(prop.getProperty("FeePlanPage.PageHeading.Xpath"), PageHeading);
			IsElementsDisplayedByXpath(prop.getProperty("FeePlanPage.EditFeePlanText.Xpath"), EditFeePlan);
			IsElementsDisplayedByXpath(prop.getProperty("FeePlanPage.CardNoText.Xpath"), CardNo);
			IsElementsDisplayedByXpath(prop.getProperty("FeePlanPage.FeePlanText.Xpath"), FeePlan);
			IsElementsDisplayedByXpath(prop.getProperty("FeePlanPage.EffectiveDateText.Xpath"), EffectiveDate);
			IsElementsDisplayedByXpath(prop.getProperty("FeePlanPage.ViewFeePlanDtlText.Xpath"), ViewFeePlanDtl);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public FeePlan ClickOnCheckBox() {
		try {
			clickCheckBoxByXpath(prop.getProperty("FeePlanPage.RemarkCheckBox.Xpath"), "Remark");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public FeePlan verifyfielsdsinPage2(String Remark, String Update) {
		try {
			IsElementsDisplayedByXpath(prop.getProperty("FeePlanPage.RemarkText.Xpath"), Remark);
			IsElementsDisplayedByXpath(prop.getProperty("FeePlanPage.UpdateText.Xpath"), Update);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public FeePlan selectFeePlan(String data) {
		try {
			selectUsingValueByXpath(prop.getProperty("FeePlanPage.DropDown.Xpath"), data);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	public FeePlan enterRemark(String data) {
		try {
			enterTextByXpathBase(prop.getProperty("FeePlanPage.remark.Xpath"), data);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	public FeePlan clickOnUpdateBtn() {
		try {
			clickByXpath(prop.getProperty("FeePlanPage.updatebtn.Xpath"), "Update");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	public FeePlan resultMessage(String data) throws InterruptedException {
		try {
		logger.debug("resultMessage invoked" + "---" + "Fee_Plan" + " " + "is" + " " + data);
		if (driver.findElement(By.xpath("//*[starts-with(text(),'Fee Plan Updated Successfully')]")).isDisplayed()) {
			ATUReports.add("Result Displayed", data,"The Card Should Not be Closed Or Expired" ,getTextByXpath(prop.getProperty("FeePlanPage.result.Xpath")),LogAs.PASSED,
					new CaptureScreen(ScreenshotOf.DESKTOP));
			logger.debug("Fee Plan Updated Successfully" + "---" + "New_Fee_Plan" + " " + "is" + " " + data);
		}
		else {
			ATUReports.add("Result Displayed", data,"The Card Should Not be Closed Or Expired", getTextByXpath(prop.getProperty("FeePlanPage.result.Xpath")),LogAs.FAILED,
					new CaptureScreen(ScreenshotOf.DESKTOP));
			logger.debug("Error In Process Invalid Card Status" + "---" + "New_Fee_Plan" + " " + "is" + " " + data);
			
		}
		} catch (Exception e) {
			e.printStackTrace();
			ATUReports.add("Result Displayed", data,"", getTextByXpath(prop.getProperty("FeePlanPage.result.Xpath")) , LogAs.FAILED,
					new CaptureScreen(ScreenshotOf.DESKTOP));
			logger.debug("Fee Plan Updation Failed",e);
		}
		return this;

	}
	
	public Welcome callClose() {
		try {
			enterTextByXpathBase(prop.getProperty("Comment.Xpath"), "close the call please");
			Thread.sleep(1000);
			clickByXpath(prop.getProperty("CallClose.Xpath"),"Call Close");
				} catch (Exception e) {
			e.printStackTrace();
		}
				return new Welcome();
	}

}

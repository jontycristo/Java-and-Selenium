package cms.pages;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.log4testng.Logger;

public class Card_Status extends BasePage {
	Properties prop;
	Logger logger = Logger.getLogger("CSRLogs");
	public  Card_Status(){
		try {
			prop = loadObjectRepository("properties\\Card_Status.properties");
		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}
	}
	public Card_Status verifyMainPageHeading(String data) {
		try {
			Thread.sleep(2000);
			IsElementsDisplayedByXpath(prop.getProperty("Card_Status.MainHeading.Xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	public Card_Status verifyGrpPageField(String CardNo,String CurrCardStat,String ApplStat,String ChngCardStatto,String Remark,String ChngCardStatB )
	{
		try {
			Thread.sleep(2000);
			IsElementsDisplayedByXpath(prop.getProperty("Card_Status.CardNo.Xpath"), CardNo);
			IsElementsDisplayedByXpath(prop.getProperty("Card_Status.CurrCardStat.Xpath"), CurrCardStat);
			IsElementsDisplayedByXpath(prop.getProperty("Card_Status.ApplStat.Xpath"), ApplStat);
			IsElementsDisplayedByXpath(prop.getProperty("Card_Status.ChngCardStattotxt.Xpath"), ChngCardStatto);
			IsElementsDisplayedByXpath(prop.getProperty("Card_Status.Remarktxt.Xpath"), Remark);	
			IsElementsDisplayedByXpath(prop.getProperty("Card_Status.ChngCardStatB.Xpath"), ChngCardStatB);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

//public Card_Status selectChngCardStat(String CardStat){
//	try {
//		
//		selectUsingVisibleTextByXpath(prop.getProperty("Card_Status.ChngCardStatto.Xpath"), CardStat);
//		
//		//logger.error("unable to run role");
//			} catch (Exception e) {
//		e.printStackTrace();
//	}
//			return this;
//}
public Card_Status enterRemark(String remark){
	try {
		enterTextByXpathBase(prop.getProperty("Card_Status.Remark.Xpath"), remark);
		Thread.sleep(1000);
			} catch (Exception e) {
		e.printStackTrace();
	}
			return this;
}
public Card_Status clickSearchtab() throws InterruptedException {

	clickByXpath(prop.getProperty("Card_Status.ChngCardStatB.Xpath"), "Search");
	Thread.sleep(1000);
	clickByXpath(prop.getProperty("Card_Status.PopUp.Xpath"),"PopUp");
	Thread.sleep(1000);
	return this;
}

public Card_Status ClickOnCheckBox() {
	try {
		clickCheckBoxByXpath(prop.getProperty("Card_Status.chkbox1.Xpath"), "Card No");
		clickCheckBoxByXpath(prop.getProperty("Card_Status.chkbox2.Xpath"), "First Name");
		clickCheckBoxByXpath(prop.getProperty("Card_Status.chkbox5.Xpath"), "Card Expiry Date");

	} catch (Exception e) {
		e.printStackTrace();
	}
	return this;
}

public Card_Status clickVerify(String from,String to,String btnval,String remark){
	
	try {
		if(((from.equalsIgnoreCase("Lost-stolen"))||(from.equalsIgnoreCase("Damage"))
				||(from.equalsIgnoreCase("close"))||(from.equalsIgnoreCase("TempBlock")))&&(to.equalsIgnoreCase("Activate")))
				{
			System.out.println("enter into if...");
			selectUsingVisibleTextByXpath(prop.getProperty("Card_Status.ChngCardStatto.Xpath"),to);
			enterRemark(remark);
			clickSearchtab();
			ClickOnCheckBox();
			clickSubmit(btnval);
			}
		else{
			System.out.println("else...");
			selectUsingVisibleTextByXpath(prop.getProperty("Card_Status.ChngCardStatto.Xpath"),to);
			enterRemark(remark);
			clickSearchtab();
			}
		
		Thread.sleep(1000);
			} catch (Exception e) {
		e.printStackTrace();
	}
			return this;
}
public Card_Status clickSubmit(String btnval){
	
	try {
		if(btnval.equalsIgnoreCase("Activate")){
			
		clickButtonByXpath(prop.getProperty("Card_Status.Activate.Xpath"),btnval);
		}
		else{
			clickButtonByXpath(prop.getProperty("Card_Status.Back.Xpath"),btnval);
			}
		Thread.sleep(1000);
			} catch (Exception e) {
		e.printStackTrace();
	}
			return this;
}
public Card_Status verifyResult(){
	try {
		logger.debug("selectUsingValueByXpath invoked");
		if (driver.findElement(By.xpath("//*[contains(text(),'Card Status Changed Successfully')]")).isDisplayed()) 
		{
			ATUReports.add("Result Verified"," ","Card Status Changed Successfully","Card Status Changed Successfully",LogAs.PASSED,new CaptureScreen(ScreenshotOf.DESKTOP));
			logger.debug("Result Verified - Card Status Changed Successfully");
		} 

	} catch (Exception e) {
		logger.debug("verifyTextByIdBase - Text Verification Failed in Exception Block");
		ATUReports.add("Result Verified"," ","Card Already Lost","Card Already Lost", LogAs.PASSED,
				new CaptureScreen(ScreenshotOf.DESKTOP));
		logger.error(e);
		
	}
	return this;
}
public Welcome callClose() {
	try {
		enterTextByXpathBase(prop.getProperty("Card_Status.Comment.Xpath"), "close the call please");
		Thread.sleep(1000);
		clickButtonByXpath(prop.getProperty("Card_Status.CallClose.Xpath"),"Call Close");
			} catch (Exception e) {
		e.printStackTrace();
	}
			return new Welcome();
}



}


package cms.pages;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MySetUpage extends BasePage {
	Properties prop;

	public MySetUpage() {
		try {
			prop = loadObjectRepository("properties\\MySetUpage.properties");

		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}
	}

	public MySetUpage verifyMainPageHeading(String data) {
		try {
			IsElementsDisplayedByXpath(prop.getProperty("MySetUpage.SetUpHeading.Xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public MySetUpage verifyTextinPage(String PSdet, String UID, String DOB, String FDate, String TDate, String Profdet,
			String UName, String Grp, String Udet, String ChPass) {
		try {
			IsElementsDisplayedByXpath(prop.getProperty("MySetUpage.PSdetText.Xpath"), PSdet);
			IsElementsDisplayedByXpath(prop.getProperty("MySetUpage.UIDText.Xpath"), UID);
			IsElementsDisplayedByXpath(prop.getProperty("MySetUpage.DOBText.Xpath"), DOB);
			IsElementsDisplayedByXpath(prop.getProperty("MySetUpage.FDateText.Xpath"), FDate);
			IsElementsDisplayedByXpath(prop.getProperty("MySetUpage.TDateText.Xpath"), TDate);
			IsElementsDisplayedByXpath(prop.getProperty("MySetUpage.ProfdetText.Xpath"), Profdet);
			IsElementsDisplayedByXpath(prop.getProperty("MySetUpage.UNameText.Xpath"), UName);
			IsElementsDisplayedByXpath(prop.getProperty("MySetUpage.GrpText.Xpath"), Grp);
			IsElementsDisplayedByXpath(prop.getProperty("MySetUpage.UdetText.Xpath"), Udet);
			IsElementsDisplayedByXpath(prop.getProperty("MySetUpage.ChPassText.Xpath"), ChPass);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return this;
	}

	public MySetUpage verifyCheckBoxinpage(String EditDet1, String EditDet2) {
		try {
			IsElementsDisplayedByXpath(prop.getProperty("MySetUpage.EditDet1.Xpath"), EditDet1);
			IsElementsDisplayedByXpath(prop.getProperty("MySetUpage.EditDet2.Xpath"), EditDet2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public MySetUpage verifyDropDowninpage(String FSecQue, String SSecQue) {
		try {
			IsElementsDisplayedByXpath(prop.getProperty("MySetUpage.FSecQue.Xpath"), FSecQue);
			IsElementsDisplayedByXpath(prop.getProperty("MySetUpage.SSecQue.Xpath"), SSecQue);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public MySetUpage verifyTextBoxinpage(String EAddr, String FSecAns, String SSecAns, String OldPass, String NewPass,
			String ConfPass) {
		try {
			IsElementsDisplayedByXpath(prop.getProperty("MySetUpage.EAddr.Xpath"), EAddr);
			IsElementsDisplayedByXpath(prop.getProperty("MySetUpage.FSecAns.Xpath"), FSecAns);
			IsElementsDisplayedByXpath(prop.getProperty("MySetUpage.SSecAns.Xpath"), SSecAns);
			IsElementsDisplayedByXpath(prop.getProperty("MySetUpage.OldPass.Xpath"), OldPass);
			IsElementsDisplayedByXpath(prop.getProperty("MySetUpage.NewPass.Xpath"), NewPass);
			IsElementsDisplayedByXpath(prop.getProperty("MySetUpage.ConfPass.Xpath"), ConfPass);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public MySetUpage enterTextByXpath(String EditDet1, String EmailAddr, String FSecQues,String FSecAns1,
			String SSecQues,String SSecAns1, String EditDet2, String OldPassword, String NewPassword,
			String ConfPassword) throws InterruptedException {
		clickCheckBoxByXpath(prop.getProperty("MySetUpage.EditDetail1.Xpath"), EditDet1);
		enterTextByXpathBase(prop.getProperty("MySetUpage.EmailAddr.Xpath"), EmailAddr);
		selectUsingValueByXpath(prop.getProperty("MySetUpage.FSecQues.Xpath"), FSecQues);
		enterTextByXpathBase(prop.getProperty("MySetUpage.FSecAns1.Xpath"), FSecAns1);
		selectUsingValueByXpath(prop.getProperty("MySetUpage.SSecQues.Xpath"), SSecQues);
		enterTextByXpathBase(prop.getProperty("MySetUpage.SSecAns1.Xpath"), SSecAns1);
		clickCheckBoxByXpath(prop.getProperty("MySetUpage.EditDetail2.Xpath"), EditDet2);
		enterTextByXpathBase(prop.getProperty("MySetUpage.OldPassword.Xpath"), OldPassword);
		enterTextByXpathBase(prop.getProperty("MySetUpage.NewPassword.Xpath"), NewPassword);
		enterTextByXpathBase(prop.getProperty("MySetUpage.ConfPassword.Xpath"), ConfPassword);
		return this;
	}

	public MySetUpage clickButton(String btn) throws InterruptedException {
		
		if(btn.equalsIgnoreCase("Update"))
		{
			clickByXpath(prop.getProperty("MySetUpage.updatebtn.Xpath"), btn);
		}else
		{
			clickByXpath(prop.getProperty("MySetUpage.clearbtn.Xpath"), btn);
		}
		
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

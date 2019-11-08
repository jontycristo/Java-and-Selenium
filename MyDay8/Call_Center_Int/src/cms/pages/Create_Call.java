package cms.pages;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Create_Call extends BasePage {
	Properties prop;

	public Create_Call() {
		try {
			prop = loadObjectRepository("properties\\create_call.properties");

		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}
	}

	public Create_Call verifyfielsdsinPage(String PageHeading, String Proceed, String Card, String ProxyNO,
			String Cardsts, String ActiveDate, String ExpiryDate, String Acct, String FName, String MName, String LName,
			String DocType, String IDNO, String OnlineID, String EAddr, String DOB, String MobNO, String Replacecard,
			String ExCard, String NatCode, String PAcctNO, String BrSolID, String EmpID, String RegSmsAlert,
			String RegEmailAlert, String CorpID, String CorpName, String Org, String TravelDtl, String LastTwoDep,
			String LastFiveTxn) {
		try {
			IsElementsDisplayedByXpath(prop.getProperty("CreateCallPage.PageHeading.Xpath"), PageHeading);
			IsElementsDisplayedByXpath(prop.getProperty("CreateCallPage.ProceedText.Xpath"), Proceed);
			IsElementsDisplayedByXpath(prop.getProperty("CreateCallPage.CardText.Xpath"), Card);
			IsElementsDisplayedByXpath(prop.getProperty("CreateCallPage.ProxyNOText.Xpath"), ProxyNO);
			IsElementsDisplayedByXpath(prop.getProperty("CreateCallPage.CardstsText.Xpath"), Cardsts);
			IsElementsDisplayedByXpath(prop.getProperty("CreateCallPage.ActiveDateText.Xpath"), ActiveDate);
			IsElementsDisplayedByXpath(prop.getProperty("CreateCallPage.ExpiryDateText.Xpath"), ExpiryDate);
			IsElementsDisplayedByXpath(prop.getProperty("CreateCallPage.AcctText.Xpath"), Acct);
			IsElementsDisplayedByXpath(prop.getProperty("CreateCallPage.FNameText.Xpath"), FName);
			IsElementsDisplayedByXpath(prop.getProperty("CreateCallPage.MNameText.Xpath"), MName);
			IsElementsDisplayedByXpath(prop.getProperty("CreateCallPage.LNameText.Xpath"), LName);
			IsElementsDisplayedByXpath(prop.getProperty("CreateCallPage.DocTypeText.Xpath"), DocType);
			IsElementsDisplayedByXpath(prop.getProperty("CreateCallPage.IDNOText.Xpath"), IDNO);
			IsElementsDisplayedByXpath(prop.getProperty("CreateCallPage.OnlineIDText.Xpath"), OnlineID);
			IsElementsDisplayedByXpath(prop.getProperty("CreateCallPage.EAddrText.Xpath"), EAddr);
			IsElementsDisplayedByXpath(prop.getProperty("CreateCallPage.DOBText.Xpath"), DOB);
			IsElementsDisplayedByXpath(prop.getProperty("CreateCallPage.MobNOText.Xpath"), MobNO);
			IsElementsDisplayedByXpath(prop.getProperty("CreateCallPage.ReplacecardText.Xpath"), Replacecard);
			IsElementsDisplayedByXpath(prop.getProperty("CreateCallPage.ExCardText.Xpath"), ExCard);
			IsElementsDisplayedByXpath(prop.getProperty("CreateCallPage.NatCodeText.Xpath"), NatCode);
			IsElementsDisplayedByXpath(prop.getProperty("CreateCallPage.PAcctNOText.Xpath"), PAcctNO);
			IsElementsDisplayedByXpath(prop.getProperty("CreateCallPage.BrSolIDText.Xpath"), BrSolID);
			IsElementsDisplayedByXpath(prop.getProperty("CreateCallPage.EmpIDText.Xpath"), EmpID);
			IsElementsDisplayedByXpath(prop.getProperty("CreateCallPage.RegSmsAlertText.Xpath"), RegSmsAlert);
			IsElementsDisplayedByXpath(prop.getProperty("CreateCallPage.RegEmailAlertText.Xpath"), RegEmailAlert);
			IsElementsDisplayedByXpath(prop.getProperty("CreateCallPage.CorpIDText.Xpath"), CorpID);
			IsElementsDisplayedByXpath(prop.getProperty("CreateCallPage.CorpNameText.Xpath"), CorpName);
			IsElementsDisplayedByXpath(prop.getProperty("CreateCallPage.OrgText.Xpath"), Org);
			IsElementsDisplayedByXpath(prop.getProperty("CreateCallPage.TravelDtlText.Xpath"), TravelDtl);
			IsElementsDisplayedByXpath(prop.getProperty("CreateCallPage.LastTwoDepText.Xpath"), LastTwoDep);
			IsElementsDisplayedByXpath(prop.getProperty("CreateCallPage.LastFiveTxnText.Xpath"), LastFiveTxn);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public Create_Call Proceed() {
		try {
			clickButtonByXpath(prop.getProperty("CreateCallPage.Proceed.Xpath"), "Proceed");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public Create_Call verifyCustverfctnfield(String CustveriMainhead, String Custverihead, String DOB, String ExpDate,
			String MothersMaidenName, String Last5Txn, String MailingAddr) {
		try {
			IsElementsDisplayedByXpath(prop.getProperty("CreateCallPage.CustveriMainhead.Xpath"), CustveriMainhead);
			IsElementsDisplayedByXpath(prop.getProperty("CreateCallPage.Custverihead.Xpath"), Custverihead);
			IsElementsDisplayedByXpath(prop.getProperty("CreateCallPage.DOB.Xpath"), DOB);
			IsElementsDisplayedByXpath(prop.getProperty("CreateCallPage.ExpDate.Xpath"), ExpDate);
			IsElementsDisplayedByXpath(prop.getProperty("CreateCallPage.MothersMaidenName.Xpath"), MothersMaidenName);
			IsElementsDisplayedByXpath(prop.getProperty("CreateCallPage.LastFiveTransactions.Xpath"), Last5Txn);
			IsElementsDisplayedByXpath(prop.getProperty("CreateCallPage.MailingAddr.Xpath"), MailingAddr);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public Create_Call ClickOnCheckBox() {
		try {
			clickCheckBoxByXpath(prop.getProperty("CreateCallPage.CheckBox4.Xpath"), "Mailing Address");
			clickCheckBoxByXpath(prop.getProperty("CreateCallPage.CheckBox5.Xpath"), "Last Five Transactions");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public HomePage createCall() {
		try {
			clickByXpath(prop.getProperty("CreateCallPage.Careatecall.Xpath"), "CreateCall");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return new HomePage();
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

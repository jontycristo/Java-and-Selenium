package cms.tcases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import cms.pages.Create_Call;
import cms.pages.Login;
import cms.util.DataInputProvider;
import cms.util.ReportUtil;

@Listeners({ ATUReportsListener.class, ConfigurationListener.class, MethodListener.class })
public class CreateCall_tc {
	{
		ReportUtil.reports();
	}

	@Test(dataProvider = "CreateCall1", enabled=true, priority=16)
	public void createCallpage1(String ename, String edata1, String edata2, String edata3, String edata4, String edata5,
			String edata6, String edata7, String edata8, String edata9, String edata10, String edata11,
			String PageHeading, String Proceed, String Card, String ProxyNO, String Cardsts, String ActiveDate,
			String ExpiryDate, String Acct, String FName, String MName, String LName, String DocType, String IDNO,
			String OnlineID, String EAddr, String DOB, String MobNO, String Replacecard, String ExCard, String NatCode,
			String PAcctNO, String BrSolID, String EmpID, String RegSmsAlert, String RegEmailAlert, String CorpID,
			String CorpName, String Org, String TravelDtl, String LastTwoDep, String LastFiveTxn)
			throws FileNotFoundException, IOException, InterruptedException {

		new Login().launchBrowser().enterLoginCredentials5()
				.searchelement(ename, edata1, edata2, edata3, edata4, edata5, edata6, edata7, edata8, edata9, edata10,
						edata11)
				.clickSearchtab()
				.verifyfielsdsinPage(PageHeading, Proceed, Card, ProxyNO, Cardsts, ActiveDate, ExpiryDate, Acct, FName,
						MName, LName, DocType, IDNO, OnlineID, EAddr, DOB, MobNO, Replacecard, ExCard, NatCode, PAcctNO,
						BrSolID, EmpID, RegSmsAlert, RegEmailAlert, CorpID, CorpName, Org, TravelDtl, LastTwoDep,
						LastFiveTxn);
	}

	@Test(dataProvider = "CreateCall2" ,enabled=true, priority=17)
	public void createCallpage2(String CustveriMainhead, String Custverihead, String DOB1, String ExpDate, String MothersMaidenName,
			String Last5Txn, String MailingAddr) throws FileNotFoundException, IOException, InterruptedException {

		new Create_Call().Proceed().verifyCustverfctnfield(CustveriMainhead, Custverihead, DOB1, ExpDate, MothersMaidenName,
						Last5Txn, MailingAddr);
		
	}

	@Test(enabled=true, priority=18)
	public void createCall()
			throws FileNotFoundException, IOException, InterruptedException {

		new Create_Call().ClickOnCheckBox().createCall().callClose().Logout().quitBrowser();
	}

	@DataProvider(name = "CreateCall1")
	public Object[][] getData1() {
		System.out.println("Entry into data provider");
		return DataInputProvider.getSheet("CSR_DATA", "CreateCall1");

	}

	@DataProvider(name = "CreateCall2")
	public Object[][] getData2() {
		System.out.println("Entry into data provider");
		return DataInputProvider.getSheet("CSR_DATA", "CreateCall2");
	}

}

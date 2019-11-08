package cms.tcases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import cms.pages.Login;
import cms.pages.ServicePage;
import cms.util.DataInputProvider;
import cms.util.ReportUtil;

@Listeners({ ATUReportsListener.class, ConfigurationListener.class, MethodListener.class })
public class Services_tc {
	{
		ReportUtil.reports();
	}

	@Test(dataProvider = "Login", enabled = true, priority = 31)
	public void Login(String ename, String edata1, String edata2, String edata3, String edata4, String edata5,
			String edata6, String edata7, String edata8, String edata9, String edata10, String edata11, String Menu)
			throws FileNotFoundException, IOException, InterruptedException {
		new Login().launchBrowser()
				.enterLoginCredentials5().searchelement(ename, edata1, edata2, edata3, edata4, edata5, edata6, edata7,
						edata8, edata9, edata10, edata11)
				.clickSearchtab().Proceed().ClickOnCheckBox().createCall().clickServices(Menu);

	}

	@DataProvider(name = "Login")
	public Object[][] Login() {
		return DataInputProvider.getSheet("Service", "Login");
	}

	@Test(dataProvider = "VerifyStatement", enabled = true, priority = 32)
	public void VerifyStatement(String PageHeading, String SelectAccount, String FromYear, String FromMonth,
			String ToYear, String ToMonth, String ViewButton, String EmailButton, String selectAccount, String fromYear,
			String fromMonth, String toYear, String toMonth, String Heading, String Card, String SrNo, String TranDate,
			String Invoice, String TranDesc, String TranCurr, String TranAmt, String BillingCurr, String BillingAmt,
			String CRrDrFlag, String CSV, String Excel, String PDF)
			throws FileNotFoundException, IOException, InterruptedException {
		new ServicePage().verifyPageHeading(PageHeading)
				.verifyEnableDropDownonPage(SelectAccount, FromYear, FromMonth, ToYear, ToMonth)
				.verifyButtonsinPage(ViewButton, EmailButton).selectAccount(selectAccount).selectFromYear(fromYear)
				.selectFromMonth(fromMonth).selectToYear(toYear).selectToMonth(toMonth)
				.clickonViewButton().verifyHeading(Heading).verifyTextinPage(Card, SrNo, TranDate, Invoice, TranDesc,
						TranCurr, TranAmt, BillingCurr, BillingAmt, CRrDrFlag)
				.verifyDownloadLinks(CSV, Excel, PDF).clickonBack();

	}

	@DataProvider(name = "VerifyStatement")
	public Object[][] getVerifyStatement() {
		return DataInputProvider.getSheet("Service", "VerifyStatement");
	}
	@Test(dataProvider = "ViewStatement", enabled = true, priority = 33)
	public void ViewStatement(String selectAccount, String fromYear, String fromMonth, String toYear, String toMonth)
			throws FileNotFoundException, IOException, InterruptedException {
		new ServicePage().selectAccount(selectAccount).selectFromYear(fromYear).selectFromMonth(fromMonth)
				.selectToYear(toYear).selectToMonth(toMonth).clickonViewButton().verifyErroronPage();
	}

	@DataProvider(name = "ViewStatement")
	public Object[][] getDataforViewStatement() {
		return DataInputProvider.getSheet("Service", "ViewStatement");
	}

	@Test(dataProvider = "Logout", enabled = true, priority = 34)
	public void Logout(String Remarks) throws FileNotFoundException, IOException, InterruptedException {
		new ServicePage().clickonCallClose(Remarks).Logout().quitBrowser();

	}

	@DataProvider(name = "Logout")
	public Object[][] Logout() {
		return DataInputProvider.getSheet("Service", "Logout");
	}

}

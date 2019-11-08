package cms.tcases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import cms.pages.HomePage;
import cms.pages.KitToKit;
import cms.pages.Login;
import cms.util.DataInputProvider;
import cms.util.ReportUtil;

@Listeners({ ATUReportsListener.class, ConfigurationListener.class, MethodListener.class })
public class KitToKit_tc {
	{
		ReportUtil.reports();
	}

	@Test(dataProvider = "KitToKit1", enabled = true, priority = 35)
	public void kittokitpage1(String ename, String edata1, String edata2, String edata3, String edata4, String edata5,
			String edata6, String edata7, String edata8, String edata9, String edata10, String edata11,
			String PageHeading, String proceed, String scenario, String CardNo, String Status, String Reason,
			String NewCardNo, String proceed1) throws FileNotFoundException, IOException, InterruptedException {

		new Login().launchBrowser().enterLoginCredentials()
				.searchelement(ename, edata1, edata2, edata3, edata4, edata5, edata6, edata7, edata8, edata9, edata10,
						edata11)
				.clickSearchtab().Proceed().ClickOnCheckBox().createCall().kitToKitTab()
				.verifyfielsdsinPage(PageHeading, proceed).ClickOnRadioBtn(scenario).ClickOnProceed()
				.verifyfielsdsinNewPage(CardNo, Status, Reason, NewCardNo, proceed1);
		// .ClickOnCheckBox().verifyfielsdsinPage2(Remark, Update);
	}

	@Test(dataProvider = "KitToKit2", enabled = true, priority = 36)
	public void kittokit1(String NewCardNo) throws FileNotFoundException, IOException, InterruptedException {

		new KitToKit().enterNewCardNo1(NewCardNo).ClickOnProceedbtn().resultMessage(NewCardNo);
	}

	@Test(dataProvider = "KitToKit3", enabled = true, priority = 37)
	public void kittokit2(String scenario, String NewCardNo, String ResultHeading, String message, String CardNum, String Status1,
			String Backbtn) throws FileNotFoundException, IOException, InterruptedException {

		new HomePage().kitToKitTab().ClickOnRadioBtn(scenario).ClickOnProceed().enterNewCardNo(NewCardNo).ClickOnProceedbtn().verifyfielsdsinresultPage(ResultHeading, message,
				CardNum, Status1, Backbtn);
	}

	@Test(enabled = true, priority = 38)
	public void callClose() throws FileNotFoundException, IOException, InterruptedException {

		new KitToKit().callClose().Logout().quitBrowser();

	}

	@DataProvider(name = "KitToKit1")
	public Object[][] getData1() {
		System.out.println("Entry into data provider");
		return DataInputProvider.getSheet("CSR_DATA", "KitToKitPage");

	}

	@DataProvider(name = "KitToKit2")
	public Object[][] getData2() {
		System.out.println("Entry into data provider");
		return DataInputProvider.getSheet("CSR_DATA", "KitToKit1");

	}

	@DataProvider(name = "KitToKit3")
	public Object[][] getData3() {
		System.out.println("Entry into data provider");
		return DataInputProvider.getSheet("CSR_DATA", "KitToKit2");

	}
}

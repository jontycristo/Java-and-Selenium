package cms.tcases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import cms.pages.FeePlan;
import cms.pages.Login;
import cms.util.DataInputProvider;
import cms.util.ReportUtil;

@Listeners({ ATUReportsListener.class, ConfigurationListener.class, MethodListener.class })
public class FeePlan_tc {
	{
		ReportUtil.reports();
	}

	@Test(dataProvider = "ViewFeePlan", enabled = true, priority = 27)
	public void viewfeeplan(String ename, String edata1, String edata2, String edata3, String edata4, String edata5,
			String edata6, String edata7, String edata8, String edata9, String edata10, String edata11,
			String PageHeading, String EditFeePlan, String CardNo, String FeePlan, String EffectiveDate,
			String ViewFeePlanDtl) throws FileNotFoundException, IOException, InterruptedException {

		new Login().launchBrowser().enterLoginCredentials3()
				.searchelement(ename, edata1, edata2, edata3, edata4, edata5, edata6, edata7, edata8, edata9, edata10,
						edata11)
				.clickSearchtab().Proceed().ClickOnCheckBox().createCall().feePlanTab()
				.verifyfielsdsinPage1(PageHeading, EditFeePlan, CardNo, FeePlan, EffectiveDate, ViewFeePlanDtl);
		// .callClose().Logout().quitBrowser();
	}

	@Test(dataProvider = "EditFeePlan", enabled = true, priority = 28)
	public void editfeeplan(String NewFeePlan, String remark1)
			throws FileNotFoundException, IOException, InterruptedException {

		new FeePlan().ClickOnCheckBox().selectFeePlan(NewFeePlan).enterRemark(remark1).clickOnUpdateBtn()
				.resultMessage(NewFeePlan);
		// .callClose().Logout().quitBrowser();

	}

	@Test(enabled = true, priority = 29)
	public void callClose() throws FileNotFoundException, IOException, InterruptedException {

		new FeePlan().callClose().Logout().quitBrowser();

	}

	@DataProvider(name = "EditFeePlan")
	public Object[][] getData1() {
		System.out.println("Entry into data provider");
		return DataInputProvider.getSheet("CSR_DATA", "EditFeePlan");

	}

	@DataProvider(name = "ViewFeePlan")
	public Object[][] getData2() {
		System.out.println("Entry into data provider");
		return DataInputProvider.getSheet("CSR_DATA", "ViewFeePlan");

	}

}

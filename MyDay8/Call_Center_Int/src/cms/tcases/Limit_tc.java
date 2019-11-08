package cms.tcases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import cms.pages.Login;
import cms.util.DataInputProvider;
import cms.util.ReportUtil;

@Listeners({ ATUReportsListener.class, ConfigurationListener.class, MethodListener.class })
public class Limit_tc {
	{
		ReportUtil.reports();
	}

	// Test Case No: TC_CSR Automation_053 to TC_CSR Automation_058
	@Test(dataProvider = "Limit", enabled = true, priority =30)
	public void Limits(String ename, String edata1, String edata2, String edata3, String edata4, String edata5,
			String edata6, String edata7, String edata8, String edata9, String edata10, String edata11, String Menu,
			String PageHeading, String LimitHeading, String GroupName, String MinAmt, String MaxAmt, String DailyAmt,
			String WeeklyAmt, String MonthlyAmt, String YearlyAmt, String DailyCount, String WeeklyCount,
			String MonthlyCount, String YearlyCount, String Limit, String LimitDetailsPageHeading,
			String LimitDetailsHeading, String Source, String Transaction, String Remarks)
			throws FileNotFoundException, IOException, InterruptedException {
		new Login().launchBrowser().enterLoginCredentials4()
				.searchelement(ename, edata1, edata2, edata3, edata4, edata5, edata6, edata7, edata8, edata9, edata10,
						edata11)
				.clickSearchtab().Proceed().ClickOnCheckBox().createCall().clickLimit(Menu)
				.verifyPageHeading(PageHeading)
				.verifyLimitDetails(GroupName, MinAmt, MaxAmt, DailyAmt, WeeklyAmt, MonthlyAmt, YearlyAmt, DailyCount,
						WeeklyCount, MonthlyCount, YearlyCount)
				.clickonLimit(Limit).switchtonewWindow().verifyLimitDetailsPageHeading(LimitDetailsPageHeading)
				.verifyLimitDetailsHeading(LimitDetailsHeading).verifyTextonPage(Source, Transaction)
				.verifyButtonsinPage().clickonClose().switchtolastWindow().clickonCallClose(Remarks).Logout()
				.quitBrowser();

	}

	@DataProvider(name = "Limit")
	public Object[][] getDataforEdit() {
		return DataInputProvider.getSheet("Limit", "Limit");
	}

}

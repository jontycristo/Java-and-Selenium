package cms.tcases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import cms.pages.Login;
import cms.pages.MySetUpage;
import cms.pages.Welcome;
import cms.util.DataInputProvider;
import cms.util.ReportUtil;

@Listeners({ ATUReportsListener.class, ConfigurationListener.class, MethodListener.class })
public class MySetUp_tc {
	{
		ReportUtil.reports();
	}

	@Test(dataProvider = "ViewMySetUp", priority =41)
	public void viewMySetUp(String MySetUp, String PageHeader, String PSdet, String UID, String DOB, String FDate,
			String TDate, String Profdet, String UName, String Grp, String Udet, String ChPass, String EditDet1,
			String EditDet2, String FSecQue, String SSecQue, String EAddr, String FSecAns, String SSecAns,
			String OldPass, String NewPass, String ConfPass) throws FileNotFoundException, IOException {

		new Login().launchBrowser().enterLoginCredentials().clickMySetup(MySetUp).verifyMainPageHeading(PageHeader)
				.verifyTextinPage(PSdet, UID, DOB, FDate, TDate, Profdet, UName, Grp, Udet, ChPass)
				.verifyCheckBoxinpage(EditDet1, EditDet2).verifyDropDowninpage(FSecQue, SSecQue)
				.verifyTextBoxinpage(EAddr, FSecAns, SSecAns, OldPass, NewPass, ConfPass);


	}

	@Test(dataProvider = "MySetUp", priority = 42)
	public void MySetUp( String EditDet1, String EmailAddr, String FSecQues, String FSecAns1,
			String SSecQues, String SSecAns1,String EditDet2, String OldPassword, String NewPassword, String ConfPassword,
			String update) throws FileNotFoundException, IOException, InterruptedException {

		new MySetUpage().enterTextByXpath(EditDet1, EmailAddr, FSecQues, FSecAns1, SSecQues, SSecAns1, EditDet2, OldPassword,
						NewPassword, ConfPassword).clickButton(update);
			
	}
	@Test(enabled = true, priority = 43)
	public void logout() throws FileNotFoundException, IOException, InterruptedException {

		new Welcome().Logout().quitBrowser();

	}

	@DataProvider(name = "MySetUp")
	public Object[][] getData1() {
		return DataInputProvider.getSheet("CSR_DATA", "MySetUp");
	}

	@DataProvider(name = "ViewMySetUp")
	public Object[][] getData2() {
		return DataInputProvider.getSheet("CSR_DATA", "ViewMySetUp");
	}

}

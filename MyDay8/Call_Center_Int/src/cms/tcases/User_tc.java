package cms.tcases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import cms.pages.Login;
import cms.pages.User;
import cms.pages.Welcome;
import cms.util.DataInputProvider;
import cms.util.ReportUtil;

@Listeners({ ATUReportsListener.class, ConfigurationListener.class, MethodListener.class })
public class User_tc {
	{
		ReportUtil.reports();
	}

	@Test(dataProvider = "Verify_UserPage1", priority = 8)
	public void verify_userpage1(String usertab, String PageHeader, String Createnewlink, String Userid,
			String Username, String status, String search, String Userid1, String Username1, String status1,
			String group, String Eaddr, String VFDate, String VTDate, String MobNo, String DispSensData, String edit,
			String resetsession) throws FileNotFoundException, IOException, InterruptedException {

		new Login().launchBrowser().enterLoginCredentials3().clickUser(usertab).verifyMainPageHeading(PageHeader)
				.verifyTextinPage1(Createnewlink, Userid, Username, status, search, Userid1, Username1, status1, group,
						Eaddr, VFDate, VTDate, MobNo, DispSensData, edit, resetsession);
	}

	@DataProvider(name = "Verify_UserPage1")
	public Object[][] getData1() {
		System.out.println("Entry into data provider");
		return DataInputProvider.getSheet("CSR_DATA", "Verify_User1");

	}

	@Test(dataProvider = "Verify_UserPage2", priority = 9)
	public void verify_userpage2(String userlink, String UPdet, String coninfo,
			String UProfdet, String UserAuth, String UID, String UName, String MobNo, String EAddr, String VFDate,
			String VTDate, String Grp, String DispSensData, String yes, String no, String back, String submit,
			String clear) throws FileNotFoundException, IOException, InterruptedException {

		new User().CreateUser(userlink).verifyTextinPage2(UPdet, coninfo, UProfdet, UserAuth, UID, UName, MobNo, EAddr,
						VFDate, VTDate, Grp, DispSensData, yes, no)
				.verifyButtonByXpath(back, submit, clear);
	}

	@DataProvider(name = "Verify_UserPage2")
	public Object[][] getData2() {
		System.out.println("Entry into data provider");
		return DataInputProvider.getSheet("CSR_DATA", "Verify_User2");

	}

	@Test(dataProvider = "Add_User", priority = 10)
	public void add_user(String userid, String username, String mobnum,
			String emailaddr, String group, String radiobtn, String btn)
			throws FileNotFoundException, IOException, InterruptedException {

		new User().enterTextByXpath(userid, username, mobnum, emailaddr, group).clickradioButtonByXpath(radiobtn)
				.clickButtonByXpath(btn).resultMessage(userid);
	}

	@DataProvider(name = "Add_User")
	public Object[][] getData3() {
		System.out.println("Entry into data provider");
		return DataInputProvider.getSheet("CSR_DATA", "Add_User");

	}

	@Test(dataProvider = "Search_User", priority = 11)
	public void search_user(String usertab, String userid, String username, String status, String status1,String status2,String status3,String status4 )
			throws FileNotFoundException, IOException, InterruptedException {

		new Welcome().clickUser(usertab)
				.enterTexttosearchByXpath(userid, username).selectstatustosearch(status, status1, status2, status3, status4).clickOnSearchBtn()
				.resultsearchMessage(userid);
	}

	@DataProvider(name = "Search_User")
	public Object[][] getData4() {
		System.out.println("Entry into data provider");
		return DataInputProvider.getSheet("CSR_DATA", "Search_User");

	}
	
	@Test(enabled = true, priority = 12)
	public void logout() throws FileNotFoundException, IOException, InterruptedException {

		new Welcome().Logout().quitBrowser();

	}
}

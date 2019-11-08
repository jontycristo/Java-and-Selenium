package cms.tcases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import cms.pages.Group;
import cms.pages.Login;
import cms.pages.Welcome;
import cms.util.DataInputProvider;
import cms.util.ReportUtil;

@Listeners({ ATUReportsListener.class, ConfigurationListener.class, MethodListener.class })
public class Group_tc {

	{
		ReportUtil.reports();
	}

	@Test(dataProvider = "ViewGroup", priority = 2)
	public void viewGroup(String Group, String Mhead, String GrpName, String status, String active, String Inactive,
			String all, String role, String Alldrp, String search, String crtnewgrp, String Usergrpresult, String grpr,
			String attroler, String statusr, String ownnmr, String nouserr, String lognintr, String viewbinr,
			String editbinr) throws FileNotFoundException, IOException, InterruptedException {
		System.out.println("Login into setup");

		System.out.println("Before creating obj");
		new Login().launchBrowser().enterLoginCredentials1().clickGrouptab(Group).verifyMainPageHeading(Mhead)
				.verifyGrpPageField(GrpName, status, active, Inactive, all, role, Alldrp, search, crtnewgrp,
						Usergrpresult, grpr, attroler, statusr, ownnmr, nouserr, lognintr, viewbinr, editbinr);
	}

	@DataProvider(name = "ViewGroup")
	public Object[][] getData1() {
		System.out.println("Entry into data provider");
		return DataInputProvider.getSheet("Group", "ViewGroup");

	}

	@Test(dataProvider = "viewNewGroup", priority = 3)
	public void viewNewGroup(String crtnewgrplink, String NGrpNametxt, String LPCI, String Srole, String Sowner,
			String SProdName, String backtxt, String submittxt, String cleartxt)
			throws FileNotFoundException, IOException, InterruptedException {
		new Group().clickCrtnewgrp(crtnewgrplink).verifyNewGrpPageField(NGrpNametxt, LPCI, Srole, Sowner, SProdName,
				backtxt, submittxt, cleartxt);
	}

	@DataProvider(name = "viewNewGroup")
	public Object[][] getData2() {
		System.out.println("Entry into data provider");
		return DataInputProvider.getSheet("Group", "viewNewGroup");
	}

	@Test(dataProvider = "addNewGroup", priority = 4)
	public void group(String Alert1, String Alert2, String btnval1, String Name, String Role, String owner,
			String ProdNam, String add, String btnval) throws FileNotFoundException, IOException, InterruptedException {
		new Group().clickSubmit(btnval1).verifyNGAlert1(Alert1).enterGrpName(Name).clickSubmit(btnval1)
				.verifyNGAlert2(Alert2).enterGrpName(Name).selectRole(Role).selectOwner(owner).selectProdNm(ProdNam)
				.clickAdd(add).clickSubmit(btnval);
	}

	@DataProvider(name = "addNewGroup")
	public Object[][] getData3() {
		System.out.println("Entry into data provider");
		return DataInputProvider.getSheet("Group", "addNewGroup");
	}

	@Test(dataProvider = "searchNewGroup", priority = 5)
	public void searchNewGroup(String Group, String Name)
			throws FileNotFoundException, IOException, InterruptedException {
		new Welcome().clickGrouptab(Group).enterGrpNforsearch(Name).clickSearch();
	}

	@DataProvider(name = "searchNewGroup")
	public Object[][] getData4() {
		System.out.println("Entry into data provider");
		return DataInputProvider.getSheet("Group", "searchNewGroup");
	}

	@Test(dataProvider = "verifyAlert", priority = 6)
	public void verifyAlert(String Group, String crtnewgrplink, String SName, String Role, String owner, String ProdNam,
			String add, String btnval, String alert) throws FileNotFoundException, IOException, InterruptedException {

		// To verify alert message for duplicate group
		new Welcome().clickGrouptab(Group).clickCrtnewgrp(crtnewgrplink)
				// .verifyNewGrpPageField(NGrpNametxt,LPCI,Srole,Sowner,SProdName,backtxt,submittxt,cleartxt)
				.enterGrpName(SName).selectRole(Role).selectOwner(owner).selectProdNm(ProdNam).clickAdd(add)
				.clickSubmit(btnval).verifyAlert(alert);
	}

	@DataProvider(name = "verifyAlert")
	public Object[][] getData5() {
		System.out.println("Entry into data provider");
		return DataInputProvider.getSheet("Group", "verifyAlert");
	}

	@Test(enabled = true, priority = 7)
	public void logout() throws FileNotFoundException, IOException, InterruptedException {

		new Welcome().Logout().quitBrowser();

	}
}

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
public class Login_tc {

	{
		ReportUtil.reports();
	}

	@Test(dataProvider = "login", priority = 1)
	public void login(String PageHeader, String Card, String Acct, String FName, String LName, String DOB, String EAddr,
			String IDNO, String OnlineID, String CellPNO, String PassNO, String ProxyNO, String Search, String Group,
			String User, String RRN_Search, String Home, String MySetUp, String Logout)
			throws FileNotFoundException, IOException {

		new Login().launchBrowser().enterLoginCredentials2().verifyMainPageHeading(PageHeader)
				.verifySearchBoxinPage(Card, Acct, FName, LName, DOB, EAddr, IDNO, OnlineID, CellPNO, PassNO, ProxyNO)
				.verifyButtonsinPage(Search, Group, User, RRN_Search).verifyLinksinPage(Home, MySetUp).Logout()
				.quitBrowser();

	}

	@DataProvider(name = "login")
	public Object[][] getData1() {
		System.out.println("Entry into data provider");
		return DataInputProvider.getSheet("CSR_DATA", "Login");
	}

}

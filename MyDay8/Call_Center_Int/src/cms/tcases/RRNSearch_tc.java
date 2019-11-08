package cms.tcases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import cms.pages.Login;
import cms.pages.RRNSearch;
import cms.pages.Welcome;
import cms.util.DataInputProvider;
import cms.util.ReportUtil;

@Listeners({ ATUReportsListener.class, ConfigurationListener.class, MethodListener.class })
public class RRNSearch_tc {

	{
		ReportUtil.reports();
	}

	@Test(dataProvider = "RRNScreenVerify", priority = 13)
	public void rrnScreenVerify(String Mhead, String RRNtxt, String DelChanltxt, String TxnDtxt, String Prodtxt,
			String prodcattxt, String Searchtxt, String CustSearchText, String NRF)
			throws FileNotFoundException, IOException, InterruptedException {
		new Login().launchBrowser().enterLoginCredentials4().clickRRNSearchtab().verifyMainPageHeading(Mhead)
				.verifyRRNSearchField(RRNtxt, DelChanltxt, TxnDtxt, Prodtxt, prodcattxt, Searchtxt, CustSearchText, NRF);

	}

	@DataProvider(name = "RRNScreenVerify")
	public Object[][] getData1() {
		System.out.println("Entry into data provider");
		return DataInputProvider.getSheet("RRNSearch", "RRNScreenVerify");

	}

	@Test(dataProvider = "RRNSearch", priority = 14)
	public void rrnSearch(String Alert1, String Alert2, String Alert3, String Alert4, String Alert5, String RRN,
			String chnl, String date, String Prod, String Prodcat, String RRNcust, String CardNo, String ProxyNo,
			String CardStat, String TxnDesc, String Delchnl, String Txnamt, String Txnccy, String Billamt,
			String Billccy, String Feeamt, String srvtax, String suramt, String cesamt, String resmsg, String Cardlink)
			throws FileNotFoundException, IOException, InterruptedException {
		new RRNSearch().clickSearch().verifyAlert(Alert1, Alert2, Alert3, Alert4, Alert5).enterRRN(RRN).selectDelChnl(chnl)
				.selectTxnDate(date).selectProd(Prod).selectProdCat(Prodcat).clickSearch()
				.verifyCustSearchField(RRNcust, CardNo, ProxyNo, CardStat, TxnDesc, Delchnl, Txnamt, Txnccy, Billamt,
						Billccy, Feeamt, srvtax, suramt, cesamt, resmsg);
			//	.verifyCardNolink(Cardlink);

	}

	@DataProvider(name = "RRNSearch")
	public Object[][] getData2() {
		System.out.println("Entry into data provider");
		return DataInputProvider.getSheet("RRNSearch", "RRNSearch");

	}
	@Test(enabled = true, priority = 15)
	public void logout() throws FileNotFoundException, IOException, InterruptedException {

		new Welcome().Logout().quitBrowser();

	}

}

package cms.tcases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import cms.pages.Card_Status;
import cms.pages.Login;
import cms.util.DataInputProvider;
import cms.util.ReportUtil;

@Listeners({ ATUReportsListener.class, ConfigurationListener.class, MethodListener.class })
public class Card_Status_tc {
	{
		ReportUtil.reports();
	}
	@Test(dataProvider = "Card_Status_Screenverify",priority=22)
	public void screenVerify(String ename, String edata1, String edata2, String edata3, String edata4, String edata5,
			String edata6, String edata7, String edata8, String edata9, String edata10, String edata11,String Mhead,
			String CardNo,String CurrCardStat,String ApplStat,String ChngCardStatto,String Remark,String ChngCardStatB
			)
					throws FileNotFoundException, IOException, InterruptedException {

		new Login()
		.launchBrowser()
		.enterLoginCredentials2()
		.searchelement(ename, edata1, edata2, edata3, edata4, edata5, edata6, edata7, edata8, edata9, edata10,edata11)
		.clickSearchtab()
		.Proceed()
		.ClickOnCheckBox()
		.createCall()
		.clickCardStatus()
		.verifyMainPageHeading(Mhead)
		.verifyGrpPageField(CardNo, CurrCardStat, ApplStat, ChngCardStatto, Remark, ChngCardStatB);
		
	}
	
	@DataProvider(name = "Card_Status_Screenverify")
	public Object[][] getData1() {
		System.out.println("Entry into data provider");
		return DataInputProvider.getSheet("CSR_DATA_1", "Card_Status_Screenverify");
		
	}
	@Test(dataProvider = "Card_Status_Change",priority=23)
	public void card_Status_Change(String from,String to,String btnval,String remark)
					throws FileNotFoundException, IOException, InterruptedException {

		new Card_Status()
		.clickVerify(from,to,btnval,remark)
		.verifyResult();
		
	}
	@DataProvider(name = "Card_Status_Change")
	public Object[][] getData2() {
		System.out.println("Entry into data provider");
		return DataInputProvider.getSheet("CSR_DATA_1", "Card_Status_Change");
		
	}
	@Test(dataProvider = "Activate",priority=24)
	public void activate(String from,String to,String btnval,String remark)
					throws FileNotFoundException, IOException, InterruptedException {

		new Card_Status().clickVerify(from,to,btnval,remark)
		.verifyResult();
		}
	
	@DataProvider(name = "Activate")
	public Object[][] getData3() {
		System.out.println("Entry into data provider");
		return DataInputProvider.getSheet("CSR_DATA_1", "Activate");
		
	}
	@Test(dataProvider = "Card_Status_Change1",priority=25)
	public void card_Status_Change1(String from,String to,String btnval,String remark)
			throws FileNotFoundException, IOException, InterruptedException {

		new Card_Status().clickVerify(from,to,btnval,remark)
		.verifyResult();
		
	}
	@DataProvider(name = "Card_Status_Change1")
	public Object[][] getData4() {
		System.out.println("Entry into data provider");
		return DataInputProvider.getSheet("CSR_DATA_1", "Card_Status_Change1");
		
	}
	@Test(enabled = true, priority = 26)
	public void callClose() throws FileNotFoundException, IOException, InterruptedException {

		new Card_Status().callClose().Logout().quitBrowser();

	}
	
}

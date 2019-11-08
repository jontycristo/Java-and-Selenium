package cms.tcases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import cms.pages.Comments;
import cms.pages.Login;
import cms.util.DataInputProvider;
import cms.util.ReportUtil;

@Listeners({ ATUReportsListener.class, ConfigurationListener.class, MethodListener.class })

public class Comments_tc{
	{
		ReportUtil.reports();
	}
	@Test(dataProvider = "Comments",enabled=true,priority=39)
	public void comments(String ename, String edata1, String edata2, String edata3, String edata4, String edata5,
			String edata6, String edata7, String edata8, String edata9, String edata10,String edata11,String Mhead,String CardNo,String Source,String CallID,String CallType,String DateTime,String UserID,
			String UserName,String Comments)throws FileNotFoundException, IOException, InterruptedException{
		new Login()
		.launchBrowser()
		.enterLoginCredentials2()
		.searchelement(ename, edata1, edata2, edata3, edata4, edata5, edata6, edata7, edata8, edata9, edata10,edata11)
		.clickSearchtab()
		.Proceed()
		.ClickOnCheckBox()
		.createCall()
		.clickComments()
		.verifyMainPageHeading(Mhead)
		.verifyCommentPageField(CardNo,Source,CallID,CallType,DateTime,UserID,UserName,Comments );
	
	}
	@DataProvider(name = "Comments")
	public Object[][] getData2() {
		System.out.println("Entry into data provider");
		return DataInputProvider.getSheet("Comments", "Comments");		
}
	@Test(enabled=true,priority=40)
	public void verifyLink()throws FileNotFoundException, IOException, InterruptedException{
		new Comments().verifyNextLink()
		.verifyPreviousLink()
		.verifyLastLink()
		.verifyFirstLink()
		.callClose()
		.Logout().quitBrowser();
		
	}
}
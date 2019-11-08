package cms.pages;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



//import com.fss.cms.pages.UserPage;


public class LimitPage extends CMSPage {
	Properties prop;

	public  LimitPage(){
		try {
			prop = loadObjectRepository("properties\\LimitPage.properties");
			
		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}
	}
	

	
	
	public LimitPage verifyPageHeading(String PageHeading){
		try {
			verifyTextByXpathBase(prop.getProperty("LimitPage.PageHeading.Xpath"),PageHeading);
				} catch (Exception e) {
			e.printStackTrace();
		}
				return this;
	}
	
	
	public LimitPage verifyLimitHeading(String LimitHeading){
		try {
			verifyTextByXpathBase(prop.getProperty("LimitPage.LimitHeading.Xpath"),LimitHeading);
				} catch (Exception e) {
			e.printStackTrace();
		}
				return this;
	}
	
	
	
	public LimitPage verifyLimitDetails(String GroupName,String MinAmt,String MaxAmt,String DailyAmt,String WeeklyAmt,String MonthlyAmt,String YearlyAmt,String DailyCount,String WeeklyCount,String MonthlyCount,String YearlyCount ){
		try {
			verifyTextByXpathBase(prop.getProperty("LimitPage.GroupName.Xpath"), GroupName);
			verifyTextByXpathBase(prop.getProperty("LimitPage.MinAmt.Xpath"), MinAmt);
			verifyTextByXpathBase(prop.getProperty("LimitPage.MaxAmt.Xpath"), MaxAmt);
			verifyTextByXpathBase(prop.getProperty("LimitPage.DailyAmt.Xpath"), DailyAmt);
			verifyTextByXpathBase(prop.getProperty("LimitPage.WeeklyAmt.Xpath"), WeeklyAmt);
			verifyTextByXpathBase(prop.getProperty("LimitPage.MonthlyAmt.Xpath"), MonthlyAmt);
			verifyTextByXpathBase(prop.getProperty("LimitPage.YearlyAmt.Xpath"), YearlyAmt);
			verifyTextByXpathBase(prop.getProperty("LimitPage.DailyCount.Xpath"), DailyCount);
			verifyTextByXpathBase(prop.getProperty("LimitPage.WeeklyCount.Xpath"), WeeklyCount);
			verifyTextByXpathBase(prop.getProperty("LimitPage.MonthlyCount.Xpath"), MonthlyCount);
			verifyTextByXpathBase(prop.getProperty("LimitPage.YearlyCount.Xpath"), YearlyCount);

				} catch (Exception e) {
			e.printStackTrace();
		}
				return  this;
	}
	
	public LimitDetailsPage clickonLimit(String Limit){
		try {
			
			clickButtonByXpath(prop.getProperty("LimitPage.GrpName.Xpath"),Limit);
				} catch (Exception e) {
			e.printStackTrace();
		}
				return  new LimitDetailsPage();
	}
	
	public LimitPage switchtolastWindow(){
		try {
			switchToFirstWindow();
				} catch (Exception e) {
			e.printStackTrace();
		}
				return this;
	}
	
	public Welcome clickonCallClose(String Remarks){
		try {
			enterTextByXpathBase(prop.getProperty("LimitPage.Remarks.Xpath"), Remarks);
			clickButtonByXpath(prop.getProperty("LimitPage.CallCloseButton.Xpath"), prop.getProperty("LimitPage.CallCloseButton.Value"));
				} catch (Exception e) {
			e.printStackTrace();
		}
				return  new Welcome();
	}
	

}
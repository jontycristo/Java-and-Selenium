package cms.pages;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.log4testng.Logger;

public class Comments extends BasePage{
	Properties prop;
	Logger logger = Logger.getLogger("CSRLogs");
	public  Comments(){
		try {
			prop = loadObjectRepository("properties\\Comments.properties");
		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}
	}



	public Comments verifyMainPageHeading(String data) {
		try {
			Thread.sleep(2000);
			IsElementsDisplayedByXpath(prop.getProperty("Comments.MainHeading.Xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	public Comments verifyCommentPageField(String CardNo,String Source,String CallID,String CallType,String DateTime,String UserID,
			String UserName,String Comments )
	{
		try {
			Thread.sleep(2000);
			IsElementsDisplayedByXpath(prop.getProperty("Comments.CardNo.Xpath"), CardNo);
			IsElementsDisplayedByXpath(prop.getProperty("Comments.Source.Xpath"), Source);
			IsElementsDisplayedByXpath(prop.getProperty("Comments.CallID.Xpath"), CallID);
			IsElementsDisplayedByXpath(prop.getProperty("Comments.CallType.Xpath"),CallType);
			IsElementsDisplayedByXpath(prop.getProperty("Comments.DateTime.Xpath"), DateTime);	
			IsElementsDisplayedByXpath(prop.getProperty("Comments.UserID.Xpath"), UserID);
			IsElementsDisplayedByXpath(prop.getProperty("Comments.UserName.Xpath"), UserName);
			IsElementsDisplayedByXpath(prop.getProperty("Comments.Comments.Xpath"), Comments);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	public Comments verifyNextLink(){
		try {
			
			clickLinkByLinkText("Next");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	public Comments verifyPreviousLink(){
		try {
			
			clickLinkByLinkText("Prev");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	public Comments verifyLastLink(){
		try {
			
			clickLinkByLinkText("Last");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	public Comments verifyFirstLink(){
		try {
			
			clickLinkByLinkText("First");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	public Welcome callClose() {
		try {
			enterTextByXpathBase(prop.getProperty("Comments.Comment.Xpath"), "close the call please");
			Thread.sleep(1000);
			clickButtonByXpath(prop.getProperty("Comments.CallClose.Xpath"),"Call Close");
				} catch (Exception e) {
			e.printStackTrace();
		}
				return new Welcome();
	}
}

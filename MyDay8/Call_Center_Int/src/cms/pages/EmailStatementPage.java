package cms.pages;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



//import com.fss.cms.pages.UserPage;


public class EmailStatementPage extends CMSPage {
	Properties prop;

	public  EmailStatementPage(){
		try {
			prop = loadObjectRepository("properties\\EmailStatement.properties");
			
		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}
	}
	
	public ServicePage verifySuccessonPage(){
		try {
			IsElementsDisplayedByXpath(prop.getProperty("EmailStatementPage.EmailStatement.Xpath"),prop.getProperty("EmailStatementPage.EmailStatement.Value"));
	} catch (Exception e) {
			e.printStackTrace();
		}
				return new ServicePage();
	}
	


	public ServicePage verifyErroronPage(){
		try {
			ErrorMsg(prop.getProperty("EmailStatementPage.ToMonthError.Xpath"));
	} catch (Exception e) {
			e.printStackTrace();
		}
				return new ServicePage();
	}

	
}
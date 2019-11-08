package cms.pages;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//import com.fss.cms.pages.UserPage;

public class LimitDetailsPage extends CMSPage {
	Properties prop;

	public LimitDetailsPage() {
		try {
			prop = loadObjectRepository("properties\\LimitDetailsPage.properties");

		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}
	}

	public LimitDetailsPage switchtonewWindow() {
		try {
			switchToLastWindow();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public LimitDetailsPage switchtolastWindow() {
		try {
			switchToFirstWindow();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public LimitDetailsPage verifyLimitDetailsPageHeading(String LimitDetailsPageHeading) {
		try {
			verifyTextByXpathBase(prop.getProperty("LimitDetailsPage.PageHeading.Xpath"), LimitDetailsPageHeading);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public LimitDetailsPage verifyLimitDetailsHeading(String LimitDetailsHeading) {
		try {
			verifyTextByXpathBase(prop.getProperty("LimitDetailsPage.LimitHeading.Xpath"), LimitDetailsHeading);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public LimitDetailsPage verifyButtonsinPage() {
		try {
			IsElementsDisplayedByXpath(prop.getProperty("LimitDetailsPage.Button.Xpath"),
					prop.getProperty("LimitDetailsPage.Button.Value"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public LimitDetailsPage verifyTextonPage(String Source, String Transaction) {
		try {

			IsElementsDisplayedByXpath(prop.getProperty("LimitDetailsPage.Source.Xpath"), Source);
			IsElementsDisplayedByXpath(prop.getProperty("LimitDetailsPage.Transaction.Xpath"), Transaction);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public LimitPage clickonClose() {
		try {

			clickButtonByXpath(prop.getProperty("LimitDetailsPage.Button.Xpath"),
					prop.getProperty("LimitDetailsPage.Button.Value"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new LimitPage();
	}

}
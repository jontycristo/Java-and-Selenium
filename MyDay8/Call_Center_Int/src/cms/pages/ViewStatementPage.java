package cms.pages;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//import com.fss.cms.pages.UserPage;

public class ViewStatementPage extends CMSPage {
	Properties prop;

	public ViewStatementPage() {
		try {
			prop = loadObjectRepository("properties\\ViewStatement.properties");

		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}
	}

	public ViewStatementPage verifyPageHeading1(String PageHeading1) {
		try {
			System.out.println("1");
			verifyTextByXpathBase(prop.getProperty("ViewStatementPage.PageHeading1.Xpath"), PageHeading1);
			System.out.println("2");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public ViewStatementPage verifyHeading(String Heading) {
		try {
			verifyTextByXpathBase(prop.getProperty("ViewStatementPage.Heading.Xpath"), Heading);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public ViewStatementPage verifyTextinPage(String Card, String SrNo, String TranDate, String Invoice,
			String TranDesc, String TranCurr, String TranAmt, String BillingCurr, String BillingAmt, String CRrDrFlag) {
		try {
			IsElementsDisplayedByXpath(prop.getProperty("ViewStatementPage.Card.Xpath"), Card);
			IsElementsDisplayedByXpath(prop.getProperty("ViewStatementPage.SrNo.Xpath"), SrNo);
			IsElementsDisplayedByXpath(prop.getProperty("ViewStatementPage.TranDate.Xpath"), TranDate);
			IsElementsDisplayedByXpath(prop.getProperty("ViewStatementPage.Invoice.Xpath"), Invoice);
			IsElementsDisplayedByXpath(prop.getProperty("ViewStatementPage.TranDesc.Xpath"), TranDesc);
			IsElementsDisplayedByXpath(prop.getProperty("ViewStatementPage.TranCurr.Xpath"), TranCurr);
			IsElementsDisplayedByXpath(prop.getProperty("ViewStatementPage.TranAmt.Xpath"), TranAmt);
			IsElementsDisplayedByXpath(prop.getProperty("ViewStatementPage.BillingCurr.Xpath"), BillingCurr);
			IsElementsDisplayedByXpath(prop.getProperty("ViewStatementPage.BillingAmt.Xpath"), BillingAmt);
			IsElementsDisplayedByXpath(prop.getProperty("ViewStatementPage.CRrDrFlag.Xpath"), CRrDrFlag);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public ViewStatementPage verifyDownloadLinks(String CSV, String Excel, String PDF) {
		try {
			IsElementsDisplayedByXpath(prop.getProperty("ViewStatementPage.CSV.Xpath"), CSV);
			IsElementsDisplayedByXpath(prop.getProperty("ViewStatementPage.Excel.Xpath"), Excel);
			IsElementsDisplayedByXpath(prop.getProperty("ViewStatementPage.PDF.Xpath"), PDF);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public ServicePage clickonBack() {
		try {

			clickByXpath(prop.getProperty("ViewStatementPage.BackButton.Xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ServicePage();
	}

	public ServicePage verifyErroronPage() {
		try {
			ErrorMsg(prop.getProperty("ViewStatementPage.ToMonthError.Xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ServicePage();
	}

	public ServicePage verifyrecordsnotfoundError() {
		try {
			IsElementsDisplayedByXpath(prop.getProperty("ViewStatementPage.NoRecordError.Xpath"),
					prop.getProperty("ViewStatementPage.NoRecordError.Value"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ServicePage();
	}
}
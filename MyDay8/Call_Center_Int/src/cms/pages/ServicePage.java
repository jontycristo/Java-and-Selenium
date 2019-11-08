package cms.pages;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ServicePage extends CMSPage {
	Properties prop;

	public ServicePage() {
		try {
			prop = loadObjectRepository("properties\\ServicePage.properties");

		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}
	}

	public ServicePage verifyPageHeading(String PageHeading) {
		try {
			verifyTextByXpathBase(prop.getProperty("ServicePage.PageHeading.Xpath"), PageHeading);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public ServicePage verifyEnableDropDownonPage(String SelectAccount, String FromYear, String FromMonth,
			String ToYear, String ToMonth) {
		try {
			IsElementsEnabledByXpath(prop.getProperty("ServicePage.SelectAccount.Xpath"), SelectAccount);
			IsElementsEnabledByXpath(prop.getProperty("ServicePage.FromYear.Xpath"), FromYear);
			IsElementsEnabledByXpath(prop.getProperty("ServicePage.FromMonth.Xpath"), FromMonth);
			IsElementsEnabledByXpath(prop.getProperty("ServicePage.ToYear.Xpath"), ToYear);
			IsElementsEnabledByXpath(prop.getProperty("ServicePage.ToMonth.Xpath"), ToMonth);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public ServicePage verifyButtonsinPage(String ViewButton, String EmailButton) {
		try {
			IsElementsDisplayedByXpath(prop.getProperty("ServicePage.ViewButton.Xpath"), ViewButton);
			IsElementsDisplayedByXpath(prop.getProperty("ServicePage.EmailButton.Xpath"), EmailButton);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public ServicePage selectAccount(String selectAccount) {
		try {
			// selectVisibleTextByXpath(prop.getProperty("ServicePage.SelectAccount.Xpath"),selectAccount);
			selectVisibleTextByXpath(prop.getProperty("ServicePage.SelectAccount.Xpath"), selectAccount);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public ServicePage selectFromYear(String FromYear) {
		try {
			selectUsingVisibleTextByXpath(prop.getProperty("ServicePage.FromYear.Xpath"), FromYear);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public ServicePage selectFromMonth(String FromMonth) {
		try {
			selectUsingVisibleTextByXpath(prop.getProperty("ServicePage.FromMonth.Xpath"), FromMonth);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public ServicePage selectToYear(String ToYear) {
		try {
			selectUsingVisibleTextByXpath(prop.getProperty("ServicePage.ToYear.Xpath"), ToYear);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public ServicePage selectToMonth(String ToMonth) {
		try {
			selectUsingVisibleTextByXpath(prop.getProperty("ServicePage.ToMonth.Xpath"), ToMonth);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public ViewStatementPage clickonViewButton() {
		try {
			clickButtonByXpath(prop.getProperty("ServicePage.ViewButton.Xpath"),
					prop.getProperty("ServicePage.ViewButton.Value"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ViewStatementPage();
	}

	public EmailStatementPage clickonEmailButton() {
		try {
			clickButtonByXpath(prop.getProperty("ServicePage.EmailButton.Xpath"),
					prop.getProperty("ServicePage.EmailButton.Value"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new EmailStatementPage();
	}

	public ServicePage verifySuccessonPage() {
		try {
			IsElementsDisplayedByXpath(prop.getProperty("EmailStatementPage.EmailStatement.Xpath"),
					prop.getProperty("EmailStatementPage.EmailStatement.Value"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public ServicePage switchtolastWindow() {
		try {
			switchToFirstWindow();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public Welcome clickonCallClose(String Remarks) {
		try {
			enterTextByXpathBase(prop.getProperty("ServicePage.Remarks.Xpath"), Remarks);
			clickButtonByXpath(prop.getProperty("ServicePage.CallCloseButton.Xpath"),
					prop.getProperty("ServicePage.CallCloseButton.Value"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Welcome();
	}

}
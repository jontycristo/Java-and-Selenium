package cms.pages;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.log4testng.Logger;

public class Group extends BasePage {
	Properties prop;
	Logger logger = Logger.getLogger("CSRLogs");

	public Group() {
		try {
			prop = loadObjectRepository("properties\\Group.properties");
		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}
	}

	public Group verifyMainPageHeading(String data) {
		try {
			Thread.sleep(2000);
			IsElementsDisplayedByXpath(prop.getProperty("Group.MainHeading.Xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public Group verifyGrpPageField(String GrpName, String status, String active, String Inactive, String all,
			String role, String Alldrp, String search, String crtnewgrp, String Usergrpresult, String grpr,
			String attroler, String statusr, String ownnmr, String nouserr, String lognintr, String viewbinr,
			String editbinr) {
		try {
			IsElementsDisplayedByXpath(prop.getProperty("Group.GrpNameText.Xpath"), GrpName);
			IsElementsDisplayedByXpath(prop.getProperty("Group.statusText.Xpath"), status);
			IsElementsDisplayedByXpath(prop.getProperty("Group.activeText.Xpath"), active);
			IsElementsDisplayedByXpath(prop.getProperty("Group.InactiveText.Xpath"), Inactive);
			IsElementsDisplayedByXpath(prop.getProperty("Group.allText.Xpath"), all);
			IsElementsDisplayedByXpath(prop.getProperty("Group.roleText.Xpath"), role);
			IsElementsDisplayedByXpath(prop.getProperty("Group.AlldrpText.Xpath"), Alldrp);
			IsElementsDisplayedByXpath(prop.getProperty("Group.searchText.Xpath"), search);
			IsElementsDisplayedByXpath(prop.getProperty("Group.HeadingR.Xpath"), Usergrpresult);
			IsElementsDisplayedByXpath(prop.getProperty("Group.grpnmR.Xpath"), grpr);
			IsElementsDisplayedByXpath(prop.getProperty("Group.attroleR.Xpath"), attroler);
			IsElementsDisplayedByXpath(prop.getProperty("Group.statusR.Xpath"), statusr);
			IsElementsDisplayedByXpath(prop.getProperty("Group.ownnmR.Xpath"), ownnmr);
			IsElementsDisplayedByXpath(prop.getProperty("Group.nouserR.Xpath"), nouserr);
			IsElementsDisplayedByXpath(prop.getProperty("Group.LPCIR.Xpath"), lognintr);
			IsElementsDisplayedByXpath(prop.getProperty("Group.viewBINR.Xpath"), viewbinr);
			IsElementsDisplayedByXpath(prop.getProperty("Group.EditR.Xpath"), editbinr);

			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return this;
	}

	public Group clickCrtnewgrp(String data) {
		try {
			clickLinkByLinkText(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public Group verifyNewGrpPageField(String NGrpNametxt, String LPCI, String Srole, String Sowner, String SProdName,
			String back, String submit, String clear) {
		try {
			IsElementsDisplayedByXpath(prop.getProperty("Group.NewGrpNameText.Xpath"), NGrpNametxt);
			IsElementsDisplayedByXpath(prop.getProperty("Group.LPCIText.Xpath"), LPCI);
			IsElementsDisplayedByXpath(prop.getProperty("Group.SroleText.Xpath"), Srole);
			IsElementsDisplayedByXpath(prop.getProperty("Group.SownerText.Xpath"), Sowner);
			IsElementsDisplayedByXpath(prop.getProperty("Group.SProdNameText.Xpath"), SProdName);
			IsElementsDisplayedByXpath(prop.getProperty("Group.backText.Xpath"), back);
			IsElementsDisplayedByXpath(prop.getProperty("Group.submitText.Xpath"), submit);
			IsElementsDisplayedByXpath(prop.getProperty("Group.clearText.Xpath"), clear);
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return this;
	}

	public Group verifyNGAlert1(String Alert1) throws InterruptedException {
		IsElementsDisplayedByXpath(prop.getProperty("Group.Alert1.Xpath"), Alert1);
		return this;
	}

	public Group verifyNGAlert2(String Alert2) throws InterruptedException {
		IsElementsDisplayedByXpath(prop.getProperty("Group.Alert2.Xpath"), Alert2);
		return this;
	}

	public Group enterGrpName(String Name) {
		try {
			enterTextByXpathBase(prop.getProperty("Group.NewGrpName.Xpath"), Name);
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public Group selectRole(String Role) {
		try {

			selectUsingVisibleTextByXpath(prop.getProperty("Group.Srole.Xpath"), Role);
			Thread.sleep(1000);
			logger.error("unable to run role");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public Group selectOwner(String owner) {
		try {

			selectUsingVisibleTextByXpath(prop.getProperty("Group.Sowner.Xpath"), owner);
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public Group selectProdNm(String ProdNam) {
		try {

			selectUsingVisibleTextByXpath(prop.getProperty("Group.SProdName.Xpath"), ProdNam);
			Thread.sleep(1000);

		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return this;
	}

	public Group clickAdd(String add) {
		try {
			clickButtonByXpath(prop.getProperty("Group.ForwardButton.Xpath"), add);
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public Group clickSubmit(String btnval) {

		try {
			if (btnval.equalsIgnoreCase("Submit")) {

				clickButtonByXpath(prop.getProperty("Group.submitText.Xpath"), btnval);
			} else if (btnval.equalsIgnoreCase("Clear")) {
				clickButtonByXpath(prop.getProperty("Group.clearText.Xpath"), btnval);
			} else {
				clickButtonByXpath(prop.getProperty("Group.backText.Xpath"), btnval);
			}
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public Group enterGrpNforsearch(String Name) {
		try {
			enterTextByXpathBase(prop.getProperty("Group.Searchgrpnam.Xpath"), Name);
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public Group clickSearch() {
		try {

			clickButtonByXpath(prop.getProperty("Group.searchText.Xpath"), "search");
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public Group clickViewBins(String data) {
		try {
			clickLinkByLinkText(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public Group verifyAlert(String data) {

		try {
			verifyTextByXpathBase(prop.getProperty("Group.Error.Xpath"), data);

			// clickButtonByXpath(prop.getProperty("Group.backText.Xpath"),"Back");
		} catch (Exception e) {

			e.printStackTrace();
		}
		return this;
	}

	public Group verifyGroupAdded(String NameVal) {
		try {
			verifyTextfromTable(prop.getProperty("Group.searchText.Xpath"), prop.getProperty("Group.verfyadd.Xpath"),
					NameVal);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;

	}

	public Group Logout() {
		try {
			Thread.sleep(1000);
			clickByXpath(prop.getProperty("Group.Logoutmenu.Xpath"), "Logout");
			Thread.sleep(1000);
			// clickByLinkText(data);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public void quitBrowser() {
		try {
			closeBrowser();
			logger.debug("The Browser Closed Successfully");
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("The Browser Closing Exception", e);
		}
	}

}

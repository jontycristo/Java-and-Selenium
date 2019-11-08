package cms.pages;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Login extends CMSPage {
	Properties prop;

	public Login() {
		try {
			System.out.println("read prop");
			prop = loadObjectRepository("properties\\Login.properties");

		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundEx : - "+e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("FileNotFoundEx : - "+e.getMessage());
			e.printStackTrace();
		}
	}
	

	public Login launchBrowser() throws FileNotFoundException, IOException {
		try {
		//	driver.manage().deleteAllCookies();
			System.out.println("launch browser");

			if (prop.getProperty("BankName").equalsIgnoreCase("ICICI_PREPAID_CSR")) {
				launchBrowser(prop.getProperty("Browser.Name"), 
						prop.getProperty("Filepath"),
						prop.getProperty("Bulk.CSR.Url"),
						prop.getProperty("Author.Name"), 
						prop.getProperty("Project.Name"));
			} else if (prop.getProperty("BankName").equalsIgnoreCase("ICICI_PREPAID_AGENT")) {
				launchBrowser(prop.getProperty("Browser.Name"), 
						prop.getProperty("Filepath"),
						prop.getProperty("Bulk.CMSIPPB.Url"), 
						prop.getProperty("Author.Name"),
						prop.getProperty("Project.Name"));
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public Welcome enterLoginCredentials() {
		try {
		//	driver.manage().deleteAllCookies();
			if (prop.getProperty("BankName").equalsIgnoreCase("ICICI_PREPAID_CSR")) {
				Login(  prop.getProperty("Bulk.UserID.Xpath"),
						prop.getProperty("Bulk.ICICI_UserID.Value"),
						prop.getProperty("Bulk.Password.Xpath"), 
						prop.getProperty("Bulk.ICICI_Password.Value"),
						// prop.getProperty("Bulk.MakerShortcode.Xpath"),
						// prop.getProperty("Bulk.Dena_MakerShortcode.Value"),
						prop.getProperty("Bulk.Submit.Xpath"), 
						prop.getProperty("Bulk.Submit.Value"));
				// System.out.println(prop.getProperty("Bulk.Dena_MakerUserID.Value"));
			} else if (prop.getProperty("BankName").equalsIgnoreCase("ICICI_PREPAID_AGENT")) {

				Login(// prop.getProperty("Bulk.Login.Id"),
						// prop.getProperty("Bulk.Login.Value"),
						prop.getProperty("Bulk.UserID.Xpath"), prop.getProperty("Bulk.ICICI_UserID.Value"),
						prop.getProperty("Bulk.Password.Xpath"), prop.getProperty("Bulk.ICICI_Password.Value"),
						// prop.getProperty("Bulk.MakerShortcode.Xpath"),
						// prop.getProperty("Bulk.Dena_MakerShortcode.Value"),
						prop.getProperty("Bulk.Submit.Xpath"), prop.getProperty("Bulk.Submit.Value"));
				// System.out.println(prop.getProperty("Bulk.Dena_MakerUserID.Value"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Welcome();

	}
	public Welcome enterLoginCredentials1() {
		try {
		//	driver.manage().deleteAllCookies();
			if (prop.getProperty("BankName").equalsIgnoreCase("ICICI_PREPAID_CSR")) {
				// System.out.println(prop.getProperty("Bulk.Dena_MakerUserID.Value"));
				Login(// prop.getProperty("Bulk.Login.Id"),
						// prop.getProperty("Bulk.Login.Value"),
						prop.getProperty("Bulk.UserID.Xpath"),
						prop.getProperty("Bulk.ICICI_UserID1.Value"),
						prop.getProperty("Bulk.Password.Xpath"), 
						prop.getProperty("Bulk.ICICI_Password1.Value"),
						// prop.getProperty("Bulk.MakerShortcode.Xpath"),
						// prop.getProperty("Bulk.Dena_MakerShortcode.Value"),
						prop.getProperty("Bulk.Submit.Xpath"), 
						prop.getProperty("Bulk.Submit.Value"));
				// System.out.println(prop.getProperty("Bulk.Dena_MakerUserID.Value"));
			} else if (prop.getProperty("BankName").equalsIgnoreCase("ICICI_PREPAID_AGENT")) {

				Login(// prop.getProperty("Bulk.Login.Id"),
						// prop.getProperty("Bulk.Login.Value"),
						prop.getProperty("Bulk.UserID.Xpath"), prop.getProperty("Bulk.ICICI_UserID.Value"),
						prop.getProperty("Bulk.Password.Xpath"), prop.getProperty("Bulk.ICICI_Password.Value"),
						// prop.getProperty("Bulk.MakerShortcode.Xpath"),
						// prop.getProperty("Bulk.Dena_MakerShortcode.Value"),
						prop.getProperty("Bulk.Submit.Xpath"), prop.getProperty("Bulk.Submit.Value"));
				// System.out.println(prop.getProperty("Bulk.Dena_MakerUserID.Value"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Welcome();

	}
	
	public Welcome enterLoginCredentials2() {
		try {
		//	driver.manage().deleteAllCookies();
			if (prop.getProperty("BankName").equalsIgnoreCase("ICICI_PREPAID_CSR")) {
				Login(  prop.getProperty("Bulk.UserID.Xpath"),
						prop.getProperty("Bulk.ICICI_UserID2.Value"),
						prop.getProperty("Bulk.Password.Xpath"), 
						prop.getProperty("Bulk.ICICI_Password2.Value"),
						// prop.getProperty("Bulk.MakerShortcode.Xpath"),
						// prop.getProperty("Bulk.Dena_MakerShortcode.Value"),
						prop.getProperty("Bulk.Submit.Xpath"), 
						prop.getProperty("Bulk.Submit.Value"));
				// System.out.println(prop.getProperty("Bulk.Dena_MakerUserID.Value"));
			} else if (prop.getProperty("BankName").equalsIgnoreCase("ICICI_PREPAID_AGENT")) {

				Login(// prop.getProperty("Bulk.Login.Id"),
						// prop.getProperty("Bulk.Login.Value"),
						prop.getProperty("Bulk.UserID.Xpath"), prop.getProperty("Bulk.ICICI_UserID.Value"),
						prop.getProperty("Bulk.Password.Xpath"), prop.getProperty("Bulk.ICICI_Password.Value"),
						// prop.getProperty("Bulk.MakerShortcode.Xpath"),
						// prop.getProperty("Bulk.Dena_MakerShortcode.Value"),
						prop.getProperty("Bulk.Submit.Xpath"), prop.getProperty("Bulk.Submit.Value"));
				// System.out.println(prop.getProperty("Bulk.Dena_MakerUserID.Value"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Welcome();

	}
	
	public Welcome enterLoginCredentials3() {
		try {
		//	driver.manage().deleteAllCookies();
			if (prop.getProperty("BankName").equalsIgnoreCase("ICICI_PREPAID_CSR")) {
				Login(  prop.getProperty("Bulk.UserID.Xpath"),
						prop.getProperty("Bulk.ICICI_UserID3.Value"),
						prop.getProperty("Bulk.Password.Xpath"), 
						prop.getProperty("Bulk.ICICI_Password3.Value"),
						// prop.getProperty("Bulk.MakerShortcode.Xpath"),
						// prop.getProperty("Bulk.Dena_MakerShortcode.Value"),
						prop.getProperty("Bulk.Submit.Xpath"), 
						prop.getProperty("Bulk.Submit.Value"));
				// System.out.println(prop.getProperty("Bulk.Dena_MakerUserID.Value"));
			} else if (prop.getProperty("BankName").equalsIgnoreCase("ICICI_PREPAID_AGENT")) {

				Login(// prop.getProperty("Bulk.Login.Id"),
						// prop.getProperty("Bulk.Login.Value"),
						prop.getProperty("Bulk.UserID.Xpath"), prop.getProperty("Bulk.ICICI_UserID.Value"),
						prop.getProperty("Bulk.Password.Xpath"), prop.getProperty("Bulk.ICICI_Password.Value"),
						// prop.getProperty("Bulk.MakerShortcode.Xpath"),
						// prop.getProperty("Bulk.Dena_MakerShortcode.Value"),
						prop.getProperty("Bulk.Submit.Xpath"), prop.getProperty("Bulk.Submit.Value"));
				// System.out.println(prop.getProperty("Bulk.Dena_MakerUserID.Value"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Welcome();

	}
	public Welcome enterLoginCredentials4() {
		try {
		//	driver.manage().deleteAllCookies();
			if (prop.getProperty("BankName").equalsIgnoreCase("ICICI_PREPAID_CSR")) {
				Login(  prop.getProperty("Bulk.UserID.Xpath"),
						prop.getProperty("Bulk.ICICI_UserID4.Value"),
						prop.getProperty("Bulk.Password.Xpath"), 
						prop.getProperty("Bulk.ICICI_Password4.Value"),
						// prop.getProperty("Bulk.MakerShortcode.Xpath"),
						// prop.getProperty("Bulk.Dena_MakerShortcode.Value"),
						prop.getProperty("Bulk.Submit.Xpath"), 
						prop.getProperty("Bulk.Submit.Value"));
				// System.out.println(prop.getProperty("Bulk.Dena_MakerUserID.Value"));
			} else if (prop.getProperty("BankName").equalsIgnoreCase("ICICI_PREPAID_AGENT")) {

				Login(// prop.getProperty("Bulk.Login.Id"),
						// prop.getProperty("Bulk.Login.Value"),
						prop.getProperty("Bulk.UserID.Xpath"), prop.getProperty("Bulk.ICICI_UserID.Value"),
						prop.getProperty("Bulk.Password.Xpath"), prop.getProperty("Bulk.ICICI_Password.Value"),
						// prop.getProperty("Bulk.MakerShortcode.Xpath"),
						// prop.getProperty("Bulk.Dena_MakerShortcode.Value"),
						prop.getProperty("Bulk.Submit.Xpath"), prop.getProperty("Bulk.Submit.Value"));
				// System.out.println(prop.getProperty("Bulk.Dena_MakerUserID.Value"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Welcome();

	}
	
	public Welcome enterLoginCredentials5() {
		try {
		//	driver.manage().deleteAllCookies();
			if (prop.getProperty("BankName").equalsIgnoreCase("ICICI_PREPAID_CSR")) {
				Login(  prop.getProperty("Bulk.UserID.Xpath"),
						prop.getProperty("Bulk.ICICI_UserID5.Value"),
						prop.getProperty("Bulk.Password.Xpath"), 
						prop.getProperty("Bulk.ICICI_Password5.Value"),
						// prop.getProperty("Bulk.MakerShortcode.Xpath"),
						// prop.getProperty("Bulk.Dena_MakerShortcode.Value"),
						prop.getProperty("Bulk.Submit.Xpath"), 
						prop.getProperty("Bulk.Submit.Value"));
				// System.out.println(prop.getProperty("Bulk.Dena_MakerUserID.Value"));
			} else if (prop.getProperty("BankName").equalsIgnoreCase("ICICI_PREPAID_AGENT")) {

				Login(// prop.getProperty("Bulk.Login.Id"),
						// prop.getProperty("Bulk.Login.Value"),
						prop.getProperty("Bulk.UserID.Xpath"), prop.getProperty("Bulk.ICICI_UserID.Value"),
						prop.getProperty("Bulk.Password.Xpath"), prop.getProperty("Bulk.ICICI_Password.Value"),
						// prop.getProperty("Bulk.MakerShortcode.Xpath"),
						// prop.getProperty("Bulk.Dena_MakerShortcode.Value"),
						prop.getProperty("Bulk.Submit.Xpath"), prop.getProperty("Bulk.Submit.Value"));
				// System.out.println(prop.getProperty("Bulk.Dena_MakerUserID.Value"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Welcome();

	}
	
	
	
}
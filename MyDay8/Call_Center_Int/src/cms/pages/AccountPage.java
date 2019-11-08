package cms.pages;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//import com.fss.cms.pages.UserPage;

public class AccountPage extends CMSPage {
	Properties prop;

	public AccountPage() {
		try {
			prop = loadObjectRepository("properties\\AccountPage.properties");

		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}
	}

	public AccountPage verifyButtonsinPage(String CallCloseButton) {
		try {
			IsElementsDisplayedByXpath(prop.getProperty("AccountPage.CallCloseButton.Xpath"), CallCloseButton);
			System.out.println("buttons heading");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public AccountPage verifyPageHeading(String PageHeading) {
		try {
			verifyTextByXpathBase(prop.getProperty("AccountPage.PageHeading.Xpath"), PageHeading);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public AccountPage verifyDetailsHeading(String PersonalDetails, String ContactDetails, String IDDetails,
			String AddressDetails, String OtherDetails, String ECommerce, String CardDetails, String AccountDetails,
			String CallLog) {
		try {

			verifyTextByXpathBase(prop.getProperty("AccountPage.PersonalDetails.Xpath"), PersonalDetails);
			verifyTextByXpathBase(prop.getProperty("AccountPage.ContactDetails.Xpath"), ContactDetails);
			verifyTextByXpathBase(prop.getProperty("AccountPage.IDDetails.Xpath"), IDDetails);
			verifyTextByXpathBase(prop.getProperty("AccountPage.AddressDetails.Xpath"), AddressDetails);
			verifyTextByXpathBase(prop.getProperty("AccountPage.OtherDetails.Xpath"), OtherDetails);
			verifyTextByXpathBase(prop.getProperty("AccountPage.E-Commerce.Xpath"), ECommerce);
			verifyTextByXpathBase(prop.getProperty("AccountPage.CardDetails.Xpath"), CardDetails);
			verifyTextByXpathBase(prop.getProperty("AccountPage.AccountDetails.Xpath"), AccountDetails);
			verifyTextByXpathBase(prop.getProperty("AccountPage.CallLog.Xpath"), CallLog);
			System.out.println("details heading");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public AccountPage clickonEditDetails() {
		try {
			clickLinkByLinkText("Click Here To Edit");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public AccountPage verifyEnableTextBox(String motherName, String dob, String cellNumber, String homeNumber,
			String email, String address1, String address2, String addressThree, String editCountry, String editState,
			String editCity, String editZip) {
		try {
			IsElementsEnabledById(prop.getProperty("AccountPage.motherName.Id"), motherName);
			IsElementsEnabledById(prop.getProperty("AccountPage.dob.Id"), dob);
			IsElementsEnabledById(prop.getProperty("AccountPage.cellNumber.Id"), cellNumber);
			IsElementsEnabledById(prop.getProperty("AccountPage.homeNumber.Id"), homeNumber);
			IsElementsEnabledById(prop.getProperty("AccountPage.email.Id"), email);
			IsElementsEnabledById(prop.getProperty("AccountPage.address1.Id"), address1);
			IsElementsEnabledById(prop.getProperty("AccountPage.address2.Id"), address2);
			IsElementsEnabledById(prop.getProperty("AccountPage.addressThree.Id"), addressThree);
			IsElementsEnabledById(prop.getProperty("AccountPage.editCountry.Id"), editCountry);
			IsElementsEnabledById(prop.getProperty("AccountPage.editState.Id"), editState);
			IsElementsEnabledById(prop.getProperty("AccountPage.editCity.Id"), editCity);
			IsElementsEnabledById(prop.getProperty("AccountPage.editZip.Id"), editZip);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public AccountPage clickonSave() {
		try {
			clickByXpath(prop.getProperty("AccountPage.SaveButton.Xpath"),
					prop.getProperty("AccountPage.SaveButton.Value"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public AccountPage clickonCancel() {
		try {
			clickByXpath(prop.getProperty("AccountPage.CancelButton.Xpath"),
					prop.getProperty("AccountPage.CancelButton.Value"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public AccountPage verifyButtonsinPage(String SaveButton, String CancelButton) {
		try {
			IsElementsDisplayedByXpath(prop.getProperty("AccountPage.SaveButton.Xpath"), SaveButton);
			IsElementsDisplayedByXpath(prop.getProperty("AccountPage.CancelButton.Xpath"), CancelButton);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return new AccountPage();
	}

	public AccountPage enterMotherName(String Mothername) {
		try {

			enterTextByIdBase(prop.getProperty("AccountPage.motherName.Id"), Mothername);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public AccountPage verifyMotherNameErrorMasg() {
		try {

			verifyTextByXpathBase(prop.getProperty("AccountPage.MotherNameErrorMasg.Xpath"),
					prop.getProperty("AccountPage.MotherNameErrorMasg.Value"));

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public AccountPage enterMobileNo(String MobileNo) {
		try {

			enterTextByIdBase(prop.getProperty("AccountPage.cellNumber.Id"), MobileNo);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public AccountPage verifyMobileNoErrorMasg() {
		try {

			verifyTextByXpathBase(prop.getProperty("AccountPage.MobileNoErrorMasg.Xpath"),
					prop.getProperty("AccountPage.MobileNoErrorMasg.Value"));

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public AccountPage verifySuccessMasg() {
		try {

			verifyTextByXpathBase(prop.getProperty("AccountPage.SuccessMasg.Xpath"),
					prop.getProperty("AccountPage.SuccessMasg.Value"));
			System.out.println("success");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public AccountPage enterHomeNo(String HomeNo) {
		try {

			enterTextByIdBase(prop.getProperty("AccountPage.homeNumber.Id"), HomeNo);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public AccountPage verifyHomeNoErrorMasg() {
		try {

			verifyTextByXpathBase(prop.getProperty("AccountPage.HomeNoErrorMasg.Xpath"),
					prop.getProperty("AccountPage.HomeNoErrorMasg.Value"));

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public AccountPage vrifyErrorMasgProfileEXP() {
		try {

			verifyTextByXpathBase(prop.getProperty("AccountPage.ErrorMasgProfileEXP.Xpath"),
					prop.getProperty("AccountPage.ErrorMasgProfileEXP.Value"));

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public AccountPage vrifyErrorMasgProfileStat() {
		try {

			verifyTextByXpathBase(prop.getProperty("AccountPage.ErrorMasgProfileStat.Xpath"),
					prop.getProperty("AccountPage.ErrorMasgProfileStat.Value"));

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public AccountPage enterEmail(String Email) {
		try {

			enterTextByIdBase(prop.getProperty("AccountPage.email.Id"), Email);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public AccountPage verifyEmailErrorMasg() {
		try {

			verifyTextByXpathBase(prop.getProperty("AccountPage.EmailErrorMasg.Xpath"),
					prop.getProperty("AccountPage.EmailErrorMasg.Value"));

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public AccountPage enterAddress1(String Address1) {
		try {

			enterTextByIdBase(prop.getProperty("AccountPage.address1.Id"), Address1);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public AccountPage verifyAddress1ErrorMasg() {
		try {

			verifyTextByXpathBase(prop.getProperty("AccountPage.Address1ErrorMasg.Xpath"),
					prop.getProperty("AccountPage.Address1ErrorMasg.Value"));

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public AccountPage enterAddress2(String Address2) {
		try {

			enterTextByIdBase(prop.getProperty("AccountPage.address2.Id"), Address2);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public AccountPage verifyAddress2ErrorMasg() {
		try {

			verifyTextByXpathBase(prop.getProperty("AccountPage.Address2ErrorMasg.Xpath"),
					prop.getProperty("AccountPage.Address2ErrorMasg.Value"));

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public AccountPage enterAddress3(String Address2) {
		try {

			enterTextByIdBase(prop.getProperty("AccountPage.addressThree.Id"), Address2);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public AccountPage verifyAddress3ErrorMasg() {
		try {

			verifyTextByXpathBase(prop.getProperty("AccountPage.Address3ErrorMasg.Xpath"),
					prop.getProperty("AccountPage.Address3ErrorMasg.Value"));

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public Welcome clickonCallClose(String Remarks) {
		try {
			enterTextByXpathBase(prop.getProperty("AccountPage.Remarks.Xpath"), Remarks);
			clickButtonByXpath(prop.getProperty("AccountPage.CallCloseButton.Xpath"),
					prop.getProperty("AccountPage.CallCloseButton.Value"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Welcome();
	}

	public AccountPage selectCountry(String EditCountry) {
		try {
			selectUsingValueByXpath(prop.getProperty("AccountPage.EditCountry.Xpath"), EditCountry);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public AccountPage verifyCountryErrorMasg() {
		try {

			verifyTextByXpathBase(prop.getProperty("AccountPage.ErrorMasgCountry.Xpath"),
					prop.getProperty("AccountPage.ErrorMasgCountry.Value"));

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public AccountPage selectState(String EditState) {
		try {
			selectUsingValueByXpath(prop.getProperty("AccountPage.EditState.Xpath"), EditState);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public AccountPage verifyStateErrorMasg() {
		try {

			verifyTextByXpathBase(prop.getProperty("AccountPage.ErrorMasgState.Xpath"),
					prop.getProperty("AccountPage.ErrorMasgState.Value"));

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public AccountPage selectCity(String EditCity) {
		try {
			selectUsingValueByXpath(prop.getProperty("AccountPage.EditCity.Xpath"), EditCity);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public AccountPage verifyCityErrorMasg() {
		try {

			verifyTextByXpathBase(prop.getProperty("AccountPage.ErrorMasgCity.Xpath"),
					prop.getProperty("AccountPage.ErrorMasgCity.Value"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

//	public AccountPage selectZip(String EditZip) {
//		try {
//			selectUsingValueByXpath(prop.getProperty("AccountPage.EditZip.Xpath"), EditZip);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return this;
//	}
//
//	public AccountPage verifyZipErrorMasg() {
//		try {
//
//			verifyTextByXpathBase(prop.getProperty("AccountPage.ErrorMasgZip.Xpath"),
//					prop.getProperty("AccountPage.ErrorMasgZip.Value"));
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return this;
//	}
}
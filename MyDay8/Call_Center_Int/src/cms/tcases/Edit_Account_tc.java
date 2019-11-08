package cms.tcases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import cms.pages.AccountPage;
import cms.pages.Login;
import cms.util.DataInputProvider;
import cms.util.ReportUtil;

@Listeners({ ATUReportsListener.class, ConfigurationListener.class, MethodListener.class })
public class Edit_Account_tc {
	{
		ReportUtil.reports();
	}


@Test(dataProvider = "Login", enabled = true, priority = 19)
	public void Login(String ename, String edata1, String edata2, String edata3, String edata4,
			String edata5, String edata6, String edata7, String edata8, String edata9, String edata10, String edata11,
			String Menu)
			throws FileNotFoundException, IOException, InterruptedException {
		new Login().launchBrowser().enterLoginCredentials()
				.searchelement(ename, edata1, edata2, edata3, edata4, edata5, edata6, edata7, edata8, edata9, edata10,
						edata11)
			.clickSearchtab().Proceed().ClickOnCheckBox().createCall().clickAccounttab(Menu);
		}


	@DataProvider(name = "Login")
	public Object[][] getDataforLogin() {
		return DataInputProvider.getSheet("EditAccount", "Login");
	}


@Test(dataProvider = "EditAccount", enabled = true, priority = 20)
	public void EditAccount(String PageHeading, String PersonalDetails, String ContactDetails, String IDDetails,
			String AddressDetails, String OtherDetails, String ECommerce, String CardDetails, String AccountDetails,
			String CallLog, String CallCloseButton, String motherName, String dob, String cellNumber, String homeNumber,
			String email, String address1, String address2, String addressThree, String editCountry, String editState,
			String editCity, String editZip, String SaveButton, String CancelButton, String InvalidMothername,
			String ValidMothername, String InvalidMobileNo, String ValidMobileNo, String InvalidHomeNo,
			String ValidHomeNo, String InvalidEmail, String ValidEmail, String InvalidAddress1, String ValidAddress1,
			String InvalidAddress2, String ValidAddress2, String InvalidAddress3, String ValidAddress3,String InvalidEditCountry, String ValidEditCountry,String ValidEditState,String ValidEditCity)
			throws FileNotFoundException, IOException, InterruptedException {
		new AccountPage()
				.verifyPageHeading(PageHeading).verifyDetailsHeading(PersonalDetails, ContactDetails, IDDetails,
						AddressDetails, OtherDetails, ECommerce, CardDetails, AccountDetails, CallLog)
				.verifyButtonsinPage(CallCloseButton)

				.clickonEditDetails()
				.verifyEnableTextBox(motherName, dob, cellNumber, homeNumber, email, address1, address2, addressThree,
						editCountry, editState, editCity, editZip)
				.verifyButtonsinPage(SaveButton, CancelButton)
				// Verify Mother name
				.enterMotherName(InvalidMothername).clickonSave().verifyMotherNameErrorMasg().clickonCancel()
				.clickonEditDetails().enterMotherName(ValidMothername).clickonSave().verifySuccessMasg()
				// Verify mobile no
				.clickonEditDetails().enterMobileNo(InvalidMobileNo).clickonSave().verifyMobileNoErrorMasg()
				.clickonCancel().clickonEditDetails().enterMobileNo(ValidMobileNo).clickonSave().verifySuccessMasg()
				// Verify Home no
				.clickonEditDetails().enterHomeNo(InvalidHomeNo).clickonSave().verifyHomeNoErrorMasg().clickonCancel()
				.clickonEditDetails().enterHomeNo(ValidHomeNo).clickonSave().verifySuccessMasg()
				// Verify Email
				.clickonEditDetails().enterEmail(InvalidEmail).clickonSave().verifyEmailErrorMasg().clickonCancel()
				.clickonEditDetails().enterEmail(ValidEmail).clickonSave().verifySuccessMasg()
				// Verify Address1
				.clickonEditDetails().enterAddress1(InvalidAddress1).clickonSave().verifyAddress1ErrorMasg()
				.clickonCancel().clickonEditDetails().enterAddress1(ValidAddress1).clickonSave().verifySuccessMasg()
				// Verify Address2
				.clickonEditDetails().enterAddress2(InvalidAddress2).clickonSave().verifyAddress1ErrorMasg()
				.clickonCancel().clickonEditDetails().enterAddress2(ValidAddress2).clickonSave().verifySuccessMasg()
				// Verify Address3
				.clickonEditDetails().enterAddress3(InvalidAddress3).clickonSave().verifyAddress1ErrorMasg()
				.clickonCancel().clickonEditDetails().enterAddress3(ValidAddress3).clickonSave().verifySuccessMasg().clickonEditDetails().selectCountry(InvalidEditCountry).clickonSave().verifyCountryErrorMasg()
				.clickonCancel().clickonEditDetails().selectCountry(ValidEditCountry).clickonSave().verifySuccessMasg()
				// Select State
				.clickonEditDetails()
		.selectState(ValidEditState)
				.clickonSave()
				.verifySuccessMasg()
				// Select City
	.clickonEditDetails()
				.selectCity(ValidEditCity)
				.clickonSave()
				.verifySuccessMasg()
				;
	}

		@DataProvider(name = "EditAccount")
	public Object[][] getDataforEditAccount() {
		return DataInputProvider.getSheet("EditAccount", "EditAccount");
	}
	

@Test(dataProvider = "Logout", enabled = true, priority = 21)
	public void Logout(String Remarks)
			throws FileNotFoundException, IOException, InterruptedException {
		new AccountPage().clickonCallClose(Remarks)
				.Logout()
				.quitBrowser();
}

	@DataProvider(name = "Logout")
	public Object[][] getDataforLogout() {
		return DataInputProvider.getSheet("EditAccount", "Logout");
	}
}
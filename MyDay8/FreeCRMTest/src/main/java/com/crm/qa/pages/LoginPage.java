package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	// Page Factory -- OR(Object Repository)
	@FindBy(name ="email")
	WebElement email;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//span[contains(text(),'Log In')]")
	WebElement loginBtn;

	@FindBy(xpath = "//a[contains(text(),'Sign Up')]")
	WebElement signUpBtn;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;

	// Initializing the Page Object
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateCRMLogo(){
		return crmLogo.isDisplayed();
	}

	public HomePage ValdiateLogin(String emailid, String pwd) {
		loginBtn.click();
		email.sendKeys(emailid);
		password.sendKeys(pwd);
		

		return new HomePage(); // Home Page is the landing page of Login so we
								// need to return new HomePage
	}

}

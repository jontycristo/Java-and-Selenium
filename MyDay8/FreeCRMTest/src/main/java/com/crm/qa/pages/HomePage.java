package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	// Page Factor or OR(Object Repository)
	@FindBy(xpath = "//span[contains(@class,'user-display')]")
	WebElement userNameLable;

	@FindBy(xpath = "//span[contains(text(),'Contacts')]")
	WebElement contactsLink;

	@FindBy(xpath = "//span[contains(text(),'Calendar')]")
	WebElement calendarLink;

	@FindBy(xpath = "//span[contains(text(),'Deals')]")
	WebElement dealsLink;
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	public boolean verifyUserNameLable(){
		return userNameLable.isDisplayed();
	}
	
	public ContactsPage clickOnContactsLink(){
		contactsLink.click();
		return new ContactsPage();
	}
	
	public DealsPage clickOnDealsLink(){
		dealsLink.click();
		return new DealsPage();
	}
	
	public CalendarPage clickOnCalendarLink(){
		calendarLink.click();
		return new CalendarPage();
	}
	

}
	
package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {

	@FindBy(xpath = "//*[@id='dashboard-toolbar']/div[1]")
	WebElement contactsLable;
	
	@FindBy(xpath="//*[@id='dashboard-toolbar']/div[2]/div/a/button")
	WebElement newContact;
	
	@FindBy(name="first_name")
	WebElement firstName;
	
	@FindBy(name="last_name")
	WebElement lastName;
	
	@FindBy(xpath="//div[@name='company']")
	WebElement compName;
	
	@FindBy(xpath="//*[@id='dashboard-toolbar']/div[2]/div/button[2]")
	WebElement saveBtn;

	public ContactsPage(){
		super();
	}
	
	public boolean verifyContactLable(){
		return contactsLable.isDisplayed();
	}

	public void selectContatcsByName(String name) {
		driver.findElement(By.xpath("//input[text()='"+name+"']//parent::td[@class='hidden']//preceding-sibling::td[@class='hidden']//input[@name='id']")).click();
	}
	
	public void createNewContact(String fstName, String lstName, String comp, String source){
		newContact.click();
		firstName.clear();
		firstName.sendKeys(fstName);
		lastName.clear();
		lastName.sendKeys(lstName);
		compName.clear();
		compName.sendKeys(comp);
		
		Select select = new Select(driver.findElement(By.xpath("//div[@name='source']")));
		select.selectByVisibleText(source);
		
		saveBtn.click();
		
	}

}

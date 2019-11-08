package cms.pages;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class HomePage extends BasePage {
	Properties prop;

	public HomePage() {
		try {
			prop = loadObjectRepository("properties\\HomePage.properties");

		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}
	}

	public FeePlan feePlanTab() throws InterruptedException {
		Thread.sleep(2000);
		try {
			clickByXpath(prop.getProperty("HomePage.FeePlantab.Xpath"), "FeePlan");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new FeePlan();
	}

	public Comments clickComments() {
		try {
			clickByXpath(prop.getProperty("HomePage.Comments.Xpath"), "Comments");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Comments();
	}

	public Account_Activity clickAccount_Activity(String Menu) {
		try {
			clickByXpath(prop.getProperty("HomePage.Account_Activity.Xpath"), Menu);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Account_Activity();
	}
	
	public AccountPage clickAccounttab(String Menu) {
		try {
		//	clickByXpath(prop.getProperty("HomePage.Account_Activity.Xpath"), Menu);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new AccountPage();
	}

	public KitToKit kitToKitTab() throws InterruptedException {
		Thread.sleep(2000);
		try {
			clickByXpath(prop.getProperty("HomePage.kittokitTab.Xpath"), "KitToKit");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new KitToKit();
	}
	public Card_Status clickCardStatus(){
		try {
			clickByXpath(prop.getProperty("HomePage.Card_Status.Xpath"), "CardStatus");
				} catch (Exception e) {
			e.printStackTrace();
		}
				return new Card_Status();
	}
	public LimitPage clickLimit(String Menu){
		try {
			clickByXpath(prop.getProperty("HomePage.Limit.Xpath"), Menu);
				} catch (Exception e) {
			e.printStackTrace();
		}
				return new LimitPage();
	}
	
	public ServicePage clickServices(String Menu){
		try {
			clickByXpath(prop.getProperty("HomePage.Services.Xpath"), Menu);
				} catch (Exception e) {
			e.printStackTrace();
		}
				return new ServicePage();
	}

	public Welcome callClose() {
		try {
			enterTextByXpathBase(prop.getProperty("Comment.Xpath"), "close the call please");
			Thread.sleep(1000);
			clickByXpath(prop.getProperty("CallClose.Xpath"), "Call Close");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Welcome();
	}

}

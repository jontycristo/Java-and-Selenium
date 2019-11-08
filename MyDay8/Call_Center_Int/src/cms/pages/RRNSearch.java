package cms.pages;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.log4testng.Logger;

public class RRNSearch extends BasePage {

	Properties prop;
	Logger logger = Logger.getLogger("CSRLogs");

	public  RRNSearch(){
		try {
			prop = loadObjectRepository("properties\\RRNSearch.properties");
		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}
	}
	
	public RRNSearch verifyMainPageHeading(String data) {
		try {
			Thread.sleep(2000);
			IsElementsDisplayedByXpath(prop.getProperty("RRNSearch.MainHeading.Xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	public RRNSearch verifyRRNSearchField(String RRNtxt, String DelChanltxt, String TxnDtxt, String Prodtxt, String prodcattxt, String Searchtxt,
			String CustSearchText,String NRF)
	{
		try {
			IsElementsDisplayedByXpath(prop.getProperty("RRNSearch.RRNText.Xpath"),RRNtxt);
			IsElementsDisplayedByXpath(prop.getProperty("RRNSearch.DeliveryChannelText.Xpath"),DelChanltxt);
			IsElementsDisplayedByXpath(prop.getProperty("RRNSearch.TransactionDateText.Xpath"),TxnDtxt);
			IsElementsDisplayedByXpath(prop.getProperty("RRNSearch.ProductText.Xpath"),Prodtxt);
			IsElementsDisplayedByXpath(prop.getProperty("RRNSearch.ProductCategoryText.Xpath"),prodcattxt);
			IsElementsDisplayedByXpath(prop.getProperty("RRNSearch.SearchText.Xpath"), Searchtxt);
			IsElementsDisplayedByXpath(prop.getProperty("RRNSearch.CustomerSearchText.Xpath"),CustSearchText);
			IsElementsDisplayedByXpath(prop.getProperty("RRNSearch.NRFText.Xpath"),NRF);
			
			 Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return this;
	}
	
	
	
	public RRNSearch enterRRN(String RRN){
		try {
			enterTextByXpathBase(prop.getProperty("RRNSearch.RRN.Xpath"), RRN);
			Thread.sleep(1000);
				} catch (Exception e) {
			e.printStackTrace();
		}
				return this;
	}

	
	public RRNSearch selectDelChnl(String chnl){
		try {
			
			selectVisibleTextByXpath(prop.getProperty("RRNSearch.DeliveryChannel.Xpath"), chnl);
			Thread.sleep(1000);
			logger.error("unable to run role");
				} catch (Exception e) {
			e.printStackTrace();
		}
				return this;
	}
	
	public RRNSearch selectTxnDate(String date){
		try {
			
			clickByXpath(prop.getProperty("RRNSearch.TransactionDate.Xpath"), date);
			JavascriptExecutor	jsExecutor =(JavascriptExecutor) driver;
                                  
			jsExecutor.executeScript("$(\"#txnDate\").val('27/04/2018')");
			Thread.sleep(1000);
			logger.error("unable to run owner");
				
				} catch (Exception e) {
			e.printStackTrace();
		}
				return this;
	}
	
	public RRNSearch selectProd(String Prod){
		try {
			
			selectVisibleTextByXpath(prop.getProperty("RRNSearch.Product.Xpath"), Prod);
			Thread.sleep(1000);
				logger.error("unable to detected execution");
				
				} catch (Exception e) {
					logger.error(e.getMessage());
			e.printStackTrace();
		}
				return this;
	}
	public RRNSearch selectProdCat(String Prodcat){
		try {
			
			selectVisibleTextByXpath(prop.getProperty("RRNSearch.ProductCategory.Xpath"), Prodcat);
			Thread.sleep(1000);
				logger.error("unable to detected execution");
				
				} catch (Exception e) {
					logger.error(e.getMessage());
			e.printStackTrace();
		}
				return this;
	}
	
	
	

	public RRNSearch Logout() {
		try {
			Thread.sleep(1000);
			clickByXpath(prop.getProperty("RRNSearch.Logoutmenu.Xpath"), "Logout");
			Thread.sleep(1000);
			// clickByLinkText(data);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public RRNSearch clickSearch(){
		try {
			
			clickButtonByXpath(prop.getProperty("RRNSearch.SearchText.Xpath"), "search");
			JavascriptExecutor jse=(JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,500)");
			Thread.sleep(2000);
				} catch (Exception e) {
			e.printStackTrace();
		}
				return this;
	}
	public RRNSearch verifyCustSearchField(String RRNcust, String CardNo, String ProxyNo, String CardStat, String TxnDesc, String Delchnl,
			String Txnamt, String Txnccy, String Billamt, String Billccy, String Feeamt, String srvtax,String suramt,String cesamt,String resmsg)
	{
		try {
			IsElementsDisplayedByXpath(prop.getProperty("CustSearch.RRNText.Xpath"), RRNcust);
			IsElementsDisplayedByXpath(prop.getProperty("CustSearch.CardNo.Xpath"), CardNo);
			IsElementsDisplayedByXpath(prop.getProperty("CustSearch.ProxyNo.Xpath"), ProxyNo);
			IsElementsDisplayedByXpath(prop.getProperty("CustSearch.CardStat.Xpath"), CardStat);
			IsElementsDisplayedByXpath(prop.getProperty("CustSearch.TxnDesc.Xpath"), TxnDesc);
			IsElementsDisplayedByXpath(prop.getProperty("CustSearch.Delchnl.Xpath"), Delchnl);
			IsElementsDisplayedByXpath(prop.getProperty("CustSearch.Txnamt.Xpath"), Txnamt);
			IsElementsDisplayedByXpath(prop.getProperty("CustSearch.Txnccy.Xpath"), Txnccy);
			IsElementsDisplayedByXpath(prop.getProperty("CustSearch.Billamt.Xpath"), Billamt);
			IsElementsDisplayedByXpath(prop.getProperty("CustSearch.Billccy.Xpath"), Billccy);
			IsElementsDisplayedByXpath(prop.getProperty("CustSearch.Feeamt.Xpath"), Feeamt);
			IsElementsDisplayedByXpath(prop.getProperty("CustSearch.srvtax.Xpath"), srvtax);
			IsElementsDisplayedByXpath(prop.getProperty("CustSearch.suramt.Xpath"), suramt);
			IsElementsDisplayedByXpath(prop.getProperty("CustSearch.cesamt.Xpath"), cesamt);
			IsElementsDisplayedByXpath(prop.getProperty("CustSearch.resmsg.Xpath"), resmsg);
           
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return this;
	}
	public RRNSearch verifyAlert(String Alert1,String Alert2,String Alert3,String Alert4,String Alert5) throws InterruptedException{
		IsElementsDisplayedByXpath(prop.getProperty("RRNSearch.Alert1.Xpath"), Alert1);
		IsElementsDisplayedByXpath(prop.getProperty("RRNSearch.Alert2.Xpath"), Alert2);
		IsElementsDisplayedByXpath(prop.getProperty("RRNSearch.Alert3.Xpath"), Alert3);
		IsElementsDisplayedByXpath(prop.getProperty("RRNSearch.Alert4.Xpath"), Alert4);
		IsElementsDisplayedByXpath(prop.getProperty("RRNSearch.Alert5.Xpath"), Alert5);
		return this;
	}
	
	public RRNSearch verifyCardNolink(String cardlink){
		try {

			clickButtonByXpath(prop.getProperty("CustSearch.cardlink.Xpath"), cardlink);
			IsElementsDisplayedByXpath(prop.getProperty("RRNSearch.NRFText.Xpath"),"Field");
			IsElementsDisplayedByXpath(prop.getProperty("RRNSearch.Value.Xpath"), "Value");
		//	Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='csclose']/strong")).click();
		//	Thread.sleep(1000);
				
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

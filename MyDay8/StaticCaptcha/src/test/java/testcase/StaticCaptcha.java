package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StaticCaptcha {
	
	public static WebDriver driver;
	
	public static void main (String[] args ){
		
		//Launch gecko driver
		
		try {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\browserexe\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://timesofindia.indiatimes.com/india/60-chance-of-el-nino-during-monsoon-us/articleshow/68553655.cms");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div[1]/div[2]/div[2]/div/div[3]/div/div[2]/div[5]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id='comment-sidebar-input-68553655']")).sendKeys("Test Comments");
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("//*[@id='comment-sidebar-68553655']/div/div[3]/div[1]/div[2]/div[1]/div/div/div[1]/div[2]/div/div[1]/input[1]")).sendKeys("Cristo Jonty");
			driver.findElement(By.xpath("//*[@id='comment-sidebar-68553655']/div/div[3]/div[1]/div[2]/div[1]/div/div/div[1]/div[2]/div/div[1]/input[2]")).sendKeys("jontycristo@gmail.com");
			driver.findElement(By.xpath("//*[@id='comment-sidebar-68553655']/div/div[3]/div[1]/div[2]/div[1]/div/div/div[1]/div[2]/div/div[1]/input[3]")).sendKeys("Mumbai");
			String vText = driver.findElement(By.xpath("//*[@id='comment-sidebar-68553655']/div/div[3]/div[1]/div[2]/div[1]/div/div/div[1]/div[2]/div/div[1]/span/span")).getText();
			
			System.out.println("Captach Text: "+vText);
			
			System.out.println("Fist Value: "+vText.substring(0, 1));
			System.out.println("Second Value: "+vText.substring(2, 3));
			
			int num1 = Integer.parseInt(vText.substring(0, 1));
			int num2 = Integer.parseInt(vText.substring(2, 3));
			
			int caladd = num1+num2;
			
			System.out.println("Addition of Num: "+ caladd);
			
			String finalvalue =  String.valueOf(caladd);
			
			driver.findElement(By.xpath("//*[@id='comment-sidebar-68553655']/div/div[3]/div[1]/div[2]/div[1]/div/div/div[1]/div[2]/div/div[1]/span/input")).sendKeys(finalvalue);
			
			Thread.sleep(4000); 
			//driver.switchTo().frame()
			driver.quit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}

}

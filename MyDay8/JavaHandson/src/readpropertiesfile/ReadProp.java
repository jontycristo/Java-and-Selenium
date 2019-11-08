package readpropertiesfile;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadProp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = null;
		
		String path= System.getProperty("user.dir")+"\\src\\properties\\config.properties";
		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream(path);
		prop.load(fs);
		
		System.out.println(prop.getProperty("username"));
		String BrowserName = prop.getProperty("browser");
		if(BrowserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\browserexe\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.get(prop.getProperty("url"));

	}

}

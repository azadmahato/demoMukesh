package aprPractice;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertiesFile {
   static WebDriver driver;
	public static void main(String[] args) throws IOException {
    Properties prop=new Properties();
    FileInputStream ip=new FileInputStream("C:\\Users\\Rishi\\workspace\\selenium.qs\\src\\aprPractice\\config.properties");
    prop.load(ip);
    String browserName=prop.getProperty("browser");
    if(browserName.equals("chrome"))
    {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
	    driver=new ChromeDriver();
		
		
    }
    else
    {
    	System.setProperty("webdriver.gecho.driver","C:\\Users\\Rishi\\Desktop\\gechodriver.exe");
	    driver=new FirefoxDriver();
    	
    }
    driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
    driver.get(prop.getProperty("url"));
	}

}

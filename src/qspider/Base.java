package qspider;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	 public static WebDriver driver;
	 public static Properties prop;
	 
	 public Base() throws IOException{
		prop=new Properties();
		FileInputStream ip=new FileInputStream("C:\\Users\\Rishi\\workspace\\selenium.qs\\src\\"
				+ "selenium\\config\\config.properties");
		prop.load(ip);
		
		 
	 }
	 public static void initialization(){
		 String browserName=prop.getProperty("browser");
		 if(browserName.equals("chrome")){
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
			 driver = new ChromeDriver();
			 
		 }
		 else if(browserName.equals("ff")){
				 System.setProperty("webdriver.gecko.driver","C:\\Users\\Rishi\\Desktop\\firefoxdriver.exe");
				 driver = new FirefoxDriver();
			 
		 }
		 
		 driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
			
	}

}

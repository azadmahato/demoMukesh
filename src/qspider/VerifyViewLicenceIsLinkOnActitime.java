package qspider;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyViewLicenceIsLinkOnActitime {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(
				"C:\\Users\\Rishi\\workspace\\selenium.qs\\src\\" + "selenium\\config\\config.properties");
		prop.load(ip);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		String tagname=driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).getTagName();
		if(tagname.equals("a"))
		{
			System.out.println("is a link");
		}
		else
		{
			System.out.println("not a link");
		}
		
		
		

	}

}

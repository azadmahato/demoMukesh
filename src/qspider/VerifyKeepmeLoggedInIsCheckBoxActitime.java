package qspider;

import java.io.FileInputStream;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyKeepmeLoggedInIsCheckBoxActitime {

	public static void main(String[] args) throws Exception {
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
		String eleType=driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']")).getAttribute("type");
		if(eleType.equals("checkbox"))
		{
			System.out.println("is a checkbox");
		}
		else
		{
			System.out.println("not a checkbox");
		}
		
		
	}

}

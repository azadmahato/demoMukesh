package qspider;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveValuesFromTextfildUsingClear {

	public static void main(String[] args) throws IOException, InterruptedException {
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
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rishi");
		Thread.sleep(3000);
		String value = driver.findElement(By.xpath("//input[@id='username']")).getAttribute("value");
		System.out.println(value);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='username']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("azad");
//without using clear method		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rishi kumar");
		// driver.findElement(By.xpath("//input[@id='username']")).sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(Keys.CONTROL + "a");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(Keys.DELETE);

	}

}

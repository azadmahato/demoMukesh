package qspider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentWayOfClickingButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
		driver.get("https://demo.vtiger.com");
	//1st way
		//driver.findElement(By.xpath("//button[text()='Sign in']")).click();
	//2nd way
		driver.findElement(By.xpath("//button[text()='Sign in']")).sendKeys(Keys.ENTER);
	//3rd way it is possible if element has a attribute called type='submit'
		//driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
	}

}

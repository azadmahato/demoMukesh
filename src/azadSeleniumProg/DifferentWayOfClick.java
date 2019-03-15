package azadSeleniumProg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentWayOfClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);

		driver.get("https://www.vtiger.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='customloginlink']")).click();
		//driver.findElement(By.xpath("//a[@id='customloginlink']")).sendKeys(Keys.ENTER);

	}

}

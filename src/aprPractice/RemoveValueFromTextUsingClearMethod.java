package aprPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveValueFromTextUsingClearMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(2000);
		String value=driver.findElement(By.id("username")).getAttribute("value");
		System.out.println(value);
		driver.findElement(By.id("username")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("azad");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("admin admin");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.id("username")).sendKeys(Keys.DELETE);
	}

}

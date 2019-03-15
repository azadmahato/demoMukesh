package azadSeleniumProg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContexClicActionClass {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);

	}

	@Test(priority=2)
	public void test() throws InterruptedException, AWTException {
		driver.get("https://demo.actitime.com/login.do");
		WebElement link = driver.findElement(By.xpath("//a[contains(text(),'actiTIME Inc.')]"));
		Actions action = new Actions(driver);
		action.contextClick(link).perform();
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);

	}

	@Test(priority=1)
	public void test2() throws InterruptedException {
		driver.get("https://www.actimind.com/");
		WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'info@actimind.com')]"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		Thread.sleep(2000);
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}

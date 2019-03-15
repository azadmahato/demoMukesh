package azadSeleniumProg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScrollUpAndDown {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		driver.get("https://www.seleniumhq.org/download/");
	}
	@Test(priority=1)
	public void test() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int i=1;i<10;i++)
		{
			js.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(2000);
		}
		for(int i=1;i<10;i++)
		{
			js.executeScript("window.scrollBy(0,-1000)");
			Thread.sleep(2000);
		}
	}
	@Test(priority=2)
	public void test2() throws InterruptedException
	{
		WebElement ele=driver.findElement(By.xpath("//img[@id='footerLogo']"));
		int x=ele.getLocation().getX();
		int y=ele.getLocation().getY();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(2000);
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}

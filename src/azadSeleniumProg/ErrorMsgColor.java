package azadSeleniumProg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ErrorMsgColor {
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
		driver.get("https://demo.actitime.com/login.do");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		WebElement errMsg=driver.findElement(By.xpath("//span[contains(text(),'Username or Password is invalid. Please try again.')]"));
		String errText=errMsg.getText();
		System.out.println(errText);
		String c=errMsg.getCssValue("color");
		String colorHex=Color.fromString(c).asHex();
		System.out.println(colorHex);
		if(colorHex.equals("#ce0100"))
		{
			System.out.println("red");
		}
		else
		{
			System.out.println("not red");
		}
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}

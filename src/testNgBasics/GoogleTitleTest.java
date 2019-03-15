package testNgBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}
	@Test(priority=1,groups="title")
	public void titleTest()
	{
	 String title=driver.getTitle();
	 System.out.println(title);
	 Reporter.log(title);
	// Assert.assertEquals(title, "Google","not matched");
	}
	@Test(priority=2,groups="logo")
	public void googleLogoTest()
	{
		boolean b=driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		System.out.println(b);
	}
	@Test(priority=3,groups="link")
	public void mailLinkText()
	{
		boolean link=driver.findElement(By.xpath("//a[text()='Gmail']")).isDisplayed();
		System.out.println(link);
	}
	@Test(priority=4,groups="url")
	public void getUrl()
	{
		String url=driver.getCurrentUrl();
		System.out.println(url);
	}
	@Test(priority=5,groups="test")
	public void test1(){
		System.out.println("test1");
	}
	@Test(priority=6,groups="test")
	public void test2(){
		System.out.println("test2");
	}
	@Test(priority=7,groups="test")
	public void test3(){
		System.out.println("test3");
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}

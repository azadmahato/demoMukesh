package testNgBasics;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgTest {
	WebDriver driver;
	
	@BeforeSuite
	public void setup()
	{
		System.out.println("setup");
	}
	@BeforeTest
	public void lounchBrowser()
	{
		System.out.println("lounchBrowser");
	}
	@BeforeClass
	public void enterUrl()
	{
		System.out.println("enterUrl");
	}
	@BeforeMethod
	public void login()
	{
		System.out.println("login");
	}
	@Test
	public void test1()
	{
		System.out.println("test1");
	}
	@Test
	public void test2()
	{
		System.out.println("test2");
	}
	@AfterMethod
	public void logout()
	{
		System.out.println("logout");
	}
	@AfterClass
	public void deleteAllCookies()
	{
		System.out.println("deleteAllCookies");
	}
	@AfterTest
	public void closeBrowser()
	{
		System.out.println("closeBrowser");
	}

}

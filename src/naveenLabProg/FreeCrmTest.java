package naveenLabProg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FreeCrmTest {
	WebDriver driver;
	public String credentials;
	String credentialsinfo[];
    @BeforeMethod
	public void Setup()
	{   
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		driver.get("https://ui.freecrm.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Classic CRM')]")).click();
		
	}
    @Test(priority=1)
    public void LoginWithCusUserId()
    {
    	 credentials=Data.getUserLoginInfo().get("customer");
    	 credentialsinfo=credentials.split("_");
    	 driver.findElement(By.xpath("//input[@name='username']")).sendKeys(credentialsinfo[0]);
    	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(credentialsinfo[1]);
    	 driver.findElement(By.xpath("//input[@type='submit']")).click();
 
    }
    @Test(priority=2)
    public void LoginWithAdminUserId()
    {
    	 credentials=Data.getUserLoginInfo().get("admin");
    	 credentialsinfo=credentials.split("_");
    	 driver.findElement(By.xpath("//input[@name='username']")).sendKeys(credentialsinfo[0]);
    	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(credentialsinfo[1]);
    	 driver.findElement(By.xpath("//input[@type='submit']")).click();
 
    }
    @AfterMethod
    public void TearDown()
    {
    	driver.quit();
    }
	
}

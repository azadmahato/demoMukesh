package azadSeleniumProg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacebookLoginPageAllignedOrNot {
	WebDriver driver;
	WebElement usidTb;
	WebElement pwdTb;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);

		driver.navigate().to("https://www.facebook.com/");
		 usidTb=driver.findElement(By.xpath("//input[@id='email']"));
		 pwdTb=driver.findElement(By.xpath("//input[@id='pass']"));
	}
	
	
	@Test(priority=1)
	public void allignment(){
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
//
//		driver.navigate().to("https://www.facebook.com/");
//		WebElement usidTb=driver.findElement(By.xpath("//input[@id='email']"));
//		WebElement pwdTb=driver.findElement(By.xpath("//input[@id='pass']"));
		int user_ycor=usidTb.getLocation().getY();
		System.out.println(user_ycor);
		int pwd_ycor=pwdTb.getLocation().getY();
		System.out.println(pwd_ycor);
		if(user_ycor==pwd_ycor)
		{
			System.out.println("user name and pwd field are in same row");
		}
		else
		{
			System.out.println("user name and pwd field are not in same row");
		}

	}
	@Test(priority=2)
	public void VerifyHeightWidth()
	{
		int usHeight=usidTb.getSize().getHeight();
		int pwdHeight=pwdTb.getSize().getHeight();
		int uswidth=usidTb.getSize().getWidth();
		int pwdwidth=pwdTb.getSize().getWidth();
		if(usHeight==pwdHeight&&uswidth==pwdwidth)
		{
			System.out.println("alligned");
		}
		else
		{
			System.out.println("not alligned");
		}
	}
	@Test
	public void focussedElement()
	{
		driver.switchTo().activeElement().sendKeys("azad mahato");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}

package azadSeleniumProg;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActiTimeTest {
	WebDriver driver;

	@BeforeMethod
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);

		driver.navigate().to("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(2000);
	}

	@Test(priority = 2)
	public void titleTest() throws InterruptedException {
		Thread.sleep(2000);

		String expectedTitle = "actiTIME - Enter Time-Track ";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		if (expectedTitle.contains(actualTitle)) {
			System.out.println("home page is displayed");
		} else {
			System.out.println("home page not displayed");
		}

	}

	@Test(priority = 1)
	public void currentUrl() throws InterruptedException {
		Thread.sleep(2000);
		String expectedUrl = "https://demo.actitime.com/user/submit_tt.do";
		String url = driver.getCurrentUrl();
		if (url.equals(expectedUrl)) {
			System.out.println("home page url");
		} else {
			System.out.println("not the home page url");
		}
	}

	@Test(priority=3)
	public void VerifyHomePageUsingUniqueElement() {
		WebElement logoutBtn = driver.findElement(By.xpath("//a[@id='logoutLink']"));
		if (logoutBtn.isDisplayed()) {
			System.out.println("home page displayed");
		} else {
			System.out.println("home page not displayed");
		}
	}
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}

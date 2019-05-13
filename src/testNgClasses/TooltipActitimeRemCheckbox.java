package testNgClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TooltipActitimeRemCheckbox {
    @Test
	public void tooltipCheck() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		WebElement ele=driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']"));
		Thread.sleep(2000);
		String tooltiptext=ele.getAttribute("title");
		System.out.println(tooltiptext);
	}

}

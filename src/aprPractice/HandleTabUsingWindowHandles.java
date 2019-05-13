package aprPractice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTabUsingWindowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		String parentWindowHandle=driver.getWindowHandle();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//a[contains(text(),'actiTIME Inc.')]")).click();
		Set<String> allWH=driver.getWindowHandles();
		for(String wh:allWH){
			driver.switchTo().window(wh);
			
		}
		String childTitle=driver.getTitle();
		System.out.println(childTitle);
		driver.close();
		driver.switchTo().window(parentWindowHandle);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.close();
	}

}

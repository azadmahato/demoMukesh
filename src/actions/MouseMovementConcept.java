package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		Thread.sleep(3000);
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//li/a[contains(text(),'Add-Ons')]"))).build().perform();
        Thread.sleep(3000);
		driver.findElement(By.linkText("SpiceMax")).click();
	}

}

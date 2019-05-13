package aprPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnTextboxActitimeEnabledOrNot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		WebElement un = driver.findElement(By.id("username"));
		if (un.isEnabled()) {
			System.out.println("enabled");
		} else {
			System.out.println("disabled");
		}
		String verion = driver.findElement(By.xpath("//nobr[contains(text(),'actiTIME 2019.2')]")).getText();
		System.out.println(verion);
		String tag = driver.findElement(By.xpath("//a[contains(text(),'actiTIME Inc.')]")).getTagName();
		if (tag.equals("a")) {
			System.out.println("link");
		} else {
			System.out.println("not a link");
		}
		String eleType = driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']")).getAttribute("type");
		System.out.println(eleType);
		if (eleType.equalsIgnoreCase("checkbox")) {
			System.out.println("checkbox");
		} else {
			System.out.println("not  a checkbox");
		}
		driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']")).click();

	}

}

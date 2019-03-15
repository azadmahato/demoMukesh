package javascriptExecuter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToBottomOfThePage {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
		driver.get("https://www.seleniumhq.org/download");
		driver.findElement(By.id("close")).click();
		Thread.sleep(3000);
		WebElement element=driver.findElement(By.xpath("//img[@id='footerLogo']"));
		Thread.sleep(3000);
		int x=element.getLocation().getX();
		int y=element.getLocation().getY();
		System.out.println("X coordinate is:"+x+"and Y coordinate is:"+y);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(2000);
		element.click();

	}

}

package aprPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpAndDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		driver.get("https://www.seleniumhq.org/download");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int i=0;i<10;i++){
			js.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(2000);
		}
		for(int i=1;i<10;i++)
		{
			js.executeScript("window.scrollBy(0,-1000)");
			Thread.sleep(2000);
		}
	}

}

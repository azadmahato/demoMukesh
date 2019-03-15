package azadSeleniumProg;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(2000,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2000,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		Set<String> allWindowHandles=driver.getWindowHandles();
		int count=allWindowHandles.size();
		System.out.println(count);
		for(String windowHandle:allWindowHandles)
		{
			driver.switchTo().window(windowHandle);
			String title=driver.getTitle();
			System.out.println("window handle id of page->"+title+"-> is:"+windowHandle);
			Thread.sleep(2000);
			driver.close();
		}
		driver.quit();
		
	}

}

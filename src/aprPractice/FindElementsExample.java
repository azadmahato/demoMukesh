package aprPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		int totalLinks=allLinks.size();
		System.out.println("total link ="+totalLinks);
		int visibleLink=0;
		int hiddenLink=0;
		for(WebElement links:allLinks)
		{
			if(links.isDisplayed())
			{
				visibleLink++;
				System.out.println(visibleLink+" --> "+links.getText());
			}
			else
			{
				hiddenLink++;
			}
		}
		System.out.println("visible  link:"+visibleLink);
		System.out.println("hidden link:"+hiddenLink);
	}

}

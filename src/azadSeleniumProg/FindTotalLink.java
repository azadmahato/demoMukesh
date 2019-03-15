package azadSeleniumProg;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindTotalLink {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int count = allLinks.size();
		System.out.println("total links=" + count);
		int visibleLinkCount = 0;
		int hiddenLinkCount = 0;
		for (WebElement link : allLinks) {
			if (link.isDisplayed()) {
				visibleLinkCount++;
				System.out.println(visibleLinkCount + "-->" + link.getText());
			} else {
				hiddenLinkCount++;
			}
		}
		System.out.println("total no of visible link=" + visibleLinkCount);
		System.out.println("total no of hidden link=" + hiddenLinkCount);
		Thread.sleep(2000);
		driver.close();
	}

}

package naveenLabProg;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("testing");
		Thread.sleep(3000);
		List<WebElement> elem=driver.findElements(By.xpath("//ul[@role='listbox']"
				+ "//li/descendant::div[@class='sbl1']"));
		System.out.println(elem.size());
		for(int i=0;i<elem.size();i++)
		{
			System.out.println(elem.get(i).getText());
			if(elem.get(i).getText().contains("testing tools"))
			{
				elem.get(i).click();
				break;
			}
		}

	}

}

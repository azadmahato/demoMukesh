package aprPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> allOptions=driver.findElements(By.xpath("//*[contains(text(),'selenium')]"));
		int count=allOptions.size();
		System.out.println("total option comes= "+count);
		String expectedValue="selenium documentation";
		for(WebElement option:allOptions)
		{
			String text=option.getText();
			System.out.println(""+text);
			if(text.equalsIgnoreCase(expectedValue))
			{
				option.click();
				break;
			}
		}
	}

}

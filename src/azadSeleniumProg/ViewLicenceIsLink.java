package azadSeleniumProg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ViewLicenceIsLink {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);

		driver.navigate().to("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		String tagName=driver.findElement(By.xpath("//a[contains(text(),'actiTIME Inc.')]")).getTagName();
        if(tagName.equals("a"))
        {
        	System.out.println("view Licence is link");
        }
        else
        {
        	System.out.println("view licence is not a link");
        }
	}

}

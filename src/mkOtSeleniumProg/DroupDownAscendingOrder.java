package mkOtSeleniumProg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DroupDownAscendingOrder {
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void test()
	{
		Select select=new Select(driver.findElement(By.xpath("//select[@id='month']")));
		List actualList=new ArrayList();
		
		List<WebElement> myTools=select.getOptions();
		for(WebElement ele:myTools)
		{
			String data=ele.getText();
			actualList.add(data);
		}
	
		System.out.println(actualList);
		List tempList=new ArrayList();
		tempList.addAll(actualList);
		Collections.sort(tempList,Collections.reverseOrder());
		System.out.println(tempList);
		Assert.assertTrue(actualList.equals(tempList));
		
		
	}
	public void teardown()
	{
		driver.quit();
	}

}

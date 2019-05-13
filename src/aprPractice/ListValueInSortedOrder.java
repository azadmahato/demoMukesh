package aprPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListValueInSortedOrder {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Rishi/Desktop/ListBox_BreakFast.html");
		WebElement listElement=driver.findElement(By.id("mtr"));
		Select sel=new Select(listElement);
		List<WebElement> allOption=sel.getOptions();
		int count=allOption.size();
		System.out.println(count);
		ArrayList<String> list=new ArrayList<String>();
		for(WebElement option:allOption)
		{
			String text=option.getText();
			System.out.println(text);
			list.add(text);
			
		}
		Collections.sort(list);
		for(String value:list)
		{
			System.out.println(value);
		}
	}

}

package azadSeleniumProg;

import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckListHasDuplicateValue {

	public static void main(String[] args) {
    
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Rishi/Desktop/ListBox_BreakFast.html");
		WebElement list = driver.findElement(By.id("mtr"));
		Select s = new Select(list);
		List<WebElement> allOptions=s.getOptions();
		int count=allOptions.size();
		System.out.println(count);
		HashSet<String> allElementText=new HashSet<String>();
		for(WebElement element:allOptions)
		{
			String text=element.getText();
			System.out.println(text);
			allElementText.add(text);
		}
		int count2=allElementText.size();
		System.out.println(count2);
		if(count==count2){
			System.out.println("list has no duplicate value---");
		}
		else
		{
			System.out.println("list has duplicate value----");
			
		}
		System.out.println(allElementText);
		driver.close();
	}

}

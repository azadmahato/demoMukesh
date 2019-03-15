package azadSeleniumProg;

import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintUniqueElementOfListBox {

	public static void main(String[] args) {
    
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Rishi/Desktop/ListBox_BreakFast.html");
		WebElement list=driver.findElement(By.id("mtr"));
		Select s=new Select(list);
		List<WebElement> allOptions=s.getOptions();
		int count=allOptions.size();
		System.out.println(count);
		System.out.println("---print the values in the list---");
		HashSet<String> allElement=new HashSet<String>();
		for(WebElement option:allOptions)
		{
			String text=option.getText();
			System.out.println(text);
			allElement.add(text);
		}
		
		System.out.println(allElement);
		
		
	}

}

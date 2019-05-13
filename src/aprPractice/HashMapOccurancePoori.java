package aprPractice;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HashMapOccurancePoori {

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
		HashMap<String, Integer> hashMapObject=new HashMap<>();
		for(WebElement element:allOption)
		{
			String text=element.getText();
			if(hashMapObject.containsKey(text))
			{
				Integer value=hashMapObject.get(text);
				value++;
				hashMapObject.put(text, value);
			}
			else
			{
				hashMapObject.put(text, 1);
			}
		}
		Set<String> allKeys=hashMapObject.keySet();
		for(String key:allKeys)
		{
			Integer value=hashMapObject.get(key);
			System.out.println(key+" --> "+value);
			if(value>1)
			{
				System.out.println("occurance of"+key+"is:"+value);
			}
		}
	}

}

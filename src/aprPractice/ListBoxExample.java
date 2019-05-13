package aprPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Rishi/Desktop/ListBox_BreakFast.html");
		WebElement listE=driver.findElement(By.id("mtr"));
		Select sel=new Select(listE);
		List<WebElement> options=sel.getOptions();
		int tsize=options.size();
		System.out.println("number of element present in list box="+tsize);
		for(WebElement ele:options)
		{
			String text=ele.getText();
			System.out.println(text);
		}
		sel.selectByIndex(0);
		sel.selectByValue("d");
		sel.selectByVisibleText("POORI");
		sel.deselectByVisibleText("DOSA");
		List<WebElement> selList=sel.getAllSelectedOptions();
		for(WebElement selOption:selList)
		{
			String stext=selOption.getText();
			System.out.println(stext);
		}
		boolean multiple=sel.isMultiple();
		System.out.println(multiple);
		WebElement fselectedOption=sel.getFirstSelectedOption();
		String ftext=fselectedOption.getText();
		System.out.println(ftext);
		sel.deselectAll();
	}

}

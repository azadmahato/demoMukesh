package azadSeleniumProg;

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
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Rishi/Desktop/ListBox_BreakFast.html");
		WebElement list=driver.findElement(By.id("mtr"));
		Select select=new Select(list);
		List<WebElement> options=select.getOptions();
		int count=options.size();
		System.out.println(count);
		for(WebElement ele:options)
		{
			String text=ele.getText();
			System.out.println(text);
		}
		select.selectByIndex(0);
		select.selectByValue("v");
		select.selectByVisibleText("POORI");
		System.out.println("*******print all selected option********");
		List<WebElement> selList=select.getAllSelectedOptions();
		int selectedList=selList.size();
		System.out.println(selectedList);
		
		for(WebElement selEle:selList)
		{
			String selecList=selEle.getText();
			System.out.println(selecList);
		}
		System.out.println("***check whether multiple select listbox or not***");
		boolean multiple=select.isMultiple();
		System.out.println(multiple+"yes,it is multiple");
		if(multiple)
		{
			WebElement firstSelectedOption=select.getFirstSelectedOption();
			System.out.println(firstSelectedOption.getText()+"***is the first selected option");
			select.deselectByIndex(0);
			System.out.println("after deselect****");
			WebElement firstSelectedOption1=select.getFirstSelectedOption();
			System.out.println(firstSelectedOption1.getText()+"***is the first selected option");
			select.deselectByValue("v");
			System.out.println("after deselect****");
			WebElement firstSelectedOption2=select.getFirstSelectedOption();
			System.out.println(firstSelectedOption2.getText()+"***is the first selected option");
			
			
		}
	
		
		
	}

}

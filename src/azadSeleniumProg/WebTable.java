package azadSeleniumProg;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
    
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Rishi/Desktop/webTable1.html");
		List<WebElement> row=driver.findElements(By.xpath("//tr"));
		int totalRow=row.size();
		System.out.println("total no of rows==>"+totalRow);
		List<WebElement> col=driver.findElements(By.xpath("//th"));
		int totalcol=col.size();
		System.out.println("total no of col==>"+totalcol);
		List<WebElement> cells=driver.findElements(By.xpath("//th|//td"));
		int totalcells=cells.size();
		System.out.println("total no of cells==>"+totalcells);
		int countNumber=0;
		int sum=0;
		for(WebElement cell:cells)
		{
			String cellText=cell.getText();
			try {
				int number=Integer.parseInt(cellText);
				System.out.println(""+number);
				countNumber++;
				sum=sum+number;
			} catch (Exception e) {
				
			}
		}
		System.out.println("total num:"+countNumber);
		System.out.println("sum="+sum);
		driver.close();
		
		
	}

}

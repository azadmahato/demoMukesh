package aprPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Rishi/Desktop/webTable1.html");
		List<WebElement> allRows = driver.findElements(By.xpath("//tr"));
		int totalRows = allRows.size();
		System.out.println("total no of rows :" + totalRows);
		List<WebElement> allCols = driver.findElements(By.xpath("//th"));
		int totalCols = allCols.size();
		System.out.println("total no of Cols :" + totalCols);
		List<WebElement> allCells = driver.findElements(By.xpath("//th|//td"));
		int totalCells = allCells.size();
		System.out.println("total cells=" + totalCells);
		int numValue = 0;
		int sum = 0;
		for (WebElement cell : allCells) {
			String cellValue = cell.getText();
			try {
				int number = Integer.parseInt(cellValue);
				System.out.println("" + number);
				numValue++;
				sum = sum + number;
			} catch (Exception e) {
			}
		}
		System.out.println(numValue);
		System.out.println(sum);

	}

}

package aprPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterTextIntoDisabledTextBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		driver.navigate().to("file:///C:/Users/Rishi/Desktop/disabled.html");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		js.executeScript("document.getElementById('t1').value='admin'");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('t2').value=''");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('t2').value='manager'");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('t2').type='button'");
	}

}

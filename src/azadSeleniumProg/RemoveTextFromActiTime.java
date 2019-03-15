package azadSeleniumProg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveTextFromActiTime {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);

		driver.navigate().to("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		String value=driver.findElement(By.xpath("//input[@id='username']")).getAttribute("value");
        System.out.println("valuse inside text box is= "+value);
        driver.findElement(By.xpath("//input[@id='username']")).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("azadMahato");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("azad Mahato");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(Keys.CONTROL+"a");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(Keys.DELETE);
        
        
        
	}

}

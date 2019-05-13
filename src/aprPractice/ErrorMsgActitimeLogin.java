package aprPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class ErrorMsgActitimeLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
		WebElement errMsg=driver.findElement(By.xpath("//span[contains(@class,'errormsg')]"));
		String text=errMsg.getText();
		System.out.println(text);
		String c=errMsg.getCssValue("color");
		String colorHex=Color.fromString(c).asHex();
		System.out.println(colorHex);
		if(colorHex.equals("#ce0100"))
		{
			System.out.println("red color");
		}
		else
		{
			System.out.println("not a red");
		}
		String font=errMsg.getCssValue("font-size");
		System.out.println(font);
		String fontfamily=errMsg.getCssValue("font-family");
		System.out.println(fontfamily);
	}

}

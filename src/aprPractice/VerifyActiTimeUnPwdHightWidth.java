package aprPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyActiTimeUnPwdHightWidth {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		WebElement unTB=driver.findElement(By.id("username"));
		int unTBh=unTB.getSize().getHeight();
		int unTBw=unTB.getSize().getWidth();
		WebElement pwdTB=driver.findElement(By.name("pwd"));
		int pwdTBh=pwdTB.getSize().getHeight();
		int pwdTBw=pwdTB.getSize().getWidth();
		System.out.println("un h"+unTBh);
		System.out.println("pwd h"+pwdTBh);
		System.out.println("un w"+unTBw);
		System.out.println("pwd w"+pwdTBw);
		if(unTBh==pwdTBh && unTBw==pwdTBw)
		{
			System.out.println("un and pwd are alligned ");
		}
		else
		{
			System.out.println("un and pwd are not alligned ");
		}
		
	}

}

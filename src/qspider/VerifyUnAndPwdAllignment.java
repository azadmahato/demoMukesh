package qspider;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;


public class VerifyUnAndPwdAllignment extends BaseClass{

	

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		WebElement unTB = driver.findElement(By.xpath("//input[@id='username']"));
		int un_x = unTB.getLocation().getX();
		int un_height = unTB.getSize().getHeight();
		int un_width = unTB.getSize().getWidth();
		WebElement pwdTB = driver.findElement(By.xpath("//input[@class='textField pwdfield']"));
		int pwd_x = pwdTB.getLocation().getX();
		int pwd_height = pwdTB.getSize().getHeight();
		int pwd_width = pwdTB.getSize().getWidth();
		if (un_x == pwd_x && un_height == pwd_height && un_width == pwd_width) {
			System.out.println("alligned properly");
		} 
	else 
		{
			System.out.println("not alligned properly");
		}

	}

}

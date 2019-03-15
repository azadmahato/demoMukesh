package azadSeleniumProg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeepMeLogInIsACheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);

		driver.navigate().to("https://demo.actitime.com/login.do");
		String eleType=driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']")).getAttribute("type");
        System.out.println(eleType);
        if(eleType.equalsIgnoreCase("checkbox"))
        {
        	System.out.println("is a checkbox");
        }
        else
        {
        	System.out.println("not a checkbox");
        }
	}

}

package azadSeleniumProg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class VerifyErrorMsgActiTimeLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(3000);
        WebElement errmsg=driver.findElement(By.xpath("//span[contains(text(),'Username or Password is invalid. Please try again.')]"));
	    String errorText=errmsg.getText();
	    System.out.println(errorText);
	    String clr=errmsg.getCssValue("color");
	    System.out.println(clr);
	    String colorHex=Color.fromString(clr).asHex();
	    System.out.println(colorHex);
	    if(colorHex.equals("#ce0100"))
	    {
	    	System.out.println("red");
	    }
	    else
	    {
	    	System.out.println("not red");
	    }
	    
	    
	    
	    
	
	}

}

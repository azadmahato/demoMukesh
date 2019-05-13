package aprPractice;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import library.HighlightEle;

public class LogDemo {

	public static void main(String[] args) {
    Logger log=Logger.getLogger("LogDemo");
    PropertyConfigurator.configure("log4j.properties");
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	log.info("browser open");
	driver.manage().window().maximize();
	log.info("maximize window");
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	log.info("facebook open");
	driver.findElement(By.id("email")).clear();
	WebElement username=driver.findElement(By.id("email"));
	HighlightEle.highLightElement(driver, username);
	username.sendKeys("azad@gmail.com");
	log.info("email id entered");
	}

}

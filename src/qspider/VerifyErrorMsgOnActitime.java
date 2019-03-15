package qspider;

import java.io.FileInputStream;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class VerifyErrorMsgOnActitime {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(
				"C:\\Users\\Rishi\\workspace\\selenium.qs\\src\\" + "selenium\\config\\config.properties");
		prop.load(ip);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
		WebElement errorText=driver.findElement(By.xpath("//span[contains(text(),'Username or Password')]"));
		String errorMsg=errorText.getText();
		System.out.println("error msg= "+errorMsg);
		String c=errorText.getCssValue("color");
		System.out.println(c);
		String ColorAsHex=Color.fromString(c).asHex();
        System.out.println(ColorAsHex);
        if(ColorAsHex.equals("#ce0100"))
        {
        	System.out.println("red");
        }
        else
        {
        	System.out.println("not red");
        }
        String fontsize=errorText.getCssValue("font-size");
        System.out.println(fontsize);
        String fontweight=errorText.getCssValue("font-weight");
        System.out.println(fontweight);
	}

}

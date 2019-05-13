package testNgClasses;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class KeyBoardMouseOperation {
    @Test
	public void mouseOperation() throws AWTException, InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);

		Robot r = new Robot();
		r.mouseMove(300, 600);
		//Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_WINDOWS);
//		r.keyRelease(KeyEvent.VK_WINDOWS);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ALT);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_F);
		Thread.sleep(2000);
		
		r.keyRelease(KeyEvent.VK_F);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_N);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_N);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\Users\\Rishi\\workspace\\selenium.qs\\src\\aprPractice\\actiTim.png");
		FileUtils.copyFile(srcFile, destFile);

	}

}

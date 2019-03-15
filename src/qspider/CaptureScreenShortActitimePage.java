package qspider;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenShortActitimePage {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
		Date d = new Date();
		String date1 = d.toString();
		System.out.println(date1);
		String date2 = date1.replaceAll(":", "_");
		System.out.println(date2);

		driver.get("https://demo.actitime.com/login.do");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		File destFile=new File("C:\\Users\\Rishi\\workspace\\selenium.qs\\src\\qspider\\actitimeLogin.png");
		FileUtils.copyFile(srcFile,destFile);
	}

}

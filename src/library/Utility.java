package library;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	
	public static void screenShort(WebDriver driver,String screenShotName) throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		File destFile=new File("C:\\Users\\Rishi\\workspace\\selenium.qs\\screenShort\\"+screenShotName+".png");
		FileUtils.copyFile(srcFile, destFile);
		
		
	}

}

package aprPractice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllChildWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		String parentWindowId=driver.getWindowHandle();
		Set<String> allWindowId=driver.getWindowHandles();
		int count=allWindowId.size();
		System.out.println(count);
		for(String windowHandle:allWindowId){
			driver.switchTo().window(windowHandle);
			String title=driver.getTitle();
			System.out.println("title of window is--> "+title+" windowId---> "+windowHandle);
			if(!windowHandle.equals(parentWindowId))
			{
				driver.close();
				System.out.println("child browser window title-->"+title+" is closed");
				
			}
		
			
		}
	}

}

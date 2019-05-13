package aprPractice;

import java.io.IOException;
import java.net.HttpURLConnection;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLink {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		List<WebElement> link=driver.findElements(By.tagName("a"));
		int sizeL=link.size();
		System.out.println(sizeL);
	    for(int i=0;i<sizeL;i++)
	    {
	    	WebElement ele=link.get(i);
	    	String url=ele.getAttribute("href");
	    	verifyLinkActive(url);
	    }
	    
	}
	public static void verifyLinkActive(String linkUrl) throws IOException
	{
		
		URL url=new URL(linkUrl);
		HttpURLConnection httpurlconnection=(HttpURLConnection) url.openConnection();
		httpurlconnection.setConnectTimeout(3000);
		httpurlconnection.connect();
		if(httpurlconnection.getResponseCode()==200)
		{
			System.out.println(linkUrl+" -> "+httpurlconnection.getResponseMessage());
		}
		if(httpurlconnection.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
		{
			System.out.println(linkUrl+" -> "+httpurlconnection.getResponseCode()+"-> "+HttpURLConnection.HTTP_NOT_FOUND);
		}
	}

}

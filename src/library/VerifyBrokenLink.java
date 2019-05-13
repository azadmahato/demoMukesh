package library;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class VerifyBrokenLink {
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

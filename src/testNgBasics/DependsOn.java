package testNgBasics;

import org.testng.annotations.Test;

public class DependsOn {
	@Test
	public void login()
	{
		System.out.println("login");
		//int i=9/0;
	}
	@Test(dependsOnMethods="login")
	public void homePage()
	{
		System.out.println("homePage");
	}
	@Test(dependsOnMethods="login")
	public void search()
	{
		System.out.println("search");
	}
	
	


}

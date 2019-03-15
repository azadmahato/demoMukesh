package testNgBasics;

import org.testng.annotations.Test;

public class InvocationCount {
	@Test(invocationCount=10)
	public void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}

}

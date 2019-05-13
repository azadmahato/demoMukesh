package runner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class TestRunner {

	public static void main(String[] args) {
     
		TestNG trunner=new TestNG();
		List<String> list=new ArrayList<String>();
		list.add("C:\\Users\\Rishi\\workspace\\selenium.qs\\test-output\\Suite\\testng-failed.xml");
		trunner.setTestSuites(list);
		trunner.run();
	}

}

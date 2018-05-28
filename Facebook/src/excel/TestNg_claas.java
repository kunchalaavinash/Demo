package excel;

import java.util.List;

import org.testng.TestNG;
import org.testng.collections.Lists;

public class TestNg_claas {

	public static void main(String[] args) {
		
		List suites=Lists.newArrayList();
		
		suites.add("F:\\Selenium workspace\\avinash\\Facebook\\test-output\\testng-failed.xml");
		
		TestNG test=new TestNG();
		
		test.setTestSuites(suites);
		
		test.run();

	}

}

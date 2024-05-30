package selenium;

import org.testng.annotations.Test;

public class TestMultipleTimes {
	
	@Test(invocationCount = 3)
	public void test() {
		System.out.println("Thiyag");
	}

}

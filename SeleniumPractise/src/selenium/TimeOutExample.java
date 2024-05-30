package selenium;

import org.testng.annotations.Test;

public class TimeOutExample {
	
	@Test(timeOut = 2000)
	public void test() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Thiyagaraj Logasundaram");
	}

}

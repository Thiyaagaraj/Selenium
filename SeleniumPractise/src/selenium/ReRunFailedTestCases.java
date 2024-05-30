package selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReRunFailedTestCases {
	
	@Test
	public void testCase1() {
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void testCase2() {
		Assert.assertEquals(true, false);
	}
}

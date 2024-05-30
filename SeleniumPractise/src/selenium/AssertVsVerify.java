package selenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertVsVerify {
	
	/*
	 * @Test public void assertTest() {
	 * 
	 * System.out.println("Before Assertion"); Assert.fail();
	 * System.out.println("After Assertion"); }
	 */
	
	@Test
	public void testVerify() {
		//soft Assertion
		SoftAssert assert1 = new SoftAssert();
		System.out.println("Before Assertion");
		assert1.fail();
		System.out.println("After Assertion");
	}

}

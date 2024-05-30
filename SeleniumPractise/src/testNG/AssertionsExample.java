package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;


public class AssertionsExample {

	String name="Thiyag";
    @Test
    public void checkEqual(){
        Assert.assertNotEquals(name,"Thiyag");
    }
}

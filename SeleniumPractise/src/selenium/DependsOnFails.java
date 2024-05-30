package selenium;

import org.testng.annotations.Test;

public class DependsOnFails {
	
	  @Test(timeOut = 2000)
	   public void parentsPermission() throws InterruptedException {
	        Thread.sleep(3000);
	        System.out.println("Permission given");
	    }

	   @Test(dependsOnMethods = "parentsPermission", alwaysRun = true)
	    public void loveMarriage(){
	        System.out.println("Love Marriage");
	    }
}

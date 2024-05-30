package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaysToRefreshBrowser {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\LT\\Selenium\\Dependencies\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://192.168.2.165/dimensiontest/frm_login.aspx");
		//driver.navigate().to("http://192.168.2.165/dimensiontest/frm_login.aspx");
		
		WebElement loginId = driver.findElement(By.id("txt_email-inputEl"));
		loginId.sendKeys("support@speedstep.de");
			
		//driver.get(driver.getCurrentUrl());
		
		//JavaScriptExecutor
		/*
		 * JavascriptExecutor executor = (JavascriptExecutor) driver;
		 * executor.executeScript("history.go(0)");
		 */
		/*
		 * Robot robot = new Robot(); robot.keyPress(KeyEvent.VK_F5);
		 * robot.keyRelease(KeyEvent.VK_F5);
		 */
		

	}

}

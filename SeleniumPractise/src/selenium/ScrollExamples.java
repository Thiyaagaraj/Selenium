package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollExamples {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\LT\\Selenium\\Dependencies\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://echoecho.com/htmlforms11.htm");
		JavascriptExecutor executor = (JavascriptExecutor) driver;

	        //Scroll to Some position
			/*
			 * executor.executeScript("window.scroll(0,800)",""); Thread.sleep(3000);
			 * executor.executeScript("window.scroll(0,-800)","");
			 */

	        //Scroll to Bottom of the Page
			/*
			 * executor.executeScript("window.scrollTo(0,document.body.scrollHeight)","");
			 * Thread.sleep(3000); //Scroll to Top back from the bottom of the Page
			 * executor.executeScript("window.scroll(0,0)","");
			 */

	        //Scroll to a specific element Position
	        WebElement link=driver.findElement(By.linkText("online tool"));
	        executor.executeScript("arguments[0].scrollIntoView(true);",link);

			/*
			 * Robot robot = new Robot(); robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			 * robot.keyRelease(KeyEvent.VK_PAGE_DOWN); Thread.sleep(3000);
			 * robot.keyPress(KeyEvent.VK_PAGE_UP); robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
			 */
	}

}

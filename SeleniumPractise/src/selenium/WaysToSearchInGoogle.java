package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaysToSearchInGoogle {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\LT\\Selenium\\Dependencies\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.co.in/");
		
		WebElement searchBox = driver.findElement(By.name("q"));
        //searchBox.sendKeys("Game of Thrones"+Keys.ENTER);
		/*
		 * searchBox.sendKeys("Game Of Thrones"); searchBox.submit();
		 */
		/*
		 * searchBox.sendKeys("Game of Thrones"); 
		 * Robot robot = new Robot();
		 * robot.keyPress(KeyEvent.VK_ENTER); 
		 * robot.keyRelease(KeyEvent.VK_ENTER);
		 */
		
		searchBox.sendKeys("Game of Thrones \n"); 
	}
}

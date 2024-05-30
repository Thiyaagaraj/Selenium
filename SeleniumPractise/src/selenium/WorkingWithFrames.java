package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\LT\\Selenium\\Dependencies\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/frame.xhtml");
		
		driver.switchTo().frame(0);
		
		WebElement button1 = driver.findElement(By.id("Click"));
		String text1 = button1.getText();
		button1.click();
		String text2 = button1.getText();
		System.out.println("Before Click :"+text1);
		System.out.println("After Click :"+text2);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		WebElement button2 = driver.findElement(By.id("Click"));
		button2.click();
		
		driver.switchTo().defaultContent();
		
		List<WebElement> totalframes = driver.findElements(By.tagName("iframe"));
		int size = totalframes.size();
		System.out.println("Total number of frames :"+size);

	}

}

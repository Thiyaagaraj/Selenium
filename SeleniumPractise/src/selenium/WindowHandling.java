package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.net.OlderWindowsVersionEphemeralPortDetector;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\LT\\Selenium\\Dependencies\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/window.xhtml");
		
		String oldWindow = driver.getWindowHandle();
		
		WebElement window1 = driver.findElement(By.id("j_idt88:new"));
		window1.click();
		
		Set<String> handles = driver.getWindowHandles();
		
		for (String newWindow : handles) {
			
			driver.switchTo().window(newWindow);
		}
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("thiyagub4u@gmail.com");
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(oldWindow);
		
		WebElement multipleWindow = driver.findElement(By.id("j_idt88:j_idt91"));
		multipleWindow.click();
		
		int numberOfWindows = driver.getWindowHandles().size();
		System.out.println("Number of Windows Opened: "+numberOfWindows);
		
		WebElement dontCloseMe = driver.findElement(By.id("j_idt88:j_idt93"));
		dontCloseMe.click();
		
		Set<String> newWindowhandles = driver.getWindowHandles();
		for (String allWindows : newWindowhandles) {
			if(!allWindows.equals(oldWindow)) {
				driver.switchTo().window(allWindows);
				driver.close();
			}
		}
	}

}

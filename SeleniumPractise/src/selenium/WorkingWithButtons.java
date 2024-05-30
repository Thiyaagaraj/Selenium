package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\LT\\Selenium\\Dependencies\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/button.xhtml");
		
		WebElement disabledButton = driver.findElement(By.id("j_idt88:j_idt92"));
		boolean disabled = disabledButton.isEnabled();
		System.out.println(disabled);
		
		//1. Get the XY Position
		WebElement positionButton = driver.findElement(By.id("j_idt88:j_idt94"));
		Point xypoint = positionButton.getLocation();
		int xValue=xypoint.getX();
		int yvalue=xypoint.getY();
		System.out.println("X value is : "+xValue+"Y Value is :"+yvalue);
		
		// 2. Find the Color of the Button
		WebElement colorButton = driver.findElement(By.id("j_idt88:j_idt96"));
		String color = colorButton.getCssValue("background-color");
		System.out.println("Button Color is :"+color);
		
		//3. Find the Size of the Button
		WebElement sizeButton = driver.findElement(By.id("j_idt88:j_idt98"));
		int height = sizeButton.getSize().getHeight();
		int width = sizeButton.getSize().getWidth();
		System.out.println("Height is "+height+"Width is "+width);
		
		//Go to Home
		WebElement homeButton = driver.findElement(By.id("j_idt88:j_idt90"));
		homeButton.click();
		
	}

}

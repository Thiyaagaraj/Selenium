package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithAlertBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\LT\\Selenium\\Dependencies\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		
		WebElement alertBox = driver.findElement(By.id("j_idt88:j_idt91"));
		alertBox.click();
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		
		WebElement confirmButton = driver.findElement(By.id("j_idt88:j_idt95"));
		confirmButton.click();
		
		Alert confirmAlert = driver.switchTo().alert();
		confirmAlert.dismiss();
		
		WebElement promptButton = driver.findElement(By.id("j_idt88:j_idt104"));
		promptButton.click();
		
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("Thiyagaraj");
		
		promptAlert.accept();

	}

}

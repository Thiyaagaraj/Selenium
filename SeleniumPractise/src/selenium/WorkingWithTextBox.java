package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithTextBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\LT\\Selenium\\Dependencies\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.findElement(By.id("j_idt88:name")).sendKeys("Thiyagaraj Logasundaram");
		driver.findElement(By.id("j_idt88:j_idt91")).sendKeys("Coimbatore");
		String value = driver.findElement(By.id("j_idt88:j_idt97")).getAttribute("Value");
		System.out.println(value);
		
		WebElement clearBox= driver.findElement(By.id("j_idt88:j_idt95"));
		clearBox.clear();
		
		WebElement diabledBox = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]"));
		boolean enabled = diabledBox.isEnabled();
		System.out.println(enabled);

	}

}

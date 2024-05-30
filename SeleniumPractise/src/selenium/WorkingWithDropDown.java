package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\LT\\Selenium\\Dependencies\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");

		
		 WebElement dropdown1 = driver.findElement(By.xpath(
		 "//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select"));
		 
		 Select select = new Select(dropdown1); 
		 select.selectByIndex(4);
		
		 List<WebElement> options = select.getOptions();
		 int size = options.size();
		 System.out.println("Size of the dropdown :"+size);
		
		/*
		 * WebElement dropdown =
		 * driver.findElement(By.xpath("//*[@id=\"j_idt87:country_input\"]")); Select
		 * select = new Select(dropdown); select.selectByValue("India");
		 * Thread.sleep(3000); select.selectByVisibleText("Brazil");
		 */
		
		
	}

}

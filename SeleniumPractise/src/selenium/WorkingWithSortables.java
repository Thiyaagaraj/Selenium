package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithSortables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver","D:\\LT\\Selenium\\Dependencies\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.leafground.com/drag.xhtml");
        driver.manage().window().maximize();
        
        List<WebElement> tableItems = driver.findElements(By.xpath("//tbody[@id='form:j_idt111_data']//following::tr"));
        
        WebElement fromElement = tableItems.get(5);
        WebElement toElement = tableItems.get(2);
        
        Actions actions = new Actions(driver);
        actions.clickAndHold(fromElement);
        actions.moveToElement(toElement);
        actions.build().perform();

	}

}

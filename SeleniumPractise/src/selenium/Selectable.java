package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {
	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","D:\\LT\\Selenium\\Dependencies\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/tree.xhtml");
        driver.manage().window().maximize();

        List<WebElement> selectable = driver.findElements(By.xpath("//*[@id=\"j_idt88\"]/ul/li"));

        int listSize = selectable.size();
        System.out.println(listSize);

		 Actions actions = new Actions(driver);
		 actions.keyDown(Keys.CONTROL)
		 .click(selectable.get(0))
		 .click(selectable.get(1))
		 .build().perform();
		 

		
		/*
		 * Actions actions = new Actions(driver);
		 * actions.clickAndHold(selectable.get(0));
		 * actions.clickAndHold(selectable.get(1));
		 * actions.clickAndHold(selectable.get(2)); actions.build().perform();
		 */
		 
	}

}

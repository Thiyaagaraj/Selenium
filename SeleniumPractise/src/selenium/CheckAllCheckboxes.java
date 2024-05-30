package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckAllCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\LT\\Selenium\\Dependencies\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.navigate().to("https://www.leafground.com/checkbox.xhtml");
        Thread.sleep(3000);        
        List<WebElement> allBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

        for(WebElement element: allBoxes){
            element.click();
        }

	}

}

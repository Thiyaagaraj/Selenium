package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickGoogleSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\LT\\Selenium\\Dependencies\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.navigate().to("https://www.google.co.in/");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Game of Thrones");
        Thread.sleep(5000);

        List<WebElement> searchSuggestions = driver.findElements(By.xpath("//ul[@role=\"listbox\"]//following::li"));
        
        int position = 0;
        for(WebElement webElement : searchSuggestions){
            String text = webElement.getText();
            System.out.println(text);
            position++;
            
            //Click on the 3 search result
			/*
			 * if(position==3) { webElement.click(); break; }
			 */
            
            //Click on the Specfic text contained in the search result
            
            if(text.contains("cast")) {
            	webElement.click();
            	break;
            }
        }
	}
}

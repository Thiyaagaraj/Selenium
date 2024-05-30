package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","D:\\LT\\Selenium\\Dependencies\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in");
        driver.manage().window().maximize();
        
        WebElement googleBox = driver.findElement(By.name("q"));
        googleBox.sendKeys("Po");
        Thread.sleep(4000);
        
        List<WebElement> optionsList = driver.findElements(By.xpath("//*[@id=\"Alh6id\"]/div[1]/div/ul/li"));
        System.out.println(optionsList.size());
        
        for (WebElement webElement : optionsList) {
        	if(webElement.getText().equals("points table")) {
        		System.out.println("Selecting :"+webElement.getText());
        		webElement.click();
        		break;
        	}
        }
	}
}

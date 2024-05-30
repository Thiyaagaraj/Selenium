package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCalendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","D:\\LT\\Selenium\\Dependencies\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://m.sbltbus.com");
        driver.manage().window().maximize();
        
        WebElement calendar = driver.findElement(By.id("search-onward-date"));
        calendar.click();
        
        WebElement nextMonth = driver.findElement(By.xpath("//div[@title='Next month']"));
        Thread.sleep(3000);
        nextMonth.click();
        
        WebElement dateToSelect = driver.findElement(By.xpath("//div[contains(text(),'21')]"));
        dateToSelect.click();
        
	}

}

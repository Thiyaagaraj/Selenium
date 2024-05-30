package selenium;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


public class FluentWaitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","D:\\LT\\Selenium\\Dependencies\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        
        driver.get("http://192.168.2.165/dimensiontest/frm_login.aspx");
        driver.manage().window().maximize();
        
		WebElement loginId = driver.findElement(By.id("txt_email-inputEl"));
		loginId.sendKeys("support@speedstep.de");

		WebElement password = driver.findElement(By.id("txt_pass-inputEl"));
		password.sendKeys("Speedstepger1848#y2");

		WebElement loginButton = driver.findElement(By.id("btn_ok"));
		loginButton.click();
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		
		WebElement myProfile = wait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver driver) {
				// TODO Auto-generated method stub
				return driver.findElement(By.xpath("//a[@id=\"supplier\"]"));
			}
		});
		
		myProfile.click();
	}

}

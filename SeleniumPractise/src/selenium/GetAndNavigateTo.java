package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndNavigateTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\LT\\Selenium\\Dependencies\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://192.168.2.165/dimensiontest/frm_login.aspx");
		driver.navigate().to("http://192.168.2.165/dimensiontest/frm_login.aspx");
		
		WebElement loginId = driver.findElement(By.id("txt_email-inputEl"));
		loginId.sendKeys("support@speedstep.de");

		WebElement password = driver.findElement(By.id("txt_pass-inputEl"));
		password.sendKeys("Speedstepger1848#y2");

		WebElement loginButton = driver.findElement(By.id("btn_ok"));
		loginButton.click();
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

	}

}

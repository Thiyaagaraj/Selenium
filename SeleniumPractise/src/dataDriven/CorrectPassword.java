package dataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CorrectPassword {
	
	@Test
	@Parameters({"userName","password"})
	public void loginWithCorrectPassword(String userName, String pWord) {
	
	System.setProperty("Webdriver.chrome.driver","D:\\LT\\Selenium\\Dependencies\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://192.168.2.165/dimensiontest/frm_login.aspx");
    driver.manage().window().maximize();
    
    WebElement loginId = driver.findElement(By.id("txt_email-inputEl"));
    loginId.sendKeys(userName);
    
    WebElement password = driver.findElement(By.id("txt_pass-inputEl"));
    password.sendKeys(pWord);
    
    WebElement loginButton = driver.findElement(By.id("btn_ok"));
    loginButton.click();
    
    driver.quit();
	}

}

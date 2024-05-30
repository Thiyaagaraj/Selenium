package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ParallelTesting {
    WebDriver driver;

    @BeforeSuite
    public void launchBrowser(){
        System.setProperty("webdriver.chrome.driver","D:\\LT\\Selenium\\Dependencies\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void openGoogle(){
        driver.get("https://www.google.com");
    }

    @Test
    public void openBing(){
        driver.get("https://www.bing.com");
    }
    
    @Test
    public void openDimension(){
        driver.get("http://192.168.2.165/dimensiontest/frm_login.aspx");
    }

    @AfterSuite
    public void closeBrowser(){
        driver.quit();
    }

}

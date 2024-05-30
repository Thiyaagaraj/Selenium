package selenium;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.ForkJoinPool.ManagedBlocker;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//1. Open Google
		//2. Google home page
		WebDriver driver = null;		
		FileInputStream stream = new FileInputStream("config.properties");
		
		Properties properties = new Properties();
		properties.load(stream);
		
		String browser = properties.getProperty("browser");
		String driverLocation = properties.getProperty("DriverLocation");
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", driverLocation);	
			driver = new ChromeDriver();
			
		} else if(browser.equalsIgnoreCase("firefox")){
			
			System.setProperty("webdriver.gecko.driver", driverLocation);
			driver = new FirefoxDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("Pollachi"+Keys.ENTER);
		
		//driver.quit();
	}
}

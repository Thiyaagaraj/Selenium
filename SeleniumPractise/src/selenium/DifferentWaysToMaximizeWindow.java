package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DifferentWaysToMaximizeWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\LT\\Selenium\\Dependencies\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(chromeOptions);
				
		
		
		//driver.manage().window().maximize();
		
		/*
		 * Dimension dimension = new Dimension(1920, 1080);
		 * driver.manage().window().setSize(dimension);
		 */
		driver.get("http://192.168.2.165/dimensiontest/frm_login.aspx");
		//driver.navigate().to("http://192.168.2.165/dimensiontest/frm_login.aspx");

	}

}

package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoToURLWithoutGetAndnavigateTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url ="http://192.168.2.165/dimensiontest/frm_login.aspx";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		
		executor.executeScript("window.location = \'" + url + "\'");
		
	}

}

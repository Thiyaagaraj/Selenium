package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","D:\\LT\\Selenium\\Dependencies\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/dashboard.xhtml");
        driver.manage().window().maximize();
        
        WebElement image1 = driver.findElement(By.id("j_idt150"));
        image1.click();
        
        WebElement image2 = driver.findElement(By.id("j_idt148"));
        if(image2.getAttribute("naturalWidth").equals("0")) {
        	System.out.println("The image is broken");
        }else {
        	System.out.println("The image is not broken");
        }

	}

}

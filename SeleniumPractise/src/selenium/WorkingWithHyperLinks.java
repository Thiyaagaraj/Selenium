package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithHyperLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","D:\\LT\\Selenium\\Dependencies\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.leafground.com/link.xhtml");
        driver.manage().window().maximize();
        
        WebElement homePageLink = driver.findElement(By.linkText("Go to Dashboard"));
        homePageLink.click();
        driver.navigate().back();
        
        WebElement findWhereToGo = driver.findElement(By.partialLinkText("Find the URL"));
        String url = findWhereToGo.getAttribute("href");
        System.out.println("URL is Navigating to :"+url);
        
        WebElement brokenLink = driver.findElement(By.linkText("Broken?"));
        brokenLink.click();
        
        String title = driver.getTitle();
        if(title.contains("404")) {
        	System.out.println("Link is broken");
        }else {
        	System.out.println("Link is not broken");
        }
        driver.navigate().back();
        
        WebElement homePageLink2 = driver.findElement(By.linkText("Go to Dashboard"));        
        homePageLink2.click();
        
        List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
        int linkCount = totalLinks.size();
        System.out.println("No of link in this page :"+linkCount);
	}
}

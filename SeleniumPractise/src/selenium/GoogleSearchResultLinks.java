package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchResultLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\LT\\Selenium\\Dependencies\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.co.in/");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("12 Angry men \n");
        Thread.sleep(5000);
        
		 // This will print all the URLS in the page
		 /* List<WebElement> TotalLinks = driver.findElements(By.xpath("//a"));
		 * 
		 * //To Print all the links in the Page for (WebElement links: TotalLinks) {
		 * System.out.println(links.getAttribute("href")); } //To print important links
		 */
        
        //Fetch main Links:
        List<WebElement> mainLinks =  driver.findElements(By.xpath("//*[@id=\"search\"]//following::h3//following::div/cite"));
        
        for (WebElement links : mainLinks) {
			System.out.println("Main Links :"+links.getText());
		}
	}
}

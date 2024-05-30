package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadAFile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","D:\\LT\\Selenium\\Dependencies\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/file.xhtml");
        driver.manage().window().maximize();
        
        WebElement downloadFile = driver.findElement(By.id("j_idt93:j_idt95"));
		downloadFile.click();
		Thread.sleep(3000);
		
		File fileLocation = new File("C:\\Users\\lt\\Downloads");
		File[] totalFiles = fileLocation.listFiles();
		
		for (File file : totalFiles) {
			if(file.getName().equals("TestLeaf Logo.png")) {
				System.out.println("File is downloaded");
				break;
			}
		}	
	}
}

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PaginationDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		 driver.manage().window().maximize();

	     driver.get("http://192.168.2.165/dimensiontest/frm_Login.aspx");

	     WebElement loginID = driver.findElement(By.id("txt_email-inputEl"));
	     loginID.sendKeys("support@speedstep.de");

	     WebElement password = driver.findElement(By.id("txt_pass-inputEl"));
	     password.sendKeys("Speedstepger1848#y2");

	     WebElement submitBtn = driver.findElement(By.id("btn_ok-btnEl"));
	     submitBtn.click();
	     Thread.sleep(5000);
	     WebElement menuExpand = driver.findElement(By.id("tool-1012"));
	     menuExpand.click();

	     driver.manage().wait(5000);
	     WebElement expandFollowup = driver.findElement(By.id("tool-1019-toolEl"));
	     expandFollowup.click();

	     WebElement communicationStatus = driver.findElement(By.id("href_lbl_wrk_comm"));
	     communicationStatus.click();
	}

}

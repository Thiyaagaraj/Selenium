package selenium;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshotExample {

	public static void main(String[] args) throws IOException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\LT\\Selenium\\Dependencies\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://192.168.2.165/dimensiontest/frm_login.aspx");
		driver.navigate().to("http://192.168.2.165/dimensiontest/frm_login.aspx");
		
		WebElement loginId = driver.findElement(By.id("txt_email-inputEl"));
		loginId.sendKeys("support@speedstep.de");

		WebElement password = driver.findElement(By.id("txt_pass-inputEl"));
		password.sendKeys("Speedstepger1848#y2");

		WebElement loginButton = driver.findElement(By.id("btn_ok"));
		loginButton.click();
		
		//Take a Screenshot Using TakesScreenshot
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		
		File destinationfile = new File("D:\\LT\\Selenium\\Screenshots\\sample.png");
		FileHandler.copy(sourceFile, destinationfile);
//		FileUtils.copyFile(sourceFile, destinationfile);
		
		//Take a Screenshot Using Robot Class
		Robot robot = new Robot();
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(screensize);
		BufferedImage source = robot.createScreenCapture(rectangle);
		
		File destinationFile = new File("D:\\LT\\Selenium\\Screenshots\\robotsnap.png");
		ImageIO.write(source,"png",destinationFile);
	}

}

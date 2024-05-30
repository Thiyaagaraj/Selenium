package extentReportExamples;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportExample {
	WebDriver driver;
	ExtentReports extentReport;
	ExtentSparkReporter sparkReporter;
	ExtentTest testCase;
	
	@Test
	public void openGoogle() throws IOException{
		testCase = extentReport.createTest("Verify Google Title");
		testCase.log(Status.INFO,"Navigating to Google");
		driver.get("https://www.google.co.in/");
		String title = driver.getTitle();
		testCase.log(Status.INFO,"Actual Title :"+title);
		testCase.log(Status.INFO,"Verification of Actual and Expected Title");
		if(title.equals("Google")) {
			testCase.log(Status.PASS, "Actual and Expected title are equal");
		}else {
			testCase.log(Status.FAIL, "Actual and Expected title are NOT equal");
			TakesScreenshot screenshot = (TakesScreenshot) driver;
			File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
			File destinationfile = new File("D:\\LT\\Selenium\\Screenshots\\Google.png");
			FileHandler.copy(sourceFile, destinationfile);
			testCase.addScreenCaptureFromPath("Google.png");
		}
	}
	
	@Test
	public void openBing() throws IOException{
		testCase = extentReport.createTest("Verify Bing Title");
		testCase.log(Status.INFO,"Navigating to Bing");
		driver.get("https://www.bing.com/");
		String title = driver.getTitle();
		testCase.log(Status.INFO,"Actual Title :"+title);
		testCase.log(Status.INFO,"Verification of Actual and Expected Title");
		if(title.equals("Bing")) {
			testCase.log(Status.PASS, "Actual and Expected title are equal");
		}else {
			testCase.log(Status.FAIL, "Actual and Expected title are NOT equal");
			TakesScreenshot screenshot = (TakesScreenshot) driver;
			File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
			File destinationfile = new File("D:\\LT\\Selenium\\Screenshots\\Bing.png");
			FileHandler.copy(sourceFile, destinationfile);
			testCase.addScreenCaptureFromPath("Bing.png");
		}
	}

	@Test
	public void openWikipedia() throws IOException{
		testCase = extentReport.createTest("Verify Wikipedia Title");
		testCase.log(Status.INFO,"Navigating to Wikipedia");
		driver.get("https://www.wikipedia.org/");
		String title = driver.getTitle();
		testCase.log(Status.INFO,"Actual Title :"+title);
		testCase.log(Status.INFO,"Verification of Actual and Expected Title");
		if(title.equals("wikipedia")) {
			testCase.log(Status.PASS, "Actual and Expected title are equal");
		}else {
			testCase.log(Status.FAIL, "Actual and Expected title are NOT equal");
			TakesScreenshot screenshot = (TakesScreenshot) driver;
			File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
			File destinationfile = new File("D:\\LT\\Selenium\\Screenshots\\Wikipedia.png");
			FileHandler.copy(sourceFile, destinationfile);
			testCase.addScreenCaptureFromPath("Wikipedia.png");
		}
	}
	
	@BeforeSuite
	public void launchBrowser(){
		System.setProperty("webdriver.chrome.driver", "D:\\LT\\Selenium\\Dependencies\\chromedriver-win64\\chromedriver.exe");
		extentReport = new ExtentReports();
		sparkReporter = new ExtentSparkReporter("ExterntReportSpark.html");
		extentReport.attachReporter(sparkReporter);
		driver = new ChromeDriver();
	}

	@AfterSuite
	public void closeBrowser(){
		driver.quit();
		extentReport.flush();
	}

}

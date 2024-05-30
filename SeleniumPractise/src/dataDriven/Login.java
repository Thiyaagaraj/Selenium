package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Login {

	String [][] data = null;
	WebDriver driver;

	@DataProvider(name = "loginData")
	public String [][] loginDataProvider() throws BiffException, IOException {
		data = getExcelData();
		return data;
	}

	public String [][]  getExcelData() throws BiffException, IOException {
		FileInputStream excel = new FileInputStream("D:\\LT\\Selenium\\TestData\\LoginTestData.xls");
		Workbook workbook = 		Workbook.getWorkbook(excel);
		Sheet sheet = workbook.getSheet(0);
		
		int rowCount = sheet.getRows();
		int columnCount = sheet.getColumns();
		
		String testData[][] = new String[rowCount-1][columnCount];
		
		for(int i=1; i < rowCount; i++) {
			for (int j=0; j<columnCount; j++) {
				testData[i-1][j] = sheet.getCell(j,i).getContents();
			}
		}
		return testData;
	}
	
	@BeforeTest
	public void beforeTest() {
		
		System.setProperty("Webdriver.chrome.driver","D:\\LT\\Selenium\\Dependencies\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.165/dimensiontest/frm_login.aspx");
		driver.manage().window().maximize();
		
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}


	@Test(dataProvider="loginData")
	public void login(String userName,String pWord) {

		WebElement loginId = driver.findElement(By.id("txt_email-inputEl"));
		loginId.sendKeys(userName);

		WebElement password = driver.findElement(By.id("txt_pass-inputEl"));
		password.sendKeys(pWord);

		WebElement loginButton = driver.findElement(By.id("btn_ok"));
		loginButton.click();
	}

}

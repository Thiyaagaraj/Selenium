package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenUsingPOI {
	
	WebDriver driver;
	
	static List<String> userNameList = new ArrayList<String>();
	static List<String> passwordList = new ArrayList<String>();
	
	public void readExcel() throws IOException {
		FileInputStream excel = new FileInputStream("D:\\LT\\Selenium\\TestData\\LoginTestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(excel);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		Iterator<Row> rowIterator = sheet.iterator();
		
		while(rowIterator.hasNext()) {
			Row rowValue = rowIterator.next();
			Iterator<Cell> columnIterator = rowValue.iterator();
			int i = 2;
			while(columnIterator.hasNext()) {
				if(i % 2 == 0) {
					userNameList.add(columnIterator.next().getStringCellValue());
				}else {
					passwordList.add(columnIterator.next().getStringCellValue());
				}
			i++;
			}
		}
		workbook.close();
	}
	
	public void login(String uName, String pword) {
		System.setProperty("Webdriver.chrome.driver","D:\\LT\\Selenium\\Dependencies\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.165/dimensiontest/frm_login.aspx");
		driver.manage().window().maximize();
		
		WebElement loginId = driver.findElement(By.id("txt_email-inputEl"));
		loginId.sendKeys(uName);

		WebElement password = driver.findElement(By.id("txt_pass-inputEl"));
		password.sendKeys(pword);

		WebElement loginButton = driver.findElement(By.id("btn_ok"));
		loginButton.click();
		
		driver.quit();
	}
	
	public void executeTest() {
		
		for(int i = 0; i < userNameList.size(); i++) {
			login(userNameList.get(i),passwordList.get(i));
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DataDrivenUsingPOI usingPOI = new DataDrivenUsingPOI();
		usingPOI.readExcel();
		System.out.println("User Name List :"+userNameList);
		System.out.println("Password List :"+passwordList);
		usingPOI.executeTest();
	}

}

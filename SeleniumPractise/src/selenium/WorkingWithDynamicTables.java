package selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithDynamicTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","D:\\LT\\Selenium\\Dependencies\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/grid.xhtml");
        driver.manage().window().maximize();
        
        List<WebElement> columns = driver.findElements(By.tagName("th"));
        int columnCount = columns.size();
        System.out.println("Number of Columns :"+columnCount);
        
        List<WebElement> rows = driver.findElements(By.tagName("tr"));
        int rowCount = rows.size();
        System.out.println("Number of Rows :"+rowCount);
        
        WebElement getPrice = driver.findElement(By.xpath("//td[text()=\"Black Watch\"]//following::td[2]"));
        String price = getPrice.getText();
        System.out.println("Price of Black Watch :"+price);
        
        List<WebElement> allPrice = driver.findElements(By.xpath("//td[5]"));
        
        List<Integer> priceList = new ArrayList<>();
        
        for (WebElement webElement : allPrice) {
			String individualPrice = webElement.getText().replace("$","").replace(".00","");
			priceList.add(Integer.parseInt(individualPrice));
		}
        System.out.println("Final List :"+priceList);
        
        int smallValue = Collections.min(priceList);
        System.out.println("Smallest price is :"+smallValue);
        
        
        String smallValueString="$"+Integer.toString(smallValue)+".00";
        System.out.println("Small Value Sring :" +smallValueString);
        
        String finalXpath="//span[text()=" + "\"" +smallValueString  + "\"" + "]//preceding::td[4]";
        System.out.println(finalXpath);
        
        WebElement checkBox = driver.findElement(By.xpath(finalXpath));
        checkBox.click();
	}
}
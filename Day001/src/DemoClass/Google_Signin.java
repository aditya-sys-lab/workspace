package DemoClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Signin {
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Resource folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        driver.manage().window().maximize();
        
        FileInputStream file=new FileInputStream("E:\\excel\\GmailValidation.xlsx");
        XSSFWorkbook workbook=new XSSFWorkbook(file);
       XSSFSheet sheet=workbook.getSheet("Sheet1");
       
      int rowNum=sheet.getLastRowNum();
        for(int i=1;i<=rowNum;i++)
        {
        	Row row=sheet.getRow(i);
       Cell 	cell=row.getCell(0);
      String userName= cell.getStringCellValue();
        	
        	driver.findElement(By.id("identifierId")).sendKeys(userName);
        	driver.findElement(By.className("CwaK9")).click();
    
            
        }
        
       
       
       
       
	
	}

}

package com.LoginFunctionality;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewToursApplicationLoginValidation{
	
public static void main(String[] args) throws IOException  {

	
	System.setProperty("webdriver.chrome.driver","E:\\Selenium Resource folder\\chromedriver.exe");
	WebDriver obj=new ChromeDriver();
    obj.get("http://www.newtours.demoaut.com");
	obj.manage().window().maximize();
	obj.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	FileInputStream file=new FileInputStream("E:\\excel\\LoginValidation.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	 int  rowCount= sheet.getLastRowNum();
	
	for(int i=1;i<=rowCount;i++)
	{
	Row	row=sheet.getRow(i);
    Cell cell=row.getCell(0);
    String userName=cell.getStringCellValue();
    String passWord=cell.getStringCellValue();
    
    obj.findElement(By.name("userName")).sendKeys(userName);
    obj.findElement(By.name("password")).sendKeys(passWord);
    obj.findElement(By.name("login")).click();
    
    String Expected_Login="Find";
    String Actual_Login=obj.getTitle();
    System.out.println(Actual_Login);
    if(Actual_Login.contains(Expected_Login))
    {
    	System.out.println("LoginSuccessfully");
    }
    else
    {
    	System.out.println("login unsuccessfull");
    }
    obj.navigate().back();
    
	}
	}
	
	
}

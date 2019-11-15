package com.LoginFunctionality;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewToursApplicationRegister {

	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Resource folder\\chromedriver.exe");
		WebDriver obj=new ChromeDriver();
	    obj.get("http://www.newtours.demoaut.com");
		obj.manage().window().maximize();
		obj.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	WebElement Registerlink=obj.findElement(By.linkText("REGISTER"));
	Registerlink.click();
	System.out.println("************");

List<WebElement>ElementName=obj.findElements(By.tagName("input"));
        System.out.println("hai Aditya");
		FileInputStream file=new FileInputStream("E:\\excel\\Register.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		Row row=sheet.createRow(0);
		for(int i=0;i<ElementName.size();i++)
		{
		String	CheckBoxnames=ElementName.get(i).getAttribute("name");
		System.out.println(CheckBoxnames);
		
		
        Cell cell=row.createCell(i);
        cell.setCellValue(CheckBoxnames);
        
		}
FileOutputStream file1=new FileOutputStream("E:\\excel\\Register.xlsx");
    	
    	workbook.write(file1);
		

	}

}

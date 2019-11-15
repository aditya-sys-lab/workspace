package com.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example {

	public static void main(String[] args) throws IOException {
		
			System.setProperty("webdriver.chrome.driver","E:\\Selenium Resource folder\\chromedriver.exe");
				
			WebDriver driver=new ChromeDriver();
							
			driver.get("http://www.newtours.demoaut.com");
							
			driver.manage().window().maximize();
			
							
			WebElement registerlink=driver.findElement(By.linkText("REGISTER"));
			registerlink.click();
			
			WebElement country=driver.findElement(By.name("country"));
			Actions act=new Actions(driver);
			act.moveToElement(country).perform();
			//country.click();
		List<WebElement>countryname=country.findElements(By.tagName("option"));

		FileInputStream file=new FileInputStream("E:\\excel\\ExcelOperation.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet3");
		for(int i=0;i<countryname.size();i++)
			{
			    String name=countryname.get(i).getText();
				Row row=sheet.createRow(i);
				Cell cell=row.createCell(0);
				cell.setCellValue(name);
			}
			
		FileOutputStream file1=new FileOutputStream("E:\\excel\\ExcelOperation.xlsx");
		workbook.write(file1);
	}

}

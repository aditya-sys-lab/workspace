package com.keyboardDataDrivenApproach;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class NewToursApplicationWithHybridDataDriven extends BaseTest {
	
@Test
public void NewToursAppLogIn() throws IOException
{
	FileInputStream file=new FileInputStream("./src/com/keyboardDataDrivenApproach/newtoursappLogin.properties");
	
	Properties prop=new Properties();
	prop.load(file);
	FileInputStream file1=new FileInputStream("E:\\excel\\LoginValidation.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(file1);
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	int rowcount=sheet.getLastRowNum();
	for(int i=1;i<=rowcount;i++)
	{
	Row row=sheet.getRow(i);
	Cell cell=row.getCell(0);
	Cell cell1=row.getCell(1);
	String username=cell.getStringCellValue();
	String password=cell1.getStringCellValue();
	driver.findElement(By.name(prop.getProperty("UserName"))).sendKeys(username);
	driver.findElement(By.name(prop.getProperty("Password"))).sendKeys(password);
	driver.findElement(By.name(prop.getProperty("signIn"))).click();

 String actualResult=driver.getCurrentUrl();
	System.out.println(actualResult);
	String expectedResult="mercuryreservation";
	if(actualResult.contains(expectedResult))
	{
		System.out.println("login successfully");
		row.createCell(3).setCellValue("login successfully-pass");
	}
	else
	{
		System.out.println("login unsuccessfull");
		row.createCell(3).setCellValue("login unsuccessfull-fail");
	}
	driver.navigate().back();
	FileOutputStream file2=new FileOutputStream("E:\\excel\\LoginValidation.xlsx");
	workbook.write(file2);
	
	}
}

}

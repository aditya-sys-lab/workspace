package com.newtourskeyboard;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NewToursKeyboard extends BaseTestNew {
	@Test
	public void Loginfunctionality() throws IOException, InterruptedException
	{
		FileInputStream file=new FileInputStream("./src/com/newtourskeyboard/newTours.properties");
		Properties prop=new Properties();
	    prop.load(file);
		FileInputStream file1=new FileInputStream("E:\\excel\\loginValidation.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file1);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		 int rownum=  sheet.getLastRowNum();
		 for(int i=1;i<=rownum;i++)
		 {
	   Row row=sheet.getRow(i);
	    String  login=row.getCell(0).getStringCellValue();
	    
	    WebElement  username= driver.findElement(By.name(prop.getProperty("UserName")));
	    username.sendKeys(login);
	    String login1=row.getCell(1).getStringCellValue();
	    WebElement password=driver.findElement(By.name(prop.getProperty("Password")));
	    password.sendKeys(login1);
	    WebElement  submit= driver.findElement(By.name(prop.getProperty("signIn")));
	    submit.click();
	    driver.navigate().back();
	    
	   }
	}
	}


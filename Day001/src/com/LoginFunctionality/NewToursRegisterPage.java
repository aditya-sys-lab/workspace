package com.LoginFunctionality;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NewToursRegisterPage extends BaseTest1 {
	
	@Test
	public void registerLink()
	{
	obj.findElement(By.linkText("REGISTER")).click();
	}
	@Test
	public void registrationElements() throws IOException
	{
	FileInputStream file=new FileInputStream("E:\\excel\\Register.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	XSSFSheet sheet=workbook.getSheet("Sheet1");
      for(int i=1;i<=sheet.getLastRowNum();i++)
      {
    	  Row row=sheet.getRow(i);
    	  obj.findElement(By.name("firstName")).sendKeys(row.getCell(0).getStringCellValue());
    	  obj.findElement(By.name("lastName")).sendKeys(row.getCell(1).getStringCellValue());
    	  double phone=row.getCell(2).getNumericCellValue();
    	  long phoneNo=(long)phone;
    	  String phonenum=Long.toString(phoneNo);
    	  obj.findElement(By.name("phone")).sendKeys(phonenum);
    	  obj.findElement(By.name("email")).sendKeys(row.getCell(3).getStringCellValue());
    	  obj.findElement(By.name("address1")).sendKeys(row.getCell(4).getStringCellValue());
    	  obj.findElement(By.name("address2")).sendKeys(row.getCell(5).getStringCellValue());
    	  obj.findElement(By.name("city")).sendKeys(row.getCell(6).getStringCellValue());
    	  obj.findElement(By.name("state")).sendKeys(row.getCell(7).getStringCellValue());
    	 double postel=row.getCell(8).getNumericCellValue();
    	 long Postel=(long)postel;
    	 String postelCode=Long.toString(Postel);
    	 obj.findElement(By.name("postalCode")).sendKeys(postelCode);
    	 obj.findElement(By.name("country")).sendKeys(row.getCell(9).getStringCellValue());
    	 obj.findElement(By.name("email")).sendKeys(row.getCell(10).getStringCellValue());
    	 obj.findElement(By.name("password")).sendKeys(row.getCell(11).getStringCellValue());
    	 obj.findElement(By.name("confirmPassword")).sendKeys(row.getCell(12).getStringCellValue());
    	 
    	  
      }
	}

}

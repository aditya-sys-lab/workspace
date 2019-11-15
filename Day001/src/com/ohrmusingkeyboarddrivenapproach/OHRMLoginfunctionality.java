package com.ohrmusingkeyboarddrivenapproach;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class OHRMLoginfunctionality extends OHRMBaseTest {
	
@Test
public void Loginfunctionality() throws IOException, InterruptedException
{
	FileInputStream file=new FileInputStream("./src/com/ohrmusingkeyboarddrivenapproach/OHRM.properties");
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
    WebElement  username= driver.findElement(By.id(prop.getProperty("userName")));
    username.sendKeys(login);
    String login1=row.getCell(1).getStringCellValue();
    WebElement password=driver.findElement(By.id(prop.getProperty("Password")));
    password.sendKeys(login1);
    WebElement  submit= driver.findElement(By.id(prop.getProperty("submit")));
    submit.click();
    String actual_result= driver.getTitle();
    String expected_result="HRM";
    if(actual_result.contains(expected_result))
    {
    File ohrm=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    Files.copy(ohrm, new File("./ScreenShot/OHRM.png"));
    }
    driver.findElement(By.id("welcome")).click();
    Thread.sleep(5000);
    driver.findElement(By.linkText("Logout")).click();
  
   }
}
}
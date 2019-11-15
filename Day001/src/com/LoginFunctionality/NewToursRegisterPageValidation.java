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

public class NewToursRegisterPageValidation {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Resource folder\\chromedriver.exe");
		WebDriver obj=new ChromeDriver();
	    obj.get("http://www.newtours.demoaut.com");
		obj.manage().window().maximize();
		obj.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	WebElement Registerlink=obj.findElement(By.linkText("REGISTER"));
	Registerlink.click();
	//Thread.sleep(10000);
	
     WebElement findelement=obj.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table"));   
     List<WebElement> getelements=findelement.findElements(By.xpath(""));
   FileInputStream file=new FileInputStream("E:\\excel\\Register.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(file);
   XSSFSheet sheet=workbook.getSheet("Sheet1");
   /*  for(int i=0;i<getelements.size()-1;i++)
   {
	  String elementsname=getelements.get(i).getAttribute("name");
	  System.out.println(elementsname);
	  Cell cell=row.createCell(i);
	  cell.setCellValue(elementsname);
	   }*/
  /* FileOutputStream file1=new FileOutputStream("E:\\excel\\Register.xlsx");
   workbook.write(file1);*/
   
  int rowcount= sheet.getLastRowNum();
 for(int i=1;i<=rowcount;i++)
 {
	    Row row=sheet.getRow(i);
         for(int j=0;j<getelements.size()-1;j++)
         {
       getelements.get(j).sendKeys(row.getCell(j).getStringCellValue());
       
       }
	 }
	
   
	}

	

	
}



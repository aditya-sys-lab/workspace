package com.StaticandDynamic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","E:\\chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
		
List <WebElement> col=driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th"));

int number=col.size();
for(int i=0;i<number;i++)
{
	System.out.print(col.get(i).getText());
}
System.out.println("");

List <WebElement> row=driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td"));
int numberrow=row.size();
for(int j=0;j<numberrow;j++)
{
	System.out.println(row.get(j).getText());
	}



	}

}

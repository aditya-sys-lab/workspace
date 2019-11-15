package com.seleniumtutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","E:\\chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
	driver.findElement(By.xpath("//*[@name='cusid']")).sendKeys("aditya");
	
	driver.findElement(By.xpath("//*[@name='submit']")).click();
	
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().dismiss();
		
		
	}

}

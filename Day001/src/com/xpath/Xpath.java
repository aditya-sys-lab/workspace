package com.xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		try {
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Resource folder\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://opensource-demo.orangehrmlive.com");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().pageLoadTimeout(1500, TimeUnit.SECONDS);
	      
	      driver.findElement(By.xpath("//input[id='txtUsername']")).sendKeys("Admin");
	      driver.findElement(By.xpath("//input[@id='txtPassword]")).sendKeys("admin123");
	      
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}

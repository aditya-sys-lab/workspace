package com.seleniumtutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","E:\\chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/v1/");
		
	WebElement	user=driver.findElement(By.xpath("//*[@name='uid']"));
	
	user.sendKeys("aditya");
	driver.switchTo().alert();
		
		
	}

}

package com.seleniumtutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageLink {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver","E:\\chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
WebElement facebook=driver.findElement(By.xpath("//*[@class='fb_logo img sp_7e5t6Bv450s sx_14923c']"));
System.out.println(facebook.getText());



	}

}

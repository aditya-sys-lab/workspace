package com.seleniumtutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookTagName {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","E:\\chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php");
		
		
String tagName=driver.findElement(By.id("email")).getTagName();

              System.out.println(tagName);    

		
	}

}

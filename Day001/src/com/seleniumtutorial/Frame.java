package com.seleniumtutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.softwaretestinghelp.com/");
		
		driver.findElements(By.tagName("iframe"));
		
        driver.findElement(By.linkText("Load Testing Buyer’s Guide")).click();
		
	}

}

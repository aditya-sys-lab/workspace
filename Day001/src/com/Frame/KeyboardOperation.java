package com.Frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardOperation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Resource folder\\chromedriver.exe");
		
		WebDriver obj=new ChromeDriver();
		obj.get("https://www.facebook.com/");
		obj.manage().window().maximize();
		obj.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		obj.findElement(By.id("email")).sendKeys("sivaaditya052@gmail.com");
		Actions act=new Actions(obj);
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("hellow");
		act.sendKeys(Keys.ENTER).perform();
		
	}

}

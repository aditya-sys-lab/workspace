package com.Frame;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jquery_IdentifyElement {

public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","E:\\Selenium Resource folder\\chromedriver.exe");
					
WebDriver obj=new ChromeDriver();
obj.get("https://jqueryui.com/droppable/");
obj.manage().window().maximize();
obj.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
obj.switchTo().frame(obj.findElement(By.className("demo-frame")));
WebElement dragElement=obj.findElement(By.id("draggable"));
String dragElement_Text=dragElement.getText();
WebElement dropElement=obj.findElement(By.id("droppable"));
Actions act=new Actions(obj);
act.dragAndDrop(dragElement, dropElement).perform();
obj.switchTo().defaultContent();
	}

}

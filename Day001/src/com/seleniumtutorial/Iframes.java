package com.seleniumtutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {
public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","E:\\chrome\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("http://demo.guru99.com/selenium/deprecated.html");

List <WebElement>frames=driver.findElements(By.tagName("frame"));

int numberoftags=frames.size();

System.out.println(numberoftags);

//driver.switchTo().frame("iframe1");



//driver.findElement(By.linkText("Deprecated")).click();
driver.close();



		}

}

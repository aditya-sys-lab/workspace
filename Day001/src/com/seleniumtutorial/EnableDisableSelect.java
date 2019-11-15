package com.seleniumtutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableDisableSelect {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","E:\\chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/radio.html");
		
WebElement 	radio=	driver.findElement(By.id("vfb-7-1"));

WebElement radio1=driver.findElement(By.id("vfb-7-2"));
Thread.sleep(10000);
radio.click();
Thread.sleep(10000);
radio1.click();

if(radio.isSelected())
{
	System.out.println("Option1 selected");
}
else
{
	System.out.println("Option2 is selected");
}

WebElement chk1=driver.findElement(By.id("vfb-6-0"));
chk1.click();
WebElement chk2=driver.findElement(By.id("vfb-6-1"));
chk2.click();
WebElement chk3=driver.findElement(By.id("vfb-6-2"));
chk3.click();
System.out.println(chk1.isSelected());
System.out.println(chk2.isSelected());
System.out.println(chk3.isSelected());
driver.close();		
	}

}

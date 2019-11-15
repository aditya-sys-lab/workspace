package com.seleniumtutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadandDownloadFiles {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/upload/");
		
WebElement	uploadElement=	driver.findElement(By.id("uploadfile_0"));
Thread.sleep(10000);

uploadElement.sendKeys("C:\\Users\\user\\Desktop\\GAMMA.jpg");
Thread.sleep(10000);
driver.findElement(By.id("terms")).click();
Thread.sleep(10000);

driver.findElement(By.id("submitbutton")).click();
Thread.sleep(10000);


	}

}

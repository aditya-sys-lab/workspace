package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class NewToursBaseTest3 {
	
	public WebDriver driver=null;
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","E:\\chrome\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("http://www.newtours.demoaut.com/");
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}

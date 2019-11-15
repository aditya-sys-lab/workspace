package com.Siteforge;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class SiteForgeBaseTest {
	WebDriver driver=null;

	@BeforeTest
	public void setUp() 
	{
		 System.setProperty("webdriver.chrome.driver","E:\\Selenium Resource folder\\chromedriver.exe");
	       driver=new ChromeDriver();
	      driver.get("http://www.newtours.demoaut.com");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().pageLoadTimeout(1500, TimeUnit.SECONDS);
	
	}
	@AfterTest
	public void tearDown()
	{
		
	driver.quit();
	}
	
	
}

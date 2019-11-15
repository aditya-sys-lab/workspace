package com.ohrmusingkeyboarddrivenapproach;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class OHRMBaseTest {
	WebDriver driver=null;
	@BeforeMethod
	public void setUp()
	{
		  System.setProperty("webdriver.chrome.driver","E:\\chrome\\chromedriver.exe");
	       driver=new ChromeDriver();
	      driver.get("https://opensource-demo.orangehrmlive.com");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().pageLoadTimeout(1500, TimeUnit.SECONDS);
	 }
	@AfterMethod
	public void tearDown()
	{
		
	}

	}



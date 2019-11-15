package com.pommercurytest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
WebDriver driver=null;
@BeforeTest
public void setUp()
{
	System.setProperty("webdriver.chrome.driver","E:\\chrome\\chromedriver.exe");
	
	driver=new ChromeDriver();
	
	driver.get("http://www.newtours.demoaut.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}
@AfterTest
public void tearDown()
{
	driver.close();
}
	
}

package com.LoginFunctionality;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest1 {
	
	WebDriver obj=null;
	
	@BeforeTest
	
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Resource folder\\chromedriver.exe");
		 obj=new ChromeDriver();
		
		
        obj.get("http://www.newtours.demoaut.com/mercurywelcome.php");
		obj.manage().window().maximize();
		obj.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	}
	/*@AfterTest
	public void tearDown()
	{
		obj.close();
	}*/
	
}

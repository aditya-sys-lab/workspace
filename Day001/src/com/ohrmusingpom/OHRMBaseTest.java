package com.ohrmusingpom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class OHRMBaseTest {

	WebDriver driver=null;
	@BeforeTest
	public void setUp()
	{
System.setProperty("webdriver.chrome.driver","E:\\Selenium Resource folder\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(1500, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(1500, TimeUnit.SECONDS);
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
	
}

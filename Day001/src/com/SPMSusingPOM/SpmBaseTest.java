package com.SPMSusingPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class SpmBaseTest {

public WebDriver driver=null;
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Resource folder\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("https://spms.samsungnetwork.com/common/spms/anonymous/securityLogin.spms?_frameF=true");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(1500, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(1500, TimeUnit.SECONDS);
	}
	@AfterTest
	public void tearDown()
	{
		
	}
	
}

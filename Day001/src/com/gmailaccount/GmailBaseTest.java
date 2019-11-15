package com.gmailaccount;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class GmailBaseTest {
	
	WebDriver driver=null;
       @BeforeTest
       public void setUp()
       {
    	   System.setProperty("webdriver.chrome.driver","E:\\Selenium Resource folder\\chromedriver.exe");
           driver=new ChromeDriver();
          driver.get("https://accounts.google.com/ServiceLogin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail&passive=1209600&sacu=1&ignoreShadow=0&hl=en&acui=0&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
          driver.manage().window().maximize();
          driver.manage().timeouts().pageLoadTimeout(1500, TimeUnit.SECONDS);
       }
       @AfterTest
       public void tearDown()
       {
    	  
       }
       
}

package com.Actionsclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class ActionsonFacebook {

	public static void main(String[] args) throws IOException {
	
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Resource folder\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      
	      driver.get("https://www.facebook.com/");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().pageLoadTimeout(1500, TimeUnit.SECONDS);
	      
	      System.out.println(driver.getTitle());
	    
	      
	      driver.findElement(By.name("firstname")).sendKeys("Aditya");
	      driver.findElement(By.name("lastname")).sendKeys("MohanaSiva");
	      driver.findElement(By.name("reg_email__")).sendKeys("9849837280");
	      driver.findElement(By.name("reg_passwd__")).sendKeys("aditya@123");
	      WebElement dropdown=driver.findElement(By.id("day"));
	      Select dropdownelement=new Select(dropdown);
	      dropdownelement.selectByIndex(12);
	     WebElement dropdown1= driver.findElement(By.id("month"));
	   Select dropdown1element=new Select(dropdown1);
	   dropdown1element.selectByVisibleText("Nov");
WebElement	dropdown2=driver.findElement(By.id("year"));
	      Select dropdown2element=new Select(dropdown2);
	      dropdown2element.selectByValue("1990");
	      
	      WebElement femaleradiobutton=driver.findElement(By.name("sex"));
	      
	      femaleradiobutton.click();
	      
	     File accountdetails=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     Files.copy(accountdetails,new File("./ScreenShot/FBaccount.png "));
	      
	      

	}

}

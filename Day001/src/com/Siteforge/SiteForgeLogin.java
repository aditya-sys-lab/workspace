package com.Siteforge;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SiteForgeLogin extends SiteForgeBaseTest {

	@Test(priority=1)
	public void Siteforgelogin() throws InterruptedException
    
	{
		
	driver.findElement(By.id("identifierId")).sendKeys("sivaaditya052@gmail.com");
	driver.findElement(By.className("CwaK9")).click();
	 Thread.sleep(10000);
	}
	@Test(priority=2)
	public void SiteforgePassword()
	{
	
	driver.findElement(By.name("password")).sendKeys("9849837280");
	driver.findElement(By.className("CwaK9")).click();	
	}
	
	
}

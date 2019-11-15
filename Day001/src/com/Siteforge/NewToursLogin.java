package com.Siteforge;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NewToursLogin extends SiteForgeBaseTest {
	
	
	@Test(priority=1)
	public void NewToursregister() throws InterruptedException
	{
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(500);
		driver.navigate().back();
	}
	@Test(priority=2)
	public void NewToursLogin()
	{
		driver.findElement(By.name("userName")).sendKeys("tutorials");
		driver.findElement(By.name("password")).sendKeys("tutorials");
		driver.findElement(By.name("login")).click();
	}
	
	
}

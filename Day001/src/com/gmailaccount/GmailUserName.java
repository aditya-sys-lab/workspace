package com.gmailaccount;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GmailUserName extends GmailBaseTest {

	@Test(priority=1)
	public void GmailAccount() throws InterruptedException
	{
		driver.findElement(By.id("identifierId")).sendKeys("sivaaditya052@gmail.com");
		driver.findElement(By.className("CwaK9")).click();
		Thread.sleep(5000);
	}
	@Test(priority=2)
	public void gmailPassword() throws InterruptedException
	{
		
		driver.findElement(By.name("password")).sendKeys("9849837280");
		driver.findElement(By.className("CwaK9")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//*[@class='gb_Ba gbii']")).click();
		Thread.sleep(5000);
driver.findElement(By.linkText("Sign out")).click();	
}
	
	
	
}

package com.SPMSusingPOM;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class spmsloginelement extends SpmBaseTest{
	
	@Test(priority=1)
	public void id()
	{
	SPMSLinks	id=PageFactory.initElements(driver, SPMSLinks.class);
	 
	id.id();
	 }
	@Test(priority=2)
	public void password()
	{
	SPMSLinks	password=PageFactory.initElements(driver, SPMSLinks.class);
		password.password();
	}
	@Test(priority=3)
	public void login() throws InterruptedException
	{
	SPMSLinks	login=PageFactory.initElements(driver, SPMSLinks.class);
	login.login();
	}

}

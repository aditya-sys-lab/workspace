package com.SPMSusingPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SPMSLinks {
	
	@FindBy(id="id")
	WebElement id;
	@FindBy(id="pass")
	WebElement password;
	@FindBy(linkText="login")
	WebElement login;
	
public void id()
	{
		id.sendKeys("Sivaadityas1");
	}
public void password()
{
	password.sendKeys("2w4p8e8n6o");
}
public void login()
{
	login.click();
}

}

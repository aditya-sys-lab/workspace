package com.newtoursPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewToursLogInPage {
	

	@FindBy(linkText="SIGN-ON")
	WebElement signon;
	
	@FindBy(linkText="REGISTER")
	WebElement register;
	
	public void signON()
	{
		signon.click();
	}
	public void register()
	{
		register.click();
	}
	
	
}

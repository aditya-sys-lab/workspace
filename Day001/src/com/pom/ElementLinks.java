package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementLinks {
	
	@FindBy(linkText="SIGN-ON")
	WebElement signon;
	@FindBy(linkText="REGISTER")
	WebElement register;
	@FindBy(linkText="SUPPORT")
	WebElement support;
	@FindBy(linkText="CONTACT")
	WebElement contact;
	
	public void signon()
	{
		signon.click();
	}
	public void register()
	{
		register.click();
	}
	public void support()
	{
		support.click();
	}
	public void contact()
	{
		contact.click();
	}

}

package com.pommercury;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MercuryLogin {

@FindBy(linkText="REGISTER")
WebElement register;
@FindBy(linkText="CONTACT")
WebElement contact;
public void register()
{
	register.click();
}
public void contact()
{
	contact.click();
}

}

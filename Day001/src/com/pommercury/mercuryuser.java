package com.pommercury;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class mercuryuser    {
	
	
@FindBy(name="userName")
WebElement username;
@FindBy(name="password")
WebElement password;
@FindBy(name="login")
WebElement login;
@FindBy(tagName="a")
List <WebElement> elements;
public void username()
{
	username.sendKeys("admin");
}
public void password()
{
	password.sendKeys("admin");
}
public void login()
{
	login.click();
}
public void numberofelements()
{
	for(int i=0;i<elements.size();i++)
	{
		System.out.println(elements.get(i).getText());
	}
}

}

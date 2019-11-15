package com.pommercurytest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pommercury.MercuryLogin;
import com.pommercury.mercuryuser;

public class mercurylogintest extends BaseTest {
	
	
@Test(enabled=false)
public void register()
{
	MercuryLogin register=PageFactory.initElements(driver,MercuryLogin.class);
	register.register();
}
@Test(enabled=false)
public void contact()
{
	MercuryLogin contact=PageFactory.initElements(driver,MercuryLogin.class);
	contact.contact();
}
@Test(enabled=false)
public void userName()
{
	mercuryuser username=PageFactory.initElements(driver,mercuryuser.class);
	username.username();
}
@Test(enabled=false)
public void password()
{
	mercuryuser password=PageFactory.initElements(driver, mercuryuser.class);
	password.password();
}
@Test(enabled=false)
public void login()
{
	mercuryuser login=PageFactory.initElements(driver, mercuryuser.class);
	login.login();
	
}
@Test
public void numofelements()
{
	mercuryuser elements=PageFactory.initElements(driver, mercuryuser.class);
	elements.numberofelements();
}

}

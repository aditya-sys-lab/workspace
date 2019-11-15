package com.Testn;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GmailUsingTestNG {
@BeforeTest
	public void gmailApplicationLaunch()
	{
		System.out.println("gmailApplicationLaunch");
	}

@Test(priority=1)
	public void gmailApplicationSignin()
	{
		System.out.println("gmailApplicationSignin");
	}
@Test(priority=2)
public void Application()
{
	System.out.println("Application");
}
@AfterTest
public void gmailApplicationLogout()
{
	System.out.println("gmailApplicationLogout");
}

}

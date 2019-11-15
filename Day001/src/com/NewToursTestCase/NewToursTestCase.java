package com.NewToursTestCase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.newtoursPOM.NewToursLogInPage;
import com.pom.NewToursBaseTest3;

public class NewToursTestCase extends NewToursBaseTest3 {
	
	
@Test(priority=1)
public void signON()
{
	NewToursLogInPage logInPage=PageFactory.initElements(driver,NewToursLogInPage.class);
	
	logInPage.signON();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
}
	@Test(priority=2)
	public void register()
	{
		NewToursLogInPage registerPage=PageFactory.initElements(driver,NewToursLogInPage.class);
		registerPage.register();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

}

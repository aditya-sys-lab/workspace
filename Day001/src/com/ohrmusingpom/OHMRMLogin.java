package com.ohrmusingpom;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class OHMRMLogin extends OHRMBaseTest {
	
	@Test(priority=1)
	public void username()
	{
OHRMObjectRepository	username=PageFactory.initElements(driver, OHRMObjectRepository.class);
username.username();
	}
	@Test(priority=2)
	public void password()
	{
OHRMObjectRepository password=PageFactory.initElements(driver, OHRMObjectRepository.class);
password.password();
		}
	@Test(priority=3)
	public void login()
	{
		OHRMObjectRepository login=PageFactory.initElements(driver, OHRMObjectRepository.class);
login.login();
	}
@Test(priority=4)
	public void Admin()
	{
OHRMObjectRepository adminModule=PageFactory.initElements(driver, OHRMObjectRepository.class);
adminModule.Admin();
		}
	@Test(priority=5)
	public void PIM()
	{
		OHRMObjectRepository pimModule=PageFactory.initElements(driver, OHRMObjectRepository.class);
		pimModule.PIM();
		
	}

	
}

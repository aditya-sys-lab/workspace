package com.ohrmusingpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class OHRMObjectRepository extends OHRMBaseTest {
	
@FindBy(id="txtUsername")
WebElement username;
@FindBy(id="txtPassword")
WebElement password;
@FindBy(id="btnLogin")
WebElement login;
@FindBy(id="menu_admin_viewAdminModule")
WebElement Admin;
@FindBy(id="menu_pim_viewPimModule")
WebElement PIM;

public void username()
{
	username.sendKeys("Admin");
}
public void password()
{
	password.sendKeys("admin123");
}
public void login()
{
	login.click();
}
public void Admin()
{
	Admin.click();
}

public void PIM()
{
 

 }

}

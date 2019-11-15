package com.keyboardDataDrivenApproach;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class OrangeHRMlogin extends BaseTest {
	
	@
	Test
	public void Login() throws IOException
	{
		FileInputStream file=new FileInputStream("./src/com/keyboardDataDrivenApproach/login.properties");
		
		Properties prop=new Properties();
		prop.load(file);
		driver.findElement(By.id(prop.getProperty("UserName"))).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id(prop.getProperty("Password"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id(prop.getProperty("login"))).click();
	}

}

package KeyboardDrivenapproach;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NewToursLogin extends BaseTest {

	@Test
	public void Login() throws IOException
	{
		FileInputStream file=new FileInputStream("./src/com/keyboardapproach/new.properties");
		Properties prop=new Properties();
		prop.load(file);
	WebElement username=driver.findElement(By.name(prop.getProperty("userName")));
	username.sendKeys("tutorial");
	WebElement password=driver.findElement(By.name(prop.getProperty("Password")));
	password.sendKeys("tutorial");
	WebElement login=driver.findElement(By.name(prop.getProperty("Sign-In")));
	login.click();
		
	}
	
}

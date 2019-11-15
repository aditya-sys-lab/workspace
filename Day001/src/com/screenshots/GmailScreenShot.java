package com.screenshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class GmailScreenShot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Resource folder\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://accounts.google.com/signin/v2/sl/pwd?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Ftab%3Dwm%26ogbl&scc=1&authuser=0&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

	      driver.manage().window().maximize();
	      
	      driver.manage().timeouts().pageLoadTimeout(1500, TimeUnit.SECONDS);
	      
	     File gmailScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     
	     Files.copy(gmailScreenShot, new File("./ScreenShot/gmail.png"));
	     driver.quit();
	}

}

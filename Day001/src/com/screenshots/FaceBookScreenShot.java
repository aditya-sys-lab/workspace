package com.screenshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class FaceBookScreenShot {

	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Resource folder\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      
	      driver.get("https://www.facebook.com/");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().pageLoadTimeout(1500, TimeUnit.SECONDS);
	      
	  File  faceBookScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  Files.copy(faceBookScreenShot, new File("./ScreenShot/facebook.png"));
	  driver.quit();

	}

}

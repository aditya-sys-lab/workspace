package com.screenshots;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ChromeScreenShot {

	public static void main(String[] args) throws IOException {
		
      System.setProperty("webdriver.chrome.driver","E:\\Selenium Resource folder\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.google.com/");
      
      driver.manage().window().maximize();
      
      File chromeScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      
      Files.copy(chromeScreenShot,new File("./ScreenSho/Chorome.png"));
		}
      

}

package com.seleniumtutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumWebDriverScript {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","E:\\chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		String expectedTittle="Welcome: Mercury Tours";

		String actualTittle=driver.getTitle();
		
		if(actualTittle.contains(expectedTittle))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		driver.close();
			
			
	}

}

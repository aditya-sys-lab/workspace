package DropDown;


import java.util.List;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TotalNumofElements {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","E:\\Selenium Resource folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.newtours.demoaut.com");
		
		driver.manage().window().maximize();
		
		WebElement registerlink=driver.findElement(By.linkText("REGISTER"));
		registerlink.click();
		
		
		WebElement country=driver.findElement(By.name("country"));
		Actions act=new Actions(driver);
		act.moveToElement(country).perform();
		//country.click();
	List<WebElement>countryname=country.findElements(By.tagName("option"));
	
	for(int i=0;i<countryname.size();i++)
	{
		String name=countryname.get(i).getText();
		System.out.println(name);
	}
		
	}

}

package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Selectionprocess {
	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","E:\\Selenium Resource folder\\chromedriver.exe");
					
					WebDriver driver=new ChromeDriver();
					
					driver.get("https://my.monsterindia.com/sponsered_popup.html");
					
					driver.manage().window().maximize();
				WebElement	currentlocation=driver.findElement(By.className("border_grey1"));
				
				Select selection=new Select(currentlocation);
				
				selection.selectByVisibleText("Delhi");
				
				WebElement industry=driver.findElement(By.id("id_industry"));
				
				Select selection1=new Select(industry);
				
				selection1.selectByIndex(5);
				
				
				
				
				
										
				
					
	}

}

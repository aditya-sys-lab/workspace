package com.keyboardDataDrivenApproach;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NewToursApplicationLinElements extends BaseTest {
	
	@Test
	public void numOfLinks()
	{
List	<WebElement> numberOFLinks=driver.findElements(By.tagName("a"));
 
int elements= numberOFLinks.size();
System.out.println(elements);
	}

}

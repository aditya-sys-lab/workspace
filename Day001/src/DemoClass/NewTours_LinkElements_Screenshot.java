package DemoClass;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class NewTours_LinkElements_Screenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
System.setProperty("webdriver.chrome.driver","E:\\Selenium Resource folder\\chromedriver.exe");
		
		WebDriver obj=new ChromeDriver();
		obj.get("http://www.newtours.demoaut.com");
		obj.manage().window().maximize();
		obj.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	    List<WebElement> linkelements=obj.findElements(By.tagName("a"));
		
for(int i=0; i<linkelements.size();i++)
{
	linkelements.get(i).click();
    Thread.sleep(10000);
	obj.navigate().back();
	obj.getWindowHandle().toString();
	
	
}
	}

	}




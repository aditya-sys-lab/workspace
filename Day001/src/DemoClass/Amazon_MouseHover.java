package DemoClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_MouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Resource folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		  WebElement hellowsignin=driver.findElement(By.id("nav-link-accountList"));
	
		  Actions act=new Actions(driver);
		  
		  act.moveToElement(hellowsignin).perform();
		  //<span class="nav-text">Your Wish List</span>
		  
		  driver.findElement(By.linkText("Your Orders")).click();
	}

}

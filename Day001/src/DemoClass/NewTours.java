package DemoClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("u_0_m")).sendKeys("Aditya");
		driver.findElement(By.id("u_0_o")).sendKeys("k");
		driver.findElement(By.id("u_0_r")).sendKeys("9849837280");
		driver.findElement(By.id("u_0_y")).sendKeys("aditya123@1");
		
		
    	//	<input type="text" name="userName" size="10">
	WebElement	female=driver.findElement(By.id("u_0_6"));
	 
	            female.click();
	            
    WebElement male=driver.findElement(By.id("u_0_7"));
    
            male.click();
	            
	            
	        
	}

}

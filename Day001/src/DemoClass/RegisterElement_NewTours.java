package DemoClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterElement_NewTours {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","E:\\Selenium Resource folder\\chromedriver.exe");

              WebDriver driver=new ChromeDriver();
              
              driver.get("http://www.newtours.demoaut.com/");
              
              driver.manage().window().maximize();

          //    <a href="mercuryregister.php?osCsid=1cd0640a2f42372099ad99724773c17a">REGISTER</a>
  
              driver.findElement(By.partialLinkText("REG")).click();
              
              driver.navigate().back();
              
              driver.findElement(By.linkText("SIGN-ON")).click();;
                    
            
             System.out.println(driver.getTitle());
            System.out.println(driver.getCurrentUrl()); 

            System.out.println(driver.getWindowHandle());
              
	}

}

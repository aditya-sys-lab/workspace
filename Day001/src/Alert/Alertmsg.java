package Alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertmsg {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Resource folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
						
		driver.get("https://www.tsrtconline.in/oprs-web/");
						
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);	
WebElement	availability=driver.findElement(By.id("searchBtn"));

availability.click();

            Alert alert=driver.switchTo().alert();

            String alertmsg=alert.getText();
            System.out.println(alertmsg);
            alert.accept();
            
	}

}

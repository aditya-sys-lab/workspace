package DemoClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtours_getAttribute {
	
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","E:\\Selenium Resource folder\\chromedriver.exe");
		
		WebDriver obj=new ChromeDriver();
		obj.get("http://www.newtours.demoaut.com/");
		obj.manage().window().maximize();
		//<a href="mercuryregister.php">REGISTER</a>
	String	registerlink=obj.findElement(By.linkText("REGISTER")).getAttribute("href");
	System.out.println(registerlink);
	
	String currenturl=obj.getCurrentUrl();
	System.out.println(currenturl);
	
	}
	

}

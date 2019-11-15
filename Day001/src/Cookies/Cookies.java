package Cookies;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver","E:\\Selenium Resource folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
						
		driver.get("https://www.tsrtconline.in/oprs-web/");
						
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);	
	
Set<Cookie>cookies=driver.manage().getCookies();
for(int i=0;i<cookies.size();i++)
{
	}
	}

}

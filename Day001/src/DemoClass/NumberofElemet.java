package DemoClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NumberofElemet {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Resource folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
driver.manage().window().maximize();		
	//	<input name="txtUsername" id="txtUsername" type="text">
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");;
		
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		
		driver.findElement(By.id("btnLogin")).click();
		
		//<a href="#" id="welcome" class="panelTrigger activated-welcome">Welcome Admin</a>

	WebElement	WelcomeAdmin=driver.findElement(By.id("welcome"));
	
	System.out.println("The Text of WelcomAdmin Element is:"+WelcomeAdmin.getText());
	
	 List <WebElement> links=driver.findElements(By.tagName("a"));
	 
	 int countoflink=links.size();
	 
	 System.out.println("The number of links count is:"+countoflink);
	 for(int i=0;i<links.size();i++)
	 {
		 if(links.get(i).isDisplayed())
		 {
			 System.out.println("The name of each linkelement are:"+links.get(i).getText());
		 }
		 }
	  //<a href="/index.php/auth/logout">Logout</a>
	 //Thread.sleep(10000);
	//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
	//driver.findElement(By.id("welcome")).click();
	//Thread.sleep(10000);
	//driver.findElement(By.linkText("Logout")).click();
	 //driver.close();
	}

}

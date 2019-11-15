package DemoClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TsrtcElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Resource folder\\chromedriver.exe");
		WebDriver obj=new ChromeDriver();
		obj.get("https://www.tsrtconline.in");
		obj.manage().window().maximize();
		obj.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		WebElement element=obj.findElement(By.className("menu"));
		List<WebElement> linkelement=element.findElements(By.tagName("a"));
		for(int i=0;i<linkelement.size();i++)
		{
		String elementname=	linkelement.get(2).getText();
		System.out.println(elementname);
		linkelement.get(2).click();
		Thread.sleep(10000);
		obj.navigate().back();

		
		
		}

	}

}

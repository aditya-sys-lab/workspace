package DemoClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SceenShot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","E:\\chrome\\chromedriver.exe");
		
		WebDriver obj=new ChromeDriver();
		obj.get("https://opensource-demo.orangehrmlive.com/");
		obj.manage().window().maximize();
		
		obj.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		File chromescreenshot=((TakesScreenshot)obj).getScreenshotAs(OutputType.FILE);
       
		
		Files.copy(chromescreenshot,new File("E:\\SeleniumClassWork\\Screenshots\\chrome.png"));
	}

}

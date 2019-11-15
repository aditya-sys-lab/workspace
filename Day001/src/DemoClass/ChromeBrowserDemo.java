package DemoClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Resource folder\\chromedriver.exe");
		
		WebDriver obj=new ChromeDriver();
		
		obj.get("https://accounts.google.com/ServiceLogin/identifier?continue=https%3A%2F%2Fwww.google.com%2Fsearch%3Fei%3DN_ARXZTtCNuA9QPiqrv4Dw%26q%3Dgmail%26oq%3Dgmai%26gs_l%3Dpsy-ab.3.0.35i39l2j0i131j0i67l2j0j0i67j0l2j0i67.1791.2797..4734...0.0..0.178.628.0j4......0....1..gws-wiz.......0i71j0i131i67.Fw1Jl-FN37Q&passive=1209600&sacu=1&ignoreShadow=0&hl=en&acui=0&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		obj.manage().window().maximize();	
		
		obj.findElement(By.name("identifier")).sendKeys("sivaaditya052@gmail.com");
		
		//<span jsslot="" class="CwaK9"><span class="RveJvd snByac">Next</span></span>
		obj.findElement(By.className("CwaK9")).click();
	
		
		obj.findElement(By.className("whsOnd zHQkBf")).sendKeys("9849837280");
		
		// <span class="RveJvd snByac">Next</span>
		obj.findElement(By.className("RveJvd snByac")).click();
		
		obj.close();
		
		
		
	}
	
}

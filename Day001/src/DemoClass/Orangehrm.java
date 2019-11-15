package DemoClass;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Orangehrm {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Resource folder\\chromedriver.exe");
	     		
		WebDriver obj=new ChromeDriver();
		
		obj.get("https://opensource-demo.orangehrmlive.com/");
		
		obj.manage().window().maximize();
		
		obj.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		obj.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		obj.findElement(By.id("btnLogin")).click();
		
		//WebElement findelement=obj.findElement(By.className("menu"));
		
		WebElement Pimelement=obj.findElement(By.id("menu_pim_viewPimModule"));
	    
		Actions act=new Actions(obj);      
	    
		act.moveToElement(Pimelement).perform();
	    
		obj.findElement(By.id("menu_pim_addEmployee")).click();     	        
	    
		WebElement EmpName=obj.findElement(By.id("firstName"));
	    
		EmpName.sendKeys("Aditya");
	    
		String Empname=EmpName.getAttribute("value");
	    
		WebElement Emplastname=obj.findElement(By.id("lastName"));
		
		Emplastname.sendKeys("MohanaSiva");
		
		WebElement getempid=obj.findElement(By.name("employeeId"));
        
		String EmpId= getempid.getAttribute("value");
        
		System.out.println("The Employee Id of New Employee is:"+EmpId);
	    
		obj.findElement(By.id("btnSave")).click();
	    
		obj.findElement(By.id("menu_pim_viewEmployeeList")).click(); 
	    
		WebElement getname=obj.findElement(By.id("empsearch_employee_name_empName"));
	    
		getname.sendKeys(Empname);
        
		WebElement getid=obj.findElement(By.id("empsearch_id"));
	    
		getid.sendKeys(EmpId);
	    
		obj.findElement(By.id("searchBtn")).click();
		obj.close();
}
}
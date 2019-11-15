package com.TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestNGTutorial {
WebDriver driver=null;
@BeforeMethod
public void setUp()
{
System.setProperty("webdriver.chrome.driver","E:\\chrome\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("http://www.newtours.demoaut.com/");
driver.manage().window().maximize();
}
@Test(priority=1)
public void username()
{
driver.findElement(By.name("userName")).sendKeys("admin");
}
@Test(priority=2)
public void password()
{
driver.findElement(By.name("password")).sendKeys("admin");
}
@Test(priority=3)
public void login()
{
driver.findElement(By.name("login")).click();
}
@AfterMethod
public void tearDown()
{
driver.close();
}
}

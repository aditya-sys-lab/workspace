package com.pom;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ElementsClick extends NewToursBaseTest3 {

@Test(priority=1)
public void signon()
{
ElementLinks	elementLinks=PageFactory.initElements(driver, ElementLinks.class);

     elementLinks.signon();
     System.out.println(driver.getTitle());
}
@Test(priority=2)
public void register()
{
ElementLinks	elementLinks=PageFactory.initElements(driver, ElementLinks.class);
elementLinks.register();
System.out.println(driver.getTitle());
}
@Test(priority=3)
public void contact()
{
ElementLinks	elementLinks=PageFactory.initElements(driver, ElementLinks.class);
elementLinks.contact();
}
@Test(priority=4)
public void support()
{
ElementLinks elementLinks=PageFactory.initElements(driver, ElementLinks.class);
elementLinks.support();
}




	
}

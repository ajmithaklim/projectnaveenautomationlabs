package NaveenprojectTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Naveenprojectpages.Registerpages;

public class RegisterTest {
	WebDriver driver;
	 
	@BeforeTest
	 public void setup()
		{
		driver=new ChromeDriver();
	    driver.get("https://naveenautomationlabs.com/opencart/");                                                                                                                                                             //driver = new ChromeDriver();
	   // driver.navigate().to("https://suruma.in/user-register");
        }
    
@Test
public void register() throws InterruptedException
{
Thread.sleep(6000);
Registerpages ob = new Registerpages(driver);

ob.myaccount();
ob.register();
ob.setValues1("anu","M");
ob.setValues2("ccdcccccccccchhvvmmjj@gmail.com","1234456774");
ob.setValues3("anu@123","anu@123");
ob.newsletter();
ob.checkbox();
ob.continuebox1();
ob.continue2();
}
}



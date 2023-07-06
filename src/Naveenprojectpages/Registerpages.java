package Naveenprojectpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registerpages {
	WebDriver driver;
	//object repository
	By Nmyacount = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/i");
	By Nregister =By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a");
	//By sphone =By.name("phone");
	//By ssubmit=By.xpath("/html/body/div[1]/div/section/div/div/div/form/div/div[5]/button");
	
 By Nname= By.name("firstname");
 By Nlastname= By.name("lastname");
 By Nemail=By.name("email");
 By Nphonenumber=By.name("telephone");
 By Npassword=By.name("password");
 By Nconfirmpassword=By.name("confirm");
 By Nnewsletter=By.name("newsletter");
 By Ncheckbox=By.xpath("//input[@type='checkbox']");
 By Ncontinue=By.xpath("//input[@type='submit']");
 By Nconti=By.xpath("//*//*[@id=\"content\"]/div/div/a");//*[@id="content"]/div/div/a
 
	public Registerpages(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void myaccount() {
		driver.findElement(Nmyacount).click();
		}
	public void register() {
		driver.findElement(Nregister).click();
}
	public void setValues1(String firstname,String lastname) {
		driver.findElement(Nname).sendKeys(firstname);
		driver.findElement(Nlastname).sendKeys(lastname);
	}
	public void setValues2(String email,String phonenumber) {
		driver.findElement(Nemail).sendKeys(email);
		driver.findElement(Nphonenumber).sendKeys(phonenumber);
}
	public void setValues3(String password,String confirmpassword) {
		driver.findElement(Npassword).sendKeys(password);
		driver.findElement(Nconfirmpassword).sendKeys(confirmpassword);
	}
	public void newsletter()
	{
		driver.findElement (Nnewsletter).click();
	}
	public void checkbox()
	{
		driver.findElement (Ncheckbox).click();
	}
	public void continuebox1()
	{
		driver.findElement (Ncontinue).click();
	}
	public void continue2()
	{
		driver.findElement (Nconti).click();
	}
	

}

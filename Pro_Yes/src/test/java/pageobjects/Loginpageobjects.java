package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpageobjects 
{

	public WebDriver ldriver;
	public Loginpageobjects (WebDriver rdriver)
	{
           ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	
		}
	
	
	
    
    
	@FindBy(xpath="//input[@class=\"inputtext _55r1 _6luy\" and @name='email']")
	@CacheLookup
	WebElement txtemail;
	
	@FindBy(xpath="//input[@class=\"inputtext _55r1 _6luy\" and @name=\"pass\"]")
     @CacheLookup
	WebElement txtpassword;	
	
	@FindBy(xpath="//*[@name=\"login\"]")
     @CacheLookup
     WebElement btnlogin;	
	
	public void clicklogin() throws InterruptedException
	{
		
		Thread.sleep(1200);
	}
	
	public void setUsername(String uname)
	{
		txtemail.clear();
		txtemail.sendKeys(uname);
	
	}
	public void setPassword(String pwd)
	{
		txtpassword.clear();
		txtpassword.sendKeys(pwd);
		
	}
	public void clickbtnlogin()
	{
		btnlogin.click();
		
	}
	
	}
	
	

	
	



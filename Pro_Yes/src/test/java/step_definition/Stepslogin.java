package step_definition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Loginpageobjects;

public class Stepslogin{
	
	public static WebDriver driver;
	public Loginpageobjects lp;
	@Given("User launch chromebrowser")
	public void user_launch_chromebrowser() throws InterruptedException {
		//driver.manage().window().maximize();
	   System.setProperty("webdriver.chrome.driver","C://Sel drivers/chromedriver.exe");
		driver = new ChromeDriver();
	     lp = new Loginpageobjects(driver);
	    
	}

	@When("User enters Url {string}")
	public void user_enters_Url(String Url)throws InterruptedException {
	    driver.get(Url);
	}

	
	

	@When("User enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) {
		lp.setUsername(email);
		lp.setPassword(password);
		
	   
	}

	@Then("User click on login")
	public void user_click_on_submit()throws InterruptedException {
	    lp.clickbtnlogin();
	}


}

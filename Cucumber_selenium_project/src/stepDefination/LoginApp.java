package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class LoginApp 
{
	WebDriver driver;
	@Given("^valid url and launch browser$")
	public void valid_url_and_launch_browser() 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:/Chromedriver/chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");	
	}

	@When("^I enter valid username and password$")
	public void i_enter_valid_username_and_password() 
	{
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("demo@123");
	}
	@Then("^Login successfully$")
	public void login_successfully() 
	{
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
	}

}

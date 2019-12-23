package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstCuCumberTest {
	WebDriver driver;
	@Given("The user is on the DemoWebShop homepage")
	public void the_user_is_on_the_TestMeApp_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver","C:/Sarthak/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
	}

	@When("The user gives valid login and valid password")
	public void the_user_gives_valid_login_and_valid_password() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.name("Email")).sendKeys("karthik456@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("karthik456");
		//driver.findElement(By.className("button-1")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@Then("User should be able to login")
	public void user_should_be_able_to_login() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("Login Successful");
		driver.close();
	}
	
	
	

}

package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoWebShop {
	WebDriver driver;
	@Given("DemoWebShop page is open and SignIn page is displayed")
	public void demowebshop_page_is_open_and_SignIn_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver","C:/Sarthak/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
	}

	@When("I provide {string} and {string}")
	public void i_provide_and(String Login, String Password) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		 driver.findElement(By.linkText("Log in")).click();
		 driver.findElement(By.id("Email")).sendKeys(Login);
		 driver.findElement(By.id("Password")).sendKeys(Password);
		 driver.findElement(By.cssSelector("input[value='Log in']")).click();

	}

	@Then("The relevant login name is displayed")
	public void the_relevant_login_name_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("Login successful");
		driver.close();
	}


}

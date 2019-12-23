package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Background {
	WebDriver driver;
	@Given("john launched chrome browser")
	public void john_launched_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver","C:/Sarthak/chromedriver.exe");
		driver=new ChromeDriver();
		
	}

	@Given("provided TestMeApp site url")
	public void provided_TestMeApp_site_url() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}

	@When("he clicks on login")
	public void he_clicks_on_login() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.linkText("SignIn")).click();
	}

	@Then("he shall be able to provide credentials")
	public void he_shall_be_able_to_provide_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
	}

	@When("he clicks on register link")
	public void he_clicks_on_register_link() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("he shall be able to provide registration details")
	public void he_shall_be_able_to_provide_registration_details() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("he clicks on wishlist")
	public void he_clicks_on_wishlist() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("he shall be able to view his wishlist")
	public void he_shall_be_able_to_view_his_wishlist() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}


}

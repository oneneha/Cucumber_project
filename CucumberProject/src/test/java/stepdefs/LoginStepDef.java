package stepdefs;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	 WebDriver driver=BaseClass.driver;
	
	@Given("I have Launched the application URL")
	public void i_have_Launched_the_application_URL() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://simplilearn.com/");
	}

	@Given("I click on Login Link")
	public void i_click_on_Login_Link() {
	    // Write code here that turns the phrase above into concrete actions
	 WebElement loginlink =driver.findElement(By.linkText("Log in"));
	 loginlink.click();
	    
	}
	
	@When("I enter username")
	public void i_enter_username() {
	    // Write code here that turns the phrase above into concrete actions
		 WebElement userName =driver.findElement(By.name("user_login"));
		 userName.sendKeys("jhaneha1897@gmail.com");
	}

	@When("I enter password")
	public void i_enter_password() {
	    // Write code here that turns the phrase above into concrete actions
		 WebElement Password =driver.findElement(By.name("user_pwd"));
		 Password.sendKeys("Ssuman@971648");    
	}
	@When("i click on login button")
	public void i_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	   WebElement loginButoon=driver.findElement(By.name("btn_login"));
	   loginButoon.click();
	}

	@Then("I land on home page")
	public void i_land_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	@When("I enter username as {string}")
	public void i_enter_username_as(String UsernameVal) {
	    // Write code here that turns the phrase above into concrete actions
		 WebElement userName =driver.findElement(By.name("user_login"));
		 userName.sendKeys(UsernameVal);

	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String PasswordVal) {
	    // Write code here that turns the phrase above into concrete actions
		 WebElement Password =driver.findElement(By.name("user_pwd"));
		 Password.sendKeys(PasswordVal);    
	
	}

	@Then("I should get the error message as {string}")
	public void i_should_get_the_error_message_as(String exp_msg) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement error_msg = driver.findElement(By.name("error_msg"));
		 String act_msg=error_msg.getText();
		 Assert.assertEquals(exp_msg,act_msg);
	}
	@Then("I should see below login options on the screen")
	public void i_should_see_below_login_options_on_the_screen(List<String> Options) {
	    // Write code here that turns the phrase above into concrete actions
          for(String option:Options) {
			
			WebElement LoginOption = driver.findElement(By.xpath("//button[@data-clickedtype='" + option + "']"));
			Assert.assertTrue(LoginOption.isDisplayed());
		}

			 
	}



}

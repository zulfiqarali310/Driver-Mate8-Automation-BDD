package com.DM8.Android.TestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import com.DM8.Android.Locators.LoginPage_Locators;
import com.DM8.Android.Locators.SplashesPermission_Screen_Locators;
import com.DM8.Common.BaseClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginScreen_TestCases extends BaseClass {

	private static Logger log = LogManager.getLogger(LoginScreen_TestCases.class);
	LoginPage_Locators Login = new LoginPage_Locators(driver);

	@Given("^User is on Get Started Screen$")
	public void user_is_on_get_started_screen() throws Throwable {
		log.info("User is on Get Started Screen");

	}

	@When("^Click to Enter Driver Code as \"([^\"]*)\"$")
	public void click_to_enter_driver_code_as_something(String drivercode) throws Throwable {

		Login.WriteCode(drivercode);
		// Login.WriteCode(prop.getProperty("DriverCode"));

	}
	
	 @And("^Click On Register button$")
	    public void click_on_register_button() throws Throwable {
		 Thread.sleep(2000);
		 Login.ClickOnRegister();
	    }

	@Then("^User Move to login screen$")
	public void user_move_to_login_screen() throws Throwable {

		log.info("User Move to login screen");
	}

	@Given("^User is on Login Screen$")
	public void user_is_on_login_screen() throws Throwable {
		log.info("User is on Login Screen");
	}

	@When("^Click to Enter Username as \"([^\"]*)\"$")
	public void click_to_enter_username_as_something(String username) throws Throwable {
		Login.EnterUsername(username);
	}

	@And("^Click to Enter Password as \"([^\"]*)\"$")
	public void click_to_enter_password_as_something(String password) throws Throwable {
		Login.EnterPassword(password);
	}

	@And("^Click On Login button$")
	public void click_on_login_button() throws Throwable {
		Login.ClickOnLoginrButton();
	}

	@Then("^User Login into the Driver Mate8 Application$")
	public void user_login_into_the_driver_mate8_application() throws Throwable {
		log.info("User Login into the Driver Mate8 Application");
	}

}

package com.DM8.Android.TestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.DM8.Common.BaseClass;
import com.aventstack.extentreports.GherkinKeyword;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage_TestCases extends BaseClass {

	private static Logger log = LogManager.getLogger(LoginPage_TestCases.class);

	@Given("^DM8 Application has already lunched$")
	public void dm8_application_has_already_lunched() throws Throwable {
		log.info("user has been entered into the OS section of the app!");

	}

	@When("^I enter username as \"([^\"]*)\"$")
	public void i_enter_username_as_something(String username) throws Throwable {

		//scenarioDef.createNode(new GherkinKeyword("When"), "user tap on the OS section");
		System.out.println(username);

		log.info("user has been entered into the OS section of the app!");
	}

	@Then("^User should be landed on dashboard screen$")
	public void user_should_be_landed_on_dashboard_screen() throws Throwable {

	}

	@And("^I enter password as \"([^\"]*)\"$")
	public void i_enter_password_as_something(String password) throws Throwable {
		System.out.println(password);

	}

	@And("^I login$")
	public void i_login() throws Throwable {

	}

}

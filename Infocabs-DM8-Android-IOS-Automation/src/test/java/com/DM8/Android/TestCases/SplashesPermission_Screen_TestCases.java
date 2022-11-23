package com.DM8.Android.TestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.DM8.Common.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SplashesPermission_Screen_TestCases extends BaseClass {
	
	private static Logger log = LogManager.getLogger(LoginPage_TestCases.class);
	
	
	@Given("^Allow location permission Alert comes as Driver Mate8 lunched$")
    public void allow_location_permission_alert_comes_as_driver_mate8_lunched() throws Throwable {
		log.info("user has been entered into the OS section of the app!");
    }

    @Given("^Allow Phone Call permission Alert comes as Driver Mate8 lunched$")
    public void allow_phone_call_permission_alert_comes_as_driver_mate8_lunched() throws Throwable {
    	log.info("user has been entered into the OS section of the app!");
    }

    @Given("^Allow Phone Media and files permission Alert comes as Driver Mate8 lunched$")
    public void allow_phone_media_and_files_permission_alert_comes_as_driver_mate8_lunched() throws Throwable {
    	log.info("user has been entered into the OS section of the app!");
    }

    @When("^I click on Allow button$")
    public void i_click_on_allow_button() throws Throwable {
    	log.info("user has been entered into the OS section of the app!");
    }

    @Then("^User should grant Device location permission to Driver Mate8$")
    public void user_should_grant_device_location_permission_to_driver_mate8() throws Throwable {
    	log.info("user has been entered into the OS section of the app!");
    }

    @Then("^User should grant manage Phone Calls permission$")
    public void user_should_grant_manage_phone_calls_permission() throws Throwable {
    	log.info("user has been entered into the OS section of the app!");
    }

    @Then("^User should grant manage Phone Media and files permission.$")
    public void user_should_grant_manage_phone_media_and_files_permission() throws Throwable {
   
    }

}

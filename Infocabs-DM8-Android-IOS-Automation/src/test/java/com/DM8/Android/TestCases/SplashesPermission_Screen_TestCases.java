package com.DM8.Android.TestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import com.DM8.Android.Locators.SplashesPermission_Screen_Locators;
import com.DM8.Common.BaseClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SplashesPermission_Screen_TestCases extends BaseClass {

	private static Logger log = LogManager.getLogger(SplashesPermission_Screen_TestCases.class);
	SplashesPermission_Screen_Locators SP = new SplashesPermission_Screen_Locators(driver);

	@Given("^Device permission Alerts and Splashes screens comes as Driver Mate8 lunched$")
	public void device_permission_alerts_and_splashes_screens_comes_as_driver_mate8_lunched() throws Throwable {
		log.info("Driver Mate Application should be luched after installation");
	}

	@When("^Click to Allow device Location permission$")
	public void click_to_allow_device_location_permission() throws Throwable {
		SP.AllowLocation();
	}

	@Then("^User should grant Device permission & User should move to the Register screen after Splashes screen movement Driver Mate8$")
	public void user_should_grant_device_permission_user_should_move_to_the_register_screen_after_splashes_screen_movement_driver_mate8()
			throws Throwable {
		log.info(" Then Device permission should be allowed and Splashes screen should be moved");
	}

	@And("^Click to Allow device Phone Calls permission$")
	public void click_to_allow_device_phone_calls_permission() throws Throwable {
		SP.AllowStorageCalls();
	}

	@And("^Click to Allow device Storage permission$")
	public void click_to_allow_device_storage_permission() throws Throwable {
		SP.AllowStorageCalls();
	}

	@And("^Tab on Get Started button$")
	public void tab_on_get_started_button() throws Throwable {
		SP.GetStartedButton();
	}

	@And("^Tab on Next button$")
	public void tab_on_next_button() throws Throwable {
		SP.NextButton_SplashScreen();
	}

	@And("^Tab on Next button second time$")
	public void tab_on_next_button_second_time() throws Throwable {
		SP.NextButton_SplashScreen();
	}

	@And("^Tab on Next button Thrid time$")
	public void tab_on_next_button_thrid_time() throws Throwable {
		SP.NextButton_SplashScreen();
	}

}

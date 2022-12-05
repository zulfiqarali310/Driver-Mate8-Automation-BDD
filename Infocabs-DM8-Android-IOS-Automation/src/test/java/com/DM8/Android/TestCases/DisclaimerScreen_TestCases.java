package com.DM8.Android.TestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.DM8.Android.Locators.Disclaimer_Locators;
import com.DM8.Common.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DisclaimerScreen_TestCases extends BaseClass {

	private static Logger log = LogManager.getLogger(DisclaimerScreen_TestCases.class);
	Disclaimer_Locators dc = new Disclaimer_Locators(driver);

	@Given("^Disclaimer Screen comes as Driver login to Driver Mate8$")
	public void disclaimer_screen_comes_as_driver_login_to_driver_mate8() throws Throwable {
		log.info("Disclaimer Screen comes as Driver login to Driver Mate8");
	}

	@When("^Click on Accept button$")
	public void click_on_accept_button() throws Throwable {
		log.info("Click on Accept button");
		Thread.sleep(2000);
		dc.ClickOnAccept();

	}

	@Then("^Driver Move to Driver Mate8 HomeScreen$")
	public void driver_move_to_driver_mate8_homescreen() throws Throwable {
		log.info("Driver Move to Driver Mate8 HomeScreen");

	}

}

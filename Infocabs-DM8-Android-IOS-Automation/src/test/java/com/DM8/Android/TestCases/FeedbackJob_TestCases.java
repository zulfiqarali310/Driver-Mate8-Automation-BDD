package com.DM8.Android.TestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.DM8.Android.Pages.FeedbackJob_Locators;
import com.DM8.Common.BaseClass;
import com.DM8.Common.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FeedbackJob_TestCases extends BaseClass {

	private static Logger log = LogManager.getLogger(FeedbackJob_TestCases.class);
	FeedbackJob_Locators fd = new FeedbackJob_Locators(driver);
	

	
	@Given("^Feedback screen comes as job cleared$")
    public void feedback_screen_comes_as_job_cleared() throws Throwable {
		log.info("Feedback screen comes as job cleared");
		Utility.waitForPageLoaded();
    }

    @When("^Driver Click on Submit button$")
    public void driver_click_on_submit_button() throws Throwable {
    	//Thread.sleep(2000);
    	Utility.waitForPageLoaded();
		log.info("Driver Click on Submit button");
		fd.ClickOnSubmit();
    }

    @Then("^Feedback added$")
    public void feedback_added() throws Throwable {
    	log.info("Feedback added");
    	Utility.waitForPageLoaded();
    }


}

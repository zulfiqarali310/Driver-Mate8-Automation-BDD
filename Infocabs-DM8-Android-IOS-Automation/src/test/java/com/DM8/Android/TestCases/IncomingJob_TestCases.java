package com.DM8.Android.TestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.DM8.Android.Pages.IncomingJob_Locators;
import com.DM8.Common.BaseClass;
import com.DM8.Common.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IncomingJob_TestCases extends BaseClass {

	private static Logger log = LogManager.getLogger(IncomingJob_TestCases.class);
	IncomingJob_Locators Injob = new IncomingJob_Locators(driver);
	

	@Given("^Incoming job screens comes as job assigned to the driver$")
	public void incoming_job_screens_comes_as_job_assigned_to_the_driver() throws Throwable {
		log.info("Incoming job screens comes as job assigned to the driver");
		Utility.waitForPageLoaded();

	}

	@When("^Driver Click on Accept button$")
	public void driver_click_on_accept_button() throws Throwable {
		//Thread.sleep(2000);
		Utility.waitForPageLoaded();
		log.info("Driver Click on Accept button");
		Injob.ClickOnAccept();

	}

	@Then("^Job Status become Accepted$")
	public void job_status_become_accepted() throws Throwable {
		log.info("Job Status become Accepted");
		Utility.waitForPageLoaded();

	}

}

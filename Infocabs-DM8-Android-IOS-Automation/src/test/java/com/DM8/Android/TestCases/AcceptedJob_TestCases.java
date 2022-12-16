package com.DM8.Android.TestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.DM8.Android.Pages.AcceptedJob_Locators;
import com.DM8.Common.BaseClass;
import com.DM8.Common.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AcceptedJob_TestCases extends BaseClass {


	private static Logger log = LogManager.getLogger(AcceptedJob_TestCases.class);
	AcceptedJob_Locators Acpjob = new AcceptedJob_Locators(driver);
	

	@Given("^Accepted job screens comes as Driver accept the Job$")
	public void accepted_job_screens_comes_as_driver_accept_the_job() throws Throwable {
		log.info("Accepted job screens comes as Driver accept the Job");
		Utility.waitForPageLoaded();
	}

	@When("^Driver Click on Waiting button$")
	public void driver_click_on_waiting_button() throws Throwable {
		//Thread.sleep(2000);
		Utility.waitForPageLoaded();
		log.info("Driver Click on Waiting button");
		Acpjob.ClickOnAccept();

	}

	@Then("^Job Status become Waiting$")
	public void job_status_become_waiting() throws Throwable {
		log.info("Job Status become Waiting");
		Utility.waitForPageLoaded();
	}

}

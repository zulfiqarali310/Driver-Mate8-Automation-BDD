package com.DM8.Android.TestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.DM8.Android.Locators.WaitingJob_Locators;
import com.DM8.Common.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WaitingJob_TestCases extends BaseClass {

	private static Logger log = LogManager.getLogger(WaitingJob_TestCases.class);
	WaitingJob_Locators Waitjob = new WaitingJob_Locators(driver);

	 @Given("^Job are in waiting status$")
	    public void job_are_in_waiting_status() throws Throwable {
		 log.info("Job are in waiting status");
	    }


	@When("^Driver Click on POB button$")
	public void driver_click_on_pob_button() throws Throwable {
		Thread.sleep(2000);
		log.info("Driver Click on POB button");
		Waitjob.ClickOnAccept();
	}

	@Then("^Job Status become POB$")
	public void job_status_become_pob() throws Throwable {
		log.info("Job Status become POB");
	}

}

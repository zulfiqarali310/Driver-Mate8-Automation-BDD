package com.DM8.Android.TestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.DM8.Android.Pages.STCJob_Locators;

import com.DM8.Common.BaseClass;
import com.DM8.Common.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class STCJob_TestCases extends BaseClass {

	private static Logger log = LogManager.getLogger(STCJob_TestCases.class);
	STCJob_Locators STCjob = new STCJob_Locators(driver);

	@Given("^Job are in STC status$")
	public void job_are_in_stc_status() throws Throwable {
		Utility.waitForPageLoaded();
		log.info("Job are in STC status");
	}

	@When("^Driver Click on Clear button$")
	public void driver_click_on_clear_button() throws Throwable {
		//Thread.sleep(3000);
		Utility.waitForPageLoaded();
		log.info("Driver Click on Clear button");
		STCjob.ClickOnAccept();
	}

	@Then("^Job Status become clear and complete$")
	public void job_status_become_clear_and_complete() throws Throwable {
		Utility.waitForPageLoaded();
		log.info("Job Status become clear and complete");
	}

}

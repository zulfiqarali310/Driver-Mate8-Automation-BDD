package com.DM8.Android.TestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.DM8.Android.Pages.POBJob_Locators;
import com.DM8.Common.BaseClass;
import com.DM8.Common.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class POBJob_TestCases extends BaseClass {

	private static Logger log = LogManager.getLogger(POBJob_TestCases.class);
	POBJob_Locators POBjob = new POBJob_Locators(driver);

	
	  @Given("^Job are in POB status$")
	    public void job_are_in_pob_status() throws Throwable {
		  Utility.waitForPageLoaded();
		  log.info("Job are in POB status");
	    }

	@When("^Driver Click on STC button$")
	public void driver_click_on_stc_button() throws Throwable {
		//Thread.sleep(2000);
		Utility.waitForPageLoaded();
		log.info("Driver Click on STC button");
		POBjob.ClickOnAccept();
	}

	@Then("^Job Status become STC$")
	public void job_status_become_stc() throws Throwable {
		Utility.waitForPageLoaded();
		log.info("Job Status become STC");
	}

}

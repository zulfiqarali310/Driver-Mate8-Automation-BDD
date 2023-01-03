package com.DM8.Android.TestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.DM8.Android.Pages.AcceptedJobPage;
import com.DM8.Android.Pages.FeedbackJob_Locators;
import com.DM8.Common.BaseClass;
import com.DM8.Common.Utility;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FeedbackJob_TestCases extends BaseClass {

	private static Logger log = LogManager.getLogger(FeedbackJob_TestCases.class);
	FeedbackJob_Locators fd = new FeedbackJob_Locators(driver);
	AcceptedJobPage Acpjob = new AcceptedJobPage(driver);

	@Given("^Feedback screen comes as job cleared$")
	public void feedback_screen_comes_as_job_cleared() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@When("^Driver is on Feedback Screen and lets verify Feedback screens UI and texts fields$")
	public void driver_is_on_feedback_screen_and_lets_verify_feedback_screens_ui_and_texts_fields() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@And("^check job details \"([^\"]*)\" text on feedback screen$")
	public void check_job_details_something_text_on_feedback_screen(String jobdetails) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = fd.GetJobDetailstext();
		Assert.assertEquals(Actualtext, jobdetails);
	}

	@And("^check job number with text on feedback screen$")
	public void check_job_number_with_text_on_feedback_screen() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = fd.CheckJobNumberwithtext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check pick address icon on feedback screen$")
	public void check_pick_address_icon_on_feedback_screen() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = fd.Checkpickupicon();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check drop off address icon on feedback screen$")
	public void check_drop_off_address_icon_on_feedback_screen() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = fd.CheckDropofficon();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^Check feedback screen pickup zone text$")
	public void check_feedback_screen_pickup_zone_text() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.GetPickupZonetext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^Check feedback screen pickup address text$")
	public void check_feedback_screen_pickup_address_text() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.GetPickupAddresstext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check feedback screen dropoff zone text$")
	public void check_feedback_screen_dropoff_zone_text() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.GetDropoffZonetext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check feedback screen dropoff Address text$")
	public void check_feedback_screen_dropoff_address_text() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.GetDropoffAddresstext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check feedback screen customer name$")
	public void check_feedback_screen_customer_name() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = fd.CheckCustomername();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check feedback screen Customer rating$")
	public void check_feedback_screen_customer_rating() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = fd.CheckFeedbackStars();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check submit button \"([^\"]*)\" text on feedback screen$")
	public void check_submit_button_something_text_on_feedback_screen(String submit) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = fd.GetSubmitbuttontext();
		Assert.assertEquals(Actualtext, submit);
	}

	@Then("^Feedback screen UI and text fields are verified$")
	public void feedback_screen_ui_and_text_fields_are_verified() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@Given("^Feedback screen comes so that feedback must be provided$")
	public void feedback_screen_comes_so_that_feedback_must_be_provided() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@When("^Driver click on Customer rating stars$")
	public void driver_click_on_customer_rating_stars() throws Throwable {
		Utility.waitForPageLoaded();
		fd.ClickOnFeedbackStarsbutton();
	}

	@And("^click to enter feedback for customer \"([^\"]*)\"$")
	public void click_to_enter_feedback_for_customer_something(String customerfeedback) throws Throwable {
		Utility.waitForPageLoaded();
		fd.WriteFeedback(customerfeedback);
	}

	@And("^click on Submit button$")
	public void click_on_submit_button() throws Throwable {
		Utility.waitForPageLoaded();
		fd.ClickOnSubmit();
	}

	@Then("^Feedback added and job become completed$")
	public void feedback_added_and_job_become_completed() throws Throwable {
		Utility.waitForPageLoaded();
	}

}

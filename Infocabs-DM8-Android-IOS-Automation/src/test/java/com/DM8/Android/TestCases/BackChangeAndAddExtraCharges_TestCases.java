package com.DM8.Android.TestCases;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static io.restassured.RestAssured.given;
import static java.time.Duration.ofMillis;

import org.json.JSONObject;
import org.junit.Assert;

import com.DM8.Android.Pages.AcceptedJobPage;
import com.DM8.Android.Pages.FeedbackJob_Locators;
import com.DM8.Android.Pages.IncomingJobPage;
import com.DM8.Android.Pages.WaitingJob_Locators;
import com.DM8.Common.BaseClass;
import com.DM8.Common.Utility;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class BackChangeAndAddExtraCharges_TestCases extends BaseClass {

	Utility util = new Utility();
	IncomingJobPage Injob = new IncomingJobPage(driver);
	AcceptedJobPage Acpjob = new AcceptedJobPage(driver);
	WaitingJob_Locators Waitjob = new WaitingJob_Locators(driver);
	FeedbackJob_Locators fd = new FeedbackJob_Locators(driver);
	TouchAction touch = new TouchAction((PerformsTouchActions) driver);

	@Given("^Job request are given for Goback and change dropoff address and Add extra charges verification$")
	public void job_request_are_given_for_goback_and_change_dropoff_address_and_add_extra_charges_verification()
			throws Throwable {
		Utility.waitForPageLoaded();

		JSONObject BodyData = Utility.JobCreation();
		Response response = given().header("Content-type", "application/json").and().body(BodyData.toString()).log()
				.all().when().post(prop.getProperty("JobCreatedAPI"));

		System.out.println("Access Token are this " + response.asString());
	}

	@When("^Job request are send to the server for Goback and change dropoff address and Add extra charges verification$")
	public void job_request_are_send_to_the_server_for_goback_and_change_dropoff_address_and_add_extra_charges_verification()
			throws Throwable {
		Utility.waitForPageLoaded();
	}

	@Then("^new job has been created in order to check and verify Goback and Change dropoff and extra charges$")
	public void new_job_has_been_created_in_order_to_check_and_verify_goback_and_change_dropoff_and_extra_charges()
			throws Throwable {
		Utility.waitForPageLoaded();
	}

	@Given("^Job has been received on DM8 and Accept and move to STC status to verify Go back in all job status$")
	public void job_has_been_received_on_dm8_and_accept_and_move_to_stc_status_to_verify_go_back_in_all_job_status()
			throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		Injob.ClickOnAccept();
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		Waitjob.ClickOnAccept();
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		Waitjob.ClickOnAccept();
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		Waitjob.ClickOnAccept();
	}

	@When("^scroll up the screen so that Go back button are visible$")
	public void scroll_up_the_screen_so_that_go_back_button_are_visible() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(2000);
		touch.press(point(529, 1750)).waitAction(waitOptions(ofMillis(3000))).moveTo(point(529, 700)).release()
				.perform();
	}

	@And("^check that Driver are in STC status by verifying clear \"([^\"]*)\" button text$")
	public void check_that_driver_are_in_stc_status_by_verifying_clear_something_button_text(String clr)
			throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Acpjob.GetWaitingbuttontext();
		Assert.assertEquals(Actualtext, clr);
	}

	@And("^Click on Back button on STC status$")
	public void click_on_back_button_on_stc_status() throws Throwable {
		Utility.waitForPageLoaded();
		Waitjob.ClickOnGobackButton();
		Thread.sleep(2000);
	}

	@And("^check to verify driver get back to POB status by verifying stc \"([^\"]*)\" button text$")
	public void check_to_verify_driver_get_back_to_pob_status_by_verifying_stc_something_button_text(String stc)
			throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Acpjob.GetWaitingbuttontext();
		Assert.assertEquals(Actualtext, stc);
	}

	@And("^click on Go back button POB status$")
	public void click_on_go_back_button_pob_status() throws Throwable {
		Utility.waitForPageLoaded();
		Waitjob.ClickOnGobackButton();
		Thread.sleep(2000);
	}

	@And("^check to verify driver get back to Waiting status by verifying pob \"([^\"]*)\" button text$")
	public void check_to_verify_driver_get_back_to_waiting_status_by_verifying_pob_something_button_text(String pob)
			throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Acpjob.GetWaitingbuttontext();
		Assert.assertEquals(Actualtext, pob);
	}

	@And("^click on Back button on waiting status$")
	public void click_on_back_button_on_waiting_status() throws Throwable {
		Utility.waitForPageLoaded();
		Waitjob.ClickOnGobackButton();
		Thread.sleep(2000);
	}

	@And("^check to verify driver get back to Accepted status by verifying waiting \"([^\"]*)\" button text$")
	public void check_to_verify_driver_get_back_to_accepted_status_by_verifying_waiting_something_button_text(
			String wait) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Acpjob.GetWaitingbuttontext();
		Assert.assertEquals(Actualtext, wait);
	}

	@Then("^Go back button are verified in all job status$")
	public void go_back_button_are_verified_in_all_job_status() throws Throwable {
		Utility.waitForPageLoaded();
	}

}

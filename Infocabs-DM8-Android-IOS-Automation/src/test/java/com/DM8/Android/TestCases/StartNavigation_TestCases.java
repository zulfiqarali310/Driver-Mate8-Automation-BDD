package com.DM8.Android.TestCases;

import static io.restassured.RestAssured.given;

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
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class StartNavigation_TestCases extends BaseClass {

	Utility util = new Utility();
	IncomingJobPage Injob = new IncomingJobPage(driver);
	AcceptedJobPage Acpjob = new AcceptedJobPage(driver);
	WaitingJob_Locators Waitjob = new WaitingJob_Locators(driver);
	FeedbackJob_Locators fd = new FeedbackJob_Locators(driver);
	TouchAction touch = new TouchAction((PerformsTouchActions) driver);

	@Given("^Job request are given for Map Navigation verification$")
	public void job_request_are_given_for_map_navigation_verification() throws Throwable {
		Utility.waitForPageLoaded();

		JSONObject BodyData = Utility.JobCreation();
		Response response = given().header("Content-type", "application/json").and().body(BodyData.toString()).log()
				.all().when().post(prop.getProperty("JobCreatedAPI"));

		System.out.println("Access Token are this " + response.asString());
	}

	@When("^Job request are send to the server for Job Map Navigation verification$")
	public void job_request_are_send_to_the_server_for_job_map_navigation_verification() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
	}

	@Then("^new job has been created in order to check and verify Map Navigation in throughout job status$")
	public void new_job_has_been_created_in_order_to_check_and_verify_map_navigation_in_throughout_job_status()
			throws Throwable {
		Utility.waitForPageLoaded();
	}

	@Given("^Job has been received on DM8 and Accept it for Map Navigation verifications$")
	public void job_has_been_received_on_dm8_and_accept_it_for_map_navigation_verifications() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		Injob.ClickOnAccept();
	}

	@When("^click on Map navigation button on Accepted screen$")
	public void click_on_map_navigation_button_on_accepted_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(3000);
		Acpjob.ClickOnStartNvaigationButton();
	}

	@And("^Verify Cost value and text for Map navigation on Accepted screen$")
	public void verify_cost_value_and_text_for_map_navigation_on_accepted_screen() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Waitjob.CheckCosttext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check distance \"([^\"]*)\" text for Map navigation on Accepted screen$")
	public void check_distance_something_text_for_map_navigation_on_accepted_screen(String distance) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Waitjob.Getdistancetext();
		Assert.assertEquals(Actualtext, distance);
	}

	@And("^check to verify miles covered values and text for Map navigation on Accepted screen$")
	public void check_to_verify_miles_covered_values_and_text_for_map_navigation_on_accepted_screen() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Waitjob.CheckmilestextValues();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check waiting lable \"([^\"]*)\" text for Map navigation on Accepted screen$")
	public void check_waiting_lable_something_text_for_map_navigation_on_accepted_screen(String waiting)
			throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Waitjob.GetwaitingLabletexttext();
		Assert.assertEquals(Actualtext, waiting);
	}

	@And("^Check waiting time value for Map navigation on Accepted screen$")
	public void check_waiting_time_value_for_map_navigation_on_accepted_screen() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Waitjob.Checkwaitingtimervalue();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^click on Back button to bring App back on screen for Map navigation on Accepted screen$")
	public void click_on_back_button_to_bring_app_back_on_screen_for_map_navigation_on_accepted_screen()
			throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(2000);
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(1000);

	}

	@And("^click on waiting button to move to waiting status for Map navigation on Accepted screen$")
	public void click_on_waiting_button_to_move_to_waiting_status_for_map_navigation_on_accepted_screen()
			throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(2000);
		Waitjob.ClickOnAccept();
	}

	@Then("^Map Navigations all UI elments are verified on Accepted screen$")
	public void map_navigations_all_ui_elments_are_verified_on_accepted_screen() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@Given("^Job are in waiting status for Map Navigation verifications$")
	public void job_are_in_waiting_status_for_map_navigation_verifications() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
	}

	@When("^click on Map navigation button on Waiting screen$")
	public void click_on_map_navigation_button_on_waiting_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(3000);
		Acpjob.ClickOnStartNvaigationButton();
	}

	@And("^Verify Cost value and text for Map navigation on Waiting screen$")
	public void verify_cost_value_and_text_for_map_navigation_on_waiting_screen() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Waitjob.CheckCosttext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check distance \"([^\"]*)\" text for Map navigation on Waiting screen$")
	public void check_distance_something_text_for_map_navigation_on_waiting_screen(String distance) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Waitjob.Getdistancetext();
		Assert.assertEquals(Actualtext, distance);
	}

	@And("^check to verify miles covered values and text for Map navigation on Waiting screen$")
	public void check_to_verify_miles_covered_values_and_text_for_map_navigation_on_waiting_screen() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Waitjob.CheckmilestextValues();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check waiting lable \"([^\"]*)\" text for Map navigation on Waiting screen$")
	public void check_waiting_lable_something_text_for_map_navigation_on_waiting_screen(String waiting)
			throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Waitjob.GetwaitingLabletexttext();
		Assert.assertEquals(Actualtext, waiting);
	}

	@And("^Check waiting time value for Map navigation on Waiting screen$")
	public void check_waiting_time_value_for_map_navigation_on_waiting_screen() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Waitjob.Checkwaitingtimervalue();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^click on Back button to bring App back on screen for Map navigation on Waiting screen$")
	public void click_on_back_button_to_bring_app_back_on_screen_for_map_navigation_on_waiting_screen()
			throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(2000);
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(1000);
	}

	@And("^click on POB button to move to pob status for Map navigation on Waiting screen$")
	public void click_on_pob_button_to_move_to_pob_status_for_map_navigation_on_waiting_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(2000);
		Waitjob.ClickOnAccept();
	}

	@Then("^Map Navigations all UI elments are verified on Waiting screen$")
	public void map_navigations_all_ui_elments_are_verified_on_waiting_screen() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@Given("^Job are in pob status for Map Navigation verifications$")
	public void job_are_in_pob_status_for_map_navigation_verifications() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
	}

	@When("^click on Map navigation button on POB screen$")
	public void click_on_map_navigation_button_on_pob_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(3000);
		Acpjob.ClickOnStartNvaigationButton();
	}

	@And("^Verify Cost value and text for Map navigation on POB screen$")
	public void verify_cost_value_and_text_for_map_navigation_on_pob_screen() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Waitjob.CheckCosttext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check distance \"([^\"]*)\" text for Map navigation on POB screen$")
	public void check_distance_something_text_for_map_navigation_on_pob_screen(String distance) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Waitjob.Getdistancetext();
		Assert.assertEquals(Actualtext, distance);
	}

	@And("^check to verify miles covered values and text for Map navigation on POB screen$")
	public void check_to_verify_miles_covered_values_and_text_for_map_navigation_on_pob_screen() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Waitjob.CheckmilestextValues();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check waiting lable \"([^\"]*)\" text for Map navigation on POB screen$")
	public void check_waiting_lable_something_text_for_map_navigation_on_pob_screen(String waiting) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Waitjob.GetwaitingLabletexttext();
		Assert.assertEquals(Actualtext, waiting);
	}

	@And("^Check waiting time value for Map navigation on POB screen$")
	public void check_waiting_time_value_for_map_navigation_on_pob_screen() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Waitjob.Checkwaitingtimervalue();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^click on Back button to bring App back on screen for Map navigation on POB screen$")
	public void click_on_back_button_to_bring_app_back_on_screen_for_map_navigation_on_pob_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(2000);
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(1000);
	}

	@And("^click on STC button to move to stc status for Map navigation on POB screen$")
	public void click_on_stc_button_to_move_to_stc_status_for_map_navigation_on_pob_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(2000);
		Waitjob.ClickOnAccept();
	}

	@Then("^Map Navigations all UI elments are verified on POB screen$")
	public void map_navigations_all_ui_elments_are_verified_on_pob_screen() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@Given("^Job are in STC status for Map Navigation verifications$")
	public void job_are_in_stc_status_for_map_navigation_verifications() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
	}

	@When("^click on Map navigation button on STC screen$")
	public void click_on_map_navigation_button_on_stc_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(3000);
		Acpjob.ClickOnStartNvaigationButton();
	}

	@And("^Verify Cost value and text for Map navigation on STC screen$")
	public void verify_cost_value_and_text_for_map_navigation_on_stc_screen() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Waitjob.CheckCosttext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check distance \"([^\"]*)\" text for Map navigation on STC screen$")
	public void check_distance_something_text_for_map_navigation_on_stc_screen(String distance) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Waitjob.Getdistancetext();
		Assert.assertEquals(Actualtext, distance);
	}

	@And("^check to verify miles covered values and text for Map navigation on STC screen$")
	public void check_to_verify_miles_covered_values_and_text_for_map_navigation_on_stc_screen() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Waitjob.CheckmilestextValues();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check waiting lable \"([^\"]*)\" text for Map navigation on STC screen$")
	public void check_waiting_lable_something_text_for_map_navigation_on_stc_screen(String waiting) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Waitjob.GetwaitingLabletexttext();
		Assert.assertEquals(Actualtext, waiting);
	}

	@And("^Check waiting time value for Map navigation on STC screen$")
	public void check_waiting_time_value_for_map_navigation_on_stc_screen() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Waitjob.Checkwaitingtimervalue();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^click on Back button to bring App back on screen for Map navigation on STC screen$")
	public void click_on_back_button_to_bring_app_back_on_screen_for_map_navigation_on_stc_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(2000);
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(1000);
	}

	@And("^click on Clear button to move to Feedback screen so that all status are verified$")
	public void click_on_clear_button_to_move_to_feedback_screen_so_that_all_status_are_verified() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(2000);
		Waitjob.ClickOnAccept();
		Utility.waitForPageLoaded();
		Thread.sleep(2000);
		fd.ClickOnSubmit();

	}

	@Then("^Map Navigations all UI elments are verified on STC screen$")
	public void map_navigations_all_ui_elments_are_verified_on_stc_screen() throws Throwable {
		Utility.waitForPageLoaded();
	}

}

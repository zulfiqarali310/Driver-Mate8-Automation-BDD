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

public class WaitingTimeCharges_TestCases extends BaseClass {

	Utility util = new Utility();
	IncomingJobPage Injob = new IncomingJobPage(driver);
	AcceptedJobPage Acpjob = new AcceptedJobPage(driver);
	WaitingJob_Locators Waitjob = new WaitingJob_Locators(driver);
	FeedbackJob_Locators fd = new FeedbackJob_Locators(driver);
	TouchAction touch = new TouchAction((PerformsTouchActions) driver);
	JSONObject BodyData = Utility.PreCalculatedFareVerification();

	@Given("^Job request are given for Waiting Time Charges Verification on DM8$")
	public void job_request_are_given_for_waiting_time_charges_verification_on_dm8() throws Throwable {

		Utility.waitForPageLoaded();
		given().header("Content-type", "application/json").and().body(BodyData.toString()).log().all().when()
				.post(Datafile.getProperty("JobCreatedAPI"));
	}

	@When("^Job request are send to the server for Waiting Time Charges Verification$")
	public void job_request_are_send_to_the_server_for_waiting_time_charges_verification() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@Then("^new job has been created with Waiting Time Charges Data$")
	public void new_job_has_been_created_with_waiting_time_charges_data() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@Given("^Job has been received on DM8 For Waiting time Charge and Accept and move to Waiting status$")
	public void job_has_been_received_on_dm8_for_waiting_time_charge_and_accept_and_move_to_waiting_status()
			throws Throwable {
		Utility.waitForPageLoaded();
	}

	@When("^Accept and move to waiting status for Waiting time Charge$")
	public void accept_and_move_to_waiting_status_for_waiting_time_charge() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(2000);
		Injob.ClickOnAccept();
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		Waitjob.ClickOnAccept();
	}

	@And("^click on Meter Expand button so that waiting charges can be clearled vissible$")
	public void click_on_meter_expand_button_so_that_waiting_charges_can_be_clearled_vissible() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		Waitjob.ClickOnMeterExpandButton();
	}

	@Then("^Job status should be waiting and Meter should be expand waiting charges$")
	public void job_status_should_be_waiting_and_meter_should_be_expand_waiting_charges() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@Given("^Job are in waiting and Meter menu are expanded and visible for Single Slab$")
	public void job_are_in_waiting_and_meter_menu_are_expanded_and_visible_for_single_slab() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@When("^Click on Start waiting button waiting Time and Charges are started for single slab$")
	public void click_on_start_waiting_button_waiting_time_and_charges_are_started_for_single_slab() throws Throwable {
		Utility.waitForPageLoaded();
		Waitjob.ClickOnStartstopWaitingButton();
		Thread.sleep(1000);
	}

	@And("^wait for first Subsequent time so that charges are get added for single slab$")
	public void wait_for_first_subsequent_time_so_that_charges_are_get_added_for_single_slab() throws Throwable {
		Utility.waitForPageLoaded();
		Response response3 = given().when().get(Datafile.getProperty("TariffIDDetails") + "="
				+ Datafile.getProperty("PTariffID") + "&CompanyId" + "=" + Datafile.getProperty("Company_ID"));
		Thread.sleep(1000);
		float id = response3.path("Content.WaitingInfoDetails[0].WaitingSlabs[0].SubsequentTime");
		float flot = id * 1000;
		int time = (int) flot;
		Thread.sleep((long) (2000 + time));
		// Stop Waiting Timer
		Waitjob.ClickOnStartstopWaitingButton();
		Thread.sleep(1000);

	}

	@And("^verify cost of first increamented value once waiting charges get increased for single slab$")
	public void verify_cost_of_first_increamented_value_once_waiting_charges_get_increased_for_single_slab()
			throws Throwable {
		Utility.waitForPageLoaded();
		Response response3 = given().when().get(Datafile.getProperty("TariffIDDetails") + "="
				+ Datafile.getProperty("PTariffID") + "&CompanyId" + "=" + Datafile.getProperty("Company_ID"));
		Thread.sleep(2000);
		float id = response3.path("Content.WaitingInfoDetails[0].WaitingSlabs[0].Cost");
		float TariffCost = id / 100;
		Thread.sleep(2000);
		String ActualDM8CostValue = Waitjob.GetMeterWaitingCostValue();
		Assert.assertEquals("£ " + TariffCost + "0", ActualDM8CostValue);

	}

	@And("^wait for next one to Two minutes so that charges and Time values are getting increasing Single Slab$")
	public void wait_for_next_one_to_two_minutes_so_that_charges_and_time_values_are_getting_increasing_single_slab()
			throws Throwable {
		Utility.waitForPageLoaded();
		// Start Waiting Timer
		Waitjob.ClickOnStartstopWaitingButton();
		Utility.waitForPageLoaded();
		Response response3 = given().when().get(Datafile.getProperty("TariffIDDetails") + "="
				+ Datafile.getProperty("PTariffID") + "&CompanyId" + "=" + Datafile.getProperty("Company_ID"));
		Thread.sleep(1000);
		float id = response3.path("Content.WaitingInfoDetails[0].WaitingSlabs[0].SubsequentTime");
		float flot = id * 1000;
		int time = (int) flot;
		Thread.sleep((long) (2000 + time));
		Utility.waitForPageLoaded();
		// Stop Waiting Timer
		Waitjob.ClickOnStartstopWaitingButton();
		Thread.sleep(1000);
	}

	@And("^Verify Cost value should be increased to the required value for Single slab$")
	public void verify_cost_value_should_be_increased_to_the_required_value_for_single_slab() throws Throwable {

		Utility.waitForPageLoaded();
		Response response3 = given().when().get(Datafile.getProperty("TariffIDDetails") + "="
				+ Datafile.getProperty("PTariffID") + "&CompanyId" + "=" + Datafile.getProperty("Company_ID"));
		Thread.sleep(2000);
		float id = response3.path("Content.WaitingInfoDetails[0].WaitingSlabs[0].Cost");
		float TariffCost = id / 100;
		float totalTwoMinCost = TariffCost + TariffCost;
		Thread.sleep(2000);
		String ActualDM8CostValue = Waitjob.GetMeterWaitingCostValue();
		Assert.assertEquals("£ " + totalTwoMinCost + "0", ActualDM8CostValue);
	}

	@And("^Stop Waiting Time and Move Job to POB Status so that waiting charges can be verified for POB on single Slab$")
	public void stop_waiting_time_and_move_job_to_pob_status_so_that_waiting_charges_can_be_verified_for_pob_on_single_slab()
			throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		Waitjob.ClickOnAccept();
	}

	@And("^Start Waiting Time on POB for Single Slab$")
	public void start_waiting_time_on_pob_for_single_slab() throws Throwable {
		Utility.waitForPageLoaded();
		Waitjob.ClickOnStartstopWaitingButton();
		Thread.sleep(1000);
	}

	@And("^wait for upto one minute so that waiting charges can be increased$")
	public void wait_for_upto_one_minute_so_that_waiting_charges_can_be_increased() throws Throwable {
		Utility.waitForPageLoaded();
		Response response3 = given().when().get(Datafile.getProperty("TariffIDDetails") + "="
				+ Datafile.getProperty("PTariffID") + "&CompanyId" + "=" + Datafile.getProperty("Company_ID"));
		Thread.sleep(1000);
		float id = response3.path("Content.WaitingInfoDetails[0].WaitingSlabs[0].SubsequentTime");
		float flot = id * 1000;
		int time = (int) flot;
		Thread.sleep((long) (2000 + time));

	}

	@And("^Stop Waiting time and verify the cost added in POB for Single slab$")
	public void stop_waiting_time_and_verify_the_cost_added_in_pob_for_single_slab() throws Throwable {
		Utility.waitForPageLoaded();
		// Stop Waiting Timer
		Waitjob.ClickOnStartstopWaitingButton();
		Thread.sleep(1000);
		Utility.waitForPageLoaded();
		Response response3 = given().when().get(Datafile.getProperty("TariffIDDetails") + "="
				+ Datafile.getProperty("PTariffID") + "&CompanyId" + "=" + Datafile.getProperty("Company_ID"));
		Thread.sleep(2000);
		float id = response3.path("Content.WaitingInfoDetails[0].WaitingSlabs[0].Cost");
		float TariffCost = id / 100;
		float totalTwoMinCost = TariffCost + TariffCost + TariffCost;
		Thread.sleep(2000);
		String ActualDM8CostValue = Waitjob.GetMeterWaitingCostValue();
		Assert.assertEquals("£ " + totalTwoMinCost + "0", ActualDM8CostValue);
	}

	@And("^Move job to STC aand start waiting for Single slab$")
	public void move_job_to_stc_aand_start_waiting_for_single_slab() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		Waitjob.ClickOnAccept();
		// Start Waiting Timer
		Waitjob.ClickOnStartstopWaitingButton();
		Thread.sleep(1000);

	}

	@And("^wait for upto one minute on STC for Single slab$")
	public void wait_for_upto_one_minute_on_stc_for_single_slab() throws Throwable {
		Utility.waitForPageLoaded();
		Response response3 = given().when().get(Datafile.getProperty("TariffIDDetails") + "="
				+ Datafile.getProperty("PTariffID") + "&CompanyId" + "=" + Datafile.getProperty("Company_ID"));
		Thread.sleep(1000);
		float id = response3.path("Content.WaitingInfoDetails[0].WaitingSlabs[0].SubsequentTime");
		float flot = id * 1000;
		int time = (int) flot;
		Thread.sleep((long) (2000 + time));
	}

	@And("^Stop waiting time and verify cost added value on STC for Single slab$")
	public void stop_waiting_time_and_verify_cost_added_value_on_stc_for_single_slab() throws Throwable {
		Utility.waitForPageLoaded();
		// Stop Waiting Timer
		Waitjob.ClickOnStartstopWaitingButton();
		Thread.sleep(1000);
		Utility.waitForPageLoaded();
		Response response3 = given().when().get(Datafile.getProperty("TariffIDDetails") + "="
				+ Datafile.getProperty("PTariffID") + "&CompanyId" + "=" + Datafile.getProperty("Company_ID"));
		Thread.sleep(2000);
		float id = response3.path("Content.WaitingInfoDetails[0].WaitingSlabs[0].Cost");
		float TariffCost = id / 100;
		float totalTwoMinCost = TariffCost + TariffCost + TariffCost + TariffCost + TariffCost;
		Thread.sleep(2000);
		String ActualDM8CostValue = Waitjob.GetMeterWaitingCostValue();
		Assert.assertEquals("£ " + totalTwoMinCost + "0", ActualDM8CostValue);
	}

	@And("^click on Clear and then Submit button so that cleared job with Waiting charges verification$")
	public void click_on_clear_and_then_submit_button_so_that_cleared_job_with_waiting_charges_verification()
			throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		Acpjob.ClickOnAccept();
		Utility.waitForPageLoaded();
		Thread.sleep(2000);
		fd.ClickOnSubmit();
	}

	@Then("^Waiting Charges are verified for all job status on Single slab$")
	public void waiting_charges_are_verified_for_all_job_status_on_single_slab() throws Throwable {
		Utility.waitForPageLoaded();
	}

}

package com.DM8.Android.TestCases;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static io.restassured.RestAssured.given;
import static java.time.Duration.ofMillis;

import org.json.JSONObject;
import org.junit.Assert;

import com.DM8.Android.Pages.AcceptedJobPage;
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

public class ReturnJob_TestCases extends BaseClass {

	Utility util = new Utility();
	IncomingJobPage Injob = new IncomingJobPage(driver);
	AcceptedJobPage Acpjob = new AcceptedJobPage(driver);
	WaitingJob_Locators Waitjob = new WaitingJob_Locators(driver);
	TouchAction touch = new TouchAction((PerformsTouchActions) driver);

	@Given("^Job request are given to return job on Accepted screen$")
	public void job_request_are_given_to_return_job_on_accepted_screen() throws Throwable {
		Utility.waitForPageLoaded();

		JSONObject BodyData = Utility.JobCreation();
		Response response = given().header("Content-type", "application/json").and().body(BodyData.toString()).log()
				.all().when().post(prop.getProperty("JobCreatedAPI"));

		System.out.println("Access Token are this " + response.asString());
	}

	@When("^Job request are send to the server to return job on Accepted screen$")
	public void job_request_are_send_to_the_server_to_return_job_on_accepted_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
	}

	@Then("^new job has been created in order to return job on Accepted screen$")
	public void new_job_has_been_created_in_order_to_return_job_on_accepted_screen() throws Throwable {
		Utility.waitForPageLoaded();

	}

	@Given("^Job has been received on DM8 and Accept it$")
	public void job_has_been_received_on_dm8_and_accept_it() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		Injob.ClickOnAccept();
	}

	@When("^move scroll up so that return button visible on Accepted screen$")
	public void move_scroll_up_so_that_return_button_visible_on_accepted_screen() throws Throwable {
		Thread.sleep(2000);
		touch.press(point(529, 1750)).waitAction(waitOptions(ofMillis(3000))).moveTo(point(529, 700)).release()
				.perform();
	}

	@And("^click on Return job button on Accepted screen$")
	public void click_on_return_job_button_on_accepted_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		Acpjob.ClickOnReturnJob();
	}

	@And("^check to verify return job \"([^\"]*)\" text on Accepted screen$")
	public void check_to_verify_return_job_something_text_on_accepted_screen(String returnjob) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Acpjob.GetAlertTitletext();
		Assert.assertEquals(Actualtext, returnjob);
	}

	@And("^check to verify return job detials \"([^\"]*)\" text on Accepted screen$")
	public void check_to_verify_return_job_detials_something_text_on_accepted_screen(String returnjobdetails)
			throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Acpjob.GetAlertmessage();
		Assert.assertEquals(Actualtext, returnjobdetails);
	}

	@And("^click on yes button on Accepted screen$")
	public void click_on_yes_button_on_accepted_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		Acpjob.ClickOnYesButton();
	}

	@Then("^job has been returned on Accepted screen$")
	public void job_has_been_returned_on_accepted_screen() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@Given("^Job request are given to return job on waiting screen$")
	public void job_request_are_given_to_return_job_on_waiting_screen() throws Throwable {
		Utility.waitForPageLoaded();

		JSONObject BodyData = Utility.JobCreation();
		Response response = given().header("Content-type", "application/json").and().body(BodyData.toString()).log()
				.all().when().post(prop.getProperty("JobCreatedAPI"));

		System.out.println("Access Token are this " + response.asString());
	}

	@When("^Job request are send to the server to return job on waiting screen$")
	public void job_request_are_send_to_the_server_to_return_job_on_waiting_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
	}

	@Then("^new job has been created in order to return job on waiting screen$")
	public void new_job_has_been_created_in_order_to_return_job_on_waiting_screen() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@Given("^Job has been received on DM8 and Accept it and move to waiting screen$")
	public void job_has_been_received_on_dm8_and_accept_it_and_move_to_waiting_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		Injob.ClickOnAccept();
		Thread.sleep(1000);
		Injob.ClickOnAccept();
	}

	@When("^move scroll up so that return button visible on Waiting screen$")
	public void move_scroll_up_so_that_return_button_visible_on_waiting_screen() throws Throwable {
		Thread.sleep(2000);
		touch.press(point(529, 1750)).waitAction(waitOptions(ofMillis(3000))).moveTo(point(529, 700)).release()
				.perform();
	}

	@And("^click on Return job button$")
	public void click_on_return_job_button() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		Acpjob.ClickOnReturnJob();
	}

	@And("^click on yes button$")
	public void click_on_yes_button() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		Acpjob.ClickOnYesButton();
	}

	@Then("^job has been returned on waiting screen$")
	public void job_has_been_returned_on_waiting_screen() throws Throwable {
		Utility.waitForPageLoaded();
	}

}

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

public class SendSMSRingBackSendNoShow_TestCases extends BaseClass {

	Utility util = new Utility();
	IncomingJobPage Injob = new IncomingJobPage(driver);
	AcceptedJobPage Acpjob = new AcceptedJobPage(driver);
	WaitingJob_Locators Waitjob = new WaitingJob_Locators(driver);
	FeedbackJob_Locators fd = new FeedbackJob_Locators(driver);
	TouchAction touch = new TouchAction((PerformsTouchActions) driver);

	@Given("^Job request are given for Send SMS Ring back and Send No Show on Job Waiting status verification$")
	public void job_request_are_given_for_send_sms_ring_back_and_send_no_show_on_job_waiting_status_verification()
			throws Throwable {
		Utility.waitForPageLoaded();

		JSONObject BodyData = Utility.JobCreation();
		Response response = given().header("Content-type", "application/json").and().body(BodyData.toString()).log()
				.all().when().post(prop.getProperty("JobCreatedAPI"));

		System.out.println("Access Token are this " + response.asString());
	}

	@When("^Job request are send to the server for Send SMS Ring back and Send No Show on Job Waiting status verification$")
	public void job_request_are_send_to_the_server_for_send_sms_ring_back_and_send_no_show_on_job_waiting_status_verification()
			throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
	}

	@Then("^new job has been created in order to check and verify Send SMS Ring back and Send No Show on Job Waiting status$")
	public void new_job_has_been_created_in_order_to_check_and_verify_send_sms_ring_back_and_send_no_show_on_job_waiting_status()
			throws Throwable {
		Utility.waitForPageLoaded();

	}

	@Given("^Job has been received on DM8 and Accept and move to waiting status for Map Send SMS Ring Back verifications$")
	public void job_has_been_received_on_dm8_and_accept_and_move_to_waiting_status_for_map_send_sms_ring_back_verifications()
			throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		Injob.ClickOnAccept();
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		Waitjob.ClickOnAccept();
	}

	@When("^click on Send SMS Ring Back button on Waiting screen$")
	public void click_on_send_sms_ring_back_button_on_waiting_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Waitjob.ClickOnSendSMSRingBackButton();
		Thread.sleep(1000);
	}

	@And("^check verify alert \"([^\"]*)\" text$")
	public void check_verify_alert_something_text(String alert) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Waitjob.GetSendSMSRingBackAlerttext();
		Assert.assertEquals(Actualtext, alert);
	}

	@And("^check to verify details sendsms \"([^\"]*)\" text$")
	public void check_to_verify_details_sendsms_something_text(String sendsmsring) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Waitjob.GetSendSMSRingDetailstext();
		Assert.assertEquals(Actualtext, sendsmsring);
	}

	@And("^check to verify ok \"([^\"]*)\" text$")
	public void check_to_verify_ok_something_text(String ok) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Waitjob.GetSendSMSRingBacOktext();
		Assert.assertEquals(Actualtext, ok);
	}

	@And("^click on OK button on Send SMS ringback alert$")
	public void click_on_ok_button_on_send_sms_ringback_alert() throws Throwable {
		Utility.waitForPageLoaded();
		Waitjob.ClickOnSendSMSOKButton();
		Thread.sleep(1000);
	}

	@Then("^Send SmS alert are verified and message are send$")
	public void send_sms_alert_are_verified_and_message_are_send() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@Given("^Job status are in waiting check to verify Customer no show$")
	public void job_status_are_in_waiting_check_to_verify_customer_no_show() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@When("^scroll up the screen so that Send no show button are visible$")
	public void scroll_up_the_screen_so_that_send_no_show_button_are_visible() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(2000);
		touch.press(point(529, 1750)).waitAction(waitOptions(ofMillis(3000))).moveTo(point(529, 700)).release()
				.perform();
	}

	@And("^wait so that Send no show time complete$")
	public void wait_so_that_send_no_show_time_complete() throws Throwable {
		Thread.sleep(50000);
	}

	@And("^click on Send no show button on Waiting screen$")
	public void click_on_send_no_show_button_on_waiting_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(2000);
		Waitjob.ClickOnSendNotoShowJob();
		Thread.sleep(1000);
	}

	@And("^check verify no show alert \"([^\"]*)\" text$")
	public void check_verify_no_show_alert_something_text(String alert1) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Waitjob.GetSendSNoShowAlerttext();
		Assert.assertEquals(Actualtext, alert1);
	}

	@And("^check to verify send no show details \"([^\"]*)\" text$")
	public void check_to_verify_send_no_show_details_something_text(String details) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Waitjob.GetSendSNoShowDetailstext();
		Assert.assertEquals(Actualtext, details);
	}

	@And("^check no \"([^\"]*)\" button on no show alert$")
	public void check_no_something_button_on_no_show_alert(String no) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Waitjob.GetSendSNotext();
		Assert.assertEquals(Actualtext, no);
	}

	@And("^check yes \"([^\"]*)\" text on no show alert$")
	public void check_yes_something_text_on_no_show_alert(String yes) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Waitjob.GetSendShowYestext();
		Assert.assertEquals(Actualtext, yes);
	}

	@And("^click on Yes button on No show alert$")
	public void click_on_yes_button_on_no_show_alert() throws Throwable {
		Utility.waitForPageLoaded();
		Waitjob.ClickOnSendNoShowYesButton();
		Thread.sleep(1000);

	}

	@And("^check to verify the Alert title on send no show$")
	public void check_to_verify_the_alert_title_on_send_no_show() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Waitjob.CheckNoShowAlerttext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check to verify details send no show alert text$")
	public void check_to_verify_details_send_no_show_alert_text() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Waitjob.CheckSMSAlertDetailstext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^click on ok button on Send no show alert$")
	public void click_on_ok_button_on_send_no_show_alert() throws Throwable {
		Utility.waitForPageLoaded();
		Waitjob.ClickOnSendSMSOKButton();
		Thread.sleep(1000);
	}

	@Then("^Job has been reported No show on driver navigate back to to home screen$")
	public void job_has_been_reported_no_show_on_driver_navigate_back_to_to_home_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
	}

}

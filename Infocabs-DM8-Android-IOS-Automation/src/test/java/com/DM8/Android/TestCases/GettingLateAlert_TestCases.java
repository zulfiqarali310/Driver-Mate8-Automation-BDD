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

public class GettingLateAlert_TestCases extends BaseClass {

	Utility util = new Utility();
	IncomingJobPage Injob = new IncomingJobPage(driver);
	AcceptedJobPage Acpjob = new AcceptedJobPage(driver);
	WaitingJob_Locators Waitjob = new WaitingJob_Locators(driver);
	FeedbackJob_Locators fd = new FeedbackJob_Locators(driver);
	TouchAction touch = new TouchAction((PerformsTouchActions) driver);

	@Given("^Job request are given to for Getting late alert verification$")
	public void job_request_are_given_to_for_getting_late_alert_verification() throws Throwable {
		Utility.waitForPageLoaded();

		JSONObject BodyData = Utility.JobCreation();
		Response response = given().header("Content-type", "application/json").and().body(BodyData.toString()).log()
				.all().when().post(prop.getProperty("JobCreatedAPI"));

		System.out.println("Access Token are this " + response.asString());
	}

	@When("^Job request are send to the server for Getting late verification$")
	public void job_request_are_send_to_the_server_for_getting_late_verification() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
	}

	@Then("^new job has been created in order to check and verify Getting late on Accepted and waiting screen$")
	public void new_job_has_been_created_in_order_to_check_and_verify_getting_late_on_accepted_and_waiting_screen()
			throws Throwable {
		Utility.waitForPageLoaded();
	}

	@Given("^Job has been received on DM8 and Accept it for Getting late verification$")
	public void job_has_been_received_on_dm8_and_accept_it_for_getting_late_verification() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		Injob.ClickOnAccept();
	}

	@When("^click on getting late button on Accepted screen$")
	public void click_on_getting_late_button_on_accepted_screen_on_accepted_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(3000);
		Acpjob.ClickOnGettinglate();
	}

	@And("^check to verify getting late icon on alert on Accepted screen$")
	public void check_to_verify_getting_late_icon_on_alert_on_accepted_screen() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.GetDriverLateicon();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check to verify heading text on Accepted screen$")
	public void check_to_verify_heading_something_text_on_accepted_screen() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.GetHeadingtext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}
	

	@And("^click on back cross button on Accepted screen$")
	public void click_on_back_cross_button_on_accepted_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Acpjob.ClickOnBackCrossbutton();
	}

	@And("^click on again late button to open Getting late alert on Accepted screen$")
	public void click_on_again_late_button_to_open_getting_late_alert_on_accepted_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Acpjob.ClickOnGettinglate();
	}

	@And("^now verify details1 \"([^\"]*)\" text on Accepted screen$")
	public void now_verify_details1_something_text_on_accepted_screen(String details1) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Acpjob.GetDetails1text();
		Assert.assertEquals(Actualtext, details1);
	}

	@And("^now verify details2 \"([^\"]*)\" on Accepted screen$")
	public void now_verify_details2_something_on_accepted_screen(String details2) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Acpjob.GetDetails2text();
		Assert.assertEquals(Actualtext, details2);
		Thread.sleep(3000);
	}

	@And("^again click on late button for 5 mins wait on Accepted screen$")
	public void again_click_on_late_button_for_5_mins_wait_on_accepted_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Acpjob.ClickOnGettinglate();
	}

	@And("^click on 5mins wait box on Accepted screen$")
	public void click_on_5mins_wait_box_on_accepted_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Acpjob.ClickOn5minwait();
	}

	@And("^click late button for 10 mins wait on Accepted screen$")
	public void click_late_button_for_10_mins_wait_on_accepted_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Acpjob.ClickOnGettinglate();
	}

	@And("^click on 10mins wait box on Accepted screen$")
	public void click_on_10mins_wait_box_on_accepted_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Acpjob.ClickOn10minwait();
	}

	@And("^click on late button for 15 mins wait on Accepted screen$")
	public void click_on_late_button_for_15_mins_wait_on_accepted_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Acpjob.ClickOnGettinglate();
	}

	@And("^click on 15mins wait box on Accepted screen$")
	public void click_on_15mins_wait_box_on_accepted_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Acpjob.ClickOn15minwait();
	}

	@And("^click on late button for 20 mins wait on Accepted screen$")
	public void click_on_late_button_for_20_mins_wait_on_accepted_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Acpjob.ClickOnGettinglate();
	}

	@And("^click on 20mins wait box on Accepted screen$")
	public void click_on_20mins_wait_box_on_accepted_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Acpjob.ClickOn20minwait();
	}

	@And("^click again late button for continue button verification on Accepted screen$")
	public void click_again_late_button_for_continue_button_verification_on_accepted_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Acpjob.ClickOnGettinglate();
	}

	@And("^check that continue button are available on Accepted screen$")
	public void check_that_continue_button_are_available_on_accepted_screen() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.checkButtoncontinue();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
		Acpjob.ClickOnContinueButton();
	}

	@Then("^Getting late feature are verified on Accepted screen$")
	public void getting_late_feature_are_verified_on_accepted_screen() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@Given("^Job has been received on DM8 and Accept it and then move to waiting screen for Getting late verification$")
	public void job_has_been_received_on_dm8_and_accept_it_and_then_move_to_waiting_screen_for_getting_late_verification()
			throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(3000);
		Acpjob.ClickOnAccept();
	}

	@When("^click on getting late button on Waiting screen$")
	public void click_on_getting_late_button_on_waiting_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Acpjob.ClickOnGettinglate();
	}

	@And("^check to verify getting late icon on alert on Waiting screen$")
	public void check_to_verify_getting_late_icon_on_alert_on_waiting_screen() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.GetDriverLateicon();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check to verify heading text on Waiting screen$")
	public void check_to_verify_heading_something_text_on_waiting_screen() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.GetHeadingtext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^click on back cross button on Waiting screen$")
	public void click_on_back_cross_button_on_waiting_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Acpjob.ClickOnBackCrossbutton();
	}

	@And("^click on again late button to open Getting late alert on Waiting screen$")
	public void click_on_again_late_button_to_open_getting_late_alert_on_waiting_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Acpjob.ClickOnGettinglate();
	}

	@And("^now verify details1 \"([^\"]*)\" text on Waiting screen$")
	public void now_verify_details1_something_text_on_waiting_screen(String details1) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Acpjob.GetDetails1text();
		Assert.assertEquals(Actualtext, details1);
	}

	@And("^now verify details2 \"([^\"]*)\" on Waiting screen$")
	public void now_verify_details2_something_on_waiting_screen(String details2) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Acpjob.GetDetails2text();
		Assert.assertEquals(Actualtext, details2);
		Thread.sleep(3000);
	}

	@And("^again click on late button for 5 mins wait on Waiting screen$")
	public void again_click_on_late_button_for_5_mins_wait_on_waiting_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Acpjob.ClickOnGettinglate();
	}

	@And("^click on 5mins wait box on Waiting screen$")
	public void click_on_5mins_wait_box_on_waiting_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Acpjob.ClickOn5minwait();
	}

	@And("^click late button for 10 mins wait on Waiting screen$")
	public void click_late_button_for_10_mins_wait_on_waiting_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Acpjob.ClickOnGettinglate();
	}

	@And("^click on 10mins wait box on Waiting screen$")
	public void click_on_10mins_wait_box_on_waiting_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Acpjob.ClickOn10minwait();
	}

	@And("^click on late button for 15 mins wait on Waiting screen$")
	public void click_on_late_button_for_15_mins_wait_on_waiting_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Acpjob.ClickOnGettinglate();
	}

	@And("^click on 15mins wait box on Waiting screen$")
	public void click_on_15mins_wait_box_on_waiting_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Acpjob.ClickOn15minwait();
	}

	@And("^click on late button for 20 mins wait on Waiting screen$")
	public void click_on_late_button_for_20_mins_wait_on_waiting_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Acpjob.ClickOnGettinglate();
	}

	@And("^click on 20mins wait box on Waiting screen$")
	public void click_on_20mins_wait_box_on_waiting_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Acpjob.ClickOn20minwait();
	}

	@And("^click again late button for continue button verification on Waiting screen$")
	public void click_again_late_button_for_continue_button_verification_on_waiting_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Acpjob.ClickOnGettinglate();
	}

	@And("^check that continue button are available on Waiting screen$")
	public void check_that_continue_button_are_available_on_waiting_screen() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.checkButtoncontinue();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
		Acpjob.ClickOnContinueButton();
	}
	
	@And("^make complete the job once verified with Getting late feature$")
    public void make_complete_the_job_once_verified_with_getting_late_feature() throws Throwable {
        Thread.sleep(3000);        
        Waitjob.ClickOnAccept();
        Thread.sleep(2000);  
        Waitjob.ClickOnAccept();
        Thread.sleep(2000);  
        Waitjob.ClickOnAccept();
        Thread.sleep(2000); 
        fd.ClickOnSubmit();
        Thread.sleep(2000);
    }

	@Then("^Getting late feature are verified on Waiting screen$")
	public void getting_late_feature_are_verified_on_waiting_screen() throws Throwable {
		Utility.waitForPageLoaded();
	}

}

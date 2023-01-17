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
import com.DM8.Android.Pages.POBJob_Locators;
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
	POBJob_Locators POBjob = new POBJob_Locators(driver);
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

	@Given("^Job Status should be in POB by verifying stc \"([^\"]*)\" to check for ChangeDropoff address$")
	public void job_status_should_be_in_pob_by_verifying_stc_something_to_check_for_changedropoff_address(String stc)
			throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(2000);
		Waitjob.ClickOnAccept();
		Thread.sleep(2000);
		Waitjob.ClickOnAccept();
		Thread.sleep(1000);
		String Actualtext = Acpjob.GetWaitingbuttontext();
		Assert.assertEquals(Actualtext, stc);
	}

	@When("^Click on Change dropoff address button$")
	public void click_on_change_dropoff_address_button() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		POBjob.ClickOnChangeDropoffAddress();

	}

	@And("^check to verify Change Address whole alert$")
	public void check_to_verify_change_address_whole_alert() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.checkforwholechatAlert();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check to verify Change Address title \"([^\"]*)\" text$")
	public void check_to_verify_change_address_title_something_text(String titile) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Acpjob.GetforMessagetext();
		Assert.assertEquals(Actualtext, titile);
	}

	@And("^check to verify change address Alert messages dialog$")
	public void check_to_verify_change_address_alert_messages_dialog() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.checkformessageare();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check verify cancel \"([^\"]*)\" button text on change address dialog$")
	public void check_verify_cancel_something_button_text_on_change_address_dialog(String cnl) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Acpjob.Getforcanclebuttontext();
		Assert.assertEquals(Actualtext, cnl);
	}

	@And("^check to verify update \"([^\"]*)\" text on change address dialog$")
	public void check_to_verify_update_something_text_on_change_address_dialog(String update) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Acpjob.GetforSendbuttontext();
		Assert.assertEquals(Actualtext, update);
	}

	@And("^click on first address to change dropoff zone address$")
	public void click_on_first_address_to_change_dropoff_zone_address() throws Throwable {
		Thread.sleep(2000);
		Acpjob.ClickOnAnyMessageButton();
	}

	@And("^click on Update button to update the address on POB status$")
	public void click_on_update_button_to_update_the_address_on_pob_status() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(3000);
		Acpjob.ClickOnSendButtob();
	}

	@And("^now move job to STC status to check address change again$")
	public void now_move_job_to_stc_status_to_check_address_change_again() throws Throwable {
		Thread.sleep(2000);
		Waitjob.ClickOnAccept();
	}

	@And("^click on change address button on STC status$")
	public void click_on_change_address_button_on_stc_status() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		POBjob.ClickOnChangeDropoffAddress();
	}

	@And("^click on address zone on STC status$")
	public void click_on_address_zone_on_stc_status() throws Throwable {
		Thread.sleep(2000);
		Acpjob.ClickOnAnyMessageButton();
	}

	@And("^click on Update button on STC status$")
	public void click_on_update_button_on_stc_status() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(3000);
		Acpjob.ClickOnSendButtob();
	}

	@Then("^Change address is properly working and address zone can be changed easily$")
	public void change_address_is_properly_working_and_address_zone_can_be_changed_easily() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@Given("^Job Status should be in POB by verifying stc \"([^\"]*)\" to check for Adding extra charges$")
	public void job_status_should_be_in_pob_by_verifying_stc_something_to_check_for_adding_extra_charges(String stc)
			throws Throwable {
		Utility.waitForPageLoaded();
		Waitjob.ClickOnGobackButton();
		Thread.sleep(2000);
		String Actualtext = Acpjob.GetWaitingbuttontext();
		Assert.assertEquals(Actualtext, stc);
	}

	@When("^Scroll screen so that Add extra button should be clickable$")
	public void scroll_screen_so_that_add_extra_button_should_be_clickable() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(2000);
		touch.press(point(529, 700)).waitAction(waitOptions(ofMillis(3000))).moveTo(point(529, 1750)).release()
				.perform();
	}

	@And("^click on Add Extra button on POB status$")
	public void click_on_add_extra_button_on_pob_status() throws Throwable {
		Thread.sleep(2000);
		Utility.waitForPageLoaded();
		POBjob.ClickOnAddExtraCharges();
	}

	@And("^check to verify whole Extra Alert on POB status$")
	public void check_to_verify_whole_extra_alert_on_pob_status() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.checkforwholechatAlert();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check to verify title \"([^\"]*)\" text on Add Extra alert$")
	public void check_to_verify_title_something_text_on_add_extra_alert(String extratitle) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = POBjob.GetExtraAlerttext();
		Assert.assertEquals(Actualtext, extratitle);

	}

	@And("^check whole message area on Add Extra alert$")
	public void check_whole_message_area_on_add_extra_alert() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = POBjob.checkforwholeinputarea();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);

	}

	@And("^check cancle \"([^\"]*)\" text on Add extra alert$")
	public void check_cancle_something_text_on_add_extra_alert(String cnl) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Acpjob.Getforcanclebuttontext();
		Assert.assertEquals(Actualtext, cnl);
	}

	@And("^check ok \"([^\"]*)\" text on Add extra alert$")
	public void check_ok_something_text_on_add_extra_alert(String ok) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Acpjob.GetforSendbuttontext();
		Assert.assertEquals(Actualtext, ok);
	}

	@And("^click to Enter \"([^\"]*)\" pound extra value$")
	public void click_to_enter_something_pound_extra_value(String pound) throws Throwable {
		Utility.waitForPageLoaded();
		POBjob.Entereuro(pound);

	}

	@And("^click on OK button to add Extra charges$")
	public void click_on_ok_button_to_add_extra_charges() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		Acpjob.ClickOnSendButtob();

	}

	@And("^move job to STC screen to add Extra charges$")
	public void move_job_to_stc_screen_to_add_extra_charges() throws Throwable {
		Thread.sleep(2000);
		Waitjob.ClickOnAccept();
	}

	@And("^click on Add Extra button STC screen$")
	public void click_on_add_extra_button_stc_screen() throws Throwable {
		Thread.sleep(2000);
		Utility.waitForPageLoaded();
		POBjob.ClickOnAddExtraCharges();
	}

	@And("^click to Add \"([^\"]*)\" more extra pounds on STC screen$")
	public void click_to_add_something_more_extra_pounds_on_stc_screen(String pound) throws Throwable {
		Utility.waitForPageLoaded();
		POBjob.Entereuro(pound);
	}

	@And("^agin click on OK button to add more Extra on STC screen$")
	public void agin_click_on_ok_button_to_add_more_extra_on_stc_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		Acpjob.ClickOnSendButtob();
		Thread.sleep(2000);
	}

	@And("^click to Clear and submit feedback of job with Extra value added$")
	public void click_to_clear_and_submit_feedback_of_job_with_extra_value_added() throws Throwable {
		Utility.waitForPageLoaded();
		Acpjob.ClickOnAccept();
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		fd.ClickOnSubmit();
	}

	@Then("^Adding Extra charges can be added easily on both POB and STC Job status$")
	public void adding_extra_charges_can_be_added_easily_on_both_pob_and_stc_job_status() throws Throwable {
		Utility.waitForPageLoaded();
	}

}

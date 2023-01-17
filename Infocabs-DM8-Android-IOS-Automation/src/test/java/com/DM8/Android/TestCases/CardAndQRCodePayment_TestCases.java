package com.DM8.Android.TestCases;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.junit.Assert;

import com.DM8.Android.Pages.AcceptedJobPage;
import com.DM8.Android.Pages.FeedbackJob_Locators;
import com.DM8.Android.Pages.IncomingJobPage;
import com.DM8.Android.Pages.POBJob_Locators;
import com.DM8.Android.Pages.STCJob_Locators;
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

public class CardAndQRCodePayment_TestCases extends BaseClass {

	Utility util = new Utility();
	IncomingJobPage Injob = new IncomingJobPage(driver);
	AcceptedJobPage Acpjob = new AcceptedJobPage(driver);
	WaitingJob_Locators Waitjob = new WaitingJob_Locators(driver);
	POBJob_Locators POBjob = new POBJob_Locators(driver);
	FeedbackJob_Locators fd = new FeedbackJob_Locators(driver);
	STCJob_Locators STCjob = new STCJob_Locators(driver);
	TouchAction touch = new TouchAction((PerformsTouchActions) driver);

	@Given("^Job request are given for Card and QR code payment$")
	public void job_request_are_given_for_card_and_qr_code_payment() throws Throwable {
		Utility.waitForPageLoaded();

		JSONObject BodyData = Utility.JobCreation();
		Response response = given().header("Content-type", "application/json").and().body(BodyData.toString()).log()
				.all().when().post(prop.getProperty("JobCreatedAPI"));

		System.out.println("Access Token are this " + response.asString());
	}

	@When("^Job request are send to the server for or Card and QR code payment$")
	public void job_request_are_send_to_the_server_for_or_card_and_qr_code_payment() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@Then("^new job has been created in order to check and verify or Card and QR code payment$")
	public void new_job_has_been_created_in_order_to_check_and_verify_or_card_and_qr_code_payment() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@Given("^Job has been received on DM8 and Accept and move to STC status to verify Card payment$")
	public void job_has_been_received_on_dm8_and_accept_and_move_to_stc_status_to_verify_card_payment()
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

	@When("^check that Driver are in STC status by verifying clear \"([^\"]*)\" button text for Card payments$")
	public void check_that_driver_are_in_stc_status_by_verifying_clear_something_button_text_for_card_payments(
			String clr) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Acpjob.GetWaitingbuttontext();
		Assert.assertEquals(Actualtext, clr);
	}

	@And("^Click on Card payment button so that Card screen should be opend$")
	public void click_on_card_payment_button_so_that_card_screen_should_be_opend() throws Throwable {
		Utility.waitForPageLoaded();
		STCjob.ClickOnCardPayment();
		Thread.sleep(2000);
	}

	@And("^check for Visa Card payment button$")
	public void check_for_visa_card_payment_button() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = STCjob.CheckVisaIcon();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check for MasterCard payment button$")
	public void check_for_mastercard_payment_button() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = STCjob.CheckMasterIcon();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check for American Express payment button$")
	public void check_for_american_express_payment_button() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = STCjob.CheckAmericanExpressIcon();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check for surcharge text$")
	public void check_for_surcharge_something_text() throws Throwable {		
		Utility.waitForPageLoaded();
		boolean Actualtext = STCjob.GetForSurchargetext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check for pay button text$")
	public void check_for_pay_button_something_text() throws Throwable {	
		Utility.waitForPageLoaded();
		boolean Actualtext = STCjob.GetForpaybuttontext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check for payment cancle \"([^\"]*)\" text$")
	public void check_for_payment_cancle_something_text(String cnl) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = STCjob.GetForCancelbuttontext();
		Assert.assertEquals(Actualtext, cnl);
	}

	@And("^click on Cancle button on payment screen$")
	public void click_on_cancle_button_on_payment_screen() throws Throwable {
		Utility.waitForPageLoaded();
		STCjob.ClickOnCnacleButton();
		Thread.sleep(2000);
	}

	@Then("^Payment screen icons and UI are verified$")
	public void payment_screen_icons_and_ui_are_verified() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@Given("^check that Driver are in STC status by verifying clear \"([^\"]*)\" button text for QR Code payments$")
	public void check_that_driver_are_in_stc_status_by_verifying_clear_something_button_text_for_qr_code_payments(
			String clr) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Acpjob.GetWaitingbuttontext();
		Assert.assertEquals(Actualtext, clr);
	}

	@When("^Click on QR Code payment button so that QR Code payment alert are opned$")
	public void click_on_qr_code_payment_button_so_that_qr_code_payment_alert_are_opned() throws Throwable {
		Utility.waitForPageLoaded();
		STCjob.ClickOnQRCodeButton();
		Thread.sleep(3000);
	}

	@And("^check for QR Code \"([^\"]*)\" text$")
	public void check_for_qr_code_something_text(String code) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = STCjob.GetForQRCodetext();
		Assert.assertEquals(Actualtext, code);
	}

	@And("^check for QR Code area$")
	public void check_for_qr_code_area() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = STCjob.CheckForQRCodeArea();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check for QR code close \"([^\"]*)\" text$")
	public void check_for_qr_code_close_something_text(String close) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = STCjob.GetForClosetext();
		Assert.assertEquals(Actualtext, close);
	}

	@And("^click on Close button so that QR code alert closed$")
	public void click_on_close_button_so_that_qr_code_alert_closed() throws Throwable {
		Utility.waitForPageLoaded();
		STCjob.ClickOnCloseButton();
		Thread.sleep(2000);
	}

	@And("^click to clear and submit the job with all payments$")
	public void click_to_clear_and_submit_the_job_with_all_payments() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		Acpjob.ClickOnAccept();
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		fd.ClickOnSubmit();
	}

	@Then("^QR Code UI are also verified$")
	public void qr_code_ui_are_also_verified() throws Throwable {
		Utility.waitForPageLoaded();
	}

}

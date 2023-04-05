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

public class AccountJob_Price extends BaseClass {

	Utility util = new Utility();
	IncomingJobPage Injob = new IncomingJobPage(driver);
	AcceptedJobPage Acpjob = new AcceptedJobPage(driver);
	WaitingJob_Locators Waitjob = new WaitingJob_Locators(driver);
	FeedbackJob_Locators fd = new FeedbackJob_Locators(driver);
	STCJob_Locators stc = new STCJob_Locators(driver);
	TouchAction touch = new TouchAction((PerformsTouchActions) driver);
	JSONObject BodyData = Utility.AccountJobVerification();

	@Given("^Job request are given for Account job Verification on DM8$")
	public void job_request_are_given_for_account_job_verification_on_dm8() throws Throwable {
		Utility.waitForPageLoaded();

		Response response = given().header("Content-type", "application/json").and().body(BodyData.toString()).log()
				.all().when().post(prop.getProperty("JobCreatedAPI"));

		System.out.println("Access Token are this " + response.asString());
		System.out.println("Access Token are this " + response.path("Content.Status"));
		int JobID = response.path("Content.Status");

		Response response3 = given().when().get("http://stage.infocabs.com:98/api/Job/GetJobData?CompanyId="
				+ (prop.getProperty("Company_ID") + "&Jobnumber" + "=" + JobID));
		Thread.sleep(2000);
		System.out.println(response3.getBody().asString());
		float DriverCost = response3.path("EvoFareInfo.driverCost");
		System.out.println("The Driver Cost value is " + DriverCost);
	}

	@When("^Job request are send to the server for Account job Verification$")
	public void job_request_are_send_to_the_server_for_account_job_verification() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@Then("^new job has been created with Account job Tariff value$")
	public void new_job_has_been_created_with_account_job_tariff_value() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@Given("^Job has been received on DM8 For Account job Verification and Accept and move to STC status to verify Card payment$")
	public void job_has_been_received_on_dm8_for_account_job_verification_and_accept_and_move_to_stc_status_to_verify_card_payment()
			throws Throwable {
		Utility.waitForPageLoaded();
	}

	@When("^Accept job to verify Account job Price Value on DM8$")
	public void accept_job_to_verify_account_job_price_value_on_dm8() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(2000);
		Injob.ClickOnAccept();
	}

	@Then("^Job status should be accepte to verify Price on Account job$")
	public void job_status_should_be_accepte_to_verify_price_on_account_job() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@Given("^Job are in Accepted status to verify Account job price$")
	public void job_are_in_accepted_status_to_verify_account_job_price() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
	}

	@When("^move scroll up so that Account job Price Cost Value is visible on Accepted Screen$")
	public void move_scroll_up_so_that_account_job_price_cost_value_is_visible_on_accepted_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(2000);
		touch.press(point(529, 1750)).waitAction(waitOptions(ofMillis(3000))).moveTo(point(529, 700)).release()
				.perform();
	}

	@And("^Check to Verify The Account job Price Cost Value should be same as like Job booked from Evop on Accepted Screen$")
	public void check_to_verify_the_account_job_price_cost_value_should_be_same_as_like_job_booked_from_evop_on_accepted_screen()
			throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		String FixedFareValue = Datafile.getProperty("ADriverCost");
		Thread.sleep(1000);
		String Actualtext = Acpjob.GetJobCostValue();
		Assert.assertEquals(Actualtext, " ₤ " + FixedFareValue);
	}
	
	 @And("^Payment Type on Accepted screen it should Account Job$")
	    public void payment_type_on_accepted_screen_it_should_account_job() throws Throwable {
	        Utility.waitForPageLoaded();
	        Thread.sleep(1000);
			String StrorePaymentType = prop.getProperty("PaymentType");
			String Actualtext = Injob.GetJobPaymenttext();
			Assert.assertEquals(Actualtext, StrorePaymentType);
	    }
	
	

	@And("^move scroll down on Accepted screen so that Account job Price Cost can be check on Next screen$")
	public void move_scroll_down_on_accepted_screen_so_that_account_job_price_cost_can_be_check_on_next_screen()
			throws Throwable {
		Utility.waitForPageLoaded();
		touch.press(point(529, 700)).waitAction(waitOptions(ofMillis(3000))).moveTo(point(529, 1750)).release()
				.perform();
		Thread.sleep(2000);
	}

	@And("^Click on Waiting button to move job to Waiting Status to check Account job Price value on it$")
	public void click_on_waiting_button_to_move_job_to_waiting_status_to_check_account_job_price_value_on_it()
			throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		Waitjob.ClickOnAccept();
	}

	@Then("^Account job Price Value are verified on Accepted screen and job Status are in Waiting$")
	public void account_job_price_value_are_verified_on_accepted_screen_and_job_status_are_in_waiting()
			throws Throwable {
		Utility.waitForPageLoaded();
	}

	@Given("^Job are in Waiting status to verify Account job price$")
	public void job_are_in_waiting_status_to_verify_account_job_price() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
	}

	@When("^Check and Verify Meter Account job Price Fare value should be same as like job booked from Evop on Waiting Status$")
	public void check_and_verify_meter_account_job_price_fare_value_should_be_same_as_like_job_booked_from_evop_on_waiting_status()
			throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		String FixedFareValue = Datafile.getProperty("ADriverCost");
		Thread.sleep(1000);
		String Actualtext = Waitjob.GetMeterFareValue();
		Assert.assertEquals(Actualtext, " £ " + FixedFareValue + "0 ");
	}
	
	 @And("^check PrePaid text on Meter on Waiting job screen$")
	    public void check_prepaid_text_on_meter_on_waiting_job_screen() throws Throwable {
	       
	        Utility.waitForPageLoaded();
	        Thread.sleep(1000);
			String StrorePaymentType = prop.getProperty("Prepaidpayment");
			String Actualtext = Waitjob.GetPrePaidtext();
			Assert.assertEquals(Actualtext, StrorePaymentType);
	    }

	@And("^move scroll up so that Account job Price Cost Value is visible on Waiting Screen$")
	public void move_scroll_up_so_that_account_job_price_cost_value_is_visible_on_waiting_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(2000);
		touch.press(point(529, 1750)).waitAction(waitOptions(ofMillis(3000))).moveTo(point(529, 700)).release()
				.perform();
	}

	@And("^Check to Verify The Account job Price Cost Value should be same as like Job booked from Evop on Waiting Screen$")
	public void check_to_verify_the_account_job_price_cost_value_should_be_same_as_like_job_booked_from_evop_on_waiting_screen()
			throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		String FixedFareValue = Datafile.getProperty("ADriverCost");
		Thread.sleep(1000);
		String Actualtext = Acpjob.GetJobCostValue();
		Assert.assertEquals(Actualtext, " ₤ " + FixedFareValue);
	}
	
	 @And("^Payment Type on Waiting screen it should Account Job$")
	    public void payment_type_on_waiting_screen_it_should_account_job() throws Throwable {
		 Utility.waitForPageLoaded();
	        Thread.sleep(1000);
			String StrorePaymentType = prop.getProperty("PaymentType");
			String Actualtext = Injob.GetJobPaymenttext();
			Assert.assertEquals(Actualtext, StrorePaymentType);
	    }


	@And("^move scroll down on Waiting screen so that Account job Price Cost can be check on Next screen$")
	public void move_scroll_down_on_waiting_screen_so_that_account_job_price_cost_can_be_check_on_next_screen()
			throws Throwable {
		Utility.waitForPageLoaded();
		touch.press(point(529, 700)).waitAction(waitOptions(ofMillis(3000))).moveTo(point(529, 1750)).release()
				.perform();
		Thread.sleep(2000);
	}

	@And("^Click on POB button to move job to POB Status to check Account job Price value on it$")
	public void click_on_pob_button_to_move_job_to_pob_status_to_check_account_job_price_value_on_it()
			throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		Waitjob.ClickOnAccept();
	}

	@Then("^Account job Price Value are verified on Waiting screen and job Status are in POB$")
	public void account_job_price_value_are_verified_on_waiting_screen_and_job_status_are_in_pob() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@Given("^Job are in POB status to verify Account job price$")
	public void job_are_in_pob_status_to_verify_account_job_price() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
	}

	@When("^Check and Verify Meter Account job Price Fare value should be same as like job booked from Evop on POB Status$")
	public void check_and_verify_meter_account_job_price_fare_value_should_be_same_as_like_job_booked_from_evop_on_pob_status()
			throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		String FixedFareValue = Datafile.getProperty("ADriverCost");
		Thread.sleep(1000);
		String Actualtext = Waitjob.GetMeterFareValue();
		Assert.assertEquals(Actualtext, " £ " + FixedFareValue + "0 ");
	}
	
	 @And("^check PrePaid text on Meter on POB job screen$")
	    public void check_prepaid_text_on_meter_on_pob_job_screen() throws Throwable {
		 Utility.waitForPageLoaded();
	        Thread.sleep(1000);
			String StrorePaymentType = prop.getProperty("Prepaidpayment");
			String Actualtext = Waitjob.GetPrePaidtext();
			Assert.assertEquals(Actualtext, StrorePaymentType);
	    }

	@And("^move scroll up so that Account job Price Cost Value is visible on POB Screen$")
	public void move_scroll_up_so_that_account_job_price_cost_value_is_visible_on_pob_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(2000);
		touch.press(point(529, 1750)).waitAction(waitOptions(ofMillis(3000))).moveTo(point(529, 700)).release()
				.perform();
	}

	@And("^Check to Verify The Account job Price Cost Value should be same as like Job booked from Evop on POB Screen$")
	public void check_to_verify_the_account_job_price_cost_value_should_be_same_as_like_job_booked_from_evop_on_pob_screen()
			throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		String FixedFareValue = Datafile.getProperty("ADriverCost");
		Thread.sleep(1000);
		String Actualtext = Acpjob.GetJobCostValue();
		Assert.assertEquals(Actualtext, " ₤ " + FixedFareValue);
	}
	
	  @And("^Payment Type on POB screen it should Account Job$")
	    public void payment_type_on_pob_screen_it_should_account_job() throws Throwable {
		  Utility.waitForPageLoaded();
	        Thread.sleep(1000);
			String StrorePaymentType = prop.getProperty("PaymentType");
			String Actualtext = Injob.GetJobPaymenttext();
			Assert.assertEquals(Actualtext, StrorePaymentType);
	    }

	@And("^move scroll down on POB screen so that Account job Price Cost can be check on Next screen$")
	public void move_scroll_down_on_pob_screen_so_that_account_job_price_cost_can_be_check_on_next_screen()
			throws Throwable {
		Utility.waitForPageLoaded();
		touch.press(point(529, 700)).waitAction(waitOptions(ofMillis(3000))).moveTo(point(529, 1750)).release()
				.perform();
		Thread.sleep(2000);
	}

	@And("^Click on STC button to move job to STC Status to check Account job Price value on it$")
	public void click_on_stc_button_to_move_job_to_stc_status_to_check_account_job_price_value_on_it()
			throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		Waitjob.ClickOnAccept();
	}

	@Then("^Account job Price Value are verified on POB screen and job Status are in STC$")
	public void account_job_price_value_are_verified_on_pob_screen_and_job_status_are_in_stc() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@Given("^Job are in STC status to verify Account job price$")
	public void job_are_in_stc_status_to_verify_account_job_price() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
	}

	@When("^Check and Verify Meter Account job Price Fare value should be same as like job booked from Evop on STC Status$")
	public void check_and_verify_meter_account_job_price_fare_value_should_be_same_as_like_job_booked_from_evop_on_stc_status()
			throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		String FixedFareValue = Datafile.getProperty("ADriverCost");
		Thread.sleep(1000);
		String Actualtext = Waitjob.GetMeterFareValue();
		Assert.assertEquals(Actualtext, " £ " + FixedFareValue + "0 ");
	}
	
	  @And("^check PrePaid text on Meter on STC job screen$")
	    public void check_prepaid_text_on_meter_on_stc_job_screen() throws Throwable {
		  Utility.waitForPageLoaded();
	        Thread.sleep(1000);
			String StrorePaymentType = prop.getProperty("Prepaidpayment");
			String Actualtext = Waitjob.GetPrePaidtext();
			Assert.assertEquals(Actualtext, StrorePaymentType);
	    }

	@And("^move scroll up so that Account job Price Cost Value is visible on STC Screen$")
	public void move_scroll_up_so_that_account_job_price_cost_value_is_visible_on_stc_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(2000);
		touch.press(point(529, 1750)).waitAction(waitOptions(ofMillis(3000))).moveTo(point(529, 700)).release()
				.perform();
	}

	@And("^Check to Verify The Account job Price Cost Value should be same as like Job booked from Evop on STC Screen$")
	public void check_to_verify_the_account_job_price_cost_value_should_be_same_as_like_job_booked_from_evop_on_stc_screen()
			throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		String FixedFareValue = Datafile.getProperty("ADriverCost");
		Thread.sleep(1000);
		String Actualtext = Acpjob.GetJobCostValue();
		Assert.assertEquals(Actualtext, " ₤ " + FixedFareValue);
	}
	
	  @And("^Payment Type on STC screen it should Account Job$")
	    public void payment_type_on_stc_screen_it_should_account_job() throws Throwable {
		  Utility.waitForPageLoaded();
	        Thread.sleep(1000);
			String StrorePaymentType = prop.getProperty("PaymentType");
			String Actualtext = Injob.GetJobPaymenttext();
			Assert.assertEquals(Actualtext, StrorePaymentType);
	    }

	@And("^move scroll down on STC screen so that Account job Price Cost can be check on Next screen$")
	public void move_scroll_down_on_stc_screen_so_that_account_job_price_cost_can_be_check_on_next_screen()
			throws Throwable {
		Utility.waitForPageLoaded();
		touch.press(point(529, 700)).waitAction(waitOptions(ofMillis(3000))).moveTo(point(529, 1750)).release()
				.perform();
		Thread.sleep(2000);
	}
	
	 @And("^verify Payment Taken Fare paid Alert on STC screen$")
	    public void verify_payment_taken_fare_paid_alert_on_stc_screen() throws Throwable {
	    
	        
	        Utility.waitForPageLoaded();
			boolean Image = stc.CheckForPaymentTaken();
			boolean expected = true;
			Assert.assertEquals(Image, expected);
	    }

	@And("^Click on Clear button and then click Submit button and Account job Fare are verified$")
	public void click_on_clear_button_and_then_click_submit_button_and_account_job_fare_are_verified()
			throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		Acpjob.ClickOnAccept();
		Utility.waitForPageLoaded();
		Thread.sleep(2000);
		fd.ClickOnSubmit();
	}

	@Then("^Account job Price Value are verified on STC screen and job are now become Completed$")
	public void account_job_price_value_are_verified_on_stc_screen_and_job_are_now_become_completed() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(2000);
	}

}

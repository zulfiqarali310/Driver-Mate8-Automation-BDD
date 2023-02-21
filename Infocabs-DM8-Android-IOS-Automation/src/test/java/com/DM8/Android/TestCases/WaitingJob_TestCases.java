package com.DM8.Android.TestCases;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.DM8.Android.Pages.AcceptedJobPage;
import com.DM8.Android.Pages.WaitingJob_Locators;
import com.DM8.Common.BaseClass;
import com.DM8.Common.Utility;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WaitingJob_TestCases extends BaseClass {

	private static Logger log = LogManager.getLogger(WaitingJob_TestCases.class);
	WaitingJob_Locators Waitjob = new WaitingJob_Locators(driver);
	AcceptedJobPage Acpjob = new AcceptedJobPage(driver);
	TouchAction touch = new TouchAction((PerformsTouchActions) driver);

	@Given("^Meter Alerts comes as Driver move to the Waiting screen$")
	public void meter_alerts_comes_as_driver_move_to_the_waiting_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(2000);
		log.info("Accepted job screens comes as job accepted by the driver");
	}

	@When("^Verify Cost value and text$")
	public void verify_cost_value_and_text() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Waitjob.CheckCosttext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check distance \"([^\"]*)\" text$")
	public void check_distance_something_text(String distance) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Waitjob.Getdistancetext();
		Assert.assertEquals(Actualtext, distance);
	}

	@And("^check to verify miles covered values and text$")
	public void check_to_verify_miles_covered_values_and_text() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Waitjob.CheckmilestextValues();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^Check Progress loader icon$")
	public void check_progress_loader_icon() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Waitjob.CheckProgresswaitingImageIcon();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check waiting lable \"([^\"]*)\" text$")
	public void check_waiting_lable_something_text(String waiting) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Waitjob.GetwaitingLabletexttext();
		Assert.assertEquals(Actualtext, waiting);
	}

	@And("^Check waiting time value$")
	public void check_waiting_time_value() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Waitjob.Checkwaitingtimervalue();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^click on Meter expand button to see meter details$")
	public void click_on_meter_expand_button_to_see_meter_details() throws Throwable {
		Utility.waitForPageLoaded();
		log.info("click on Meter expand button to see meter details");
		Waitjob.ClickOnMeterExpandButton();
	}

	@And("^check tariff \"([^\"]*)\" text$")
	public void check_tariff_something_text(String tariff) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Waitjob.GetTarifftext();
		Assert.assertEquals(Actualtext, tariff);
	}

	@And("^check tariff value \"([^\"]*)\" text$")
	public void check_tariff_value_something_text(String tariffvalue) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Waitjob.GetTariffValue();
		Assert.assertEquals(Actualtext, tariffvalue);
	}

	@And("^Check meter waiting \"([^\"]*)\" text$")
	public void check_meter_waiting_something_text(String waitlabel) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Waitjob.GetWaitinglabeltext();
		Assert.assertEquals(Actualtext, waitlabel);
	}

	@And("^check meter waiting value$")
	public void check_meter_waiting_value() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Waitjob.CheckwaitingVlaue();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^Check meter extra \"([^\"]*)\" text$")
	public void check_meter_extra_something_text(String extra) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Waitjob.GetExtralabeltext();
		Assert.assertEquals(Actualtext, extra);
	}

	@And("^check meter extra value$")
	public void check_meter_extra_value() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Waitjob.CheckExtraVlaue();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^Check meter discount percentage \"([^\"]*)\" text$")
	public void check_meter_discount_percentage_something_text(String discountper) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Waitjob.GetDiscountPercenatgetext();
		Assert.assertEquals(Actualtext, discountper);
	}

	@And("^check meter discount percentage value$")
	public void check_meter_discount_percentage_value() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Waitjob.CheckDiscountPercentageVlaue();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^Check stop waiting \"([^\"]*)\" text$")
	public void check_stop_waiting_something_text(String stopwaiting) throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Waitjob.VerifyStartStopWaitingtext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^click on Stop waiting button$")
	public void click_on_stop_waiting_button() throws Throwable {
		Utility.waitForPageLoaded();
		Waitjob.ClickOnStartstopWaitingButton();
		Thread.sleep(2000);
	}

	@And("^Check Start waiting \"([^\"]*)\" text$")
	public void check_start_waiting_something_text(String startwaiting) throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Waitjob.VerifyStartStopWaitingtext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^click on Start waiting button again$")
	public void click_on_start_waiting_button_again() throws Throwable {
		Utility.waitForPageLoaded();
		Waitjob.ClickOnStartstopWaitingButton();
		Thread.sleep(2000);
	}

	@And("^Verify customer image on Waiting screen$")
	public void verify_customer_image_on_waiting_screen() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.CheckPersonimageicon();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^verify customer name on Waiting screen$")
	public void verify_customer_name_on_waiting_screen() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.CheckCustomerNameicon();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^Verify Send SMS Ring back button icon$")
	public void verify_send_sms_ring_back_button_icon() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Waitjob.CheckSendSMSRingbackicon();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^getting late icon on Waiting screen$")
	public void getting_late_icon_on_waiting_screen() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.CheckLateicon();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^message chat icon on Waiting screen$")
	public void message_chat_icon_on_waiting_screen() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.CheckChaticon();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}
	
	 @And("^click again on Meter expand button to close meter details on waiting screen$")
	    public void click_again_on_meter_expand_button_to_close_meter_details_on_waiting_screen() throws Throwable {
		 Utility.waitForPageLoaded();
			Waitjob.ClickOnMeterExpandButton();
			Thread.sleep(2000);
	    }


	@Then("^Meter UI texts and buttons clicks are verified$")
	public void meter_ui_texts_and_buttons_clicks_are_verified() throws Throwable {
		Utility.waitForPageLoaded();

	}

	@When("^Driver is on Waiting Screen and lets verify Waiting screens UI and texts fields$")
	public void driver_is_on_waiting_screen_and_lets_verify_waiting_screens_ui_and_texts_fields() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@And("^move scroll up so that pick and drop address and screen UI are visible on waiting screen$")
	public void move_scroll_up_so_that_pick_and_drop_address_and_screen_ui_are_visible_on_waiting_screen()
			throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(2000);
		touch.press(point(529, 1750)).waitAction(waitOptions(ofMillis(3000))).moveTo(point(529, 700)).release()
				.perform();
	}

	@And("^verify waiting screen re route icon$")
	public void verify_waiting_screen_re_route_icon() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.CheckRerouticon();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^verify waiting screen current location icon$")
	public void verify_waiting_screen_current_location_icon() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.CheckGetcurrentlocationicon();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^verify waiting screen start navigation icon$")
	public void verify_waiting_screen_start_navigation_icon() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.CheckGetNavigationicon();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^verify waiting screen pickup whole box$")
	public void verify_waiting_screen_pickup_whole_box() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.CheckPickUpwholeblock();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^verify waiting screen dropoff whole box$")
	public void verify_waiting_screen_dropoff_whole_box() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.CheckDropofwhole();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^Check waiting screen pickup zone text$")
	public void check_waiting_screen_pickup_zone_text() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.GetPickupZonetext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^Check waiting screen pickup address text$")
	public void check_waiting_screen_pickup_address_text() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.GetPickupAddresstext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check waiting screen dropoff zone text$")
	public void check_waiting_screen_dropoff_zone_text() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.GetDropoffZonetext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check waiting screen dropoff Address text$")
	public void check_waiting_screen_dropoff_address_text() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.GetDropoffAddresstext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check waiting screen jobtype text$")
	public void check_waiting_screen_jobtype_text() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.GetJobTypetext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check waiting screen payment text$")
	public void check_waiting_screen_payment_text() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.GetJobPaymenttext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check waiting screen Booking text$")
	public void check_waiting_screen_booking_text() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.GetJobBookingtext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check waiting screen tariff text$")
	public void check_waiting_screen_tariff_text() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.GetJobTarifftext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check waiting screen driver notes text$")
	public void check_waiting_screen_driver_notes_text() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.GetDriverNotestext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check pob button \"([^\"]*)\" text$")
	public void check_pob_button_something_text(String pob) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Acpjob.GetWaitingbuttontext();
		Assert.assertEquals(Actualtext, pob);
	}

	@And("^move scroll down so that pick and drop address and screen UI are not visible on waiting screen$")
	public void move_scroll_down_so_that_pick_and_drop_address_and_screen_ui_are_not_visible_on_waiting_screen()
			throws Throwable {
		Utility.waitForPageLoaded();
		touch.press(point(529, 700)).waitAction(waitOptions(ofMillis(3000))).moveTo(point(529, 1750)).release()
				.perform();
		Thread.sleep(2000);
	}

	@Then("^Waiting Job screen UI elements are verified$")
	public void waiting_job_screen_ui_elements_are_verified() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@When("^Driver Click on pob button$")
	public void driver_click_on_pob_button() throws Throwable {
		Utility.waitForPageLoaded();
		log.info("Driver Click on POB button");
		Waitjob.ClickOnAccept();
	}

	@Then("^Job Status become POB$")
	public void job_status_become_pob() throws Throwable {
		Utility.waitForPageLoaded();
		log.info("Job Status become POB");
	}

}

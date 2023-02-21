package com.DM8.Android.TestCases;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.DM8.Android.Pages.AcceptedJobPage;
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

public class POBJob_TestCases extends BaseClass {

	private static Logger log = LogManager.getLogger(POBJob_TestCases.class);
	POBJob_Locators POBjob = new POBJob_Locators(driver);
	WaitingJob_Locators Waitjob = new WaitingJob_Locators(driver);
	AcceptedJobPage Acpjob = new AcceptedJobPage(driver);
	TouchAction touch = new TouchAction((PerformsTouchActions) driver);

	@Given("^Meter Alerts comes as Driver move to the POB screen$")
	public void meter_alerts_comes_as_driver_move_to_the_pob_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(2000);
	}

	@When("^Verify Cost value and text on POB screen$")
	public void verify_cost_value_and_text_on_pob_screen() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Waitjob.CheckCosttext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check distance \"([^\"]*)\" text on POB screen$")
	public void check_distance_something_text_on_pob_screen(String distance) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Waitjob.Getdistancetext();
		Assert.assertEquals(Actualtext, distance);
	}

	@And("^check to verify miles covered values and text on POB screen$")
	public void check_to_verify_miles_covered_values_and_text_on_pob_screen() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Waitjob.CheckmilestextValues();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^Check Progress loader icon on POB screen$")
	public void check_progress_loader_icon_on_pob_screen() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Waitjob.CheckProgresswaitingImageIcon();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check pob lable \"([^\"]*)\" text$")
	public void check_pob_lable_something_text(String waiting) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Waitjob.GetwaitingLabletexttext();
		Assert.assertEquals(Actualtext, waiting);
	}

	@And("^Check pob time value$")
	public void check_pob_time_value() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Waitjob.Checkwaitingtimervalue();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^click on Meter expand button on pob to see meter details$")
	public void click_on_meter_expand_button_on_pob_to_see_meter_details() throws Throwable {
		Utility.waitForPageLoaded();
		Waitjob.ClickOnMeterExpandButton();
		Thread.sleep(2000);
	}

	@And("^check tariff \"([^\"]*)\" text on POB screen$")
	public void check_tariff_something_text_on_pob_screen(String tariff) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Waitjob.GetTarifftext();
		Assert.assertEquals(Actualtext, tariff);
	}

	@And("^check pob screen tariff value \"([^\"]*)\" text$")
	public void check_pob_screen_tariff_value_something_text(String tariffvalue) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Waitjob.GetTariffValue();
		Assert.assertEquals(Actualtext, tariffvalue);
	}

	@And("^Check meter pob \"([^\"]*)\" text$")
	public void check_meter_pob_something_text(String waitlabel) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Waitjob.GetWaitinglabeltext();
		Assert.assertEquals(Actualtext, waitlabel);
	}

	@And("^check meter pob value$")
	public void check_meter_pob_value() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Waitjob.CheckwaitingVlaue();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^Check meter extra \"([^\"]*)\" text on pob screen$")
	public void check_meter_extra_something_text_on_pob_screen(String extra) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Waitjob.GetExtralabeltext();
		Assert.assertEquals(Actualtext, extra);
	}

	@And("^check meter extra value on pob$")
	public void check_meter_extra_value_on_pob() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Waitjob.CheckExtraVlaue();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^Check meter discount percentage \"([^\"]*)\" text on pob screen$")
	public void check_meter_discount_percentage_something_text_on_pob_screen(String discountper) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Waitjob.GetDiscountPercenatgetext();
		Assert.assertEquals(Actualtext, discountper);
	}

	@And("^check meter discount percentage value on pob screen$")
	public void check_meter_discount_percentage_value_on_pob_screen() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Waitjob.CheckDiscountPercentageVlaue();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^Check stop waiting \"([^\"]*)\" text on pob screen$")
	public void check_stop_waiting_something_text_on_pob_screen(String stopwaiting) throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Waitjob.VerifyStartStopWaitingtext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^click on Stop waiting button on pob screen$")
	public void click_on_stop_waiting_button_on_pob_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Waitjob.ClickOnStartstopWaitingButton();
		Thread.sleep(2000);
	}

	@And("^Check Start waiting \"([^\"]*)\" text on pob screen$")
	public void check_start_waiting_something_text_on_pob_screen(String startwaiting) throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Waitjob.VerifyStartStopWaitingtext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^click on Start waiting button again on pob screen$")
	public void click_on_start_waiting_button_again_on_pob_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Waitjob.ClickOnStartstopWaitingButton();
		Thread.sleep(2000);
	}

	@And("^Check to verify stop meter \"([^\"]*)\" text on pob screen$")
	public void check_to_verify_stop_meter_something_text_on_pob_screen(String stopmeter) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = POBjob.GetStartStopMetertext();
		Assert.assertEquals(Actualtext, stopmeter);
	}

	@And("^click on Stop meter button on pob screen$")
	public void click_on_stop_meter_button_on_pob_screen() throws Throwable {
		Utility.waitForPageLoaded();
		POBjob.ClickOnStartStopMeter();
		Thread.sleep(2000);
	}

	@And("^check to verify Start meter \"([^\"]*)\" text on pob screen$")
	public void check_to_verify_start_meter_something_text_on_pob_screen(String startmeter) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = POBjob.GetStartStopMetertext();
		Assert.assertEquals(Actualtext, startmeter);
	}

	@And("^click on Start meter button on pob screen$")
	public void click_on_start_meter_button_on_pob_screen() throws Throwable {
		Utility.waitForPageLoaded();
		POBjob.ClickOnStartStopMeter();
		Thread.sleep(2000);
	}

	@And("^check to verify Add extra charges \"([^\"]*)\" on pob screen$")
	public void check_to_verify_add_extra_charges_something_on_pob_screen(String addextracharges) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = POBjob.GetExtraButtontext();
		Assert.assertEquals(Actualtext, addextracharges);
	}

	@And("^Verify customer image on pob screen$")
	public void verify_customer_image_on_pob_screen() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.CheckPersonimageicon();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^verify customer name on pob screen$")
	public void verify_customer_name_on_pob_screen() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.CheckCustomerNameicon();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^message chat icon on pob screen$")
	public void message_chat_icon_on_pob_screen() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.CheckChaticon();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}
	
	 @And("^click again on Meter expand button to close meter details on pob screen$")
	    public void click_again_on_meter_expand_button_to_close_meter_details_on_pob_screen() throws Throwable {
		 Utility.waitForPageLoaded();
			Waitjob.ClickOnMeterExpandButton();
			Thread.sleep(2000);
	    }

	@Then("^Meter UI texts and buttons clicks are verified on pob screen$")
	public void meter_ui_texts_and_buttons_clicks_are_verified_on_pob_screen() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@When("^Driver is on POB Screen and lets verify Waiting screens UI and texts fields$")
	public void driver_is_on_pob_screen_and_lets_verify_waiting_screens_ui_and_texts_fields() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(2000);
	}

	@And("^move scroll up so that pick and drop address and screen UI are visible on pob screen$")
	public void move_scroll_up_so_that_pick_and_drop_address_and_screen_ui_are_visible_on_pob_screen()
			throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(2000);
		touch.press(point(529, 1750)).waitAction(waitOptions(ofMillis(3000))).moveTo(point(529, 700)).release()
				.perform();
	}

	@And("^verify pob screen current location icon$")
	public void verify_pob_screen_current_location_icon() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.CheckGetcurrentlocationicon();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^verify pob screen start navigation icon$")
	public void verify_pob_screen_start_navigation_icon() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.CheckGetNavigationicon();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^verify pob screen pickup whole box$")
	public void verify_pob_screen_pickup_whole_box() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.CheckPickUpwholeblock();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^verify pob screen dropoff whole box$")
	public void verify_pob_screen_dropoff_whole_box() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.CheckDropofwhole();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^Check pob screen pickup zone text$")
	public void check_pob_screen_pickup_zone_text() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.GetPickupZonetext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^Check pob screen pickup address text$")
	public void check_pob_screen_pickup_address_text() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.GetPickupAddresstext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check pob screen dropoff zone text$")
	public void check_pob_screen_dropoff_zone_text() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.GetDropoffZonetext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check pob screen dropoff Address text$")
	public void check_pob_screen_dropoff_address_text() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.GetDropoffAddresstext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check change dropoff address \"([^\"]*)\" text on pob screen$")
	public void check_change_dropoff_address_something_text_on_pob_screen(String dropoffaddress) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = POBjob.GetDrooffAddresstext();
		Assert.assertEquals(Actualtext, dropoffaddress);
	}

	@And("^check pob screen jobtype text$")
	public void check_pob_screen_jobtype_text() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.GetJobTypetext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check pob screen payment text$")
	public void check_pob_screen_payment_text() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.GetJobPaymenttext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check pob screen Booking text$")
	public void check_pob_screen_booking_text() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.GetJobBookingtext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check pob screen tariff text$")
	public void check_pob_screen_tariff_text() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.GetJobTarifftext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check pob screen driver notes text$")
	public void check_pob_screen_driver_notes_text() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.GetDriverNotestext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check stc button \"([^\"]*)\" text$")
	public void check_stc_button_something_text(String stc) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Acpjob.GetWaitingbuttontext();
		Assert.assertEquals(Actualtext, stc);
	}

	@And("^move scroll down so that pick and drop address and screen UI are not visible on pob screen$")
	public void move_scroll_down_so_that_pick_and_drop_address_and_screen_ui_are_not_visible_on_pob_screen()
			throws Throwable {
		Utility.waitForPageLoaded();
		touch.press(point(529, 700)).waitAction(waitOptions(ofMillis(3000))).moveTo(point(529, 1750)).release()
				.perform();
		Thread.sleep(2000);
	}

	@Then("^POB Job screen UI elements are verified$")
	public void pob_job_screen_ui_elements_are_verified() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@When("^Driver Click on stc button$")
	public void driver_click_on_stc_button() throws Throwable {
		Utility.waitForPageLoaded();
		log.info("Driver Click on STC button");
		POBjob.ClickOnAccept();
	}

	@Then("^Job Status become STC$")
	public void job_status_become_stc() throws Throwable {
		Utility.waitForPageLoaded();
		log.info("Job Status become STC");
	}

}

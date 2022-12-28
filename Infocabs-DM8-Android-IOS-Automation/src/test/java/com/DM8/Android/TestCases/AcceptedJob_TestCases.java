package com.DM8.Android.TestCases;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

import com.DM8.Android.Pages.AcceptedJobPage;
import com.DM8.Common.BaseClass;
import com.DM8.Common.ScreenActions;
import com.DM8.Common.Utility;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AcceptedJob_TestCases extends BaseClass {

	private static Logger log = LogManager.getLogger(AcceptedJob_TestCases.class);
	AcceptedJobPage Acpjob = new AcceptedJobPage(driver);
	ScreenActions sc = new ScreenActions();
	TouchAction touch = new TouchAction((PerformsTouchActions) driver);

	@Given("^Accepted job screens comes as job accepted by the driver$")
	public void accepted_job_screens_comes_as_job_accepted_by_the_driver() throws Throwable {
		log.info("Accepted job screens comes as job accepted by the driver");
	
	}
	
	@When("^move scroll up so that pick and drop address and screen UI are visible$")
	public void move_scroll_up_pick_and_drop() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(2000);
		touch.press(point(529, 1750)).waitAction(waitOptions(ofMillis(3000))).moveTo(point(529, 700)).release()
				.perform();
	}

	@And("^Verify customer image$")
	public void verify_customer_image() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.CheckPersonimageicon();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^verify customer name$")
	public void verify_customer_name() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.CheckCustomerNameicon();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^getting late icon$")
	public void getting_late_icon() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.CheckLateicon();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^message chat icon$")
	public void message_chat_icon() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.CheckChaticon();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^re route icon$")
	public void re_route_icon() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.CheckRerouticon();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^current location icon$")
	public void current_location_icon() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.CheckGetcurrentlocationicon();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^verify start navigation icon$")
	public void verify_start_navigation_icon() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.CheckGetNavigationicon();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check pickup whole box$")
	public void check_pickup_whole_box() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.CheckPickUpwholeblock();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check dropoff whole box$")
	public void check_dropoff_whole_box() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.CheckDropofwhole();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^Check accepted screen pickup zone text$")
	public void check_pickup_zone_text() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.GetPickupZonetext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^Check accepted screen pickup address text$")
	public void check_pickup_address_text() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.GetPickupAddresstext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check accepted screen dropoff zone text$")
	public void check_dropoff_zone_text() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.GetDropoffZonetext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check accepted screen dropoff Address text$")
	public void check_dropoff_address_text() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.GetDropoffAddresstext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check accepted screen jobtype text$")
	public void check_jobtype_text() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.GetJobTypetext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check accepted screen payment text$")
	public void check_payment_text() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.GetJobPaymenttext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check accepted screen Booking text$")
	public void check_booking_text() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.GetJobBookingtext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check accepted screen tariff text$")
	public void check_tariff_text() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.GetJobTarifftext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check driver notes text$")
	public void check_driver_notes_text() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.GetDriverNotestext();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check waiting button \"([^\"]*)\" text$")
	public void check_accept_button_something_text(String waiting) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Acpjob.GetWaitingbuttontext();
		Assert.assertEquals(Actualtext, waiting);

	}
	
	@And("^move scroll down so that pick and drop address and screen UI are not visible$")
	public void scroll_down_pick_and_dropoff() throws Throwable {
		Utility.waitForPageLoaded();
		touch.press(point(529, 700)).waitAction(waitOptions(ofMillis(3000))).moveTo(point(529, 1750)).release()
				.perform();
		Thread.sleep(2000);

	}

	@Then("^Accepted Job screen UI elements are verified$")
	public void accepted_job_screen_ui_elements_are_verified() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@When("^Driver Click on Waiting button$")
	public void driver_click_on_waiting_button() throws Throwable {
		Utility.waitForPageLoaded();
		log.info("Driver Click on Waiting button");
		Acpjob.ClickOnAccept();
	}

	@Then("^Job Status become Waiting$")
	public void job_status_become_waiting() throws Throwable {
		log.info("ob Status become Waiting");
		Utility.waitForPageLoaded();
	}

}

package com.DM8.Android.TestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

import com.DM8.Android.Pages.IncomingJobPage;
import com.DM8.Common.BaseClass;
import com.DM8.Common.Utility;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IncomingJob_TestCases extends BaseClass {

	private static Logger log = LogManager.getLogger(IncomingJob_TestCases.class);
	IncomingJobPage Injob = new IncomingJobPage(driver);

	@Given("^Incoming job screens comes as job assigned to the driver$")
	public void incoming_job_screens_comes_as_job_assigned_to_the_driver() throws Throwable {
		log.info("Incoming job screens comes as job assigned to the driver");
		Utility.waitForPageLoaded();

	}

	@When("^Verify Job offer text$")
	public void verify_job_offer_text() throws Throwable {
		Utility.waitForPageLoaded();
		boolean ImageLogo = driver.findElement(By.id(prop.getProperty("IncomingScreenJobtitle"))).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@And("^Check and verify reject \"([^\"]*)\" text$")
	public void check_and_verify_reject_something_text(String reject) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Injob.GetRejectButtontext();
		Assert.assertEquals(Actualtext, reject);
	}

	@And("^Check timer text$")
	public void check_timer_text() throws Throwable {
		Utility.waitForPageLoaded();
		boolean ImageLogo = driver.findElement(By.id(prop.getProperty("IncomingjobScreentimer"))).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@And("^Check pickup zone text$")
	public void check_pickup_zone_text() throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Injob.GetPickupZonetext();
		Assert.assertTrue(Actualtext, true);

	}

	@And("^Check pickup address text$")
	public void check_pickup_address_text() throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Injob.GetPickupAddresstext();
		Assert.assertTrue(Actualtext, true);
	}

	@And("^check dropoff zone text$")
	public void check_dropoff_zone_text() throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Injob.GetDropoffZonetext();
		Assert.assertTrue(Actualtext, true);
	}

	@And("^check dropoff Address text$")
	public void check_dropoff_address_text() throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Injob.GetDropoffAddresstext();
		Assert.assertTrue(Actualtext, true);
	}

	@And("^check verify on map \"([^\"]*)\" text$")
	public void check_verify_on_map_something_text(String verifyonmap) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Injob.GetShowonMaptext();
		Assert.assertEquals(Actualtext, verifyonmap);
	}

	@And("^check jobtype text$")
	public void check_jobtype_text() throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Injob.GetJobTypetext();
		Assert.assertTrue(Actualtext, true);
	}

	@And("^check payment text$")
	public void check_payment_text() throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Injob.GetJobPaymenttext();
		Assert.assertTrue(Actualtext, true);
	}

	@And("^check Booking text$")
	public void check_booking_text() throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Injob.GetJobBookingtext();
		Assert.assertTrue(Actualtext, true);
	}

	@And("^check tariff text$")
	public void check_tariff_text() throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Injob.GetJobTarifftext();
		Assert.assertTrue(Actualtext, true);
	}

	@And("^check accept button \"([^\"]*)\" text$")
	public void check_accept_button_something_text(String accept) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Injob.GetAcceptButton();
		Assert.assertEquals(Actualtext, accept);
	}

	@Then("^Incoming Job screen text are verified$")
	public void incoming_job_screen_text_are_verified() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@When("^Driver Click on Accept button$")
	public void driver_click_on_accept_button() throws Throwable {
		Utility.waitForPageLoaded();
		log.info("Driver Click on Accept button");
		Injob.ClickOnAccept();

	}

	@Then("^Job Status become Accepted$")
	public void job_status_become_accepted() throws Throwable {
		log.info("Job Status become Accepted");
		Utility.waitForPageLoaded();

	}

}

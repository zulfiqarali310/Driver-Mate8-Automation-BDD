package com.DM8.Android.TestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

import com.DM8.Android.Pages.Disclaimer;
import com.DM8.Common.BaseClass;
import com.DM8.Common.Utility;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DisclaimerScreen_TestCases extends BaseClass {
	Utility util = new Utility();

	private static Logger log = LogManager.getLogger(DisclaimerScreen_TestCases.class);
	Disclaimer dc = new Disclaimer(driver);

	@Given("^Disclaimer Screen comes as Driver login to Driver Mate8$")
	public void disclaimer_screen_comes_as_driver_login_to_driver_mate8() throws Throwable {
		Thread.sleep(2000);
		Utility.waitForPageLoaded();
	}

	@When("^check to verify disclaimer \"([^\"]*)\" text$")
	public void check_to_verify_disclaimer_something_text(String diclaimer) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = dc.GetStarted();
		Assert.assertEquals(Actualtext, diclaimer);
	}

	@And("^check to instruction \"([^\"]*)\" text$")
	public void check_to_instruction_something_text(String instruction) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = dc.InstructionText();
		Assert.assertEquals(Actualtext, instruction + " ");
	}

	@And("^check to driverpolicy \"([^\"]*)\" text$")
	public void check_to_driverpolicy_something_text(String driverpolicy) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = dc.GetHeadingText();
		Assert.assertEquals(Actualtext, driverpolicy);
	}

	@And("^check to verify driver details policy$")
	public void check_to_verify_driver_details_policy() throws Throwable {
		Utility.waitForPageLoaded();
		//boolean ImageLogo = driver.findElement(By.id(prop.getProperty("CheckDriverPolicy"))).isDisplayed();
		//boolean expected = true;
		//Assert.assertEquals(ImageLogo, expected);
	}

	@And("^then Click on Accept button$")
	public void then_click_on_accept_button() throws Throwable {
		Utility.waitForPageLoaded();
		dc.ClickOnAccept();

	}

	@Then("^Driver Move to Driver Mate8 HomeScreen$")
	public void driver_move_to_driver_mate8_homescreen() throws Throwable {
		Utility.waitForPageLoaded();

	}

}

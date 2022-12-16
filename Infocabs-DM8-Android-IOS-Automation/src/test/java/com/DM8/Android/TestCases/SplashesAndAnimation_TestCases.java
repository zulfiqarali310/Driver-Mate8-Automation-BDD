package com.DM8.Android.TestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

import com.DM8.Android.Pages.SplashesAndAnimation;
import com.DM8.Common.BaseClass;
import com.DM8.Common.Utility;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SplashesAndAnimation_TestCases extends BaseClass {

	private static Logger log = LogManager.getLogger(SplashesAndAnimation_TestCases.class);
	SplashesAndAnimation SP = new SplashesAndAnimation(driver);

	@Given("^Device permission Alerts and Splashes screens comes as Driver Mate8 lunched$")
	public void device_permission_alerts_and_splashes_screens_comes_as_driver_mate8_lunched() throws Throwable {
		Utility.waitForPageLoaded();
		log.info("Driver Mate Application should be luched after installation");
	}

	@When("^Click to Allow device Location permission$")
	public void click_to_allow_device_location_permission() throws Throwable {
		Utility.waitForPageLoaded();
		SP.AllowLocation();
	}

	@Then("^User should grant Device permission & User should move to the Register screen after Splashes screen movement Driver Mate8$")
	public void user_should_grant_device_permission_user_should_move_to_the_register_screen_after_splashes_screen_movement_driver_mate8()
			throws Throwable {
		Utility.waitForPageLoaded();
		log.info(" Then Device permission should be allowed and Splashes screen should be moved");
	}

	@And("^Click to Allow device Phone Calls permission$")
	public void click_to_allow_device_phone_calls_permission() throws Throwable {
		Utility.waitForPageLoaded();
		SP.AllowStorageCalls();
	}

	@And("^Click to Allow device Storage permission$")
	public void click_to_allow_device_storage_permission() throws Throwable {
		Utility.waitForPageLoaded();
		SP.AllowStorageCalls();
	}

	@And("^Verify DM8 logo$")
	public void verify_dm8_logo() throws Throwable {
		Utility.waitForPageLoaded();
		boolean ImageLogo = driver.findElement(By.id(prop.getProperty("DM8LogoLocator"))).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);

	}

	@And("^Verify DM8 onboarding image$")
	public void verify_dm8_onboarding_image() throws Throwable {
		Utility.waitForPageLoaded();
		boolean ImageLogo = driver.findElement(By.id(prop.getProperty("DM8OnboardingLocator"))).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);

	}

	@And("^Verify welcome \"([^\"]*)\" text$")
	public void verify_something_text1(String welcome) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = SP.GetWlcmText();
		Assert.assertEquals(Actualtext, welcome);
	}

	@And("^Verify details \"([^\"]*)\" text$")
	public void verify_something_text2(String details) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = SP.GetDetailText();
		Assert.assertEquals(Actualtext, details);
	}

	@And("^Verify sign \"([^\"]*)\" text$")
	public void verify_sigin_something_text(String sgn) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = SP.GetSiginText();
		Assert.assertEquals(Actualtext, " " + sgn);
	}

	@And("^Tab on Get Started button$")
	public void tab_on_get_started_button() throws Throwable {
		Utility.waitForPageLoaded();
		SP.GetStartedButton();
	}

	@And("^Verify DM8 onboarding image2$")
	public void verify_dm8_onboarding_image2() throws Throwable {
		Utility.waitForPageLoaded();
		boolean ImageLogo = driver.findElement(By.id(prop.getProperty("DM8Onboardinglct2"))).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);

	}

	@And("^Verify skip \"([^\"]*)\" text$")
	public void verify_skip_something_text(String skip) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = SP.GetSkipText();
		Assert.assertEquals(Actualtext, skip);

	}

	@And("^Verify acceptdetails \"([^\"]*)\" text$")
	public void verify_acceptdetails_something_text(String acceptdetails) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = SP.GetDetailsText();
		Assert.assertEquals(Actualtext, acceptdetails);
	}

	@And("^Verify Alreadyhaveaccount \"([^\"]*)\" text$")
	public void verify_alreadyhaveaccount_something_text(String alrdaccount) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = SP.GetAlreadyAccountText();
		Assert.assertEquals(Actualtext, alrdaccount);
	}

	@And("^Tab on Next button$")
	public void tab_on_next_button() throws Throwable {
		Utility.waitForPageLoaded();
		SP.NextButton_SplashScreen();
	}

	@And("^Verify DM8 onboarding image3$")
	public void verify_dm8_onboarding_image3() throws Throwable {
		Utility.waitForPageLoaded();
		boolean ImageLogo = driver.findElement(By.id(prop.getProperty("DM8Onboardinglct3"))).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);

	}

	@And("^Verify skip2 \"([^\"]*)\" text$")
	public void verify_skip2_something_text(String skip) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = SP.GetSkipText();
		Assert.assertEquals(Actualtext, skip);
	}

	@And("^Verify realtimetracking \"([^\"]*)\" text$")
	public void verify_realtimetracking_something_text(String realtracking) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = SP.GetDetailsText();
		Assert.assertEquals(Actualtext, realtracking);
	}

	@And("^Verify Alreadyhaveaccount2 \"([^\"]*)\" text$")
	public void verify_alreadyhaveaccount2_something_text(String alrdaccount2) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = SP.GetAlreadyAccountText();
		Assert.assertEquals(Actualtext, alrdaccount2);
	}

	@And("^Tab on Next button second time$")
	public void tab_on_next_button_second_time() throws Throwable {
		Utility.waitForPageLoaded();
		SP.NextButton_SplashScreen();
	}

	@And("^Verify DM8 onboarding image4$")
	public void verify_dm8_onboarding_image4() throws Throwable {
		Utility.waitForPageLoaded();
		boolean ImageLogo = driver.findElement(By.id(prop.getProperty("DM8Onboardinglct4"))).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);

	}

	@And("^Verify skip3 \"([^\"]*)\" text$")
	public void verify_skip3_something_text(String skip) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = SP.GetSkipText();
		Assert.assertEquals(Actualtext, skip);
	}

	@And("^Verify growearningtxt \"([^\"]*)\" text$")
	public void verify_growearningtxt_something_text(String growtxt) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = SP.GetDetailsText();
		Assert.assertEquals(Actualtext, growtxt);
	}

	@And("^Verify Alongsidetxt \"([^\"]*)\" text$")
	public void verify_alongsidetxt_something_text(String alrdaccount3) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = SP.GetAlreadyAccountText();
		Assert.assertEquals(Actualtext, alrdaccount3);
	}

	@And("^Tab on Next button Thrid time$")
	public void tab_on_next_button_thrid_time() throws Throwable {
		Utility.waitForPageLoaded();
		SP.NextButton_SplashScreen();
	}

	@And("^Verify Getstarted \"([^\"]*)\" text$")
	public void verify_getstarted_something_text(String started) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = SP.GetStartedText();
		Assert.assertEquals(Actualtext, started);
	}

	@And("^Verify Instructiontxt \"([^\"]*)\" text$")
	public void verify_instructiontxt_something_text(String istruction) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = SP.GetInstractionText();
		Assert.assertEquals(Actualtext, istruction);
	}

}

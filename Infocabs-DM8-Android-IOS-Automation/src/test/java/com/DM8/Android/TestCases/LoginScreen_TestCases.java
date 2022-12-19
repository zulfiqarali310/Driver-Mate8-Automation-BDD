package com.DM8.Android.TestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

import com.DM8.Android.Pages.LoginPage;
import com.DM8.Common.BaseClass;
import com.DM8.Common.Utility;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginScreen_TestCases extends BaseClass {

	private static Logger log = LogManager.getLogger(LoginScreen_TestCases.class);
	LoginPage Login = new LoginPage(driver);

	@Given("^User is on Get Started Screen$")
	public void user_is_on_get_started_screen() throws Throwable {
		Utility.waitForPageLoaded();
		log.info("User is on Get Started Screen");
		

	}

	@When("^Click to Enter Driver Code as \"([^\"]*)\"$")
	public void click_to_enter_driver_code_as_something(String drivercode) throws Throwable {
		Utility.waitForPageLoaded();
		Login.WriteCode(drivercode);

	}

	@And("^Click On Register button$")
	public void click_on_register_button() throws Throwable {
		Utility.waitForPageLoaded();
		Login.ClickOnRegister();
	}

	@Then("^User Move to login screen$")
	public void user_move_to_login_screen() throws Throwable {
		Utility.waitForPageLoaded();
		log.info("User Move to login screen");

	}

	@Given("^User is on login Screen to verify login elements$")
	public void user_is_on_login_screen_to_verify_login_elements() throws Throwable {
		Utility.waitForPageLoaded();
		log.info("User is on login Screen to verify login elements");
	}

	@When("^check to verify \"([^\"]*)\" text$")
	public void check_to_verify_something_text(String login) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Login.GetStartedText();
		Assert.assertEquals(Actualtext, login);
	}

	@And("^check to verify login details \"([^\"]*)\" text$")
	public void check_to_verify_login_details_something_text(String logindetails) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Login.GetInstructionText();
		Assert.assertEquals(Actualtext, logindetails);
	}

	@And("^check to verify rememberme \"([^\"]*)\" text$")
	public void check_to_verify_rememberme_something_text(String rememberme) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Login.GetRemembermeText();
		Assert.assertEquals(Actualtext, rememberme);
	}

	@And("^Check to verify App version$")
	public void check_to_verify_app_version() throws Throwable {
		Utility.waitForPageLoaded();
		boolean ImageLogo = driver.findElement(By.id(prop.getProperty("CheckAppVersion"))).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Then("^Login screen screen text and datafields are available and verified$")
	public void login_screen_screen_text_and_datafields_are_available_and_verified() throws Throwable {
		Utility.waitForPageLoaded();
		
	}

	@Given("^User is on Login Screen$")
	public void user_is_on_login_screen() throws Throwable {
		Utility.waitForPageLoaded();
		log.info("User is on Login Screen");
	}

	@When("^Click to Enter Username as \"([^\"]*)\"$")
	public void click_to_enter_username_as_something(String username) throws Throwable {
		Utility.waitForPageLoaded();
		Login.EnterUsername(username);
	}

	@And("^Click to Enter Password as \"([^\"]*)\"$")
	public void click_to_enter_password_as_something(String password) throws Throwable {
		Utility.waitForPageLoaded();
		Login.EnterPassword(password);
	}

	@And("^Click On Login button$")
	public void click_on_login_button() throws Throwable {
		Utility.waitForPageLoaded();
		Login.ClickOnLoginrButton();
	}

	@Then("^User Login into the Driver Mate8 Application$")
	public void user_login_into_the_driver_mate8_application() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(2000);
	}

}

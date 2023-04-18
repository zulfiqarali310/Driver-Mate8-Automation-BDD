package com.DM8.Android.TestCases;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

import com.DM8.Android.Pages.Disclaimer;
import com.DM8.Android.Pages.HomePage;
import com.DM8.Android.Pages.LoginPage;
import com.DM8.Android.Pages.SplashesAndAnimation;
import com.DM8.Common.BaseClass;
import com.DM8.Common.Utility;

import io.appium.java_client.InteractsWithApps;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SplashesLoginScreenTestScenarios_TestCases extends BaseClass {

	private static Logger log = LogManager.getLogger(SplashesLoginScreenTestScenarios_TestCases.class);
	SplashesAndAnimation SP = new SplashesAndAnimation(driver);
	LoginPage Login = new LoginPage(driver);
	Disclaimer dc = new Disclaimer(driver);
	HomePage HP = new HomePage(driver);

	@Given("^DM8 applications are already lunched$")
	public void dm8_applications_are_already_lunched() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@When("^App is killed and open again$")
	public void app_is_killed_and_open_again() throws Throwable {
		Utility.waitForPageLoaded();
		closeApp();

	}

	@Then("^application are luched again for more testing$")
	public void application_are_luched_again_for_more_testing() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(2000);
	}

	@Given("^Driver Mate8 lunched for Already Account verification$")
	public void device_permission_alerts_and_splashes_screens_comes_as_driver_mate8_lunched_for_already_account_verification()
			throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(2000);
	}

	@And("^click on Already Account button so that Enter Code screen can be accessed for Already Account verification$")
	public void click_on_already_account_button_so_that_enter_code_screen_can_be_accessed_for_already_account_verification()
			throws Throwable {
		Utility.waitForPageLoaded();
		SP.ClickOnAlreadyAccount();
	}

	@And("^Verify Getstarted \"([^\"]*)\" text so that splashes screen is skipped for Already Account verification$")
	public void verify_getstarted_something_text_so_that_splashes_screen_is_skipped_for_already_account_verification(
			String started) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = SP.GetStartedText();
		Assert.assertEquals(Actualtext, started);
	}

	@Then("^Already have Account Scenarios are verified$")
	public void already_have_account_scenarios_are_verified() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@Given("^Driver Mate8 already lunched to verify Skip button functionality on Splashes screen$")
	public void driver_mate8_already_lunched_to_verify_skip_button_functionality_on_splashes_screen() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@When("^try to kill and Open App again for first skip verification$")
	public void try_to_kill_and_open_app_again_for_first_skip_verification() throws Throwable {
		Utility.waitForPageLoaded();
		closeApp();
	}

	@And("^click on GetStarted button for first Skip verification$")
	public void click_on_getstarted_button_for_first_skip_verification() throws Throwable {
		Utility.waitForPageLoaded();
		SP.GetStartedButton();
	}

	@And("^click on first screen skip button$")
	public void click_on_first_screen_skip_button() throws Throwable {
		Utility.waitForPageLoaded();
		SP.ClickOnSkipButton();
	}

	@And("^verify GetStarted \"([^\"]*)\" text  so that reamining two splashes screen is skipped$")
	public void verify_getstarted_something_text_so_that_reamining_two_splashes_screen_is_skipped(String started)
			throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = SP.GetStartedText();
		Assert.assertEquals(Actualtext, started);
	}

	@And("^try to kill and Open App again for Second skip verification$")
	public void try_to_kill_and_open_app_again_for_second_skip_verification() throws Throwable {
		Utility.waitForPageLoaded();
		closeApp();
	}

	@And("^click on GetStarted button for Second Skip verification$")
	public void click_on_getstarted_button_for_second_skip_verification() throws Throwable {
		Utility.waitForPageLoaded();
		SP.GetStartedButton();
	}

	@And("^Click on Next button to verify Second Skip button$")
	public void click_on_next_button_to_verify_second_skip_button() throws Throwable {
		Utility.waitForPageLoaded();
		SP.NextButton_SplashScreen();
	}

	@And("^click on Second screen skip button$")
	public void click_on_second_screen_skip_button() throws Throwable {
		Utility.waitForPageLoaded();
		SP.ClickOnSkipButton();
	}

	@And("^verify GetStarted \"([^\"]*)\" text  so that reamining one splashes screen is skipped$")
	public void verify_getstarted_something_text_so_that_reamining_one_splashes_screen_is_skipped(String started)
			throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = SP.GetStartedText();
		Assert.assertEquals(Actualtext, started);
	}

	@And("^try to kill and Open App again for third skip verification$")
	public void try_to_kill_and_open_app_again_for_third_skip_verification() throws Throwable {
		Utility.waitForPageLoaded();
		closeApp();
	}

	@And("^click on GetStarted button for third Skip verification$")
	public void click_on_getstarted_button_for_third_skip_verification() throws Throwable {
		Utility.waitForPageLoaded();
		SP.GetStartedButton();
	}

	@And("^Click on Next button to verify third Skip button$")
	public void click_on_next_button_to_verify_third_skip_button() throws Throwable {
		Utility.waitForPageLoaded();
		SP.NextButton_SplashScreen();
	}

	@And("^click on second next button for thrid skip screen skip button$")
	public void click_on_second_next_button_for_thrid_skip_screen_skip_button() throws Throwable {
		Utility.waitForPageLoaded();
		SP.NextButton_SplashScreen();
	}

	@And("^click on third screen skip button$")
	public void click_on_third_screen_skip_button() throws Throwable {
		Utility.waitForPageLoaded();
		SP.ClickOnSkipButton();
	}

	@And("^verify GetStarted \"([^\"]*)\" text  so that Skip button are working properly$")
	public void verify_getstarted_something_text_so_that_skip_button_are_working_properly(String started)
			throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = SP.GetStartedText();
		Assert.assertEquals(Actualtext, started);
	}

	@Then("^Skip button in all three screen are properly verified$")
	public void skip_button_in_all_three_screen_are_properly_verified() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@Given("^Driver should be on get Started screen so that Invalid and empty driver code attempt can be verifyied$")
	public void driver_should_be_on_get_started_screen_so_that_invalid_and_empty_driver_code_attempt_can_be_verifyied()
			throws Throwable {
		Utility.waitForPageLoaded();
	}

	@When("^Click on Register button for Empty code verification$")
	public void click_on_register_button_for_empty_code_verification() throws Throwable {
		Utility.waitForPageLoaded();
		Login.ClickOnRegister();
		Thread.sleep(2000);
	}

	@And("^alert are coming telling the user that \"([^\"]*)\" and get validate the message and click on Ok button so Empty code test can be verified$")
	public void alert_are_coming_telling_the_user_that_something_and_get_validate_the_message_and_click_on_ok_button_so_empty_code_test_can_be_verified(
			String entercode) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Login.GetErrorMessageText();
		Assert.assertEquals(Actualtext, entercode);
		Thread.sleep(2000);
		Login.ClickOnOKButton();

	}

	@And("^now enter some invalid code like \"([^\"]*)\" and click on register button$")
	public void now_enter_some_invalid_code_like_something_and_click_on_register_button(String invalidcode)
			throws Throwable {
		Utility.waitForPageLoaded();
		Login.WriteCode(invalidcode);
		Utility.waitForPageLoaded();
		Login.ClickOnRegister();
		Thread.sleep(2000);
	}

	@And("^Alert comes again with error message that \"([^\"]*)\" and validate the message and click on button so wrong code are verified$")
	public void alert_comes_again_with_error_message_that_something_and_validate_the_message_and_click_on_button_so_wrong_code_are_verified(
			String wrongcode) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Login.GetErrorMessageText();
		Assert.assertEquals(Actualtext, wrongcode);
		Thread.sleep(2000);
		Login.ClickOnOKButton();

	}

	@And("^Now clear the Driver code area so that DM8 process for valid code$")
	public void now_clear_the_driver_code_area_so_that_dm8_process_for_valid_code() throws Throwable {
		Thread.sleep(2000);
		Login.ClearDriverCodeArea();
	}

	@And("^Now Enter valid \"([^\"]*)\" and click on Register button$")
	public void now_enter_valid_something_and_click_on_register_button(String validdrivercode) throws Throwable {
		Utility.waitForPageLoaded();
		Login.WriteCode(validdrivercode);
		Utility.waitForPageLoaded();
		Login.ClickOnRegister();
		Thread.sleep(2000);
	}

	@Then("^DM8 user moves to the Login screen for furter testing$")
	public void dm8_user_moves_to_the_login_screen_for_furter_testing() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@Given("^User should be on Login screen \"([^\"]*)\" to verify the Change code functionality$")
	public void user_should_be_on_login_screen_something_to_verify_the_change_code_functionality(String login)
			throws Throwable {

		Utility.waitForPageLoaded();
		String Actualtext = Login.GetStartedText();
		Assert.assertEquals(Actualtext, login);
	}

	@When("^User click on More three dot button at right corner of the App$")
	public void user_click_on_more_three_dot_button_at_right_corner_of_the_app() throws Throwable {
		Utility.waitForPageLoaded();
		Login.ClickOnMoreButton();
		Thread.sleep(2000);
	}

	@And("^click on Change code button$")
	public void click_on_change_code_button() throws Throwable {
		Utility.waitForPageLoaded();
		Login.ClickOChangeButton();
		Thread.sleep(2000);
	}

	@And("^check to verify that User should go back to Register code \"([^\"]*)\" screen$")
	public void check_to_verify_that_user_should_go_back_to_register_code_something_screen(String started)
			throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = SP.GetStartedText();
		Assert.assertEquals(Actualtext, started);
	}

	@And("^Enter any new code \"([^\"]*)\" and click on Register button$")
	public void enter_any_new_code_something_and_click_on_register_button(String newchangecode) throws Throwable {
		Utility.waitForPageLoaded();
		Login.WriteCode(newchangecode);
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		Login.ClickOnRegister();
		Thread.sleep(2000);
	}

	@Then("^Change driver code feature are verified$")
	public void change_driver_code_feature_are_verified() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@Given("^User should be on Login screen \"([^\"]*)\" to verify the Request Password change functionality$")
	public void user_should_be_on_login_screen_something_to_verify_the_request_password_change_functionality(
			String login) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Login.GetStartedText();
		Assert.assertEquals(Actualtext, login);
	}

	@When("^User click on username field to clear the username for Password change$")
	public void user_click_on_username_field_to_clear_the_username_for_password_change() throws Throwable {
		Thread.sleep(2000);
		Login.ClearUsernameArea();
	}

	@And("^and Enter \"([^\"]*)\" to change its password$")
	public void and_enter_something_to_change_its_password(String usnameforpwdchange) throws Throwable {
		Utility.waitForPageLoaded();
		Login.EnterUsername(usnameforpwdchange);
		Thread.sleep(1000);
	}

	@And("^Select entered username from dropdown list$")
	public void select_entered_username_from_dropdown_list() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(2000);
		Login.ClickOnUsernamefield();
	}

	@And("^User click on More three dot button at right corner of the App for Request Password change$")
	public void user_click_on_more_three_dot_button_at_right_corner_of_the_app_for_request_password_change()
			throws Throwable {
		Utility.waitForPageLoaded();
		Login.ClickOnMoreButton();
		Thread.sleep(2000);
	}

	@And("^click on Request Password change button$")
	public void click_on_request_password_change_button() throws Throwable {
		Utility.waitForPageLoaded();
		Login.ClickOnRequestPasswordButton();
		Thread.sleep(2000);
	}

	@And("^Change Password Request Alert will comes and verify \"([^\"]*)\" text on request password change$")
	public void change_password_request_alert_will_comes_and_verify_something_text_on_request_password_change(
			String details) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Login.GetChangePassworddetailsText();
		Assert.assertEquals(Actualtext, details);
	}

	@And("^click on submit request button on change password request alert$")
	public void click_on_submit_request_button_on_change_password_request_alert() throws Throwable {
		Utility.waitForPageLoaded();
		Login.ClickOncontineButton();
		Thread.sleep(2000);
	}

	@And("^check to verify New password changed \"([^\"]*)\" text on alert$")
	public void check_to_verify_new_password_changed_something_text_on_alert(String newpassowrdsend) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Login.GetErrorMessageText();
		Assert.assertEquals(Actualtext, newpassowrdsend);
		Thread.sleep(2000);

	}

	@And("^click on Ok button on Change password alert$")
	public void click_on_ok_button_on_change_password_alert() throws Throwable {
		Utility.waitForPageLoaded();
		Login.ClickOnOKButton();
	}

	@And("^click on Go back button user should be on \"([^\"]*)\" screen$")
	public void click_on_go_back_button_user_should_be_on_something_screen(String started) throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(2000);
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(1000);
		String Actualtext = SP.GetStartedText();
		Assert.assertEquals(Actualtext, started);
	}

	@And("^clear the driver code field area for valid test scenarios$")
	public void clear_the_driver_code_field_area_for_valid_test_scenarios() throws Throwable {
		Thread.sleep(2000);
		Login.ClearDriverCodeArea();
	}

	@Then("^Change Password feature are verified successfully$")
	public void change_password_feature_are_verified_successfully() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@Given("^User should be on Driver Code screen to verify driver Information Missing on login screen$")
	public void user_should_be_on_driver_code_screen_to_verify_driver_information_missing_on_login_screen()
			throws Throwable {
		Utility.waitForPageLoaded();
	}

	@When("^Entered Driver code \"([^\"]*)\" for Information Missing verification$")
	public void entered_driver_code_something_for_information_missing_verification(String drivercode) throws Throwable {
		Utility.waitForPageLoaded();
		Login.WriteCode(drivercode);
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		Login.ClickOnRegister();
		Thread.sleep(2000);
	}

	@And("^Entered DriverID \"([^\"]*)\" which have not Vechile assigned$")
	public void entered_driverid_something_which_have_not_vechile_assigned(String informationdriverid)
			throws Throwable {
		Utility.waitForPageLoaded();
		Login.ClearUsernameArea();
		Thread.sleep(1000);
		Utility.waitForPageLoaded();
		Login.EnterUsername(informationdriverid);
		Thread.sleep(1000);

	}

	@And("^Enterd Password \"([^\"]*)\" for Information Missing verification$")
	public void enterd_password_something_for_information_missing_verification(String informationpwd) throws Throwable {

		Utility.waitForPageLoaded();
		Login.EnterPassword(informationpwd);
		Thread.sleep(1000);

	}

	@And("^click Login button for Information Missing verification$")
	public void click_login_button_for_information_missing_verification() throws Throwable {
		Utility.waitForPageLoaded();
		Login.ClickOnLoginrButton();
		Thread.sleep(4000);
	}

	@And("^verify and get \"([^\"]*)\" alert message for Information Missing verification$")
	public void verify_and_get_something_alert_message_for_information_missing_verification(String informationmissing)
			throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		String Actualtext = Login.GetErrorMessageText();
		Assert.assertEquals(Actualtext, informationmissing);
		Thread.sleep(1000);

	}

	@And("^click on OK button for Information Missing verification$")
	public void click_on_ok_button_for_information_missing_verification() throws Throwable {
		Utility.waitForPageLoaded();
		Login.ClickOnOKButton();
		Thread.sleep(1000);
	}

	@And("^go back to Driver code screen to verify more scenarios after Information Missing verification$")
	public void go_back_to_driver_code_screen_to_verify_more_scenarios_after_information_missing_verification()
			throws Throwable {
		Utility.waitForPageLoaded();
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(1000);
	}

	@And("^clear driver code field after Information Missing verification$")
	public void clear_driver_code_field_after_information_missing_verification() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		Login.ClearDriverCodeArea();
	}

	@Then("^Driver Information Missing are properly verified when no vechile are assigned to the driver$")
	public void driver_information_missing_are_properly_verified_when_no_vechile_are_assigned_to_the_driver()
			throws Throwable {
		Utility.waitForPageLoaded();
	}

	@Given("^User should be move to login screen with valid code so that proper validation and verification can be performed$")
	public void user_should_be_move_to_login_screen_with_valid_code_so_that_proper_validation_and_verification_can_be_performed()
			throws Throwable {
		Utility.waitForPageLoaded();
	}

	@When("^User Enter valid \"([^\"]*)\" code and Tab Register button then user move to the Login Screen$")
	public void user_enter_valid_something_code_and_tab_register_button_then_user_move_to_the_login_screen(
			String validdrivercode) throws Throwable {
		Utility.waitForPageLoaded();
		Login.WriteCode(validdrivercode);
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		Login.ClickOnRegister();
		Thread.sleep(2000);
	}

	@And("^then clear user Name field an click on Login button for Empty UserName validation$")
	public void then_clear_user_name_field_an_click_on_login_button_for_empty_username_validation() throws Throwable {
		Thread.sleep(1000);
		Login.ClearUsernameArea();
		Thread.sleep(1000);
		Utility.waitForPageLoaded();
		Login.ClickOnLoginrButton();
	}

	@And("^verify required Username \"([^\"]*)\" alert error message and click Ok button$")
	public void verify_required_username_something_alert_error_message_and_click_ok_button(String unamerequired)
			throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Login.GetErrorMessageText();
		Assert.assertEquals(Actualtext, unamerequired);
		Thread.sleep(2000);
		Login.ClickOnOKButton();
	}

	@And("^then next time Enter valid Username \"([^\"]*)\" and click on Login button$")
	public void then_next_time_enter_valid_username_something_and_click_on_login_button(String Username)
			throws Throwable {
		Utility.waitForPageLoaded();
		Login.EnterUsername(Username);
		Thread.sleep(1000);
		Utility.waitForPageLoaded();
		Login.ClickOnLoginrButton();
	}

	@And("^verify password required alert error \"([^\"]*)\" message and click on OK button$")
	public void verify_password_required_alert_error_something_message_and_click_on_ok_button(String pwdrequired)
			throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Login.GetErrorMessageText();
		Assert.assertEquals(Actualtext, pwdrequired);
		Thread.sleep(2000);
		Login.ClickOnOKButton();
	}

	@And("^then enter wrong \"([^\"]*)\" password and click on OK button$")
	public void then_enter_wrong_something_password_and_click_on_ok_button(String wrongpwd) throws Throwable {
		Utility.waitForPageLoaded();
		Login.EnterPassword(wrongpwd);
		Thread.sleep(1000);
		Login.ClickOnLoginrButton();
	}

	@And("^verify invalid password or username error \"([^\"]*)\" message and click on OK Button$")
	public void verify_invalid_password_or_username_error_something_message_and_click_on_ok_button(
			String invalidunamepwd) throws Throwable {

		Utility.waitForPageLoaded();
		String Actualtext = Login.GetErrorMessageText();
		Assert.assertEquals(Actualtext, invalidunamepwd);
		Thread.sleep(2000);
		Login.ClickOnOKButton();
		Thread.sleep(2000);
	}

	@And("^then clear the wrong password feild for valid password$")
	public void then_clear_the_wrong_password_feild_for_valid_password() throws Throwable {
		Utility.waitForPageLoaded();
		Login.ClearPasswordArea();
		Thread.sleep(2000);
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(1000);

	}

	@And("^Enter valid \"([^\"]*)\" password for further level of testing$")
	public void enter_valid_something_password_for_further_level_of_testing(String password) throws Throwable {
		Utility.waitForPageLoaded();
		Login.EnterPassword(password);
		Thread.sleep(1000);
	}

	@Then("^UserName and Password field Invalid and validation are verified with proper error message$")
	public void username_and_password_field_invalid_and_validation_are_verified_with_proper_error_message()
			throws Throwable {
		Utility.waitForPageLoaded();
	}

	@Given("^User must be on login screen and username and password must be entered$")
	public void user_must_be_on_login_screen_and_username_and_password_must_be_entered() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@When("^check that Username \"([^\"]*)\" are entered before login$")
	public void check_that_username_something_are_entered_before_login(String username) throws Throwable {

		Utility.waitForPageLoaded();
		String Actualtext = Login.VerifyGetUsername();
		Assert.assertEquals(Actualtext, username);

	}

	@And("^check that password \"([^\"]*)\" are entered before login$")
	public void check_that_password_something_are_entered_before_login(String password) throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Login.VerifyGetPassword();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^Tick on remember me tick box$")
	public void tick_on_remember_me_tick_box() throws Throwable {
		Utility.waitForPageLoaded();
		Login.ClickONRemmberMeTickBox();
		Thread.sleep(1000);
	}

	@And("^click on Login button for remember me verification$")
	public void click_on_login_button_for_remember_me_verification() throws Throwable {
		Utility.waitForPageLoaded();
		Login.ClickOnLoginrButton();
		Thread.sleep(3000);
	}

	@And("^click on disclaimer Accept button for remember me verification$")
	public void click_on_disclaimer_accept_button_for_remember_me_verification() throws Throwable {
		Utility.waitForPageLoaded();
		dc.ClickOnAccept();
		Thread.sleep(3000);

	}

	@And("^then verify that user should be on Homescreen by verifing side menue icon for remember me verification$")
	public void then_verify_that_user_should_be_on_homescreen_by_verifing_side_menue_icon_for_remember_me_verification()
			throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = HP.VerifyMenuButtonisPresent();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);

	}

	@And("^then click on Side menu icon button for remember me verification$")
	public void then_click_on_side_menu_icon_button_for_remember_me_verification() throws Throwable {
		Utility.waitForPageLoaded();
		HP.ClickOnMenuhbutton();
	}

	@And("^click on Logout button and logout from DM8 for remember me verification$")
	public void click_on_logout_button_and_logout_from_dm8_for_remember_me_verification() throws Throwable {
		Utility.waitForPageLoaded();
		HP.ClickOnLogoutbutton();
		Thread.sleep(2000);
		Utility.waitForPageLoaded();
		HP.ClickOnLogoutAlert1button();
		Thread.sleep(2000);

	}

	@And("^verify that Username \"([^\"]*)\" is present and entered after logout$")
	public void verify_that_username_something_is_present_and_entered_after_logout(String username) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Login.VerifyGetUsername();
		Assert.assertEquals(Actualtext, username);
	}

	@And("^verify that Password \"([^\"]*)\" is present and entered after logout$")
	public void verify_that_password_something_is_present_and_entered_after_logout(String password) throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Login.VerifyGetPassword();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^again click on Login button to verify that same entered Username and Password are working fine$")
	public void again_click_on_login_button_to_verify_that_same_entered_username_and_password_are_working_fine()
			throws Throwable {
		Utility.waitForPageLoaded();
		Login.ClickOnLoginrButton();
		Thread.sleep(2000);
	}

	@Then("^Remember me Feature are properly working and verified$")
	public void remember_me_feature_are_properly_working_and_verified() throws Throwable {
		Utility.waitForPageLoaded();
	}

}

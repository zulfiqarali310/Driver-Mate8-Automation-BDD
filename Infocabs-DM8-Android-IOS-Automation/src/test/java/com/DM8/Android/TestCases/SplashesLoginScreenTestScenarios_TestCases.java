package com.DM8.Android.TestCases;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

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
    public void user_should_be_on_login_screen_something_to_verify_the_change_code_functionality(String login) throws Throwable {
      
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
    public void check_to_verify_that_user_should_go_back_to_register_code_something_screen(String started) throws Throwable {
    	Utility.waitForPageLoaded();
		String Actualtext = SP.GetStartedText();
		Assert.assertEquals(Actualtext, started);
    }

    @And("^Enter any new code \"([^\"]*)\" and click on Register button$")
    public void enter_any_new_code_something_and_click_on_register_button(String newchangecode) throws Throwable {
        Utility.waitForPageLoaded();
		Login.WriteCode(newchangecode);
		Utility.waitForPageLoaded();
		Login.ClickOnRegister();
		Thread.sleep(2000);
    }
    

    @Then("^Change driver code feature are verified$")
    public void change_driver_code_feature_are_verified() throws Throwable {
    	Utility.waitForPageLoaded();
    }
    
    
    @Given("^User should be on Login screen \"([^\"]*)\" to verify the Request Password change functionality$")
    public void user_should_be_on_login_screen_something_to_verify_the_request_password_change_functionality(String login) throws Throwable {
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
    public void user_click_on_more_three_dot_button_at_right_corner_of_the_app_for_request_password_change() throws Throwable {
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
    public void change_password_request_alert_will_comes_and_verify_something_text_on_request_password_change(String details) throws Throwable {
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


}

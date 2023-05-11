package com.DM8.Android.TestCases;

import static io.restassured.RestAssured.given;

import java.time.Duration;
import java.util.List;

import org.json.JSONObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.DM8.Android.Pages.AcceptedJobPage;
import com.DM8.Android.Pages.Disclaimer;
import com.DM8.Android.Pages.FeedbackJob_Locators;
import com.DM8.Android.Pages.HomePage;
import com.DM8.Android.Pages.IncomingJobPage;
import com.DM8.Android.Pages.LoginPage;
import com.DM8.Android.Pages.POBJob_Locators;
import com.DM8.Android.Pages.STCJob_Locators;
import com.DM8.Android.Pages.WaitingJob_Locators;
import com.DM8.Common.BaseClass;
import com.DM8.Common.Utility;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.SupportsLegacyAppManagement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class BackgroundActionAndIncomingJobs_TestCases extends BaseClass {

	Utility util = new Utility();
	IncomingJobPage Injob = new IncomingJobPage(driver);
	AcceptedJobPage Acpjob = new AcceptedJobPage(driver);
	WaitingJob_Locators Waitjob = new WaitingJob_Locators(driver);
	POBJob_Locators POBjob = new POBJob_Locators(driver);
	FeedbackJob_Locators fd = new FeedbackJob_Locators(driver);
	STCJob_Locators STCjob = new STCJob_Locators(driver);
	LoginPage Login = new LoginPage(driver);
	HomePage HP = new HomePage(driver);
	Disclaimer dc = new Disclaimer(driver);
	TouchAction touch = new TouchAction((PerformsTouchActions) driver);
	JSONObject BodyData = Utility.JobCreation();

	@Given("^DM8 Application should be lucnhed and open$")
	public void dm8_application_should_be_lucnhed_and_open() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(3000);
	}

	@When("^kill DM8 application$")
	public void kill_dm8_application() throws Throwable {
		Utility.waitForPageLoaded();
		// Kill App and or Run it in Background
		// ((AndroidDriver) driver).terminateApp(prop.getProperty("App_package"));
		// closeApp();
		// ((AndroidDriver) driver).closeApp();
		((AndroidDriver) driver).runAppInBackground(Duration.ofSeconds(10));

	}

	@And("^open application from Notification$")
	public void open_application_from_notification() throws Throwable {

		Utility.waitForPageLoaded();
		((AndroidDriver) driver).openNotifications();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//android.widget.TextView[@text='Click to continue using Driver Mate']")).click();

	}

	@And("^verify that user should be on DM8 Home screen after click on Notification$")
	public void verify_that_user_should_be_on_dm8_home_screen_after_click_on_notification() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = HP.VerifyMenuButtonisPresent();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@Then("^DM8 application kill and open from Notification functionality are properly working$")
	public void dm8_application_kill_and_open_from_notification_functionality_are_properly_working() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@Given("^DM8 application should be open for Unanswered background job$")
	public void dm8_application_should_be_open_for_unanswered_background_job() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(2000);
	}

	@When("^Dispatch job from Evop when DM8 Application are in Background$")
	public void dispatch_job_from_evop_when_dm8_application_are_in_background() throws Throwable {

		Response response = given().header("Content-type", "application/json").and().body(BodyData.toString()).log()
				.all().when().post(prop.getProperty("JobCreatedAPI"));

		System.out.println("Access Token are this " + response.asString());

	}

	@And("^Kill DM8 application or move it to Background for No Answer Background Job$")
	public void kill_dm8_application_or_move_it_to_background_for_no_answer_background_job() throws Throwable {

		((AndroidDriver) driver).runAppInBackground(Duration.ofSeconds(20));
	}

	@And("^Wait untile job notification gone out$")
	public void wait_untile_job_notification_gone_out() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(4000);
	}

	@And("^check for incomming job notification has been gone off$")
	public void check_for_incomming_job_notification_has_been_gone_off() throws Throwable {
		Utility.waitForPageLoaded();
		((AndroidDriver) driver).openNotifications();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Click to continue using Driver Mate']")).click();
		
	}

	@Then("^jobs are UnAnswered when DM8 are in Background$")
	public void jobs_are_unanswered_when_dm8_are_in_background() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@Given("^DM8 application should be open for job timer check with background actions$")
	public void dm8_application_should_be_open_for_job_timer_check_with_background_actions() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@When("^Dispatch job from Evop to DM8 for timer check with background actions$")
	public void dispatch_job_from_evop_to_dm8_for_timer_check_with_background_actions() throws Throwable {
		Response response = given().header("Content-type", "application/json").and().body(BodyData.toString()).log()
				.all().when().post(prop.getProperty("JobCreatedAPI"));

		System.out.println("Access Token are this " + response.asString());
	}

	@And("^wait for 5 sec once job received$")
	public void wait_for_5_sec_once_job_received() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(5000);
	}

	@And("^then kill app or move to background for 10 sec$")
	public void then_kill_app_or_move_to_background_for_10_sec() throws Throwable {
		((AndroidDriver) driver).runAppInBackground(Duration.ofSeconds(15));
	}

	@And("^when open app then timer should be start from less than 20 sec past$")
	public void when_open_app_then_timer_should_be_start_from_less_than_20_sec_past() throws Throwable {
		Utility.waitForPageLoaded();
		String timer = Injob.GetJobtimertext();
		int i = Integer.parseInt(timer);
		if (i >= 10) {

			System.out.println(i + " is greater than 10");
		} else {

			System.out.println(i + " is less than 10");
		}

	}

	@Then("^Timer check with Background action on Incoming job are verified$")
	public void timer_check_with_background_action_on_incoming_job_are_verified() throws Throwable {
		Utility.waitForPageLoaded();
	}
	
	
	@Given("^DM8 Application should be lunched to check Job Dispatch when App are killed$")
    public void dm8_application_should_be_lunched_to_check_job_dispatch_when_app_are_killed() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(3000);
    }

    @When("^Killed DM8 App$")
    public void killed_dm8_app() throws Throwable {
   
        Utility.waitForPageLoaded();
        ((AndroidDriver) driver).terminateApp(prop.getProperty("App_package"));
    }


    @And("^Dispatch Job from Evop Api to DM8$")
    public void dispatch_job_from_evop_api_to_dm8() throws Throwable {
    	Utility.waitForPageLoaded();
    	Response response = given().header("Content-type", "application/json").and().body(BodyData.toString()).log()
				.all().when().post(prop.getProperty("JobCreatedAPI"));

		System.out.println("Access Token are this " + response.asString());
    }

    @And("^check to open job from Notification$")
    public void check_to_open_job_from_notification() throws Throwable {
    	Utility.waitForPageLoaded();
    	((AndroidDriver) driver).openNotifications();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//android.widget.TextView[@text='Click to continue using Driver Mate']")).click();
    }
    

    @Then("^Killed app and open using job Notification are verified$")
    public void killed_app_and_open_using_job_notification_are_verified() throws Throwable {
     	Utility.waitForPageLoaded();
    }
    
    
    @Given("^DM8 application should be Open for Demote functionality$")
    public void dm8_application_should_be_open_for_demote_functionality() throws Throwable {
    	Utility.waitForPageLoaded();
		Thread.sleep(2000);
    }

    @When("^Dipatch Job from evop for Demote Verification$")
    public void dipatch_job_from_evop_for_demote_verification() throws Throwable {
    	Utility.waitForPageLoaded();
    	Response response = given().header("Content-type", "application/json").and().body(BodyData.toString()).log()
				.all().when().post(prop.getProperty("JobCreatedAPI"));

		System.out.println("Access Token are this " + response.asString());
    }

 

    @And("^Reject job from DM8$")
    public void reject_job_from_dm8() throws Throwable {
    	Utility.waitForPageLoaded();
    	Thread.sleep(1000);
		Injob.ClickOnRejected();
		Thread.sleep(3000);
    }

    @And("^check for demote Alert \"([^\"]*)\" text and click OK button$")
    public void check_for_demote_alert_something_text_and_click_ok_button(String textdemote) throws Throwable {
    	Utility.waitForPageLoaded();
		Thread.sleep(1000);
		String Actualtext = Login.GetErrorMessageText();
		Assert.assertEquals(Actualtext, textdemote);
		Thread.sleep(1000);
		Login.ClickOnOKButton();
    }
    
    @Then("^Demote Functioanlity are verified $")
    public void demote_functioanlity_are_verified() throws Throwable {
    	Utility.waitForPageLoaded();
    	Thread.sleep(2000);
    }
    
    
    @Given("^DM8 app should be open and user should be on home screen for Login logout for Sin bin$")
    public void dm8_app_should_be_open_and_user_should_be_on_home_screen_for_login_logout_for_sin_bin() throws Throwable {
    	Utility.waitForPageLoaded();
		Thread.sleep(2000);
    }

    @When("^User perform complete action side menu click logout button click then user should be logout$")
    public void user_perform_complete_action_side_menu_click_logout_button_click_then_user_should_be_logout() throws Throwable {
    	Utility.waitForPageLoaded();
		HP.ClickOnMenuhbutton();
		Utility.waitForPageLoaded();
		HP.ClickOnLogoutbutton();
		Thread.sleep(2000);
		Utility.waitForPageLoaded();
		HP.ClickOnLogoutAlert1button();
		Thread.sleep(2000);
    }



    @And("^Login again for Sin bin functionality verification with \"([^\"]*)\" and paswword \"([^\"]*)\" and click on Login button$")
    public void login_again_for_sin_bin_functionality_verification_with_something_and_paswword_something_and_click_on_login_button(String uname, String pwd) throws Throwable {
    	 Utility.waitForPageLoaded();      
 		Login.ClearUsernameArea();
 		Thread.sleep(1000);
 		Login.EnterUsername(uname);	
 		Login.ClearPasswordArea();
 		Thread.sleep(1000);
 		Login.EnterPassword(pwd);
 		Thread.sleep(1000);
 		Login.ClickOnLoginrButton();
 		Utility.waitForPageLoaded();
 		 Thread.sleep(2000);
 		dc.ClickOnAccept();
 		Utility.waitForPageLoaded();
         Thread.sleep(2000);
    }
    
    @Then("^Logout and login are properly working for Sin bin$")
    public void logout_and_login_are_properly_working_for_sin_bin() throws Throwable {
    	Utility.waitForPageLoaded();
    	Thread.sleep(2000);
    }
    
    
    
    @Given("^DM8 Application should be lunched for Sin Bin verification$")
    public void dm8_application_should_be_lunched_for_sin_bin_verification() throws Throwable {
    	Utility.waitForPageLoaded();
		Thread.sleep(2000);
    }

    @When("^Dispatch 1st job$")
    public void dispatch_1st_job() throws Throwable {
     	Utility.waitForPageLoaded();
    	Response response = given().header("Content-type", "application/json").and().body(BodyData.toString()).log()
				.all().when().post(prop.getProperty("JobCreatedAPI"));

		System.out.println("Access Token are this " + response.asString());
    }



    @And("^Reject 1st Dispatched job$")
    public void reject_1st_dispatched_job() throws Throwable {
    	Utility.waitForPageLoaded();
    	Thread.sleep(1000);
		Injob.ClickOnRejected();
		Thread.sleep(3000);
    }

    @And("^Dispatch 2nd job$")
    public void dispatch_2nd_job() throws Throwable {
    	Utility.waitForPageLoaded();
    	Response response = given().header("Content-type", "application/json").and().body(BodyData.toString()).log()
				.all().when().post(prop.getProperty("JobCreatedAPI"));

		System.out.println("Access Token are this " + response.asString());
		Thread.sleep(3000);
    }

    @And("^Reject 2nd Dispatched job$")
    public void reject_2nd_dispatched_job() throws Throwable {
    	Utility.waitForPageLoaded();
		Injob.ClickOnRejected();
		Thread.sleep(2000);
    }

    @And("^Dispatch 3rd job$")
    public void dispatch_3rd_job() throws Throwable {
    	Utility.waitForPageLoaded();
    	Response response = given().header("Content-type", "application/json").and().body(BodyData.toString()).log()
				.all().when().post(prop.getProperty("JobCreatedAPI"));

		System.out.println("Access Token are this " + response.asString());
		Thread.sleep(3000);
    }

    @And("^Reject 3rd Dispatched job$")
    public void reject_3rd_dispatched_job() throws Throwable {
    	Utility.waitForPageLoaded();
		Injob.ClickOnRejected();
		Thread.sleep(2000);
    }

    @And("^you will get and verify sin bin text \"([^\"]*)\" with alert and click on Ok button$")
    public void you_will_get_and_verify_sin_bin_text_something_with_alert_and_click_on_ok_button(String sinbintxt) throws Throwable {
    	Utility.waitForPageLoaded();
		Thread.sleep(1000);
		String Actualtext = Login.GetErrorMessageText();
		Assert.assertEquals(Actualtext, sinbintxt);
		Thread.sleep(1000);
		Login.ClickOnOKButton();
    }

    @And("^you will get Logout Sin bin text \"([^\"]*)\" with alert and click on Ok button$")
    public void you_will_get_logout_sin_bin_text_something_with_alert_and_click_on_ok_button(String sinbinlogout) throws Throwable {
        Utility.waitForPageLoaded();
		Thread.sleep(1000);
		String Actualtext = Login.GetErrorMessageText();
		Assert.assertEquals(Actualtext, sinbinlogout);
		Thread.sleep(1000);
		Login.ClickOnOKButton();
    }

    @And("^now enter login details username \"([^\"]*)\" and paswword \"([^\"]*)\" and click on Login button$")
    public void now_enter_login_details_username_something_and_paswword_something_and_click_on_login_button(String uname, String pwd) throws Throwable {   
        Utility.waitForPageLoaded();      
		Login.ClearUsernameArea();
		Thread.sleep(1000);
		Login.EnterUsername(uname);	
		Login.ClearPasswordArea();
		Thread.sleep(1000);
		Login.EnterPassword(pwd);
		Thread.sleep(1000);
		Login.ClickOnLoginrButton();
    }

    @And("^again you will get login failed sin bin text \"([^\"]*)\" with alert and click on OK button$")
    public void again_you_will_get_login_failed_sin_bin_text_something_with_alert_and_click_on_ok_button(String invalidtextonlogin) throws Throwable {
        Utility.waitForPageLoaded();
		Thread.sleep(1000);		
		String Actualtext = Login.GetErrorMessageText();
		Assert.assertEquals(Actualtext, invalidtextonlogin);
		Thread.sleep(1000);
		Login.ClickOnOKButton();
		
    }

    @And("^now wait for One minute so that Sin bin time is over$")
    public void now_wait_for_one_minute_so_that_sin_bin_time_is_over() throws Throwable {
    	Utility.waitForPageLoaded();
    	Thread.sleep(90000);
    }

    @And("^again click on Login button$")
    public void again_click_on_login_button() throws Throwable {
    	 Utility.waitForPageLoaded();
        Login.ClickOnLoginrButton();
        Utility.waitForPageLoaded();
        Thread.sleep(3000);
		dc.ClickOnAccept();
		Utility.waitForPageLoaded();
        Thread.sleep(3000);
    }

    @And("^user should be able to login$")
    public void user_should_be_able_to_login() throws Throwable {
    	Utility.waitForPageLoaded();
		boolean Actualtext = HP.VerifyMenuButtonisPresent();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
    }
    
    @Then("^Sin bin functionality are verified and working properly$")
    public void sin_bin_functionality_are_verified_and_working_properly() throws Throwable {
    	Utility.waitForPageLoaded();
    }



}

package com.DM8.Android.TestCases;

import static io.restassured.RestAssured.given;

import java.time.Duration;
import java.util.List;

import org.json.JSONObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.DM8.Android.Pages.AcceptedJobPage;
import com.DM8.Android.Pages.FeedbackJob_Locators;
import com.DM8.Android.Pages.HomePage;
import com.DM8.Android.Pages.IncomingJobPage;
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
	HomePage HP = new HomePage(driver);
	TouchAction touch = new TouchAction((PerformsTouchActions) driver);

	
	@Given("^DM8 Application should be lucnhed and open$")
    public void dm8_application_should_be_lucnhed_and_open() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(3000);
    }

    @When("^kill DM8 application$")
    public void kill_dm8_application() throws Throwable {
    	Utility.waitForPageLoaded();
    	
    	
    	Thread.sleep(2000);
    	 //((AndroidDriver) driver).terminateApp(prop.getProperty("App_package"));
    	 
    	 
    	
    	 
    	 
        //Thread.sleep(2000);
        Utility.waitForPageLoaded();
		//closeApp();
		Thread.sleep(2000);
		//((AndroidDriver) driver).closeApp();
        ((AndroidDriver) driver).runAppInBackground(Duration.ofSeconds(20));
        //((AndroidDriver) driver).closeApp();
       


        
    }


    @And("^open application from Notification$")
    public void open_application_from_notification() throws Throwable {
        
        Utility.waitForPageLoaded();
        //((AndroidDriver) driver).openNotifications();
        Thread.sleep(2000);
        ((AndroidDriver) driver).activateApp("com.infocabs.DM8");
        
        /*Thread.sleep(2000);
        List<WebElement> allnotifications = driver.findElements(By.id("android:id/title"));
        System.out.println("no of notifications " + allnotifications.size());

        for (WebElement webElement : allnotifications) {
            System.out.println(webElement.getText());
            if(webElement.getText().contains("Dianne")){
               System.out.println("Notification found");
               break;
        }}*/
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


}

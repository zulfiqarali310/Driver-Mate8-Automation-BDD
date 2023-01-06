package com.DM8.Android.TestCases;

import static io.restassured.RestAssured.given;

import java.time.Clock;
import java.time.Instant;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;

import com.DM8.Android.Pages.IncomingJobPage;
import com.DM8.Common.BaseClass;
import com.DM8.Common.Utility;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class ShowOnMapRejectJob_TestCases extends BaseClass {

	IncomingJobPage Injob = new IncomingJobPage(driver);
	Utility util = new Utility();

	@Given("^Job request are given$")
	public void job_request_are_given() throws Throwable {
		Utility.waitForPageLoaded();

		JSONObject BodyData = Utility.JobCreation();
		Response response = given().header("Content-type", "application/json").and().body(BodyData.toString()).log()
				.all().when().post(prop.getProperty("JobCreatedAPI"));

		System.out.println("Access Token are this " + response.asString());
	}

	@When("^Job request are send to the server$")
	public void job_request_are_send_to_the_server() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
	}

	@Then("^new job has been created in order to reject it from driver App$")
	public void new_job_has_been_created_in_order_to_reject_it_from_driver_app() throws Throwable {
		Utility.waitForPageLoaded();
	}
	
	
	
	@Given("^Job has been received on DM8 to verify show on map$")
    public void job_has_been_received_on_dm8_to_verify_show_on_map() throws Throwable {
		Utility.waitForPageLoaded();
    }

    @When("^click on show on map button$")
    public void click_on_show_on_map_button() throws Throwable {
        Utility.waitForPageLoaded();
        Injob.ClickOnShowOnMapButton();
        Thread.sleep(1000);
        
    }

 
    @And("^check to verify map is properly displaying on Incoming job screen$")
    public void check_to_verify_map_is_properly_displaying_on_incoming_job_screen() throws Throwable {
        Utility.waitForPageLoaded();
		boolean Actualtext = Injob.CheckShowonMapbox();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
    }

    @And("^the click on Cross button to close the show on map$")
    public void the_click_on_cross_button_to_close_the_show_on_map() throws Throwable {
        Utility.waitForPageLoaded();
        Injob.ClickOnCrossBackButton();
    }
    
    @Then("^Then Show on map has been verified on incoming job screen$")
    public void then_show_on_map_has_been_verified_on_incoming_job_screen() throws Throwable {
    	Utility.waitForPageLoaded();
    	Thread.sleep(1000);
    }

	

	@Given("^Job has been received on DM8$")
	public void job_has_been_received_on_dm8() throws Throwable {
		Thread.sleep(1000);
		Utility.waitForPageLoaded();

	}

	@When("^click on Reject button$")
	public void click_on_reject_button() throws Throwable {
		Utility.waitForPageLoaded();
		Injob.ClickOnRejected();
		Thread.sleep(1000);
	}

	@Then("^job has beeen reject from the Driver$")
	public void job_has_beeen_reject_from_the_driver() throws Throwable {
		Utility.waitForPageLoaded();
	}

}

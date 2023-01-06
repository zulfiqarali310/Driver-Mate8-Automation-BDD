package com.DM8.Android.TestCases;

import java.time.Clock;
import java.time.Instant;

import org.json.JSONArray;
import org.json.JSONObject;

import com.DM8.Common.BaseClass;
import com.DM8.Common.Utility;

import static io.restassured.RestAssured.given;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class CreatingJobEvop_TestCases extends BaseClass {

	Utility util = new Utility();

	@Given("^The Valid API urls and request data are given and request are send to the server$")
	public void the_valid_api_urls_and_request_data_are_given_and_request_are_send_to_the_server()
			throws InterruptedException {
		Utility.waitForPageLoaded();

		JSONObject BodyData = Utility.JobCreation();

		Response response = given().header("Content-type", "application/json").and().body(BodyData.toString()).log()
				.all().when().post(prop.getProperty("JobCreatedAPI"));

		System.out.println("Access Token are this " + response.asString());

	}

	@Then("^new job has been created$")
	public void new_job_has_been_created() throws Throwable {
		Utility.waitForPageLoaded();

	}

}

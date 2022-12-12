package com.DM8.Android.TestCases;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.HashMap;

import org.json.JSONArray;
import org.json.JSONObject;

import com.DM8.Common.BaseClass;

import static io.restassured.RestAssured.given;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import junit.framework.Assert;

public class CreatingJobEvop_TestCases extends BaseClass {

	@Given("^The Valid API urls and request data are given and request are send to the server$")
	public void the_valid_api_urls_and_request_data_are_given_and_request_are_send_to_the_server() throws InterruptedException {
		Thread.sleep(2000);

		// Post Request Body Data
		JSONObject BodyData = new JSONObject();

		// 1st array
		JSONObject CustData = new JSONObject();
		CustData.put("custId", 526);
		CustData.put("custCallingNo", 100);
		CustData.put("companyId", 15);
		// put 1st ArrayData
		BodyData.put("Customer", CustData);

		// 2nd Array for Dispatch Drivers
		JSONObject DispatchDvr = new JSONObject();
		DispatchDvr.put("driverId", prop.getProperty("DriverID"));

		// Array for Driver IDs
		JSONArray DvrAry1 = new JSONArray();
		DvrAry1.put(DispatchDvr);
		// put 2nd ArrayData
		BodyData.put("lst_JobDispatchInfo", DvrAry1);

		// 3rd Array for FareInfo
		JSONObject FareInfoData = new JSONObject();
		FareInfoData.put("minimumPrice", 300);
		FareInfoData.put("bookingFee", 2);
		FareInfoData.put("jobPrice", 15.8);
		FareInfoData.put("totalPrice", 17.8);
		FareInfoData.put("driverCost", 15.8);
		FareInfoData.put("fareType", "Meter");
		FareInfoData.put("appliedTariffID", 99);
		FareInfoData.put("appliedTariffName", "Default BF");
		FareInfoData.put("mileage", 5.23);
		FareInfoData.put("paymentMethod", "Cash");
		// put 3rd ArrayData
		BodyData.put("EvoFareInfo", FareInfoData);

		// 4rth Array for Locations
		JSONObject LocationData = new JSONObject();

		// PickUp Address
		JSONObject PickUpAddressData = new JSONObject();
		PickUpAddressData.put("place", "BRADLEY PARK GOLF COURSEBRADLEY ROADHUDDERSFIELD");
		// PickUp Latlong Address
		JSONObject PickUpLatLong = new JSONObject();
		PickUpLatLong.put("latitude", "53.681745450474500");
		PickUpLatLong.put("longitude", "-1.760221227131600");
		// Combine both Address name and lat/long
		PickUpAddressData.put("LatLong", PickUpLatLong);

		// DropOff Address
		JSONObject DropOffAddressData = new JSONObject();
		DropOffAddressData.put("place", "12SCOUT HILL TERRACEDEWSBURY");
		// Dropoff Latlong Address
		JSONObject DropoffLatLong = new JSONObject();
		DropoffLatLong.put("latitude", "53.681725522110900");
		DropoffLatLong.put("longitude", "-1.649835636900800");
		// Combine both Address name and lat/long
		DropOffAddressData.put("LatLong", DropoffLatLong);

		// Now Add both Pick and Dropoff Data
		LocationData.put("PickupAddress", PickUpAddressData);
		LocationData.put("DestinyAddress", DropOffAddressData);

		// Put 4th Array Data
		BodyData.put("Locations", LocationData);
		//LocalDateTime time = java.time.LocalDateTime.now();
		Instant time = Clock.systemUTC().instant();
		System.out.println(time);
		BodyData.put("journeyDateTime", time);
		BodyData.put("totalMiles", "5.23");
		BodyData.put("DivisionMask", 1073741824);
		BodyData.put("isEvoFareEnabled", true);
		BodyData.put("companyId", 15);
		BodyData.put("jobType", 4);
		BodyData.put("operatorID", 1033);
		BodyData.put("isFeatureEnable", true);
		

		Response response = given().header("Content-type", "application/json").and().body(BodyData.toString()).log()
				.all().when().post(prop.getProperty("JobCreatedAPI"));

		JsonPath extractor = response.jsonPath();
		System.out.println("Access Token are this " + response.asString());

	}

	@Then("^new job has been created$")
	public void new_job_has_been_created() throws Throwable {
		

	}

}

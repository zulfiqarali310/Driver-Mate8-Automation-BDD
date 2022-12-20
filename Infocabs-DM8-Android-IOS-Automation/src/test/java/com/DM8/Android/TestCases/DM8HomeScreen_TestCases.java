package com.DM8.Android.TestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

import com.DM8.Android.Pages.HomePage;
import com.DM8.Common.BaseClass;
import com.DM8.Common.Utility;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DM8HomeScreen_TestCases extends BaseClass {
	
	Utility util = new Utility();

	private static Logger log = LogManager.getLogger(DisclaimerScreen_TestCases.class);
	HomePage HP = new HomePage(driver);
	
	@Given("^Driver is on Home screen as logged$")
    public void driver_is_on_home_screen_as_logged() throws Throwable {
		Utility.waitForPageLoaded();
    }

    @When("^check and verify Zone name text$")
    public void check_and_verify_zone_name_text() throws Throwable {
    	Utility.waitForPageLoaded();
		boolean ImageLogo = driver.findElement(By.id(prop.getProperty("ZoneNametext"))).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
    }

   

    @And("^check Queue text$")
    public void check_queue_text() throws Throwable {
    	Utility.waitForPageLoaded();
		boolean ImageLogo = driver.findElement(By.id(prop.getProperty("QueueNametext"))).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
    }

    @And("^check Refresh button icon$")
    public void check_refresh_button_icon() throws Throwable {
    	Utility.waitForPageLoaded();
		boolean ImageLogo = driver.findElement(By.id(prop.getProperty("HomesRefreshimage"))).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
    }

    @And("^check menu button$")
    public void check_menu_button() throws Throwable {
    	Utility.waitForPageLoaded();
		boolean ImageLogo = driver.findElement(By.id(prop.getProperty("Menuebutton"))).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
    }
    
    @And("^check wifi image icon$")
    public void check_wifi_image_icon() throws Throwable {
    	Utility.waitForPageLoaded();
		boolean ImageLogo = driver.findElement(By.id(prop.getProperty("Homescreenwifiimage"))).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
    }

    @And("^check gps image icon$")
    public void check_gps_image_icon() throws Throwable {
    	Utility.waitForPageLoaded();
		boolean ImageLogo = driver.findElement(By.id(prop.getProperty("Homescreengpsimage"))).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
    }

    @And("^check all \"([^\"]*)\" text$")
    public void check_all_something_text(String all) throws Throwable {
    	Utility.waitForPageLoaded();
		String Actualtext = HP.GetAlltext();
		Assert.assertEquals(Actualtext, all);
    }

    @And("^check now \"([^\"]*)\" text$")
    public void check_now_something_text(String now) throws Throwable {
    	Utility.waitForPageLoaded();
		String Actualtext = HP.GetNowtext();
		Assert.assertEquals(Actualtext, now);
    }

    @And("^check 15mins \"([^\"]*)\" text$")
    public void check_15mins_something_text(String fifteenmins) throws Throwable {
    	Utility.waitForPageLoaded();
		String Actualtext = HP.Get15minstext();
		Assert.assertEquals(Actualtext, fifteenmins);
    }

    @And("^check 30mins \"([^\"]*)\" text$")
    public void check_30mins_something_text(String thirtymins) throws Throwable {
    	Utility.waitForPageLoaded();
		String Actualtext = HP.Get30minstext();
		Assert.assertEquals(Actualtext, thirtymins);
    }

    @And("^check zonename \"([^\"]*)\" text$")
    public void check_zonename_something_text(String zonename) throws Throwable {
    	Utility.waitForPageLoaded();
		String Actualtext = HP.GetZoneNamestext();
		Assert.assertEquals(Actualtext, zonename);
    }

    @And("^check drivers \"([^\"]*)\" text$")
    public void check_drivers_something_text(String drivers) throws Throwable {
    	Utility.waitForPageLoaded();
		String Actualtext = HP.GetDriverNamestext();
		Assert.assertEquals(Actualtext, drivers);
    }

    @And("^check jobs \"([^\"]*)\" text$")
    public void check_jobs_something_text(String jobs) throws Throwable {
    	Utility.waitForPageLoaded();
		String Actualtext = HP.Getjobstext();
		Assert.assertEquals(Actualtext, jobs);
    }

    @And("^check bidjobs \"([^\"]*)\" text$")
    public void check_bidjobs_something_text(String bidjobs) throws Throwable {
    	Utility.waitForPageLoaded();
		String Actualtext = HP.GetBidjobstext();
		Assert.assertEquals(Actualtext, bidjobs);
    }

    @And("^check Hotzone job area$")
    public void check_hotzone_job_area() throws Throwable {
    	Utility.waitForPageLoaded();
		boolean ImageLogo = driver.findElement(By.id(prop.getProperty("HotzoneArea"))).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
    }

    @And("^check light onoff icon$")
    public void check_light_onoff_icon() throws Throwable {
    	Utility.waitForPageLoaded();
		boolean ImageLogo = driver.findElement(By.id(prop.getProperty("HomescreenOnOff"))).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
    }

    @And("^check youonline \"([^\"]*)\" text$")
    public void check_youonline_something_text(String youonline) throws Throwable {
    	Utility.waitForPageLoaded();
		String Actualtext = HP.Getyouaretext();
		Assert.assertEquals(Actualtext, youonline);
    }

    @And("^check avoidjobs \"([^\"]*)\" text$")
    public void check_avoidjobs_something_text(String avoidjobs) throws Throwable {
    	Utility.waitForPageLoaded();
		String Actualtext = HP.Getyouareoflinetext();
		Assert.assertEquals(Actualtext, avoidjobs);
    }

    @And("^click on go Offline button to make driver offline$")
    public void click_on_go_offline_button_to_make_driver_offline() throws Throwable {
    	Utility.waitForPageLoaded();
    	HP.ClickOnOffbutton();
    }

    @And("^check youoffline \"([^\"]*)\" text$")
    public void check_youoffline_something_text(String youoffline) throws Throwable {
    	Utility.waitForPageLoaded();
		String Actualtext = HP.Getyouaretext();
		Assert.assertEquals(Actualtext, youoffline);
    }

    @And("^check goonline \"([^\"]*)\" text$")
    public void check_goonline_something_text(String goonline) throws Throwable {
    	Utility.waitForPageLoaded();
		String Actualtext = HP.Getyouareoflinetext();
		Assert.assertEquals(Actualtext, goonline);
    }

    @And("^click on go Online button to make driver online$")
    public void click_on_go_online_button_to_make_driver_online() throws Throwable {
    	Utility.waitForPageLoaded();
    	HP.ClickOnOffbutton();
    }
    
    @Then("^DM8 Home screen all text are verified$")
    public void dm8_home_screen_all_text_are_verified() throws Throwable {
        
    }

}

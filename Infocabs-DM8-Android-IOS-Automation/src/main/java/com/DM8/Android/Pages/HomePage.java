package com.DM8.Android.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.DM8.Common.ScreenActions;
import com.DM8.Common.Utility;

import io.appium.java_client.AppiumDriver;

public class HomePage extends ScreenActions {

	AppiumDriver driver;
	Utility util = new Utility();

	public HomePage(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_zone")
	WebElement TextZone;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_queue_no")
	WebElement TextDriverQueue;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/img_update")
	WebElement Updatebutton;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/img_menu")
	WebElement Menuebutton;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/img_wifi")
	WebElement wifibutton;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/img_gps")
	WebElement gpsbutton;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_all")
	WebElement Alltext;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_now")
	WebElement Nowtext;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_15mins")
	WebElement Mins15text;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_30mins")
	WebElement Mins30text;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_zone_name")
	WebElement ZoneNametxt;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_drivers")
	WebElement Drivernametxt;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_jobs")
	WebElement jobstxt;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_bid_jobs")
	WebElement Bidjobstxt;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_bid_jobs")
	WebElement hotzone;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_you_are")
	WebElement textyouare;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_you_are_desc")
	WebElement textyouareoffline;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/switch_onl_off")
	WebElement OnOffbutton;

	public String GetZonetext() {

		return getText(TextZone);
	}

	public String GetDriverQuetext() {

		return getText(TextDriverQueue);
	}

	public void ClickOnRefreshbutton() {

		click(Updatebutton, "Click on refresh button");

	}

	public void ClickOnMenuhbutton() {

		click(Menuebutton, "Click on Menu button");

	}

	public String GetAlltext() {

		return getText(Alltext);
	}

	public String GetNowtext() {

		return getText(Nowtext);
	}

	public String Get15minstext() {

		return getText(Mins15text);
	}

	public String Get30minstext() {

		return getText(Mins30text);
	}

	public String GetZoneNamestext() {

		return getText(ZoneNametxt);
	}

	public String GetDriverNamestext() {

		return getText(Drivernametxt);
	}

	public String Getjobstext() {

		return getText(jobstxt);
	}

	public String GetBidjobstext() {

		return getText(Bidjobstxt);
	}

	public String GetHotZonetext() {

		return getText(hotzone);
	}

	public String Getyouaretext() {

		return getText(textyouare);
	}

	public String Getyouareoflinetext() {

		return getText(textyouareoffline);
	}

	public void ClickOnOffbutton() {

		click(OnOffbutton, "Click on On Off button");

	}

}

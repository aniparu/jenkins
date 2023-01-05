package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.sample.AmazonPojo;
import org.sample.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Amazon extends BaseClass{
	AmazonPojo a;
	@Given("To launch the browser and max the window")
	public void toLaunchTheBrowserAndMaxTheWindow() {
	   browerLaunch();
	   browserMax();
	}

	@When("To launch the url of the amazon applcation")
	public void toLaunchTheUrlOfTheAmazonApplcation() {
	   loadUrl("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooghydrabk1-21%26ref%3Dnav_signin%26adgrpid%3D58490306106%26hvpone%3D%26hvptwo%3D%26hvadid%3D486457318205%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D12089927005269636410%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9061892%26hvtargid%3Dkwd-298187295805%26hydadcr%3D5657_2175734%26gclid%3DCj0KCQiA7bucBhCeARIsAIOwr--a56PovNHFvFmPVc1W3I6uQCIs8YwbitEIaBNFdHYlykXhGQEbJAwaAgJgEALw_wcB&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	}

	@When("To pass the invalid emailid or phoneno in username field")
	public void toPassTheInvalidEmailidOrPhonenoInUsernameField(DataTable d) {
	    a = new AmazonPojo();
	    Map<String,String > u = d.asMap(String.class, String.class);
	    passTxt(a.getUsername(), u.get("username2"));
	}

	@When("To click the continue button")
	public void toClickTheContinueButton() {
		a = new AmazonPojo();
		btnClick(a.getContinuebtn());
	}

	@When("To pass the valid password in password field")
	public void toPassTheValidPasswordInPasswordField(DataTable dd) {
		List<Map<String, String>> i = dd.asMaps(String.class, String.class);
	   passTxt(a.getPassword(),i.get(1).get("password1"));
	}

	@When("To click the sign in button")
	public void toClickTheSignInButton() {
	   btnClick(a.getBtnSignin());
	}

	@Then("To close the browser of the amazon application")
	public void toCloseTheBrowserOfTheAmazonApplication() {
	   closeTheBrowser();
	}





}

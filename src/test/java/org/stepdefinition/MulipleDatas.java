package org.stepdefinition;

import org.sample.BaseClass;
import org.sample.LoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MulipleDatas extends BaseClass {

	LoginPojo l;
	@Given("launch the browser and max window")
	public void launchTheBrowserAndMaxWindow() {
		browerLaunch();
		browserMax();
	}

	@When("Launch the url of the given application")
	public void launchTheUrlOfTheGivenApplication() {
		loadUrl("https://www.facebook.com/");
	}

	@When("Pass the positive and negative {string} from email field")
	public void passThePositiveAndNegativeFromEmailField(String em) {
		l = new LoginPojo();
		passTxt(l.getUsername(), em);
	}

	@When("Pass the positive and negative {string} from password field")
	public void passThePositiveAndNegativeFromPasswordField(String pa) {
		l = new LoginPojo();
		passTxt(l.getPassword(), pa);
	}

	@When("Click the login button")
	public void clickTheLoginButton() {
		l = new LoginPojo();
		btnClick(l.getFindAllBtnLogin());
	}

	@Then("Close the browser in this application")
	public void closeTheBrowserInThisApplication() {
		closeTheBrowser();
	}

}

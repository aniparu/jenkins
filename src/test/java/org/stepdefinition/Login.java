package org.stepdefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sample.BaseClass;
import org.sample.LoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Login extends BaseClass{
	LoginPojo l;
	@Given("^To launch the browser and max window$")
	public void to_launch_the_browser_and_max_window() throws Throwable {
	browerLaunch();
	browserMax();
	    
	}

	@When("^To launch the url of the application$")
	public void to_launch_the_url_of_the_application() throws Throwable {
		loadUrl("https://www.facebook.com/");
	  
	}

	@When("^To pass the valid username in email field$")
	public void to_pass_the_valid_username_in_email_field(DataTable d) throws Throwable {
		 l = new LoginPojo();
		 List<String> u = d.asList();
		passTxt(l.getUsername(),u.get(2));
		Assert.assertTrue(false);
	  
	}

	@When("^To pass the invalid password in password field$")
	public void to_pass_the_invalid_password_in_password_field(DataTable d) throws Throwable {
		  l = new LoginPojo();
		  //row  cell
		  List<List<String>> y = d.asLists();
	   passTxt(l.getPassword(),y.get(1).get(0));
	}

	@When("^To click the login button$")
	public void to_click_the_login_button() throws Throwable {
		 l = new LoginPojo();
		btnClick(l.getFindAllBtnLogin());
	   
	}

	@Then("^To close the browser$")
	public void to_close_the_browser() throws Throwable {
		closeTheBrowser();
	   
	}



}

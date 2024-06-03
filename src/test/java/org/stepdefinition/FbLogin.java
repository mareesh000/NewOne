package org.stepdefinition;

import org.base.BaseClass;
import org.pojo.FbLoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbLogin extends BaseClass {
	
	FbLoginPojo f;
	@Given("To launch the edgebrowser and maximize  window")
	public void to_launch_the_edgebrowser_and_maximize_window() {
	    launchBrowser();
	    windowMaximize();
	}

	@When("To lauch the of the facebook application")
	public void to_lauch_the_of_the_facebook_application() {
		launchUrl("https://en-gb.facebook.com/");
	   
	}

	@When("To pass valid username in email field")
	public void to_pass_valid_username_in_email_field() {
		f=new FbLoginPojo();
		passText("Seleniuminmakes@gmail.com",f.getEmail());
	}

	@When("To pass invalid password in password field")
	public void to_pass_invalid_password_in_password_field() {
		f=new FbLoginPojo();
		passText("  ",f.getPassword());
	    
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		f=new FbLoginPojo();
		clickBtn(f.getLogin());
	}

	@When("To check whether navigate to the home page or not")
	public void to_check_whether_navigate_to_the_home_page_or_not() {
	   System.out.println("To check your login credentials");
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
	  closeEntireBrowser();
	}



}

package org.steptwo;

import io.cucumber.datatable.*;

import java.util.List;

import org.base.BaseClass;
import org.pojo.CreateAccPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbCreateAccount extends BaseClass {
	
	CreateAccPojo s;
	@Given("To launch the browser and maximise the window")
	public void to_launch_the_browser_and_maximise_the_window() {
	 launchBrowser();
	 windowMaximize();
	}

	@When("To launch url of fb application")
	public void to_launch_url_of_fb_application() {
	    launchUrl("https://en-gb.facebook.com/");
	}

	@When("To click the create new account button")
	public void to_click_the_create_new_account_button() {
		s=new CreateAccPojo();
		clickBtn(s.getCreateNewAcc());

	}

	@When("To pass firstname in firstname text box")
	public void to_pass_firstname_in_firstname_text_box(DataTable d) throws InterruptedException {
		Thread.sleep(5000);
		List<String>l=d.asList();
	    s=new CreateAccPojo();
	    passText(l.get(2),s.getFirstname());
	}

	@When("To pass secondname in secondname text box")
	public void to_pass_secondname_in_secondname_text_box() {
	    s=new CreateAccPojo();
	    passText("Samuel",s.getSecondname());
	}
		
	@When("To pass mobileno or email in email text box")
	public void to_pass_mobileno_or_email_in_email_text_box(DataTable d) {
	
		List<List<String>> l =d.asLists();
		s=new CreateAccPojo();
	    passText(l.get(2).get(0),s.getEmail());
	}

	@When("To create new password using new password text box")
	public void to_create_new_password_using_new_password_text_box() {
	  s=new CreateAccPojo();
	  passText("kfjskdjfklsjdfj",s.getPassword());
	}

	@Then("To close the chrome browser")
	public void to_close_the_chrome_browser() {
	//closeEntireBrowser();
	}
	

}

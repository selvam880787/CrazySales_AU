package org.stepdefinition;

import java.io.IOException;

import org.baseclasses.BaseClassCucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pojo.classes.ProjectPojo;

public class LoginStepDefinition extends BaseClassCucumber {
	@Given("User should launch chrome and load the url")
	public void user_should_launch_chrome_and_load_the_url() {
		launchChrome();
		loadUrl("https://www.crazysales.com.au/");
		winMax();
	}

	@When("User click join now and then user navigated to reistration page")
	public void user_click_join_now_and_then_user_navigated_to_reistration_page() {
		ProjectPojo p = new ProjectPojo();
		moveTo(p.getSigninhover());
		btnClick(p.getJoinNow());
		expwait("Login & Register");
	}

	@When("User should enter email id and password")
	public void user_should_enter_email_id_and_password() throws IOException {
		ProjectPojo p = new ProjectPojo();
		fill(p.getRegEmailId(), readingExcel("project", 0, 1));
		fill(p.getRegPassword(), readingExcel("project", 1, 1));
		fill(p.getRegConfirmPassword(), readingExcel("project", 2, 1));
	}

	@When("User should enter email id {string} and password {string}")
	public void user_should_enter_email_id_and_password(String s1, String s2) {
		ProjectPojo p = new ProjectPojo();
		fill(p.getRegEmailId(), s1);
		fill(p.getRegPassword(), s2);
		fill(p.getRegConfirmPassword(), s2); 
	}
	
	@Then("User should accept the terms")
	public void user_should_accept_the_terms() {
		ProjectPojo p = new ProjectPojo();
		btnClick(p.getAcceptTerms());
	}
	
	@Then("User close the browser")
	public void userCloseTheBrowser() {
	    close();
	}

	@Then("User quit the browser")
	public void userQuitTheBrowser() {
	    quit();
	}
	
}

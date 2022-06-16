package org.stepdefinition;

import org.baseclasses.BaseClassCucumber;
import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pojo.classes.UserLoginPojo;

public class UserLogin extends BaseClassCucumber {

	UserLoginPojo u = new UserLoginPojo();
	
	@Given("user should launch the browser")
	public void userShouldLaunchTheBrowser() {
		 launchChrome();
		 
	}

	@Then("user should load the url")
	public void userShouldLoadTheUrl() {
		 loadUrl("https://www.crazysales.com.au/login");
		 winMax();
		 
	}

	@Then("user enter the username and password")
	public void userEnterTheUsernameAndPassword() {
		
		fill(u.getUserName(), "Takashi");
		fill(u.getPassword(), "Taka@Crazy");
		 
	}

	@Then("user should click login button")
	public void userShouldClickLoginButton() {
		 btnClick(u.getLoginButton());
		 
	}
	
	@Then("user should get the error message")
	public void userShouldGetTheErrorMessage() {
		String expected = u.getEmailError().getText();
		Assert.assertEquals("Testcase is passed", expected, "Invalid Email Address");
	    
	}

	@Then("user should navigated to the home page")
	public void userShouldNavigatedToTheHomePage() {
	    
	}

	@Then("user enter empty username and password")
	public void userEnterEmptyUsernameAndPassword() {
		fill(u.getUserName(), " ");
		fill(u.getPassword(), "Taka@Crazy");
		 
	}

	@Then("user should click the login button")
	public void userShouldClickTheLoginButton() {
		 btnClick(u.getLoginButton());
		 
	}

	@Then("user enter empty username and empty password")
	public void userEnterEmptyUsernameAndEmptyPassword() {
		fill(u.getUserName(), " ");
		fill(u.getPassword(), " ");
		 
	}
}

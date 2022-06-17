package org.stepdefinition;

import org.baseclasses.BaseClassCucumber;
import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pojo.classes.UserLoginPojo;

public class UserLogin extends BaseClassCucumber {

	
	
	@Given("user should launch the browser")
	public void userShouldLaunchTheBrowser() {
		 launchChrome();
		 
	}

	@Then("user should load the url")
	public void userShouldLoadTheUrl() {
		 loadUrl("https://www.crazysales.com.au/login");
		 winMax();
		 
	}

		
	@Then("user should click login button")
	public void userShouldClickLoginButton() {
		UserLoginPojo u = new UserLoginPojo();
		 btnClick(u.getLoginButton());
		 
	}
	
	@Then("user should get the error message")
	public void userShouldGetTheErrorMessage() {
		UserLoginPojo u = new UserLoginPojo();
		String expected = u.getEmailError().getText();
		Assert.assertEquals("Testcase is passed", expected, "Invalid Email Address");
	    
	}

	@Then("user should navigated to the home page")
	public void userShouldNavigatedToTheHomePage() {
	    
	}

	@Then("user enter empty username and password")
	public void userEnterEmptyUsernameAndPassword() {
		UserLoginPojo u = new UserLoginPojo();
		fill(u.getUserName(), " ");
		fill(u.getPassword(), "Taka@Crazy");
		 
	}

	@Then("user should click the login button")
	public void userShouldClickTheLoginButton() {
		UserLoginPojo u = new UserLoginPojo();
		 btnClick(u.getLoginButton());
		 
	}

	@Then("user enter empty username and empty password")
	public void userEnterEmptyUsernameAndEmptyPassword() {
		UserLoginPojo u = new UserLoginPojo();
		fill(u.getUserName(), " ");
		fill(u.getPassword(), " ");
		 
	}
	
	@Then("user enter username and password")
	public void userEnterUsernameAndPassword() {
		UserLoginPojo u = new UserLoginPojo();
		fill(u.getUserName(), "12345");
		fill(u.getPassword(), "67890");
	}
	
	@Then("user close the browser")
	public void userCloseTheBrowser() {
	    close();
	}
	
}

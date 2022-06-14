package org.baseclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhpTravelsPojo extends BaseClassCucumber {
	public PhpTravelsPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div/button[@id='cookie_stop']")
	private WebElement cookiesAccept;

	@FindBy(xpath="//a[@data-style='zoom-in']")
	private WebElement signUp;

	@FindBy(xpath="//input[@name='first_name']")
	private WebElement firstName;

	@FindBy(xpath="//input[@name='last_name']")
	private WebElement lastName;

	@FindBy(xpath="//input[@name='phone']")
	private WebElement phoneNumber;

	@FindBy(xpath="//input[@name='email']")
	private WebElement email;

	@FindBy(xpath="//input[@name='password']")
	private WebElement password;

	//@FindBy(xpath="//button[@type='submit']")
	@FindBy(xpath="//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[7]/button/span[1]")
	private WebElement signUpEnter;

	public WebElement getSignUp() {
		return signUp;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignUpEnter() {
		return signUpEnter;
	}

	public WebElement getCookiesAccWebElement() {
		return cookiesAccept;
	}


	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[1]")
	private WebElement signUpStatus;

	public WebElement getCookiesAccept() {
		return cookiesAccept;
	}

	public WebElement getSignUpStatus() {
		return signUpStatus;
	}

}

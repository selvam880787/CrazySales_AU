package pojo.classes;

import org.baseclasses.BaseClassCucumber;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectPojo extends BaseClassCucumber {
	// loadUrl("https://www.crazysales.com.au/");
	public ProjectPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[text()='Sign In'])[1]")
	private WebElement signinhover;
	
	@FindBy(xpath="//a[text()='Join Free']")
	private WebElement joinNow;
	
	@FindBy(xpath="//input[@id='reg-email']")
	private WebElement regEmailId;
	
	@FindBy(xpath="//input[@id='reg-password']")
	private WebElement regPassword;
	
	@FindBy(xpath="//input[@id='reg-confirmpassword']")
	private WebElement regConfirmPassword;
	
	@FindBy(xpath="//input[@id='reg-terms']")
	private WebElement acceptTerms;
	
	@FindBy(xpath="//input[@id='reg-button']")
	private WebElement createNewAccount;
	
	@FindBy(xpath="(//a[text()='Sign In'])[2]")
	private WebElement signIn;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement emailId;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="(//a[@class='lightred'])[1]")
	private WebElement forgotPassword;
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement login;
	
	@FindBy(xpath="//div[@id='sign']")
	private WebElement newCustomer;
	
	@FindBy(xpath="//input[@id='key']")
	private WebElement searchTextbox;
	
	@FindBy(xpath="//input[@id='search_btn']")
	private WebElement searchEnter;
	
	@FindBy(xpath="//img[@class='hani']")
	private WebElement homePageButton;

	public WebElement getSigninhover() {
		return signinhover;
	}

	public WebElement getJoinNow() {
		return joinNow;
	}

	public WebElement getRegEmailId() {
		return regEmailId;
	}

	public WebElement getRegPassword() {
		return regPassword;
	}

	public WebElement getRegConfirmPassword() {
		return regConfirmPassword;
	}

	public WebElement getAcceptTerms() {
		return acceptTerms;
	}

	public WebElement getCreateNewAccount() {
		return createNewAccount;
	}

	public WebElement getSignIn() {
		return signIn;
	}

	public WebElement getEmailId() {
		return emailId;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getForgotPassword() {
		return forgotPassword;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getNewCustomer() {
		return newCustomer;
	}

	public WebElement getSearchTextbox() {
		return searchTextbox;
	}

	public WebElement getSearchEnter() {
		return searchEnter;
	}

	public WebElement getHomePageButton() {
		return homePageButton;
	}
	
	
	
	

}

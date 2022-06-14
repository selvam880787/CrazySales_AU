package pojo.classes;

import org.baseclasses.BaseClassCucumber;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPojo extends BaseClassCucumber {
	public FacebookPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id=\"email\"]")
	private WebElement user;

	@FindBy(xpath="//input[@id=\"pass\"]")
	private WebElement pass;

	@FindBy(xpath="//button[@name='login']")
	private WebElement login;

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}
	
}

package pojo.classes;

import org.baseclasses.BaseClassCucumber;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserLoginPojo extends BaseClassCucumber {
	public UserLoginPojo() {
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//input[@id='email']")
private WebElement userName;

@FindBy(xpath="//input[@id='password']")
private WebElement password;

@FindBy(xpath="//input[@id='login-button']")
private WebElement loginButton;

public WebElement getLoginButton() {
	return loginButton;
}

public WebElement getUserName() {
	return userName;
}

public WebElement getPassword() {
	return password;
}


}

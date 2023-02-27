package org_adactinpom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org_Mavenprojects.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement UserName;
	@FindBy(id = "password")
	private WebElement Password;
	@FindBy(id = "login")
	private WebElement LoginButton;

	public WebElement getUserName() {
		return UserName;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

	public void LoginPageOneData() {
		sendtext(getUserName(), "aravind333");
		sendtext(getPassword(), "aravind333");
		click(getLoginButton());

	}

}

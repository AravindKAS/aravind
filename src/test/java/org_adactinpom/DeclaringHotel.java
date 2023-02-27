package org_adactinpom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org_Mavenprojects.BaseClass;

public class DeclaringHotel extends BaseClass {
	public DeclaringHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	private WebElement radiobutton_0;

	@FindBy(xpath = "submit")
	private WebElement submit;

}
package org_adactinpom;

import org_Mavenprojects.BaseClass;

public class AdactinPom extends BaseClass {
	public static void main(String[] args) {
	driverLaunch("https://adactinhotelapp.com/");
		implicitwait(30);
		LoginPage one = new LoginPage();
		one.LoginPageOneData();
		SelectingPage two = new SelectingPage();
		two.LoginPageTwo2();
		
		
		
	}

}

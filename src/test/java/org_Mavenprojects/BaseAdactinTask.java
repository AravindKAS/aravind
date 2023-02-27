package org_Mavenprojects;

import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseAdactinTask extends BaseClass {
	public static void main(String[] args) throws IOException {

		BaseClass base = new BaseClass();
		base.driverLaunch("https://adactinhotelapp.com/");
		base.implicitwait(30);

		WebElement findelementById = base.findelementById("username");
		String getxldetails = base.getxldetails("adactin", 1, 0);
		base.sendtext(findelementById, getxldetails);

		WebElement findelementById2 = base.findelementById("password");
		String getxldetails2 = base.getxldetails("adactin", 1, 1);
		base.sendtextmethod(findelementById2, getxldetails2);

		WebElement findelementById3 = base.findelementById("login");
		base.click(findelementById3);

		WebElement findelementById4 = base.findelementById("location");
		String getxldetails3 = base.getxldetails("adactin", 1, 2);
		base.sendtext(findelementById4, getxldetails3);

		WebElement findelementById5 = base.findelementById("hotels");
		String getxldetails4 = base.getxldetails("adactin", 1, 3);
		base.sendtext(findelementById5, getxldetails4);

		WebElement findelementById6 = base.findelementById("room_type");
		String getxldetails5 = base.getxldetails("adactin", 1, 4);
		base.sendtext(findelementById6, getxldetails5);

		WebElement findelementById7 = base.findelementById("room_nos");
		String getxldetails6 = base.getxldetails("adactin", 1, 5);
		base.sendtext(findelementById7, getxldetails6);

		WebElement findelementById8 = base.findelementById("datepick_in");
		String getxldetails7 = base.getxldetails("adactin", 1, 6);
		base.sendtext(findelementById8, getxldetails7);

		WebElement findelementById9 = base.findelementById("datepick_out");
		String getxldetails8 = base.getxldetails("adactin", 1, 7);
		base.sendtext(findelementById9, getxldetails8);

		WebElement findelementById10 = base.findelementById("adult_room");
		String getxldetails9 = base.getxldetails("adactin", 1, 8);
		base.sendtext(findelementById10, getxldetails9);

		WebElement findelementById11 = base.findelementById("child_room ");
		String getxldetails10 = base.getxldetails("adactin", 1, 9);
		base.sendtext(findelementById11, getxldetails10);

		WebElement findelementById12 = base.findelementById("Submit");
		base.click(findelementById12);

		WebElement findelementById13 = base.findelementById("radiobutton_0");
		base.click(findelementById13);

		WebElement findelementById14 = base.findelementById("continue");
		base.click(findelementById14);

		WebElement findelementById15 = base.findelementById("first_name");
		String getxldetails11 = base.getxldetails("adactin", 1, 10);
		base.sendtext(findelementById15, getxldetails11);

		WebElement findelementById16 = base.findelementById("last_name ");
		String getxldetails12 = base.getxldetails("adactin", 1, 11);
		base.sendtext(findelementById16, getxldetails12);

		WebElement findelementById17 = base.findelementById("address");
		String getxldetails13 = base.getxldetails("adactin", 10, 12);
		base.sendtext(findelementById17, getxldetails13);

		WebElement findelementById18 = base.findelementById("cc_num");
		String getxldetails14 = base.getxldetails("adactin", 1, 13);
		base.sendtext(findelementById18, getxldetails14);

		WebElement findelementById19 = base.findelementById("cc_type");
		String getxldetails15 = base.getxldetails("adactin", 1, 14);
		base.sendtext(findelementById19, getxldetails15);

		WebElement findelementById20 = base.findelementById("cc_exp_month");
		String getxldetails16 = base.getxldetails("adactin", 1, 15);
		base.sendtext(findelementById20, getxldetails16);

		WebElement findelementById21 = base.findelementById("cc_exp_year");
		String getxldetails17 = base.getxldetails("adactin", 1, 16);
		base.sendtext(findelementById21, getxldetails17);

		WebElement findelementById22 = base.findelementById("cc_cvv");
		String getxldetails18 = base.getxldetails("adactin", 1, 17);
		base.sendtext(findelementById22, getxldetails18);

		WebElement findelementById23 = base.findelementById("book_now");
		base.click(findelementById23);

		WebElement findelementById24 = base.findelementById("order no");
		WebElement gettext = base.gettext(findelementById24, "value");
		System.out.println(gettext);

	}
}

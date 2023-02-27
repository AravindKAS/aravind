package org_Mavenprojects;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	private static final String OutputTyp = null;
	public static WebDriver driver;

	public static void driverLaunch(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

	}

	public static void implicitwait(long time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

	}

	public WebElement findelementById(String elemnetId) {
		WebElement element = driver.findElement(By.id(elemnetId));
		return element;
	}

	public void sendtext(WebElement element, String text) {
		element.sendKeys(text);
	}

	public WebElement fidelementbyid(String elementid) {
		WebElement element = driver.findElement(By.id(elementid));
		return element;
	}

	public WebElement findelementbyxpath(String elementid) {
		WebElement element = driver.findElement(By.xpath(elementid));
		return element;
	}

	public void sendtextmethod(WebElement element, String value) {
		element.sendKeys(value);

	}

	public void click(WebElement element) {
		element.click();
	}

	public WebElement findelementidA(String idA) {

		return driver.findElement(By.id(idA));
	}

	public void Xpath(String path) {
		File file = new File(path);
	}

	public String getxldetails(String sheetname, int getrownum, int getcellnum) throws IOException {
		File file = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Aravind\\Maven\\Database\\Newsheet.xlsx");
		FileInputStream input = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(input);
		Sheet sheet = book.getSheet(sheetname);
		Row row = sheet.getRow(getrownum);
		Cell cell = row.getCell(getcellnum);
		String stringCellValue = cell.getStringCellValue();
		return stringCellValue;
	}

	public String getxldetailsnew(String sheetname, int getrownum, int getcellnum) throws IOException {
		File file = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Aravind\\Maven\\Database\\Newsheet.xlsx");
		FileInputStream input = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(input);
		Sheet sheet = book.getSheet(sheetname);
		Row row = sheet.getRow(getrownum);
		Cell cell = row.getCell(getcellnum);
		double numericCellValue = cell.getNumericCellValue();
		String string = Double.toString(numericCellValue);
		return string;

	}

	public WebElement gettext(WebElement element, String value) {

		String attribute = element.getAttribute(value);
		return element;
	}

	public void browserclose() {
		driver.quit();

	}

	public void output(WebElement element) {

		System.out.println(element);
	}

//	public void snapshot() throws IOException {
//		TakesScreenshot ss = (TakesScreenshot) driver;
//		File screenshotAs = se.FILE);s.getScreenshotAs(OutputTyp
//		File destination = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Aravind\\Maven\\Database\\Beforelogin.PNG");
//		FileUtils.copyFile(screenshotAs, destination);

	}



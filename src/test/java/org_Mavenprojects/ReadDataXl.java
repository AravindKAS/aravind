package org_Mavenprojects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadDataXl {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Aravind\\Maven\\Database\\adactinwelcome.xlsx");
		FileInputStream input = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(input);
		Sheet sheet = book.getSheet("adactinwelcome");
		Row row = sheet.getRow(1);
		Cell cell =row.getCell(0);
		String name = cell.getStringCellValue();
		System.out.println(name);
		Cell cell2 = row.getCell(1);
		String pass = cell2.getStringCellValue();

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys(name);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(pass);
		WebElement login = driver.findElement(By.id("login"));
		login.click();

		WebElement welcometxt = driver.findElement(By.xpath("//*[@class='welcome_menu']"));
		String confirm = welcometxt.getText();
		System.out.println(confirm);
		Cell createCell = row.createCell(2);
		createCell.setCellValue(confirm);
		FileOutputStream output = new FileOutputStream(file);
		book.write(output);

	}
}

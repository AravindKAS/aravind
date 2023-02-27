package org_Mavenprojects;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

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

public class IphoneXl {
	public static void main(String[] args) throws IOException  {
		File file = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Aravind\\Maven\\Database\\iphone.xlsx");
		Workbook book = new XSSFWorkbook();
		Sheet createSheet = book.createSheet("Iphone");

		// driver launch
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement findElement = driver.findElement(By.id("twotabsearchtextbox"));
		findElement.sendKeys("iphone");
		WebElement loginbtn = driver.findElement(By.id("nav-search-submit-button"));
		loginbtn.click();
		List<WebElement> number = driver.findElements(By.xpath("//*[@class='a-size-medium a-color-base a-text-normal']"));
        int size = number.size();
		System.out.println(size);

		for (int i = 0; i < number.size(); i++) {
			WebElement text = number.get(i);
			String text2 = text.getText();
			System.out.println(text2);
			Row createRow = createSheet.createRow(i);
			Cell createCell = createRow.createCell(0);
			createCell.setCellValue(text2);
			FileOutputStream output = new FileOutputStream(file);
			book.write(output);

		}

	}
}
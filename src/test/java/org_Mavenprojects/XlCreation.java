package org_Mavenprojects;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
// to create a excel 
public class XlCreation {
public static void main(String[] args) throws IOException {
	File file =new File("C:\\Users\\ELCOT\\eclipse-workspace\\Aravind\\Maven\\Database\\Newsheet.xlsx");
	//to create a workbook  
	Workbook book = new XSSFWorkbook();
	// to create a sheet 
	Sheet createSheet = book.createSheet("aravind");
	//to create a row
	Row createRow = createSheet.createRow(0);
	// to create a cell
	Cell createCell = createRow.createCell(0);
	//to set the value 
	createCell.setCellValue("aravind");
	FileOutputStream out = new FileOutputStream(file);
	book.write(out);
	
}
}

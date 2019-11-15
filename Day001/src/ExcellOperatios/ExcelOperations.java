package ExcellOperatios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperations {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("E:\\excel\\ExcelOperation.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		Row row=sheet.getRow(0);
		
		Cell cell=row.getCell(0);

	String	data=cell.getStringCellValue();
	System.out.println(data);
		Row row1=sheet.createRow(1);
		Cell cell1=row1.createCell(1);
		cell1.setCellValue("Aditya");
		FileOutputStream file1=new FileOutputStream("E:\\excel\\ExcelOperation.xlsx");
		workbook.write(file1);
	}

}
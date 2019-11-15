package ExcellOperatios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MultipleData {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream("E:\\excel\\ExcelOperation.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int countofrow=sheet.getLastRowNum();
		for(int i=0;i<=countofrow;i++)
		{
		 Row  row=sheet.getRow(i);
	        int cellcount=row.getLastCellNum();
	        for(int k=0;k<cellcount;k++)
	        {
	        	Cell cell=row.getCell(k);
	      String  	data=cell.getStringCellValue();
	      System.out.print(data+" ");
	        }
	        System.out.println();
		}
		
		
		
		

		
	}

}

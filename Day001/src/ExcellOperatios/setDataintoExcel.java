package ExcellOperatios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class setDataintoExcel {

	public static void main(String[] args) throws IOException {
		
FileInputStream file=new FileInputStream("E:\\excel\\ExcelOperation.xlsx");

         XSSFWorkbook workbook=new XSSFWorkbook(file);
         XSSFSheet sheet=workbook.getSheet("Sheet2");
       for(int i=0;i<3;i++)
        {
       Row 	row=sheet.createRow(i);
      Cell cell=row.createCell(0);
        }
      FileOutputStream file1=new FileOutputStream("E:\\excel\\ExcelOperation.xlsx");
       workbook.write(file1);
        }
        }



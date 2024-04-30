package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {

	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet sh;
	
	public static String getStringData(int a , int b) throws IOException {
		f=new FileInputStream("G:\\Obsqura\\eclipse\\Encapsulation\\src\\main\\resources\\Book1.xlsx");
		w=new XSSFWorkbook(f);
		sh=w.getSheet("Sheet1");
		Row r=sh.getRow(a);//parameter a is the row
		Cell c=r.getCell(b);//parameter b is the cell
		return c.getStringCellValue();//return String value from cell in the row
	}
	
	public static String getIntegerData(int a , int b) throws IOException {
		f=new FileInputStream("G:\\Obsqura\\eclipse\\Encapsulation\\src\\main\\resources\\Book1.xlsx");
		w=new XSSFWorkbook(f);//open workbook
		sh=w.getSheet("Sheet1");//open sheet inside workbook
		Row r=sh.getRow(a);//parameter a is the row
		Cell c=r.getCell(b);//access cell
		int x=(int) c.getNumericCellValue();
		return String.valueOf(x);//return type is String, so convert into into String
	}
}

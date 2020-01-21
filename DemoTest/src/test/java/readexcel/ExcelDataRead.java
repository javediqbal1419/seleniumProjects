package readexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataRead {

	private static XSSFWorkbook ExcelWBook;
	private static XSSFSheet ExcelWSheet;
	private static XSSFCell Cell;
	private static XSSFRow Row;
	private static XSSFSheet Sheet;
	
	public static void readExcelData(String filePath, String fileName, String SheetName) throws Exception {
		
		try {
			File file = new File(Constants.Path_TestData, Constants.File_TestData);
			FileInputStream inputStream = new FileInputStream(file);
			ExcelWBook = new XSSFWorkbook(inputStream);
			Sheet dataSheet = ExcelWBook.getSheet(SheetName);
			int rowCount = dataSheet.getLastRowNum()-dataSheet.getFirstRowNum();
			for (int i = 0; i<rowCount+1; i++) {
				org.apache.poi.ss.usermodel.Row row = dataSheet.getRow(i);
				for(int j = 0; j < row.getLastCellNum(); j++) {
					
					System.out.print(row.getCell(j).getStringCellValue()+"||");
				}
				System.out.println();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

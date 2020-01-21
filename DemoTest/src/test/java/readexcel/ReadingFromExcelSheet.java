package readexcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

public class ReadingFromExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream ip = new FileInputStream("E:\\project\\seleniumProjects\\DemoTest\\testData\\TestData.xlsx");
		Workbook wb = WorkbookFactory.create(ip);
		Sheet sheet = wb.getSheet("Sheet2");
		int i, j;
		int rowcount = 10, cellcount = 2;
		for (i = 0; i <= rowcount; i++) {
			Row row = sheet.getRow(i);
			for (j = 0; j < cellcount; j++) {
				Cell cell = row.getCell(j);
				String cellval = cell.getStringCellValue();
				System.out.print(cellval + "\t\t");
			}
			System.out.println();
		}

		ip.close();
	}

}
package genric_script;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDriven {
	
	
	public static String getData(String sheet,int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fs=new FileInputStream("./EXCEL/excel.xlsx");
		Workbook book=WorkbookFactory.create(fs);
		Sheet sh = book.getSheet(sheet);
		Row r = sh.getRow(row);
		Cell cel = r.getCell(cell);
		String value = cel.getStringCellValue();
		return value;	
	}
}

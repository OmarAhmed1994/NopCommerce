package utils;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtils {
	public static Object[][] getData(String filePath, String sheetName) {
		Object[][] data = null;
		try {
			FileInputStream fis = new FileInputStream(filePath);
			Workbook workbook = new XSSFWorkbook(fis);
			Sheet sheet = workbook.getSheet(sheetName);

			int rowCount = sheet.getPhysicalNumberOfRows();
			int colCount = sheet.getRow(0).getPhysicalNumberOfCells();

			data = new Object[rowCount - 1][colCount];
			DataFormatter formatter = new DataFormatter();

			for (int i = 1; i < rowCount; i++) {
				Row row = sheet.getRow(i);
				for (int j = 0; j < colCount; j++) {
					data[i - 1][j] = formatter.formatCellValue(row.getCell(j));
				}
			}

			workbook.close();
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}
}

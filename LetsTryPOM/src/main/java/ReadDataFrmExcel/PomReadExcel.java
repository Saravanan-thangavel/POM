package ReadDataFrmExcel;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PomReadExcel {

	public static String[][] getPOmExcel(String fileName) {
		//String FileLocation = "./excel-data/Login.xlsx";
		XSSFWorkbook book = null;
		try {
			book = new XSSFWorkbook("./excel-data/"+fileName+".xlsx");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFSheet sheet = book.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		System.out.println(lastRowNum);
		//include header count
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println(physicalNumberOfRows);
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		System.out.println(lastCellNum);
		String[][] data = new String[lastRowNum][lastCellNum];
		for (int i = 1; i <=lastRowNum; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);
				//format all the data to string 
				DataFormatter d = new DataFormatter();
				String defaultFormat = d.formatCellValue(cell);
				data[i-1][j]=defaultFormat;
				/*
				 * String value = cell.getStringCellValue(); System.out.println(value);
				 */
			}
		}
		try {
			book.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;

	}

}

package Utils;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import ReadDataFrmExcel.ReadExcel;

public class DataProvide {

	@DataProvider
	public String[][] getData() {
		String[][] excel = ReadExcel.getExcel();
		return excel;
	}

}

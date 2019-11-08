package com.crm.qa.util;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openxml4j.exceptions.InvalidFormatException;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase {

	public static long PageLoadTime = 30;
	public static long ImplicitWait = 10;

	public static String TEST_DATA_SHEET = System.getProperty("user.dir")
			+ "\\src\\test\\resources\\testdatasheet\\DataSheet.xlsx";

	public static Workbook book;
	public static Sheet sheet;

	public static Object[][] getTestData(String sheetName) {
		FileInputStream file = null;
		try {
			file = new FileInputStream(TEST_DATA_SHEET);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			book = new WorkbookFactory().create(file);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (org.apache.poi.openxml4j.exceptions.InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		sheet = (Sheet) book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); i++) {
				
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
			}

		}
		return data;
	}

}

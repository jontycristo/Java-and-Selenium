package cms.util;

import java.io.File;
import java.io.FileInputStream;

import cms.pages.Wrapper_Methods;

public class DataInputProvider extends Wrapper_Methods {

	public static String[][] getSheet(String FileName,String SheetName ) {

		String[][] data = null;

		try {
			System.out.println("Entry into data provider method");
			FileInputStream fis = new FileInputStream(new File("./Data/"+FileName+".xls"));
			HSSFWorkbook workbook = new HSSFWorkbook(fis);
			
			HSSFSheet sheet = workbook.getSheet(SheetName);	
			System.out.println("number of rows");
			// get the number of rows
			int rowCount = sheet.getLastRowNum();
			System.out.println("number of columns");
			// get the number of columns
			int columnCount = sheet.getRow(0).getLastCellNum();
			
			data = new String[rowCount][columnCount];


			// loop through the rows
			for(int i=1; i <rowCount+1; i++){
				try {
					HSSFRow row = sheet.getRow(i);
					for(int j=0; j <columnCount; j++){ // loop through the columns
						try {
							String cellValue = "";
							try{
								cellValue = row.getCell(j).getStringCellValue();
							}catch(NullPointerException e){

							}

							data[i-1][j]  = cellValue; // add to the data array
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}				
					}

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			workbook.close();
			fis.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return data;

	}

}

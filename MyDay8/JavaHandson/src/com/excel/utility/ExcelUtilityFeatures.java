package com.excel.utility;

public class ExcelUtilityFeatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Xls_Reader reader =  new Xls_Reader(System.getProperty("user.dir")+"\\src\\com\\testdata\\TestData.xlsx");
		
		if(!reader.isSheetExist("HomePage")){
				reader.addSheet("HomePage");
		}
		
		int count = reader.getColumnCount("RegDataTest");
		System.out.println("Column Count: "+count);
		
		
		int n = reader.getCellRowNum("RegDataTest", "firstname", "John");
		System.out.println("rownum count: "+n); 
	}

}

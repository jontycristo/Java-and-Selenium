package com.test.utlity;

import java.util.ArrayList;

import com.excelutility.Xls_Reader;

public class testUtil {
	
	public static Xls_Reader reader;
	
	public static ArrayList<Object[]> getExcelData(){
		
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		
		try{
			reader = new Xls_Reader(System.getProperty("user.dir")+"\\src\\com\\excelsheet\\TestData.xlsx");
		} catch(Exception e){
			e.printStackTrace();
		}
		
		for(int rowNum = 2; rowNum <= reader.getRowCount("RegTestData");rowNum++){
			
			String username = reader.getCellData("RegTestData", "username", rowNum);
			String password = reader.getCellData("RegTestData", "password", rowNum);
			
			Object ob[] = {username,password};
			myData.add(ob);
		}
		
		return myData;
		
	}

}

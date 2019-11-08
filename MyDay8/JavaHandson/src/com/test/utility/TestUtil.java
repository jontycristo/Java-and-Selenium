package com.test.utility;

import java.util.ArrayList;

import com.excel.utility.Xls_Reader;

public class TestUtil {
	
	public static Xls_Reader reader;
	
	public static ArrayList<Object[]> getDataFromExcel(){
		
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		
		try{
			reader = new Xls_Reader(System.getProperty("user.dir")+"\\src\\com\\testdata\\TestData.xlsx");
		} catch(Exception e){
			
			e.printStackTrace();
			
		}
		
		for(int rowNum=2; rowNum <= reader.getRowCount("RegDataTest"); rowNum++){
			
			String firstName = reader.getCellData("RegDataTest", "firstname", rowNum);
			String lastName = reader.getCellData("RegDataTest", "lastname", rowNum);
			String emailaddress = reader.getCellData("RegDataTest", "emailaddress", rowNum);
			String password = reader.getCellData("RegDataTest", "password", rowNum);
			
			Object ob[] = {firstName, lastName, emailaddress, password};
			myData.add(ob);
			
		}
		return myData;
		
	}
	
}

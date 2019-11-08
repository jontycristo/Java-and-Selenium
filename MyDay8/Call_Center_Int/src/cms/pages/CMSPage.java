package cms.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class CMSPage extends BasePage {

	public String Login(String userIdloc, String UserIdval, String pwdloc, String pwdval, String submitloc,
			String submitval) {
		try {

			enterTextByXpathBase(userIdloc, UserIdval);
			Thread.sleep(1000);
			enterTextByXpathBase(pwdloc, pwdval);
			Thread.sleep(1000);
			System.out.println("before login button");
			clickButtonByXpath(submitloc, submitval);
			System.out.println("After login button");
			ATUReports.add("Login Successful" , LogAs.PASSED,  new CaptureScreen(ScreenshotOf.DESKTOP));
		} catch (Exception e) {
			logger.debug("login invoked Failed in Exception",e);
			System.out.println("Ex : - " + e.getMessage());
			ATUReports.add("Login failure", LogAs.FAILED, new CaptureScreen(ScreenshotOf.DESKTOP));
		}

		return UserIdval;
	}

	public static String executionRequired(String methodname) {
		String value = "";
		try {

			value = getDataFromExcel(methodname);

		} catch (Exception e) {
			// CommonLogger.errorLog(e);
		}

		return value;
	}

	public static String getDataFromExcel(String methodname) throws IOException {

		String Path = System.getProperty("user.dir");
		// String filename= "D:\\Lognath\\CMS_Automation_II\\ExecutionList.xls";
		String filename = Path + "\\ExecutionList.xls";
		String value = "";
		FileInputStream fis = null;

		String[][] data = null;

		try {
			fis = new FileInputStream(new File(filename));
			HSSFWorkbook workbook = new HSSFWorkbook(fis);

			HSSFSheet sheet = workbook.getSheet("ModulesList");

			// get the number of rows
			int rowCount = sheet.getLastRowNum();
			// System.out.println("row:"+rowCount);
			// get the number of columns
			int columnCount = sheet.getRow(0).getLastCellNum();
			data = new String[rowCount][columnCount];

			// loop through the rows
			for (int i = 1; i < rowCount + 1; i++) {
				try {
					HSSFRow row = sheet.getRow(i);
					for (int j = 0; j < columnCount; j++) { // loop through the
															// columns
						try {
							String cellValue = "";
							try {
								cellValue = row.getCell(j).getStringCellValue();

								if (cellValue.equals(methodname)) {
									// System.out.println("cell:"+cellValue);
									// System.out.println(row.getCell(j+1).getStringCellValue());
									value = row.getCell(j + 2).getStringCellValue();
								}
							} catch (NullPointerException e) {

							}

							data[i - 1][j] = cellValue; // add to the data array
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

		return value;
	}

}

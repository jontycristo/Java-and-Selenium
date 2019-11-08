package cms.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class ReportUtil {
	public static void reports() {

		try {

			// String time = FileUtil.getDateTime("dd-MM-YYYY");
			String time = FileUtil.getDateTime("dd-MM-YYYY");
			FileInputStream in = new FileInputStream("./src/atu.properties");
			Properties props = new Properties();
			props.load(in);
			in.close();
			OutputStream out = new FileOutputStream("./src/atu.properties");
			props.setProperty("atu.reports.dir", "ATU_Reports\\" + time);
			props.setProperty("atu.OtherReports.dir", "ATU_Reports\\" + time + "\\Logs\\");
			props.setProperty("Parameter.XMLOutput", "ATU_Reports\\" + time + "\\Logs\\");
			props.setProperty("Parameter.ISOOutput", "ATU_Reports\\" + time + "\\Logs\\");
			props.store(out, null);
			out.close();

			// FileUtil.createFolder("ATU_Reports\\" + time+ "\\Logs");
			// ResourceBundleUtil.ATU_RESOURCE_FILE.put("atu.reports.dir",
			// "ATU_Reports\\" + time);
			// .ATU_RESOURCE_FILE.put("Parameter.XMLOutput", "ATU_Reports\\" +
			// time+ "\\Logs\\");
			// ResourceBundleUtil.ATU_RESOURCE_FILE.put("Parameter.ISOOutput",
			// "ATU_Reports\\" + time+ "\\Logs\\");

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

		System.setProperty("atu.reporter.config", "./src/atu.properties");
	}
}

package cms.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FileUtil {

	public static String getDateTime(String format) {

		String time = "";
		try {
			Date now = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat(format);
			time = dateFormat.format(now);
		} catch (Exception e) {

			e.printStackTrace();
		}

		return time;
	}
}

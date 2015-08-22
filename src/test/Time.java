package test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {

	public static String getTime() {
		SimpleDateFormat dateFormat = new SimpleDateFormat(
				"yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		return dateFormat.format(date);
	}
}

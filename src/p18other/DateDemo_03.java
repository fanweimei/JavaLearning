package p18other;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateDemo_03 {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		//∏Ò ΩªØ
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss E");
		String time = sdf.format(d);
		System.out.println(time);
	}

}

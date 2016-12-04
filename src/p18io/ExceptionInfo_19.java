package p18io;
import java.io.*;
/*
 * 日记信息 System.setIn和System.setOut
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionInfo_19 {

	public static void main(String[] args) {
		try {
			int[] arr = new int[2];
			System.out.println(arr[2]);
		}catch(Exception e){
			try {
				Date d = new Date();
				SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
				PrintStream ps = new PrintStream("resource/info.log");
				ps.println(sf.format(d));;
				e.printStackTrace(ps);
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
		}

	}

}

package p18io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

public class SystemInfo_20 {

	public static void main(String[] args) throws IOException {
		Properties prop = System.getProperties();
		//System.out.println(prop);
		//prop.list(System.out);//按行输出到控制到
		prop.list(new PrintStream("resource/systeminfo.txt")); //输出到文件中

	}

}

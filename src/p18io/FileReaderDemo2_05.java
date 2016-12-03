package p18io;
import java.io.*;
/*
 * 第二种方式：通过字符数组进行读取
 */
public class FileReaderDemo2_05 {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("resource/01.txt");
		char[] buf = new char[3];
		int num;
		while((num = fr.read(buf))!= -1){
			System.out.print(String.valueOf(buf));
		}
	}

}

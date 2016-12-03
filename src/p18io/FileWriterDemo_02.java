package p18io;
import java.io.*;
/*
 * IO�쳣�Ĵ���ʽ
 */

public class FileWriterDemo_02 {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("resource/2.txt");
			fw.write("everyday is good");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fw!=null){
					fw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}

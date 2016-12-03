package p18io;

import java.io.FileWriter;
import java.io.IOException;
/*
 * 演示对已有文件的数据续写
 * 
 */

public class FileWriterDemo2_03 {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			/*
			 * 传递一个true参数，代表不覆盖已有的文件，并在已有文件的末尾处进行数据的续写。
			 */
			fw = new FileWriter("resource/2.txt",true);
			//fw.write("\nI want to test2 \r ok nothing");
			fw.write(new char[] {'a','b'});
			
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

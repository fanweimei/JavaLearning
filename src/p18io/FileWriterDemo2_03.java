package p18io;

import java.io.FileWriter;
import java.io.IOException;
/*
 * ��ʾ�������ļ���������д
 * 
 */

public class FileWriterDemo2_03 {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			/*
			 * ����һ��true�����������������е��ļ������������ļ���ĩβ���������ݵ���д��
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

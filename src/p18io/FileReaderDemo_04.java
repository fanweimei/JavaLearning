package p18io;

import java.io.*;

public class FileReaderDemo_04 {

	public static void main(String[] args) throws IOException {
		// ����һ���ļ���ȡ�����󣬺�ָ�����Ƶ��ļ������
		//Ҫ��֤���ļ����Ѿ����ڣ����������쳣
		FileReader fr = new FileReader("resource/2.txt");
		int c;
		while((c = fr.read())!= -1){
			System.out.print((char) c);
		}
		fr.close();
	}

}

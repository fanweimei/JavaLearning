package p18io;

import java.io.*;

public class FileReaderDemo_04 {

	public static void main(String[] args) throws IOException {
		// 创建一个文件读取流对象，和指定名称的文件相关联
		//要保证该文件是已经存在，否则会出现异常
		FileReader fr = new FileReader("resource/2.txt");
		int c;
		while((c = fr.read())!= -1){
			System.out.print((char) c);
		}
		fr.close();
	}

}

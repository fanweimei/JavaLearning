package p18io;
/*
 * ��ϰ�⣺��ȡһ��.java�ļ�������ӡ�ڿ���̨��
 */
import java.io.*;
public class FileReaderTest_06 {

	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("src/p18io/FileReaderTest_06.java");
		char[] buf = new char[1024];
		int num;
		while((num = fr.read(buf))!= -1){
			System.out.print(new String(buf));
		}
	}

}
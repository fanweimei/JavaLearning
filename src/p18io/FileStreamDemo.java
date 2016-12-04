package p18io;

import java.io.*;

public class FileStreamDemo {

	public static void main(String[] args) throws IOException {
//		FileOutputStream fos = new FileOutputStream("resource/fos.txt");
//		fos.write("哈哈".getBytes());
//		fos.close();
		FileInputStream fis = new FileInputStream("resource/fos.txt");
		System.out.println(fis.available()); //获取文件字节大小
		int len = 0;
		byte[] buf = new byte[1024];
		while((len=fis.read(buf))!=-1){
			System.out.println(new String(buf,0,len));
		}
		fis.close();

	}

}

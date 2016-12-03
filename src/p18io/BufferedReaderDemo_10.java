package p18io;

import java.io.*;
/*
 * 字符读取流缓冲区
 * 该缓冲区提供一个一次读一行的方法readLine,方便对文本数据的读取
 * 当返回null时，表示读到文件末尾了。
 */

public class BufferedReaderDemo_10 {

	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("resource/03.txt");
			br = new BufferedReader(fr);
			String s;
			while((s = br.readLine())!=null){
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			br.close();
		}

	}

}

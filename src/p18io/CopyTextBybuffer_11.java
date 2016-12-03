package p18io;

import java.io.*;
/*
 * 通过缓冲区复制一个.java文件
 * readline在硬盘上还是调用read方法一个一个字符读
 */

public class CopyTextBybuffer_11 {

	public static void main(String[] args) {
		BufferedWriter bw = null;
		BufferedReader br = null;
		try {
			bw = new BufferedWriter(new FileWriter("resource/copyJava.txt"));
			br = new BufferedReader(new FileReader("src/p18io/CopyTextBybuffer_11.java"));
			String line;
			while((line = br.readLine())!=null){
				bw.write(line);
				bw.newLine();
				bw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br!=null){
					br.close();
				}
				if(bw!=null){
					bw.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}

}

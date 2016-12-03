package p18io;

import java.io.*;
/*
 * ͨ������������һ��.java�ļ�
 * readline��Ӳ���ϻ��ǵ���read����һ��һ���ַ���
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

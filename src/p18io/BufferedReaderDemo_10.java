package p18io;

import java.io.*;
/*
 * �ַ���ȡ��������
 * �û������ṩһ��һ�ζ�һ�еķ���readLine,������ı����ݵĶ�ȡ
 * ������nullʱ����ʾ�����ļ�ĩβ�ˡ�
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

package p18io;

import java.io.*;

/*
 * �������ڴ���������֮ǰ������Ҫ����������
 * newLine:��ƽ̨����
 */

public class BufferedWriterDemo_08 {

	public static void main(String[] args) throws IOException {
		//����һ���ַ�д��������
		FileWriter fw = new FileWriter("resource/03.txt");
		//Ϊ������ַ�д��Ч�ʣ������˻��弼��
		//ֻҪ����Ҫ�����Ч�ʵ���������Ϊ�������ݸ��������Ĺ��캯������
		BufferedWriter bf = new BufferedWriter(fw);
		for(int i=0; i<5; i++){
			bf.write("abcd "+i);
			//
			bf.newLine();
			bf.flush();
		}
		//��ס��ֻҪ�õ�����������Ҫ�ǵ�ˢ��
		bf.flush();
		//�رջ��������͹ر��˻������е�������
		bf.close();
	}

}

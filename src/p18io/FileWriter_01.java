package p18io;

import java.io.*;

/*
 * �ַ������ֽ�����
 * �ֽ����������ࣺInputStream   OutputStream
 * 
 * �ַ����������ࣺReader  Writer
 * 
 * FileWriter:ר�����������ļ��ġ�
 */

public class FileWriter_01 {

	public static void main(String[] args) throws IOException {
		//����һ��FileWriter���󣬸ö���һ����ʼ���ͱ���Ҫ��ȷ���������ļ�
		//���Ҹ��ļ��ᱻ������ָ��Ŀ¼�£������Ŀ¼������ͬ���ļ����򸲸�
		FileWriter fw = new FileWriter("resource/01.txt");
		//����write��������ʵ�ǽ�����д�뵽������
		fw.write("heihei");
		//ˢ���������еĻ����е����ݣ��������뵽�ļ���
		fw.flush();
		fw.write(" boy");
		fw.flush();
		/*
		 * �ر�����Դ�����ǹر�֮ǰ��ˢ��һ���ڲ��Ļ����е����ݡ�
		 * ������ˢ��Ŀ�ĵ��С�
		 * ��flush����fluashˢ�º������Լ���ʹ�ã�closeˢ�º󣬻Ὣ���ر�
		 */
		fw.close();
		//fw.write(" foolish");
	}

}

package p18io;
/*
 * 1.����¼��system.in��read�������ֽ�������
 * 2.���ֽ���ת��Ϊ�ַ���
 * 
 * �������Ļ������ɣ�
 * ͨ��������ȷ������ʹ���ĸ���������ȷԴ��Ŀ�ģ������������Ƿ��ı�
 * Դ����������InputStream Reader
 * Ŀ�ģ��������OutputStream Writer
 * �Ǵ��ı����ַ���
 * �Ǵ��ı����ֽ���
 * 
 * ����ϵ��ȷ������ȷҪʹ���ĸ�����Ķ���
 * ͨ���豸���������֣�
 * Դ�����ڴ桢Ӳ�̡�����
 * Ŀ���豸���ڴ桢Ӳ�̡�����̨
 * 
 * ���磺��һ���ı��ļ������ݴ洢����һ���ļ��У������ļ���
 * 
 * ת����ʲô�����ʹ�ã��ַ����ֽ�֮���������ͨ�����漰���ַ�����ת��ʱ����Ҫ�õ�ת����
 * 
 */
import java.io.*;

public class Transform_17 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //�Ӽ�������
		//BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("resource/abc.txt"),"utf-8")); //���ļ������루�б���Ҫ��
		//�ַ�ת��Ϊ�ֽ����
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("resource/abc.txt"))); //������ļ��У������Ҫ��ָ���ı��뷽ʽ������ļ��У������Ҫ���ַ�ת�ֽ�������ʽ���
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out),"utf-8"); //���������̨������Ҫ���ַ�ת��Ϊ�ֽ����
		BufferedWriter bw = new BufferedWriter(new FileWriter("resource/ab.txt")); //ֻ��������ļ�����ֱ��ʹ��FileWriter
		String line;
		while((line=br.readLine())!=null){
			bw.write(line);
			bw.newLine();
			bw.flush();
		}

	}

}

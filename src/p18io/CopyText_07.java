package p18io;
/*
 * ��C��һ���ı��ļ����Ƶ�D��
 * ���Ƶ�ԭ����ʵ���ǽ�C���µ��ļ��洢��D�̵�һ���ļ���
 * 
 * ���裺
 * 1.��D�̴���һ���ļ������ڴ洢C���ļ��е�����
 * 2.�����ȡ����C���ļ�����
 * 3.ͨ�����ϵĶ�д��������ݴ洢
 * 4.�ر���Դ
 */
import java.io.*;

public class CopyText_07 {

	public static void main(String[] args) {
		copy1();
	}
	public static void copy1() {
		FileWriter fw = null;
		FileReader fr = null;
		try {
			fw = new FileWriter("resource/01_copy.txt");
			fr = new FileReader("resource/01.txt");
			char[] buf = new char[1024];
			int num;
			while((num = fr.read(buf))!= -1){
				fw.write(buf,0,num);
			}
		} catch(IOException e){
			System.out.println(e);
		} finally {
			try {
				if(fr!= null){
					fr.close();
				}
				if(fw!=null){
					fw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

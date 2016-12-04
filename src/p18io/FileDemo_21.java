package p18io;

import java.io.File;
import java.io.IOException;

/*
 * �������ļ����ļ��з�װ��File����
 * File�ೣ���ķ���
 * 1.����
 * 2.ɾ��
 * 3.�ж�
 * 4.��ȡ��Ϣ
 */

public class FileDemo_21 {
	//File�ೣ������
	static void fileMethod() throws IOException{
		//����
//		File f = new File("resource/file.txt");
//		System.out.println("create:"+f.createNewFile()); //�������
		
		//ɾ��
		//System.out.println("delete:"+f.delete()); //�������
		//�����˳�ʱɾ��
		//f.deleteOnExit();
		
		//�ж�
		//�ļ��Ƿ��ִ��
		File f = new File("src/p18io/FileDemo_21.java");
		System.out.println(f.canExecute());
		//�ļ��Ƿ����
		System.out.println(f.exists()); //true
		File d = new File("resource/test");
		//System.out.println(d.mkdir()); //����Ŀ¼
		System.out.println(d.isDirectory()); //�ж��Ƿ���Ŀ¼
		System.out.println(f.isFile()); //�ж��Ƿ����ļ�
		System.out.println(f.isAbsolute());  //�ж��Ƿ��Ǿ���·��
		System.out.println(f.isHidden());  //�ж��Ƿ��������ļ�
	}

	public static void main(String[] args) throws IOException {
		//�������½�File��ķ���
		File f1 = new File("resource/ab.txt"); //�����Ǿ���·����Ҳ���������·��
		
		File f2 = new File("/Users/fanfan/eclipse/JavaLearning/resource","ab.txt");
		
		File d = new File("/Users/fanfan/eclipse/JavaLearning/resource");
		File f3 = new File(d,"ab.txt");
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		
		//ʹ��Ŀ¼�ָ��������ÿ�������windows�»���linux��
		File f4 = new File("resource"+File.separator+"ab.txt");
		System.out.println(f4);
		
		fileMethod();

	}

}

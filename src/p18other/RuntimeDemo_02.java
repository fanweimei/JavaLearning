package p18other;

import java.io.IOException;

/*
 * Runtime����
 * ������û�й��캯����ͨ��getRuntime()����Ψһ��ʵ��
 */

public class RuntimeDemo_02 {

	public static void main(String[] args) throws Exception {
		Runtime r = Runtime.getRuntime();
//		Process p = r.exec("C:\\Program Files (x86)\\YouKu\\YoukuClient\\YoukuDesktop");
//		Thread.sleep(10000);
//		p.destroy();
		r.exec("D:\\fanfan\\JavaLearning\\src\\p18other\\RuntimeDemo.java");
		
	}

}

package p18io;
/*
 * 将C盘一个文本文件复制到D盘
 * 复制的原理：其实就是将C盘下的文件存储到D盘的一个文件中
 * 
 * 步骤：
 * 1.在D盘创建一个文件，用于存储C盘文件中的数据
 * 2.定义读取流和C盘文件关联
 * 3.通过不断的读写来完成数据存储
 * 4.关闭资源
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

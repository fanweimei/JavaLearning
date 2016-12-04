package p18io;
/*
 * 1.键盘录入system.in的read方法是字节流方法
 * 2.将字节流转化为字符流
 * 
 * 流操作的基本规律：
 * 通过两个明确来决定使用哪个流对象：明确源和目的；操作的数据是否纯文本
 * 源：输入流：InputStream Reader
 * 目的：输出流：OutputStream Writer
 * 是纯文本：字符流
 * 非纯文本：字节流
 * 
 * 当体系明确后，在明确要使用哪个具体的对象：
 * 通过设备来进行区分：
 * 源对象：内存、硬盘、键盘
 * 目的设备：内存、硬盘、控制台
 * 
 * 例如：将一个文本文件中数据存储到另一个文件中，复制文件。
 * 
 * 转化流什么情况会使用，字符和字节之间的桥梁，通常，涉及到字符编码转换时，需要用到转换流
 * 
 */
import java.io.*;

public class Transform_17 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //从键盘输入
		//BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("resource/abc.txt"),"utf-8")); //从文件中输入（有编码要求）
		//字符转化为字节输出
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("resource/abc.txt"))); //输出到文件中，如果是要以指定的编码方式输出到文件中，则必须要将字符转字节流的形式输出
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out),"utf-8"); //输出到控制台，必须要将字符转化为字节输出
		BufferedWriter bw = new BufferedWriter(new FileWriter("resource/ab.txt")); //只是输出到文件中则直接使用FileWriter
		String line;
		while((line=br.readLine())!=null){
			bw.write(line);
			bw.newLine();
			bw.flush();
		}

	}

}

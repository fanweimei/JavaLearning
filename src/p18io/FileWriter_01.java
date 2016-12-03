package p18io;

import java.io.*;

/*
 * 字符流和字节流：
 * 字节流两个基类：InputStream   OutputStream
 * 
 * 字符流两个基类：Reader  Writer
 * 
 * FileWriter:专门用来操作文件的。
 */

public class FileWriter_01 {

	public static void main(String[] args) throws IOException {
		//创建一个FileWriter对象，该对象一被初始化就必须要明确被操作的文件
		//而且该文件会被创建到指定目录下，如果该目录下已有同名文件，则覆盖
		FileWriter fw = new FileWriter("resource/01.txt");
		//调用write方法，其实是将数据写入到了流中
		fw.write("heihei");
		//刷新流对象中的缓冲中的数据，将其输入到文件中
		fw.flush();
		fw.write(" boy");
		fw.flush();
		/*
		 * 关闭流资源，但是关闭之前会刷新一次内部的缓冲中的数据。
		 * 将数据刷到目的地中。
		 * 和flush区别：fluash刷新后，流可以继续使用，close刷新后，会将流关闭
		 */
		fw.close();
		//fw.write(" foolish");
	}

}

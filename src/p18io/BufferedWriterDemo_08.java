package p18io;

import java.io.*;

/*
 * 缓冲区在创建缓冲区之前，必须要先有流对象
 * newLine:跨平台换行
 */

public class BufferedWriterDemo_08 {

	public static void main(String[] args) throws IOException {
		//创建一个字符写入流对象
		FileWriter fw = new FileWriter("resource/03.txt");
		//为了提高字符写入效率，加入了缓冲技术
		//只要将需要被提高效率的流对象作为参数传递给缓冲区的构造函数即可
		BufferedWriter bf = new BufferedWriter(fw);
		for(int i=0; i<5; i++){
			bf.write("abcd "+i);
			//
			bf.newLine();
			bf.flush();
		}
		//记住，只要用到缓冲区，就要记得刷新
		bf.flush();
		//关闭缓冲区，就关闭了缓冲区中的流对象
		bf.close();
	}

}

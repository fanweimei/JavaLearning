package p18io;

import java.io.File;
import java.io.IOException;

/*
 * 将已有文件或文件夹封装成File对象
 * File类常见的方法
 * 1.创建
 * 2.删除
 * 3.判断
 * 4.获取信息
 */

public class FileDemo_21 {
	//File类常见方法
	static void fileMethod() throws IOException{
		//创建
//		File f = new File("resource/file.txt");
//		System.out.println("create:"+f.createNewFile()); //返回真假
		
		//删除
		//System.out.println("delete:"+f.delete()); //返回真假
		//程序退出时删除
		//f.deleteOnExit();
		
		//判断
		//文件是否可执行
		File f = new File("src/p18io/FileDemo_21.java");
		System.out.println(f.canExecute());
		//文件是否存在
		System.out.println(f.exists()); //true
		File d = new File("resource/test");
		//System.out.println(d.mkdir()); //创建目录
		System.out.println(d.isDirectory()); //判断是否是目录
		System.out.println(f.isFile()); //判断是否是文件
		System.out.println(f.isAbsolute());  //判断是否是绝对路径
		System.out.println(f.isHidden());  //判断是否是隐藏文件
	}

	public static void main(String[] args) throws IOException {
		//有三种新建File类的方法
		File f1 = new File("resource/ab.txt"); //可以是绝对路径，也可以是相对路径
		
		File f2 = new File("/Users/fanfan/eclipse/JavaLearning/resource","ab.txt");
		
		File d = new File("/Users/fanfan/eclipse/JavaLearning/resource");
		File f3 = new File(d,"ab.txt");
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		
		//使用目录分隔符，不用考虑是在windows下还是linux下
		File f4 = new File("resource"+File.separator+"ab.txt");
		System.out.println(f4);
		
		fileMethod();

	}

}

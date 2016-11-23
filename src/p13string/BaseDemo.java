package p13string;
/*
 * 基本数据类型
 * 
 * 基本类型转对象包装类型作用：
 * 1.基本类型和字符串之间转化
 * 转为字符串：基本数据类型.toString(基本数据类型值）
 * 字符串转为基本数据类：parseInt()  xxx.parseXxx(str)
 * 
 * JDK1.5版本以后出现的新特性
 */

public class BaseDemo {

	public static void main(String[] args) {
		System.out.println(Integer.parseInt("45")+5);
		//进制之间的转换
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.parseInt("110",2));
		
		Integer x = new Integer("123");
		Integer y = new Integer(123);
		System.out.println(x.equals(y));
		
		System.out.println(x.compareTo(y));;
		
	}

}

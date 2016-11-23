package p13string;
/*
 * StringButter是字符串缓冲区
 * 是一个容器
 * 长度是可变化的
 * 可以直接操作多个数据类型
 * 最终可以通过toString方法变为字符串
 * 
 * 1.存储：append  添加到结尾处
 * 			insert(index,data)可以将数据插入到指定位置上
 * 2.删除 delete(start, end)包含头不包含尾
 * 		deleteCharAt(index)删除指定位置的字符
 * 3.获取
 * charAt(index)获取
 * indexOf()
 * lastIndexOf()
 * subString
 * 
 * 4.更改
 * replace（start, end, str)
 * setCharAt(index,ch)替换字符
 * 
 * 5.反转
 * reverse
 * 
 * 6.将缓冲区中指定数据存储到指定字符数组中
 * getChars(int srcBegin, int srcEnd, char[] dst, int toBegin)
 *
 *jdk1.5之后出现了StringBuilder
 *StringBuffer是线程同步，用于多线程中
 *StringBuilder是线程不同步，性能好，用于多线程或自己加锁了多线程
 *
 *升级的原因：
 *提升性能
 *简化书写
 */

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("helo").append(90);
		sb.insert(1, "fanfan ");
		System.out.println(sb);
		sb.delete(0, 2);
		System.out.println(sb);
		sb.deleteCharAt(0);
		System.out.println(sb);
		//sb.delete(0, sb.length()); //清空缓存区
		sb.replace(0, 4, "java");
		System.out.println(sb);
		sb.setCharAt(4, '-');
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		char[] arr = new char[5];
		sb.getChars(0, 5, arr, 0);
		System.out.println(String.valueOf(arr));
		System.out.println(sb);
	}

}

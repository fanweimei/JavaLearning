package p14collect;
/*
 * 泛型：JDK1.5版本以后出现新特性，用于解决安全问题，是一个安全机制
 * 好处：将运行时期出现问题ClassCastException转移到了编译时期，方便程序员解决问题。
 * 
 * 泛型格式：通过<>来定义要操作的引用数据类型
 * 泛型在集合框架中很常见
 * 其实<>用来接收数据类型
 */

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo_11 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("a01");
		al.add("a02");
		
		Iterator<String> it = al.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

	}

}

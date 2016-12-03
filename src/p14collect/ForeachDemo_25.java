package p14collect;
/*
 * 高级for循环 foreach
 * 简化书写
 * 一般实现了迭代器的对象就可以使用高级for
 */

import java.util.*;

public class ForeachDemo_25 {
	public static void main(String[] args){
		ArrayList<String> al = new ArrayList<String>();
		al.add("ab");
		al.add("ac");
		al.add("kb");
		
		for(String s: al){
			//s = "kk"; 对集合进行遍历，只能获取集合元素，但是不能对集合进行操作
			System.out.print(s+" ");
		}
		System.out.println(al);
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "aa");
		hm.put(2, "bb");
		for(Integer i : hm.keySet()){
			System.out.println(i+"="+hm.get(i));
		}
		for(Map.Entry<Integer, String> val: hm.entrySet()){
			System.out.println(val.getKey()+"--"+val.getValue());
		}
	}
}

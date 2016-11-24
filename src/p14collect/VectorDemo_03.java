package p14collect;
/*
 * 枚举就是Vector特有的取出方法。
 * 发现枚举和迭代很像，其实枚举和迭代是一样的。
 * 因为枚举的名称以及方法名称都过长，被迭代器取代了
 */

import java.util.*;

public class VectorDemo_03 {
	static void vector_unique_fn(){
		Vector v = new Vector();
		v.add("aa");
		v.add("bb");
		v.add("cc");
		v.add("dd");
		v.add("aa");
		
		//枚举迭代
		Enumeration en = v.elements();
		while(en.hasMoreElements()){
			System.out.print(en.nextElement()+" ");  //aa bb cc dd aa 
		}
	}

	public static void main(String[] args) {
		
		vector_unique_fn();
	}

}

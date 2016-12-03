package p14collect;

import java.util.*;

/*
 * map扩展知识
 * map集合被使用是因为具备映射关系
 */

public class MapDemo3_22 {

	public static void main(String[] args) {
		HashMap<String,String> A = new HashMap<String,String>();
		A.put("01", "aa");
		A.put("02", "gg");
		HashMap<String,String> B = new HashMap<String,String>();
		B.put("01", "kk");
		B.put("02", "gg");
		HashMap<String,HashMap<String,String>> scut = new HashMap<String,HashMap<String,String>>();
		scut.put("A", A);
		scut.put("B", B);
	}

}

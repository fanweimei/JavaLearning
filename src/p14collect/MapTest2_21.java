package p14collect;
/*
 * 练习题2：
 * "sdfgzxcvasdfxcvdf"获取该字符串中的字符出现的次数
 * 希望打印结果：a(1)c(2)
 * 
 * 思路：
 * 1.将字符串转换为字符数组，因为要对每一个字母进行操作
 * 2.定义一个map集合，因为打印结果的字母有顺序，所以使用TreeMap
 * 3.遍历字符数组
 */

import java.util.*;

public class MapTest2_21 {
	//打印字符串中字符出现的次数
	static String printStrCount(String str){
		StringBuilder rs = new StringBuilder();
		if(str.length()>0){
			char[] crr = str.toCharArray();
			TreeMap<Character,Integer> map = new TreeMap<Character,Integer>();
			for(int i=0; i<crr.length; i++){
				int count = map.containsKey(crr[i])? map.get(crr[i])+1 : 1;
				map.put(crr[i],count);
	
			}
			
			Set<Character> set = map.keySet();
			Iterator<Character> it = set.iterator();
			while(it.hasNext()){
				char c = it.next();
				rs.append(c+"("+map.get(c)+")");
				
			}
		}
		return rs.toString();
	}

	public static void main(String[] args) {
		System.out.println(printStrCount("sdfgzxcvasdfxcvdf"));
	}

}


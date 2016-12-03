package p14collect;
/*
 * map集合的两种取出方式：
 * 1.keySet:将map中所有键存入到Set集合中。
 * 2.entrySet:
 */

import java.util.*;

public class MapDemo2_19 {
	public static void main(String[] args){
		Map<String, String> map = new HashMap<String,String>();
		map.put("01", "zs");
		map.put("02", "ls");
		map.put("03", "ww");	
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()){
			String key = it.next();
			System.out.println("key="+key+",value="+map.get(key));
			/*
			 *  key=01,value=zs
				key=02,value=ls
				key=03,value=ww
			 */
		}
		
		Set<Map.Entry<String, String>> obj = map.entrySet();
		Iterator<Map.Entry<String, String>> it2 = obj.iterator();
		while(it2.hasNext()){
			System.out.print(it2.next());
			/*
			 * 	01=zs
				02=ls
				03=ww
			 */
		}
		
	}
}

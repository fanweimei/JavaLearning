package p14collect;
/*
 * map���ϵ�����ȡ����ʽ��
 * 1.keySet:��map�����м����뵽Set�����С�
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
		}
		
		Set<Map.Entry<String, String>> obj =
		
	}
}

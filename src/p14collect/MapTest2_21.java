package p14collect;
/*
 * ��ϰ��2��
 * "sdfgzxcvasdfxcvdf"��ȡ���ַ����е��ַ����ֵĴ���
 * ϣ����ӡ�����a(1)c(2)
 * 
 * ˼·��
 * 1.���ַ���ת��Ϊ�ַ����飬��ΪҪ��ÿһ����ĸ���в���
 * 2.����һ��map���ϣ���Ϊ��ӡ�������ĸ��˳������ʹ��TreeMap
 * 3.�����ַ�����
 */

import java.util.*;

public class MapTest2_21 {
	//��ӡ�ַ������ַ����ֵĴ���
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


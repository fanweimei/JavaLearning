package p14collect;
/*
 * �߼�forѭ�� foreach
 * ����д
 * һ��ʵ���˵������Ķ���Ϳ���ʹ�ø߼�for
 */

import java.util.*;

public class ForeachDemo_25 {
	public static void main(String[] args){
		ArrayList<String> al = new ArrayList<String>();
		al.add("ab");
		al.add("ac");
		al.add("kb");
		
		for(String s: al){
			//s = "kk"; �Լ��Ͻ��б�����ֻ�ܻ�ȡ����Ԫ�أ����ǲ��ܶԼ��Ͻ��в���
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

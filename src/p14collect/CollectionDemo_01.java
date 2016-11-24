package p14collect;

import java.util.*;

/*
 * Collection 
 * ������������������鳤�ȹ̶������ϳ��ȿɱ䣻����ֻ�ܴ�һ�����͵����ݣ����Ͽ��Դ��κζ���
 * Collection���з�����add,addAll,remove,removeAll,contains, containsAll,clear,retainAll,equals,isEmpty,size,toArray Iterator
 * ���ࣺ
 * 	1.List
 * 		(1)ArrayList
 * 		(2)LinkedList
 * 		(3)Vector
 * 	2.Set
 * 		(1)HashSet
 * 		(2)TreeSet
 * 
 * Iterator�ӿڣ��ڼ����ڲ�ʵ���ڲ���
 * 
 */

public class CollectionDemo_01 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("one");
		list.add("two");
		list.add("three");
		//ֱ�����������ʽ��ӡ����
		System.out.println(list);
		list.remove("one");
		System.out.println(list);
		System.out.println(list.contains("two"));
		System.out.println(list.isEmpty());
		ArrayList list2 = new ArrayList();
		list2.add("two");
		//list2.addAll(list);
		//list2ȡ����
		list2.retainAll(list);
		System.out.println(list);
		System.out.println(list2);
		list2.addAll(list);
		System.out.println(list2);
		list2.add("22");
		list2.removeAll(list);
		System.out.println(list2);
		
		list2.add("11");
		list2.add("33");
		list2.add("44");
		Iterator it = list2.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		ArrayList al3 = new ArrayList();
		al3.add(new Integer(11));
		al3.add(new Integer(99));
		al3.add(new Integer(33));
		al3.add("44");
		System.out.println(al3);
	}

}

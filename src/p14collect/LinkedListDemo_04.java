package p14collect;
/*
 * LinkedList:���з���
 * addFirst()
 * addLast()
 * 
 * getFirst()
 * getLast()
 * 
 * removeFirst()
 * removeLast()
 * ����Ƴ����߻�ȡԪ���У��������Ѿ�û���κ�Ԫ���ˣ��ͻ����NoSuchElementException�쳣
 * 
 * ��JDK1.6�г������������
 * peekFirst();
 * peekLast()
 * ��ȡԪ�أ�����ɾ��Ԫ�أ����������û�г���Ԫ�أ��ͻ᷵��null
 * 
 * pollFirst()
 * pollLast()
 * ��ȡԪ�ز�ɾ��Ԫ�أ����������û�г���Ԫ�أ��ͻ᷵��null
 */

import java.util.*;

public class LinkedListDemo_04 {
	//LinkList���еķ���
	static void linkedList_unique_fn(){
		LinkedList link = new LinkedList();
		//System.out.println(link.getFirst()); ��ʱ������û��Ԫ�أ��ᱨ�쳣
		link.addFirst("link01");
		link.addFirst("link02");
		link.addFirst("link04");
		link.addFirst("link03");
		System.out.println(link);  //[link03, link04, link02, link01]
		System.out.println(link.getFirst()); //link03
		System.out.println(link.getLast());  //link01
		
		System.out.println(link.removeFirst()); //link03
		System.out.println(link.removeLast());  //link01
		System.out.println(link);  //[link04, link02]
	}
	
	//JDK1.6���ֵ��·�����������ϵķ���
	static void LinkedList_unique_newFn(){
		LinkedList link = new LinkedList();
		System.out.println(link.peekFirst()); //null
		link.addFirst("link01");
		link.addFirst("link02");
		link.addFirst("link04");
		link.addFirst("link03");
		
		System.out.println(link); //[link03, link04, link02, link01]
		System.out.println(link.peek());  //link03  Ĭ����peekFirst
		System.out.println(link.peekFirst()); //link03
		System.out.println(link.peekLast());  //link01
		
		System.out.println(link.poll()); //link03 Ĭ����pollFirst
		System.out.println(link.pollFirst());//link04
		System.out.println(link.pollLast()); //link01
		System.out.println(link);  //[link02]
		
	}

	public static void main(String[] args) {
		//linkedList_unique_fn();
		LinkedList_unique_newFn();
	}

}

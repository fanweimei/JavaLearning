package p14collect;
/*
 * LinkedList:特有方法
 * addFirst()
 * addLast()
 * 
 * getFirst()
 * getLast()
 * 
 * removeFirst()
 * removeLast()
 * 如果移除或者获取元素中，集合中已经没有任何元素了，就会出现NoSuchElementException异常
 * 
 * 在JDK1.6中出现了替代方法
 * peekFirst();
 * peekLast()
 * 获取元素，但不删除元素，如果集合中没有出现元素，就会返回null
 * 
 * pollFirst()
 * pollLast()
 * 获取元素并删除元素，如果集合中没有出现元素，就会返回null
 */

import java.util.*;

public class LinkedListDemo_04 {
	//LinkList特有的方法
	static void linkedList_unique_fn(){
		LinkedList link = new LinkedList();
		//System.out.println(link.getFirst()); 此时集合中没有元素，会报异常
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
	
	//JDK1.6出现的新方法，替代以上的方法
	static void LinkedList_unique_newFn(){
		LinkedList link = new LinkedList();
		System.out.println(link.peekFirst()); //null
		link.addFirst("link01");
		link.addFirst("link02");
		link.addFirst("link04");
		link.addFirst("link03");
		
		System.out.println(link); //[link03, link04, link02, link01]
		System.out.println(link.peek());  //link03  默认是peekFirst
		System.out.println(link.peekFirst()); //link03
		System.out.println(link.peekLast());  //link01
		
		System.out.println(link.poll()); //link03 默认是pollFirst
		System.out.println(link.pollFirst());//link04
		System.out.println(link.pollLast()); //link01
		System.out.println(link);  //[link02]
		
	}

	public static void main(String[] args) {
		//linkedList_unique_fn();
		LinkedList_unique_newFn();
	}

}

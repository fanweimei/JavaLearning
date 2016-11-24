package p14collect;

import java.util.*;

/*
 * LinkedList练习题：模拟堆栈或队列
 */

public class LinkedListTest_05 {
	//测试堆栈
	static void testStack(){
		StackImitation s = new StackImitation();
		s.push("s01");
		s.push("s02");
		s.push("s03");
		System.out.println(s.peek()); //s03
		s.print();  //[s01, s02, s03]
		System.out.println(s.pop()); //s03
		s.print(); //[s01, s02]
		s.pop();
		s.pop();
		System.out.println(s.pop()); //null
	}
	
	//测试队列
	static void testQueue(){
		QueueImitation q = new QueueImitation();
		q.enqueue("q01");
		q.enqueue("q02");
		q.enqueue("q03");
		System.out.println(q.top());//q01
		q.print(); //[q01, q02, q03]
		System.out.println(q.dequeue()); //q01
		q.print();  //[q02, q03]
	}

	public static void main(String[] args) {
		testStack();
		//testQueue();
	}

}

//模拟堆栈
class StackImitation {
	private LinkedList stack = new LinkedList();
	
	public void push(Object o){
		stack.addLast(o);
	}
	public Object pop(){
		return stack.pollLast();
	}
	public Object peek(){
		return stack.peekLast();
	}
	public boolean isEmpty(){
		return stack.isEmpty();
	}
	public void print(){
		System.out.println(stack);
	}
}
//模拟队列
class QueueImitation {
	private LinkedList queue = new LinkedList();
	
	public void enqueue(Object o){
		queue.addLast(o);
	}
	public Object dequeue(){
		return queue.pollFirst();
	}
	public Object top(){
		return queue.peekFirst();
	}
	public boolean isEmpty(){
		return queue.isEmpty();
	}
	public void print(){
		System.out.println(queue);
	}
}

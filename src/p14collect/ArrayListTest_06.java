package p14collect;

import java.util.*;
/*
 * ArrayList练习题：去除ArrayList集合中的重复元素
 * 如果集合中是自定义对象，则要改写equals方法，因为ArrayList是通过equals方法来判断两个对象是否相同
 */

public class ArrayListTest_06 {
	
	//集合去重
	static ArrayList uniqueList(ArrayList list){
		ArrayList newList = new ArrayList();
		Iterator it = list.iterator();
		while(it.hasNext()){
			Object obj = it.next();
			if(!newList.contains(obj)){
				newList.add(obj);
			}
		}
		return newList;
	}
	static void testUniqueList(){
		ArrayList list = new ArrayList();
		list.add("a01");
		list.add("a03");
		list.add("a01");
		list.add("a02");
		list.add("a04");
		list.add("a01");
		list.add("a03");
		System.out.println(list); //[a01, a03, a01, a02, a04, a01, a03]
		list = uniqueList(list);
		System.out.println(list); //[a01, a03, a02, a04]
	}
	
	//此时集合加入的是Person对象，去掉年龄和名字都相同的对象
	static void testUniqueList2(){
		ArrayList list = new ArrayList();
		list.add(new Person("p01",10));
		list.add(new Person("p02",20));
		list.add(new Person("p03",30));
		list.add(new Person("p01",10));
		list = uniqueList(list);
		System.out.println(list); //[p01-10, p02-20, p03-30]
	}

	public static void main(String[] args) {
		//testUniqueList();
		testUniqueList2();
	}

}

class Person {
	private String name;
	private int age;
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	public String toString(){
		return this.name+"-"+this.age;
	}
	//必须要重写equals方法
	public boolean equals(Object o){
		Person p = (Person) o;
		return this.getName().equals(p.getName()) && this.getAge() == p.getAge();
	}
	
}

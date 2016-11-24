package p14collect;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * TreeSet: 可以对Set集合中的元素进行排序
 * 对象元素需要实现Comparable接口，实现排序，先判断主要条件，再判断次要条件
 * 底层是二叉树数据结构
 * 
 * 第二种排序方法：当元素自身不具备比较性时，这时就需要让集合自身具备比较比较性。
 * 当两种排序都存在时，第二种比较强为主
 */

public class TreeSetDemo_09 {
	static void firstSort(){
		TreeSet ts = new TreeSet();
		ts.add("t01");
		ts.add("t03");
		ts.add("t02");
		ts.add("t02");
		System.out.println(ts); //[t01, t02, t03]
		
		//如果存储自定义对象
		/*
		 * 按照学生的年龄进行排序
		 */
		TreeSet ts2 = new TreeSet();
		ts2.add(new Child("c01",3));
		ts2.add(new Child("c03",3));
		ts2.add(new Child("c02",9));
		ts2.add(new Child("c01",3));
		System.out.println(ts2); //[c01-3, c03-3, c02-9]
	}
	
	//第二种实现排序的方法
	static void secSort(){
		TreeSet ts = new TreeSet(new MyComparator());
		ts.add(new Child2("c01",3));
		ts.add(new Child2("c03",3));
		ts.add(new Child2("c02",9));
		ts.add(new Child2("c01",3));
		System.out.println(ts); //[c01-3, c03-3, c02-9]
	}

	public static void main(String[] args) {
		//firstSort();
		secSort();
	}

}
//Child元素中实现了Comparable
class Child implements Comparable{ //该接口强制让学生具备比较性
	private String name;
	private int age;
	Child(String name, int age){
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
	
	public int compareTo(Object o) {
		if(!(o instanceof Child)){
			throw new RuntimeException("不是学生对象");
		}
		Child  c = (Child) o;
		if(this.age > c.getAge()){
			return 1;
		}else if(this.age < c.getAge()){
			return -1;
		}else{
			return this.name.compareTo(c.getName());
		}
	}
	
}

//Child元素中没有实现了Comparable
class Child2{ //该接口强制让学生具备比较性
	private String name;
	private int age;
	Child2(String name, int age){
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
}
//单独实现Comparator类
class MyComparator implements Comparator{

	public int compare(Object o1, Object o2) {
		Child2 c1 = (Child2)o1;
		Child2 c2 = (Child2)o2;
		if(c1.getAge() > c2.getAge()){
			return 1;
		}else if(c1.getAge() < c2.getAge()){
			return -1;
		}else{
			return c1.getName().compareTo(c2.getName());
		}
	}
	
}

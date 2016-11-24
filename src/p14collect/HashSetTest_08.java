package p14collect;

import java.util.HashSet;

public class HashSetTest_08 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(new Student("s01",10));
		hs.add(new Student("s04",10));
		hs.add(new Student("s02",30));
		hs.add(new Student("s03",20));
		hs.add(new Student("s01",10)); //[s01-10, s04-10, s02-30, s03-20]
		System.out.println(hs);
		//contains和remove方法也是依赖hashCode和equals
		System.out.println(hs.contains(new Student("s01",10))); //true
		hs.remove(new Student("s02",30));
		System.out.println(hs); //[s04-10, s03-20, s01-10]
	}

}

class Student {
	private String name;
	private int age;
	Student(String name, int age){
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
	public int hashCode(){
		return this.name.hashCode()+this.age;
	}
	//必须要重写equals方法
	public boolean equals(Object o){
		if(!(o instanceof Student)){
			return false;
		}
		Student p = (Student) o;
		return this.getName().equals(p.getName()) && this.getAge() == p.getAge();
	}
	
}

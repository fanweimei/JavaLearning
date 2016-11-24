package p14collect;

import java.util.*;

public class GenericDemo7_17 {

	public static void main(String[] args) {
		TreeSet<Student7> ts = new TreeSet<Student7>(new Comp());
		ts.add(new Student7("ff"));
		ts.add(new Student7("zz"));
		ts.add(new Student7("ww"));
		
		Iterator <Student7> it = ts.iterator();
		while(it.hasNext()){
			System.out.print(it.next().getName()+"¡¡");
		}
		
		TreeSet<Worker7> tw = new TreeSet<Worker7>(new Comp());
		tw.add(new Worker7("ff"));
		tw.add(new Worker7("zz"));
		tw.add(new Worker7("ww"));
		
		Iterator <Worker7> iw = tw.iterator();
		while(iw.hasNext()){
			System.out.print(iw.next().getName()+"¡¡");
		}
	}

}
class Comp implements Comparator<Person7> {
	public int compare(Person7 s1, Person7 s2){
		return s1.getName().compareTo(s2.getName());
	}
}

class Person7 {
	private String name;
	Person7(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public String toString(){
		return "Person:"+name;
	}
}
class Student7 extends Person7{

	Student7(String name) {
		super(name);
	}
	
}
class Worker7 extends Person7 {

	Worker7(String name) {
		super(name);
	}
	
}

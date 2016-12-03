package p14collect;
/*
 * ��ϰ�⣺
 * ÿ��ѧ�����ж�Ӧ�Ĺ�����
 * ѧ��Student20, ��ַString
 * ѧ�����ԣ�����������
 * ע�⣺������������ͬ����Ϊͬһ��ѧ��
 * ��֤ѧ����Ψһ��
 * 
 * 1.����ѧ��
 * 2.����map��������ѧ����Ϊ������ַ��Ϊֵ������
 * 3.��ȡmap�����е�Ԫ��
 */

import java.util.*;

public class MapTest_20 {
	//ʹ��HashMap�洢
	static void testHashMap(){
		HashMap<Student20,String> ss = new HashMap<Student20,String>();
		ss.put(new Student20("aa",3), "gz");
		ss.put(new Student20("gg",30), "bj");
		ss.put(new Student20("kk",6), "sh");
		ss.put(new Student20("aa",3), "jd");
		ss.put(new Student20("bb",16), "hn");
		
		Set<Map.Entry<Student20, String>> set = ss.entrySet();
		Iterator<Map.Entry<Student20, String>> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
	//ʹ��TreeMap�洢�����԰�����������
	static void testTreeMap(){
		//TreeMap<Student20,String> ss = new TreeMap<Student20,String>();
		//���������д�� ������һ���Ƚ���
		TreeMap<Student20,String> ss = new TreeMap<Student20,String>(new StuNameComparator());
		ss.put(new Student20("aa",3), "gz");
		ss.put(new Student20("gg",30), "bj");
		ss.put(new Student20("kk",6), "sh");
		ss.put(new Student20("aa",3), "jd");
		ss.put(new Student20("bb",16), "hn");
		
		Set<Map.Entry<Student20, String>> set = ss.entrySet();
		Iterator<Map.Entry<Student20, String>> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			/*
			 * name:aa,age:3=jd
				name:bb,age:16=hn
				name:gg,age:30=bj
				name:kk,age:6=sh
			 */
		}
	}

	public static void main(String[] args) {
		testTreeMap();
	}

}
class Student20 implements Comparable<Student20>{
	private String name;
	private int age;
	Student20(String name,int age){
		this.name = name;
		this.age = age;
	}
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	public int hashCode(){
		return this.name.hashCode()+this.age*3;
	}
	public boolean equals(Object o){
		if(!(o instanceof Student20)){
			return false;
		}
		Student20 s = (Student20) o;
		return this.name.equals(s.getName()) && this.age == s.getAge();	
	}
	public String toString(){
		return "name:"+this.name+",age:"+this.age;
	}
	public int compareTo(Student20 o) {
		return this.name.compareTo(o.getName());
	}
}
class StuNameComparator implements Comparator<Student20> {

	public int compare(Student20 o1, Student20 o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}

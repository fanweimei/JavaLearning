package p14collect;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * TreeSet: ���Զ�Set�����е�Ԫ�ؽ�������
 * ����Ԫ����Ҫʵ��Comparable�ӿڣ�ʵ���������ж���Ҫ���������жϴ�Ҫ����
 * �ײ��Ƕ��������ݽṹ
 * 
 * �ڶ������򷽷�����Ԫ�������߱��Ƚ���ʱ����ʱ����Ҫ�ü�������߱��ȽϱȽ��ԡ�
 * ���������򶼴���ʱ���ڶ��ֱȽ�ǿΪ��
 */

public class TreeSetDemo_09 {
	static void firstSort(){
		TreeSet ts = new TreeSet();
		ts.add("t01");
		ts.add("t03");
		ts.add("t02");
		ts.add("t02");
		System.out.println(ts); //[t01, t02, t03]
		
		//����洢�Զ������
		/*
		 * ����ѧ���������������
		 */
		TreeSet ts2 = new TreeSet();
		ts2.add(new Child("c01",3));
		ts2.add(new Child("c03",3));
		ts2.add(new Child("c02",9));
		ts2.add(new Child("c01",3));
		System.out.println(ts2); //[c01-3, c03-3, c02-9]
	}
	
	//�ڶ���ʵ������ķ���
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
//ChildԪ����ʵ����Comparable
class Child implements Comparable{ //�ýӿ�ǿ����ѧ���߱��Ƚ���
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
			throw new RuntimeException("����ѧ������");
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

//ChildԪ����û��ʵ����Comparable
class Child2{ //�ýӿ�ǿ����ѧ���߱��Ƚ���
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
//����ʵ��Comparator��
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

package p14collect;
/*
 * ?通配符：也可以理解为占位符
 * 泛型的限定：
 * （1）? extends E 表示上限，可以接受E类型或者E的子类型
 * （2）? super E 表示下线，可以接受E类型或者E的父类型
 */

import java.util.*;

public class GeneriDemo6_16 {

	public static void main(String[] args) {
		//testPrint();
		testPrintObj();
	}
	static void testPrint(){
		ArrayList<String> al = new ArrayList<String>();
		al.add("abc1");
		al.add("abc2");
		al.add("abc3");
		print(al);
		System.out.println();
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(5);
		al2.add(8);
		al2.add(10);
		print(al2);
	}
	
	//第一种方法
	public static void print(ArrayList<?> al){
		Iterator<?> it = al.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
	}
	//第二种方法
	public static <T> void print2(ArrayList<T> al){
		Iterator<T> it = al.iterator();
		while(it.hasNext()){
			T obj = it.next(); //这种放好的好处是可以取出具体的值
			System.out.print(obj+" ");
		}
	}
	
	//测试应用在对象中
	static void testPrintObj(){
		ArrayList<MyPerson> ap = new ArrayList<MyPerson>();
		ap.add(new MyPerson("zz"));
		ap.add(new MyPerson("ff"));
		ap.add(new MyPerson("ww"));
		printObj(ap);
		System.out.println();
		
		//左右两边要一致
		ArrayList <MyStudent> as = new ArrayList<MyStudent>();
		as.add(new MyStudent("aa"));
		as.add(new MyStudent("bb"));
		as.add(new MyStudent("cc"));
		printObj(as);
	}
	//应用在对象中  ? extends MyPerson  或者 ? super MyStudent均可
	public static void printObj(ArrayList<? extends MyPerson> al){
		Iterator<? extends MyPerson> it = al.iterator();
		while(it.hasNext()){
			System.out.print(it.next().getName()+" ");
		}
	}

}
class MyPerson {
	private String name;
	MyPerson(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
}
class MyStudent extends MyPerson{

	MyStudent(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
}

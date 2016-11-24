package p14collect;
/*
 * ?ͨ�����Ҳ�������Ϊռλ��
 * ���͵��޶���
 * ��1��? extends E ��ʾ���ޣ����Խ���E���ͻ���E��������
 * ��2��? super E ��ʾ���ߣ����Խ���E���ͻ���E�ĸ�����
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
	
	//��һ�ַ���
	public static void print(ArrayList<?> al){
		Iterator<?> it = al.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
	}
	//�ڶ��ַ���
	public static <T> void print2(ArrayList<T> al){
		Iterator<T> it = al.iterator();
		while(it.hasNext()){
			T obj = it.next(); //���ַźõĺô��ǿ���ȡ�������ֵ
			System.out.print(obj+" ");
		}
	}
	
	//����Ӧ���ڶ�����
	static void testPrintObj(){
		ArrayList<MyPerson> ap = new ArrayList<MyPerson>();
		ap.add(new MyPerson("zz"));
		ap.add(new MyPerson("ff"));
		ap.add(new MyPerson("ww"));
		printObj(ap);
		System.out.println();
		
		//��������Ҫһ��
		ArrayList <MyStudent> as = new ArrayList<MyStudent>();
		as.add(new MyStudent("aa"));
		as.add(new MyStudent("bb"));
		as.add(new MyStudent("cc"));
		printObj(as);
	}
	//Ӧ���ڶ�����  ? extends MyPerson  ���� ? super MyStudent����
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

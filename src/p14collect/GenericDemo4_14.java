package p14collect;
/*
 * 泛型定义的泛型，在整个类中有效，如果被方法使用，那么泛型类的对象明确要操作的具体类型后，
 * 所有要操作的类型就已经固定了。
 * 
 * 为了让不同方法可以操作不同类型，而且类型还不确定，那么可以将泛型定义在方法上。
 * 
 * 有两种方式：
 * 1.定义在类上，所有的方法类型就随new 的对象时的类型相同，类上的类型与传入参数的类型相同，如Demo1
 * 2.定义在方法上，新建对象时，不必指明类型，方法上的类型与传入的参数的类型相同,如Demo2
 * 
 * 两种方法也可以同时存在，如Demo3
 * 
 * 特殊情况：静态方法只能定义在方法上，不能定义在类上
 */
class Demo1<Q> {
	public  void show(Q t){
		System.out.println("show:"+t);
	}
	public  void print(Q t){
		System.out.println("print:"+t);
	}
}

class Demo2 {
	public <T> void show(T t){
		System.out.println("show:"+t);
	}
	public <T> void print(T t){
		System.out.println("print:"+t);
	}
}

class Demo3<Q> {
	public void show(Q t){
		System.out.println("show:"+t);
	}
	public <T> void print(T t){
		System.out.println("print:"+t);
	}
	public static <T> void method(T q){
		System.out.println("static");
	}
}

public class GenericDemo4_14 {

	public static void main(String[] args) {
		Demo1<Integer> d = new Demo1<Integer>();
		d.show(new Integer(4));
		d.print(6);	
		Demo1<String> s = new Demo1<String>();
		s.print("hello");
		
		Demo2 d2 = new Demo2();
		d2.print("hello");
		d2.print(3);
		
		Demo3<Integer> d3 = new Demo3<Integer>();
		d3.print("hello");
		d3.print(3);
		d3.show(9);
	}

}

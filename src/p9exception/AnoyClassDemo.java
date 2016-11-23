package p9exception;

/*
 * 1.匿名内部类其实就是内部类的简写格式
 * 2.定义匿名内部类的前提：内部类必须是继承一个类或者实现接口
 * 3.匿名内部类的格式：new 父类或者接口(){定义子类的内容}
 * 4.其实匿名内部类就是匿名内部子对象
 * 5.匿名内部类中定义的方法最好不要超过三个
 * 6.
 */
abstract class Absdemo {

	void show() {}

	void other() {}
	
}

class Outer2 {
	int x = 3;
	public void fn(){
		Absdemo as = new Absdemo(){
			int x = 100;
			void show(){
				System.out.println("anoy class"+x);
			}
			void other(){
				System.out.println("anoy oter");
			}
		};
		as.show();
		as.other();
	}
}

public class AnoyClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer2 ot = new Outer2();
		ot.fn();
		
		new Object(){  //这样可以，不写父类，但是若将该对象保存为object对象，则无法执行fn方法，因为Object类中没有这个方法，只能直接调用
			public void fn(){
				System.out.println("no parrent");
			}
		}.fn();

	}

}

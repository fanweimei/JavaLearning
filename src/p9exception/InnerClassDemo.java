package p9exception;
/*
 * 内部类的访问规则：
 * 1.内部类可以直接访问外部类中的成员，包括私有。之所以可以访问，是因为内部类中持有一个外部类的引用，格式 外部类名.this
 * 2.外部类要访问内部类，必须要建立内部类的对象
 * 3.内部类可以被private和static修饰符修饰
 * 4.内部类中的方法若被static修饰，则内部类也必须被静态的
 */

class Outer {
	private int x = 3;
	static class Inner {
		int x = 4;
		void method(){
			int x = 6;
			System.out.println(x);
		}
		static void fn(){
			System.out.println("hello");
		}
	}
	class Inner2 {
		void method(){
			System.out.println("inner2");
		}
	}
	
	void fn(final int a){  //内部类写在方法里，不能用static 修饰，其内部类的成员也不能用static 修饰；只能访问被final修饰的局部变量
		final int y = 10;
		class Inner3
		{
			void method() {
				System.out.println(a);
			}
		}
		new Inner3().method();
	}
	
	public static void outerMethod(){
		Inner.fn();   //静态方法里访问静态内部类中的静态方法
		Inner in = new Inner();
		in.method();  //静态方法里访问静态内部类中非静态方法
		//Inner2 in2 = new Inner2();  静态方法里不能访问非静态类
	}
}

public class InnerClassDemo {

	public static void main(String[] args) {
		Outer.Inner2 in2 = new Outer().new Inner2();   //访问非静态
		in2.method();
		new Outer.Inner().method();  //访问静态内部类中的非静态方法
		Outer.Inner.fn();  //访问静态内部类的静态方法
		
		Outer outer = new Outer();
		outer.fn(12);
		outer.fn(13);
		
	}

}

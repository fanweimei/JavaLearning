package p07;



/*
 * 练习题
 */




/*
 * 子类覆盖父类的方法，修饰符的权限应该大于父类的修饰符
 * 函数名相同，参数相同，只是返回值或修饰符不同，不允许同一个类中存在两个同名方法
 * 函数名相同，参数不同（个数或类型），表示重载
 * 父类的静态方法，子类覆盖必须是静态，两者是一一对应的。
 */


class A {
	int i = 8;
	static int show(int a,int b){
		return 0;
		
	}
}
class B extends A{
	int i = 10;
	static int show(int a,int b){
		return 9;
	}
}

/*
 * final作用：
 * 1.final修饰的类不能被继承
 * 2.final修饰的方法不能被覆盖
 * 3.final修饰的变量，只能复制一次
 * 4.方法里的内部类只能使用final修饰的局部变量
 */

/*
 * 方法可以覆盖，父类的成员变量不会被覆盖
 */



public class Demo {
	private int x;
	private int y;
	Demo(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	public static void exce() throws Exception {
		throw new Exception();
		//System.out.println("H");
	}
	
	public static void func(){
		try {
			exce();  //throw new Exception()后不能有任何语句，之后的语句没有任何意义，不会执行，所以编译不通过；
//			throw new Exception();
			System.out.println("A"); //调用exce()方法可以写其它语句，原因是exce()方法不一定就会抛出异常，所以之后的语句可能会执行
		}catch (Exception e){
			System.out.println("B");
		}
	}
	public void printPos(Demo d){
		System.out.println("x="+d.x+",y="+d.y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B();
		//System.out.println(a.i);
		try {
			func();
		}catch(Exception e){
			System.out.println("C");
		}
		System.out.println("D");
		
		Demo d = new Demo(10,9);
		d.printPos(d);
	}

}

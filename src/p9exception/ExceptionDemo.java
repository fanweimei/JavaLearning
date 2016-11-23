package p9exception;
/*
 * 异常：就是程序在运行时出现不正常情况
 * 异常由来：问题也是现实生活中一个具体的事物，也可以通过java的类的形式进行描述，并封装成对象。
 * 其实就是java对不正常 情况进行描述后的对象体现。
 * 对于严重的，java通过Error类进行描述；对于非严重的，java通过Exception类进行描述
 * Throwable:
 * --Error
 * --Exception
 * 2.异常的处理
 * java提供了特有的语句进行处理
 * 
 * 3.对多异常的处理
 * 申明异常时，抛出的多个异常用逗号隔开
 * 
 * 4.自定义异常
 * 必须是自定义类继承Exception
 * 原因：异常体系有一个特点：因为异常类和异常对象都被抛出，Throwable这个体系中独有的特点：可抛出，可以使用throw和throws抛出异常
 * 
 * 当在函数内部出现了throw抛出异常对象，那么就必须要给对应的处理动作；
 * 要么在内部try catch处理；要么在函数上声明让调用者处理
 * 一般情况在，函数内出现异常，函数上需要声明
 * 
 * throws和throw的区别：
 * throws使用在函数上；throw后跟的是异常对象。
 * 
 * Exception中有一个特殊的子类异常RuntimeException运行时异常。
 * 如果在函数内抛出该异常，函数上可以不用声明，编译一样通过；
 * 如果在函数上声明了该异常，调用者可以不用进行处理一样，编译通过
 * 
 * 自定义异常时：如果该异常的发生，无法在继续进行运算，就让自定义异常继承RuntimeException
 * 
 * 异常分类：
 * 1.编译时被检测的异常
 * 2.编译时不被检测的异常（运行异常）
 * 
 * 记住一点：catch是用于处理异常。如果没有catch就代表异常没有被处理过，如果异常时检测时异常，那么必须声明。
 */

class MyException extends Exception {
	MyException(String msg){
		super(msg);
	}
}

public class ExceptionDemo {
	void div(int a, int b) throws MyException {
		if(b==0){
			throw new ArithmeticException("b is can not zero");
		}
		if(b<0){
			throw new MyException("不能为负数");
		}
		System.out.println(a/b);
	}

	public static void main(String[] args) {
		ExceptionDemo ep = new ExceptionDemo();
		try {
			ep.div(6,-9);
			System.out.println("333");
		} catch(MyException e) {
			System.out.println(e.getMessage());
			System.out.println("my exception");
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("isOver");
		
		System.out.println();
		Parent parent = new Parent();
		Child c = new Child();
		test(c);
	}
	
	static void test(Parent p) {
		try {
			p.show();
		} catch (AException e) {
			e.printStackTrace();
		}
	}

}

/*
 * 异常在子父类覆盖中的体现：
 * （1）子类在覆盖父类时，如果父类的方法抛出异常，那么子类的覆盖方法，就只能抛出父类的异常或者该异常的子类或者不抛出任何异常
 * （2）如果父类方法抛出多个异常，那么子类在覆盖该方法时，只能抛出父类异常的子集。
 * （3）如果父类或者接口的方法中没有异常抛出，那么子类在覆盖方法时，也不可以抛出异常；如果子类方法发生了异常，就必须要进行try处理，绝不能抛。
 */

class AException extends Exception {
	
}
class AaException extends AException {
	
}
class Parent{
	void show() throws AException {
		System.out.println("parent");
	}
}
class Child extends Parent{
	void show() throws AaException{
		System.out.println("child");
	}
}
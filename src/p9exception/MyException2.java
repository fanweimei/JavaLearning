package p9exception;

/*
 * 异常总结：
 * 定义：是对问题的描述，将问题进行对象的封装。
 * 
 * 异常体系(Throwable)
 * --Error
 * --Exception
 * 
 * 异常体系的特点：具有可抛性，用throw和throws关键字
 * 
 * 除了RuntimeException的其它异常，并未进行try处理，就必须要在函数上声明，否则编译失败
 * 
 * 如果函数声明了异常，调用者需要进行处理，处理方法可以throws可以try
 * 
 * 异常有两种：编译时被检测异常；运行时异常
 * 
 * 异常处理语句
 * try {
 * 	需要被检测的代码
 * }catch {
 * 	异常处理的代码
 * }finally {
 * 	最后一定会执行的代码
 * 一般用于关闭资料
 * 当执行到System.exit(0),finally不会执行。
 * }
 * 
 * 自定义异常：
 * 必须继承异常、可以使用父类已经定义好的功能
 * 
 * 异常的好处：将问题进行封装；将正常流程代码和问题处理代码相分离。
 * 
 * 异常处理的原则：try或throws
 * 调用到抛出异常的功能时，抛出几个就处理几个，一个try对应多个catch
 * 多个catch，父类的catch放在最下面
 * catch内，需要定义针对性的处理方法，不要简单的写e.printStackTrace()
 * 当捕获到的异常，本功能处理不了时，可以继续catch中抛出
 * 如果该异常处理不了，但并不属于该功能的出现的异常，再抛出和该功能相关的异常
 * 
 * 异常的注意事项：
 * 在子父类覆盖时：子类抛出的异常必须是父类的子类或者子集；如果父类中没有抛出异常，子类中出现的异常必须用try处理。
 */

class IllegalNumberException extends RuntimeException {
	IllegalNumberException(String message){
		super(message);
	}
}

interface Shape {
	void printArea();
}
class Rec implements Shape {
	private int w,h;
	Rec(int w, int h){
		if(w<=0||h<=0){
			throw new IllegalNumberException("w or h is illegal number");
		}
		this.w = w;
		this.h = h;
	}
	public void printArea(){
		System.out.println(this.w*this.h);
	}
}

class Circle implements Shape {
	private int r;
	static final float PI = 3.14f;
	Circle(int r){
		if(r<=0){
			throw new IllegalNumberException("r is illegal number");
		}
		this.r = r;
	}
	public void printArea() {
		System.out.println(this.r*this.r*PI);
	}
	
}

public class MyException2 {



	public static void main(String[] args) {
		Rec r;
		//try {
			r = new Rec(3,4);
			r.printArea();
			Circle c = new Circle(10);
			c.printArea();
//		} catch (IllegalNumberException e) {
//			e.printStackTrace();
//		}
	}

}

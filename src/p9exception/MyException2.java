package p9exception;

/*
 * �쳣�ܽ᣺
 * ���壺�Ƕ��������������������ж���ķ�װ��
 * 
 * �쳣��ϵ(Throwable)
 * --Error
 * --Exception
 * 
 * �쳣��ϵ���ص㣺���п����ԣ���throw��throws�ؼ���
 * 
 * ����RuntimeException�������쳣����δ����try�����ͱ���Ҫ�ں������������������ʧ��
 * 
 * ��������������쳣����������Ҫ���д�������������throws����try
 * 
 * �쳣�����֣�����ʱ������쳣������ʱ�쳣
 * 
 * �쳣�������
 * try {
 * 	��Ҫ�����Ĵ���
 * }catch {
 * 	�쳣����Ĵ���
 * }finally {
 * 	���һ����ִ�еĴ���
 * һ�����ڹر�����
 * ��ִ�е�System.exit(0),finally����ִ�С�
 * }
 * 
 * �Զ����쳣��
 * ����̳��쳣������ʹ�ø����Ѿ�����õĹ���
 * 
 * �쳣�ĺô�����������з�װ�����������̴�������⴦���������롣
 * 
 * �쳣�����ԭ��try��throws
 * ���õ��׳��쳣�Ĺ���ʱ���׳������ʹ�������һ��try��Ӧ���catch
 * ���catch�������catch����������
 * catch�ڣ���Ҫ��������ԵĴ���������Ҫ�򵥵�дe.printStackTrace()
 * �����񵽵��쳣�������ܴ�����ʱ�����Լ���catch���׳�
 * ������쳣�����ˣ����������ڸù��ܵĳ��ֵ��쳣�����׳��͸ù�����ص��쳣
 * 
 * �쳣��ע�����
 * ���Ӹ��า��ʱ�������׳����쳣�����Ǹ������������Ӽ������������û���׳��쳣�������г��ֵ��쳣������try����
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

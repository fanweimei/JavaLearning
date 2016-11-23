package p9exception;
/*
 * �쳣�����ǳ���������ʱ���ֲ��������
 * �쳣����������Ҳ����ʵ������һ����������Ҳ����ͨ��java�������ʽ��������������װ�ɶ���
 * ��ʵ����java�Բ����� �������������Ķ������֡�
 * �������صģ�javaͨ��Error��������������ڷ����صģ�javaͨ��Exception���������
 * Throwable:
 * --Error
 * --Exception
 * 2.�쳣�Ĵ���
 * java�ṩ�����е������д���
 * 
 * 3.�Զ��쳣�Ĵ���
 * �����쳣ʱ���׳��Ķ���쳣�ö��Ÿ���
 * 
 * 4.�Զ����쳣
 * �������Զ�����̳�Exception
 * ԭ���쳣��ϵ��һ���ص㣺��Ϊ�쳣����쳣���󶼱��׳���Throwable�����ϵ�ж��е��ص㣺���׳�������ʹ��throw��throws�׳��쳣
 * 
 * ���ں����ڲ�������throw�׳��쳣������ô�ͱ���Ҫ����Ӧ�Ĵ�������
 * Ҫô���ڲ�try catch����Ҫô�ں����������õ����ߴ���
 * һ������ڣ������ڳ����쳣����������Ҫ����
 * 
 * throws��throw������
 * throwsʹ���ں����ϣ�throw��������쳣����
 * 
 * Exception����һ������������쳣RuntimeException����ʱ�쳣��
 * ����ں������׳����쳣�������Ͽ��Բ�������������һ��ͨ����
 * ����ں����������˸��쳣�������߿��Բ��ý��д���һ��������ͨ��
 * 
 * �Զ����쳣ʱ��������쳣�ķ������޷��ڼ����������㣬�����Զ����쳣�̳�RuntimeException
 * 
 * �쳣���ࣺ
 * 1.����ʱ�������쳣
 * 2.����ʱ���������쳣�������쳣��
 * 
 * ��סһ�㣺catch�����ڴ����쳣�����û��catch�ʹ����쳣û�б������������쳣ʱ���ʱ�쳣����ô����������
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
			throw new MyException("����Ϊ����");
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
 * �쳣���Ӹ��า���е����֣�
 * ��1�������ڸ��Ǹ���ʱ���������ķ����׳��쳣����ô����ĸ��Ƿ�������ֻ���׳�������쳣���߸��쳣��������߲��׳��κ��쳣
 * ��2��������෽���׳�����쳣����ô�����ڸ��Ǹ÷���ʱ��ֻ���׳������쳣���Ӽ���
 * ��3�����������߽ӿڵķ�����û���쳣�׳�����ô�����ڸ��Ƿ���ʱ��Ҳ�������׳��쳣��������෽���������쳣���ͱ���Ҫ����try�����������ס�
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
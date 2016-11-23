package p9exception;
/*
 * �ڲ���ķ��ʹ���
 * 1.�ڲ������ֱ�ӷ����ⲿ���еĳ�Ա������˽�С�֮���Կ��Է��ʣ�����Ϊ�ڲ����г���һ���ⲿ������ã���ʽ �ⲿ����.this
 * 2.�ⲿ��Ҫ�����ڲ��࣬����Ҫ�����ڲ���Ķ���
 * 3.�ڲ�����Ա�private��static���η�����
 * 4.�ڲ����еķ�������static���Σ����ڲ���Ҳ���뱻��̬��
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
	
	void fn(final int a){  //�ڲ���д�ڷ����������static ���Σ����ڲ���ĳ�ԱҲ������static ���Σ�ֻ�ܷ��ʱ�final���εľֲ�����
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
		Inner.fn();   //��̬��������ʾ�̬�ڲ����еľ�̬����
		Inner in = new Inner();
		in.method();  //��̬��������ʾ�̬�ڲ����зǾ�̬����
		//Inner2 in2 = new Inner2();  ��̬�����ﲻ�ܷ��ʷǾ�̬��
	}
}

public class InnerClassDemo {

	public static void main(String[] args) {
		Outer.Inner2 in2 = new Outer().new Inner2();   //���ʷǾ�̬
		in2.method();
		new Outer.Inner().method();  //���ʾ�̬�ڲ����еķǾ�̬����
		Outer.Inner.fn();  //���ʾ�̬�ڲ���ľ�̬����
		
		Outer outer = new Outer();
		outer.fn(12);
		outer.fn(13);
		
	}

}

package p9exception;

/*
 * 1.�����ڲ�����ʵ�����ڲ���ļ�д��ʽ
 * 2.���������ڲ����ǰ�᣺�ڲ�������Ǽ̳�һ�������ʵ�ֽӿ�
 * 3.�����ڲ���ĸ�ʽ��new ������߽ӿ�(){�������������}
 * 4.��ʵ�����ڲ�����������ڲ��Ӷ���
 * 5.�����ڲ����ж���ķ�����ò�Ҫ��������
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
		
		new Object(){  //�������ԣ���д���࣬���������ö��󱣴�Ϊobject�������޷�ִ��fn��������ΪObject����û�����������ֻ��ֱ�ӵ���
			public void fn(){
				System.out.println("no parrent");
			}
		}.fn();

	}

}

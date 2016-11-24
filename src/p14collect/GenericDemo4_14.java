package p14collect;
/*
 * ���Ͷ���ķ��ͣ�������������Ч�����������ʹ�ã���ô������Ķ�����ȷҪ�����ľ������ͺ�
 * ����Ҫ���������;��Ѿ��̶��ˡ�
 * 
 * Ϊ���ò�ͬ�������Բ�����ͬ���ͣ��������ͻ���ȷ������ô���Խ����Ͷ����ڷ����ϡ�
 * 
 * �����ַ�ʽ��
 * 1.���������ϣ����еķ������;���new �Ķ���ʱ��������ͬ�����ϵ������봫�������������ͬ����Demo1
 * 2.�����ڷ����ϣ��½�����ʱ������ָ�����ͣ������ϵ������봫��Ĳ�����������ͬ,��Demo2
 * 
 * ���ַ���Ҳ����ͬʱ���ڣ���Demo3
 * 
 * �����������̬����ֻ�ܶ����ڷ����ϣ����ܶ���������
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

package p07;



/*
 * ��ϰ��
 */




/*
 * ���า�Ǹ���ķ��������η���Ȩ��Ӧ�ô��ڸ�������η�
 * ��������ͬ��������ͬ��ֻ�Ƿ���ֵ�����η���ͬ��������ͬһ�����д�������ͬ������
 * ��������ͬ��������ͬ�����������ͣ�����ʾ����
 * ����ľ�̬���������า�Ǳ����Ǿ�̬��������һһ��Ӧ�ġ�
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
 * final���ã�
 * 1.final���ε��಻�ܱ��̳�
 * 2.final���εķ������ܱ�����
 * 3.final���εı�����ֻ�ܸ���һ��
 * 4.��������ڲ���ֻ��ʹ��final���εľֲ�����
 */

/*
 * �������Ը��ǣ�����ĳ�Ա�������ᱻ����
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
			exce();  //throw new Exception()�������κ���䣬֮������û���κ����壬����ִ�У����Ա��벻ͨ����
//			throw new Exception();
			System.out.println("A"); //����exce()��������д������䣬ԭ����exce()������һ���ͻ��׳��쳣������֮��������ܻ�ִ��
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

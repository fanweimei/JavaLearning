package p11thread;
/*
 * ����
 * 1.������һ����⣻
 * 2.�����������ֱ��300Ԫ��ÿ�δ�100����������
 * 
 * synchronized����ͬ������飬Ҳ����ͬ������
 * ͬ������ʹ�õ�����this
 * ���ͬ��������static���κ�ʹ�õ���������this-->ԭ���Ǿ�̬����������this�����̬���ڴ棬û�б�����󣬵���һ���и����Ӧ���ֽ����ļ�����
 *����.class  �ö����������Class
 *Ҳ����˵��̬��ͬ��������ʹ�õ����Ǹ÷�����������ֽ����ļ�����
 */

class Bank {
	private int sum = 0;
	public synchronized void add(int n){
		sum = sum+n;
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("�ܶ"+sum);
	}
}
class Cus implements Runnable {
	private Bank b = new Bank();
	Object obj = new Object();
	public void run(){
		for(int i=0;i<3; i++){			
			b.add(100);
		}
	}
}

public class BankDemo {
	public void test(){
		System.out.println(this);
	}

	public static void main(String[] args) {
		BankDemo bd = new BankDemo();
		bd.test();
		Cus c = new Cus();
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();

	}

}

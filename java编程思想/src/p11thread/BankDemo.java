package p11thread;
/*
 * 需求：
 * 1.银行有一个金库；
 * 2.有两个储户分别存300元，每次存100，共存三次
 * 
 * synchronized可以同步代码块，也可以同步函数
 * 同步函数使用的锁是this
 * 如果同步函数被static修饰后，使用的锁不再是this-->原因是静态方法不存在this概念，静态进内存，没有本类对象，但是一定有该类对应的字节码文件对象
 *类名.class  该对象的类型是Class
 *也就是说静态的同步方法，使用的锁是该方法所在类的字节码文件对象
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
		System.out.println("总额："+sum);
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

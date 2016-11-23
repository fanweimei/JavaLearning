package p11thread;
/*
 * 创建线程：
 * （1）继承Thread类，覆盖run方法
 * （2）实现Runnnable接口，实现run方法，通过Thread类建立线程对象，将Runnable接口的子类对象传递给Thread的构造函数，再调用Thread类的start方法，执行Runnable接口子类的run方法
 * 
 * 实现方式和继承方式有什么区别呢？
 * 实现方式的好处：避免了单继承的局限性；建议使用实现接口方式。
 * 
 * 多线程的安全性问题，可能出现负数
 * 解决办法：对多条操作共享数据的语句，只能让一个线程都执行完，其它线程不可以参与执行
 * 就是同步代码块
 * synchronized(对象){
 * 	需要被同步的代码
 * }
 * 对象如同锁，持有锁的线程可以在同步中执行。
 * 同步的前提：必须要有两个或者两个以上的线程；必须是多个线程使用同一个锁
 * 同步的弊端：性能会降低点，每次执行都需要先判断锁
 */

public class Ticket implements Runnable{
	private int tick = 100;
	Object obj = new Object();

	public static void main(String[] args) {
		Ticket t = new Ticket();
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();

	}

	public void run() {
		while(true){
			synchronized(obj)
			{
				if(tick > 0){
					if(tick == 1){
						try {
							Thread.sleep(10); //
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					System.out.println(Thread.currentThread().getName()+"=="+--tick);
				}
			}
		}
	}

}

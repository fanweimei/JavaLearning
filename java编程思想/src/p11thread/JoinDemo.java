package p11thread;

/*
 * 默认优先级是5
 * 1 -- 5 -- 10
 * Max_PRIORITY -- 
 * 
 * yield暂停正在执行的线程
 */

class Demo implements Runnable {

	public   void run() {
		for(int i = 0; i<70; i++){
			System.out.println(Thread.currentThread().toString()+"　"+i);
			Thread.yield();
		}
		
	}
	
}

public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {
		Demo d = new Demo();
		Thread td = new Thread(d);
		Thread td2 = new Thread(d);
		//td2.setPriority(Thread.MAX_PRIORITY);
		td.start();
		td2.start();
		//td.join();  //join表示争取执行权，此时主线程main冻结，td和td2交叉执行，等待td线程执行完
		for(int i=0; i<80; i++){
			//System.out.println(Thread.currentThread().toString());
		}
		System.out.println("over");
	}

}

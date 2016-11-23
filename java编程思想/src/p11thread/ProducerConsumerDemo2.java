package p11thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * JDK中将同步synchronized替换成实现Lock操作
 * 可以实现只唤醒对方的操作
 */

class Resource2 {
	private String name;
	private int count = 1;
	private boolean flag = false;
	private Lock lock = new ReentrantLock();
	private Condition condition_pro = lock.newCondition();
	private Condition condition_cu = lock.newCondition();
	
	public void set(String name){
		lock.lock();
		try {
			while(flag){
				condition_pro.await();
			}
			this.name = name+ "--"+count++;
			System.out.println(Thread.currentThread().getName()+"--生产者--"+this.name);
			flag = true;
			condition_cu.signal();;
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
	public void get(){
		lock.lock();
		try {
			while(!flag){
				condition_cu.await();
			}
			System.out.println(Thread.currentThread().getName()+"--消费者--"+this.name);
			flag = false;
			condition_pro.signal();;
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
}

class Producer2 implements Runnable {
	Resource2 rs;
	Producer2(Resource2 rs){
		this.rs = rs;
	}
	public void run() {
		while(true){
			rs.set("fanfan");
		}
	}
	
}

class Consumer2 implements Runnable {
	Resource2 rs;
	Consumer2(Resource2 rs){
		this.rs = rs;
	}

	public void run() {
		while(true) {
			rs.get();
		}
	}
	
}

public class ProducerConsumerDemo2 {

	public static void main(String[] args) {
		Resource2 rs = new Resource2();
		new Thread(new Producer2(rs)).start();
		new Thread(new Producer2(rs)).start();
		new Thread(new Consumer2(rs)).start();
		new Thread(new Consumer2(rs)).start();
	}

}

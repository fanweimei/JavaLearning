package p11thread;

class Resource {
	private String name;
	private int count = 1;
	private boolean flag = false;
	
	public synchronized void set(String name){
		while(flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.name = name+ "--"+count++;
		System.out.println(Thread.currentThread().getName()+"--生产者--"+this.name);
		flag = true;
		this.notifyAll();
	}
	public synchronized void get(){
		while(!flag){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+"--消费者--"+this.name);
		flag = false;
		this.notifyAll();
	}
}

class Producer implements Runnable {
	Resource rs;
	Producer(Resource rs){
		this.rs = rs;
	}
	public void run() {
		while(true){
			rs.set("fanfan");
		}
	}
	
}

class Consumer implements Runnable {
	Resource rs;
	Consumer(Resource rs){
		this.rs = rs;
	}

	public void run() {
		while(true) {
			rs.get();
		}
	}
	
}

public class ProducerConsumerDemo {

	public static void main(String[] args) {
		Resource rs = new Resource();
		new Thread(new Producer(rs)).start();
		new Thread(new Producer(rs)).start();
		new Thread(new Consumer(rs)).start();
		new Thread(new Consumer(rs)).start();
	}

}

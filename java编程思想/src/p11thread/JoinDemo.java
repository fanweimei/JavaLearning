package p11thread;

/*
 * Ĭ�����ȼ���5
 * 1 -- 5 -- 10
 * Max_PRIORITY -- 
 * 
 * yield��ͣ����ִ�е��߳�
 */

class Demo implements Runnable {

	public   void run() {
		for(int i = 0; i<70; i++){
			System.out.println(Thread.currentThread().toString()+"��"+i);
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
		//td.join();  //join��ʾ��ȡִ��Ȩ����ʱ���߳�main���ᣬtd��td2����ִ�У��ȴ�td�߳�ִ����
		for(int i=0; i<80; i++){
			//System.out.println(Thread.currentThread().toString());
		}
		System.out.println("over");
	}

}

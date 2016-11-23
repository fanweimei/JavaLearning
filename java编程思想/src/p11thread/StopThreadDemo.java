package p11thread;
/*
 * stop�����Ѿ���ʱ��
 * ���ֹͣ�̣߳�ֻ��һ�ַ���������run����������ֻҪ���ƺ�ѭ�����Ϳ�����run����
 * ������������̴߳��ڶ���״̬����ô�߳̾Ͳ������
 * 
 * ��û��ָ���ķ�ʽ�ö�����ָ̻߳�������״̬����ʱ��Ҫ�Զ���������������ʹ��thread ��interrupt����
 */
class StopThread implements Runnable {
	private boolean flag = true;

	public synchronized void run() {
		while(flag){
//			try {
//				this.wait();
//			} catch (InterruptedException e) {
//				flag = false;
//				e.printStackTrace();
//			}
			System.out.println(Thread.currentThread().getName());
		}
		
	}
	
	public void changeFlag(){
		this.flag = false;
	}
}

public class StopThreadDemo {

	public static void main(String[] args) {
		StopThread st = new StopThread();
		Thread td = new Thread(st);
		/*
		 * ��startǰ���ã���Ϊtrue���Ǻ�̨�̣߳�ǰ̨�߳̽�������̨�߳��Զ�����
		 */
		td.setDaemon(true);
		td.start();
		int count = 0;
		while(true){
			count++;
			if(count == 50){
				//st.changeFlag();
				td.interrupt();
				break;
			}
			System.out.println(count);
		}
	}

}

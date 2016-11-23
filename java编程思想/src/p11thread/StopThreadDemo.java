package p11thread;
/*
 * stop方法已经过时。
 * 如何停止线程：只有一种方法，就是run方法结束，只要控制好循环，就可以让run结束
 * 特殊情况：当线程处于冻结状态，那么线程就不会结束
 * 
 * 当没有指定的方式让冻结的线程恢复到运行状态，这时需要对冻结进行清除，可以使用thread 的interrupt方法
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
		 * 在start前调用，设为true则是后台线程，前台线程结束，后台线程自动结束
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

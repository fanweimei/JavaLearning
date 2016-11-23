package p11thread;
/*
 * À¿À¯
 */

class DeadLock implements Runnable{
	private boolean flag;
	static Object a = new Object();
	static Object b = new Object();
	DeadLock(boolean flag){
		this.flag = flag;
	}
	
	public void run(){
		if(flag){
			synchronized(DeadLock.a){
				System.out.println("a main");
				synchronized(DeadLock.b){
					System.out.println("b sub");
				}
				
			}
		}else {
			synchronized(DeadLock.b){
				System.out.println("b main");
				synchronized(DeadLock.a){
					System.out.println("a sub");
				}
				
			}
		}
	}
	 
}

public class DeadLockDemo {

	public static void main(String[] args) {
		new Thread(new DeadLock(true)).start();
		new Thread(new DeadLock(false)).start();
	}

}

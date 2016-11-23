package p11thread;

/*
 * 每次执行结果不同，多线程的特性：随机性、争夺cpu执行权
 * 
 * 为什么要覆盖run方法呢？
 * run方法用于存储线程要运行的代码。
 */

public class ThreadDemo extends Thread{
	ThreadDemo(String name){
		super(name);
	}
	public void run(){
		for(int i=0; i<50; i++){
			System.out.println(Thread.currentThread().getName()+"-run ---"+i);
		}
	}

	public static void main(String[] args) {
		ThreadDemo td = new ThreadDemo("ff");
		td.start();
		ThreadDemo td2 = new ThreadDemo("zz");
		td2.start();
		for(int i=0; i<50; i++){
			System.out.println("main ---"+i);
		}

	}

}

package p11thread;

/*
 * ÿ��ִ�н����ͬ�����̵߳����ԣ�����ԡ�����cpuִ��Ȩ
 * 
 * ΪʲôҪ����run�����أ�
 * run�������ڴ洢�߳�Ҫ���еĴ��롣
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

package p11thread;

/*
 * ÿ��ִ�н����ͬ�����̵߳����ԣ�����ԡ�����cpuִ��Ȩ
 * 
 * ΪʲôҪ����run�����أ�
 * run�������ڴ洢�߳�Ҫ���еĴ��롣
 */

public class ThreadDemo1 implements Runnable{
	public void run(){
		for(int i=0; i<50; i++){
			System.out.println(Thread.currentThread().getName()+"-run ---"+i);
		}
	}

	public static void main(String[] args) {
		ThreadDemo1 td = new ThreadDemo1();
		new Thread(td).start();
		ThreadDemo1 td2 = new ThreadDemo1();
		new Thread(td2).start();
		for(int i=0; i<50; i++){
			System.out.println("main ---"+i);
		}

	}

}

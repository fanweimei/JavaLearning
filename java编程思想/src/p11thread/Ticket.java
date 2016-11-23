package p11thread;
/*
 * �����̣߳�
 * ��1���̳�Thread�࣬����run����
 * ��2��ʵ��Runnnable�ӿڣ�ʵ��run������ͨ��Thread�ཨ���̶߳��󣬽�Runnable�ӿڵ�������󴫵ݸ�Thread�Ĺ��캯�����ٵ���Thread���start������ִ��Runnable�ӿ������run����
 * 
 * ʵ�ַ�ʽ�ͼ̳з�ʽ��ʲô�����أ�
 * ʵ�ַ�ʽ�ĺô��������˵��̳еľ����ԣ�����ʹ��ʵ�ֽӿڷ�ʽ��
 * 
 * ���̵߳İ�ȫ�����⣬���ܳ��ָ���
 * ����취���Զ��������������ݵ���䣬ֻ����һ���̶߳�ִ���꣬�����̲߳����Բ���ִ��
 * ����ͬ�������
 * synchronized(����){
 * 	��Ҫ��ͬ���Ĵ���
 * }
 * ������ͬ�������������߳̿�����ͬ����ִ�С�
 * ͬ����ǰ�᣺����Ҫ�����������������ϵ��̣߳������Ƕ���߳�ʹ��ͬһ����
 * ͬ���ı׶ˣ����ܻή�͵㣬ÿ��ִ�ж���Ҫ���ж���
 */

public class Ticket implements Runnable{
	private int tick = 100;
	Object obj = new Object();

	public static void main(String[] args) {
		Ticket t = new Ticket();
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();

	}

	public void run() {
		while(true){
			synchronized(obj)
			{
				if(tick > 0){
					if(tick == 1){
						try {
							Thread.sleep(10); //
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					System.out.println(Thread.currentThread().getName()+"=="+--tick);
				}
			}
		}
	}

}

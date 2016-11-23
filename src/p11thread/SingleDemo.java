package p11thread;

/*
 * Single��getInstance��ȡ�������ڰ�ȫ����,�����synchronized����getInstance�����������ܻ�Խ��
 * ˫���жϼ�ͬ�������
 */

class Single {
	private static Single s = null;
	private Single(){}
	public static Single getInstance(){
		if(s == null){
			synchronized(Single.class){
				if(s == null){
					s = new Single();
				}
			}
		}
		return s;
	}
}

public class SingleDemo {

	public static void main(String[] args) {
		

	}

}

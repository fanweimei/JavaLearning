package p14collect;
/*
 * ���ͣ�JDK1.5�汾�Ժ���������ԣ����ڽ����ȫ���⣬��һ����ȫ����
 * �ô���������ʱ�ڳ�������ClassCastExceptionת�Ƶ��˱���ʱ�ڣ��������Ա������⡣
 * 
 * ���͸�ʽ��ͨ��<>������Ҫ������������������
 * �����ڼ��Ͽ���кܳ���
 * ��ʵ<>����������������
 */

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo_11 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("a01");
		al.add("a02");
		
		Iterator<String> it = al.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

	}

}

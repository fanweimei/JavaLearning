package p14collect;
/*
 * ö�پ���Vector���е�ȡ��������
 * ����ö�ٺ͵���������ʵö�ٺ͵�����һ���ġ�
 * ��Ϊö�ٵ������Լ��������ƶ���������������ȡ����
 */

import java.util.*;

public class VectorDemo_03 {
	static void vector_unique_fn(){
		Vector v = new Vector();
		v.add("aa");
		v.add("bb");
		v.add("cc");
		v.add("dd");
		v.add("aa");
		
		//ö�ٵ���
		Enumeration en = v.elements();
		while(en.hasMoreElements()){
			System.out.print(en.nextElement()+" ");  //aa bb cc dd aa 
		}
	}

	public static void main(String[] args) {
		
		vector_unique_fn();
	}

}

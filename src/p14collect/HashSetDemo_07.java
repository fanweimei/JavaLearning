package p14collect;

import java.util.*;

/*
 * Set:Ԫ�ز����ظ���������˳���ȡ��˳��һ�£�
 *  --HashSet���ײ��ǹ�ϣ�����ݽṹ���洢ʱ�ǰ���hashֵ���洢��
 *  	HashSet����α�֤Ԫ��Ψһ�Ե��أ�
 *  	��ͨ��Ԫ�ص�����������hashCode��equals�����
 *  	���Ԫ�ص�hashCodeֵ��ͬ���Ż��ж�equals�Ƿ�Ϊtrue
 *  	���Ԫ�ص�hashCodeֵ��ͬ���������equals
 *  	contains��remove����Ҳ������hashCode��equals
 *  --TreeSet
 * Set���ϵĹ��ܺ�Collection��һ�µ�
 */

public class HashSetDemo_07 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("h01");
		hs.add("h04");
		hs.add("h02");
		hs.add("h01");
		System.out.println(hs);  //[h01, h02, h04]
	}

}

package p18other;

import java.util.*;

/*
 * System:���еķ��������Զ��Ǿ�̬��
 * out:��׼���
 * in:��׼����
 * 
 * getProperties()��ȡϵͳ������Ϣ
 * setProperties
 */

public class SystemDemo_01 {

	public static void main(String[] args) {
		Properties prop = System.getProperties();
		for(Object key: prop.keySet()){
			System.out.println(key+"----"+prop.get(key));
		}

	}

}
